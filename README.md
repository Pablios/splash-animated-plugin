# Splash Animated Plugin

## Description

The **Splash Animated Plugin** is a Cordova plugin that enables you to display a custom animation on your application's splash screen. Currently, the plugin is in the initial development phase and may undergo changes and improvements over time.

## Status

**Development Status**: This plugin is still under development. Additional features and bug fixes will be implemented in future versions.

## Installation

### Prerequisites

- Cordova installed on your machine
- An existing Cordova project

### Installing the Plugin

1. Clone or download the plugin repository.
2. Navigate to your Cordova project directory.
3. Run the following command to add the plugin:

   ```bash
   cordova plugin add ../splash-animated-plugin
   ```

## Usage

After installation, add the following code to your `index.js` file:

```javascript
document.addEventListener('deviceready', onDeviceReady, false);

function onDeviceReady() {
    // Check if the plugin is available
    if (typeof SplashAnimated !== 'undefined') {
        console.log('SplashAnimated Plugin is available!');
        
        // Try to show the animated splash
        SplashAnimated.show(
            function() {
                console.log('Splash animation displayed successfully!');
            },
            function(err) {
                console.error('Failed to display the splash animation:', err);
            }
        );
    } else {
        console.error('SplashAnimated Plugin is not available.');
    }
}
```

## Contributing

Contributions are welcome! If you would like to contribute to the development of this plugin, please follow these steps:

1. Fork this repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b my-new-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m 'Adding a new feature'
   ```
4. Push to the remote repository:
   ```bash
   git push origin my-new-feature
   ```
5. Open a Pull Request.

## License

This project is licensed under the MIT License.
