package o;

import o.AbstractC33384mvT;

/* JADX INFO: renamed from: o.mvE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33369mvE {
    public final java.lang.String copydefault = "AppModeSwitchView";

    public final AbstractC33384mvT OLrzqt() {
        try {
            if (C33367mvC.valueOf()) {
                InterfaceC33237msf interfaceC33237msf = (InterfaceC33237msf) C43251rlk.OLrzqt(InterfaceC33237msf.class);
                if (interfaceC33237msf == null) {
                    return AbstractC33384mvT.Application.AEQbTJ;
                }
                if (interfaceC33237msf.AEQbTJ()) {
                    return AbstractC33384mvT.Activity.KWHzl;
                }
                return AEQbTJ();
            }
            InterfaceC33233msb interfaceC33233msb = (InterfaceC33233msb) C43251rlk.OLrzqt(InterfaceC33233msb.class);
            if (interfaceC33233msb == null) {
                return AbstractC33384mvT.Application.AEQbTJ;
            }
            if (C33431mwN.EZpvd.EZpvd()) {
                pUU.copydefault(this.copydefault, "isSegmentViewAdaptableEnabled is true, " + interfaceC33233msb.copydefault());
                int size = interfaceC33233msb.copydefault().size();
                if (size == 0 || size == 1) {
                    return AbstractC33384mvT.Application.AEQbTJ;
                }
                if (size == 2) {
                    return AbstractC33384mvT.TaskDescription.EZpvd;
                }
                return AbstractC33384mvT.Activity.KWHzl;
            }
            pUU.copydefault(this.copydefault, "isSegmentViewAdaptableEnabled is false, " + interfaceC33233msb.copydefault() + ", " + interfaceC33233msb.AEQbTJ());
            if (interfaceC33233msb.AEQbTJ()) {
                return AbstractC33384mvT.Activity.KWHzl;
            }
            return AEQbTJ();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(this.copydefault, "Error in setupConfigCollector", e);
            return AbstractC33384mvT.Application.AEQbTJ;
        }
    }

    public final AbstractC33384mvT AEQbTJ() {
        if (C33367mvC.djBIcL() && ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).copydefault(3)) {
            return AbstractC33384mvT.TaskDescription.EZpvd;
        }
        return AbstractC33384mvT.Application.AEQbTJ;
    }
}
