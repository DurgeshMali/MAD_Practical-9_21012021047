package com.example.mad_practical_9_21012021047

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),AnimationListener {
    lateinit var  logoanimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var image:ImageView = findViewById(R.id.uvpce_logo)
        image.setBackgroundResource(R.drawable.uvpce_animation_list)
        logoanimation = image.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            logoanimation.start()
        }
        else
        {
            logoanimation.stop()
        }

    }
    override fun onAnimationStart(p0: Animation?) {
    }

    override fun onAnimationEnd(p0: Animation?) {
    }

    override fun onAnimationRepeat(p0: Animation?) {
    }
}