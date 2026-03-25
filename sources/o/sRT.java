package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRT {
    public static final sRT KWHzl = new sRT();

    private sRT() {
    }

    public final void OLrzqt(@NotNull sRY sry) {
        Intrinsics.checkNotNullParameter(sry, "");
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("Media_Metadata");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("attr_1", sry.AEQbTJ());
        linkedHashMap.put("attr_2", sry.KWHzl());
        linkedHashMap.put("attr_3", sry.EZpvd());
        linkedHashMap.put("type", sry.OLrzqt());
        java.lang.String strCopydefault = sry.copydefault();
        if (strCopydefault != null) {
            linkedHashMap.put("attr_4", strCopydefault);
        }
        eventDataAEQbTJ.setAttrs(linkedHashMap);
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }
}
