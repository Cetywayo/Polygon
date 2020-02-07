/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Tracking.HistoricalTracking;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import static KeywordDrivenTestFramework.Monitor.FleetAdmin.AddEditPassenger.DropDownXpath;
import static KeywordDrivenTestFramework.Monitor.FleetAdmin.ExportAssets.MonitorXpath;
import KeywordDrivenTestFramework.Testing.TestMarshall;
import static KeywordDrivenTestFramework.Tracking.HistoricalTracking.AddLocation.ConfirmRemoveXpath;
import static KeywordDrivenTestFramework.Tracking.HistoricalTracking.AddLocation.SaveXpath;
import static KeywordDrivenTestFramework.Tracking.HistoricalTracking.AddLocation.manageLocationsMenuXpath;
import static java.lang.System.err;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AnelisiweC
 */
public class AddPolylineLocation extends BaseClass {
    String errorMessage;
    int counter = 1;
    TestEntity testData;
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
    
    public AddPolylineLocation(TestEntity testData)
    {
        this.testData = testData;
    }
    public TestResult executeTest() throws InterruptedException
    {
         this.setStartTime();
        if(!ClickMonitorTab())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Click Monitor", true);
            counter++;
            narrator.failedMessage("Failed to click Monitor tab - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Monitor tab", this.getTotalExecutionTime());
        }
        
