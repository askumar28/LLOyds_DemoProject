package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {
	
	@Test
	public void test_numberOfCircuitsFor2017_Season(){
		
		given().
		when().
		get("http://ergast.com/api/f1/2017/circits.json").
		then().
		assertThat().
		statusCode(200).
		and().
		body("MRData.CircuitTable.Circuits.circuitID", hasSize(20)).
		and().
		header("content-lenght", equalTo("4551"));
		
	}

}
