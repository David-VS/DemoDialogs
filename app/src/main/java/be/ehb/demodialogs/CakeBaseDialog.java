package be.ehb.demodialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

public class CakeBaseDialog extends DialogFragment {

    private FragmentActivity context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = (FragmentActivity) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder mBuilder = new AlertDialog.Builder(context);

        mBuilder.setTitle(R.string.cake_base_title);
        mBuilder.setItems(R.array.cake_base_list, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int indexInDeArray) {
                String gekozen = getResources().getStringArray(R.array.cake_base_list)[indexInDeArray];
                Toast.makeText(context, gekozen, Toast.LENGTH_LONG).show();
            }
        });
        mBuilder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //cancel, does nothing
            }
        });

        return mBuilder.create();
    }
}
