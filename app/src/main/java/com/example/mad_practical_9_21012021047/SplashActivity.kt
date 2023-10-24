package com.example.mad_practical_9_21012021047

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),AnimationListener {
    lateinit var  logoanimation : AnimationDrawable
    lateinit var twinAnimation: Animation
    lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var image:ImageView = findViewById(R.id.uvpce_logo)
        image.setBackgroundResource(R.drawable.uvpce_animation_list)
        logoanimation = image.background as AnimationDrawable
        twinAnimation = AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        twinAnimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            logoanimation.start()
            img.startAnimation(twinAnimation)
        }
        else
        {
            logoanimation.stop()
        }

    }
    override fun onAnimationStart(p0: Animation?) {
    }

    override fun onAnimationEnd(p0: Animation?) {
        Intent(this,MainActivity::class.java).also {
            startActivity(it)
        }
    }

    override fun onAnimationRepeat(p0: Animation?) {
    }
}