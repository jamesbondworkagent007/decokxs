package o;

import com.okinc.market.search.features.main.entry.data.po.SearchRecommendPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qBP {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qBS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qBP.KWHzl();
        }
    });

    @yCM
    public qBP() {
    }

    public static final qBQ KWHzl() {
        return (qBQ) C43417ror.OLrzqt(C56524yIo.AEQbTJ(qBQ.class));
    }

    public final qBQ AEQbTJ() {
        return (qBQ) this.AEQbTJ.getValue();
    }

    public java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<SearchRecommendPo>>> continuation) {
        return AEQbTJ().OLrzqt(str, continuation);
    }
}
