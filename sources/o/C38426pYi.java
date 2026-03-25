package o;

import com.okinc.market.discover.features.filter.data.model.FilterCoinPo;
import com.okinc.market.discover.features.filter.data.model.TokenGroupPo;
import com.okinc.market.discover.features.filter.data.model.UpdateCustomReq;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38426pYi {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pYl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38426pYi.AEQbTJ();
        }
    });

    @yCM
    public C38426pYi() {
    }

    public static final InterfaceC38427pYj AEQbTJ() {
        return (InterfaceC38427pYj) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC38427pYj.class));
    }

    public final InterfaceC38427pYj copydefault() {
        return (InterfaceC38427pYj) this.KWHzl.getValue();
    }

    public java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<TokenGroupPo>>> continuation) {
        return copydefault().KWHzl(continuation);
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<FilterCoinPo>>> continuation) {
        return copydefault().OLrzqt(continuation);
    }

    public java.lang.Object OLrzqt(@NotNull UpdateCustomReq updateCustomReq, @NotNull Continuation<? super ResponseData<java.util.List<Unit>>> continuation) {
        return copydefault().KWHzl(updateCustomReq, continuation);
    }
}
