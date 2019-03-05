package com.example.android.androiduber_rider;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class BottomSheetRiderFragment extends BottomSheetDialogFragment {

    String mTag;

    public static BottomSheetRiderFragment newInstance(String mTag) {
        BottomSheetRiderFragment fragment = new BottomSheetRiderFragment();
        Bundle args = new Bundle();
        args.putString("TAG", mTag);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTag = getArguments().getString("TAG");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_rider, container, false);
        return view;
    }
}
