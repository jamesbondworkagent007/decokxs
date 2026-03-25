package o;

import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pwZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39661pwZ extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends UnlockTokenSchedule>, ? extends java.util.Map<java.lang.String, kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer>>>, C39703pxO> {
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<? extends java.util.List<UnlockTokenSchedule>, ? extends java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>>>) obj, (Continuation<? super C39703pxO>) continuation);
    }

    @yCM
    public C39661pwZ(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<UnlockTokenSchedule>, ? extends java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>>> pair, @NotNull Continuation<? super C39703pxO> continuation) {
        return C39768pya.copydefault.copydefault(pair);
    }
}
