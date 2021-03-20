package com.kindsonthegenius.thymeleafapp.models;

import java.sql.ResultSet;
import java.sql.Statement;

public class Jsons {
	
	public String advtypelist() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"loanTypeValue\": \"9005\",\r\n" + 
				"        \"loanTypeText\": \"Festival Advance\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"advancesTypeList\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"loanTypeValue\": \"9006\",\r\n" + 
				"        \"loanTypeText\": \"Calamity Advance\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"advancesTypeList\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"loanTypeValue\": \"9007\",\r\n" + 
				"        \"loanTypeText\": \"Medical Advance\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"advancesTypeList\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"loanTypeValue\": \"9008\",\r\n" + 
				"        \"loanTypeText\": \"PF Advance-Housing\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"advancesTypeList\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"loanTypeValue\": \"9015\",\r\n" + 
				"        \"loanTypeText\": \"PF Advance-No Housing\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"advancesTypeList\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"loanTypeValue\": \"9999\",\r\n" + 
				"        \"loanTypeText\": \"Personal Advance\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"advancesTypeList\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"loanTypeValue\": \"1000\",\r\n" + 
				"        \"loanTypeText\": \"PF Withdrawal\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"advancesTypeList\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String advreasonlist() {
		
		String advreasonl= "";
		
		try {
			Statement st = com.kindsonthegenius.thymeleafapp.services.MyConnection.Connect().createStatement();
			ResultSet rs = st.executeQuery("select * from d_schedule order by category;"); 
			while(rs.next()){	
				advreasonl += ""+rs.getString(2);
			}
		} catch (Exception e) { }
		
		
		return advreasonl;
	}
	
