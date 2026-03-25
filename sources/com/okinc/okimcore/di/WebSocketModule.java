package com.okinc.okimcore.di;

import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import o.yCR;

/* JADX INFO: loaded from: classes10.dex */
public final class WebSocketModule {
    public static final WebSocketModule copydefault = new WebSocketModule();

    private WebSocketModule() {
    }

    @yCR
    public final Semaphore KWHzl() {
        return SemaphoreKt.Semaphore$default(20, 0, 2, null);
    }
}
