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

class BedRoomListAdapter extends BaseAdapter {
    private static ArrayList<String> bedRoomItem;

    private LayoutInflater mInflater;

    public BedRoomListAdapter(Context BedroomFragment, ArrayList<String> results){
        bedRoomItem = results;
        mInflater = LayoutInflater.from(BedroomFragment);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return bedRoomItem.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return bedRoomItem.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        mInflater.getContext();
        View rowView= mInflater.inflate(R.layout.list_view, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(bedRoomItem.get(position));


        return rowView;
    }
}
