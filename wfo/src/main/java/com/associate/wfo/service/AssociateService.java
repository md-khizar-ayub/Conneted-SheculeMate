package com.associate.wfo.service;

import java.util.List;

import com.associate.wfo.model.Associate;
import com.associate.wfo.model.MonthlyCounts;

public interface AssociateService {
 public Associate datesSubmite(Associate associate);

public List<Associate> getallassociatesdates();

public List<MonthlyCounts> findAssociateCountsByMonth();
}