        SeleniumDriverInstance.pause(2000);
        if(!ClickHistoricalTracking())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Click Historical tracking", true);
            counter++;
            narrator.failedMessage("Failed to click Historical tracking tab - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Historical tracking tab", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        if(!CreateLocation())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Click Create locations", true);
            counter++;
            narrator.failedMessage("Failed to click Create locations button - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Create locations button", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        
        if(!DrawLocation())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        
        if(!clickP(1342, 315))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        
        if(!clickP(1381, 335))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
        
        SeleniumDriverInstance.pause(2000);
        
        if(!clickP(1392, 315))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
         SeleniumDriverInstance.pause(2000);
         
           if(!clickP(1415, 347))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
         SeleniumDriverInstance.pause(2000);
         
           if(!clickP(1420, 287))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
         SeleniumDriverInstance.pause(2000);
          if(!clickP(1422, 318))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
           SeleniumDriverInstance.pause(2000);
        
            if(!clickP(1454, 296))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
           SeleniumDriverInstance.pause(2000);
           
           if(!clickP(1454, 296))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Draw location", true);
            counter++;
            narrator.failedMessage("Failed to Draw location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Draw location", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
         if(!EnterLocationName())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Enter locations name", true);
            counter++;
            narrator.failedMessage("Failed to Enter locations name - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Enter locations name", this.getTotalExecutionTime());
        }
//         SeleniumDriverInstance.pause(2000);
//        if(!LocationType())
//        {
//            SeleniumDriverInstance.takeScreenShot(counter + " - Choose location type", true);
//            counter++;
//            narrator.failedMessage("Failed to choose location type - "+ errorMessage);
//            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to choose location type", this.getTotalExecutionTime());
//        }
        SeleniumDriverInstance.pause(2000);
        if(!Site())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Choose Site", true);
            counter++;
            narrator.failedMessage("Failed to choose Site - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to choose Site", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        if(!LocationColor())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Choose location color", true);
            counter++;
            narrator.failedMessage("Failed to choose location color - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to choose location color", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(3000);
        if(!Save())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Click save", true);
            counter++;
            narrator.failedMessage("Failed to click Save - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Save", this.getTotalExecutionTime());
        }
//        SeleniumDriverInstance.pause(2000);
//        if(!MapLayers())
//        {
//            SeleniumDriverInstance.takeScreenShot(counter + " - Click Map layers", true);
//            counter++;
//            narrator.failedMessage("Failed to click map layers - "+ errorMessage);
//            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click map layers", this.getTotalExecutionTime());
//        }
//        SeleniumDriverInstance.pause(3000);
//        if(!LocationLabels())
//        {
//            SeleniumDriverInstance.takeScreenShot(counter + " - Click Location labels", true);
//            counter++;
//            narrator.failedMessage("Failed to click Location labels - "+ errorMessage);
//            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Location labels", this.getTotalExecutionTime());
//        }
//        SeleniumDriverInstance.pause(2000);
//        if(!Verify())
//        {
//            SeleniumDriverInstance.takeScreenShot(counter + "- Verifying", true);
//            counter++;
//            narrator.failedMessage("Failed to Verify");
//            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Verify", this.getTotalExecutionTime());
//        }
        SeleniumDriverInstance.pause(2000);
        if(!ClickMonitorTab())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Click Monitor", true);
            counter++;
            narrator.failedMessage("Failed to click Monitor tab - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Monitor tab", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        if(!ClickManageLocations())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Click Manage locations", true);
            counter++;
            narrator.failedMessage("Failed to click Manage locations tab - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Manage locations tab", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        if(!MainFilter())
        {
            SeleniumDriverInstance.takeScreenShot(counter + "- Failed filter location", true);
            counter++;
            narrator.failedMessage("filtering location - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "filtering location", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        if(!DropDown())
        {
            SeleniumDriverInstance.takeScreenShot(counter + "- Failed to click Dropdown", true);
            counter++;
            narrator.failedMessage("Click Dropdown - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Click Dropdown", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        if(!Remove())
        {
            SeleniumDriverInstance.takeScreenShot(counter + "- Failed to click Remove", true);
            counter++;
            narrator.failedMessage("Click Remove - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Click Remove", this.getTotalExecutionTime());
        }
        SeleniumDriverInstance.pause(2000);
        if(!ConfirmRemove())
        {
            SeleniumDriverInstance.takeScreenShot(counter + "- Failed to click Confirm Remove", true);
            counter++;
            narrator.failedMessage("Click Confirm Remove - "+ errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Click Confirm Remove", this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Navigated and Validated Historical tracking ", this.getTotalExecutionTime());
    }
    /**
    * Navigates to Monitor tab.
    *
    * @return True or False
    */
    public boolean ClickMonitorTab()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.clickElementByXpath(MonitorXpath()))
        {
            errorMessage = "Failed to find Monitor Tab";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation to Monitor Tab", false);
        counter++;
        return true;
    }
    public boolean ClickHistoricalTracking()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.clickElementByXpath(HistoricalTrackingXpath()))
        {
            errorMessage = "Failed to click Historical tracking tab";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation to Historical tracking Tab", false);
        counter++;
        return true;
    }
    public boolean CreateLocation()
    {
       /* if(currentEnvironment == Enums.Environment.ENT || currentEnvironment == Enums.Environment.UK || currentEnvironment == Enums.Environment.CPT)
        {
            pause(5000);
        }*/
        //SeleniumDriverInstance.pause(5000);
//        String text = SeleniumDriverInstance.retrieveTextByXpath("//tr[contains(@class, 'light')]//th");
//        while(!text.contains("Events")){
//            pause(2000);
//            text = SeleniumDriverInstance.retrieveTextByXpath("//tr[contains(@class, 'light')]//th");
//        }
//        SeleniumDriverInstance.CheckIfElementDisplayedByXpath("");
        if(!SeleniumDriverInstance.clickElementByXpath(CreateLocationXpath()))
        {
            errorMessage = "Failed to click Create locations button";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation to create locations button", false);
        counter++;
        return true;
    }
    public boolean DrawLocation()
    {
        //SeleniumDriverInstance.pause(5000);
        if(!SeleniumDriverInstance.clickElementByXpathUsingActions("//i[@class='icon-shape-line']"))
        {
            err.println("[ERROR] Failed to click circle shape");
            return false;
        }
        
        //Validate that mouse in plus mode and drag and draw label
//        if(!SeleniumDriverInstance.CheckIfElementDisplayedByXpath(ClickDragAndDrawLabelXpath())){
//            //SeleniumDriverInstance.pause(2000);
//            return false;}
//        
//        if(!SeleniumDriverInstance.DragAndDropElementByRobotAndOffset(1130, 312,1130, 385))
//        {
//            err.println("[Error] Failed to draw location on map");
//            return false;
//        }
        return true;
    }
    
    
    
    
     public boolean EnterLocationName()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.enterTextByXpath(inputLocationNameXpath(), dateFormat.format(date)+"_MiX Location"))
        {
            errorMessage = "Failed to Enter Location name";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Enter Location name", false);
        counter++;
        return true;
    }
    public boolean LocationType()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath(LocationTypeXpath(),"Fuel stop"))
        {
            errorMessage = "Failed to Choose Location Type";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Choose Location Type", false);
        counter++;
        return true;
    }
    public boolean Site()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath(SiteXpath(),"Default Site"))
        {
            errorMessage = "Failed to wait for site";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Choose Site", false);
        counter++;
        return true;
    }
    public boolean LocationColor()
    {

        if(!SeleniumDriverInstance.clickElementByXpath(LocationColorXpath()))
        {
            errorMessage = "Failed to Choose Location Color";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Choose Location Color", false);
        counter++;
        return true;
    }
    public boolean Save()
    {
        //SeleniumDriverInstance.pause(2000);
        if(!SeleniumDriverInstance.clickElementByXpath(SaveXpath()))
        {
            errorMessage = "Failed to save location";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Click Save", false);
        return true;
    }
    public boolean Location()
    {
        
        if(!SeleniumDriverInstance.clickElementByXpath(LocationXpath()))
        {
            errorMessage = "Failed click location";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Click location", false);
        counter++;
        return true; 
    }
    public boolean Filter()
    {
        if(!SeleniumDriverInstance.enterTextByXpath(FilterXpath(),dateFormat.format(date)+"_MiX Location"))
        {
            errorMessage = "Failed to enter Click Filter Box";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Filter Location", false);
        counter++;
        return true; 
    }
    public boolean CheckBox()
    {
        if(!SeleniumDriverInstance.clickElementByXpath(CheckBoxXpath()))
        {
            errorMessage = "Failed click checkbox";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Check new Location", false);
        counter++;
        return true; 
    }
    public boolean Select()
    {

        if(!SeleniumDriverInstance.clickElementByXpath(SelectXpath()))
        {
            errorMessage = "Failed click select";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Click select", false);
        counter++;
        return true; 
    }
    public boolean MapLayers()
    {
        
        if(!SeleniumDriverInstance.clickElementByXpath(ButtonLayerXpath()))
        {
            errorMessage = "Failed click Map Layers";
            return false;
        }
        //SeleniumDriverInstance.pause(5000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Click Map Layers", false);
        counter++;
        return true; 
    }
    public boolean LocationLabels()
    {

        if(!SeleniumDriverInstance.clickElementByXpath(LocationLabelXpath()))
        {
            errorMessage = "Failed click Location Label";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@type='button'][text()='Save']");
        SeleniumDriverInstance.pause(3000);
//        SeleniumDriverInstance.clickElementByXpath("//A[@class='leaflet-control-zoom-in'][text()='+']");
        SeleniumDriverInstance.takeScreenShot(counter + " - Click Location Label and save", false);
        counter++;
        return true; 
    }
    public boolean Verify()
    {
        //SeleniumDriverInstance.pause(5000);
        String location = SeleniumDriverInstance.retrieveTextByXpath("(//*[@class='leaflet-clickable'][text()='"+dateFormat.format(date)+"_MiX Location'])[1]");
        if(location.contains(dateFormat.format(date)+"_MiX Location"))
        {
            System.out.println("[INFO] Location is shown on the map");
            //SeleniumDriverInstance.pause(2000);
            SeleniumDriverInstance.takeScreenShot(counter + " - Location is shown on the map", false);
            counter++;
            testData.extractParameter("Extracted Data ", "Location name: "+location, "Pass");
            return true;
        }
        else
        {   
            //SeleniumDriverInstance.pause(2000);
            errorMessage = "No location shown";
            System.out.println("[INFO] No location shown on the map");
            //SeleniumDriverInstance.pause(2000);
            SeleniumDriverInstance.takeScreenShot(counter + " - Location is not shown on the map", false);
            counter++;
            testData.extractParameter("Extracted Data ", "Location name: "+location, "Fail");
            return false;
        }
    }
    public boolean ClickManageLocations()
    {
        //SeleniumDriverInstance.pause(2000);
        if(!SeleniumDriverInstance.clickElementByXpath(manageLocationsMenuXpath()))
        {
            errorMessage = "Failed to click Manage locations tab";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation to Manage locations Tab", false);
        counter++;
        return true;
    }
    public boolean MainFilter()
    {   //SeleniumDriverInstance.pause(2000);
        if(!SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]",dateFormat.format(date)+"_MiX Location"))
        {
            errorMessage = "Failed to enter Click Filter Box";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Filter Location", false);
        counter++;
        return true; 
    }
    public boolean DropDown()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.clickElementByXpath(DropDownXpath()))
        {
            errorMessage = "Failed to click action menu";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Action menu", false);
        counter++;
        return true; 
    }
     public boolean Remove()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.clickElementByXpath("(//i[@class='icon icon-remove-sign icon-red'])[1]"))
        {
            errorMessage = "Failed to Remove";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Remove clicked ", false);
        counter++;
        return true;
    }
    public boolean ConfirmRemove()
    {
        //SeleniumDriverInstance.pause(1000);
        if(!SeleniumDriverInstance.clickElementByXpath(ConfirmRemoveXpath()))
        {
            errorMessage = "Failed to Confirm Remove";
            return false;
        }
        //SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot(counter + " - Confirm Remove clicked ", false);
        counter++;
        return true;
    }
    public boolean clickP( int x, int y){
        if(!SeleniumDriverInstance.waitForElementByXpath("//div[@id='map-container']")){
            errorMessage = "Failed";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpathRobot("//div[@id='map-container']",x,y);
        SeleniumDriverInstance.takeScreenShot("Successfuly", false);
        counter++;
        return true;
        
    }
    
    
//     public boolean clickP1( int x, int y){
//        if(!SeleniumDriverInstance.waitForElementByXpath("//div[@id='map-container']")){
//            errorMessage = "Failed";
//            return false;
//        }
//        SeleniumDriverInstance.clickElementByXpathRobot("//div[@id='map-container']",x,y);
//        SeleniumDriverInstance.takeScreenShot("Successfuly", false);
//        counter++;
//        return true;
//        
//    }

    public String MapXpath()
    {
        if(TestMarshall.currentEnvironment == Enums.Environment.INT)
        {
            return "//*[@id=\"map\"]/div[1]/div[1]/div[2]/div[2]/img[2]";
        }
        if(TestMarshall.currentEnvironment == Enums.Environment.CONFIG)
        {
            return "//*[@id=\"map\"]/div[2]/div[3]";
        }
        else{
            return "//*[@id=\"map\"]/div[1]/div[1]/div/div[2]/img[13]";
        }
    }

    
    
   
    
    public static String HistoricalTrackingXpath() 
    {
        return "//a[text()='Historical tracking']";
    }
    public static String CreateLocationXpath()
    {
        return "(//A[@class='btn btn-small'])[1]";
    }
     public static String inputLocationNameXpath()
    {
        return "(//INPUT[@type='text'])[3]";
    }
    public static String LocationColorXpath()
    {
        return "(//A[@class='pull-left colour-picker ng-scope'])[2]";
    }
    public static String LocationTypeXpath()
    {
        return "//SELECT[@class='span12 ng-pristine ng-valid ng-valid-dmx-required']";
    }
    public static String SiteXpath()
    {
        return "//select[@name='siteId']";
    }
    public static String LocationXpath()
    {
        return "(//A[@class='btn selection-btn pull-left'])[3]";
    }
    public static String FilterXpath()
    {
        return "(//INPUT[@type='text'])[14]";
    }
    public static String CheckBoxXpath()
    {
        return "(//INPUT[@type='checkbox'])[11]";
    }
    public static String SelectXpath()
    {
        return "//BUTTON[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Select']";
    }
    public static String ButtonLayerXpath()
    {
        return "//A[@id='btn-layers']";
    }
    public static String LocationLabelXpath()
    {
        return "//SPAN[@ng-class='mapping.cssClass'][text()='Location labels']";
    }
}

