package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47220tlt {
    public static final C47220tlt KWHzl = new C47220tlt();

    private C47220tlt() {
    }

    public static /* synthetic */ void log$default(C47220tlt c47220tlt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        c47220tlt.copydefault(str, str2, str3, str4);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ReportManager.AEQbTJ.EZpvd(setUpEventData$default(this, str, null, str4, str2, str3, 2, null));
    }

    public static /* synthetic */ EventData setUpEventData$default(C47220tlt c47220tlt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
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
        return c47220tlt.copydefault(str, str2, str3, str4, str5);
    }

    public final EventData copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        EventData eventData = new EventData();
        eventData.setAct("okrisklibrary_operation_exception");
        eventData.setSource(str);
        eventData.setPath(str2);
        eventData.setCode(str3);
        eventData.setMsg(str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MetricsSQLiteCacheKt.METRICS_START_TIME, str5);
        eventData.setAttrs(linkedHashMap);
        return eventData;
    }
}
