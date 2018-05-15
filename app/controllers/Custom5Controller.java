package controllers;

import play.mvc.*;
import domains.*;
import views.html.*;
import play.libs.Json;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class Custom5Controller extends Controller {

    Car myCar = new Car("Volvo", 4);

    public Result example() {
        return ok(custom5.render(myCar));
    }
}
