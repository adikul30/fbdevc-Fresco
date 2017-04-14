package devc.fbdevc_fresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by adicool on 14/4/17.
 */

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Initialize Fresco class once
        Fresco.initialize(this);
    }
}
