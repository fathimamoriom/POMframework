Feature: Automation Leaftaps Application

@smoke
Scenario Outline: TC001_Login and Logout

    Given Launch Chrome Browser and load url
    And Enter Username as <username>
    And Enter Password as <password>
    When Click the Login Button
    Then Its navigate homepage
    And Click the Logout Button 
    And Close Browser
    
    Examples: 
    
    	|username|password|   
    	|DemoSalesManager|crmsfa|
    	|DemoCSR|crmsfa| 
  @smoke
Scenario: TC002_Login and Logout for failure
   
   	Given Launch Chrome Browser and load url
    And Enter Username as DemoSales
    And Enter Password as crmsfa
    When Click the Login Button
    Then its navigate samepage 
    But verify error message
    And Close Browser 
    
 Scenario Outline: TC003_CreateLead 
 
    Given Launch Chrome Browser and load url
    And Enter Username as DemoSalesManager
    And Enter Password as crmsfa
    And Click the Login Button
    And Click CRMSFA Link
    And Click Leads Link
    When Click CreateLead 
    And Enter the company Name As <company>
    And Enter the firstname as <firstname>
    And Enter the lastname as <lastname>
    And Choose source website 
    And Click the CreateLead button 
    Then its navigated viewLeadpage
    And verify the firstname 
    And Close Browser
    
    Examples: 
    
    |company|firstname|lastname|
    |TCS|Hema|Mali|
    |ABC|Raj|Kumar|
    |XYZ|Gopi|Nath|
    
    Scenario: TC004_EditLead
    
    Given Launch Chrome Browser and load url
    And Enter Username as DemoSalesManager
    And Enter Password as crmsfa
    And Click the Login Button
    And Click CRMSFA Link
    And Click Leads Link
    When Click Find Leads Button
    And Enter firstname
    And Click Find Leads Button
    And Click first resulting lead
    Then its navigated viewLeadpage
    And verify title of the page
    And Click on edit
    Then its navigated edit lead page
    And Change the company name 
    And Click update
    And confirm changed name appears
    And Close Browser
    
    Scenario: TC005_DeleteLead
    
    Given Launch Chrome Browser and load url
    And Enter Username as DemoSalesManager
    And Enter Password as crmsfa
    And Click the Login Button
    And Click CRMSFA Link
    And Click Leads Link
    When Click Find Leads Button
    And Click on phone
    And Enter phone number
    And Click Find Leads Button
    And Capture lead ID of first resulting lead
    And Click first resulting lead
    And Click delete
    Then its navigated MyLeadsPage
    And Click Find Leads Button
    And Enter captured lead ID
    And verify error message
    And Close Browser 
    
    
    
    
    
     
     
    
    
    


    
    
    

