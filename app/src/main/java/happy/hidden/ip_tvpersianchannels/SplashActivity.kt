package happy.hidden.ip_tvpersianchannels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import happy.hidden.ip_tvpersianchannels.activity.HomeActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        img_ico_app.animation=AnimationUtils.loadAnimation(this@SplashActivity,R.anim.img_open)
        lbl_title_name.animation=AnimationUtils.loadAnimation(this@SplashActivity,R.anim.lbl_left)
        lbl_decription.animation=AnimationUtils.loadAnimation(this@SplashActivity,R.anim.lbl_right)
        lbl_developer.animation=AnimationUtils.loadAnimation(this@SplashActivity,R.anim.lbl_botton)
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity,HomeActivity::class.java))
            finish()
        },2500)

    }
}
