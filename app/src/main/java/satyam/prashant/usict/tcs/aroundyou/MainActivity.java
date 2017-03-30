package satyam.prashant.usict.tcs.aroundyou;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import features.Atm_maps;
import features.MyAdapter;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new MyAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "You Clicked at atm ", Toast.LENGTH_SHORT).show();
                        Intent movi = new Intent(MainActivity.this, Atm_maps.class);
                        startActivity(movi);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "You Clicked at bar ", Toast.LENGTH_SHORT).show();
                       // Intent playsobj = new Intent(MainActivity.this, Plays.class);
                       // startActivity(playsobj);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "You Clicked at bank ", Toast.LENGTH_SHORT).show();
                        //Intent sportsobj = new Intent(MainActivity.this, Sports.class);
                        //startActivity(sportsobj);
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "You Clicked at bus station ", Toast.LENGTH_SHORT).show();
                        //Intent eventsobj= new Intent(MainActivity.this,Events.class);
                        //startActivity(eventsobj);
                        break;
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
