package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class nTI {
    public final C34168nTy copydefault;

    @yCM
    public nTI(@NotNull C34168nTy c34168nTy) {
        Intrinsics.checkNotNullParameter(c34168nTy, "");
        this.copydefault = c34168nTy;
    }

    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull final Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objEZpvd = this.copydefault.EZpvd(context, str, str2, z, new Function0() { // from class: o.nTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nTI.KWHzl(function0);
            }
        }, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
