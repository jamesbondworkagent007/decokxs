package o;

import com.okinc.business.market.features.analysis.futures.sub.ranking.data.datasource.IFuturesRankingDataSource;
import com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25923jLj implements IFuturesRankingDataSource {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jLf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25923jLj.KWHzl();
        }
    });

    @yCM
    public C25923jLj() {
    }

    public final InterfaceC25921jLh OLrzqt() {
        return (InterfaceC25921jLh) this.EZpvd.getValue();
    }

    public static final InterfaceC25921jLh KWHzl() {
        return (InterfaceC25921jLh) C38416pXz.copydefault(C56524yIo.AEQbTJ(InterfaceC25921jLh.class));
    }

    public java.lang.Object EZpvd(@NotNull IFuturesRankingDataSource.PayloadPnlType payloadPnlType, @NotNull PayloadPeriod payloadPeriod, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<RankingItemPo>>> continuation) {
        return OLrzqt().OLrzqt(payloadPnlType.getValue(), payloadPeriod.getValue(), str, str2, continuation);
    }
}
