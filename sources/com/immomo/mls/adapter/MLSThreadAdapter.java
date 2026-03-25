package com.immomo.mls.adapter;

/* JADX INFO: loaded from: classes3.dex */
public interface MLSThreadAdapter {

    public enum Priority {
        HIGH,
        MEDIUM,
        LOW
    }

    void AEQbTJ(Object obj, Runnable runnable);

    void KWHzl(Priority priority, Runnable runnable);

    void copydefault(Object obj);
}
