package com.example.accountbook_uiux;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag_income extends Fragment {
    private View vi_income;

    /*public static Frag_income newinstance() {
        Frag_income flag_income = new Frag_income();
        return flag_income;
    } */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        vi_income = inflater.inflate(R.layout.frag_view_income, container, false);

        return vi_income;
    }
}
