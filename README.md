## D287 – JAVA FRAMEWORKS
#### CHANGE LIST (prompt, file, line number, change):
- C:
  - Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
    1. Update title  
        - mainscreen.html
        - 19
        - Updated title
- D:
  - Add an About page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the About page and the main screen.
    1. Added a nav menu and CSS 
        - mainscreen.html
        - 13 (CSS), 34 (HTML)
        - CSS used to style the HTML elements as a grid, for a basic nav menu including links to the About page.
    2. Added a nav menu and CSS (continued)
       - about.html
       - 8 (CSS), 36 (HTML)
       - Added same nav menu HTML and CSS to the About page
- E:
  - Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
    1. Added 5 parts and 5 products to the inventory, which only are added when the database size == 0
        - BootStrapData.java
        - 44
- F:
  -  Add a “Buy Now” button to your product list
        1. Added the button to mainscreen and linked to buyProduct function
           - mainscreen.html
           - 106
        2. Created buyProduct() to decrement product inv and return buyproduct.html template
           - AddProductController.java
           - 176
        3. Created success page for buying a product
           - buyproduct.html
           - 0
        4. Created failure page for buying a product
           - failedtobuyproduct.html
           - 0
- G: 
  - Modify the parts to track maximum and minimum inventory
    1. Updated part object with max, min
       - part.java
       - 44, 52
    2. Updated sample inventory with min and max setters
       - BootStrapData.java
       - 51
- H: 
  - Add validation for between or at the maximum and minimum fields.
    1. Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts or greater than the max.
       - InvIsInMinMaxValidator.java & ValidInvIsInMinMax.java
       - 0
       - Creates validators for min/max validation
    2. Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
       - EnufPartsValidator.java
       - 37
- I: 
  - Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
    1. Updated tests with min/max getter and setter tests
       - PartTest.class
       - 101
       - Creates 4 test functions
- J: 
  - Remove the class files for any unused validators in order to clean your code.
    1. Deletes unused validator PartValidator
       - DeletePartValidator.java
       - 0
       - Deletes PartValidator java file since there is no usage of the validator
