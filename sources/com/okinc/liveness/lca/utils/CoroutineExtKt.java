package com.okinc.liveness.lca.utils;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CoroutineExtKt {
    public static final <T> Object await(@NotNull final ListenableFuture<T> listenableFuture, @NotNull Context context, @NotNull Continuation<? super T> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        listenableFuture.addListener(new Runnable() { // from class: com.okinc.liveness.lca.utils.CoroutineExtKt$await$2$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Continuation<T> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(listenableFuture.get()));
                } catch (Exception e) {
                    Continuation<T> continuation3 = c56434yFf;
                    Result.Application application2 = Result.Companion;
                    continuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                }
            }
        }, ContextCompat.getMainExecutor(context));
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }
}
