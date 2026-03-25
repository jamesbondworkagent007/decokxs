package com.welie.blessed;

/* JADX INFO: loaded from: classes17.dex */
public enum ConnectionState {
    DISCONNECTED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3);

    public final int value;

    ConnectionState(int i) {
        this.value = i;
    }

    public static ConnectionState fromValue(int i) {
        for (ConnectionState connectionState : values()) {
            if (connectionState.value == i) {
                return connectionState;
            }
        }
        return DISCONNECTED;
    }
}
