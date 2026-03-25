package com.okinc.okimcore.di;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes10.dex */
public final class DispatchersModule {
    public final CoroutineDispatcher OLrzqt() {
        return Dispatchers.getIO().limitedParallelism(1);
    }
}
