package sidespell.tech.solarsystem.activity;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    ImageView imageView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spin);
        imageView = (ImageView) findViewById(R.id.imageView);

        spinner.setOnItemSelectedListener(this);
        List<String> planets = new ArrayList<String>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, planets);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

    }

        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String item = parent.getItemAtPosition(position).toString();
            Resources res = getResources();
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

            if (item.equals("Mercury")) {
                Drawable drawable = res.getDrawable(R.mipmap.mercury);
                imageView.setImageDrawable(drawable);
            }

            else if (item.equals("Venus")) {
                Drawable drawable = res.getDrawable(R.mipmap.venus);
                imageView.setImageDrawable(drawable);
            }

            else if (item.equals("Earth")) {
                Drawable drawable = res.getDrawable(R.mipmap.earth);
                imageView.setImageDrawable(drawable);
            }

            else if (item.equals("Mars")) {
                Drawable drawable = res.getDrawable(R.mipmap.mars);
                imageView.setImageDrawable(drawable);
            }

            else if (item.equals("Jupiter")) {
                Drawable drawable = res.getDrawable(R.mipmap.jupiter);
                imageView.setImageDrawable(drawable);
            }

            else if (item.equals("Saturn")) {
                Drawable drawable = res.getDrawable(R.mipmap.saturn);
                imageView.setImageDrawable(drawable);
            }

            else if (item.equals("Uranus")) {
                Drawable drawable = res.getDrawable(R.mipmap.uranus);
                imageView.setImageDrawable(drawable);
            }
            else if (item.equals("Neptune")) {
                Drawable drawable = res.getDrawable(R.mipmap.neptune);
                imageView.setImageDrawable(drawable);
            }

            else if (item.equals("Pluto")) {
                Drawable drawable = res.getDrawable(R.mipmap.pluto);
                imageView.setImageDrawable(drawable);
            }

        }

        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub
        }

}