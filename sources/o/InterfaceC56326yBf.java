package o;

import io.reactivex.internal.subscribers.InnerQueuedSubscriber;

/* JADX INFO: renamed from: o.yBf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC56326yBf<T> {
    void drain();

    void innerComplete(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void innerError(InnerQueuedSubscriber<T> innerQueuedSubscriber, java.lang.Throwable th);

    void innerNext(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);
}
