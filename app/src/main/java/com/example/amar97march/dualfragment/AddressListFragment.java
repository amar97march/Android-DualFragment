package com.example.amar97march.dualfragment;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
//import java.util.jar.Attributes;

/**
 * Created by amar97march on 20-08-2017.
 */

public class AddressListFragment extends ListFragment {
    private ActivityComs mActivityComs;
    private ArrayList<NameAndAddress> mNameAndAddress;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        mActivityComs=(ActivityComs)activity;
    }
    @Override
    public void onDetach(){
        super.onDetach();
        mActivityComs=null;
    }
    public void onListItemClick(ListView l,View v,int position,long id){
        mActivityComs.onListItemSelected(position);
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mNameAndAddress=AddressBook.getInstance().getBook();
        AddressListAdapter adapter=new AddressListAdapter(mNameAndAddress);
        setListAdapter(adapter);
    }
    private class AddressListAdapter extends ArrayAdapter<NameAndAddress> {
        public AddressListAdapter(ArrayList<NameAndAddress> nameAndAddresses) {
            super(getActivity(), R.layout.list_item, nameAndAddresses);
        }

        @Override
        public View getView(int whichItem, View view, ViewGroup viewGroup) {
            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) getActivity().getLayoutInflater();
                view = inflater.inflate(R.layout.list_item, null);
            }
            NameAndAddress tempNameAndAddress = getItem(whichItem);
            TextView txtName = (TextView) view.findViewById(R.id.txtName);
            txtName.setText(tempNameAndAddress.getName());
            return view;
        }
    }
}
