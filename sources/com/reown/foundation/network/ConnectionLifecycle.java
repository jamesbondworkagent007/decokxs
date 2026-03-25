package com.reown.foundation.network;

import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes12.dex */
public interface ConnectionLifecycle {
    StateFlow<Boolean> getOnResume();

    void reconnect();
}
