package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jMF extends AbstractC49400uno<InterfaceC49371unL<? extends java.lang.Object>, InterfaceC49371unL<? extends Unit>> {
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((InterfaceC49371unL<? extends java.lang.Object>) obj, (Continuation<? super InterfaceC49371unL<Unit>>) continuation);
    }

    @yCM
    public jMF(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    public java.lang.Object EZpvd(@NotNull InterfaceC49371unL<? extends java.lang.Object> interfaceC49371unL, @NotNull Continuation<? super InterfaceC49371unL<Unit>> continuation) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            return new InterfaceC49371unL.Activity(Unit.INSTANCE);
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            return new InterfaceC49371unL.TaskDescription(Unit.INSTANCE);
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            return new InterfaceC49371unL.ActionBar(Unit.INSTANCE);
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            return new InterfaceC49371unL.Application(((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ(), null, 2, null);
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) {
            return new InterfaceC49371unL.StateListAnimator(Unit.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }
}
