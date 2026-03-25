package o;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import io.reactivex.internal.operators.flowable.FlowableCache;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import io.reactivex.internal.operators.flowable.FlowableMapNotification;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.ywX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58185ywX<T> implements InterfaceC60096zvd<T> {
    public static final int BUFFER_SIZE = java.lang.Math.max(1, java.lang.Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt() {
        return BUFFER_SIZE;
    }

    public abstract void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve);

    public static <T, R> AbstractC58185ywX<R> EZpvd(InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, InterfaceC60096zvd<? extends T>... interfaceC60096zvdArr) {
        return OLrzqt(interfaceC60096zvdArr, interfaceC58229yxO, OLrzqt());
    }

    public static <T, R> AbstractC58185ywX<R> OLrzqt(InterfaceC60096zvd<? extends T>[] interfaceC60096zvdArr, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC60096zvdArr, "sources is null");
        if (interfaceC60096zvdArr.length == 0) {
            return KWHzl();
        }
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.AEQbTJ(new FlowableCombineLatest((InterfaceC60096zvd[]) interfaceC60096zvdArr, (InterfaceC58229yxO) interfaceC58229yxO, i, false));
    }

    public static <T, R> AbstractC58185ywX<R> EZpvd(java.lang.Iterable<? extends InterfaceC60096zvd<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        return AEQbTJ(iterable, interfaceC58229yxO, OLrzqt());
    }

    public static <T, R> AbstractC58185ywX<R> AEQbTJ(java.lang.Iterable<? extends InterfaceC60096zvd<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(iterable, "sources is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.AEQbTJ(new FlowableCombineLatest((java.lang.Iterable) iterable, (InterfaceC58229yxO) interfaceC58229yxO, i, false));
    }

    public static <T1, T2, R> AbstractC58185ywX<R> KWHzl(InterfaceC60096zvd<? extends T1> interfaceC60096zvd, InterfaceC60096zvd<? extends T2> interfaceC60096zvd2, InterfaceC58223yxI<? super T1, ? super T2, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        return EZpvd(Functions.EZpvd((InterfaceC58223yxI) interfaceC58223yxI), interfaceC60096zvd, interfaceC60096zvd2);
    }

    public static <T1, T2, T3, R> AbstractC58185ywX<R> AEQbTJ(InterfaceC60096zvd<? extends T1> interfaceC60096zvd, InterfaceC60096zvd<? extends T2> interfaceC60096zvd2, InterfaceC60096zvd<? extends T3> interfaceC60096zvd3, InterfaceC58228yxN<? super T1, ? super T2, ? super T3, ? extends R> interfaceC58228yxN) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd3, "source3 is null");
        return EZpvd(Functions.OLrzqt(interfaceC58228yxN), interfaceC60096zvd, interfaceC60096zvd2, interfaceC60096zvd3);
    }

    public static <T> AbstractC58185ywX<T> AEQbTJ(java.lang.Iterable<? extends InterfaceC60096zvd<? extends T>> iterable) {
        C58297yyd.AEQbTJ(iterable, "sources is null");
        return copydefault(iterable).KWHzl(Functions.OLrzqt(), 2, false);
    }

    public static <T> AbstractC58185ywX<T> KWHzl(InterfaceC60096zvd<? extends T> interfaceC60096zvd, InterfaceC60096zvd<? extends T> interfaceC60096zvd2) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        return copydefault(interfaceC60096zvd, interfaceC60096zvd2);
    }

    public static <T> AbstractC58185ywX<T> copydefault(InterfaceC60096zvd<? extends T>... interfaceC60096zvdArr) {
        if (interfaceC60096zvdArr.length == 0) {
            return KWHzl();
        }
        if (interfaceC60096zvdArr.length == 1) {
            return copydefault(interfaceC60096zvdArr[0]);
        }
        return yBG.AEQbTJ(new FlowableConcatArray(interfaceC60096zvdArr, false));
    }

    public static <T> AbstractC58185ywX<T> KWHzl(InterfaceC58187ywZ<T> interfaceC58187ywZ, BackpressureStrategy backpressureStrategy) {
        C58297yyd.AEQbTJ(interfaceC58187ywZ, "source is null");
        C58297yyd.AEQbTJ(backpressureStrategy, "mode is null");
        return yBG.AEQbTJ(new FlowableCreate(interfaceC58187ywZ, backpressureStrategy));
    }

    public static <T> AbstractC58185ywX<T> EZpvd(Callable<? extends InterfaceC60096zvd<? extends T>> callable) {
        C58297yyd.AEQbTJ(callable, "supplier is null");
        return yBG.AEQbTJ(new C58272yyE(callable));
    }

    public static <T> AbstractC58185ywX<T> KWHzl() {
        return yBG.AEQbTJ(C58280yyM.KWHzl);
    }

    public static <T> AbstractC58185ywX<T> KWHzl(Callable<? extends java.lang.Throwable> callable) {
        C58297yyd.AEQbTJ(callable, "supplier is null");
        return yBG.AEQbTJ(new C58282yyO(callable));
    }

    public static <T> AbstractC58185ywX<T> AEQbTJ(java.lang.Throwable th) {
        C58297yyd.AEQbTJ(th, "throwable is null");
        return KWHzl((Callable<? extends java.lang.Throwable>) Functions.AEQbTJ(th));
    }

    public static <T> AbstractC58185ywX<T> KWHzl(T... tArr) {
        C58297yyd.AEQbTJ(tArr, "items is null");
        if (tArr.length == 0) {
            return KWHzl();
        }
        if (tArr.length == 1) {
            return KWHzl(tArr[0]);
        }
        return yBG.AEQbTJ(new FlowableFromArray(tArr));
    }

    public static <T> AbstractC58185ywX<T> AEQbTJ(Callable<? extends T> callable) {
        C58297yyd.AEQbTJ(callable, "supplier is null");
        return yBG.AEQbTJ((AbstractC58185ywX) new CallableC58281yyN(callable));
    }

    public static <T> AbstractC58185ywX<T> copydefault(java.lang.Iterable<? extends T> iterable) {
        C58297yyd.AEQbTJ(iterable, "source is null");
        return yBG.AEQbTJ(new FlowableFromIterable(iterable));
    }

    public static <T> AbstractC58185ywX<T> copydefault(InterfaceC60096zvd<? extends T> interfaceC60096zvd) {
        if (interfaceC60096zvd instanceof AbstractC58185ywX) {
            return yBG.AEQbTJ((AbstractC58185ywX) interfaceC60096zvd);
        }
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source is null");
        return yBG.AEQbTJ(new C58285yyR(interfaceC60096zvd));
    }

    public static AbstractC58185ywX<java.lang.Long> EZpvd(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return KWHzl(j, j2, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58185ywX<java.lang.Long> KWHzl(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableInterval(java.lang.Math.max(0L, j), java.lang.Math.max(0L, j2), timeUnit, abstractC58253yxm));
    }

    public static AbstractC58185ywX<java.lang.Long> EZpvd(long j, java.util.concurrent.TimeUnit timeUnit) {
        return KWHzl(j, j, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58185ywX<java.lang.Long> copydefault(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit) {
        return OLrzqt(j, j2, j3, j4, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58185ywX<java.lang.Long> OLrzqt(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 required but it was " + j2);
        }
        if (j2 == 0) {
            return KWHzl().OLrzqt(j3, timeUnit, abstractC58253yxm);
        }
        long j5 = j + (j2 - 1);
        if (j > 0 && j5 < 0) {
            throw new java.lang.IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableIntervalRange(j, j5, java.lang.Math.max(0L, j3), java.lang.Math.max(0L, j4), timeUnit, abstractC58253yxm));
    }

    public static <T> AbstractC58185ywX<T> KWHzl(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item is null");
        return yBG.AEQbTJ((AbstractC58185ywX) new C58290yyW(t));
    }

    public static <T> AbstractC58185ywX<T> EZpvd(T t, T t2) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        return KWHzl(t, t2);
    }

    public static <T> AbstractC58185ywX<T> KWHzl(java.lang.Iterable<? extends InterfaceC60096zvd<? extends T>> iterable) {
        return copydefault(iterable).KWHzl(Functions.OLrzqt());
    }

    public static <T> AbstractC58185ywX<T> KWHzl(InterfaceC60096zvd<? extends InterfaceC60096zvd<? extends T>> interfaceC60096zvd) {
        return EZpvd(interfaceC60096zvd, OLrzqt());
    }

    public static <T> AbstractC58185ywX<T> EZpvd(InterfaceC60096zvd<? extends InterfaceC60096zvd<? extends T>> interfaceC60096zvd, int i) {
        return copydefault(interfaceC60096zvd).AEQbTJ(Functions.OLrzqt(), i);
    }

    public static <T> AbstractC58185ywX<T> AEQbTJ(InterfaceC60096zvd<? extends T> interfaceC60096zvd, InterfaceC60096zvd<? extends T> interfaceC60096zvd2) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        return KWHzl((java.lang.Object[]) new InterfaceC60096zvd[]{interfaceC60096zvd, interfaceC60096zvd2}).OLrzqt(Functions.OLrzqt(), false, 2);
    }

    public static <T> AbstractC58185ywX<T> copydefault(InterfaceC60096zvd<? extends T> interfaceC60096zvd, InterfaceC60096zvd<? extends T> interfaceC60096zvd2, InterfaceC60096zvd<? extends T> interfaceC60096zvd3, InterfaceC60096zvd<? extends T> interfaceC60096zvd4) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd4, "source4 is null");
        return KWHzl((java.lang.Object[]) new InterfaceC60096zvd[]{interfaceC60096zvd, interfaceC60096zvd2, interfaceC60096zvd3, interfaceC60096zvd4}).OLrzqt(Functions.OLrzqt(), false, 4);
    }

    public static <T> AbstractC58185ywX<T> copydefault() {
        return yBG.AEQbTJ(C58286yyS.EZpvd);
    }

    public static AbstractC58185ywX<java.lang.Integer> OLrzqt(int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 required but it was " + i2);
        }
        if (i2 == 0) {
            return KWHzl();
        }
        if (i2 == 1) {
            return KWHzl(java.lang.Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) > 2147483647L) {
            throw new java.lang.IllegalArgumentException("Integer overflow");
        }
        return yBG.AEQbTJ(new FlowableRange(i, i2));
    }

    public static AbstractC58185ywX<java.lang.Long> KWHzl(long j, java.util.concurrent.TimeUnit timeUnit) {
        return KWHzl(j, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58185ywX<java.lang.Long> KWHzl(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableTimer(java.lang.Math.max(0L, j), timeUnit, abstractC58253yxm));
    }

    public static <T, R> AbstractC58185ywX<R> AEQbTJ(java.lang.Iterable<? extends InterfaceC60096zvd<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.AEQbTJ(iterable, "sources is null");
        return yBG.AEQbTJ(new FlowableZip(null, iterable, interfaceC58229yxO, OLrzqt(), false));
    }

    public static <T1, T2, R> AbstractC58185ywX<R> EZpvd(InterfaceC60096zvd<? extends T1> interfaceC60096zvd, InterfaceC60096zvd<? extends T2> interfaceC60096zvd2, InterfaceC58223yxI<? super T1, ? super T2, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        return copydefault(Functions.EZpvd((InterfaceC58223yxI) interfaceC58223yxI), false, OLrzqt(), interfaceC60096zvd, interfaceC60096zvd2);
    }

    public static <T1, T2, T3, R> AbstractC58185ywX<R> EZpvd(InterfaceC60096zvd<? extends T1> interfaceC60096zvd, InterfaceC60096zvd<? extends T2> interfaceC60096zvd2, InterfaceC60096zvd<? extends T3> interfaceC60096zvd3, InterfaceC58228yxN<? super T1, ? super T2, ? super T3, ? extends R> interfaceC58228yxN) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd3, "source3 is null");
        return copydefault(Functions.OLrzqt(interfaceC58228yxN), false, OLrzqt(), interfaceC60096zvd, interfaceC60096zvd2, interfaceC60096zvd3);
    }

    public static <T1, T2, T3, T4, R> AbstractC58185ywX<R> copydefault(InterfaceC60096zvd<? extends T1> interfaceC60096zvd, InterfaceC60096zvd<? extends T2> interfaceC60096zvd2, InterfaceC60096zvd<? extends T3> interfaceC60096zvd3, InterfaceC60096zvd<? extends T4> interfaceC60096zvd4, InterfaceC58230yxP<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC58230yxP) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd4, "source4 is null");
        return copydefault(Functions.KWHzl(interfaceC58230yxP), false, OLrzqt(), interfaceC60096zvd, interfaceC60096zvd2, interfaceC60096zvd3, interfaceC60096zvd4);
    }

    public static <T1, T2, T3, T4, T5, R> AbstractC58185ywX<R> AEQbTJ(InterfaceC60096zvd<? extends T1> interfaceC60096zvd, InterfaceC60096zvd<? extends T2> interfaceC60096zvd2, InterfaceC60096zvd<? extends T3> interfaceC60096zvd3, InterfaceC60096zvd<? extends T4> interfaceC60096zvd4, InterfaceC60096zvd<? extends T5> interfaceC60096zvd5, InterfaceC58231yxQ<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> interfaceC58231yxQ) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd5, "source5 is null");
        return copydefault(Functions.copydefault((InterfaceC58231yxQ) interfaceC58231yxQ), false, OLrzqt(), interfaceC60096zvd, interfaceC60096zvd2, interfaceC60096zvd3, interfaceC60096zvd4, interfaceC60096zvd5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> AbstractC58185ywX<R> OLrzqt(InterfaceC60096zvd<? extends T1> interfaceC60096zvd, InterfaceC60096zvd<? extends T2> interfaceC60096zvd2, InterfaceC60096zvd<? extends T3> interfaceC60096zvd3, InterfaceC60096zvd<? extends T4> interfaceC60096zvd4, InterfaceC60096zvd<? extends T5> interfaceC60096zvd5, InterfaceC60096zvd<? extends T6> interfaceC60096zvd6, InterfaceC58234yxT<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> interfaceC58234yxT) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC60096zvd6, "source6 is null");
        return copydefault(Functions.EZpvd((InterfaceC58234yxT) interfaceC58234yxT), false, OLrzqt(), interfaceC60096zvd, interfaceC60096zvd2, interfaceC60096zvd3, interfaceC60096zvd4, interfaceC60096zvd5, interfaceC60096zvd6);
    }

    public static <T, R> AbstractC58185ywX<R> copydefault(InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, boolean z, int i, InterfaceC60096zvd<? extends T>... interfaceC60096zvdArr) {
        if (interfaceC60096zvdArr.length == 0) {
            return KWHzl();
        }
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.AEQbTJ(new FlowableZip(interfaceC60096zvdArr, null, interfaceC58229yxO, i, z));
    }

    public final T AEQbTJ() {
        C56327yBg c56327yBg = new C56327yBg();
        copydefault(c56327yBg);
        T tOLrzqt = c56327yBg.OLrzqt();
        if (tOLrzqt != null) {
            return tOLrzqt;
        }
        throw new NoSuchElementException();
    }

    public final void EZpvd(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2) {
        C58271yyD.copydefault(this, interfaceC58227yxM, interfaceC58227yxM2, Functions.AEQbTJ);
    }

    public final void OLrzqt(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH) {
        C58271yyD.copydefault(this, interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH);
    }

    public final AbstractC58185ywX<java.util.List<T>> AEQbTJ(int i) {
        return KWHzl(i, i);
    }

    public final AbstractC58185ywX<java.util.List<T>> KWHzl(int i, int i2) {
        return (AbstractC58185ywX<java.util.List<T>>) copydefault(i, i2, ArrayListSupplier.asCallable());
    }

    public final <U extends java.util.Collection<? super T>> AbstractC58185ywX<U> copydefault(int i, int i2, Callable<U> callable) {
        C58297yyd.OLrzqt(i, "count");
        C58297yyd.OLrzqt(i2, "skip");
        C58297yyd.AEQbTJ(callable, "bufferSupplier is null");
        return yBG.AEQbTJ(new FlowableBuffer(this, i, i2, callable));
    }

    public final AbstractC58185ywX<java.util.List<T>> copydefault(long j, java.util.concurrent.TimeUnit timeUnit) {
        return OLrzqt(j, timeUnit, yBP.KWHzl(), Integer.MAX_VALUE);
    }

    public final AbstractC58185ywX<java.util.List<T>> OLrzqt(long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        return OLrzqt(j, timeUnit, yBP.KWHzl(), i);
    }

    public final AbstractC58185ywX<java.util.List<T>> OLrzqt(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, int i) {
        return (AbstractC58185ywX<java.util.List<T>>) OLrzqt(j, timeUnit, abstractC58253yxm, i, (Callable) ArrayListSupplier.asCallable(), false);
    }

    public final <U extends java.util.Collection<? super T>> AbstractC58185ywX<U> OLrzqt(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, int i, Callable<U> callable, boolean z) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.AEQbTJ(callable, "bufferSupplier is null");
        C58297yyd.OLrzqt(i, "count");
        return yBG.AEQbTJ(new C58275yyH(this, j, j, timeUnit, abstractC58253yxm, callable, i, z));
    }

    public final AbstractC58185ywX<T> EZpvd() {
        return OLrzqt(16);
    }

    public final AbstractC58185ywX<T> OLrzqt(int i) {
        C58297yyd.OLrzqt(i, "initialCapacity");
        return yBG.AEQbTJ(new FlowableCache(this, i));
    }

    public final <U> AbstractC58185ywX<U> copydefault(java.lang.Class<U> cls) {
        C58297yyd.AEQbTJ(cls, "clazz is null");
        return (AbstractC58185ywX<U>) AEQbTJ((InterfaceC58229yxO) Functions.KWHzl(cls));
    }

    public final <R> AbstractC58185ywX<R> EZpvd(InterfaceC58241yxa<? super T, ? extends R> interfaceC58241yxa) {
        return copydefault(((InterfaceC58241yxa) C58297yyd.AEQbTJ(interfaceC58241yxa, "composer is null")).copydefault(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ywX<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC58185ywX<R> KWHzl(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, int i, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        if (!(this instanceof InterfaceCallableC58300yyg)) {
            return yBG.AEQbTJ(new FlowableConcatMap(this, interfaceC58229yxO, i, z ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
        if (objCall == null) {
            return KWHzl();
        }
        return C58288yyU.AEQbTJ(objCall, interfaceC58229yxO);
    }

    public final AbstractC58185ywX<T> copydefault(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableDebounceTimed(this, j, timeUnit, abstractC58253yxm));
    }

    public final AbstractC58185ywX<T> OLrzqt(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return EZpvd(j, timeUnit, abstractC58253yxm, false);
    }

    public final AbstractC58185ywX<T> EZpvd(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new C58273yyF(this, java.lang.Math.max(0L, j), timeUnit, abstractC58253yxm, z));
    }

    public final <U> AbstractC58185ywX<T> EZpvd(InterfaceC60096zvd<U> interfaceC60096zvd) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "subscriptionIndicator is null");
        return yBG.AEQbTJ(new FlowableDelaySubscriptionOther(this, interfaceC60096zvd));
    }

    public final AbstractC58185ywX<T> OLrzqt(long j, java.util.concurrent.TimeUnit timeUnit) {
        return EZpvd(j, timeUnit, yBP.KWHzl());
    }

    public final AbstractC58185ywX<T> EZpvd(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return EZpvd(KWHzl(j, timeUnit, abstractC58253yxm));
    }

    public final AbstractC58185ywX<T> copydefault(InterfaceC58224yxJ<? super T, ? super T> interfaceC58224yxJ) {
        C58297yyd.AEQbTJ(interfaceC58224yxJ, "comparer is null");
        return yBG.AEQbTJ(new C58277yyJ(this, Functions.OLrzqt(), interfaceC58224yxJ));
    }

    public final AbstractC58185ywX<T> copydefault(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onFinally is null");
        return yBG.AEQbTJ(new FlowableDoFinally(this, interfaceC58222yxH));
    }

    public final AbstractC58185ywX<T> EZpvd(InterfaceC58222yxH interfaceC58222yxH) {
        return AEQbTJ(Functions.KWHzl(), Functions.EZpvd, interfaceC58222yxH);
    }

    public final AbstractC58185ywX<T> OLrzqt(InterfaceC58222yxH interfaceC58222yxH) {
        return EZpvd(Functions.KWHzl(), Functions.KWHzl(), interfaceC58222yxH, Functions.AEQbTJ);
    }

    public final AbstractC58185ywX<T> EZpvd(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onNext is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH2, "onAfterTerminate is null");
        return yBG.AEQbTJ(new C58279yyL(this, interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, interfaceC58222yxH2));
    }

    public final AbstractC58185ywX<T> OLrzqt(InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        InterfaceC58227yxM<? super T> interfaceC58227yxMKWHzl = Functions.KWHzl();
        InterfaceC58222yxH interfaceC58222yxH = Functions.AEQbTJ;
        return EZpvd(interfaceC58227yxMKWHzl, interfaceC58227yxM, interfaceC58222yxH, interfaceC58222yxH);
    }

    public final AbstractC58185ywX<T> AEQbTJ(InterfaceC58227yxM<? super InterfaceC60094zvb> interfaceC58227yxM, InterfaceC58236yxV interfaceC58236yxV, InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onSubscribe is null");
        C58297yyd.AEQbTJ(interfaceC58236yxV, "onRequest is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onCancel is null");
        return yBG.AEQbTJ(new C58278yyK(this, interfaceC58227yxM, interfaceC58236yxV, interfaceC58222yxH));
    }

    public final AbstractC58185ywX<T> KWHzl(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxMKWHzl = Functions.KWHzl();
        InterfaceC58222yxH interfaceC58222yxH = Functions.AEQbTJ;
        return EZpvd(interfaceC58227yxM, interfaceC58227yxMKWHzl, interfaceC58222yxH, interfaceC58222yxH);
    }

    public final AbstractC58185ywX<T> EZpvd(InterfaceC58227yxM<? super InterfaceC60094zvb> interfaceC58227yxM) {
        return AEQbTJ(interfaceC58227yxM, Functions.EZpvd, Functions.AEQbTJ);
    }

    public final AbstractC58185ywX<T> KWHzl(InterfaceC58222yxH interfaceC58222yxH) {
        return EZpvd(Functions.KWHzl(), Functions.OLrzqt(interfaceC58222yxH), interfaceC58222yxH, Functions.AEQbTJ);
    }

    public final AbstractC58260yxt<T> KWHzl(long j) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        return yBG.AEQbTJ(new C58276yyI(this, j, null));
    }

    public final AbstractC58185ywX<T> KWHzl(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.AEQbTJ(new C58284yyQ(this, interfaceC58239yxY));
    }

    public final AbstractC58260yxt<T> gEmmrt() {
        return KWHzl(0L);
    }

    public final <R> AbstractC58185ywX<R> KWHzl(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO) {
        return OLrzqt((InterfaceC58229yxO) interfaceC58229yxO, false, OLrzqt(), OLrzqt());
    }

    public final <R> AbstractC58185ywX<R> AEQbTJ(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, int i) {
        return OLrzqt((InterfaceC58229yxO) interfaceC58229yxO, false, i, OLrzqt());
    }

    public final <R> AbstractC58185ywX<R> OLrzqt(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, boolean z, int i) {
        return OLrzqt(interfaceC58229yxO, z, i, OLrzqt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywX<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC58185ywX<R> OLrzqt(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, boolean z, int i, int i2) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        C58297yyd.OLrzqt(i2, "bufferSize");
        if (this instanceof InterfaceCallableC58300yyg) {
            java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
            if (objCall == null) {
                return KWHzl();
            }
            return C58288yyU.AEQbTJ(objCall, interfaceC58229yxO);
        }
        return yBG.AEQbTJ(new FlowableFlatMap(this, interfaceC58229yxO, z, i, i2));
    }

    public final <R> AbstractC58185ywX<R> copydefault(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO2, Callable<? extends InterfaceC60096zvd<? extends R>> callable) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "onNextMapper is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "onErrorMapper is null");
        C58297yyd.AEQbTJ(callable, "onCompleteSupplier is null");
        return KWHzl((InterfaceC60096zvd) new FlowableMapNotification(this, interfaceC58229yxO, interfaceC58229yxO2, callable));
    }

    public final <R> AbstractC58185ywX<R> EZpvd(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO) {
        return KWHzl((InterfaceC58229yxO) interfaceC58229yxO, false, Integer.MAX_VALUE);
    }

    public final <R> AbstractC58185ywX<R> KWHzl(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        return yBG.AEQbTJ(new FlowableFlatMapMaybe(this, interfaceC58229yxO, z, i));
    }

    public final <R> AbstractC58185ywX<R> copydefault(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        return AEQbTJ((InterfaceC58229yxO) interfaceC58229yxO, false, Integer.MAX_VALUE);
    }

    public final <R> AbstractC58185ywX<R> AEQbTJ(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        return yBG.AEQbTJ(new FlowableFlatMapSingle(this, interfaceC58229yxO, z, i));
    }

    public final <R> AbstractC58185ywX<R> AEQbTJ(InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.AEQbTJ(new C58287yyT(this, interfaceC58229yxO));
    }

    public final AbstractC58185ywX<T> AEQbTJ(InterfaceC60096zvd<? extends T> interfaceC60096zvd) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "other is null");
        return AEQbTJ(this, interfaceC60096zvd);
    }

    public final AbstractC58185ywX<T> KWHzl(AbstractC58253yxm abstractC58253yxm) {
        return copydefault(abstractC58253yxm, false, OLrzqt());
    }

    public final AbstractC58185ywX<T> copydefault(AbstractC58253yxm abstractC58253yxm, boolean z, int i) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.AEQbTJ(new FlowableObserveOn(this, abstractC58253yxm, z, i));
    }

    public final <U> AbstractC58185ywX<U> EZpvd(java.lang.Class<U> cls) {
        C58297yyd.AEQbTJ(cls, "clazz is null");
        return KWHzl((InterfaceC58239yxY) Functions.OLrzqt(cls)).copydefault(cls);
    }

    public final AbstractC58185ywX<T> AYXKKw() {
        return copydefault(OLrzqt(), false, true);
    }

    public final AbstractC58185ywX<T> copydefault(int i, boolean z, boolean z2) {
        C58297yyd.OLrzqt(i, "capacity");
        return yBG.AEQbTJ(new FlowableOnBackpressureBuffer(this, i, z2, z, Functions.AEQbTJ));
    }

    public final AbstractC58185ywX<T> OLrzqt(long j, InterfaceC58222yxH interfaceC58222yxH, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        C58297yyd.AEQbTJ(backpressureOverflowStrategy, "overflowStrategy is null");
        C58297yyd.KWHzl(j, "capacity");
        return yBG.AEQbTJ(new FlowableOnBackpressureBufferStrategy(this, j, interfaceC58222yxH, backpressureOverflowStrategy));
    }

    public final AbstractC58185ywX<T> AhwBna() {
        return yBG.AEQbTJ((AbstractC58185ywX) new FlowableOnBackpressureDrop(this));
    }

    public final AbstractC58185ywX<T> djBIcL() {
        return yBG.AEQbTJ(new FlowableOnBackpressureLatest(this));
    }

    public final AbstractC58185ywX<T> OLrzqt(InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC60096zvd<? extends T>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "resumeFunction is null");
        return yBG.AEQbTJ(new FlowableOnErrorNext(this, interfaceC58229yxO, false));
    }

    public final AbstractC58185ywX<T> OLrzqt(InterfaceC60096zvd<? extends T> interfaceC60096zvd) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "next is null");
        return OLrzqt((InterfaceC58229yxO) Functions.EZpvd(interfaceC60096zvd));
    }

    public final AbstractC58185ywX<T> djBIcL(InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "valueSupplier is null");
        return yBG.AEQbTJ(new FlowableOnErrorReturn(this, interfaceC58229yxO));
    }

    public final AbstractC58185ywX<T> AEQbTJ(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item is null");
        return djBIcL(Functions.EZpvd(t));
    }

    public final AbstractC58185ywX<T> AYXKKw(InterfaceC58229yxO<? super AbstractC58185ywX<java.lang.Throwable>, ? extends InterfaceC60096zvd<?>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "handler is null");
        return yBG.AEQbTJ(new FlowableRetryWhen(this, interfaceC58229yxO));
    }

    public final AbstractC58260yxt<T> OLrzqt(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "defaultItem is null");
        return yBG.AEQbTJ(new C58292yyY(this, t));
    }

    public final AbstractC58260yxt<T> valueOf() {
        return yBG.AEQbTJ(new C58292yyY(this, null));
    }

    public final InterfaceC58217yxC DbNXlk() {
        return AEQbTJ(Functions.KWHzl(), Functions.isConnected, Functions.AEQbTJ, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    public final InterfaceC58217yxC AEQbTJ(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        return AEQbTJ(interfaceC58227yxM, Functions.isConnected, Functions.AEQbTJ, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    public final InterfaceC58217yxC AEQbTJ(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2) {
        return AEQbTJ(interfaceC58227yxM, interfaceC58227yxM2, Functions.AEQbTJ, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    public final InterfaceC58217yxC AEQbTJ(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH) {
        return AEQbTJ(interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    public final InterfaceC58217yxC AEQbTJ(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58227yxM<? super InterfaceC60094zvb> interfaceC58227yxM3) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onNext is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, interfaceC58227yxM3);
        copydefault(lambdaSubscriber);
        return lambdaSubscriber;
    }

    @Override // o.InterfaceC60096zvd
    public final void subscribe(InterfaceC60097zve<? super T> interfaceC60097zve) {
        if (interfaceC60097zve instanceof InterfaceC58186ywY) {
            copydefault((InterfaceC58186ywY) interfaceC60097zve);
        } else {
            C58297yyd.AEQbTJ(interfaceC60097zve, "s is null");
            copydefault(new StrictSubscriber(interfaceC60097zve));
        }
    }

    public final void copydefault(InterfaceC58186ywY<? super T> interfaceC58186ywY) {
        C58297yyd.AEQbTJ(interfaceC58186ywY, "s is null");
        try {
            InterfaceC60097zve<? super T> interfaceC60097zveCopydefault = yBG.copydefault(this, interfaceC58186ywY);
            C58297yyd.AEQbTJ(interfaceC60097zveCopydefault, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            AEQbTJ((InterfaceC60097zve) interfaceC60097zveCopydefault);
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            yBG.copydefault(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final AbstractC58185ywX<T> copydefault(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return copydefault(abstractC58253yxm, !(this instanceof FlowableCreate));
    }

    public final AbstractC58185ywX<T> copydefault(AbstractC58253yxm abstractC58253yxm, boolean z) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableSubscribeOn(this, abstractC58253yxm, z));
    }

    public final <R> AbstractC58185ywX<R> AhwBna(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO) {
        return KWHzl(interfaceC58229yxO, OLrzqt());
    }

    public final <R> AbstractC58185ywX<R> KWHzl(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, int i) {
        return OLrzqt((InterfaceC58229yxO) interfaceC58229yxO, i, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ywX<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> AbstractC58185ywX<R> OLrzqt(InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, int i, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        if (this instanceof InterfaceCallableC58300yyg) {
            java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
            if (objCall == null) {
                return KWHzl();
            }
            return C58288yyU.AEQbTJ(objCall, interfaceC58229yxO);
        }
        return yBG.AEQbTJ(new FlowableSwitchMap(this, interfaceC58229yxO, i, z));
    }

    public final <R> AbstractC58185ywX<R> valueOf(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.AEQbTJ(new FlowableSwitchMapSingle(this, interfaceC58229yxO, false));
    }

    public final AbstractC58185ywX<T> EZpvd(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 required but it was " + j);
        }
        return yBG.AEQbTJ(new FlowableTake(this, j));
    }

    public final <U> AbstractC58185ywX<T> AhwBna(InterfaceC60096zvd<U> interfaceC60096zvd) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "other is null");
        return yBG.AEQbTJ(new FlowableTakeUntil(this, interfaceC60096zvd));
    }

    public final AbstractC58185ywX<T> AEQbTJ(long j, java.util.concurrent.TimeUnit timeUnit) {
        return AEQbTJ(j, timeUnit, yBP.KWHzl());
    }

    public final AbstractC58185ywX<T> AEQbTJ(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableThrottleFirstTimed(this, j, timeUnit, abstractC58253yxm));
    }

    public final AbstractC58185ywX<T> djBIcL(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return copydefault(j, timeUnit, abstractC58253yxm);
    }

    public final AbstractC58185ywX<T> gEmmrt(long j, java.util.concurrent.TimeUnit timeUnit) {
        return KWHzl(j, timeUnit, (InterfaceC60096zvd) null, yBP.KWHzl());
    }

    public final AbstractC58185ywX<T> KWHzl(long j, java.util.concurrent.TimeUnit timeUnit, InterfaceC60096zvd<? extends T> interfaceC60096zvd, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "timeUnit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableTimeoutTimed(this, j, timeUnit, abstractC58253yxm, interfaceC60096zvd));
    }

    public final AbstractC58185ywX<yBO<T>> AEQbTJ(AbstractC58253yxm abstractC58253yxm) {
        return copydefault(java.util.concurrent.TimeUnit.MILLISECONDS, abstractC58253yxm);
    }

    public final AbstractC58185ywX<yBO<T>> copydefault(java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return (AbstractC58185ywX<yBO<T>>) AEQbTJ((InterfaceC58229yxO) Functions.OLrzqt(timeUnit, abstractC58253yxm));
    }

    public final AbstractC58185ywX<T> OLrzqt(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.AEQbTJ(new FlowableUnsubscribeOn(this, abstractC58253yxm));
    }

    public final <U, R> AbstractC58185ywX<R> copydefault(InterfaceC60096zvd<? extends U> interfaceC60096zvd, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "other is null");
        return EZpvd(this, interfaceC60096zvd, interfaceC58223yxI);
    }
}
