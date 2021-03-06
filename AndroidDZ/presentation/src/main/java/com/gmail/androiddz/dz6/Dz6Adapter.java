package com.gmail.androiddz.dz6;


import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.gmail.androiddz.R;

public class Dz6Adapter extends RecyclerView.Adapter<Dz6Adapter.ViewHolder> {

    private String[] android_image_urls;

    public Dz6Adapter(String[] android_image_urls) {
        this.android_image_urls = android_image_urls;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        Uri uri = Uri.parse(android_image_urls[position]);
        SimpleDraweeView draweeView = (SimpleDraweeView) viewHolder.imgAndroid;
        draweeView.setImageURI(uri);
    }

    @Override
    public int getItemCount() {
        return android_image_urls.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgAndroid;

        public ViewHolder(View view) {
            super(view);
            imgAndroid = (ImageView) view.findViewById(R.id.img_android);
        }
    }

}
