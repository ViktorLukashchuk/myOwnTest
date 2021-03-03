package com.test.ui;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static pages.ExpectedList.expectedList;

public class RestAssuredTest {
    private static  final String URL = "http://ergast.com/api/f1/2010/constructors.json";
    private static final int TOTAL_RECORDS = 12;

    @Test
    public void isQuantityOfRecordsCorrect(){

        int result = Integer.parseInt(given().when().get(URL).then().extract().path("MRData.total"));
        Assert.assertTrue(result==TOTAL_RECORDS);
    }

    @Test
    public void isConstructorsEqualToExpectList(){

        List<String> result = given().when().get(URL).then().extract().path("MRData.ConstructorTable.Constructors.constructorId");
        System.out.println(result);
        Assert.assertTrue(result.equals(expectedList()));
    }

    @Test
    public void mercedesValidation(){

        given().when().get(URL).then().assertThat()
                .body("MRData.ConstructorTable.Constructors.constructorId", Matchers.hasItem("mercedes"))
                .body("MRData.ConstructorTable.Constructors.url", Matchers.hasItem("http://en.wikipedia.org/wiki/Mercedes-Benz_in_Formula_One"))
                .body("MRData.ConstructorTable.Constructors.name", Matchers.hasItem("Mercedes"))
                .body("MRData.ConstructorTable.Constructors.nationality", Matchers.hasItem("German"));

    }

    @Test
    public void jsonSchemaValidation(){

        given().when().get(URL).then().assertThat().body(matchesJsonSchemaInClasspath("json_chema.json"));

    }

}
