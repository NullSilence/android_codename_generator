package nullsilence.codenamegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import nullsilence.codenamegenerator.Service.RandomEnumService;

/**
 * Created by Nullsilence on 2017-06-01.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the button ID.
        final Button button = (Button)findViewById(R.id.generate);

        //Set the listener for the click event.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RandomEnumService res = new RandomEnumService();
                //Put the text into the TextView.
                ((TextView)findViewById(R.id.codename)).setText(res.toString());
            }
        });

    }
}
