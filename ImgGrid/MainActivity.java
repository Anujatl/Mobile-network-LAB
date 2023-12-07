package com.example.imggrid;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private int[] imageList = {R.drawable.messi, R.drawable.neymar, R.drawable.ronaldo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this, imageList));

        gridView.setOnItemClickListener((parent, view, position, id) ->
                new AlertDialog.Builder(this)
                        .setTitle("Selected Image")
                        .setMessage("You selected image " + (position + 1))
                        .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                        .create()
                        .show());
    }

    public class ImageAdapter extends android.widget.BaseAdapter {
        private android.content.Context mContext;
        private int[] imageList;

        public ImageAdapter(android.content.Context context, int[] images) {
            mContext = context;
            imageList = images;
        }

        public int getCount() {
            return imageList.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, android.view.ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(imageList[position]);
            return imageView;
        }
    }
}
