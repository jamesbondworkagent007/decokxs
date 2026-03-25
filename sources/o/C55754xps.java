package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55754xps {
    public static InterfaceC58217yxC OLrzqt;
    public static final C55754xps AEQbTJ = new C55754xps();
    public static final LinkedHashMap<java.lang.String, java.lang.Boolean> KWHzl = new LinkedHashMap<>();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(boolean z) {
        return z ? "success" : "failure";
    }

    private C55754xps() {
    }

    public final void AEQbTJ() {
        xOW newProxyInstance;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        if (c54589xNz.EZpvd()) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || newProxyInstance.values()) {
            pUU.EZpvd("TradeTabNumRequestListener", "startTimer");
            copydefault();
            InterfaceC58217yxC interfaceC58217yxC = OLrzqt;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(6L, java.util.concurrent.TimeUnit.SECONDS);
            final Function1 function1 = new Function1() { // from class: o.xpu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55754xps.KWHzl((java.lang.Long) obj);
                }
            };
            OLrzqt = abstractC58247yxgTimer.subscribe(new InterfaceC58227yxM() { // from class: o.xpq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C55754xps.EZpvd(function1, obj);
                }
            });
        }
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Long l) {
        LinkedHashMap<java.lang.String, java.lang.Boolean> linkedHashMap = KWHzl;
        pUU.EZpvd("TradeTabNumRequestListener", "request result:" + linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.lang.Boolean> entry : linkedHashMap.entrySet()) {
            if (!entry.getValue().booleanValue()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return Unit.INSTANCE;
        }
        AEQbTJ.KWHzl();
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl.put(str, java.lang.Boolean.TRUE);
    }

    public final void copydefault() {
        LinkedHashMap<java.lang.String, java.lang.Boolean> linkedHashMap = KWHzl;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        linkedHashMap.put("mainSummary", bool);
        linkedHashMap.put("subSummary", bool);
        linkedHashMap.put("algoSummary", bool);
        linkedHashMap.put("lvfSummary", bool);
        if (xEE.Companion.EZpvd()) {
            linkedHashMap.put("leadSummary", bool);
        }
    }

    public final void KWHzl() {
        pUU.EZpvd("TradeTabNumRequestListener", "reportGrafana");
        EventData eventData = new EventData();
        eventData.setAct("trade_summary_num_analysis");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", java.lang.String.valueOf(C43453rpa.AEQbTJ.OLrzqt()));
        LinkedHashMap<java.lang.String, java.lang.Boolean> linkedHashMap2 = KWHzl;
        java.lang.Boolean bool = linkedHashMap2.get("mainSummary");
        if (bool != null) {
            linkedHashMap.put("launching", AEQbTJ(bool.booleanValue()));
        }
        java.lang.Boolean bool2 = linkedHashMap2.get("subSummary");
        if (bool2 != null) {
            linkedHashMap.put("otherTime", AEQbTJ(bool2.booleanValue()));
        }
        java.lang.Boolean bool3 = linkedHashMap2.get("algoSummary");
        if (bool3 != null) {
            linkedHashMap.put("pauseTime", AEQbTJ(bool3.booleanValue()));
        }
        java.lang.Boolean bool4 = linkedHashMap2.get("lvfSummary");
        if (bool4 != null) {
            linkedHashMap.put("renderTime", AEQbTJ(bool4.booleanValue()));
        }
        java.lang.Boolean bool5 = linkedHashMap2.get("leadSummary");
        if (bool5 != null) {
            linkedHashMap.put("totalTime", AEQbTJ(bool5.booleanValue()));
        }
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("TradeTabNumRequestListener", "reportData: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void EZpvd() {
        pUU.EZpvd("TradeTabNumRequestListener", "stop");
        InterfaceC58217yxC interfaceC58217yxC = OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        copydefault();
    }
}
