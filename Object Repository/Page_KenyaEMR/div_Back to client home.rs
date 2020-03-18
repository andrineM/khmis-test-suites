<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Back to client home</name>
   <tag></tag>
   <elementGuidId>68f2cbd9-8523-4722-9e18-51013936565c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Current visit'])[1]/following::div[5]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>ui-tabs-panel ui-widget-content</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

                
                    
                        Back to client home
                    
                     Lab Orders
                
                
                

                
                    
                        Active Order(s)

                        Create New Order(s)

                        Enter Lab Result(s)
                        Previous Lab Order(s)

                    

                    

                        
                            
                                
                                    Create New Order(s)
                                
                            

                            
                                
                                    


                                        
                                            
                                                
                                                    
                                                        
                                                            
                                                                
                                                                    Blood
                                                                
                                                            

                                                        
                                                            
                                                                
                                                                    Stool
                                                                
                                                            

                                                        
                                                            
                                                                
                                                                    Urine
                                                                
                                                            

                                                        
                                                            
                                                                
                                                                    Histology/Cytology
                                                                
                                                            

                                                        
                                                            
                                                                
                                                                    Sputum
                                                                
                                                            

                                                        
                                                    
                                                

                                                
                                                    
                                                        
                                                            
                                                                Selected Order(s)
                                                            
                                                        

                                                        
                                                            None

                                                            
                                                                
                                                            
                                                        
                                                    
                                                
                                            
                                            
                                                
                                                    
                                                        Panels | 

                                                        
                                                            
                                                                
                                                                    
                                                                
                                                            

                                                        

                                                    
                                                

                                                
                                                    
                                                        Tests | 

                                                        
                                                            
                                                                
                                                            
                                                        
                                                    
                                                

                                            

                                        
                                    

                                    
                                        
                                            Confirm
                                    

                                
                            



                        



                    

                    

                        
                            
                                
                                    
                                        
                                            
                                                
                                                    
                                                        Enter Lab Result(s)
                                                    
                                                

                                                
                                                    No Lab orders to enter results for
                                                    
                                                        

                                                            

                                                            

                                                            

                                                            


                                                            
                                                                
                                                                    HIV viral load:
                                                                          (09-10-2019)
                                                                        

                                                                    
                                                                        


                                                                        
                                                                        
                                                                        

                                                                    
                                                                        


                                                                        
                                                                        LDL
                                                                        

                                                                    


                                                                
                                                            


                                                        

                                                    

                                                

                                                
                                                    
                                                          Save
                                                
                                            
                                        

                                    
                                
                            
                        
                    


                    

                        
                            
                                
                                    
                                        Active Lab Order(s)
                                    
                                

                                
                                    No active lab orders
                                    
                                        
                                            
                                                Order Date
                                                Order No
                                                Test Name
                                                Ordered By
                                                Actions
                                            
                                            
                                                
                                                    09-10-2019
                                                
                                                
                                                    ORD-1334
                                                
                                                
                                                    HIV VIRAL LOAD

                                                
                                                
                                                    admin - ONGAYA ONGAYA ONGAYA

                                                
                                                
                                                    
                                                        Cancel
                                                    
                                                

                                            
                                        
                                    
                                
                            
                        
                        
                        
                            
                                
                                    
                                        Cancel Order
                                        ×

                                        
                                    
                                    
                                        Reason(s) for voiding orders
                                        
                                                                                        
                                        
                                    
                                    
                                        Close
                                        
                                             Save
                                    
                                
                            
                        
                    
                    
                        
                            
                                
                                    
                                        Previous Lab Order(s)
                                    
                                

                                
                                    No previous lab orders
                                    
                                        
                                            
                                                Order Date
                                                Tests Ordered
                                                Result Date
                                                Results
                                                Order Reason
                                                Actions
                                            
                                            
                                        
                                    
                                
                            
                        
                    

                    
                    
                        
                            
                                
                                    Confirm Orders
                                    ×

                                    
                                

                                
                                    
                                        
                                            
                                                Order Date
                                                Test Name
                                                Order Reason
                                                Order Urgency
                                                Actions
                                            
                                            
                                        
                                    
                                
                                
                                    Cancel

                                    
                                        Save
                                    


                                
                            
                        
                    

                    
                    
                        
                            
                                
                                    
                                    ×

                                    
                                
                                
                                    
                                    
                                        Date: 

	jq(function() {
		jq('#orderDate_date').datepicker({
			dateFormat: 'dd-M-yy',
			changeMonth: true,
			changeYear: true,
			showButtonPanel: true,
			yearRange: '-120:+5',
			autoSize: true
			
			
		});

		jq('#orderDate_date, #orderDate_hour, #orderDate_minute').change(function() {
			kenyaui.updateDateTimeFromDisplay('orderDate', false);
		});
	});







                                    
                                
                                
                                    Close
                                    
                                         Save
                                
                            
                        
                    

                    
                    
                        
                            
                                
                                    
                                    ×

                                    
                                
                                
                                    
                                    
                                        Date: 

	jq(function() {
		jq('#dateOrderVl_date').datepicker({
			dateFormat: 'dd-M-yy',
			changeMonth: true,
			changeYear: true,
			showButtonPanel: true,
			yearRange: '-120:+5',
			autoSize: true
			
			
		});

		jq('#dateOrderVl_date, #dateOrderVl_hour, #dateOrderVl_minute').change(function() {
			kenyaui.updateDateTimeFromDisplay('dateOrderVl', false);
		});
	});







                                    
                                
                                
                                    Close
                                    
                                         Save
                                
                            
                        
                    
                    
                    
                        
                            
                                
                                     Order Urgency | Reason(s)
                                    ×
                                    
                                
                                
                                    Order Urgency
                                    
                                        
                                            ROUTINE
                                            IMMEDIATELY
                                        

                                    
                                    
                                        Order Reason 
                                        
                                            Reason:
                                            
                                                Clinical treatment failurePregnancyBaselineFollow upSingle Drug SubstitutionBreastfeedingClinical failureRoutine

                                            
                                            Reason(other):
                                            
                                        
                                    
                                
                                
                                    Close
                                    
                                         Save
                                
                            
                        
                    

                    
                    
                        
                            

                                
                                    
                                         Saving...
                                    
                                
                            
                        
                    
                    
                    
                        
                            
                                
                                    Server Error
                                    
                                        ×
                                    
                                

                                
                                    
                                
                                
                                    Close
                                
                            
                        
                    

                    
                    
                        
                            
                                
                                    Warning!
                                    
                                        ×
                                    
                                

                                
                                    
                                
                                
                                    NO
                                    Yes
                                
                            
                        
                    


                    

                    
                    
                        
                            
                                
                                    ×

                                    
                                

                                
                                    
                                        Active   Order Already exist. Please check the Active Orders Tab to cancel the order and proceed.
                                    
                                
                                
                                    Close
                                
                            
                        
                    
                    
                    
                        
                            
                                
                                    Edit Lab Results
                                    
                                        ×
                                    
                                

                                
                                    :
                                    
                                    
                                    
                                    


                                    


                                
                                
                                    Close
                                    Save
                                
                            
                        
                    


                
                

            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;ng-scope&quot;]/div[@class=&quot;ke-page-container&quot;]/div[@class=&quot;ke-page-content&quot;]/div[1]/div[@class=&quot;ui-tabs&quot;]/div[@class=&quot;ui-tabs-panel ui-widget-content&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Current visit'])[1]/following::div[5]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[4]/div/div/div/div</value>
   </webElementXpaths>
</WebElementEntity>
