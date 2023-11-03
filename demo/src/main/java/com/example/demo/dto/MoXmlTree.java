package com.example.demo.dto;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@XmlRootElement(name = "MOTree")
public class MoXmlTree {

    @XmlElement(name="MO")
    private List<MoXml> moXmls;
}
