package com.appstry.picasso_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class LoaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);
        ImageView iv = (ImageView)findViewById(R.id.picassoTry);
        String imageUrl = "http://www.telegraph.co.uk/content/dam/motoring2/2015/12/02/1-2016-BMW-7-series-front-xlarge-xlarge_trans++rWYeUU_H0zBKyvljOo6zlkYMapKPjdhyLnv9ax6_too.jpg";
        Picasso.with(this)
                .load(imageUrl)
                .into(iv);
    }
}
