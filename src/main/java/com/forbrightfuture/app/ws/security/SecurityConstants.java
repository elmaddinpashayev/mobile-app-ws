package com.forbrightfuture.app.ws.security;

import com.forbrightfuture.app.ws.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPIRATION_TIME = 864000000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
<<<<<<< HEAD
    public static String getTokenSecret()
    {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }
=======
    public static final String TOKEN_SECRET = "jf9i4jgu83nfldsfss0";

>>>>>>> 73f59ddb0a6121b297c88fdbe4775652da78c652
}
