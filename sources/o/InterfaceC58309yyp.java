package o;

import io.reactivex.internal.observers.InnerQueuedObserver;

/* JADX INFO: renamed from: o.yyp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC58309yyp<T> {
    void drain();

    void innerComplete(InnerQueuedObserver<T> innerQueuedObserver);

    void innerError(InnerQueuedObserver<T> innerQueuedObserver, java.lang.Throwable th);

    void innerNext(InnerQueuedObserver<T> innerQueuedObserver, T t);
}
