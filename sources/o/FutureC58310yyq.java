package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.yyq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class FutureC58310yyq<T> extends CountDownLatch implements InterfaceC58256yxp<T>, Future<T>, InterfaceC58217yxC {
    public T AEQbTJ;
    public java.lang.Throwable OLrzqt;
    public final AtomicReference<InterfaceC58217yxC> copydefault;

    @Override // o.InterfaceC58217yxC
    public void dispose() {
    }

    public FutureC58310yyq() {
        super(1);
        this.copydefault = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        InterfaceC58217yxC interfaceC58217yxC;
        DisposableHelper disposableHelper;
        do {
            interfaceC58217yxC = this.copydefault.get();
            if (interfaceC58217yxC == this || interfaceC58217yxC == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.copydefault, interfaceC58217yxC, disposableHelper));
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.copydefault.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, java.lang.InterruptedException {
        if (getCount() != 0) {
            C56336yBp.EZpvd();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        java.lang.Throwable th = this.OLrzqt;
        if (th == null) {
            return this.AEQbTJ;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public T get(long j, java.util.concurrent.TimeUnit timeUnit) throws ExecutionException, java.lang.InterruptedException, TimeoutException {
        if (getCount() != 0) {
            C56336yBp.EZpvd();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.copydefault(j, timeUnit));
            }
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        java.lang.Throwable th = this.OLrzqt;
        if (th == null) {
            return this.AEQbTJ;
        }
        throw new ExecutionException(th);
    }

    @Override // o.InterfaceC58256yxp
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        DisposableHelper.setOnce(this.copydefault, interfaceC58217yxC);
    }

    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = t;
        } else {
            this.copydefault.get().dispose();
            onError(new java.lang.IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onError(java.lang.Throwable th) {
        InterfaceC58217yxC interfaceC58217yxC;
        if (this.OLrzqt == null) {
            this.OLrzqt = th;
            do {
                interfaceC58217yxC = this.copydefault.get();
                if (interfaceC58217yxC == this || interfaceC58217yxC == DisposableHelper.DISPOSED) {
                    yBG.copydefault(th);
                    return;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.copydefault, interfaceC58217yxC, this));
            countDown();
            return;
        }
        yBG.copydefault(th);
    }

    @Override // o.InterfaceC58256yxp
    public void onComplete() {
        InterfaceC58217yxC interfaceC58217yxC;
        if (this.AEQbTJ == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            interfaceC58217yxC = this.copydefault.get();
            if (interfaceC58217yxC == this || interfaceC58217yxC == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.copydefault, interfaceC58217yxC, this));
        countDown();
    }

    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return isDone();
    }
}
