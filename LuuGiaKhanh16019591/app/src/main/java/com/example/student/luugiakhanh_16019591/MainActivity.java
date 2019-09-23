package com.example.student.luugiakhanh_16019591;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // Khi người dùng click vào các ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country wolfverin = new Country("Wolfverin", "Americam", 30000);
        Country sf = new Country("SwordFish", "Americam", 15000);
        Country dp = new Country("DeadPool", "Americam", 29000);
        Country rb = new Country("RobinHood", "Americam", 35000);
        Country eg = new Country("Endgame", "Americam", 100000);
        Country ir = new Country("IronMan", "Americam", 70000);


        list.add(sf);
        list.add(dp);
        list.add(rb);
        list.add(eg);
        list.add(ir);
        return list;
    }
}
