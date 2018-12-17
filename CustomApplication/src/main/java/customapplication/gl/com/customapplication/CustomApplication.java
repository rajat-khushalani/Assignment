package customapplication.gl.com.customapplication;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import java.util.ArrayList;

public class CustomApplication extends Application {
    Person person;
    static ArrayList<Person>personList=new ArrayList<Person>();




    @Override
    public void onCreate() {
        super.onCreate();

        personList.add(new Person("rajat","khushalani","nagpur","engineering"));
        personList.add(new Person("simran","ojha","nagpur","engineering"));
        personList.add(new Person("ankita","tiwari","nagpur","engineering"));
        personList.add(new Person("yogesh","tandulkar","nagpur","engineering"));
        personList.add(new Person("hitesh","bhengra","nagpur","engineering"));
        System.out.println(personList.toString());
        Log.d("CustomApplication","oncustomCreateCalled()");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        personList.clear();
        System.out.println("arraylist cleared");
        Log.d("CustomApplication","onTerminateCalled()");
        System.out.println(personList.toString());

    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

        Log.d("CustomApplication","onTrimMemoryCalled()");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        personList.clear();
        Log.d("CustomApplication","onLowMemoryCalled()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("CustomApplication","onConfigurationChangedCalled()");
    }
}
