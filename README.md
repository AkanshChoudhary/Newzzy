# Newzzy!

## Quick Overview

This is a news application which has functionality to load live trending news data from **newsapi.org** and show it to users in **News Section** . The users also have functionality to **Search News** on **newsapi.org** with a keyword eg: Minister. 
All the shown news items can be read or saved for future reference. Once clicked on a news item, a **WebView** is opened showing the complete article details. Lets look at everything in detail below.


## Architecture 

This application uses **Clean Architecture** with **MVVM**, **Dagger Hilt**, **Retrofit**, **Pagination** and **Room SQLite Database** for having a clean and scalable code base and folder structure. The Key elements of the architecture are :

### 1. UI 
The app is made with new age Declarative UI framework **Jetpack Compose**.

### 2. API
Here the **GET calls are mapped to functions** and **RetrofitInstance** is created which will be acting as the medium between business logic and URL calling and getting response. 

### 3. Data Access Object (DAO)
Here the **Room Database Classes** and their supporting DAO functionalities like insert/update/delete are defined.

### 4. Model
This contains all our Model classes which define structure for the News API response and help in converting JSON response directly to class objects. The **Article** class also acts as an Entity/Table for the databases mentioned above.

### 5. Repository
 This helps our ViewModel to connect with our Database DAO functions using **Coroutines/ Suspend func**. Acts as medium between ViewModel and DAO by providing relevant functions
 

## Positives of the application

* Complete Clean Architecture.
* Using Room Database for storing Saved Articles.
* Used latest Retrofit for API request handling.
* Pagination support in both Current News and Search News.
* Highly Scalable and Readable codebase.
* Searching functionality in Saved News based on title.
* Works in both Light and Dark Modes as per phone's settings.
* Using CoRoutines for async tasks on different thread rather than on Main Thread.

## Challenges Faced
* Since **newsapi.org** does not provide full news content in free version making a news detail screen was not possible as relevant content was trimmed. So to present full information to user WebView was implemented which opens the article URL in the fragment as a webpage.
 

### App Photos
<img src="https://github.com/AkanshChoudhary/Newzzy/blob/main/app_images/image3.jpg" width="400" height="800" /> <img src="https://github.com/AkanshChoudhary/Newzzy/blob/main/app_images/image2.jpg" width="400" height="800" />
<img src="https://github.com/AkanshChoudhary/Newzzy/blob/main/app_images/image1.jpg" width="400" height="800" />

