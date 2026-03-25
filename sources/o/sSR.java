package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSR {
    public static final void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg(str);
        eventDataAEQbTJ.setAttrs(map);
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }
}
