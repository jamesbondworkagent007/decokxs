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

/* JADX INFO: renamed from: o.tRz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46374tRz {
    public static final CoroutineExceptionHandler KWHzl = new TaskDescription(CoroutineExceptionHandler.Key);

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
            return BuildersKt.launch(coroutineScope, coroutineContext.plus(KWHzl), coroutineStart, function2);
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: renamed from: o.tRz$TaskDescription */
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
            pUU.copydefault("SocialTradingDefaultExceptionHandler", th + "\n" + Unit.INSTANCE);
        }
    }
}
