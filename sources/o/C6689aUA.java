package o;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6689aUA {
    public static final C6689aUA KWHzl = new C6689aUA();

    private C6689aUA() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.aUA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEventOfSdkError$default(C6689aUA c6689aUA, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
        java.lang.String str5 = (i & 4) != 0 ? "" : str3;
        java.lang.String str6 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            map = C56424yEw.KWHzl();
        }
        c6689aUA.KWHzl(str, str2, str5, str6, map);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        try {
            EventData eventData = new EventData();
            eventData.setAct(MTAnalysisConstants.Account.KEY_ACCOUNT);
            eventData.setSource("sdk_error");
            if (str3 == null) {
                str3 = "";
            }
            eventData.setCode(str3);
            if (str4 == null) {
                str4 = "";
            }
            eventData.setMsg(str4);
            eventData.setAttrs(C56424yEw.OLrzqt(map, C56424yEw.djBIcL(C56390yDp.OLrzqt("type", str), C56390yDp.OLrzqt("page", str2))));
            ReportManager.AEQbTJ.EZpvd(eventData);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void EZpvd() {
        pUU.KWHzl("GrafanaReporter", "Credential Manager registered: " + C7857arj.AEQbTJ());
        boolean zGEmmrt = C59449zhJ.gEmmrt(C7857arj.AEQbTJ(), MTPushConstants.Manufacturer.XIAOMI, true);
        boolean zGEmmrt2 = C59449zhJ.gEmmrt(C7857arj.AEQbTJ(), MTPushConstants.Manufacturer.OPPO, true);
        if (zGEmmrt || zGEmmrt2) {
            try {
                EventData eventData = new EventData();
                eventData.setAct(MTAnalysisConstants.Account.KEY_ACCOUNT);
                eventData.setSource("cred_man_reg");
                eventData.setMsg(C7857arj.AEQbTJ());
                ReportManager.AEQbTJ.EZpvd(eventData);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
