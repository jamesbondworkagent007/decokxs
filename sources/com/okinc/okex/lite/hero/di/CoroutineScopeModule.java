package com.okinc.okex.lite.hero.di;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC56429yFa;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CoroutineScopeModule {
    public static final CoroutineScopeModule copydefault = new CoroutineScopeModule();

    private CoroutineScopeModule() {
    }

    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            pUU.AEQbTJ("Coroutine Crashed", th);
        }
    }

    public final CoroutineScope EZpvd(@NotNull CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(coroutineExceptionHandler, "");
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()).plus(coroutineExceptionHandler));
    }

    public final CoroutineScope copydefault(@NotNull CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(coroutineExceptionHandler, "");
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()).plus(coroutineExceptionHandler));
    }

    public final CoroutineExceptionHandler AEQbTJ() {
        return new Activity(CoroutineExceptionHandler.Key);
    }
}
