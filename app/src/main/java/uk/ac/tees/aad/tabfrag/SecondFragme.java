package uk.ac.tees.aad.tabfrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragme extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<Model> mylists;
    RecyclerView recyclerViews;


    private String mParam1;
    private String mParam2;

    public SecondFragme() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragme.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragme newInstance(String param1, String param2) {
        SecondFragme fragment = new SecondFragme();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);

        recyclerViews = view.findViewById(R.id.sec);
        recyclerViews.setLayoutManager(new LinearLayoutManager(getContext()));
        mylists = new ArrayList<>();

        mylists.add(new Model("Second","item",R.drawable.ic_launcher_background));
        mylists.add(new Model("Second","item",R.drawable.ic_launcher_background));
        recyclerViews.setAdapter(new myadapter(mylists));
        return view;
    }


}