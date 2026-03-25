package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventReq;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.InterfaceC36125oQe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oQf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36126oQf {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oQi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36126oQf.EZpvd();
        }
    });

    @yCM
    public C36126oQf() {
    }

    public final InterfaceC36125oQe copydefault() {
        return (InterfaceC36125oQe) this.copydefault.getValue();
    }

    public static final InterfaceC36125oQe EZpvd() {
        return (InterfaceC36125oQe) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC36125oQe.class));
    }

    public java.lang.Object KWHzl(@NotNull MarketEventReq marketEventReq, @NotNull Continuation<? super ResponseData<java.util.List<MarketEventResp>>> continuation) {
        return InterfaceC36125oQe.Activity.getMarketEvents$default(copydefault(), marketEventReq.getInstId(), marketEventReq.getPageSize(), marketEventReq.getCursor(), marketEventReq.getUnit(), marketEventReq.getDisplayInstName(), 0, continuation, 32, null);
    }
}
