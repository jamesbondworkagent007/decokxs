package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;

/* JADX INFO: renamed from: o.sSc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44500sSc {
    public static final C44500sSc AEQbTJ = new C44500sSc();

    private C44500sSc() {
    }

    public final void KWHzl(AbstractC57572yku abstractC57572yku) {
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_WebSocket_Connect");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isAppDebuggable", java.lang.Integer.toHexString(abstractC57572yku != null ? abstractC57572yku.hashCode() : 0))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void EZpvd(AbstractC57572yku abstractC57572yku) {
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_WebSocket_Disconnect");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isAppDebuggable", java.lang.Integer.toHexString(abstractC57572yku != null ? abstractC57572yku.hashCode() : 0))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void copydefault(AbstractC57572yku abstractC57572yku) {
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_WebSocket_Close");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isAppDebuggable", java.lang.Integer.toHexString(abstractC57572yku != null ? abstractC57572yku.hashCode() : 0))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void AEQbTJ(AbstractC57572yku abstractC57572yku) {
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_WebSocket_Open");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isAppDebuggable", java.lang.Integer.toHexString(abstractC57572yku != null ? abstractC57572yku.hashCode() : 0))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void OLrzqt(AbstractC57572yku abstractC57572yku) {
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_WebSocket_Failure");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isAppDebuggable", java.lang.Integer.toHexString(abstractC57572yku != null ? abstractC57572yku.hashCode() : 0))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }
}
