package wrathspectre.com.dualink;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class SystemManagementFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.system_managament_fragment, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("System management");

        BottomNavigationView navigationView = view.findViewById(R.id.system_management_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.power_management:
                        fragmentTransaction.replace(R.id.system_management_fragment_area, new PowerSettingsFragment()).commit();
                        return true;

                    case R.id.multmedia_management:
                        fragmentTransaction.replace(R.id.system_management_fragment_area, new MultimediaFragment()).commit();
                        return true;

                    case R.id.presentation_management:
                        fragmentTransaction.replace(R.id.system_management_fragment_area, new PresentationFragment()).commit();
                        return true;
                }

                return false;
            }
        });
    }
}
