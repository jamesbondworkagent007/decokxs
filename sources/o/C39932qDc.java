package o;

import com.okinc.market.search.features.main.recommend.hot.data.po.SearchHotPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39932qDc {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qDi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39932qDc.EZpvd();
        }
    });

    @yCM
    public C39932qDc() {
    }

    public final InterfaceC39931qDb OLrzqt() {
        return (InterfaceC39931qDb) this.KWHzl.getValue();
    }

    public static final InterfaceC39931qDb EZpvd() {
        return (InterfaceC39931qDb) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC39931qDb.class));
    }

    public java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<SearchHotPo>>> continuation) {
        return OLrzqt().copydefault(continuation);
    }
}
