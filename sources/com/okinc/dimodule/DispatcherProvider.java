package com.okinc.dimodule;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
public final class DispatcherProvider {
    public final CoroutineDispatcher AEQbTJ() {
        return Dispatchers.getIO();
    }

    public final CoroutineDispatcher KWHzl() {
        return Dispatchers.getDefault();
    }

    public final CoroutineDispatcher OLrzqt() {
        return Dispatchers.getUnconfined();
    }
}
