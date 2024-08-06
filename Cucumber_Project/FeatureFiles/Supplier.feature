@tag
Feature: 
  As a admin user validate Supplier creation with multiple data

  @SupplierTest
  Scenario Outline: 
    As Admin user Add supplier

    Given Launch Browser
    When Launch Url "http://webapp.qedgetech.com/"
    When wait for username with "name" and "username"
    When Enter username with "name" and "username" and  "admin"
    When Enter password with "id" and "password" and  "master"
    When click login button with "xpath" and "//button[@id='btnsubmit']"
    When wait for Supplierlink with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
    When click Supplierlink with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
    When wait for Add+icon with "xpath" and "(//span[@data-caption='Add'])[1]"
    When click Add+icon with "xpath" and "(//span[@data-caption='Add'])[1]"
    When wait for Suppliernumber with "name" and "x_Supplier_Number"
    When capture Suppliernumber with "name" and "x_Supplier_Number"
    When Enter in "<SupplierName>" with "id" and "x_Supplier_Name"
    When Enter in "<Address>" with "xpath" and "//*[@id='x_Address']"
    When Enter in "<City>" with "xpath" and "//*[@id='x_City']"
    When Enter in "<Country>" with "xpath" and "//*[@id='x_Country']"
    When Enter in "<Cperson>" with "xpath" and "//*[@id='x_Contact_Person']"
    When Enter in "<Pnumber>" with "xpath" and "//*[@id='x_Phone_Number']"
    When Enter in "<Mail>" with "xpath" and "//*[@id='x__Email']"
    When Enter in "<Mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']"
    When Enter in "<Note>" with "xpath" and "//*[@id='x_Notes']"
    When click on Add button after adding notes with "id" and "btnAction"
    When wait for ok button with "xpath" and "//button[contains(text(),'OK!')]"
    When click ok button with "xpath" and "//button[contains(text(),'OK!')]"
    When wait for Alert button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
    When click Alert button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
    Then user validate SupplierTable
    When user closes the browser

    Examples: 
      | SupplierName | Address   | City       | Country | Cperson    | Pnumber    | Mail            | Mnumber    | Note              |
      | Laptops      | Ameerpet  | Hyderabad3 | India   | Prashanth3 | 9876502345 | temp@gmail.com  | 8765675035 | Supplying laptops |
      | mobiles      | Ameerpet3 | Hyderabad  | India   | Prashanth6 | 9876592345 | temp8@gmail.com | 8765678435 | Supplying mobiles |
      | clothes      | Ameerpet6 | Hyderabad6 | India   | Prashanth9 | 9876562345 | temp@9gmail.com | 8765676435 | Supplying clothes |
