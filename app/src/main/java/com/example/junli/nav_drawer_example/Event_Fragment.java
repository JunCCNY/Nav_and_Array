package com.example.junli.nav_drawer_example;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Event_Fragment extends Fragment {


    public Event_Fragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        String[] arr = {"mofi", "jun", "david", "jabir"};
//
//        ArrayList<String> array = new ArrayList<String>();
//
//        for (String a:arr) {
//            array.add(a);
//        }
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_event_, container, false);

            ArrayList<Event> events = new ArrayList<>();

            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
        EventAdapter adapter = new EventAdapter(getContext(), events);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, array);
        ListView lv = (ListView) rootview.findViewById(R.id.list_item);
        lv.setAdapter(adapter);
        return rootview;
    }

}
