package com.jackwilkins.myfirstapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.jackwilkins.myfirstapp.R;

/**
 * Created by jackwilkins on 20/11/2017.
 */

public class ChatFragment extends BaseFragment {

    public static ChatFragment create() {
        return new ChatFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_chat;
    }

    @Override
    public void inOnCreate(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}
