Feature: Search for the product

  Scenario:
    When he calls endpoint "https://api.publicapis.org/entries"
    Then he sees the results displayed for Dogs
    When he calls endpoint "https://api.genderize.io?name=mary"
    Then he sees the results displayed for gender
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/car"
    Then he doesn not see the results
