package satyam.prashant.usict.tcs.aroundyou;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prashant on 22-03-2017.
 */

public class MyAdapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public MyAdapter(Context context) {
        mInflater = LayoutInflater.from(context);

        mItems.add(new Item("ATM",       R.drawable.blue));
        mItems.add(new Item("Bar",   R.drawable.lighterblue));
        mItems.add(new Item("Bank", R.drawable.blue));
        mItems.add(new Item("Bus Station",      R.drawable.lighterblue));
        mItems.add(new Item("Super Market",     R.drawable.blue));
        mItems.add(new Item("Railway Station",      R.drawable.lighterblue));
        mItems.add(new Item("Movie hall",     R.drawable.blue));
        mItems.add(new Item("Salon/Spa",      R.drawable.lighterblue));
        mItems.add(new Item("Shopping mall",     R.drawable.blue));
        mItems.add(new Item("Restaurant",      R.drawable.lighterblue));
        mItems.add(new Item("Hotel",     R.drawable.blue));
        mItems.add(new Item("Hospital",      R.drawable.lighterblue));
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_single, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    private static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}