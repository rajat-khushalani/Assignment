package housemap.gl.com.housemap;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class KitchenAdapter extends BaseAdapter {
    private static ArrayList<String> kitchenItem;

    private LayoutInflater mInflater;

    public KitchenAdapter(Context KitchenFragment, ArrayList<String> results){
        kitchenItem = results;
        mInflater = LayoutInflater.from(KitchenFragment);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return kitchenItem.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return kitchenItem.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        mInflater.getContext();
        View View= mInflater.inflate(R.layout.grid_view, null, true);
        TextView txtTitle = (TextView) View.findViewById(R.id.txt);
        txtTitle.setText(kitchenItem.get(position));


        return View;
    }
}

