package gruppe24.dendigitalerestaurantoplevelse;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends CustomToolbarActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.addClickListeners();

    }
    public void btnSushi_OnClick(View view) {
        Intent intent = new Intent(this,FoodInfo.class);
        startActivity(intent);
    }
    /*
    public void SkiftFrag(View view){
        Fragment fragment;
        if ( view == findViewById(R.id.shoppingcart)) {
            fragment = new ShoppingCart();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        /* Til andre fragments
        if ( view == findViewById(R.id.hjælp)) {
            fragment = new HjaelpFrag();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_placering, fragment);
            ft.commit();
        }

    }
    */
}
