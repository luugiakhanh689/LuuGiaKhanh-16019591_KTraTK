package com.example.student.luugiakhanh_16019591;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.TextView;
import java.util.List;
public class CustomListAdapter extends BaseAdapter{
    private List<Country> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context aContext,  List<Country> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.nameFlim = (TextView) convertView.findViewById(R.id.textView_nameFlim);
            holder.countryNameView = (TextView) convertView.findViewById(R.id.textView_countryName);
            holder.populationView = (TextView) convertView.findViewById(R.id.textView_population);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Country country = this.listData.get(position);
        holder.nameFlim.setText(country.getFlimName());
        holder.countryNameView.setText(country.getCountryName());
        holder.populationView.setText("Population: " + country.getPopulation());



        return convertView;
    }
    

    static class ViewHolder {
        TextView nameFlim;
        TextView countryNameView;
        TextView populationView;
    }
}
