package practice.codesprint;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button C1, C2, C3, C4, C5, C6;
    Color[] indicator = new Color[6];
    int[] colorIndicator = new int[5];
    String[] labelColors = {"red", "yellow", "green", "blue", "magenta", "black"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C1 = (Button) findViewById(R.id.button1);
        C2 = (Button) findViewById(R.id.button2);
        C3 = (Button) findViewById(R.id.button3);
        C4 = (Button) findViewById(R.id.button4);
        C5 = (Button) findViewById(R.id.button5);
        C6 = (Button) findViewById(R.id.button6);
    }

    protected void onStart(View view){
        
    }


}