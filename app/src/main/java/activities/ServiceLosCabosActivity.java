package activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import wigilabs.ahloscabos.R;

/**
 * Created by user on 22/02/2016.
 */
public class ServiceLosCabosActivity extends Activity {
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_welcome);
        ImageView mImageView = (ImageView)findViewById(R.id.img);
        mImageView.setImageResource(R.drawable.home);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceLosCabosActivity.this,DirectorySelectionActivity.class);
                startActivity(intent);
            }
        });
    }




}
