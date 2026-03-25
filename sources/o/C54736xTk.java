package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xTk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54736xTk extends xSW {
    public final java.lang.String fetchVPNInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54736xTk(@NotNull java.util.List<? extends BizInstrument> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z, @NotNull java.lang.String str) {
        super(list, function2, mutableLiveData, z);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    @Override // o.xSW
    public void AEQbTJ(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        pUU.KWHzl("NavOptPhase1", this.fetchVPNInfo + " -> OptionDataTaskV2 getCupTicker invoke.");
        function2.invoke(java.lang.Boolean.TRUE, null);
    }

    @Override // o.xSW
    public void EZpvd(@NotNull final Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        pUU.KWHzl("NavOptPhase1", this.fetchVPNInfo + " -> OptionDataTaskV2 getOptionTickerHttp invoke.");
        xSB.OLrzqt.AEQbTJ(new yHO() { // from class: o.xTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C54736xTk.AEQbTJ(this.OLrzqt, function2, ((java.lang.Boolean) obj).booleanValue(), (java.util.List) obj2, (java.lang.Exception) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C54736xTk c54736xTk, Function2 function2, boolean z, java.util.List list, java.lang.Exception exc) {
        pUU.KWHzl("NavOptPhase1", c54736xTk.fetchVPNInfo + " -> OptionDataTaskV2 getOptionTickerHttp rx callback.");
        c54736xTk.copydefault((java.util.List<TickersData>) list);
        function2.invoke(java.lang.Boolean.valueOf(z), exc);
        return Unit.INSTANCE;
    }
}
