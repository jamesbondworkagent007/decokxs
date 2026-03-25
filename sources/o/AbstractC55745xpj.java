package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55745xpj {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public Function0<java.lang.String> AYXKKw;
    public Function0<java.lang.String> AhwBna;
    public Function0<java.lang.Long> djBIcL;
    public final boolean isConnected;
    public InterfaceC58217yxC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<java.lang.String> function0) {
        this.AhwBna = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<java.lang.Long> function0) {
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<java.lang.String> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: o.xpj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xpj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void EZpvd(@NotNull final java.lang.String str, java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(str, "");
        if (list == null || list.isEmpty() || !copydefault() || C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        pUU.EZpvd("TradeGrafanaWsListener", "startWsConnectionMonitor actionType: " + str);
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(6L, java.util.concurrent.TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: o.xpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC55745xpj.AEQbTJ(this.OLrzqt, str, (java.lang.Long) obj);
            }
        };
        this.valueOf = abstractC58247yxgTimer.subscribe(new InterfaceC58227yxM() { // from class: o.xph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC55745xpj.AhwBna(function1, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC55745xpj abstractC55745xpj, java.lang.String str, java.lang.Long l) {
        abstractC55745xpj.AEQbTJ(abstractC55745xpj.AhwBna, str);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(Function0<java.lang.String> function0, java.lang.String str) {
        java.lang.String strInvoke;
        java.lang.String strInvoke2;
        java.lang.Long lInvoke;
        java.lang.String string;
        EventData eventData = new EventData();
        eventData.setAct("trade_position_ws_connection_error");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", java.lang.String.valueOf(C43453rpa.AEQbTJ.OLrzqt()));
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            return;
        }
        linkedHashMap.put("launching", strInvoke);
        linkedHashMap.put("totalTime", str);
        Function0<java.lang.String> function02 = this.AYXKKw;
        if (function02 == null || (strInvoke2 = function02.invoke()) == null) {
            return;
        }
        linkedHashMap.put("otherTime", strInvoke2);
        Function0<java.lang.Long> function03 = this.djBIcL;
        if (function03 == null || (lInvoke = function03.invoke()) == null || (string = lInvoke.toString()) == null) {
            return;
        }
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, string);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("TradeGrafanaWsListener", "reportData: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public static /* synthetic */ void stopWsConnectionMonitor$default(AbstractC55745xpj abstractC55745xpj, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopWsConnectionMonitor");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC55745xpj.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        if (copydefault() && !C54589xNz.EZpvd.EZpvd()) {
            InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (z) {
                this.AhwBna = null;
                this.AYXKKw = null;
                this.djBIcL = null;
            }
            pUU.EZpvd("TradeGrafanaWsListener", "stopWsConnectionMonitor isRemoveListener: " + z);
        }
    }
}
