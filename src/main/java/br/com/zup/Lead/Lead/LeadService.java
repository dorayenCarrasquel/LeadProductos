package br.com.zup.Lead.Lead;

import br.com.zup.Lead.Lead.Dtos.LeadDto;
import br.com.zup.Lead.Lead.Dtos.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
   private List<LeadDto> leadDtoList = new ArrayList<>();


    public LeadDto salvarLead(LeadDto leadDto){
        leadDtoList.add(leadDto);
        return leadDto;
    }




}
