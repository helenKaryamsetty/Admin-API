package com.iemr.admin.controller.vanSpokeMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iemr.admin.service.vanSpokeMapping.VanSpokeMappingService;
import com.iemr.admin.utils.exception.IEMRException;
import com.iemr.admin.utils.response.OutputResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/mapping")
public class VanSpokeMappingController {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Autowired
	private VanSpokeMappingService vanSpokeMappingService;

	/***
	 * @author DU20091017
	 * @param requestObj
	 * @return
	 * @throws IEMRException
	 */
	@CrossOrigin
	@ApiOperation(value = "Save Van and Spoke Mapping", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/save/vanSpokeMapping" }, method = { RequestMethod.POST })
	public String saveBenNCDCareNurseData(@RequestBody String requestObj,
			@RequestHeader(value = "Authorization") String Authorization) throws IEMRException {

		OutputResponse output = new OutputResponse();

		try {
			String response = vanSpokeMappingService.saveVanSpokeMapping(requestObj);

			if (response.equalsIgnoreCase("success"))
				output.setResponse("Mapping done successfully");
			else
				output.setError(5000, "error in mapping van and spoke");
		} catch (Exception e) {
			output.setError(e);
		}

		return output.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Get Van and Spoke Mapping", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/get/vanSpokeMapping" }, method = { RequestMethod.POST })
	public String getVanSpokeMapping(@RequestBody String requestObj,
			@RequestHeader(value = "Authorization") String Authorization) throws IEMRException {
		OutputResponse output = new OutputResponse();

		try {
			String response = vanSpokeMappingService.getVanSpokeMappingDetails(requestObj);
			if (response != null)
				output.setResponse(response);
			else
				output.setError(5000, "error in fetching the van and spoke data");
		} catch (Exception e) {
			output.setError(e);
		}
		return output.toString();
	}

	@CrossOrigin
	@ApiOperation(value = "Delete Van and Spoke Mapping", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/delete/vanSpokeMapping" }, method = { RequestMethod.POST })
	public String deleteVanSpokeMapping(@RequestBody String requestObj,
			@RequestHeader(value = "Authorization") String Authorization) throws IEMRException {
		OutputResponse output = new OutputResponse();

		try {
			String response = vanSpokeMappingService.deleteVanSpokeMapping(requestObj);
			if (response.equalsIgnoreCase("success"))
				output.setResponse("Mapping status got updated");
			else
				output.setError(5000, "Error in deleting mapping");
		} catch (Exception e) {
			output.setError(e);
		}

		return output.toString();
	}
	
	@Deprecated
	@CrossOrigin
	@ApiOperation(value = "update Van and Spoke Mapping", consumes = "application/json", produces = "application/json")
	@RequestMapping(value = { "/update/vanSpokeMapping" }, method = { RequestMethod.POST })
	public String updateVanSpokeMapping(@RequestBody String requestObj,
			@RequestHeader(value = "Authorization") String Authorization) throws IEMRException {
		OutputResponse output = new OutputResponse();

		try {
			String response = vanSpokeMappingService.updateVanSpokeMapping(requestObj);
			if (response.equalsIgnoreCase("success"))
				output.setResponse("Mapping updated successfully");
			else
				output.setError(5000, "Error in updating mapping");
		} catch (Exception e) {
			output.setError(e);
		}

		return output.toString();
	}
}