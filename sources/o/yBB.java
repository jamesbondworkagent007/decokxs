package o;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class yBB {
    private yBB() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T, U> void KWHzl(InterfaceC58299yyf<T> interfaceC58299yyf, InterfaceC60097zve<? super U> interfaceC60097zve, boolean z, InterfaceC58217yxC interfaceC58217yxC, InterfaceC56340yBt<T, U> interfaceC56340yBt) {
        int iEZpvd = 1;
        while (true) {
            boolean zAEQbTJ = interfaceC56340yBt.AEQbTJ();
            T tPoll = interfaceC58299yyf.poll();
            boolean z2 = tPoll == null;
            if (copydefault(zAEQbTJ, z2, interfaceC60097zve, z, interfaceC58299yyf, interfaceC56340yBt)) {
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                    return;
                }
                return;
            } else if (!z2) {
                long jGEmmrt = interfaceC56340yBt.gEmmrt();
                if (jGEmmrt != 0) {
                    if (interfaceC56340yBt.EZpvd(interfaceC60097zve, tPoll) && jGEmmrt != Long.MAX_VALUE) {
                        interfaceC56340yBt.OLrzqt(1L);
                    }
                } else {
                    interfaceC58299yyf.clear();
                    if (interfaceC58217yxC != null) {
                        interfaceC58217yxC.dispose();
                    }
                    interfaceC60097zve.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
            } else {
                iEZpvd = interfaceC56340yBt.EZpvd(-iEZpvd);
                if (iEZpvd == 0) {
                    return;
                }
            }
        }
    }

    public static <T, U> boolean copydefault(boolean z, boolean z2, InterfaceC60097zve<?> interfaceC60097zve, boolean z3, InterfaceC58305yyl<?> interfaceC58305yyl, InterfaceC56340yBt<T, U> interfaceC56340yBt) {
        if (interfaceC56340yBt.KWHzl()) {
            interfaceC58305yyl.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            java.lang.Throwable thEZpvd = interfaceC56340yBt.EZpvd();
            if (thEZpvd != null) {
                interfaceC60097zve.onError(thEZpvd);
            } else {
                interfaceC60097zve.onComplete();
            }
            return true;
        }
        java.lang.Throwable thEZpvd2 = interfaceC56340yBt.EZpvd();
        if (thEZpvd2 != null) {
            interfaceC58305yyl.clear();
            interfaceC60097zve.onError(thEZpvd2);
            return true;
        }
        if (!z2) {
            return false;
        }
        interfaceC60097zve.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r1 = r15.AEQbTJ(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T, U> void copydefault(InterfaceC58299yyf<T> interfaceC58299yyf, InterfaceC58256yxp<? super U> interfaceC58256yxp, boolean z, InterfaceC58217yxC interfaceC58217yxC, InterfaceC56342yBv<T, U> interfaceC56342yBv) {
        int iAEQbTJ = 1;
        while (!EZpvd(interfaceC56342yBv.EZpvd(), interfaceC58299yyf.isEmpty(), interfaceC58256yxp, z, interfaceC58299yyf, interfaceC58217yxC, interfaceC56342yBv)) {
            while (true) {
                boolean zEZpvd = interfaceC56342yBv.EZpvd();
                T tPoll = interfaceC58299yyf.poll();
                boolean z2 = tPoll == null;
                if (EZpvd(zEZpvd, z2, interfaceC58256yxp, z, interfaceC58299yyf, interfaceC58217yxC, interfaceC56342yBv)) {
                    return;
                }
                if (z2) {
                    break;
                } else {
                    interfaceC56342yBv.copydefault(interfaceC58256yxp, tPoll);
                }
            }
        }
    }

    public static <T, U> boolean EZpvd(boolean z, boolean z2, InterfaceC58256yxp<?> interfaceC58256yxp, boolean z3, InterfaceC58305yyl<?> interfaceC58305yyl, InterfaceC58217yxC interfaceC58217yxC, InterfaceC56342yBv<T, U> interfaceC56342yBv) {
        if (interfaceC56342yBv.copydefault()) {
            interfaceC58305yyl.clear();
            interfaceC58217yxC.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            java.lang.Throwable thAEQbTJ = interfaceC56342yBv.AEQbTJ();
            if (thAEQbTJ != null) {
                interfaceC58256yxp.onError(thAEQbTJ);
            } else {
                interfaceC58256yxp.onComplete();
            }
            return true;
        }
        java.lang.Throwable thAEQbTJ2 = interfaceC56342yBv.AEQbTJ();
        if (thAEQbTJ2 != null) {
            interfaceC58305yyl.clear();
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            interfaceC58256yxp.onError(thAEQbTJ2);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        interfaceC58256yxp.onComplete();
        return true;
    }

    public static <T> InterfaceC58305yyl<T> AEQbTJ(int i) {
        if (i < 0) {
            return new yAO(-i);
        }
        return new SpscArrayQueue(i);
    }

    public static void KWHzl(InterfaceC60094zvb interfaceC60094zvb, int i) {
        interfaceC60094zvb.request(i < 0 ? Long.MAX_VALUE : i);
    }

    public static <T> boolean AEQbTJ(long j, InterfaceC60097zve<? super T> interfaceC60097zve, Queue<T> queue, AtomicLong atomicLong, InterfaceC58226yxL interfaceC58226yxL) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, C56334yBn.OLrzqt(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        copydefault(j | Long.MIN_VALUE, interfaceC60097zve, queue, atomicLong, interfaceC58226yxL);
        return true;
    }

    public static boolean AEQbTJ(InterfaceC58226yxL interfaceC58226yxL) {
        try {
            return interfaceC58226yxL.getAsBoolean();
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            return true;
        }
    }

    public static <T> boolean copydefault(long j, InterfaceC60097zve<? super T> interfaceC60097zve, Queue<T> queue, AtomicLong atomicLong, InterfaceC58226yxL interfaceC58226yxL) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (AEQbTJ(interfaceC58226yxL)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    interfaceC60097zve.onComplete();
                    return true;
                }
                interfaceC60097zve.onNext(tPoll);
                j2++;
            } else {
                if (AEQbTJ(interfaceC58226yxL)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    interfaceC60097zve.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long jAddAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j = jAddAndGet;
                    j2 = jAddAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> void KWHzl(InterfaceC60097zve<? super T> interfaceC60097zve, Queue<T> queue, AtomicLong atomicLong, InterfaceC58226yxL interfaceC58226yxL) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            interfaceC60097zve.onComplete();
            return;
        }
        if (copydefault(atomicLong.get(), interfaceC60097zve, queue, atomicLong, interfaceC58226yxL)) {
            return;
        }
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        if (j != 0) {
            copydefault(j2, interfaceC60097zve, queue, atomicLong, interfaceC58226yxL);
        }
    }
}
