package io.javabrains.RatingService;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest
@AutoConfigureMockMvc
public class RatingDataServiceApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	UserRating userRating;

	@Test
	public void contextLoads() {
//		assert()
	}

	@Test
	public void test() throws Exception {
//	    RestAssured restAssured;
//		Response response = RestAssured.get("/ratingdata/users/5");
//		System.err.println(response.toString());

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/ratingdata/5").accept(MediaType.APPLICATION_JSON)).andReturn();
		System.err.println(mvcResult.getResponse().getContentAsString());
		assertTrue(mvcResult.getResponse().getContentAsString().contains("{\"movieId\":\"5\",\"rating\":"));
//		assertEquals(mvcResult.getResponse().getContentAsString(),"{\"movieId\":\"5\",\"rating\":3}");
		System.err.println("finished");
//		verify()
	}

	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		assertArrayEquals("failure - byte arrays not same", expected, actual);
	}
	@Test
	public void testAssertEquals() {
		assertEquals("failure - strings are not equal", "text", "text");
	}
	@Test
	public void testAssertFalse() {
		assertFalse("failure - should be false", false);
	}
	@Test
	public void testAssertNotNull() {
		assertNotNull("should not be null", new Object());
	}
	@Test
	public void testAssertNotSame() {
		assertNotSame("should not be same Object", new Object(), new Object());
	}
	@Test
	public void testAssertNull() {
		assertNull("should be null", null);
	}
	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);
		assertSame("should be same", aNumber, aNumber);
	}
	// JUnit Matchers assertThat
//	@Test
//	public void testAssertThatBothContainsString() {
//		assertThat("albumen", both(containsString("a")).and(containsString("b")));
//	}
//	@Test
//	public void testAssertThatHasItems() {
//		assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
//	}
//	@Test
//	public void testAssertThatEveryItemContainsString() {
//		assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
//	}
//	// Core Hamcrest Matchers with assertThat
//	@Test
//	public void testAssertThatHamcrestCoreMatchers() {
//		assertThat("good", allOf(equalTo("good"), startsWith("good")));
//		assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
//		assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
//		assertThat(7, not(CombinableMatcher.&amp;lt;Integer&amp;gt; either(equalTo(3)).or(equalTo(4))));
//		assertThat(new Object(), not(sameInstance(new Object())));
//	}
	@Test
	public void testAssertTrue() {
		assertTrue("failure - should be true", true);
	}
}
