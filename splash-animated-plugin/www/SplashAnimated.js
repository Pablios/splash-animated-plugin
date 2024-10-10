var exec = require('cordova/exec');

exports.showSplashAnimated = function(success, error) {
    exec(success, error, "SplashAnimatedPlugin", "showSplashAnimated", []);
};
