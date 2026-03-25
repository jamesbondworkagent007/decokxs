package o;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTakeUntil;
import io.reactivex.internal.operators.single.SingleTimer;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.util.ErrorMode;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yxt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58260yxt<T> implements InterfaceC58261yxu<T> {
    public abstract void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr);

    public static <T> AbstractC58185ywX<T> AEQbTJ(java.lang.Iterable<? extends InterfaceC58261yxu<? extends T>> iterable) {
        return KWHzl(AbstractC58185ywX.copydefault(iterable));
    }

    public static <T> AbstractC58185ywX<T> KWHzl(InterfaceC60096zvd<? extends InterfaceC58261yxu<? extends T>> interfaceC60096zvd) {
        return OLrzqt(interfaceC60096zvd, 2);
    }

    public static <T> AbstractC58185ywX<T> OLrzqt(InterfaceC60096zvd<? extends InterfaceC58261yxu<? extends T>> interfaceC60096zvd, int i) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "sources is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.AEQbTJ(new C58274yyG(interfaceC60096zvd, SingleInternalHelper.KWHzl(), i, ErrorMode.IMMEDIATE));
    }

    public static <T> AbstractC58185ywX<T> copydefault(InterfaceC58261yxu<? extends T> interfaceC58261yxu, InterfaceC58261yxu<? extends T> interfaceC58261yxu2) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58261yxu2, "source2 is null");
        return KWHzl(AbstractC58185ywX.KWHzl((java.lang.Object[]) new InterfaceC58261yxu[]{interfaceC58261yxu, interfaceC58261yxu2}));
    }

    public static <T> AbstractC58260yxt<T> OLrzqt(InterfaceC58259yxs<T> interfaceC58259yxs) {
        C58297yyd.AEQbTJ(interfaceC58259yxs, "source is null");
        return yBG.AEQbTJ(new SingleCreate(interfaceC58259yxs));
    }

    public static <T> AbstractC58260yxt<T> OLrzqt(Callable<? extends java.lang.Throwable> callable) {
        C58297yyd.AEQbTJ(callable, "errorSupplier is null");
        return yBG.AEQbTJ(new yAH(callable));
    }

    public static <T> AbstractC58260yxt<T> AEQbTJ(java.lang.Throwable th) {
        C58297yyd.AEQbTJ(th, "exception is null");
        return OLrzqt((Callable<? extends java.lang.Throwable>) Functions.AEQbTJ(th));
    }

    public static <T> AbstractC58260yxt<T> copydefault(Callable<? extends T> callable) {
        C58297yyd.AEQbTJ(callable, "callable is null");
        return yBG.AEQbTJ(new yAF(callable));
    }

    public static <T> AbstractC58260yxt<T> AEQbTJ(InterfaceC60096zvd<? extends T> interfaceC60096zvd) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "publisher is null");
        return yBG.AEQbTJ(new yAN(interfaceC60096zvd));
    }

    public static <T> AbstractC58260yxt<T> copydefault(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item is null");
        return yBG.AEQbTJ(new yAL(t));
    }

    public static <T> AbstractC58260yxt<T> AEQbTJ() {
        return yBG.AEQbTJ(yAJ.KWHzl);
    }

    public static AbstractC58260yxt<java.lang.Long> copydefault(long j, java.util.concurrent.TimeUnit timeUnit) {
        return EZpvd(j, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58260yxt<java.lang.Long> EZpvd(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new SingleTimer(j, timeUnit, abstractC58253yxm));
    }

    public static <T> AbstractC58260yxt<T> copydefault(InterfaceC58261yxu<T> interfaceC58261yxu) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "source is null");
        if (interfaceC58261yxu instanceof AbstractC58260yxt) {
            return yBG.AEQbTJ((AbstractC58260yxt) interfaceC58261yxu);
        }
        return yBG.AEQbTJ(new yAM(interfaceC58261yxu));
    }

    public static <T, R> AbstractC58260yxt<R> EZpvd(java.lang.Iterable<? extends InterfaceC58261yxu<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.AEQbTJ(iterable, "sources is null");
        return yBG.AEQbTJ(new yAP(iterable, interfaceC58229yxO));
    }

    public static <T1, T2, R> AbstractC58260yxt<R> OLrzqt(InterfaceC58261yxu<? extends T1> interfaceC58261yxu, InterfaceC58261yxu<? extends T2> interfaceC58261yxu2, InterfaceC58223yxI<? super T1, ? super T2, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58261yxu2, "source2 is null");
        return OLrzqt(Functions.EZpvd((InterfaceC58223yxI) interfaceC58223yxI), interfaceC58261yxu, interfaceC58261yxu2);
    }

    public static <T1, T2, T3, R> AbstractC58260yxt<R> AEQbTJ(InterfaceC58261yxu<? extends T1> interfaceC58261yxu, InterfaceC58261yxu<? extends T2> interfaceC58261yxu2, InterfaceC58261yxu<? extends T3> interfaceC58261yxu3, InterfaceC58228yxN<? super T1, ? super T2, ? super T3, ? extends R> interfaceC58228yxN) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58261yxu2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58261yxu3, "source3 is null");
        return OLrzqt(Functions.OLrzqt(interfaceC58228yxN), interfaceC58261yxu, interfaceC58261yxu2, interfaceC58261yxu3);
    }

    public static <T1, T2, T3, T4, R> AbstractC58260yxt<R> AEQbTJ(InterfaceC58261yxu<? extends T1> interfaceC58261yxu, InterfaceC58261yxu<? extends T2> interfaceC58261yxu2, InterfaceC58261yxu<? extends T3> interfaceC58261yxu3, InterfaceC58261yxu<? extends T4> interfaceC58261yxu4, InterfaceC58230yxP<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC58230yxP) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58261yxu2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58261yxu3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58261yxu4, "source4 is null");
        return OLrzqt(Functions.KWHzl(interfaceC58230yxP), interfaceC58261yxu, interfaceC58261yxu2, interfaceC58261yxu3, interfaceC58261yxu4);
    }

    public static <T, R> AbstractC58260yxt<R> OLrzqt(InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, InterfaceC58261yxu<? extends T>... interfaceC58261yxuArr) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.AEQbTJ(interfaceC58261yxuArr, "sources is null");
        if (interfaceC58261yxuArr.length == 0) {
            return AEQbTJ(new NoSuchElementException());
        }
        return yBG.AEQbTJ(new SingleZipArray(interfaceC58261yxuArr, interfaceC58229yxO));
    }

    public final <R> AbstractC58260yxt<R> KWHzl(InterfaceC58262yxv<? super T, ? extends R> interfaceC58262yxv) {
        return copydefault(((InterfaceC58262yxv) C58297yyd.AEQbTJ(interfaceC58262yxv, "transformer is null")).copydefault(this));
    }

    public final AbstractC58260yxt<T> EZpvd(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onFinally is null");
        return yBG.AEQbTJ(new SingleDoFinally(this, interfaceC58222yxH));
    }

    public final AbstractC58260yxt<T> KWHzl(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onSuccess is null");
        return yBG.AEQbTJ(new yAG(this, interfaceC58227yxM));
    }

    public final AbstractC58260yxt<T> OLrzqt(InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onError is null");
        return yBG.AEQbTJ(new yAE(this, interfaceC58227yxM));
    }

    public final AbstractC58260yxt<T> AEQbTJ(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onDispose is null");
        return yBG.AEQbTJ(new SingleDoOnDispose(this, interfaceC58222yxH));
    }

    public final AbstractC58245yxe<T> OLrzqt(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.copydefault(new C58347yza(this, interfaceC58239yxY));
    }

    public final <R> AbstractC58260yxt<R> OLrzqt(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.AEQbTJ(new SingleFlatMap(this, interfaceC58229yxO));
    }

    public final <R> AbstractC58185ywX<R> KWHzl(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.AEQbTJ(new SingleFlatMapPublisher(this, interfaceC58229yxO));
    }

    public final AbstractC58177ywP AEQbTJ(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.copydefault(new SingleFlatMapCompletable(this, interfaceC58229yxO));
    }

    public final T KWHzl() {
        C58308yyo c58308yyo = new C58308yyo();
        copydefault((InterfaceC58258yxr) c58308yyo);
        return (T) c58308yyo.KWHzl();
    }

    public final <R> AbstractC58260yxt<R> copydefault(InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.AEQbTJ(new yAK(this, interfaceC58229yxO));
    }

    public final AbstractC58260yxt<T> OLrzqt(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new SingleObserveOn(this, abstractC58253yxm));
    }

    public final AbstractC58260yxt<T> AhwBna(InterfaceC58229yxO<java.lang.Throwable, ? extends T> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "resumeFunction is null");
        return yBG.AEQbTJ(new yAS(this, interfaceC58229yxO, null));
    }

    public final AbstractC58260yxt<T> EZpvd(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "value is null");
        return yBG.AEQbTJ(new yAS(this, null, t));
    }

    public final AbstractC58260yxt<T> OLrzqt(AbstractC58260yxt<? extends T> abstractC58260yxt) {
        C58297yyd.AEQbTJ(abstractC58260yxt, "resumeSingleInCaseOfError is null");
        return EZpvd((InterfaceC58229yxO) Functions.EZpvd(abstractC58260yxt));
    }

    public final AbstractC58260yxt<T> EZpvd(InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58261yxu<? extends T>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "resumeFunctionInCaseOfError is null");
        return yBG.AEQbTJ(new SingleResumeNext(this, interfaceC58229yxO));
    }

    public final InterfaceC58217yxC bO_() {
        return AEQbTJ(Functions.KWHzl(), Functions.isConnected);
    }

    public final InterfaceC58217yxC copydefault(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        return AEQbTJ(interfaceC58227yxM, Functions.isConnected);
    }

    public final InterfaceC58217yxC AEQbTJ(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onSuccess is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(interfaceC58227yxM, interfaceC58227yxM2);
        copydefault((InterfaceC58258yxr) consumerSingleObserver);
        return consumerSingleObserver;
    }

    @Override // o.InterfaceC58261yxu
    public final void copydefault(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        C58297yyd.AEQbTJ(interfaceC58258yxr, "observer is null");
        InterfaceC58258yxr<? super T> interfaceC58258yxrAEQbTJ = yBG.AEQbTJ(this, interfaceC58258yxr);
        C58297yyd.AEQbTJ(interfaceC58258yxrAEQbTJ, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            KWHzl(interfaceC58258yxrAEQbTJ);
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final AbstractC58260yxt<T> KWHzl(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new SingleSubscribeOn(this, abstractC58253yxm));
    }

    public final <E> AbstractC58260yxt<T> OLrzqt(InterfaceC60096zvd<E> interfaceC60096zvd) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "other is null");
        return yBG.AEQbTJ(new SingleTakeUntil(this, interfaceC60096zvd));
    }

    public final <E> AbstractC58260yxt<T> EZpvd(InterfaceC58261yxu<? extends E> interfaceC58261yxu) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "other is null");
        return OLrzqt(new SingleToFlowable(interfaceC58261yxu));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yxt<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<T> EZpvd() {
        if (this instanceof InterfaceC58295yyb) {
            return ((InterfaceC58295yyb) this).OLrzqt();
        }
        return yBG.AEQbTJ(new SingleToFlowable(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yxt<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58247yxg<T> bN_() {
        if (this instanceof InterfaceC58240yxZ) {
            return ((InterfaceC58240yxZ) this).copydefault();
        }
        return yBG.EZpvd(new SingleToObservable(this));
    }
}
