package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class Custom2Controller extends Controller {


    // Literally just returns the string you've sent as a parameter.
    public Result example(String teststring) {
        return ok(teststring);
    }

}
