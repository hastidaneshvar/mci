package com.example.demo.service;

import com.example.demo.model.MoRepository;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dto.MoXml;
import com.example.demo.dto.MoXmlTree;


import com.example.demo.model.Mo;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.List;


@Service
public class XmlParserService {
    private final MoRepository moRepository;

    @Autowired
    public XmlParserService(MoRepository moRepository) {
        this.moRepository = moRepository;
    }


    public void parse() throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(MoXmlTree.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File("C:\\Users\\VENUS\\Downloads\\po.xml");
        MoXmlTree moTree = (MoXmlTree) unmarshaller.unmarshal(xml);
        List<MoXml> moXmlList = moTree.getMoXmls();
        this.read(moXmlList, null);
    }


    void read(final List<MoXml> moXmls, final Long parentId) {
        if (moXmls != null) {
            for (MoXml moXml : moXmls) {

                Mo moDBObject = null;
                moDBObject = MoMapper.INSTANCE.convert(moXml, parentId);
                moDBObject = moRepository.save(moDBObject);
                System.out.println("object --> " + moDBObject.toString());
                Long pId = moDBObject.getId();

                if (moXml != null && moXml.getMoXmlList() != null)
                    read(moXml.getMoXmlList(), pId);

            }
        }


    }


}
