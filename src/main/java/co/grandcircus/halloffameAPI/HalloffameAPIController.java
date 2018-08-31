package co.grandcircus.halloffameAPI;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.halloffameAPI.model.Complete;
import co.grandcircus.halloffameAPI.model.InnovationResult;
import co.grandcircus.halloffameAPI.model.Tiny;

@Controller
public class HalloffameAPIController {
	
//	private static final String url ="https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
	
	@RequestMapping("/complete")
	public ModelAndView showComplete() {
		
		ModelAndView mav = new ModelAndView("complete");
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<InnovationResult> response = restTemplate.exchange("https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", HttpMethod.GET, new HttpEntity<>(null), InnovationResult.class);
		
		
		
		
		InnovationResult result = response.getBody();
		List<Complete> complete = result.getComplete();
		   Collections.sort(complete, new Comparator<Complete>() {
		        @Override
		        public int compare(Complete c1,  Complete c2) {
		            return Integer.compare(c1.getYear(), c2.getYear());
		        }
		    });
		    
		mav.addObject("completeresult", result.getComplete());
		
		return mav;
	}
	
	@RequestMapping("/tiny")
	public ModelAndView showTiny() {
		
		ModelAndView mav = new ModelAndView("tiny");
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<InnovationResult> response = restTemplate.exchange("https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", HttpMethod.GET, new HttpEntity<>(null), InnovationResult.class);
		
		
		InnovationResult result = response.getBody();
		
		List<Tiny> tinyresult = result.getTiny();
		   Collections.sort(tinyresult, new Comparator<Tiny>() {
		        @Override
		        public int compare(Tiny t1,  Tiny t2) {
		            return Integer.compare(t1.getYear(), t2.getYear());
		        }
		    });
		
		mav.addObject("tinyresult", result.getTiny());
		
		return mav;
	}
	
	
	
}
