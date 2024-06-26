package com.RedBus.User.Controller;

import com.RedBus.Operators.entity.BusOperator;
import com.RedBus.Operators.payload.BusOperatorDto;
import com.RedBus.User.Payload.BusListDto;
import com.RedBus.User.Service.SearchBusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class FindBusesController {
    @Autowired
    private SearchBusesService searchBusesService;


    //http://localhost:8080/api/user/searchbuses?departureCity=?arrivalCity=?departureDate=
    @GetMapping("/searchBuses")public List<BusListDto> searchBuses(
          @RequestParam("departureCity") String departureCity,
          @RequestParam("arrivalCity") String arrivalCity,
         @RequestParam("departureDate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date departureDate){
      List<BusListDto> busListDtos = searchBusesService.searchBuses(departureCity, arrivalCity, departureDate);
     return  busListDtos;
   }

}


