package com.bytedance.bdtracker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile T f313a;

    public abstract T a(Object... objArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T b(Object... objArr) {
        if (this.f313a == null) {
            synchronized (this) {
                if (this.f313a == null) {
                    this.f313a = a(objArr);
                }
            }
        }
        return this.f313a;
    }
}
