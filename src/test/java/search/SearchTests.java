package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultsPage;

public class SearchTests extends BaseTests {
    @Test
    public void testSuccessfulSearch(){
        searchPage.setSearchWord("smart");
        SearchResultsPage searchResultsPage = searchPage.clickSearchButton();


    }
}
