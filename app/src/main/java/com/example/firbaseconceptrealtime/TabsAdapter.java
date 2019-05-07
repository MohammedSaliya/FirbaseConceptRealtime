package com.example.firbaseconceptrealtime;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.firbaseconceptrealtime.Fragment.ChatFragment;
import com.example.firbaseconceptrealtime.Fragment.CreateAccountFragment;
import com.example.firbaseconceptrealtime.Fragment.LoginFragment;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public TabsAdapter(FragmentManager fm, int NoofTabs) {
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ChatFragment chat = new ChatFragment();
                return chat;
            case 1:
                CreateAccountFragment account = new CreateAccountFragment();
                return account;
            case 2:
                LoginFragment login = new LoginFragment();
                return login;
            default:
                return null;
        }
    }
}
