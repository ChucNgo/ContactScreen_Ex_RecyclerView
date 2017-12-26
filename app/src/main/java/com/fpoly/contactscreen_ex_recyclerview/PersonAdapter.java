package com.fpoly.contactscreen_ex_recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 12/26/2017.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.InfoViewHolder> {

    ArrayList<Person> arrPerson;
    Context context;

    public PersonAdapter(Context curContext,ArrayList<Person> arrayList){
        this.context = curContext;
        this.arrPerson = arrayList;
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView;

        switch (viewType){

            case 1:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_conversation_man
                ,parent,false);
                break;
            case 2:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_conversation_woman
                ,parent,false);
                break;
            default:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_conversation_man
                        ,parent,false);
                break;
        }

        InfoViewHolder infoViewHolder = new InfoViewHolder(itemView);
        return infoViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        if (arrPerson.get(position).gender.equals("man")){
            return 1;
        }else {
            return 2;
        }
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        String name = arrPerson.get(position).getName();
        holder.tv_name.setText(name);
    }

    @Override
    public int getItemCount() {
        return arrPerson == null ? 0 : arrPerson.size();
    }

    class InfoViewHolder extends RecyclerView.ViewHolder{

        TextView tv_name;

        public InfoViewHolder(View itemView) {
            super(itemView);
            tv_name= (TextView) itemView.findViewById(R.id.tv_name);
        }
    }

}
