package android.example.retrofitandrecyclerview;

import android.content.Context;
import android.example.retrofitandrecyclerview.Pojo.Datum;
import android.example.retrofitandrecyclerview.Pojo.Model;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.viewHolder> {
    private Context context;
    private ArrayList<Datum> datumArrayList;

    public ModelAdapter(Context context, ArrayList<Datum> datumArrayList) {
        this.context = context;
        this.datumArrayList = datumArrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_design, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelAdapter.viewHolder holder, int position) {
        Datum current = datumArrayList.get(position);
        holder.text.setText(current.getName());

        Uri image_url = Uri.parse(current.getImage());
        Glide.with(context).load(image_url).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return datumArrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.body);
        }
    }
}
