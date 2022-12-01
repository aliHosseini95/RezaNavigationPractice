package com.prt.rezanavigationpractice;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
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

    @SuppressLint("ClickableViewAccessibility")
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
/*        AnimationDrawable animationDrawable = (AnimationDrawable) binding.reza.getDrawable();
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

//        New Animation Lesson
        //<editor-fold desc="Change background color by objectAnimator">
     /*   ObjectAnimator animator = ObjectAnimator.ofArgb(binding.buttonFirst, "backgroundColor", Color.RED, Color.BLUE);
        animator.setDuration(3000);
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator.start();
            }
        });*/
        //</editor-fold>

        //<editor-fold desc="View Animate">
        /*final float[] visibility = {0f};
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.reza.animate().setDuration(2000).alpha(visibility[0]).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        binding.buttonFirst.setEnabled(false);
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        if (visibility[0] == 0) {
                            visibility[0] = 1;
                        } else {
                            visibility[0] = 0;
                        }
                        binding.buttonFirst.setEnabled(true);
                    }
                }).start();
            }
        });*/
        //</editor-fold>

        //<editor-fold desc="Touch Listener">
        /*binding.buttonFirst.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    binding.reza.setImageResource(R.drawable.ic_launcher_foreground);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    binding.reza.setImageResource(R.drawable.my_animation_drawable);
                    return true;
                }
                return false;
            }
        });*/
        //</editor-fold>

        //<editor-fold desc="Value Animator">
        /*ValueAnimator animator = ValueAnimator.ofFloat(0, 100);
        animator.setDuration(3000);
        animator.setInterpolator(new AnticipateOvershootInterpolator());

        final int[] counter = {0};
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                binding.reza.setRotation((Float) valueAnimator.getAnimatedValue());
                binding.buttonFirst.setText(String.valueOf((Float) valueAnimator.getAnimatedValue()));
                counter[0]++;
            }
        });
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                Log.d("TEST_TAG", String.valueOf(counter[0]));
            }
        });
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator.start();
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