	public String advdetailset() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00150014\",\r\n" + 
				"        \"loanType\": \"9007\",\r\n" + 
				"        \"reason\": \"MEDICA\",\r\n" + 
				"        \"loanAccNo\": \"1000000000077\",\r\n" + 
				"        \"rateOfInterest\": \"N/A\",\r\n" + 
				"        \"prinOutstand\": \" 24567.00\",\r\n" + 
				"        \"accInterest\": \"     0.00\",\r\n" + 
				"        \"dateOfSanction\": \"20150806\",\r\n" + 
				"        \"principleTaken\": \"      24567.00\",\r\n" + 
				"        \"totOutstand\": \" 24567.00\",\r\n" + 
				"        \"errorstatus\": null,\r\n" + 
				"        \"advancesdetails\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00150014\",\r\n" + 
				"        \"loanType\": \"9007\",\r\n" + 
				"        \"reason\": \"Education\",\r\n" + 
				"        \"loanAccNo\": \"1000000000113\",\r\n" + 
				"        \"rateOfInterest\": \"6.5\",\r\n" + 
				"        \"prinOutstand\": \" 15182.00\",\r\n" + 
				"        \"accInterest\": \"     0.00\",\r\n" + 
				"        \"dateOfSanction\": \"20151028\",\r\n" + 
				"        \"principleTaken\": \"      15182.00\",\r\n" + 
				"        \"totOutstand\": \" 15182.00\",\r\n" + 
				"        \"errorstatus\": null,\r\n" + 
				"        \"advancesdetails\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00150014\",\r\n" + 
				"        \"loanType\": \"9001\",\r\n" + 
				"        \"reason\": \"PERSON\",\r\n" + 
				"        \"loanAccNo\": \"150014900156868\",\r\n" + 
				"        \"rateOfInterest\": \"6.5\",\r\n" + 
				"        \"prinOutstand\": \"1000000.00\",\r\n" + 
				"        \"accInterest\": \"     0.00\",\r\n" + 
				"        \"dateOfSanction\": \"20151028\",\r\n" + 
				"        \"principleTaken\": \" 15182\",\r\n" + 
				"        \"totOutstand\": \"1000000.00\",\r\n" + 
				"        \"errorstatus\": null,\r\n" + 
				"        \"advancesdetails\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String advcurremi() {
		return "{\r\n" + 
				"    \"pernr\": \"00150014\",\r\n" + 
				"    \"dlart\": \"9004\",\r\n" + 
				"    \"extdl\": \"1000000000113\",\r\n" + 
				"    \"tilbt\": \"633.00 \",\r\n" + 
				"    \"errorStatus\": null\r\n" + 
				"}";
	}

	public String advrepayifsc() {
		return "{\r\n" + 
				"    \"pernr\": \"00150014\",\r\n" + 
				"    \"note\": \"Note: Online transfer to be done to the account number and IFSC given below.\",\r\n" + 
				"    \"loanAccNo\": \"313135464\",\r\n" + 
				"    \"ifsc\": \"ABHY0065002\",\r\n" + 
				"    \"errorStatus\": null\r\n" + 
				"}";
	}

	public String advchangeemi() {
		return "{\r\n" + 
				"    \"pernr\": \"00102583\",\r\n" + 
				"    \"dlart\": \"9001\",\r\n" + 
				"    \"extdl\": \"102583900156985\",\r\n" + 
				"    \"newemi\": \"60000.00 \",\r\n" + 
				"    \"msg\": \"Success\",\r\n" + 
				"    \"errorStatus\": null\r\n" + 
				"}";
	}
	
	public String getLfcSetList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"lfcSetPernr\": \"\",\r\n" + 
				"        \"lfcSetCode\": \"RS\",\r\n" + 
				"        \"lfcSetDesc\": null,\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"lfcSetPernr\": \"\",\r\n" + 
				"        \"lfcSetCode\": \"AS\",\r\n" + 
				"        \"lfcSetDesc\": null,\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getLfcSchemeList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"scheme\": \"RS\",\r\n" + 
				"        \"schemeDesc\": \"Rail Scheme\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"scheme\": \"AS\",\r\n" + 
				"        \"schemeDesc\": \"Air Scheme\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getLfcEntitleList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"01\",\r\n" + 
				"        \"entlClsDesc\": \"Business Class\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"02\",\r\n" + 
				"        \"entlClsDesc\": \"Economy Class\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"03\",\r\n" + 
				"        \"entlClsDesc\": \"AC Tier 1\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"04\",\r\n" + 
				"        \"entlClsDesc\": \"AC Tier 2\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"05\",\r\n" + 
				"        \"entlClsDesc\": \"AC Tier 3\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"06\",\r\n" + 
				"        \"entlClsDesc\": \"Deluxe Cabin\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"07\",\r\n" + 
				"        \"entlClsDesc\": \"A Cabin\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"entlClsCode\": \"08\",\r\n" + 
				"        \"entlClsDesc\": \"C Cabin\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getLfcRelList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00128667\",\r\n" + 
				"        \"lfsSetCCode\": null,\r\n" + 
				"        \"scheme\": null,\r\n" + 
				"        \"objps\": null,\r\n" + 
				"        \"famsa\": \"1/\",\r\n" + 
				"        \"famsaText\": \"Spouse:harika\",\r\n" + 
				"        \"elgAmt\": \"600000\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"fullName\": \"harika ADIVAREKAR\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00128667\",\r\n" + 
				"        \"lfsSetCCode\": null,\r\n" + 
				"        \"scheme\": null,\r\n" + 
				"        \"objps\": null,\r\n" + 
				"        \"famsa\": \"2/01\",\r\n" + 
				"        \"famsaText\": \"Child:Sukhdev\",\r\n" + 
				"        \"elgAmt\": \"600000\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"fullName\": \"Sukhdev ADIVAREKAR\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00128667\",\r\n" + 
				"        \"lfsSetCCode\": null,\r\n" + 
				"        \"scheme\": null,\r\n" + 
				"        \"objps\": null,\r\n" + 
				"        \"famsa\": \"2/02\",\r\n" + 
				"        \"famsaText\": \"Child:Shristi\",\r\n" + 
				"        \"elgAmt\": \"600000\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"fullName\": \"Shristi Adivarekar\"\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getLfcSetDetailList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00102573\",\r\n" + 
				"        \"fromDate\": \"18.06.2019\",\r\n" + 
				"        \"toDate\": \"17.06.2021\",\r\n" + 
				"        \"status\": \"Available\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"lfcSet\": \"18.06.2019 - 17.06.2021\",\r\n" + 
				"        \"scheme\": \"abc\",\r\n" + 
				"        \"entclsCode\": \"abc\",\r\n" + 
				"        \"entcls\": \"abc\",\r\n" + 
				"        \"doubleSet\": \"abc\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00102573\",\r\n" + 
				"        \"fromDate\": \"18.06.2017\",\r\n" + 
				"        \"toDate\": \"17.06.2019\",\r\n" + 
				"        \"status\": \"Available\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"lfcSet\": \"18.06.2017 - 17.06.2019\",\r\n" + 
				"        \"scheme\": \"abc\",\r\n" + 
				"        \"entclsCode\": \"abc\",\r\n" + 
				"        \"entcls\": \"abc\",\r\n" + 
				"        \"doubleSet\": \"abc\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00102573\",\r\n" + 
				"        \"fromDate\": \"18.06.2015\",\r\n" + 
				"        \"toDate\": \"17.06.2017\",\r\n" + 
				"        \"status\": \"Expired\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"lfcSet\": \"18.06.2015 - 17.06.2017\",\r\n" + 
				"        \"scheme\": \"abc\",\r\n" + 
				"        \"entclsCode\": \"abc\",\r\n" + 
				"        \"entcls\": \"abc\",\r\n" + 
				"        \"doubleSet\": \"abc\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00102573\",\r\n" + 
				"        \"fromDate\": \"18.06.2013\",\r\n" + 
				"        \"toDate\": \"17.06.2015\",\r\n" + 
				"        \"status\": \"Availed\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"lfcSet\": \"18.06.2013 - 17.06.2015\",\r\n" + 
				"        \"scheme\": \"abc\",\r\n" + 
				"        \"entclsCode\": \"abc\",\r\n" + 
				"        \"entcls\": \"abc\",\r\n" + 
				"        \"doubleSet\": \"abc\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00102573\",\r\n" + 
				"        \"fromDate\": \"18.06.2011\",\r\n" + 
				"        \"toDate\": \"17.06.2013\",\r\n" + 
				"        \"status\": \"Expired\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"lfcSet\": \"18.06.2011 - 17.06.2013\",\r\n" + 
				"        \"scheme\": \"abc\",\r\n" + 
				"        \"entclsCode\": \"abc\",\r\n" + 
				"        \"entcls\": \"abc\",\r\n" + 
				"        \"doubleSet\": \"abc\"\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getLfcSetMoreDetailList() {
		return "{\r\n" + 
				"    \"pernr\": null,\r\n" + 
				"    \"fromDate\": \"\",\r\n" + 
				"    \"toDate\": \"\",\r\n" + 
				"    \"noTrav\": \"\",\r\n" + 
				"    \"elgAmt\": \"40000 \",\r\n" + 
				"    \"clmAmt\": \"35000 \",\r\n" + 
				"    \"taxbleAmt\": \"35000 \",\r\n" + 
				"    \"apprAmt\": \"20000 \",\r\n" + 
				"    \"taxDed\": \"500 \",\r\n" + 
				"    \"paidAmt\": \"35000 \",\r\n" + 
				"    \"lfcSet\": null,\r\n" + 
				"    \"errorStatus\": null\r\n" + 
				"}";
	}
	
	public String onlfcContinue() {
		return "{\r\n" + 
				"    \"pernr\": \"00012345\",\r\n" + 
				"    \"elgAmt\": \"60000\",\r\n" + 
				"    \"totTrav\": \"\",\r\n" + 
				"    \"totElgAmt\": \"12500\",\r\n" + 
				"    \"totClmAmt\": \"12500\",\r\n" + 
				"    \"totTaxAmt\": \"500\",\r\n" + 
				"    \"incTax\": \"400\",\r\n" + 
				"    \"eduCess\": \"250\",\r\n" + 
				"    \"totTaxDed\": \"400\",\r\n" + 
				"    \"payAmt\": \"3000\",\r\n" + 
				"    \"accept\": \"\",\r\n" + 
				"    \"cont\": \"\",\r\n" + 
				"    \"msg\": \"Success\",\r\n" + 
				"    \"errorStatus\": null\r\n" + 
				"}";
	}
	
	public String getVigReqTypeList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"reqTypVal\": \"MOVA\",\r\n" + 
				"        \"reqTypTxt\": \"Declare purchase of moveable asset\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"reqTypVal\": \"MOVS\",\r\n" + 
				"        \"reqTypTxt\": \"Declare sale of moveable asset\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getVigReqList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000000\",\r\n" + 
				"        \"reqTypVal\": \"Purchase\",\r\n" + 
				"        \"reqTyp\": \"Declare purchase of moveable asset\",\r\n" + 
				"        \"reqDate\": \"20190125\",\r\n" + 
				"        \"reqStatus\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000000\",\r\n" + 
				"        \"reqTypVal\": \"Purchase\",\r\n" + 
				"        \"reqTyp\": \"Declare purchase of moveable asset\",\r\n" + 
				"        \"reqDate\": \"20190128\",\r\n" + 
				"        \"reqStatus\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000000\",\r\n" + 
				"        \"reqTypVal\": \"Sale\",\r\n" + 
				"        \"reqTyp\": \"Declare sale of moveable asset\",\r\n" + 
				"        \"reqDate\": \"20201110\",\r\n" + 
				"        \"reqStatus\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getVigAsseTypeList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"01\",\r\n" + 
				"        \"typAsset\": \"PC\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"02\",\r\n" + 
				"        \"typAsset\": \"Two Wheeler\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"03\",\r\n" + 
				"        \"typAsset\": \"Four Wheeler\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"04\",\r\n" + 
				"        \"typAsset\": \"Laptop\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"05\",\r\n" + 
				"        \"typAsset\": \"Tab\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"06\",\r\n" + 
				"        \"typAsset\": \"Consumer Article\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"07\",\r\n" + 
				"        \"typAsset\": \"Precious Metals\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"08\",\r\n" + 
				"        \"typAsset\": \"Jewellery\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"09\",\r\n" + 
				"        \"typAsset\": \"Shares\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"10\",\r\n" + 
				"        \"typAsset\": \"Debentures\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"11\",\r\n" + 
				"        \"typAsset\": \"Bonds\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"12\",\r\n" + 
				"        \"typAsset\": \"Education\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000069\",\r\n" + 
				"        \"assetVal\": \"13\",\r\n" + 
				"        \"typAsset\": \"Others\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getEmpPayDataList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"sentDate\": \"20180103\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"400000.00 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"sentDate\": \"20180103\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"sentDate\": \"20171217\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"sentDate\": \"20171217\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"600000.00 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"sentDate\": \"20171216\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getEmpPayHistList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"20122020\",\r\n" + 
				"        \"payDate\": \"20122020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000002\",\r\n" + 
				"        \"payAmt\": \"1500000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"20122020\",\r\n" + 
				"        \"payDate\": \"20122020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000001\",\r\n" + 
				"        \"payAmt\": \"4500000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"20122020\",\r\n" + 
				"        \"payDate\": \"20122020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000001\",\r\n" + 
				"        \"payAmt\": \"2000000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25112020\",\r\n" + 
				"        \"payDate\": \"25112020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000001\",\r\n" + 
				"        \"payAmt\": \"2000000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25112020\",\r\n" + 
				"        \"payDate\": \"25112020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000001\",\r\n" + 
				"        \"payAmt\": \"4500000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25112020\",\r\n" + 
				"        \"payDate\": \"25112020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000001\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000001\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000002\",\r\n" + 
				"        \"payAmt\": \"1000000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000002\",\r\n" + 
				"        \"payAmt\": \"1000000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000002\",\r\n" + 
				"        \"payAmt\": \"1000000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000002\",\r\n" + 
				"        \"payAmt\": \"2500000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000002\",\r\n" + 
				"        \"payAmt\": \"1000000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"600000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"345687659087\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"25092020\",\r\n" + 
				"        \"payDate\": \"25092020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"13102020\",\r\n" + 
				"        \"payDate\": \"13102020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"400000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"13102020\",\r\n" + 
				"        \"payDate\": \"13102020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"bankName\": \"ICICI Bank\",\r\n" + 
				"        \"accNo\": \"345687659087\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"13102020\",\r\n" + 
				"        \"payDate\": \"13102020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           HL-0000002\",\r\n" + 
				"        \"payAmt\": \"1000000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"567980986546\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001809\",\r\n" + 
				"        \"dateRange\": \"\",\r\n" + 
				"        \"fromDate\": \"\",\r\n" + 
				"        \"toDate\": \"\",\r\n" + 
				"        \"sentDate\": \"13102020\",\r\n" + 
				"        \"payDate\": \"13102020\",\r\n" + 
				"        \"payPartic\": \"Loan-Disbursed           AHL-0000002\",\r\n" + 
				"        \"payAmt\": \"500000.00 \",\r\n" + 
				"        \"bankName\": \"State Bank of India\",\r\n" + 
				"        \"accNo\": \"\",\r\n" + 
				"        \"utrNo\": \"123456789\",\r\n" + 
				"        \"payee\": \"Shri Narayan G.Kotian\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String vigOnSaveSubmit() {
		return "{\r\n" + 
				"    \"pernr\": \"00123456\",\r\n" + 
				"    \"reqTypVal\": null,\r\n" + 
				"    \"reqTypTxt\": null,\r\n" + 
				"    \"basicPay\": null,\r\n" + 
				"    \"assetVal\": null,\r\n" + 
				"    \"typAsset\": null,\r\n" + 
				"    \"transDate\": null,\r\n" + 
				"    \"nameBuyer\": null,\r\n" + 
				"    \"addParty\": null,\r\n" + 
				"    \"natBuss\": null,\r\n" + 
				"    \"transAmt\": null,\r\n" + 
				"    \"persSav\": null,\r\n" + 
				"    \"loanRbi\": null,\r\n" + 
				"    \"loanOth\": null,\r\n" + 
				"    \"nameOthInst\": null,\r\n" + 
				"    \"loanOthBrk\": null,\r\n" + 
				"    \"contriSpouse\": null,\r\n" + 
				"    \"contriRem\": null,\r\n" + 
				"    \"other\": null,\r\n" + 
				"    \"othDet\": null,\r\n" + 
				"    \"brokAmt\": null,\r\n" + 
				"    \"brokDet\": null,\r\n" + 
				"    \"acqui\": null,\r\n" + 
				"    \"acquiRep\": null,\r\n" + 
				"    \"acquiDate\": null,\r\n" + 
				"    \"repDate\": null,\r\n" + 
				"    \"repOffice\": null,\r\n" + 
				"    \"acquiRem\": null,\r\n" + 
				"    \"reasLateRep\": null,\r\n" + 
				"    \"attachDesc\": null,\r\n" + 
				"    \"attachFile\": null,\r\n" + 
				"    \"empComm\": null,\r\n" + 
				"    \"save\": null,\r\n" + 
				"    \"msg\": \"Success\",\r\n" + 
				"    \"vigAttachSet\": null,\r\n" + 
				"    \"errorStatus\": null\r\n" + 
				"}";
	}

	public String getPmsCls1Dash() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001620\",\r\n" + 
				"        \"appYear\": \"2021-22\",\r\n" + 
				"        \"kraStatus\": \"Completed\",\r\n" + 
				"        \"apprStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"96\",\r\n" + 
				"        \"rating\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001620\",\r\n" + 
				"        \"appYear\": \"2020-21\",\r\n" + 
				"        \"kraStatus\": \"Completed\",\r\n" + 
				"        \"apprStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"86\",\r\n" + 
				"        \"rating\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001620\",\r\n" + 
				"        \"appYear\": \"2019-20\",\r\n" + 
				"        \"kraStatus\": \"Completed\",\r\n" + 
				"        \"apprStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"76\",\r\n" + 
				"        \"rating\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00001620\",\r\n" + 
				"        \"appYear\": \"2018-19\",\r\n" + 
				"        \"kraStatus\": \"Completed\",\r\n" + 
				"        \"apprStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"66 \",\r\n" + 
				"        \"rating\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getPmsCls1List() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"appYear\": \"2018-19\",\r\n" + 
				"        \"appStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"87\",\r\n" + 
				"        \"roName\": \"Rajiva Husband\",\r\n" + 
				"        \"rvoName\": \"CHANDRA SHEKHAR AZAD\",\r\n" + 
				"        \"kra\": \"1\",\r\n" + 
				"        \"kraWeight\": \"25 \",\r\n" + 
				"        \"kraTitle\": \"\",\r\n" + 
				"        \"kraDesc\": \"\",\r\n" + 
				"        \"achievements\": \"\",\r\n" + 
				"        \"selfRating\": \"2 \",\r\n" + 
				"        \"overRating\": \"\",\r\n" + 
				"        \"roComm\": \"ok\",\r\n" + 
				"        \"rvoComm\": \"66 \",\r\n" + 
				"        \"roRating\": \"1 \",\r\n" + 
				"        \"rvoRating\": \"0 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"appYear\": \"2018-19\",\r\n" + 
				"        \"appStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"87\",\r\n" + 
				"        \"roName\": \"Rajiva Husband\",\r\n" + 
				"        \"rvoName\": \"CHANDRA SHEKHAR AZAD\",\r\n" + 
				"        \"kra\": \"2\",\r\n" + 
				"        \"kraWeight\": \"25 \",\r\n" + 
				"        \"kraTitle\": \"\",\r\n" + 
				"        \"kraDesc\": \"\",\r\n" + 
				"        \"achievements\": \"\",\r\n" + 
				"        \"selfRating\": \"2 \",\r\n" + 
				"        \"overRating\": \"\",\r\n" + 
				"        \"roComm\": \"ok\",\r\n" + 
				"        \"rvoComm\": \"66 \",\r\n" + 
				"        \"roRating\": \"1 \",\r\n" + 
				"        \"rvoRating\": \"0 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"appYear\": \"2018-19\",\r\n" + 
				"        \"appStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"87\",\r\n" + 
				"        \"roName\": \"Rajiva Husband\",\r\n" + 
				"        \"rvoName\": \"CHANDRA SHEKHAR AZAD\",\r\n" + 
				"        \"kra\": \"3\",\r\n" + 
				"        \"kraWeight\": \"25 \",\r\n" + 
				"        \"kraTitle\": \"\",\r\n" + 
				"        \"kraDesc\": \"\",\r\n" + 
				"        \"achievements\": \"\",\r\n" + 
				"        \"selfRating\": \"2 \",\r\n" + 
				"        \"overRating\": \"\",\r\n" + 
				"        \"roComm\": \"ok\",\r\n" + 
				"        \"rvoComm\": \"66 \",\r\n" + 
				"        \"roRating\": \"1 \",\r\n" + 
				"        \"rvoRating\": \"0 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"\",\r\n" + 
				"        \"appYear\": \"2018-19\",\r\n" + 
				"        \"appStatus\": \"Completed\",\r\n" + 
				"        \"marks\": \"87\",\r\n" + 
				"        \"roName\": \"Rajiva Husband\",\r\n" + 
				"        \"rvoName\": \"CHANDRA SHEKHAR AZAD\",\r\n" + 
				"        \"kra\": \"4\",\r\n" + 
				"        \"kraWeight\": \"25 \",\r\n" + 
				"        \"kraTitle\": \"\",\r\n" + 
				"        \"kraDesc\": \"\",\r\n" + 
				"        \"achievements\": \"\",\r\n" + 
				"        \"selfRating\": \"2 \",\r\n" + 
				"        \"overRating\": \"\",\r\n" + 
				"        \"roComm\": \"ok\",\r\n" + 
				"        \"rvoComm\": \"66 \",\r\n" + 
				"        \"roRating\": \"1 \",\r\n" + 
				"        \"rvoRating\": \"0 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getPmsCls3Dash() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"20180701\",\r\n" + 
				"        \"endDate\": \"20190630\",\r\n" + 
				"        \"appYear\": \"2018-19\",\r\n" + 
				"        \"appStatus\": \"Initiated by Nodal Officer\",\r\n" + 
				"        \"roMarks\": \"0.00 \",\r\n" + 
				"        \"rvoMarks\": \"0.00 \",\r\n" + 
				"        \"roName\": \"Reporting1 Manager\",\r\n" + 
				"        \"rvoName\": \"RR ADM1\",\r\n" + 
				"        \"overRating\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"20190701\",\r\n" + 
				"        \"endDate\": \"20200630\",\r\n" + 
				"        \"appYear\": \"2019-20\",\r\n" + 
				"        \"appStatus\": \"Initiated by Nodal Officer\",\r\n" + 
				"        \"roMarks\": \"0.00 \",\r\n" + 
				"        \"rvoMarks\": \"0.00 \",\r\n" + 
				"        \"roName\": \"Reporting1 Manager\",\r\n" + 
				"        \"rvoName\": \"\",\r\n" + 
				"        \"overRating\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
	public String getPmsCls3List() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"General Intelligence, Knowledge of work, rules, procedures etc.\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Promptness, Accuracy and speed in disposal of work\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Communication skills - Oral/Written communication***\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Drafting Ability* / Alertness / Vigilance**\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Inter-personal skills\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Attitude and commitment to work\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Ability\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Application, Keenness, Enthusiasm and Devotion to duty\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Ability to work in computerized environment\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": \"00000140\",\r\n" + 
				"        \"startDate\": \"01072018\",\r\n" + 
				"        \"endDate\": \"30062019\",\r\n" + 
				"        \"title\": \"Promise & Potential to take on higher responsibilities\",\r\n" + 
				"        \"roRating\": \"\",\r\n" + 
				"        \"roComm\": \"\",\r\n" + 
				"        \"rvoRating\": \"\",\r\n" + 
				"        \"rvoComm\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnLocationList() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50005327\",\r\n" + 
				"        \"locName\": \"RBI Training Calendar\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50008838\",\r\n" + 
				"        \"locName\": \"RBI_TEST\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50010950\",\r\n" + 
				"        \"locName\": \"CAB Pune\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50025188\",\r\n" + 
				"        \"locName\": \" Foreign External Training\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnCourseCategory() {
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50005327\",\r\n" + 
				"        \"catCode\": \"50005328\",\r\n" + 
				"        \"catName\": \"Calendar of Programmes - Chennai\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50005327\",\r\n" + 
				"        \"catCode\": \"50008845\",\r\n" + 
				"        \"catName\": \"STAFF_COL\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50005327\",\r\n" + 
				"        \"catCode\": \"50012285\",\r\n" + 
				"        \"catName\": \"Grade B Direct Recruit\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50005327\",\r\n" + 
				"        \"catCode\": \"50009007\",\r\n" + 
				"        \"catName\": \"Role Based Supervision\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"locCode\": \"50005327\",\r\n" + 
				"        \"catCode\": \"50009032\",\r\n" + 
				"        \"catName\": \"RBI_College_Staff\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnCourseSubcat() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"catCode\": \"50012285\",\r\n" + 
				"        \"subcatCode\": \"50012281\",\r\n" + 
				"        \"subcatName\": \"Foundation module and Functional module\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"catCode\": \"50012285\",\r\n" + 
				"        \"subcatCode\": \"50012282\",\r\n" + 
				"        \"subcatName\": \"On-the-Job training\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"catCode\": \"50012285\",\r\n" + 
				"        \"subcatCode\": \"50012283\",\r\n" + 
				"        \"subcatName\": \"Soft Skill Module\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"catCode\": \"50012285\",\r\n" + 
				"        \"subcatCode\": \"50012284\",\r\n" + 
				"        \"subcatName\": \"Exposure to regularory bodies Attachment\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnTypeList() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"40000233\",\r\n" + 
				"        \"trainTypName\": \"CAB PUNE\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"40000293\",\r\n" + 
				"        \"trainTypName\": \"CAB PUNE\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"40031326\",\r\n" + 
				"        \"trainTypName\": \"Bangalore\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"40031381\",\r\n" + 
				"        \"trainTypName\": \"Mumbai\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"40031391\",\r\n" + 
				"        \"trainTypName\": \"Mumbai\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"40031401\",\r\n" + 
				"        \"trainTypName\": \"Bangalore\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"40031471\",\r\n" + 
				"        \"trainTypName\": \"Bangalore\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50005332\",\r\n" + 
				"        \"trainTypName\": \"Chennai\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50009006\",\r\n" + 
				"        \"trainTypName\": \"C-8 _ Mum_Role Based Supervision\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50011337\",\r\n" + 
				"        \"trainTypName\": \"CAB_Pune\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50025119\",\r\n" + 
				"        \"trainTypName\": \"External Dom Training_Mumbai\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50025194\",\r\n" + 
				"        \"trainTypName\": \"London, UK _ FT\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50025843\",\r\n" + 
				"        \"trainTypName\": \"London, UK _10 Conference\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50029466\",\r\n" + 
				"        \"trainTypName\": \"CAB_Pune\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50031383\",\r\n" + 
				"        \"trainTypName\": \"CAB PUNE\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50031385\",\r\n" + 
				"        \"trainTypName\": \"test\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50031389\",\r\n" + 
				"        \"trainTypName\": \"test1\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"trainTypCode\": \"50031568\",\r\n" + 
				"        \"trainTypName\": \"Domestic Internal\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnProgList() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"subcatCode\": \"50012282\",\r\n" + 
				"        \"trainTypName\": \"Domestic External\",\r\n" + 
				"        \"startDate\": \"01.01.2021\",\r\n" + 
				"        \"endDate\": \"31.01.2021\",\r\n" + 
				"        \"prgmName\": \"Customized Training Programme on Agri-fi\",\r\n" + 
				"        \"type\": \"Classroom Training\",\r\n" + 
				"        \"complexity\": \"Low\",\r\n" + 
				"        \"dates\": \"06.01.2021 - 24.01.2021\",\r\n" + 
				"        \"location\": \"Domestic External\",\r\n" + 
				"        \"eligibility\": \"\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"subcatCode\": \"50012282\",\r\n" + 
				"        \"trainTypName\": \"Domestic Internal\",\r\n" + 
				"        \"startDate\": \"01.01.2021\",\r\n" + 
				"        \"endDate\": \"31.01.2021\",\r\n" + 
				"        \"prgmName\": \"State Focussed Programme on Agri-financi\",\r\n" + 
				"        \"type\": \"Virtual Training\",\r\n" + 
				"        \"complexity\": \"High\",\r\n" + 
				"        \"dates\": \"15.01.2021 - 22.01.2021\",\r\n" + 
				"        \"location\": \"Domestic Internal\",\r\n" + 
				"        \"eligibility\": \"\",\r\n" + 
				"        \"errorStatus\": null,\r\n" + 
				"        \"pernr\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnInputCategory() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1001\",\r\n" + 
				"        \"grpText\": \"Banking Department\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1002\",\r\n" + 
				"        \"grpText\": \"General or Broad Spectrum\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1003\",\r\n" + 
				"        \"grpText\": \"Currency Management\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1004\",\r\n" + 
				"        \"grpText\": \"Financial Market\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1005\",\r\n" + 
				"        \"grpText\": \"Human Resource\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1006\",\r\n" + 
				"        \"grpText\": \"Information Technology\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1007\",\r\n" + 
				"        \"grpText\": \"Macro Economics and Statistics\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1008\",\r\n" + 
				"        \"grpText\": \"Payment System\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1009\",\r\n" + 
				"        \"grpText\": \"Regulation and Supervision\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1010\",\r\n" + 
				"        \"grpText\": \"MSME Financing\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1011\",\r\n" + 
				"        \"grpText\": \"Financial inclusion\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"grpCode\": \"1012\",\r\n" + 
				"        \"grpText\": \"Agricultural Finance\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnInputSubcat() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2001\",\r\n" + 
				"        \"objText\": \"RBI Balance Sheet\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2001\",\r\n" + 
				"        \"objText\": \"RBI Balance Sheet\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2002\",\r\n" + 
				"        \"objText\": \"Banking Department\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2003\",\r\n" + 
				"        \"objText\": \"Annual Closing\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2004\",\r\n" + 
				"        \"objText\": \"Retirement Planning\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2005\",\r\n" + 
				"        \"objText\": \"Induction\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2006\",\r\n" + 
				"        \"objText\": \"Central Banking\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2007\",\r\n" + 
				"        \"objText\": \"Rajbhasha\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2008\",\r\n" + 
				"        \"objText\": \"Acts\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"objCode\": \"2009\",\r\n" + 
				"        \"objText\": \"Communication Skills\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnInputComplexity() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"complxCode\": \"MD\",\r\n" + 
				"        \"complxVal\": \"Basic\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"complxCode\": \"LC\",\r\n" + 
				"        \"complxVal\": \"Intermediate\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"complxCode\": \"ST\",\r\n" + 
				"        \"complxVal\": \"Advance\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnInputPrefmonth() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"01\",\r\n" + 
				"        \"monthVal\": \"January\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"02\",\r\n" + 
				"        \"monthVal\": \"February\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"03\",\r\n" + 
				"        \"monthVal\": \"March\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"04\",\r\n" + 
				"        \"monthVal\": \"April\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"05\",\r\n" + 
				"        \"monthVal\": \"May\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"06\",\r\n" + 
				"        \"monthVal\": \"June\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"07\",\r\n" + 
				"        \"monthVal\": \"July\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"08\",\r\n" + 
				"        \"monthVal\": \"August\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"09\",\r\n" + 
				"        \"monthVal\": \"September\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"10\",\r\n" + 
				"        \"monthVal\": \"October\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"11\",\r\n" + 
				"        \"monthVal\": \"November\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"monthCode\": \"12\",\r\n" + 
				"        \"monthVal\": \"December\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnInputPrefyear() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"yearCode\": \"1 \",\r\n" + 
				"        \"yearVal\": \"2021\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"yearCode\": \"2 \",\r\n" + 
				"        \"yearVal\": \"2022\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"yearCode\": \"3 \",\r\n" + 
				"        \"yearVal\": \"2023\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"yearCode\": \"4 \",\r\n" + 
				"        \"yearVal\": \"2024\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getTrnInputDuration() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"1 \",\r\n" + 
				"        \"durationVal\": \"1 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"2 \",\r\n" + 
				"        \"durationVal\": \"2 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"3 \",\r\n" + 
				"        \"durationVal\": \"3 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"4 \",\r\n" + 
				"        \"durationVal\": \"4 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"5 \",\r\n" + 
				"        \"durationVal\": \"5 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"6 \",\r\n" + 
				"        \"durationVal\": \"6 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"7 \",\r\n" + 
				"        \"durationVal\": \"7 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"8 \",\r\n" + 
				"        \"durationVal\": \"8 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"9 \",\r\n" + 
				"        \"durationVal\": \"9 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"10 \",\r\n" + 
				"        \"durationVal\": \"10 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"11 \",\r\n" + 
				"        \"durationVal\": \"11 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"12 \",\r\n" + 
				"        \"durationVal\": \"12 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"13 \",\r\n" + 
				"        \"durationVal\": \"13 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"14 \",\r\n" + 
				"        \"durationVal\": \"14 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"15 \",\r\n" + 
				"        \"durationVal\": \"15 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"16 \",\r\n" + 
				"        \"durationVal\": \"16 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"17 \",\r\n" + 
				"        \"durationVal\": \"17 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"18 \",\r\n" + 
				"        \"durationVal\": \"18 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"19 \",\r\n" + 
				"        \"durationVal\": \"19 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"20 \",\r\n" + 
				"        \"durationVal\": \"20 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"21 \",\r\n" + 
				"        \"durationVal\": \"21 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"22 \",\r\n" + 
				"        \"durationVal\": \"22 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"23 \",\r\n" + 
				"        \"durationVal\": \"23 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"24 \",\r\n" + 
				"        \"durationVal\": \"24 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"25 \",\r\n" + 
				"        \"durationVal\": \"25 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"26 \",\r\n" + 
				"        \"durationVal\": \"26 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"27 \",\r\n" + 
				"        \"durationVal\": \"27 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"28 \",\r\n" + 
				"        \"durationVal\": \"28 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"29 \",\r\n" + 
				"        \"durationVal\": \"29 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"durationCode\": \"30 \",\r\n" + 
				"        \"durationVal\": \"30 \",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getPmsEmpCls() {
		// TODO Auto-generated method stub
		return "{\r\n" + 
				"    \"pernr\": \"00000002\",\r\n" + 
				"    \"classx\": \"1\",\r\n" + 
				"    \"grade\": \"DP\",\r\n" + 
				"    \"errorStatus\": null\r\n" + 
				"}";
	}

	public String getTrnSubmit() {
		// TODO Auto-generated method stub
		return "{\r\n" + 
		"    \"msg\": \"Success\"\r\n" + 
		"}";
	}

	public String getAlotPropertyTypeList() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"typName\": \"Residential\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"typVal\": \"OFF\",\r\n" + 
				"        \"typName\": \"Office\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"typVal\": \"LND\",\r\n" + 
				"        \"typName\": \"Land\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"typVal\": \"HH\",\r\n" + 
				"        \"typName\": \"Holiday Home\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getAlotPropertyList() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"0005\",\r\n" + 
				"        \"propName\": \"MUMBAI PROPERTY 5\",\r\n" + 
				"        \"propLoc\": \"SHIRDI\",\r\n" + 
				"        \"propAdd\": \"SUN-N-SAND, VILLAGE-NIGHOJ TAL. KOPERGAON\",\r\n" + 
				"        \"propComm\": \"\",\r\n" + 
				"        \"propConn\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"0006\",\r\n" + 
				"        \"propName\": \"MUMBAI PROPERTY 6\",\r\n" + 
				"        \"propLoc\": \"BANDRA\",\r\n" + 
				"        \"propAdd\": \"BANDRA BANDRA\",\r\n" + 
				"        \"propComm\": \"\",\r\n" + 
				"        \"propConn\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"MUMB100007\",\r\n" + 
				"        \"propName\": \"Moraj\",\r\n" + 
				"        \"propLoc\": \"Moraj\",\r\n" + 
				"        \"propAdd\": \"Moraj Moraj\",\r\n" + 
				"        \"propComm\": \"\",\r\n" + 
				"        \"propConn\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"VIM001\",\r\n" + 
				"        \"propName\": \"test mumbai, 12334566\",\r\n" + 
				"        \"propLoc\": \"\",\r\n" + 
				"        \"propAdd\": \"test mumbai, 12334566, yeyyyy \",\r\n" + 
				"        \"propComm\": \"\",\r\n" + 
				"        \"propConn\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"MUMB10001\",\r\n" + 
				"        \"propName\": \"Kalyani RBI officers quarters\",\r\n" + 
				"        \"propLoc\": \"Shivajinagar\",\r\n" + 
				"        \"propAdd\": \"Ganeshkhind rd Shivajinagar\",\r\n" + 
				"        \"propComm\": \"Car\",\r\n" + 
				"        \"propConn\": \"None\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"MUMB10002\",\r\n" + 
				"        \"propName\": \"Ashiyana RBI officers quarters\",\r\n" + 
				"        \"propLoc\": \"Gokhale Nagar\",\r\n" + 
				"        \"propAdd\": \"390 Gokhale nagar rd \",\r\n" + 
				"        \"propComm\": \"Bus\",\r\n" + 
				"        \"propConn\": \"None\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"MUMB10003\",\r\n" + 
				"        \"propName\": \"Teesta RBI officers quarters\",\r\n" + 
				"        \"propLoc\": \"Shivajinagar\",\r\n" + 
				"        \"propAdd\": \"Ganeshkhind rd Shivajinagar\",\r\n" + 
				"        \"propComm\": \"Train\",\r\n" + 
				"        \"propConn\": \"None\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"MUMB10004\",\r\n" + 
				"        \"propName\": \"Gomati RBI Staff quarters\",\r\n" + 
				"        \"propLoc\": \"Shivajinagar\",\r\n" + 
				"        \"propAdd\": \"Ganeshkhind rd Shivajinagar\",\r\n" + 
				"        \"propComm\": \"Plane\",\r\n" + 
				"        \"propConn\": \"None\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"0110\",\r\n" + 
				"        \"propName\": \"RBI Kurla Q\",\r\n" + 
				"        \"propLoc\": \"Kurla Mumbai\",\r\n" + 
				"        \"propAdd\": \"Kurla 1 Kurla 2\",\r\n" + 
				"        \"propComm\": \"\",\r\n" + 
				"        \"propConn\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"typVal\": \"RES\",\r\n" + 
				"        \"propId\": \"BANGHH1\",\r\n" + 
				"        \"propName\": \"test case 1\",\r\n" + 
				"        \"propLoc\": \"\",\r\n" + 
				"        \"propAdd\": \"test mumbai , test 12345 test 543221\",\r\n" + 
				"        \"propComm\": \"\",\r\n" + 
				"        \"propConn\": \"\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getAlotLocationTypeList() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"AGAR\",\r\n" + 
				"        \"locName\": \"Agartala\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"AHMD\",\r\n" + 
				"        \"locName\": \"Ahmedabad\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"AIZA\",\r\n" + 
				"        \"locName\": \"Aizawl\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"BANG\",\r\n" + 
				"        \"locName\": \"Bangalore\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"BHOP\",\r\n" + 
				"        \"locName\": \"Bhopal\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"BUBA\",\r\n" + 
				"        \"locName\": \"Bhubaneswar\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"CGHR\",\r\n" + 
				"        \"locName\": \"Chandigarh\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"CHEN\",\r\n" + 
				"        \"locName\": \"Chennai\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"DDUN\",\r\n" + 
				"        \"locName\": \"Dehradun\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"DELH\",\r\n" + 
				"        \"locName\": \"New Delhi\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"DICG\",\r\n" + 
				"        \"locName\": \"Mumbai-DICGC\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"GANG\",\r\n" + 
				"        \"locName\": \"Gangtok\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"GUWA\",\r\n" + 
				"        \"locName\": \"Guwahati\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"HYDE\",\r\n" + 
				"        \"locName\": \"Hyderabad\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"IMPH\",\r\n" + 
				"        \"locName\": \"Imphal\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"JAIP\",\r\n" + 
				"        \"locName\": \"Jaipur\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"JMMU\",\r\n" + 
				"        \"locName\": \"Jammu\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"KANP\",\r\n" + 
				"        \"locName\": \"Kanpur\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"KCHI\",\r\n" + 
				"        \"locName\": \"Kochi\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"KOLK\",\r\n" + 
				"        \"locName\": \"Kolkata\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"LUCK\",\r\n" + 
				"        \"locName\": \"Lucknow\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"MUMB\",\r\n" + 
				"        \"locName\": \"Mumbai\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"NAGP\",\r\n" + 
				"        \"locName\": \"Nagpur\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"NMUM\",\r\n" + 
				"        \"locName\": \"Navi Mumbai\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"PATN\",\r\n" + 
				"        \"locName\": \"Patna\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"PNJI\",\r\n" + 
				"        \"locName\": \"Panaji\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"PUNE\",\r\n" + 
				"        \"locName\": \"Pune\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"RAIP\",\r\n" + 
				"        \"locName\": \"Raipur\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"RCHI\",\r\n" + 
				"        \"locName\": \"Ranchi\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"SHIM\",\r\n" + 
				"        \"locName\": \"Shimla\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"SILO\",\r\n" + 
				"        \"locName\": \"Shillong\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"SRIN\",\r\n" + 
				"        \"locName\": \"Srinagar\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"pernr\": null,\r\n" + 
				"        \"locVal\": \"THIR\",\r\n" + 
				"        \"locName\": \"Thiruvananthapuram\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getAlotPropertyAmenties() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Swimming Pool -1\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Indoor Stadium / Badminton Court\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Gymnasium\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Provisional / Departmental Stores\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"ATM\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Creche (Day / Baby Care Centres)\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Library\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Lift\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Swimming Pool -2\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Community Hall - 1\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Community Hall - 2\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Community Hall - 3\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Community Hall - 4\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Dispensary\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Club House\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"amntyTyp\": \"\",\r\n" + 
				"        \"amntyDesc\": \"Play Ground\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getAlotUnitDetails() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"bldgName\": \"A\",\r\n" + 
				"        \"flatNo\": \"1\",\r\n" + 
				"        \"status\": \"Available\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"bldgName\": \"A\",\r\n" + 
				"        \"flatNo\": \"2\",\r\n" + 
				"        \"status\": \"Available\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"bldgName\": \"A\",\r\n" + 
				"        \"flatNo\": \"3\",\r\n" + 
				"        \"status\": \"Available\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"bldgName\": \"A\",\r\n" + 
				"        \"flatNo\": \"4\",\r\n" + 
				"        \"status\": \"Available\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}

	public String getAlotPropertyImg() {
		// TODO Auto-generated method stub
		return "[\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"fileName\": \"ALT_MUMB10004_0010000041\",\r\n" + 
				"        \"fileContent\": \"data:image/gif;base64,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\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"propId\": null,\r\n" + 
				"        \"fileName\": \"ALT_MUMB10004_0010000042\",\r\n" + 
				"        \"fileContent\": \"data:image/gif;base64,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\",\r\n" + 
				"        \"errorStatus\": null\r\n" + 
				"    }\r\n" + 
				"]";
	}
	
}
