package com.prt.rezanavigationpractice;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.prt.rezanavigationpractice.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //<editor-fold desc="Navigation">
        //        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
        //</editor-fold>

        //<editor-fold desc="Animation Drawable">
  /*      AnimationDrawable animationDrawable = (AnimationDrawable) binding.reza.getDrawable();
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.start();
            }
        });*/
        //</editor-fold>

        //<editor-fold desc="Animator XML">
/*        Animator animator = AnimatorInflater.loadAnimator(getContext(), R.animator.my_animator);
        animator.setTarget(binding.reza);
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator.start();
            }
        });*/
        //</editor-fold>

        //<editor-fold desc="AnimatorSet And ObjectAnimator">
/*        ImageView imageView = binding.reza;

//        The animator values
        final int[] rotationFrom = {0};
        final int[] rotationTo = {90};

        final int[] translateXFrom = {0};
        final int[] translateYFrom = {0};
        final int[] translateXTo = {-100};
        final int[] translateYTo = {-100};

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TEST_TAG", "----------------------------------");
                Log.d("TEST_TAG", "onClick : " + rotationFrom[0] + " >>> " + rotationTo[0]);
                Log.d("TEST_TAG", "onClick : " + translateXFrom[0] + " >>> " + translateXTo[0]);
                Log.d("TEST_TAG", "onClick : " + translateYFrom[0] + " >>> " + translateYTo[0]);

//                Rotation Animation
                ObjectAnimator rotation = ObjectAnimator.ofFloat(null, View.ROTATION, rotationFrom[0], rotationTo[0]);
//                Animation Time
                rotation.setDuration(2000);

//                TranslationX Animation
                ObjectAnimator translationX = ObjectAnimator.ofFloat(null, View.TRANSLATION_X, translateXFrom[0], translateXTo[0]);
//                Animation Time
                translationX.setDuration(2000);

//                TranslationY Animation
                ObjectAnimator translationY = ObjectAnimator.ofFloat(imageView, View.TRANSLATION_Y, translateYFrom[0], translateYTo[0]);
                //                Animation Time
                translationY.setDuration(2000);

//                AnimatorSet is a group of ObjectAnimators
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(rotation).before(translationX).before(translationY);
                animatorSet.setTarget(imageView);

//                Add a listener to animatorSet to setup the values for next animation
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        rotationFrom[0] = rotationTo[0];
                        rotationTo[0] += 90;
                        translateXFrom[0] = translateXTo[0];
                        translateXTo[0] += -100;
                        translateYFrom[0] = translateYTo[0];
                        translateYTo[0] += -100;
                    }
                });

                animatorSet.start();
            }
        });*/
        //</editor-fold>
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}