package com.github.zackratos.bottomdialog.sample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.zackratos.bottomdialog.library.BottomDialog;

/**
 *
 * Created by xiboke on 2017/10/13.
 */

public class SampleDialog extends BottomDialog {

    @Override
    protected View createView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.dialog_sample, container, false);
        view.findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return view;
    }
}
