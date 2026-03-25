package o;

import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class kWB {
    public final MutableStateFlow<TradeState> AEQbTJ = StateFlowKt.MutableStateFlow(null);
    public C23262hus OLrzqt = new C23262hus();
    public C23168htD EZpvd = new C23168htD("default_trade", new Function1() { // from class: o.kWA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kWB.EZpvd(this.KWHzl, (java.lang.String) obj);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<TradeState> EZpvd() {
        return this.AEQbTJ;
    }

    @yCM
    public kWB() {
    }

    public static final Unit EZpvd(final kWB kwb, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) new JSONObject(str).optString("type"), (java.lang.Object) "1")) {
            kwb.OLrzqt.copydefault(str, new Function1() { // from class: o.kWy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kWB.KWHzl(this.EZpvd, (TradeState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(kWB kwb, TradeState tradeState) {
        Intrinsics.checkNotNullParameter(tradeState, "");
        kwb.AEQbTJ.setValue(tradeState);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        this.EZpvd.OLrzqt();
    }

    public final void copydefault() {
        this.EZpvd.copydefault();
    }
}
