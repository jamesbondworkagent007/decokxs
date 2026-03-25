package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class uCA {
    public static final uCA KWHzl = new uCA();

    private uCA() {
    }

    public final InterfaceC8108awX EZpvd() {
        return (InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class);
    }

    public static /* synthetic */ java.lang.Object switchTradeMode$default(uCA uca, boolean z, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "main/trade";
        }
        return uca.AEQbTJ(z, str, continuation);
    }

    public final java.lang.Object AEQbTJ(boolean z, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = EZpvd().KWHzl(z, str, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
