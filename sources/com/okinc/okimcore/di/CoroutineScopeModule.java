package com.okinc.okimcore.di;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC56429yFa;
import o.pUU;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CoroutineScopeModule {
    public static final CoroutineScopeModule AEQbTJ = new CoroutineScopeModule();

    private CoroutineScopeModule() {
    }

    @yCR
    public final CoroutineScope AEQbTJ() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()).plus(new Activity(CoroutineExceptionHandler.Key)));
    }

    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
            pUU.AEQbTJ("ApplicationScope", "Uncaught coroutine exception", th);
        }
    }
}
