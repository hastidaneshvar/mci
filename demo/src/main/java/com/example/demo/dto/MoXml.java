package com.example.demo.dto;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.ToString;

import java.util.List;


@ToString
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class MoXml {
    @XmlAttribute
    private String fdn;
    private String MOIndex;
    private String className;
    private String isOffline;
    private String latitude;
    private String locationName;
    private String longitude;
    private String matchVersion;
    private String name;
    private String neID;
    private String neType;
    private String neVersion;
    private String realLatitude;
    private String realLongitude;
    private String vendorName;
    private String DaylightSaveInfo;
    private String TimeZone;
    private String ADJNODENAME;
    private String ANI;
    private String NODEBID;
    private String NODET;
    private String TRANST;
    private String CELLID;
    private String CONNQHYST1S;
    private String CONNQHYST2S;
    private String CONNSINTERSEARCH;
    private String CONNSINTRASEARCH;
    private String IDLEQHYST1S;
    private String IDLEQHYST2S;
    private String IDLESINTERSEARCH;
    private String IDLESINTRASEARCH;
    private String INTERFREQTRESELSCALINGFACTOR;
    private String INTERRATTRESELSCALINGFACTOR;
    private String LOGICRNCID;
    private String MAXALLOWEDULTXPOWER;
    private String NONHCSIND;
    private String QHYST1SFACH;
    private String QHYST1SPCH;
    private String QHYST2SFACH;
    private String QHYST2SPCH;
    private String QQUALMIN;
    private String QRXLEVMIN;
    private String QRXLEVMINEXTSUP;
    private String QUALMEAS;
    private String SPEEDDEPENDENTSCALINGFACTOR;
    private String SSEARCHRAT;
    private String TRESELECTIONS;
    private String TRESELECTIONSFACH;
    private String TRESELECTIONSPCH;
    private String BLINDHOFLAG;
    private String DRDECN0THRESHHOLD;
    private String CIOOFFSET;
    private String GSMCELLINDEX;
    private String MBDRFLAG;
    private String MBDRPRIO;
    private String NPRIOFLAG;
    private String QOFFSET1SN;
    private String RNCID;
    private String SIB11IND;
    private String SIB12IND;
    private String TEMPOFFSET1;
    private String TPENALTYHCSRESELECT;
    private String IDLEQOFFSET1SN;
    private String IDLEQOFFSET2SN;
    private String NCELLID;
    private String NCELLRNCID;
    private String NRNCID;
    private String CNOPERATORID;
    private String ENODEBFUNCTIONNAME;
    private String NBIOTTAFLAG;
    private String TAC;
    private String TRACKINGAREAID;


    @XmlElement(name = "MO")
    private List<MoXml> moXmlList;
}
