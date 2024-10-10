#import "SplashAnimatedPlugin.h"
#import <Cordova/CDV.h>

@implementation SplashAnimatedPlugin

- (void)showSplashAnimated:(CDVInvokedUrlCommand*)command {
    // Lógica para exibir a splash screen animada no iOS
    CDVPluginResult* pluginResult = nil;
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
