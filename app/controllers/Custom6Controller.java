package controllers;

import play.mvc.*;
import domains.*;
import views.html.*;
import play.libs.Json;
import com.google.inject.Inject;
import play.data.DynamicForm;
import play.data.FormFactory;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class Custom6Controller extends Controller {

    private final FormFactory formFactory;

    @Inject
    public Custom6Controller(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    Car myCar = new Car("Volvo", 4);

    public Result example() {
        return ok(custom6.render(myCar));
    }

    public Result loginSubmit(){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        myCar.setBrand(requestData.get("brand"));
        myCar.setTires(Integer.parseInt(requestData.get("tires")));
        return ok(custom7.render(myCar));
    }

}
