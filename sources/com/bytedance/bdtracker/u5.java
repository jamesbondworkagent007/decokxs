package com.bytedance.bdtracker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u5<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile T f269a;

    public abstract T a(Object... objArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T b(Object... objArr) {
        if (this.f269a == null) {
            synchronized (this) {
                if (this.f269a == null) {
                    this.f269a = a(objArr);
                }
            }
        }
        return this.f269a;
    }
}
