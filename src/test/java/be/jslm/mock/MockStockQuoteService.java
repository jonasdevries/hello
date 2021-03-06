package be.jslm.mock;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import be.jslm.service.StockQuoteService;

/**
 * TODO: develop this test when needed in dev 
 * 
 * @author id809201
 */
@RunWith(SpringRunner.class)
@WebMvcTest(StockQuoteService.class)
public class MockStockQuoteService {
	
	private static final Logger log = LoggerFactory.getLogger(MockStockQuoteService.class);
	
	//@MockBean // interface under test
	//private HistoricalStockQuoteService service;
	
	 @Autowired
	 private MockMvc mockMvc;
}	 
	 

/*	 
	@Test
	public void test(){
// http://query.yahooapis.com/v1/public/yql?q=select * from yahoo.finance.historicaldata where symbol in ("BVN") and startDate = "2016-04-15" and endDate = "2016-04-18"&format=json&&env=store://datatables.org/alltableswithkeys&callback=		
//this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello World")));
		
		log.info("request: BVN - TWO_WEEKS");		
		//service.getStockQuote("BVN", Period.TWO_WEEKS);				
		log.info("result:");							
	}		

	    @Test
	    public void shouldReturnDefaultMessage() throws Exception {
	        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
	                .andExpect(content().string(containsString("Hello World")));
	    }	
}
*/
		
/*TODO: handle: http://wiki.fasterxml.com/JacksonInFiveMinutes
"query": {
"results": {
   "quote": [
    {
     "Symbol": "BVN",
     "Date": "2016-04-18",
     "Open": "8.16",
     "High": "8.25",
     "Low": "7.98",
     "Close": "8.01",
     "Volume": "1285300",
     "Adj_Close": "7.990745"
    },{
     "Symbol": "BVN",
     "Date": "2016-04-15",		 		
	}
}
*/