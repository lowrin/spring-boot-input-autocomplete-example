package de.jonaspfeifer.autocomplete_example;


import java.util.List;

/**
 * Created by jonaspfeifer on 07.05.17.
 */
public class SuggestionWrapper {

  List<Country> suggestions;

  public List<Country> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<Country> suggestions) {
    this.suggestions = suggestions;
  }
}
