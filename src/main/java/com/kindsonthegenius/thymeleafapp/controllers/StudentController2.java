package com.kindsonthegenius.thymeleafapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.thymeleafapp.models.Jsons;
import com.kindsonthegenius.thymeleafapp.models.LfcContinue;
import com.kindsonthegenius.thymeleafapp.models.Student;
import com.kindsonthegenius.thymeleafapp.models.VigSaveSubmit;
import com.kindsonthegenius.thymeleafapp.services.StudentService;




@Controller
@RequestMapping("/sap")
public class StudentController2 {
	
	
	@RequestMapping(value="/advtypelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvTypeList(@RequestBody String empId) {
		return new Jsons().advtypelist();
	}
	
	@RequestMapping(value="/advreasonlist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvReasonList(@RequestBody String empId) {
		return new Jsons().advreasonlist();
	}
	
	@RequestMapping(value="/advdetailset", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvDetails(@RequestBody String empId) {
		return new Jsons().advdetailset();
	}
	
	@RequestMapping(value="/advcurremi", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvCurrEmi(@RequestBody String pernr,  String dlart,  String extdl) {
		return new Jsons().advcurremi();
	}
	
	@RequestMapping(value="/advrepayifsc", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvRepayIfsc(@RequestBody String pernr,  String loanAccNo) {
		return new Jsons().advrepayifsc();
	}

	
	@RequestMapping(value="/advchangeemi", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String chnageEmi(@RequestBody String pernr,  String dlart,  String extdl, String newemi) {
		return new Jsons().advchangeemi();
	}
		
	/**
	 * LFC TFA 
	 */
	
	@RequestMapping(value="/lfcsetlist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSetList(@RequestBody String empId) {
		return new Jsons().getLfcSetList();
	}
	
	@RequestMapping(value="/lfcrellist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcRelList(@RequestBody String pernr,  String lfsSetCCode) {
		return new Jsons().getLfcRelList();
	}
	
	@RequestMapping(value="/lfcsetdetaillist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSetDetailList(@RequestBody String empId) {
		return new Jsons().getLfcSetDetailList();
	}
	
	@RequestMapping(value="/lfcsetmoredetaillist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSetMoreDetailList(@RequestBody String pernr,  String fromDate,  String toDate) {
		return new Jsons().getLfcSetMoreDetailList();
	}
	
	@RequestMapping(value="/lfcschemelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSchemeList(@RequestBody String empId) {
		return new Jsons().getLfcSchemeList();
	}
	
	
	@RequestMapping(value="/lfcentitlelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcEntitleList(@RequestBody String empId) {
		return new Jsons().getLfcEntitleList();
	}
	
	
	@RequestMapping(value="/lfccontsubmit", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String onlfcContinue(@RequestBody LfcContinue lfc) {
		return new Jsons().onlfcContinue();
	}	
	
	
	@RequestMapping(value="/vigreqtypelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getVigReqTypeList(@RequestBody String empId) {
		return new Jsons().getVigReqTypeList();
	}	
	
	
	@RequestMapping(value="/vigreqlist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getVigReqList(@RequestBody String empId, String reqTypVal) {
		return new Jsons().getVigReqList();
	}	
	
	
	@RequestMapping(value="/vigassetypelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getVigAsseTypeList(@RequestBody String empId) {
		return new Jsons().getVigAsseTypeList();
	}	
	
	@RequestMapping(value="/emppaydatalist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getEmpPayDataList(@RequestBody String empId) {
		return new Jsons().getEmpPayDataList();
	}	
	
	@RequestMapping(value="/emppayhistlist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getEmpPayHistList(@RequestBody String pernr, String fromDate, String toDate, String dateRange) {
		return new Jsons().getEmpPayHistList();
	}	
	
	@RequestMapping(value="/vigSaveSubmit", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String vigOnSaveSubmit(@RequestBody VigSaveSubmit vig) {
		return new Jsons().vigOnSaveSubmit();
	}	
	
	@RequestMapping(value="/pmscls1dash", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getPmsCls1Dash(@RequestBody String empId) {
		return new Jsons().getPmsCls1Dash();
	}	
	
	@RequestMapping(value="/pmscls1list", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getPmsCls1List(@RequestBody String pernr, String appYear, String marks) {
		return new Jsons().getPmsCls1List();
	}	
	
	@RequestMapping(value="/pmscls3dash", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getPmsCls3Dash(@RequestBody String empId) {
		return new Jsons().getPmsCls3Dash();
	}	
	
	@RequestMapping(value="/pmscls3list", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getPmsCls3List(@RequestBody String pernr, String startDate, String endDate) {
		return new Jsons().getPmsCls3List();
	}	
	
	@RequestMapping(value="/pmsempcls", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getPmsEmpCls(@RequestBody String pernr, String startDate, String endDate) {
		return new Jsons().getPmsEmpCls();
	}	
	
	/*********************/
	@RequestMapping(value="/trnlocationlist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnLocationList(@RequestBody String empId) {
		return new Jsons().getTrnLocationList();
	}	
	
	@RequestMapping(value="/trncoursecategory", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnCourseCategory(@RequestBody String pernr, String locCode) {
		return new Jsons().getTrnCourseCategory();
	}	
	
	@RequestMapping(value="/trncoursesubcat", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnCourseSubcat(@RequestBody String pernr, String catCode) {
		return new Jsons().getTrnCourseSubcat();
	}	
	
	@RequestMapping(value="/trntypelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnTypeList(@RequestBody String pernr) {
		return new Jsons().getTrnTypeList();
	}
	
	@RequestMapping(value="/trnproglist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnProgList(@RequestBody String pernr, String subcatCode) {
		return new Jsons().getTrnProgList();
	}
	
	@RequestMapping(value="/trninputcategory", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnInputCategory(@RequestBody String empId) {
		return new Jsons().getTrnInputCategory();
	} 

	@RequestMapping(value="/trninputsubcat", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnInputSubcat(@RequestBody String empId) {
		return new Jsons().getTrnInputSubcat();
	} 
	
	@RequestMapping(value="/trninputcomplexity", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnInputComplexity(@RequestBody String empId) {
		return new Jsons().getTrnInputComplexity();
	} 
	
	@RequestMapping(value="/trninputprefmonth", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnInputPrefmonth(@RequestBody String empId) {
		return new Jsons().getTrnInputPrefmonth();
	} 
	
	@RequestMapping(value="/trninputprefyear", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnInputPrefyear(@RequestBody String empId) {
		return new Jsons().getTrnInputPrefyear();
	} 
	
	@RequestMapping(value="/trninputduration", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnInputDuration(@RequestBody String empId) {
		return new Jsons().getTrnInputDuration();
	} 
	
	@RequestMapping(value="/trninputsubmit", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getTrnSubmit(@RequestBody String empId) {
		return new Jsons().getTrnSubmit();
	} 
	

	
	@RequestMapping(value="/alotpropertytypelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAlotPropertyTypeList(@RequestBody String empId) {
		return new Jsons().getAlotPropertyTypeList();
	} 

	
	@RequestMapping(value="/alotpropertylist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAlotPropertyList(@RequestBody String locVal, String typVal) {
		return new Jsons().getAlotPropertyList();
	} 

	
	@RequestMapping(value="/alotlocationtypelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAlotLocationTypeList(@RequestBody String empId) {
		return new Jsons().getAlotLocationTypeList();
	} 


	@RequestMapping(value="/alotpropertyamenties", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAlotPropertyAmenties(@RequestBody String propId) {
		return new Jsons().getAlotPropertyAmenties();
	} 
	
	@RequestMapping(value="/alotunitdetails", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAlotUnitDetails(@RequestBody String propId) {
		return new Jsons().getAlotUnitDetails();
	} 
		
	@RequestMapping(value="/alotpropertyimg", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAlotPropertyImg(@RequestBody String propId) {
		return new Jsons().getAlotPropertyImg();
	} 
 
	
	
}
