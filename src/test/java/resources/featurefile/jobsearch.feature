Feature: Job search Test
  As User I want to do job search in cv.co.uk

  @Smoke
  Scenario Outline: verifyJobSearchResultUsingDifferentDataSet

    Given I am on homepage
    And  I accept cookies
    When  I   enter job title "<jobTitle>"
    And I  enter Location "<location>"
    And I select distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then I should verify the "<result>"


    Examples:
      | jobTitle                  | location | distance | salaryMin | salaryMax | salaryType | jobType   | result                                            |
      | Tester                    | London   | 2        | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in London                   |
      | Software Tester           | London   | 5        | 20000     | 50000     | Per annum  | Permanent | Permanent Software Tester jobs in London          |
      | Test Analyst              | Slough   | 7        | 20000     | 50000     | Per annum  | Contract  | Contract Test Analyst jobs in Slough              |
      | Quality Assurance Manager | London   | 2        | 30000     | 60000     | Per annum  | Contract  | Contract Quality Assurance Manager jobs in London |
      | Test Engineer             | Harrow   | 5        | 45000     | 60000     | Per annum  | Permanent | Permanent Test Engineer jobs in Harrow            |
      | Technical Support         | London   | 7        | 45000     | 60000     | Per annum  | Permanent | Permanent Technical Support jobs in London        |