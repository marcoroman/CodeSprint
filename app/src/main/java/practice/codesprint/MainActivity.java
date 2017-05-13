package practice.codesprint;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button C1, C2, C3, C4, C5, C6;
    //private Color[] indicator = new Color[];
    private int[] colorIndicator = new int[5];
    private String[] labelColors = {"red", "yellow", "green", "blue", "magenta", "black"};
    private Random gen = new Random();

    private TextView colorLabel;
    private Color labelColorIndicator;
    private Button[] buttons = new Button[5];

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

        colorLabel = (TextView) findViewById(R.id.colorLabel);

        onStart(null);
    }

    protected void onStart(View view){
        int i = gen.nextInt(5);
        colorLabel.setText(labelColors[i]);

        int j = i;
        while(j == i){
            j = gen.nextInt(5);
        }

        switch(j) {
            case 0:
                colorLabel.setTextColor(Color.RED);
                //labelColorIndicator = Color.RED;
                break;
            case 1:
                colorLabel.setTextColor(Color.YELLOW);
                //labelColorIndicator = new Color(255, 255, 0);
                break;
            case 2:
                colorLabel.setTextColor(Color.GREEN);
                //labelColorIndicator = new java.awt.Color(0, 255, 0);
                break;
            case 3:
                colorLabel.setTextColor(Color.BLUE);
                //labelColorIndicator = new java.awt.Color(0, 0, 255);
                break;
            case 4:
                colorLabel.setTextColor(Color.MAGENTA);
                //labelColorIndicator = new java.awt.Color(255, 0, 255);
                break;
            case 5:
                colorLabel.setTextColor(Color.BLACK);
                break;
            default:
                break;
        }

        for(int k = 0; k < 5; ++k){

        }
    }


}