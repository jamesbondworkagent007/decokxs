package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pVZ {
    public static final CoroutineExceptionHandler OLrzqt = new StateListAnimator(CoroutineExceptionHandler.Key);

    public static /* synthetic */ Job safeLaunch$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return copydefault(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final Job copydefault(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(coroutineStart, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CoroutineContext coroutineContext2 = coroutineScope.getCoroutineContext();
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext2.get(key);
        if (coroutineExceptionHandler == null) {
            coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(key);
        }
        if (coroutineExceptionHandler == null) {
            return BuildersKt.launch(coroutineScope, coroutineContext.plus(OLrzqt), coroutineStart, function2);
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            th.printStackTrace();
            pUU.copydefault("DefaultExceptionHandler", th + "\n" + Unit.INSTANCE);
        }
    }
}
