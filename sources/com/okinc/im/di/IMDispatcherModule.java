package com.okinc.im.di;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
public final class IMDispatcherModule {
    public final CoroutineDispatcher AEQbTJ() {
        return Dispatchers.getMain();
    }
}
