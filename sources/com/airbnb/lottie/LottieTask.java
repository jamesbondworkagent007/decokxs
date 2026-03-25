package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class LottieTask<T> {
    public static Executor EXECUTOR = Executors.newCachedThreadPool();
    private final Set<LottieListener<Throwable>> failureListeners;
    private final Handler handler;
    private volatile LottieResult<T> result;
    private final Set<LottieListener<T>> successListeners;

    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    public LottieTask(Callable<LottieResult<T>> callable, boolean z) {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        this.handler = new Handler(Looper.getMainLooper());
        this.result = null;
        if (z) {
            try {
                setResult(callable.call());
                return;
            } catch (Throwable th) {
                setResult(new LottieResult<>(th));
                return;
            }
        }
        EXECUTOR.execute(new LottieFutureTask(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(@Nullable LottieResult<T> lottieResult) {
        if (this.result != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.result = lottieResult;
        notifyListeners();
    }

    public LottieTask<T> addListener(LottieListener<T> lottieListener) {
        synchronized (this) {
            LottieResult<T> lottieResult = this.result;
            if (lottieResult != null && lottieResult.getValue() != null) {
                lottieListener.onResult(lottieResult.getValue());
            }
            this.successListeners.add(lottieListener);
        }
        return this;
    }

    public LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        synchronized (this) {
            this.successListeners.remove(lottieListener);
        }
        return this;
    }

    public LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        synchronized (this) {
            LottieResult<T> lottieResult = this.result;
            if (lottieResult != null && lottieResult.getException() != null) {
                lottieListener.onResult(lottieResult.getException());
            }
            this.failureListeners.add(lottieListener);
        }
        return this;
    }

    public LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        synchronized (this) {
            this.failureListeners.remove(lottieListener);
        }
        return this;
    }

    private void notifyListeners() {
        this.handler.post(new Runnable() { // from class: com.airbnb.lottie.LottieTask$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$notifyListeners$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyListeners$0() {
        LottieResult<T> lottieResult = this.result;
        if (lottieResult == null) {
            return;
        }
        if (lottieResult.getValue() != null) {
            notifySuccessListeners(lottieResult.getValue());
        } else {
            notifyFailureListeners(lottieResult.getException());
        }
    }

    private void notifySuccessListeners(T t) {
        synchronized (this) {
            Iterator it = new ArrayList(this.successListeners).iterator();
            while (it.hasNext()) {
                ((LottieListener) it.next()).onResult(t);
            }
        }
    }

    private void notifyFailureListeners(Throwable th) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.failureListeners);
            if (arrayList.isEmpty()) {
                Logger.warning("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((LottieListener) it.next()).onResult(th);
            }
        }
    }

    public class LottieFutureTask extends FutureTask<LottieResult<T>> {
        public LottieFutureTask(Callable<LottieResult<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                LottieTask.this.setResult(get());
            } catch (InterruptedException | ExecutionException e) {
                LottieTask.this.setResult(new LottieResult(e));
            }
        }
    }
}
