package com.example.helloendpoints;

/**
 * Contains the client IDs and scopes for allowed clients consuming the helloworld API.
 */
public class Constants {
  public static final String WEB_CLIENT_ID = "900937835222-ohlobrcrghedhig5cv1f08jcgl48gkot.apps.googleusercontent.com";
  public static final String ANDROID_CLIENT_ID = WEB_CLIENT_ID;
  public static final String IOS_CLIENT_ID =  WEB_CLIENT_ID;
  public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;

  public static final String EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
}
