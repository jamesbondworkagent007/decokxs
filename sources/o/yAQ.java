package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public final class yAQ implements Future<java.lang.Object> {
    public final InterfaceC58217yxC EZpvd;

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws ExecutionException, java.lang.InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws ExecutionException, java.lang.InterruptedException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    public yAQ(InterfaceC58217yxC interfaceC58217yxC) {
        this.EZpvd = interfaceC58217yxC;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.EZpvd.dispose();
        return false;
    }
}
