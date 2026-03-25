package o;

import com.okinc.find_ui.features.opportunity.overall.data.datasource.IMarketOverallDataSource;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketDataPo;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34940nlt implements IMarketOverallDataSource {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nls
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34940nlt.copydefault();
        }
    });

    @yCM
    public C34940nlt() {
    }

    public final InterfaceC34933nlm KWHzl() {
        return (InterfaceC34933nlm) this.EZpvd.getValue();
    }

    public static final InterfaceC34933nlm copydefault() {
        return (InterfaceC34933nlm) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC34933nlm.class));
    }

    public java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<MarketOverallStatsPo>> continuation) {
        return KWHzl().copydefault(continuation);
    }

    public java.lang.Object EZpvd(@NotNull java.lang.String str, int i, @NotNull IMarketOverallDataSource.PayloadPeriod payloadPeriod, @NotNull Continuation<? super ResponseData<java.util.List<MarketDataPo>>> continuation) {
        return KWHzl().OLrzqt(str, i, payloadPeriod.getValue(), continuation);
    }
}
