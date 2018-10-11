package com.example.geoguessswipe;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * This class is the adapter used for showing an image, which is a GeoImage object in a recyclerview
 */
public class GeoImageAdapter extends RecyclerView.Adapter<GeoImageAdapter.ViewHolder> {

    private List<GeoImage> mGeoImages;

    public GeoImageAdapter(List<GeoImage> mGeoImages) {
        this.mGeoImages = mGeoImages;
    }

    @NonNull
    @Override
    public GeoImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater= LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.geo_image_view, null);

        // Return a new holder instance
        return new GeoImageAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GeoImage geoImage = mGeoImages.get(position);
        //set the source of the imageview by using the geo image object
        holder.imageView.setImageDrawable(geoImage.getId());
    }

    @Override
    public int getItemCount() {
        //return size of list
        return mGeoImages.size();
    }

    /**
     * Dit is de viewholder die de adapter gebruikt om de image view in de layout te binden
     * zodat de onBindViewHolder dit kan gebruiken
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public View view;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.geoImage);
            view = itemView;
        }
    }

}


