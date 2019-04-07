package com.example.yohan.blogapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FiverrPost extends AppCompatActivity implements RecentPostAdapter.onItemClicked{

    private Toolbar mToolbar;
    private RecyclerView FiverrrecyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<RecentModel> list;
    private RecentPostAdapter recentPostAdapter;
   // ProgressDialog progressDialog;
   ProgressDialog progressDialog1;


    private String FiverrBaseURL = "https://readhublk.com/wp-json/wp/v2/";
    public static final String RENDER_CONTENT = "RENDER";
    public  static final String title = "render";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiverr_post);

        mToolbar = findViewById(R.id.FiverrPost_app_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ReadHub - Fiverr");

        FiverrrecyclerView = findViewById(R.id.Fiverr_recycleview);
        progressDialog1 = new ProgressDialog(FiverrPost.this);
        progressDialog1.setTitle("Fiverr Posts");
        progressDialog1.setMessage("Loading");


        linearLayoutManager = new LinearLayoutManager(FiverrPost.this,LinearLayoutManager.VERTICAL,false);
        FiverrrecyclerView.setLayoutManager(linearLayoutManager);

        list = new ArrayList<RecentModel>();

        progressDialog1.show();
        recentPostAdapter = new RecentPostAdapter(list,this);

        new GetFiverrJson().execute();
        FiverrrecyclerView.setAdapter(recentPostAdapter);
        recentPostAdapter.SetOnItemClickListener(FiverrPost.this);

    }

    public class GetFiverrJson extends AsyncTask<Void,Void,Void> {

        ProgressDialog progressDialog;


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = new ProgressDialog(FiverrPost.this);
            progressDialog.setTitle("Fiverr Post");
            progressDialog.setMessage("Loading");
            progressDialog.show();



        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(FiverrBaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitArrayAPI retrofitArrayAPI = retrofit. create(RetrofitArrayAPI.class);

            Call<List<WPJavaPost>> call = retrofitArrayAPI.getFiverPost();


            call.enqueue(new Callback<List<WPJavaPost>>() {
                @Override
                public void onResponse(Call<List<WPJavaPost>> call, Response<List<WPJavaPost>> response) {
                    Toast.makeText(FiverrPost.this,"done",Toast.LENGTH_LONG).show();


                    progressDialog1.dismiss();
                    for (int i =0;i<response.body().size(); i++){

                        String temdetails = response.body().get(i).getDate();
                        String titile = response.body().get(i).getTitle().getRendered().toString();
                        titile = titile.replace("&#8211;","");
                        String render = response.body().get(i).getContent().getRendered();
                        /// render = render.replace("--aspect-ratio","aspect-ratio");

                        // String profileUrl = response.body().get(i).getLinks().getAuthor().get(0).getHref();

                        list.add(new RecentModel( titile,
                                temdetails,
                                response.body().get(i).getBetterFeaturedImage().getMediaDetails().getSizes().getTieMedium().getSourceUrl(),render,RecentModel.IMAGE_TYPE));

                    }

                    recentPostAdapter.notifyDataSetChanged();
                }

                @Override
                public void onFailure(Call<List<WPJavaPost>> call, Throwable t) {

                }
            });

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressDialog.dismiss();
        }
    }

    @Override
    public void OnItemClick(int index) {

        Intent i = new Intent(this,RecentPostView.class);
        RecentModel model = list.get(index);
        i.putExtra(RENDER_CONTENT,model.render);
        // i.putExtra(title,model.title);
        startActivity(i);

    }

    private void updateUI(){
        Intent startIntent = new Intent(FiverrPost.this,Login.class);
        startActivity(startIntent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.main_logout){
            FirebaseAuth.getInstance().signOut();;
            updateUI();
        }
        return true;
    }
}
