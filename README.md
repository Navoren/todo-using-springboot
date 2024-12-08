# Todo Application

This is a simple Todo Application built with Spring Boot and Thymeleaf for the backend, and Tailwind CSS for styling.

![image](https://github.com/user-attachments/assets/7a00f32b-4b7d-4138-a581-5c28cba6da9c)

## Setting Up Tailwind CSS

To use Tailwind CSS in this project, follow these steps to install and configure it in the project.

### Prerequisites

Ensure that you have the following installed:

- **Node.js**: [Install Node.js](https://nodejs.org/)
- **npm**: This comes with Node.js, so installing Node.js will automatically install npm.

* **Install Tailwind CSS**:

    Run the following command to install Tailwind CSS and its dependencies as development dependencies:

    ```bash
    npm install -D tailwindcss
    ```

* **Initialize Tailwind CSS**:

    Once Tailwind CSS is installed, initialize a configuration file for Tailwind by running:

    ```bash
    npx tailwindcss init
    ```

    This will generate a `tailwind.config.js` file in your `css` directory.

* **Create the Input and Output CSS Files**:

    Create an `input.css` file inside the `src/main/resources/static/css` directory. This file will contain your Tailwind CSS directives. You can either create it manually or use the following content:

    ```css
    /* input.css */
    @tailwind base;
    @tailwind components;
    @tailwind utilities;
    ```

* **Build the Tailwind CSS**:

    To generate the final `output.css`, use the following command:

    ```bash
    npx tailwindcss -i input.css -o output.css --watch
    ```

    This will compile your Tailwind CSS into the `output.css` file, and the `--watch` flag ensures that the build process updates the `output.css` file when changes are made to `input.css`.
