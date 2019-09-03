package com.derintester.dailycodingproblems.september2019;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.log4j.Logger;


public class URLEncoding {
	
	private static final Logger logger = Logger.getLogger(URLEncoding.class);

	public static void main(String[] args) throws URISyntaxException {
		String url = "http://www.example.com/something.html?one=1&two=2&three=3&three=3a";
		List<NameValuePair> params = URLEncodedUtils.parse(new URI(url), Charset.forName("UTF-8"));
		for (NameValuePair param : params) {
			logger.debug(param.getName() + " : " + param.getValue());
		}
		
//		just so I can see this...
		
	}

}