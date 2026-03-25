package o;

import com.okinc.localization.util.format.DisplaySign;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jMy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25965jMy extends AbstractC49400uno<java.lang.String, java.lang.String> {
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.lang.String) obj, (Continuation<? super java.lang.String>) continuation);
    }

    @yCM
    public C25965jMy(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) {
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), null, C38307pTy.Companion.KWHzl(0, 2), DisplaySign.EXCEPT_ZERO, C56443yFo.AEQbTJ(100.0d), null, 34, null);
    }
}
