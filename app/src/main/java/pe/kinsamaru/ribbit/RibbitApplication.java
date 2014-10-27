package pe.kinsamaru.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by juan on 10/19/14.
 */
public class RibbitApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "O0zTvLdv63b8KTWe7gzR0HoVFMLyRS5WjSts90ZC", "i2X1nO8toYeHEkSFJ0x0q3g1wBKQugBYCR3hG9rF");

        //ParseObject testObject = new ParseObject("TestObject");
        //testObject.put("foo", "bar");
        //testObject.saveInBackground();
    }

}
