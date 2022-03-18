package tien.edu.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuFrag extends ListFragment {
    String[] menus = {"Goku", "Doraemom", "Conan"};
    ListView list;

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        ((MainActivity)getActivity()).updateContent(position);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.menu_frag, container, false);
        list = view.findViewById(android.R.id.list);
        list.setDivider(null);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(view.getContext(),
                R.layout.menu_layout, (new ArrayList<String>(Arrays.asList(menus))));
        list.setAdapter(listAdapter);
        return view;
    }
}
