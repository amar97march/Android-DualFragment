package com.example.amar97march.dualfragment;

import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Fragment;
import java.util.ArrayList;

/**
 * Created by amar97march on 31-08-2017.
 */

public class AddressDetailFragment extends Fragment{

    private ArrayList<NameAndAddress> mNameAndAddresses;
    private NameAndAddress mCurrentNameAndAddresses;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        mNameAndAddresses=AddressBook.getInstance().getBook();
        int position=(int) getArguments().getInt("Position");
        mCurrentNameAndAddresses=mNameAndAddresses.get(position);

    }
    public static AddressDetailFragment newInstance(int position){
        Bundle args=new Bundle();
        args.putInt("Position",position);
        AddressDetailFragment frag= new AddressDetailFragment();
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.detail_fragment,container,false);

        TextView txtName =(TextView) view.findViewById(R.id.txtName);
        TextView txtAddress1=(TextView) view.findViewById(R.id.txtAddress1);
        TextView txtAddress2=(TextView) view.findViewById(R.id.txtAddress2);
        TextView txtZip=(TextView) view.findViewById(R.id.txtZip);
        txtName.setText(mCurrentNameAndAddresses.getName());
        txtAddress1.setText(mCurrentNameAndAddresses.getAddress1());
        txtAddress2.setText(mCurrentNameAndAddresses.getAddress2());
        txtZip.setText(mCurrentNameAndAddresses.getZipCode());
        return view;
    }

}
