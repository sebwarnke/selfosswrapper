package de.sebwarnke.restwrapper.selfoss;

import java.util.ArrayList;
import java.util.List;

import com.camunda.consulting.simplerestclient.RestClient;
import com.camunda.consulting.simplerestclient.request.Request;
import com.camunda.consulting.simplerestclient.response.ResponseWithBody;

import de.sebwarnke.restwrapper.selfoss.model.Article;

public class SelfossWrapper {

  private RestClient restClient;
  
	public SelfossWrapper() {
	  restClient = new RestClient("https://reader.halephan.com");
	}
	
	public List<Article> getArticles() {
	  List<Article> result = new ArrayList<Article>();
	  
	  Request request = restClient.newRequest("items");
	  ResponseWithBody<Article> response = restClient.get(request, Article.class);
	  
	  result = response.getResults();
	  return result;
	}
}
