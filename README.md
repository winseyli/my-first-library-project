# my-first-library-project

## Add it in your settings.gradle at the end of repositories:
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

## Add the dependency in your app’s build.gradle (:app)

### Release tag
```
implementation 'com.github.winseyli:my-first-library-project:X.X.X'
```

### Branch
```
implementation 'com.github.winseyli:my-first-library-project:[branch_name]-SNAPSHOT'
```

## Usage
```
<com.example.android.mylibrary.LargeRegularTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        tools:text="text" />
```

```
largeHelloWorldText.setBold("Large Text")
regularHelloWorldText.setNormal("Regular Text")
```
