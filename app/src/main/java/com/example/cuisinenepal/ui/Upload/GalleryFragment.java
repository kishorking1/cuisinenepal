package com.example.cuisinenepal.ui.Upload;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.cuisinenepal.R;
import com.example.cuisinenepal.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;


        Button bt1 = root.findViewById(R.id.uploadfooditemsbt);
        Button bt2 = root.findViewById(R.id.uploadburgerbt);
        Button bt3 = root.findViewById(R.id.uploadchickenbt);
        Button bt4 = root.findViewById(R.id.uploadFastfoodbt);
        Button bt5 = root.findViewById(R.id.uploadRestaurantbt);


       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Navigation.findNavController(v).navigate(R.id.action_nav_upload_to_uploadFoodItems);
           }
       });


bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Navigation.findNavController(v).navigate(R.id.action_nav_upload_to_uploadBurger);
    }
});



      bt3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Navigation.findNavController(v).navigate(R.id.action_nav_upload_to_uploadChicken);
          }
      });

      bt4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Navigation.findNavController(v).navigate(R.id.action_nav_upload_to_uploadFastFood);
          }
      });






      bt5.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.action_nav_upload_to_uploadRestaurant2);
          }
      });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}