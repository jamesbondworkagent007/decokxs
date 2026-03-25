package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pQg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38209pQg {
    public static final C38209pQg copydefault = new C38209pQg();

    private C38209pQg() {
    }

    public static /* synthetic */ void reportKycFlow$default(C38209pQg c38209pQg, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = "";
        }
        c38209pQg.copydefault(str, str2, str3, z2, str4);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        EventData eventData = new EventData();
        eventData.setAct("event_kyc_in_house_flow");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("attr_1", str);
        linkedHashMap.put("attr_2", str2);
        linkedHashMap.put("attr_3", str3);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "id_confirm") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "selfie_confirm")) {
            linkedHashMap.put("attr_4", z ? "true" : "false");
            if (z) {
                str4 = "";
            }
            linkedHashMap.put("attr_5", str4);
        }
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }
}
