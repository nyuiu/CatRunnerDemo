package ru.rkn14.catrunnerdemo.cat;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import ru.rkn14.catrunnerdemo.R;

public class CatView extends ConstraintLayout {
    private static final int VELOCITY = 300;
    private ImageView head;
    private ImageView body;
    private ImageView handLeft;
    private ImageView handRight;
    private ImageView legLeft;
    private ImageView legRight;
    private ObjectAnimator handRightAnimation1;
    private ObjectAnimator handRightAnimation2;
    private ObjectAnimator handLeftAnimation1;
    private ObjectAnimator handLeftAnimation2;
    private ObjectAnimator legRightAnimation1;
    private ObjectAnimator legRightAnimation2;
    private ObjectAnimator legLeftAnimation1;
    private ObjectAnimator legLeftAnimation2;

    public CatView(Context context) {
        super(context);
        init();
    }

    public CatView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CatView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_cat, this);
        head = findViewById(R.id.cat_head_image_view);
        body = findViewById(R.id.cat_body_image_view);
        handLeft = findViewById(R.id.cat_hand_left_image_view);
        handRight = findViewById(R.id.cat_hand_right_image_view);
        legLeft = findViewById(R.id.cat_leg_left_image_view);
        legRight = findViewById(R.id.cat_leg_right_image_view);

        setSkin(Skins.COMMON);
        setHead(Heads.COMMON);

        handLeft.setPivotY(-5);
        handLeft.setPivotX(65);

        handRight.setPivotY(5);
        handRight.setPivotX(5);

        handRightAnimation1 = ObjectAnimator.ofFloat(handRight, "rotation", 10f, 30f);
        handRightAnimation1.setDuration(VELOCITY);
        handRightAnimation1.setRepeatMode(ValueAnimator.REVERSE);
        handRightAnimation1.setRepeatCount(Animation.INFINITE);

        handRightAnimation2 = ObjectAnimator.ofFloat(handRight, "rotation", -10f, -30f);
        handRightAnimation2.setDuration(VELOCITY);
        handRightAnimation2.setRepeatMode(ValueAnimator.REVERSE);
        handRightAnimation2.setRepeatCount(Animation.INFINITE);

        handLeftAnimation1 = ObjectAnimator.ofFloat(handLeft, "rotation", -30f, -10f);
        handLeftAnimation1.setDuration(VELOCITY);
        handLeftAnimation1.setRepeatMode(ValueAnimator.REVERSE);
        handLeftAnimation1.setRepeatCount(Animation.INFINITE);

        handLeftAnimation2 = ObjectAnimator.ofFloat(handLeft, "rotation", 30f, 10f);
        handLeftAnimation2.setDuration(VELOCITY);
        handLeftAnimation2.setRepeatMode(ValueAnimator.REVERSE);
        handLeftAnimation2.setRepeatCount(Animation.INFINITE);

        legRightAnimation1 = ObjectAnimator.ofFloat(legRight, "translationY", 20f);
        legRightAnimation1.setDuration(VELOCITY);
        legRightAnimation1.setRepeatMode(ValueAnimator.REVERSE);
        legRightAnimation1.setRepeatCount(Animation.INFINITE);

        legRightAnimation2 = ObjectAnimator.ofFloat(legLeft, "translationY", -20f);
        legRightAnimation2.setStartDelay(VELOCITY);
        legRightAnimation2.setDuration(VELOCITY);
        legRightAnimation2.setRepeatMode(ValueAnimator.REVERSE);
        legRightAnimation2.setRepeatCount(Animation.INFINITE);

        legLeftAnimation1 = ObjectAnimator.ofFloat(legLeft, "translationY", -20f);
        legLeftAnimation1.setDuration(VELOCITY);
        legLeftAnimation1.setRepeatMode(ValueAnimator.REVERSE);
        legLeftAnimation1.setRepeatCount(Animation.INFINITE);

        legLeftAnimation2 = ObjectAnimator.ofFloat(legRight, "translationY", -20f);
        legLeftAnimation2.setDuration(VELOCITY);
        legLeftAnimation2.setRepeatMode(ValueAnimator.REVERSE);
        legLeftAnimation2.setRepeatCount(Animation.INFINITE);
    }

    public enum Skins {
        COMMON,
        BAD,
        BUSINESS,
        KARATE,
        NORMAL
    }

    public void setSkin(Skins skin) {
        switch (skin) {
            case COMMON:
                Glide.with(this).load(R.drawable.common_cat_body).into(body);
                Glide.with(this).load(R.drawable.common_cat_hand).into(handRight);
                Glide.with(this).load(R.drawable.common_cat_hand).into(handLeft);
                Glide.with(this).load(R.drawable.common_cat_leg).into(legRight);
                Glide.with(this).load(R.drawable.common_cat_leg).into(legLeft);
                break;

            case BAD:
                Glide.with(this).load(R.drawable.bad_cat_body).into(body);
                Glide.with(this).load(R.drawable.bad_cat_hand).into(handRight);
                Glide.with(this).load(R.drawable.bad_cat_hand).into(handLeft);
                Glide.with(this).load(R.drawable.bad_cat_leg).into(legRight);
                Glide.with(this).load(R.drawable.bad_cat_leg).into(legLeft);
                break;

            case BUSINESS:
                Glide.with(this).load(R.drawable.bussiness_cat_body).into(body);
                Glide.with(this).load(R.drawable.bussiness_cat_hand).into(handRight);
                Glide.with(this).load(R.drawable.bussiness_cat_hand).into(handLeft);
                Glide.with(this).load(R.drawable.bussiness_cat_leg).into(legRight);
                Glide.with(this).load(R.drawable.bussiness_cat_leg).into(legLeft);
                break;

            case KARATE:
                Glide.with(this).load(R.drawable.karate_cat_body).into(body);
                Glide.with(this).load(R.drawable.karate_cat_hand).into(handRight);
                Glide.with(this).load(R.drawable.karate_cat_hand).into(handLeft);
                Glide.with(this).load(R.drawable.karate_cat_leg).into(legRight);
                Glide.with(this).load(R.drawable.karate_cat_leg).into(legLeft);
                break;

            case NORMAL:
                Glide.with(this).load(R.drawable.normal_cat_body).into(body);
                Glide.with(this).load(R.drawable.normal_cat_hand).into(handRight);
                Glide.with(this).load(R.drawable.normal_cat_hand).into(handLeft);
                Glide.with(this).load(R.drawable.normal_cat_leg).into(legRight);
                Glide.with(this).load(R.drawable.normal_cat_leg).into(legLeft);
                break;
        }
    }

    public enum Heads {
        COMMON,
        HAPPY_1,
        HAPPY_2,
        SAD,
        SHOCK,
        ANGRY
    }

    public void setHead(Heads head) {
        switch (head) {
            case COMMON:
                Glide.with(this).load(R.drawable.head_common).into(this.head);
                break;

            case HAPPY_1:
                Glide.with(this).load(R.drawable.head_happy_1).into(this.head);
                break;

            case HAPPY_2:
                Glide.with(this).load(R.drawable.head_happy_2).into(this.head);
                break;

            case SAD:
                Glide.with(this).load(R.drawable.head_sad).into(this.head);
                break;

            case SHOCK:
                Glide.with(this).load(R.drawable.head_shock).into(this.head);
                break;

            case ANGRY:
                Glide.with(this).load(R.drawable.head_angry).into(this.head);
                break;
        }
    }


    public void run() {
        stop();
        handRightAnimation1.start();
        handRightAnimation2.start();
        handLeftAnimation1.start();
        handLeftAnimation2.start();
        legRightAnimation2.start();
        legLeftAnimation2.start();
    }

    public void stop() {
        handRightAnimation1.cancel();
        handRightAnimation2.cancel();
        handLeftAnimation1.cancel();
        handLeftAnimation2.cancel();
        legRightAnimation1.cancel();
        legRightAnimation2.cancel();
        legLeftAnimation1.cancel();
        legLeftAnimation2.cancel();

        handLeft.clearAnimation();
        handRight.clearAnimation();
        legLeft.clearAnimation();
        legRight.clearAnimation();
    }
}
