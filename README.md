# Assignment_RCBTeam

<h2>Problem to Solve:</h2>
<ul>
<li> Write test to validate that the team has only 4 foreign players</li>
<li> Write test to validate that their is atleast 1 wicket keeper </li>
 
## Software Dependencies

<table>
  <thead align="left">
    <tr border: 2 px;>
      <td><b>Dependency</b></td>
      <td><b>Version</b></td>
      <td><b>Feature</b></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Java</b></td>
      <td><b>1.8</b></td>
      <td><b>Programming languages</b></td>
    </tr>
    <tr>
      <td><b>TestNG</b></td>
      <td><b>6.14.3</b></td>
      <td><b>Test Runner to execute suite</b></td>
    </tr>
    <tr>
      <td><b>JSON Simple</b></td>
      <td><b>1.1.1</b></td>
      <td><b>Create & Parse JSON Files for API</b></td>
    </tr>
    <tr>
      <td><b>Extent Reports</b></td>
      <td><b>3.1.5</b></td>
      <td><b>The HTML reporting library</b></td>
    </tr>
  </tbody>
</table>

<h2>Project Setup </h2>
<ul>
<li>Created a Maven project added dependencies for JSon-Simple, TestNG, Extend Report in POM. XML</li>
<li>Folder Structure  :</li>
<li>Under src/test/resources->testdata->added "TeamRCB" json File</li>
<li>Under src/main/java->com.rcbteam.utility->Created Interface "ReadTestData.java" class</li>
<li>Under src/main/java->com.rcbteam.utils->Created reporter class implementation of extent reports  "Reporter.java" class</li>
	
	
	
<h2>TestNG Execution</h2>
<li>Under src/test/java->"com.rcbteam.testcases" package-> has testcases class using that testng.xml file is generated</li>
<li>"ValidateOverseasPlayers.java"- To Validate the team has only 4 foreign players</li>
<li>"ValidateWicketKeeper.java"- To Validate there is at least 1 wicket keeper</li>
<li>testng.xml --> contains tests details and parallel execution attribute set</li>
<li>Report-->/test-output/emailable-report.html</li>


<h2>Command Line Execution</h2>
<li>Navigate to project directory(./TestVagrant_Assessment) and execute "mvn clean test"</li>
<li>Note: make sure Java and maven are installed in the machine</li>
</ul> 


<h2>Scope to optimisation</h2>
<li>using Lombok Annotations to get the values from the JSON intead of using simple JSONObject"</li>
<li>creating a POJO class </li>
<li>Cucumber can be implemented to have a BDD approach demonstration</li>
<li>Note: Made use of JSONObject as the response body is provided</li>
</ul> 
