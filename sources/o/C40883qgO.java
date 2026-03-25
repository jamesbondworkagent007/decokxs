package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40883qgO {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qgS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40883qgO.AEQbTJ();
        }
    });

    @yCM
    public C40883qgO() {
    }

    public final InterfaceC40884qgP OLrzqt() {
        return (InterfaceC40884qgP) this.KWHzl.getValue();
    }

    public static final InterfaceC40884qgP AEQbTJ() {
        return (InterfaceC40884qgP) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC40884qgP.class));
    }

    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<TradingCalendarPo>>> continuation) {
        return OLrzqt().KWHzl(str, str2, str3, str4, continuation);
    }
}
