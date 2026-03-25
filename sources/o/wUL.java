package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wUL {
    public static final CoroutineExceptionHandler AEQbTJ = new TaskDescription(CoroutineExceptionHandler.Key);

    public static /* synthetic */ Job safeLaunch$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return OLrzqt(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final Job OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
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
            return BuildersKt.launch(coroutineScope, coroutineContext.plus(AEQbTJ), coroutineStart, function2);
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ Function1 copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(CoroutineExceptionHandler.Key key, Function1 function1) {
            super(key);
            this.copydefault = function1;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            th.printStackTrace();
            pUU.copydefault("TradingBotDefaultExceptionHandler", th + "\n" + Unit.INSTANCE);
            this.copydefault.invoke(th);
        }
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public TaskDescription(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            th.printStackTrace();
            pUU.copydefault("TradingBotDefaultExceptionHandler", th + "\n" + Unit.INSTANCE);
        }
    }

    public static final CoroutineExceptionHandler OLrzqt(@NotNull Function1<? super java.lang.Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new Application(CoroutineExceptionHandler.Key, function1);
    }
}
