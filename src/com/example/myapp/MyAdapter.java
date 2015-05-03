package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by konstantin on 01/05/15.
 */
public class MyAdapter extends BaseAdapter {

    private List<Person> friends;
    private Context context;

    public MyAdapter(Context context, List<Person> friends) {
        this.context = context;
        this.friends = friends;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        Person person = friends.get(i);

//        View friendView = convertView; // temp
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listitem_friend, null);
        }

        ImageView imAvatar = (ImageView) convertView.findViewById(R.id.imAvatar);
        if (person.isDoesAvatarExist()) {
            imAvatar.setImageResource(R.drawable.friend1);
        } else {
            imAvatar.setImageResource(R.drawable.no_avatar);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        tvName.setText(person.getName());

        View imFavourite = convertView.findViewById(R.id.imFavourite);
        if (person.isFavourite()) {
            imFavourite.setVisibility(View.VISIBLE);
        } else {
            imFavourite.setVisibility(View.GONE);
        }

        TextView tvContacts = (TextView) convertView.findViewById(R.id.tvContacts);
        tvContacts.setText(person.getTelephone() + " " + person.getEmail());

        TextView tvBirthday = (TextView) convertView.findViewById(R.id.tvBirthday);
        tvBirthday.setText(android.text.format.DateFormat.format("ДР: dd.MM.yyyy", person.getBirth()));


        return convertView;
    }
}
