package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pEH {
    public static final pEH copydefault = new pEH();

    private pEH() {
    }

    public final void OLrzqt(@NotNull oLU olu, boolean z) {
        Intrinsics.checkNotNullParameter(olu, "");
        EventData eventData = new EventData();
        eventData.setAct(z ? "kline_tradingview_load" : "kline_native_load");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) olu.OLrzqt())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("totalTime", C33129mqd.subS$default(olu.isConnected(), olu.OLrzqt(), null, null, null, 14, null));
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
            olu.OLrzqt("");
        }
    }

    public final void OLrzqt(@NotNull oLU olu) {
        Intrinsics.checkNotNullParameter(olu, "");
        EventData eventData = new EventData();
        eventData.setAct("kline_switch_period");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) olu.EZpvd())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("totalTime", C33129mqd.subS$default(olu.isConnected(), olu.EZpvd(), null, null, null, 14, null));
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
            olu.EZpvd("");
        }
    }

    public final void EZpvd(@NotNull oLU olu, boolean z) {
        Intrinsics.checkNotNullParameter(olu, "");
        OLrzqt(olu, z);
        OLrzqt(olu);
    }
}
