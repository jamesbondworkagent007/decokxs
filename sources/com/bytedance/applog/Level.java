package com.bytedance.applog;

/* JADX INFO: loaded from: classes2.dex */
public enum Level {
    L0(0),
    L1(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    Level(int i) {
        this.f108a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int value() {
        return this.f108a;
    }
}
