package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38386pWw {
    java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<? extends BizInstrument>> continuation);

    /* JADX INFO: renamed from: o.pWw$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object initData$default(InterfaceC38386pWw interfaceC38386pWw, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initData");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC38386pWw.KWHzl(z, continuation);
        }
    }
}
