package practice.filehandling;

/*This example uses StringTokenizer. This class is used to parse the text entered into a search box on a web page.
It returns a Set of tokens to be used for pattern matching. Here, any text appearing in quotes is treated as a single
search token. All other text is split into tokens based simply on whitespace.*/


import java.util.*;

/**
* The user enters text into a search box. This class is used
* to parse that text into specific search terms (or tokens).
* It eliminates common words, and allows for the quoting of text, using
* double quotes.
* JDK 7+.
*/
public final class SearchBoxParser {

public static void main(String... aArguments) {
    SearchBoxParser parser = new SearchBoxParser("mars venus \"milky way\" sun");
    Set<String> tokens = parser.parseSearchText();
//display the tokens
    System.out.println(tokens);
  }

/**
  * @param aSearchText is non-null, but may have no content,
  * and represents what the user has input in a search box.
  */
public SearchBoxParser(String aSearchText) {
if (aSearchText == null) {
throw new IllegalArgumentException("Search Text cannot be null.");
    }
    fSearchText = aSearchText;
  }

/**
  * Parse the user's search box input into a Set of String tokens.
  *
  * @return Set of Strings, one for each word in fSearchText; here "word"
  * is defined as either a lone word surrounded by whitespace, or as a series
  * of words surrounded by double quotes, "like this"; also, very common
  * words (and, the, etc.) do not qualify as possible search targets.
  */
public Set<String> parseSearchText() {
    Set<String> result = new LinkedHashSet<>();

boolean returnTokens = true;
    String currentDelims = fWHITESPACE_AND_QUOTES;
    StringTokenizer parser = new StringTokenizer(
      fSearchText, currentDelims, returnTokens
    );

    String token = null;
while (parser.hasMoreTokens()) {
      token = parser.nextToken(currentDelims);
if (!isDoubleQuote(token)){
        addNonTrivialWordToResult(token, result);
      }
else {
        currentDelims = flipDelimiters(currentDelims);
      }
    }
return result;
  }

// PRIVATE 
private String fSearchText;
private static final Set<String> fCOMMON_WORDS = new LinkedHashSet<>();
private static final String fDOUBLE_QUOTE = "\"";

//the parser flips between these two sets of delimiters
private static final String fWHITESPACE_AND_QUOTES = " \t\r\n\"";
private static final String fQUOTES_ONLY ="\"";

/**Very common words to be excluded from searches.*/
static {
    fCOMMON_WORDS.add("a");
    fCOMMON_WORDS.add("and");
    fCOMMON_WORDS.add("be");
    fCOMMON_WORDS.add("for");
    fCOMMON_WORDS.add("from");
    fCOMMON_WORDS.add("has");
    fCOMMON_WORDS.add("i");
    fCOMMON_WORDS.add("in");
    fCOMMON_WORDS.add("is");
    fCOMMON_WORDS.add("it");
    fCOMMON_WORDS.add("of");
    fCOMMON_WORDS.add("on");
    fCOMMON_WORDS.add("to");
    fCOMMON_WORDS.add("the");
  }

/**
  * Use to determine if a particular word entered in the
  * search box should be discarded from the search.
  */
private boolean isCommonWord(String aSearchTokenCandidate){
return fCOMMON_WORDS.contains(aSearchTokenCandidate);
  }

private boolean textHasContent(String aText){
return (aText != null) && (!aText.trim().equals(""));
  }

private void addNonTrivialWordToResult(String aToken, Set<String> aResult){
if (textHasContent(aToken) && !isCommonWord(aToken.trim())) {
      aResult.add(aToken.trim());
    }
  }

private boolean isDoubleQuote(String aToken){
return aToken.equals(fDOUBLE_QUOTE);
  }

private String flipDelimiters(String aCurrentDelims){
    String result = null;
if (aCurrentDelims.equals(fWHITESPACE_AND_QUOTES)){
      result = fQUOTES_ONLY;
    }
else {
      result = fWHITESPACE_AND_QUOTES;
    }
return result;
  }
} 
