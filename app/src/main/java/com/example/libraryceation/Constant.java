package com.example.libraryceation;

import android.widget.Toast;

class Constant {
    public static String BASE_URL="";

    /*
    public static String PRO_BASE_URL="this is PRO build";
    public static String UAT_BASE_URL="this is UAT build";
    public static String DEBUG_BASE_URL="this is DEBUG build";
    public static String RELEASE_BASE_URL="this is RELEASE build";*/
    protected  String getUrl(String buildType) {
        switch (buildType) {

            case "UAT":
                return "this is UAT build";
//            Toast.makeText(context, Constant.UAT_BASE_URL, Toast.LENGTH_SHORT).show();

            //  Toast.makeText(context, Constants.UAT_BASE_URL, Toast.LENGTH_SHORT).show();
            case "PRO":
                return "this is PRO build";
            //    Toast.makeText(context, Constant.PRO_BASE_URL, Toast.LENGTH_SHORT).show();

//                Toast.makeText(context, Constants.PRO_BASE_URL, Toast.LENGTH_SHORT).show();
         //   break;
            case "release":
                return "this is PRO build";
            //Toast.makeText(context, Constants.RELEASE_BASE_URL, Toast.LENGTH_SHORT).show();
           // break;
            case "debug":
                return "this is PRO build";
            //Toast.makeText(context, Constants.DEBUG_BASE_URL, Toast.LENGTH_SHORT).show();
            //break;
            default:
                return "nothing";
//            Toast.makeText(context, "no build type is selected", Toast.LENGTH_SHORT).show();
            //break;

        }
    }}