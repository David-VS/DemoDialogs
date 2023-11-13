package be.ehb.demodialogs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnToast = view.findViewById(R.id.btn_toast);
        Button btnDialog = view.findViewById(R.id.btn_dialog);

        btnToast.setOnClickListener( (View v) -> {
            Toast.makeText(getActivity(), "We butter our bread with butter", Toast.LENGTH_LONG).show();
        } );

        btnDialog.setOnClickListener( (View v) -> {
            CakeBaseDialog cbd = new CakeBaseDialog();
            cbd.show(getParentFragmentManager(), "cbd");
        } );
    }
}