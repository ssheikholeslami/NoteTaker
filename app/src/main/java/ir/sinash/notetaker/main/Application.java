package ir.sinash.notetaker.main;

import android.content.Context;
import android.util.Log;

import com.couchbase.lite.Manager;
import com.couchbase.lite.android.AndroidContext;

import java.io.IOException;

/**
 * Created by sinash on 4/14/15.
 */

public class Application extends android.app.Application{

    private Manager dbManager;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        try{
            dbManager = new Manager(new AndroidContext(context), Manager.DEFAULT_OPTIONS);

        }
        catch (IOException e){
            Log.e("nt-initialize" , "Cannot create manager instance", e);
            return;
        }

    }
}
