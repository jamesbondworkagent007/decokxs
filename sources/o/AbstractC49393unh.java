package o;

import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49393unh extends wXX {
    public java.lang.String ejfBZ = "OKTrade-Track-Report";
    public long fARcdN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AYXKKw() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String djBIcL() {
        return "OKTrackBottomSheet";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void o_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.fARcdN = java.lang.System.currentTimeMillis();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (Map.Entry<java.lang.String, java.lang.String> entry : AhwBna().entrySet()) {
            stringBuffer.append(((java.lang.Object) entry.getKey()) + ":" + ((java.lang.Object) entry.getValue()) + "  ");
        }
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", "view_dialog"), C56390yDp.OLrzqt("page", C33129mqd.gEmmrt(djBIcL())), C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, "enter"), C56390yDp.OLrzqt("extra_params", stringBuffer.toString()));
        if (AYXKKw().length() == 0) {
            o_("OKTrade-Track-Report");
        }
        C49401unp.OLrzqt.KWHzl(mapGEmmrt, AYXKKw());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        java.lang.String strDivS$default = C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.fARcdN), 1000, null, null, null, 14, null);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (Map.Entry<java.lang.String, java.lang.String> entry : gEmmrt().entrySet()) {
            stringBuffer.append(((java.lang.Object) entry.getKey()) + ":" + ((java.lang.Object) entry.getValue()) + "  ");
        }
        if (AYXKKw().length() == 0) {
            o_("OKTrade-Track-Report");
        }
        C49401unp.OLrzqt.KWHzl(C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", "view_dialog"), C56390yDp.OLrzqt("page", djBIcL()), C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, EopTrackEvent.EXIT), C56390yDp.OLrzqt("view_time", strDivS$default + " s"), C56390yDp.OLrzqt("extra_params", stringBuffer.toString())), AYXKKw());
    }

    public java.util.Map<java.lang.String, java.lang.String> AhwBna() {
        return C56424yEw.KWHzl();
    }

    public java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
        return C56424yEw.KWHzl();
    }
}
