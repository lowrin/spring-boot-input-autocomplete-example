package de.jonaspfeifer.autocomplete_example;

public class Country {
  String value;
  String data;

  public Country(String name) {
    this.value = name;
    this.data = "";
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
