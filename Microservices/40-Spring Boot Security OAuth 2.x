Spring Boot Security OAuth 2.x
==============================

=> OAuth 2.x Means Open Authorization using "Auth and Resource Server" (3rd Party services) to access enduser data by a client application.

=> OAuth is a standard Protocol for User Identity and verify concept using client application service.

=> OAuth 2.x is recomended for Day-to-Day business application.
     (Internal network application).
Ex: MMT, Carwale, Zomato, BookMyShow ...etc

=> It is not recomanded for finance/banking applications.
Ex: ICIC Bank, CreditCard service..

--3 devices---
1. Auth & Resource Server
2. Client Application (server)
3. End Customer Device (Browser)

*) AuthService Providers: Google , Facebook, Github, LinkedIn, Twitter..etc
Example:
https://developers.facebook.com/
https://console.cloud.google.com/

================Stages=============================================================================
1. Register Client application with Auth&Resource Server

2. Create End Customer account at client application and login

3. Get Access Token by a client+user from Auth Server to access resource from Resource Server.
===================================================================================================
*) End Customer tries to make Login request to client application.
*) Client app will ask user to login first and allow access request.
  (ie called as Grant)
*) If user has given Grant to Client application, then client makes request to Auth Server for Access Token using details
    clientId, secret and User Grant
*) Auth Server validates data and given accessToken to client app.
*) Client makes request to Resource server to read enduser data using AccessToken.
*) Resource server validates accessToken and provides user data.
*) Client App stores user data and makes user login success redirect to HomePage.




















