package o;

import io.reactivex.disposables.ActionDisposable;
import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;

/* JADX INFO: renamed from: o.yxA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58215yxA {
    private C58215yxA() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static InterfaceC58217yxC AEQbTJ(java.lang.Runnable runnable) {
        C58297yyd.AEQbTJ(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    public static InterfaceC58217yxC copydefault(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "run is null");
        return new ActionDisposable(interfaceC58222yxH);
    }

    public static InterfaceC58217yxC copydefault() {
        return AEQbTJ(Functions.AYXKKw);
    }

    public static InterfaceC58217yxC EZpvd() {
        return EmptyDisposable.INSTANCE;
    }
}
