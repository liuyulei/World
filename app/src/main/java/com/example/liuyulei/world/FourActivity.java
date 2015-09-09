package com.example.liuyulei.world;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FourActivity extends Activity {


    private List<Map<String,Object>> mData ;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        mData = getData();

        MyAdapter adapter = new MyAdapter(this);

        listView = (ListView)this.findViewById(R.id.fourlistview);
        listView.setAdapter(adapter);
    }

    private List<Map<String,Object>> getData(){
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("title","AAA");
        map.put("info", "aaa");
        list.add(map);

        Map<String,Object> map1 = new HashMap<String, Object>();
        map1.put("title","BBB");
        map1.put("info", "bbb");
        list.add(map1);

        return list;
    }

    public class MyAdapter extends BaseAdapter{

        private LayoutInflater mInflater;

        public MyAdapter(Context context){
            this.mInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
//            ViewHolder holder = null;
            View cont = null;
            if (view == null){
//                cont = new ViewHolder();
                cont = mInflater.inflate(R.layout.fourlist,null);
//                holder.img = (ImageView)view.findViewById(R.id.imageView);
//                holder.title = (TextView)view.findViewById(R.id.cellone);
//                holder.info = (TextView)view.findViewById(R.id.celltwo);
                TextView te = (TextView)cont.findViewById(R.id.cellone);
                te.setText(mData.get(i).get("title").toString());
                TextView te1 = (TextView)cont.findViewById(R.id.celltwo);
                te1.setText((String)mData.get(1).get("info"));
//                view.setTag(holder);
            }else {
//                holder = (ViewHolder)view.getTag();
                cont =view;
            }
//            holder.title.setText((String)mData.get(i).get("title"));
//            holder.info.setText((String)mData.get(i).get("info"));
            return cont;
        }
    }

    public final class ViewHolder{
        public ImageView img;
        public TextView title;
        public TextView info;
    }
}
