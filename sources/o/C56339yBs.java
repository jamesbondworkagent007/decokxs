package o;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.yBs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56339yBs {
    private C56339yBs() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void EZpvd(InterfaceC60097zve<? super T> interfaceC60097zve, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC60097zve.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                java.lang.Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    interfaceC60097zve.onError(thTerminate);
                } else {
                    interfaceC60097zve.onComplete();
                }
            }
        }
    }

    public static void KWHzl(InterfaceC60097zve<?> interfaceC60097zve, java.lang.Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.addThrowable(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC60097zve.onError(atomicThrowable.terminate());
                return;
            }
            return;
        }
        yBG.copydefault(th);
    }

    public static void copydefault(InterfaceC60097zve<?> interfaceC60097zve, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            java.lang.Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                interfaceC60097zve.onError(thTerminate);
            } else {
                interfaceC60097zve.onComplete();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void AEQbTJ(InterfaceC58256yxp<? super T> interfaceC58256yxp, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC58256yxp.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                java.lang.Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    interfaceC58256yxp.onError(thTerminate);
                } else {
                    interfaceC58256yxp.onComplete();
                }
            }
        }
    }

    public static void KWHzl(InterfaceC58256yxp<?> interfaceC58256yxp, java.lang.Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.addThrowable(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC58256yxp.onError(atomicThrowable.terminate());
                return;
            }
            return;
        }
        yBG.copydefault(th);
    }

    public static void EZpvd(InterfaceC58256yxp<?> interfaceC58256yxp, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            java.lang.Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                interfaceC58256yxp.onError(thTerminate);
            } else {
                interfaceC58256yxp.onComplete();
            }
        }
    }
}
