package net.imthinker.android.dslsample.fragment;


import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.imthinker.android.dslsample.R;


public class FirstFragment extends Fragment {

    public FirstFragment() {
    }

    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();
        Bundle args = fragment.getArguments();
        if (args == null) {
            args = new Bundle();
        }
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.first_coordinator_layout);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.first_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(coordinatorLayout, R.string.hello_world, Snackbar.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
