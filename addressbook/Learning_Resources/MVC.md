# MVC

MVC stands for Model-View-Controller. It's a software architectural pattern commonly used in designing user interfaces and web applications. Here's a quick overview:

 - **Model:** Represents the application's data and business logic. It encapsulates data and provides methods to manipulate that data. The model notifies the controller of any changes in the data.

 - **View:** Represents the presentation layer of the application. It displays data from the model to the user and sends user input to the controller for processing. The view doesn't handle business logic; it only presents data and receives input.

 - **Controller:** Acts as an intermediary between the model and the view. It receives user input from the view, processes it (often involving interactions with the model), and updates the view accordingly. The controller updates the model based on user input or other external events.