package android.example.retrofitandrecyclerview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

@GET("Eyadhamza/Programmer/orchid/JsonResponses/tracks.json")
    Call<List<Model>> getData();


}
