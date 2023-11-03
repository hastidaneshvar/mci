package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "mo")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PARENT_ID")
    private Long parentId;

    @Column(name = "FDN")
    private String fdn;

    @Column(name = "MO_INDEX")
    private String MOIndex;

    @Column(name = "CLASS_NAME")
    private String className;

    @Column(name = "IS_OFFLINE")
    private String isOffline;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "LOCATION_NAME")
    private String locationName;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "MATCH_VERSION")
    private String matchVersion;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NE_ID")
    private String neID;

    @Column(name = "NE_TYPE")
    private String neType;

    @Column(name = "NE_VERSION")
    private String neVersion;

    @Column(name = "REAL_LATITUDE")
    private String realLatitude;

    @Column(name = "REAL_LONGITUDE")
    private String realLongitude;

    @Column(name = "VENDOR_NAME")
    private String vendorName;

    @Column(name = "DAY_LIGHT_SAVE_INFO")
    private String DaylightSaveInfo;

    @Column(name = "TIME_ZONE")
    private String TimeZone;

    @Column(name = "ADJ_NODE_NAME")
    private String ADJNODENAME;

    @Column(name = "ANI")
    private String ANI;

    @Column(name = "NODEBID")
    private String NODEBID;

    @Column(name = "NODET")
    private String NODET;

    @Column(name = "TRANST")
    private String TRANST;

    @Column(name = "CELL_ID")
    private String CELLID;

    @Column(name = "CONNQHYST1S")
    private String CONNQHYST1S;

    @Column(name = "CONNQHYST2S")
    private String CONNQHYST2S;

    @Column(name = "CONNS_INTER_SEARCH")
    private String CONNSINTERSEARCH;

    @Column(name = "CONNS_INTRA_SEARCH")
    private String CONNSINTRASEARCH;//?

    @Column(name = "ID_LEQHYST1S")
    private String IDLEQHYST1S;

    @Column(name = "ID_LEQHYST2S")
    private String IDLEQHYST2S;

    @Column(name = "ID_LESINTER_SEARCH")
    private String IDLESINTERSEARCH;

    @Column(name = "ID_LESINTRA_SEARCH")
    private String IDLESINTRASEARCH;

    @Column(name = "INTERF_REQTRESEL_SCALING_FACTOR")
    private String INTERFREQTRESELSCALINGFACTOR;

    @Column(name = "INTER_RATTRESEL_SCALING_FACTOR")
    private String INTERRATTRESELSCALINGFACTOR;

    @Column(name = "LOGICRNCID")
    private String LOGICRNCID;

    @Column(name = "MAX_ALL_OWEDULTX_POWER")
    private String MAXALLOWEDULTXPOWER;

    @Column(name = "NONHCSIND")
    private String NONHCSIND;

    @Column(name = "QHYST1SFACH")
    private String QHYST1SFACH;

    @Column(name = "QHYST1SPCH")
    private String QHYST1SPCH;

    @Column(name = "QHYST2SFACH")
    private String QHYST2SFACH;

    @Column(name = "QHYST2SPCH")
    private String QHYST2SPCH;

    @Column(name = "QQUALMIN")
    private String QQUALMIN;

    @Column(name = "QRXLEVMIN")
    private String QRXLEVMIN;

    @Column(name = "QRXLEVMINEXTSUP")
    private String QRXLEVMINEXTSUP;

    @Column(name = "QUALMEAS")
    private String QUALMEAS;

    @Column(name = "SPEEDDEPENDENTSCALINGFACTOR")
    private String SPEEDDEPENDENTSCALINGFACTOR;

    @Column(name = "SSEARCHRAT")
    private String SSEARCHRAT;

    @Column(name = "TRESELECTIONS")
    private String TRESELECTIONS;

    @Column(name = "TRESELECTIONSFACH")
    private String TRESELECTIONSFACH;

    @Column(name = "TRESELECTIONSPCH")
    private String TRESELECTIONSPCH;

    @Column(name = "BLINDHOFLAG")
    private String BLINDHOFLAG;

    @Column(name = "DRDECN0THRESHHOLD")
    private String DRDECN0THRESHHOLD;

    @Column(name = "CIOOFFSET")
    private String CIOOFFSET;

    @Column(name = "GSMCELLINDEX")
    private String GSMCELLINDEX;

    @Column(name = "MBDRFLAG")
    private String MBDRFLAG;

    @Column(name = "MBDRPRIO")
    private String MBDRPRIO;

    @Column(name = "NPRIOFLAG")
    private String NPRIOFLAG;

    @Column(name = "QOFFSET1SN")
    private String QOFFSET1SN;

    @Column(name = "RNCID")
    private String RNCID;

    @Column(name = "SIB11IND")
    private String SIB11IND;

    @Column(name = "SIB12IND")
    private String SIB12IND;

    @Column(name = "TEMPOFFSET1")
    private String TEMPOFFSET1;

    @Column(name = "TPENALTYHCSRESELECT")
    private String TPENALTYHCSRESELECT;

    @Column(name = "IDLEQOFFSET1SN")
    private String IDLEQOFFSET1SN;

    @Column(name = "IDLEQOFFSET2SN")
    private String IDLEQOFFSET2SN;

    @Column(name = "NCELLID")
    private String NCELLID;

    @Column(name = "NCELLRNCID")
    private String NCELLRNCID;

    @Column(name = "NRNCID")
    private String NRNCID;

    @Column(name = "CNOPERATORID")
    private String CNOPERATORID;

    @Column(name = "ENODEBFUNCTIONNAME")
    private String ENODEBFUNCTIONNAME;

    @Column(name = "NBIOTTAFLAG")
    private String NBIOTTAFLAG;

    @Column(name = "TAC")
    private String TAC;

    @Column(name = "TRACKINGAREAID")
    private String TRACKINGAREAID;

}
