package android.example.retrofitandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.example.retrofitandrecyclerview.Networks.RetrofitInterface;
import android.example.retrofitandrecyclerview.Pojo.Datum;
import android.example.retrofitandrecyclerview.Pojo.Model;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ArrayList<Datum> datumArrayList = new ArrayList<>();
    RecyclerView recyclerView;
    ModelAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initiview();
        getResponse();


    }

    private void initiview() {
        recyclerView = findViewById(R.id.recy_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getResponse() {

        //Build Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
//get the response
        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
       Call<Model>call = retrofitInterface.getData();
       call.enqueue(new Callback<Model>() {
           @Override
           public void onResponse(Call<Model> call, Response<Model> response) {
               datumArrayList.addAll(response.body().getData());
               adapter = new ModelAdapter(MainActivity.this,datumArrayList);
               recyclerView.setAdapter(adapter);
               adapter.notifyDataSetChanged();
           }

           @Override
           public void onFailure(Call<Model> call, Throwable t) {

           }
       });

    }
}