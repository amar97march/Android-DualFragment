package com.example.amar97march.dualfragment;

//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v4.app.Fragment;


public class portraitDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portrait_detail);

        FragmentManager fManager=getFragmentManager();
        Fragment frag =fManager.findFragmentById(R.id.detailFragmentHolder);
        int position=0;
        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            position = extras.getInt("Position");
        }
        if(frag==null){
            frag=AddressDetailFragment.newInstance(position);
           fManager.beginTransaction().add(R.id.detailFragmentHolder,frag).commit();
        }
    }
}
