@MyntraFeature
Feature: Myntra Home page buttons

  @MyntraScenario
  Scenario Outline: Validate home page buttons.
    Given User is on home page
    When User clicks on Categories One
    When User clicks Studio <index> Two
    When User clicks on Explore Three
    When User clicks on Profile Four
    And User clicks on Home Five
    Then Verify Explore button
    Examples:
      | index |
      | 0     |

  Scenario Outline: Validate home page buttons.
    Given User is on home page
    When User clicks on Categories One
    When User clicks Studio <index> Two
    When User clicks on Explore Three
    When User clicks on Profile Four
    And User clicks on Home Five
    Then Verify Explore button
    Examples:
      | index |
      | 0     |
      | 1     |

  @MyntraScenario2
  Scenario:Validate Jeans FlyingMachine
    Given User is on home page
    When User hovers on Men and clicks on Jeans
    And User filters on FLying Machine brand
    Then Verify Jeans brand Flying Machine

  @MyntraScenario3
  Scenario Outline: Validate PumaShoes after filtering all
    Given User is on home page
    When User enters "<text>" in searchbox
    And clicks on search icon
    Then products should be displayed
    When User filters search results
    And clicks first product
    And adds it to cart
    Then product should be added to cart
    Examples:
      | text       |
      | Puma Shoes |