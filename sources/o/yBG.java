package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class yBG {
    public static volatile InterfaceC58229yxO<? super AbstractC58177ywP, ? extends AbstractC58177ywP> AEQbTJ;
    public static volatile InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> AYXKKw;
    public static volatile InterfaceC58223yxI<? super AbstractC58185ywX, ? super InterfaceC60097zve, ? extends InterfaceC60097zve> AhwBna;
    public static volatile InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> AkhnZx;
    public static volatile InterfaceC58229yxO<? super AbstractC58247yxg, ? extends AbstractC58247yxg> AuCTel;
    public static volatile InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> DbNXlk;
    public static volatile boolean EZpvd;
    public static volatile boolean KWHzl;
    public static volatile InterfaceC58227yxM<? super java.lang.Throwable> OLrzqt;
    public static volatile InterfaceC58226yxL copydefault;
    public static volatile InterfaceC58223yxI<? super AbstractC58177ywP, ? super InterfaceC58179ywR, ? extends InterfaceC58179ywR> djBIcL;
    public static volatile InterfaceC58229yxO<? super AbstractC58245yxe, ? extends AbstractC58245yxe> ejfBZ;
    public static volatile InterfaceC58223yxI<? super AbstractC58247yxg, ? super InterfaceC58256yxp, ? extends InterfaceC58256yxp> fARcdN;
    public static volatile InterfaceC58223yxI<? super AbstractC58245yxe, ? super InterfaceC58242yxb, ? extends InterfaceC58242yxb> fIwbmz;
    public static volatile InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> fJNWhG;
    public static volatile InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> fetchVPNInfo;
    public static volatile InterfaceC58229yxO<? super yBA, ? extends yBA> gEmmrt;
    public static volatile InterfaceC58229yxO<? super java.lang.Runnable, ? extends java.lang.Runnable> getFieldNames;
    public static volatile InterfaceC58229yxO<? super AbstractC58260yxt, ? extends AbstractC58260yxt> getNewProxyInstance;
    public static volatile InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> isConnected;
    public static volatile InterfaceC58223yxI<? super AbstractC58260yxt, ? super InterfaceC58258yxr, ? extends InterfaceC58258yxr> iwGUEr;
    public static volatile InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> uzCIH;
    public static volatile InterfaceC58229yxO<? super AbstractC58185ywX, ? extends AbstractC58185ywX> valueOf;
    public static volatile InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd() {
        return EZpvd;
    }

    public static AbstractC58253yxm OLrzqt(Callable<AbstractC58253yxm> callable) {
        C58297yyd.AEQbTJ(callable, "Scheduler Callable can't be null");
        InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> interfaceC58229yxO = isConnected;
        if (interfaceC58229yxO == null) {
            return AEQbTJ(callable);
        }
        return OLrzqt(interfaceC58229yxO, callable);
    }

    public static AbstractC58253yxm copydefault(Callable<AbstractC58253yxm> callable) {
        C58297yyd.AEQbTJ(callable, "Scheduler Callable can't be null");
        InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> interfaceC58229yxO = DbNXlk;
        if (interfaceC58229yxO == null) {
            return AEQbTJ(callable);
        }
        return OLrzqt(interfaceC58229yxO, callable);
    }

    public static AbstractC58253yxm KWHzl(Callable<AbstractC58253yxm> callable) {
        C58297yyd.AEQbTJ(callable, "Scheduler Callable can't be null");
        InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> interfaceC58229yxO = fetchVPNInfo;
        if (interfaceC58229yxO == null) {
            return AEQbTJ(callable);
        }
        return OLrzqt(interfaceC58229yxO, callable);
    }

    public static AbstractC58253yxm EZpvd(Callable<AbstractC58253yxm> callable) {
        C58297yyd.AEQbTJ(callable, "Scheduler Callable can't be null");
        InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> interfaceC58229yxO = AkhnZx;
        if (interfaceC58229yxO == null) {
            return AEQbTJ(callable);
        }
        return OLrzqt(interfaceC58229yxO, callable);
    }

    public static AbstractC58253yxm EZpvd(AbstractC58253yxm abstractC58253yxm) {
        InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> interfaceC58229yxO = AYXKKw;
        return interfaceC58229yxO == null ? abstractC58253yxm : (AbstractC58253yxm) copydefault((InterfaceC58229yxO<AbstractC58253yxm, R>) interfaceC58229yxO, abstractC58253yxm);
    }

    public static void copydefault(java.lang.Throwable th) {
        InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM = OLrzqt;
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!OLrzqt(th)) {
            th = new UndeliverableException(th);
        }
        if (interfaceC58227yxM != null) {
            try {
                interfaceC58227yxM.accept(th);
                return;
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
                KWHzl(th2);
            }
        }
        th.printStackTrace();
        KWHzl(th);
    }

    public static boolean OLrzqt(java.lang.Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof java.lang.IllegalStateException) || (th instanceof java.lang.NullPointerException) || (th instanceof java.lang.IllegalArgumentException) || (th instanceof CompositeException);
    }

    public static void KWHzl(java.lang.Throwable th) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static AbstractC58253yxm KWHzl(AbstractC58253yxm abstractC58253yxm) {
        InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> interfaceC58229yxO = values;
        return interfaceC58229yxO == null ? abstractC58253yxm : (AbstractC58253yxm) copydefault((InterfaceC58229yxO<AbstractC58253yxm, R>) interfaceC58229yxO, abstractC58253yxm);
    }

    public static AbstractC58253yxm OLrzqt(AbstractC58253yxm abstractC58253yxm) {
        InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> interfaceC58229yxO = fJNWhG;
        return interfaceC58229yxO == null ? abstractC58253yxm : (AbstractC58253yxm) copydefault((InterfaceC58229yxO<AbstractC58253yxm, R>) interfaceC58229yxO, abstractC58253yxm);
    }

    public static java.lang.Runnable KWHzl(java.lang.Runnable runnable) {
        C58297yyd.AEQbTJ(runnable, "run is null");
        InterfaceC58229yxO<? super java.lang.Runnable, ? extends java.lang.Runnable> interfaceC58229yxO = getFieldNames;
        return interfaceC58229yxO == null ? runnable : (java.lang.Runnable) copydefault((InterfaceC58229yxO<java.lang.Runnable, R>) interfaceC58229yxO, runnable);
    }

    public static AbstractC58253yxm AEQbTJ(AbstractC58253yxm abstractC58253yxm) {
        InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> interfaceC58229yxO = uzCIH;
        return interfaceC58229yxO == null ? abstractC58253yxm : (AbstractC58253yxm) copydefault((InterfaceC58229yxO<AbstractC58253yxm, R>) interfaceC58229yxO, abstractC58253yxm);
    }

    public static void KWHzl(InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> interfaceC58229yxO) {
        if (KWHzl) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        AYXKKw = interfaceC58229yxO;
    }

    public static void AEQbTJ(InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        if (KWHzl) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        OLrzqt = interfaceC58227yxM;
    }

    public static void OLrzqt(InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> interfaceC58229yxO) {
        if (KWHzl) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        DbNXlk = interfaceC58229yxO;
    }

    public static void EZpvd(InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm> interfaceC58229yxO) {
        if (KWHzl) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        values = interfaceC58229yxO;
    }

    public static <T> InterfaceC60097zve<? super T> copydefault(AbstractC58185ywX<T> abstractC58185ywX, InterfaceC60097zve<? super T> interfaceC60097zve) {
        InterfaceC58223yxI<? super AbstractC58185ywX, ? super InterfaceC60097zve, ? extends InterfaceC60097zve> interfaceC58223yxI = AhwBna;
        return interfaceC58223yxI != null ? (InterfaceC60097zve) AEQbTJ(interfaceC58223yxI, abstractC58185ywX, interfaceC60097zve) : interfaceC60097zve;
    }

    public static <T> InterfaceC58256yxp<? super T> EZpvd(AbstractC58247yxg<T> abstractC58247yxg, InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        InterfaceC58223yxI<? super AbstractC58247yxg, ? super InterfaceC58256yxp, ? extends InterfaceC58256yxp> interfaceC58223yxI = fARcdN;
        return interfaceC58223yxI != null ? (InterfaceC58256yxp) AEQbTJ(interfaceC58223yxI, abstractC58247yxg, interfaceC58256yxp) : interfaceC58256yxp;
    }

    public static <T> InterfaceC58258yxr<? super T> AEQbTJ(AbstractC58260yxt<T> abstractC58260yxt, InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        InterfaceC58223yxI<? super AbstractC58260yxt, ? super InterfaceC58258yxr, ? extends InterfaceC58258yxr> interfaceC58223yxI = iwGUEr;
        return interfaceC58223yxI != null ? (InterfaceC58258yxr) AEQbTJ(interfaceC58223yxI, abstractC58260yxt, interfaceC58258yxr) : interfaceC58258yxr;
    }

    public static InterfaceC58179ywR copydefault(AbstractC58177ywP abstractC58177ywP, InterfaceC58179ywR interfaceC58179ywR) {
        InterfaceC58223yxI<? super AbstractC58177ywP, ? super InterfaceC58179ywR, ? extends InterfaceC58179ywR> interfaceC58223yxI = djBIcL;
        return interfaceC58223yxI != null ? (InterfaceC58179ywR) AEQbTJ(interfaceC58223yxI, abstractC58177ywP, interfaceC58179ywR) : interfaceC58179ywR;
    }

    public static <T> InterfaceC58242yxb<? super T> KWHzl(AbstractC58245yxe<T> abstractC58245yxe, InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        InterfaceC58223yxI<? super AbstractC58245yxe, ? super InterfaceC58242yxb, ? extends InterfaceC58242yxb> interfaceC58223yxI = fIwbmz;
        return interfaceC58223yxI != null ? (InterfaceC58242yxb) AEQbTJ(interfaceC58223yxI, abstractC58245yxe, interfaceC58242yxb) : interfaceC58242yxb;
    }

    public static <T> AbstractC58245yxe<T> copydefault(AbstractC58245yxe<T> abstractC58245yxe) {
        InterfaceC58229yxO<? super AbstractC58245yxe, ? extends AbstractC58245yxe> interfaceC58229yxO = ejfBZ;
        return interfaceC58229yxO != null ? (AbstractC58245yxe) copydefault((InterfaceC58229yxO<AbstractC58245yxe<T>, R>) interfaceC58229yxO, abstractC58245yxe) : abstractC58245yxe;
    }

    public static <T> AbstractC58185ywX<T> AEQbTJ(AbstractC58185ywX<T> abstractC58185ywX) {
        InterfaceC58229yxO<? super AbstractC58185ywX, ? extends AbstractC58185ywX> interfaceC58229yxO = valueOf;
        return interfaceC58229yxO != null ? (AbstractC58185ywX) copydefault((InterfaceC58229yxO<AbstractC58185ywX<T>, R>) interfaceC58229yxO, abstractC58185ywX) : abstractC58185ywX;
    }

    public static <T> AbstractC58247yxg<T> EZpvd(AbstractC58247yxg<T> abstractC58247yxg) {
        InterfaceC58229yxO<? super AbstractC58247yxg, ? extends AbstractC58247yxg> interfaceC58229yxO = AuCTel;
        return interfaceC58229yxO != null ? (AbstractC58247yxg) copydefault((InterfaceC58229yxO<AbstractC58247yxg<T>, R>) interfaceC58229yxO, abstractC58247yxg) : abstractC58247yxg;
    }

    public static <T> yBA<T> copydefault(yBA<T> yba) {
        InterfaceC58229yxO<? super yBA, ? extends yBA> interfaceC58229yxO = gEmmrt;
        return interfaceC58229yxO != null ? (yBA) copydefault((InterfaceC58229yxO<yBA<T>, R>) interfaceC58229yxO, yba) : yba;
    }

    public static <T> AbstractC58260yxt<T> AEQbTJ(AbstractC58260yxt<T> abstractC58260yxt) {
        InterfaceC58229yxO<? super AbstractC58260yxt, ? extends AbstractC58260yxt> interfaceC58229yxO = getNewProxyInstance;
        return interfaceC58229yxO != null ? (AbstractC58260yxt) copydefault((InterfaceC58229yxO<AbstractC58260yxt<T>, R>) interfaceC58229yxO, abstractC58260yxt) : abstractC58260yxt;
    }

    public static AbstractC58177ywP copydefault(AbstractC58177ywP abstractC58177ywP) {
        InterfaceC58229yxO<? super AbstractC58177ywP, ? extends AbstractC58177ywP> interfaceC58229yxO = AEQbTJ;
        return interfaceC58229yxO != null ? (AbstractC58177ywP) copydefault((InterfaceC58229yxO<AbstractC58177ywP, R>) interfaceC58229yxO, abstractC58177ywP) : abstractC58177ywP;
    }

    public static boolean copydefault() {
        InterfaceC58226yxL interfaceC58226yxL = copydefault;
        if (interfaceC58226yxL == null) {
            return false;
        }
        try {
            return interfaceC58226yxL.getAsBoolean();
        } catch (java.lang.Throwable th) {
            throw ExceptionHelper.AEQbTJ(th);
        }
    }

    public static <T, R> R copydefault(InterfaceC58229yxO<T, R> interfaceC58229yxO, T t) {
        try {
            return interfaceC58229yxO.apply(t);
        } catch (java.lang.Throwable th) {
            throw ExceptionHelper.AEQbTJ(th);
        }
    }

    public static <T, U, R> R AEQbTJ(InterfaceC58223yxI<T, U, R> interfaceC58223yxI, T t, U u) {
        try {
            return interfaceC58223yxI.apply(t, u);
        } catch (java.lang.Throwable th) {
            throw ExceptionHelper.AEQbTJ(th);
        }
    }

    public static AbstractC58253yxm AEQbTJ(Callable<AbstractC58253yxm> callable) {
        try {
            return (AbstractC58253yxm) C58297yyd.AEQbTJ(callable.call(), "Scheduler Callable result can't be null");
        } catch (java.lang.Throwable th) {
            throw ExceptionHelper.AEQbTJ(th);
        }
    }

    public static AbstractC58253yxm OLrzqt(InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm> interfaceC58229yxO, Callable<AbstractC58253yxm> callable) {
        return (AbstractC58253yxm) C58297yyd.AEQbTJ(copydefault((InterfaceC58229yxO<Callable<AbstractC58253yxm>, R>) interfaceC58229yxO, callable), "Scheduler Callable result can't be null");
    }

    private yBG() {
        throw new java.lang.IllegalStateException("No instances!");
    }
}
