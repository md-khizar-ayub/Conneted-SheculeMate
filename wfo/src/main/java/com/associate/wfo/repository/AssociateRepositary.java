package com.associate.wfo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.associate.wfo.model.Associate;

import jakarta.transaction.Transactional;



@Repository
public interface AssociateRepositary extends JpaRepository<Associate, Integer>{
	@Transactional
	@Modifying
    @Query("UPDATE Associate a SET a.day1 = :day1, a.day2 = :day2, a.day3 = :day3, a.day4 = :day4, a.day5 = :day5, a.day6 = :day6, a.day7 = :day7, a.day8 = :day8, a.submiteddate = :submiteddate WHERE a.associateId = :associateId AND a.month = :month")
    void updateAssociateDays(@Param("associateId") int associateId, @Param("month") String month,@Param("submiteddate") String submiteddate, @Param("day1") Date day1, @Param("day2") Date day2, @Param("day3") Date day3, @Param("day4") Date day4, @Param("day5") Date day5, @Param("day6") Date day6, @Param("day7") Date day7, @Param("day8") Date day8);

	
	@Query("Select count(*) from Associate a WHERE a.associateId = :associateId AND a.month = :month")
	int findBydateAndAssociateId(@Param("associateId") int associateId, @Param("month") String month);
	
	@Query("SELECT " +
	        "a.month, " +
	        "COUNT(CASE WHEN a.day1 IS NOT NULL AND a.day2 IS NOT NULL AND a.day3 IS NOT NULL AND a.day4 IS NOT NULL AND a.day5 IS NOT NULL AND a.day6 IS  NULL AND a.day7 IS  NULL AND a.day8 IS  NULL THEN 5 END) AS five_day_count, " +
	        "COUNT(CASE WHEN a.day1 IS NOT NULL AND a.day2 IS NOT NULL AND a.day3 IS NOT NULL AND a.day4 IS NOT NULL AND a.day5 IS NOT NULL AND a.day6 IS NOT NULL AND a.day7 IS NOT NULL AND a.day8 IS NOT NULL THEN 8 END) AS eight_day_count " +
	        "FROM Associate a " +
	        "GROUP BY a.month "+
	        "ORDER BY a.month ASC ")
	List<Object[]> findAssociateCountsByMonth();
}
