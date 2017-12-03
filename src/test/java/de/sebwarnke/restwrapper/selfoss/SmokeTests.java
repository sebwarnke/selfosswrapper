package de.sebwarnke.restwrapper.selfoss;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sebwarnke.restwrapper.selfoss.SelfossWrapper;
import de.sebwarnke.restwrapper.selfoss.model.Article;

public class SmokeTests {

  private Logger log = LoggerFactory.getLogger(SmokeTests.class);

  @Test
  public void testGetArticles() {

    SelfossWrapper selfossWrapper = new SelfossWrapper();
    List<Article> articles = selfossWrapper.getArticles();

    Assert.assertFalse(articles.isEmpty());

    articles.forEach(article -> {
      log.debug(article.toString());
    });
  }
}
