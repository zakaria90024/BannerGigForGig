package com.copypaseit.bannergigforgig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String url1 = ("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/mian-slide.jpg");
    String url2 = ("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/caina0.jpg");
    String url3 = ("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/fast1.jpg");
    String url4 = ("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/website.jpg");
    String url5 = ("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/website.jpg");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we are creating array list for storing our image urls.
        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = findViewById(R.id.slider);

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));
        sliderDataArrayList.add(new SliderData(url4));
        sliderDataArrayList.add(new SliderData(url5));

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();
    }
}