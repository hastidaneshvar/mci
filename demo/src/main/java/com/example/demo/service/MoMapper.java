package com.example.demo.service;

import com.example.demo.dto.MoXml;
import com.example.demo.model.Mo;

public class MoMapper {

    public static MoMapper INSTANCE = new MoMapper();

    private MoMapper() {
    }

    public Mo convert(final MoXml request, final Long parentId) {
        return Mo.builder()

                .parentId(parentId)
                .fdn(request.getFdn())
                .MOIndex(request.getMOIndex())
                .className(request.getClassName())
                .isOffline(request.getIsOffline())
                .locationName(request.getLocationName())
                .longitude(request.getLongitude())
                .matchVersion(request.getMatchVersion())
                .name(request.getName())
                .neID(request.getNeID())
                .neType(request.getNeType())
                .neVersion(request.getNeVersion())
                .realLatitude(request.getRealLatitude())
                .realLongitude(request.getRealLongitude())
                .vendorName(request.getVendorName())
                .DaylightSaveInfo(request.getDaylightSaveInfo())
                .TimeZone(request.getTimeZone())
                .ADJNODENAME(request.getADJNODENAME())
                .ANI(request.getANI())
                .NODEBID(request.getNODEBID())
                .NODET(request.getNODET())
                .TRANST(request.getTRANST())
                .CELLID(request.getCELLID())
                .CONNQHYST1S(request.getCONNQHYST1S())
                .CONNQHYST2S(request.getCONNQHYST2S())
                .CONNSINTERSEARCH(request.getCONNSINTERSEARCH())
                .CONNSINTRASEARCH(request.getCONNSINTRASEARCH())
                .IDLEQHYST1S(request.getIDLEQHYST1S())
                .IDLEQHYST2S(request.getIDLEQHYST2S())
                .IDLESINTERSEARCH(request.getIDLESINTERSEARCH())
                .IDLESINTRASEARCH(request.getIDLESINTRASEARCH())
                .INTERFREQTRESELSCALINGFACTOR(request.getINTERFREQTRESELSCALINGFACTOR())
                .INTERRATTRESELSCALINGFACTOR(request.getINTERRATTRESELSCALINGFACTOR())
                .LOGICRNCID(request.getLOGICRNCID())
                .MAXALLOWEDULTXPOWER(request.getMAXALLOWEDULTXPOWER())
                .NONHCSIND(request.getNONHCSIND())
                .QHYST1SFACH(request.getQHYST1SFACH())
                .QHYST1SPCH(request.getQHYST1SPCH())
                .QHYST2SFACH(request.getQHYST2SFACH())
                .QHYST2SPCH(request.getQHYST2SPCH())
                .QQUALMIN(request.getQQUALMIN())
                .QRXLEVMIN(request.getQRXLEVMIN())
                .QRXLEVMINEXTSUP(request.getQRXLEVMINEXTSUP())
                .QUALMEAS(request.getQUALMEAS())
                .SPEEDDEPENDENTSCALINGFACTOR(request.getSPEEDDEPENDENTSCALINGFACTOR())
                .SSEARCHRAT(request.getSSEARCHRAT())
                .TRESELECTIONS(request.getTRESELECTIONS())
                .TRESELECTIONSFACH(request.getTRESELECTIONSFACH())
                .TRESELECTIONSPCH(request.getTRESELECTIONSPCH())
                .BLINDHOFLAG(request.getBLINDHOFLAG())
                .DRDECN0THRESHHOLD(request.getDRDECN0THRESHHOLD())
                .CIOOFFSET(request.getCIOOFFSET())
                .GSMCELLINDEX(request.getGSMCELLINDEX())
                .MBDRFLAG(request.getMBDRFLAG())
                .MBDRPRIO(request.getMBDRPRIO())
                .NPRIOFLAG(request.getNPRIOFLAG())
                .QOFFSET1SN(request.getQOFFSET1SN())
                .RNCID(request.getRNCID())
                .SIB11IND(request.getSIB11IND())
                .SIB12IND(request.getSIB12IND())
                .TEMPOFFSET1(request.getTEMPOFFSET1())
                .TPENALTYHCSRESELECT(request.getTPENALTYHCSRESELECT())
                .IDLEQOFFSET1SN(request.getIDLEQOFFSET1SN())
                .IDLEQOFFSET2SN(request.getIDLEQOFFSET2SN())
                .NCELLID(request.getNCELLID())
                .NCELLRNCID(request.getNCELLRNCID())
                .NRNCID(request.getNRNCID())
                .CNOPERATORID(request.getCNOPERATORID())
                .ENODEBFUNCTIONNAME(request.getENODEBFUNCTIONNAME())
                .NBIOTTAFLAG(request.getNBIOTTAFLAG())
                .TAC(request.getTAC())
                .TRACKINGAREAID(request.getTRACKINGAREAID()).build();


    }
}
