package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7843arV {
    public static final C7843arV EZpvd = new C7843arV();

    private C7843arV() {
    }

    public final void EZpvd(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("attr_1", str2);
        linkedHashMap.put("type", "isHitDiff");
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("attr_2", str3);
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("attr_3", str4);
        if (str == null) {
            str = "";
        }
        OLrzqt(str, str5, linkedHashMap);
    }

    public final void EZpvd(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put("attr_1", "0");
        } else {
            linkedHashMap.put("attr_1", "1");
        }
        linkedHashMap.put("type", "fusionResult");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("attr_2", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("attr_3", str3);
        if (str == null) {
            str = "";
        }
        OLrzqt(str, str4, linkedHashMap);
    }

    public static /* synthetic */ void reportEvent$default(C7843arV c7843arV, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c7843arV.OLrzqt(str, str2, map);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        EventData eventData = new EventData();
        eventData.setAct("app_finance_monitor");
        eventData.setSource(str);
        eventData.setCode("0");
        if (str2 != null) {
            eventData.setMsg(EZpvd.KWHzl() + " " + str2);
        }
        eventData.setAttrs(map);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final java.lang.String KWHzl() {
        return C34703nhO.AEQbTJ() ? "【OKX_TR】" : "【OKX】";
    }
}
