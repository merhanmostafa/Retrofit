package android.example.retrofitandrecyclerview.Networks;

import android.example.retrofitandrecyclerview.Pojo.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

@GET("Eyadhamza/Programmer/orchid/JsonResponses/tracks.json")
    Call<Model> getData();


}
