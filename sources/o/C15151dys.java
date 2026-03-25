package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15151dys {
    public static final java.lang.String KWHzl(java.lang.String str, long j) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna().OLrzqt(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna().OLrzqt(str), j);
    }

    public static /* synthetic */ void dappTxReport$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "NO";
        }
        AEQbTJ(str, str2, str3, str4, str5, str6);
    }

    public static final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        try {
            EventData eventData = new EventData();
            eventData.setAct("web3_discover_tx");
            ReportManager reportManager = ReportManager.AEQbTJ;
            eventData.setAttribute(C56424yEw.djBIcL(C56390yDp.OLrzqt("full_url", str), C56390yDp.OLrzqt("chain_id", str2), C56390yDp.OLrzqt("attr_1", str5), C56390yDp.OLrzqt("attr_2", str3), C56390yDp.OLrzqt("attr_3", str4), C56390yDp.OLrzqt("attr_4", str6)));
            reportManager.EZpvd(eventData);
        } catch (java.lang.Exception unused) {
        }
    }

    public static /* synthetic */ void dappReport$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        }
        if ((i & 64) != 0) {
            str7 = "";
        }
        if ((i & 128) != 0) {
            str8 = "";
        }
        KWHzl(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public static final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        try {
            EventData eventData = new EventData();
            eventData.setAct("web3_discover_log");
            ReportManager reportManager = ReportManager.AEQbTJ;
            eventData.setAttribute(C56424yEw.djBIcL(C56390yDp.OLrzqt("full_url", str), C56390yDp.OLrzqt("attr_1", str2), C56390yDp.OLrzqt("attr_2", str3), C56390yDp.OLrzqt("attr_3", str4), C56390yDp.OLrzqt("attr_4", str5), C56390yDp.OLrzqt("attr_5", str6), C56390yDp.OLrzqt("mem_a", str7), C56390yDp.OLrzqt("mem_u", str8)));
            reportManager.EZpvd(eventData);
        } catch (java.lang.Exception unused) {
        }
    }

    public static /* synthetic */ void dappUopStartLoopReport$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        copydefault(str, str2, str3);
    }

    public static final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            EventData eventData = new EventData();
            eventData.setAct("web3_discover_log");
            eventData.setMsg("loopStart");
            ReportManager reportManager = ReportManager.AEQbTJ;
            eventData.setAttribute(C56424yEw.djBIcL(C56390yDp.OLrzqt("chain_id", str), C56390yDp.OLrzqt("attr_2", str2), C56390yDp.OLrzqt("attr_3", str3), C56390yDp.OLrzqt("walletType", "7")));
            reportManager.EZpvd(eventData);
        } catch (java.lang.Exception unused) {
        }
    }

    public static /* synthetic */ void dappUopEndLoopReport$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        }
        if ((i & 64) != 0) {
            str7 = "";
        }
        if ((i & 128) != 0) {
            str8 = "";
        }
        copydefault(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public static final void copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            EventData eventData = new EventData();
            eventData.setAct("web3_discover_log");
            eventData.setMsg("loopEnd");
            ReportManager reportManager = ReportManager.AEQbTJ;
            eventData.setAttribute(C56424yEw.djBIcL(C56390yDp.OLrzqt("chain_id", str), C56390yDp.OLrzqt("attr_1", str2), C56390yDp.OLrzqt("attr_2", str3), C56390yDp.OLrzqt("attr_3", str4), C56390yDp.OLrzqt("attr_4", str5), C56390yDp.OLrzqt("attr_5", str6), C56390yDp.OLrzqt("payment_channel", str7), C56390yDp.OLrzqt("type", str8), C56390yDp.OLrzqt("walletType", "7")));
            reportManager.EZpvd(eventData);
        } catch (java.lang.Exception unused) {
        }
    }
}
