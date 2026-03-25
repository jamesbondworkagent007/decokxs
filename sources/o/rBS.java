package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBS {
    public final InterfaceC41969rBm AEQbTJ;

    public rBS(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.AEQbTJ = interfaceC41969rBm;
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = this.AEQbTJ.OLrzqt(continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }
}
