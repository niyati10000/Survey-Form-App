# Survey Form Application

An Android application developed in Java that implements a user feedback interface. The application captures user responses to multiple-choice questions using RadioGroups and aggregates the data into a summary string upon submission.

## Project Overview

This project demonstrates input handling in Android development, specifically focusing on exclusive selection logic. It utilizes both `RadioButton` and `RadioGroup` components to ensure data integrity (single answer per question) and implements event listeners to capture user input in real-time.

## Features

* **Single-Choice Selection:** Utilizes `RadioGroup` to enforce mutually exclusive answers for survey questions.
* **Data Aggregation:** Concatenates user responses from multiple input fields into a single formatted string.
* **State Management:** Includes functionality to reset the form, clearing all visual selections and internal string variables.
* **Input Handling:** Demonstrates two methods of input capture:
    * Direct `OnClickListener` for individual buttons.
    * `OnCheckedChangeListener` for grouped buttons.

## Technical Details

* **Language:** Java
* **Minimum SDK:** 24
* **IDE:** Android Studio
* **Key Components:**
    * `android.widget.RadioGroup`
    * `android.widget.RadioButton`
    * `android.widget.Toast`

## Project Structure

### XML Resources (`res/values/strings.xml`)
The application separates UI text from logic. All survey questions and response options are defined in the string resources file to support localization and maintainability.

### Logic (`MainActivity.java`)
The main activity handles the application lifecycle and view initialization. It maintains the state of selected answers using String variables and updates them dynamically via listeners attached to the UI components.

## Setup and execution

1.  Clone the repository:
    ```bash
    git clone [https://github.com/your-username/Android-Survey-Form.git](https://github.com/your-username/Android-Survey-Form.git)
    ```
2.  Open the project in Android Studio.
3.  Sync the project with Gradle files.
4.  Run the application on an emulator or physical Android device.
   
## Future Improvements

* Implementation of input validation to ensure all questions are answered before submission.
* Replacement of `Toast` output with a dedicated Results Activity or Dialog.
* Persistent storage implementation (SharedPreferences or SQLite) to save survey results locally.

## License

This project is open-source.
