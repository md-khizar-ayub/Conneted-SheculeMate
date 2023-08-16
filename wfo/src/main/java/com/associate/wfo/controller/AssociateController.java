package com.associate.wfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.associate.wfo.model.Associate;
import com.associate.wfo.model.MonthlyCounts;
import com.associate.wfo.service.AssociateService;

@RestController
@RequestMapping("/associate")
@CrossOrigin
public class AssociateController {

	@Autowired
	private AssociateService associateService;

	@PostMapping(value = "/datessubmite", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> datesSubmite(@RequestBody Associate associate) {
		associateService.datesSubmite(associate);
		return ResponseEntity.ok("New user added");

	}

	@GetMapping(value = "/getallassociatesdates", consumes = "application/json", produces = "application/json")
	public List<Associate> getallassociatesdates() {
		List<Associate> allassociatesdates = associateService.getallassociatesdates();
		return allassociatesdates;

	}

	@GetMapping(value = "/getallassociatesmonth", consumes = "application/json", produces = "application/json")
	public List<MonthlyCounts> getMonthlyCounts() {
		List<MonthlyCounts> monthlyCounts = associateService.findAssociateCountsByMonth();
		return monthlyCounts;
	}
}
