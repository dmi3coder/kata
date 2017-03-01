package io.github.dmi3coder;

import static spark.Spark.*;

import java.util.Date;

/**
 * Created by dim3coder on 3/1/17.
 */
public class RestServer {

  public static void main(String[] args) {
    get("/hello", (req, res) -> "Hello World");
    get("/time", (req, res) -> new Date().toString());
    get("/math/compute/:a/:b",(request, response) -> {
      String aString = request.params(":a");
      String bString = request.params(":b");
      int value = Integer.valueOf(aString)+Integer.valueOf(bString);
      return value+"";
    });
  }
}
