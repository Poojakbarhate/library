package com.example.libraryceation;




import static com.example.libraryceation.Constant.BASE_URL;
import static com.example.libraryceation.Constant.getUrl;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

public class DisplayToast extends AppCompatActivity implements Constants{
   public static Context context;
    public static String init(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            return (String) applicationInfo.metaData.get("BUILD_TYPE");
        } catch (PackageManager.NameNotFoundException e) {
          return ("Name not found");
        }
    }

    public DisplayToast(Context context) {
        this.context=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //     String buildType=  init(context);
      display();

    }

    public static void display() {
         String buildType=init(context);
         getUrl(buildType);
        Toast.makeText(context, BASE_URL, Toast.LENGTH_SHORT).show();
        /*switch (buildType) {

            case "UAT":
                Toast.makeText(context, UAT_BASE_URL, Toast.LENGTH_SHORT).show();

                //  Toast.makeText(context, Constants.UAT_BASE_URL, Toast.LENGTH_SHORT).show();
                break;
            case "PRO":
                Toast.makeText(context, PRO_BASE_URL, Toast.LENGTH_SHORT).show();

//                Toast.makeText(context, Constants.PRO_BASE_URL, Toast.LENGTH_SHORT).show();
                break;
            case "release":
                Toast.makeText(context, RELEASE_BASE_URL, Toast.LENGTH_SHORT).show();
                break;
            case "debug":
                Toast.makeText(context, DEBUG_BASE_URL, Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(context, "no build type is selected", Toast.LENGTH_SHORT).show();
                break;

*/
        }
    }



  /*  public static void display() {
        String buildType=init(context);
        Constant constant=new Constant();
        String data=        constant.getUrl(buildType);
        Toast.makeText(context, data, Toast.LENGTH_SHORT).show();
    }
*/

  /*  public static Context context;
   public static DisplayToast mInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static void display()
    {


        Toast.makeText(context,context.getResources().getString(R.string.COMMON_BASE_URL), Toast.LENGTH_SHORT).show();
        //Toast toast=Toast.makeText(c,,Toast.LENGTH_SHORT);
        //toast.show();

    }


}*/