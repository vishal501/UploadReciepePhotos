package com.example.indianrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.indianrecipes.R;

public class DetailActivity extends AppCompatActivity {
    TextView FoodDescription;
    ImageView FoodImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        FoodDescription = (TextView)findViewById(R.id.txtDescription);
        FoodImage = (ImageView)findViewById(R.id.ivImage2);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle!=null){
            FoodDescription.setText(mBundle.getString("Description"));
            FoodImage.setImageResource(mBundle.getInt("Image"));

        }
    }
}
