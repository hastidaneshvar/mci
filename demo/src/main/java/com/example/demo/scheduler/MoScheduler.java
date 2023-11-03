package com.example.demo.scheduler;

import com.example.demo.service.XmlParserService;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MoScheduler {

    final private XmlParserService xmlParserService;

    @Autowired
    public MoScheduler(final XmlParserService xmlParserService) {
        this.xmlParserService = xmlParserService;
    }


    @Scheduled(fixedRate = 5000)
    private void readMo() throws JAXBException {
        xmlParserService.parse();

    }
}
