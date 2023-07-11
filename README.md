# Bach
 A Library of UI & Functional Composables

## List of Functional Components
* Network Status Tracker -- Get realtime updates during recomposition tracking whether the user is connected to the internet or not
```
NetworkStatusTracker {
    Text("Connected to the internet: $it")
}
```

## List of UI Components

* Card -- A simple card component used to display content
![HeadersExample](https://github.com/JuriKiin/Bach/assets/15380450/a9e88d4e-ceb2-4312-8cea-7d10ab17179d)
```
Card("Card Example") {
    H3("This is the card content")
}
```

* Headers -- H1, H2, H3

![HeadersExample](https://github.com/JuriKiin/Bach/assets/15380450/38d583b8-c373-4865-9ad2-7f2711a24a02)
```
H1("This is an H1")
H2("This is an H2")
H3("This is an H3")
```
