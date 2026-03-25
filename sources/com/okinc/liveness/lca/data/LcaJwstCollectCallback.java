package com.okinc.liveness.lca.data;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface LcaJwstCollectCallback {
    void onAuthResponse(WSAuthResponseMsgData wSAuthResponseMsgData);

    void onFailEncryptFinalParam(@NotNull String str);

    void onInvalidFinalParam(@NotNull String str);

    void onWebSocketClosed(@NotNull LcaJwstWsCloseStatus lcaJwstWsCloseStatus);

    void onWebSocketConnected(long j);

    void onWebSocketError(@NotNull String str);
}
