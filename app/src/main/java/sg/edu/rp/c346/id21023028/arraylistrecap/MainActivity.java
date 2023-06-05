package sg.edu.rp.c346.id21023028.arraylistrecap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
//    String[] fruits;
    ArrayList<String> fruits = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

// array
//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";

//arraylist
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        //worksheet requirements
        String theFruit = fruits.get(1);
        Log.i("fruit",theFruit); //check if thefruit is the seccond (banana)
        fruits.remove(0); //remove apple
        fruits.set(fruits.size()-1, "dragon fruit"); //last fruit is dragon fruit (changed from durain)


        String msg = "Fruits\n=====\n";
        for (String f : fruits){
            msg += String.format("%s\n",f);
        }
        tv.setText(msg);

    }
}