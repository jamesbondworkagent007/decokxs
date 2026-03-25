package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nTB {
    public static final nTB copydefault = new nTB();

    /* JADX INFO: loaded from: classes8.dex */
    public interface Activity {
        nTI OHqIaq();
    }

    private nTB() {
    }

    public final nTI EZpvd(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return ((Activity) C58114yvF.OLrzqt(applicationContext, Activity.class)).OHqIaq();
    }

    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objAEQbTJ = EZpvd(context).AEQbTJ(context, str, str2, false, new Function0() { // from class: o.nTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nTB.EZpvd(function0);
            }
        }, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
