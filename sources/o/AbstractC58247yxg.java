package o;

import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observers.TestObserver;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: o.yxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58247yxg<T> implements InterfaceC58255yxo<T> {
    public abstract void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp);

    public static <T> AbstractC58247yxg<T> amb(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable) {
        C58297yyd.AEQbTJ(iterable, "sources is null");
        return yBG.EZpvd(new ObservableAmb(null, iterable));
    }

    public static <T> AbstractC58247yxg<T> ambArray(InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        C58297yyd.AEQbTJ(interfaceC58255yxoArr, "sources is null");
        int length = interfaceC58255yxoArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap(interfaceC58255yxoArr[0]);
        }
        return yBG.EZpvd(new ObservableAmb(interfaceC58255yxoArr, null));
    }

    public static int bufferSize() {
        return AbstractC58185ywX.OLrzqt();
    }

    public static <T, R> AbstractC58247yxg<R> combineLatest(InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i, InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return combineLatest(interfaceC58255yxoArr, interfaceC58229yxO, i);
    }

    public static <T, R> AbstractC58247yxg<R> combineLatest(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        return combineLatest(iterable, interfaceC58229yxO, bufferSize());
    }

    public static <T, R> AbstractC58247yxg<R> combineLatest(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(iterable, "sources is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableCombineLatest(null, iterable, interfaceC58229yxO, i << 1, false));
    }

    public static <T, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T>[] interfaceC58255yxoArr, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        return combineLatest(interfaceC58255yxoArr, interfaceC58229yxO, bufferSize());
    }

    public static <T, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T>[] interfaceC58255yxoArr, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxoArr, "sources is null");
        if (interfaceC58255yxoArr.length == 0) {
            return empty();
        }
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableCombineLatest(interfaceC58255yxoArr, null, interfaceC58229yxO, i << 1, false));
    }

    public static <T1, T2, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58223yxI<? super T1, ? super T2, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        return combineLatest(Functions.EZpvd((InterfaceC58223yxI) interfaceC58223yxI), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2);
    }

    public static <T1, T2, T3, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58228yxN<? super T1, ? super T2, ? super T3, ? extends R> interfaceC58228yxN) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        return combineLatest(Functions.OLrzqt(interfaceC58228yxN), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3);
    }

    public static <T1, T2, T3, T4, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58230yxP<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC58230yxP) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        return combineLatest(Functions.KWHzl(interfaceC58230yxP), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4);
    }

    public static <T1, T2, T3, T4, T5, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58231yxQ<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> interfaceC58231yxQ) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        return combineLatest(Functions.copydefault((InterfaceC58231yxQ) interfaceC58231yxQ), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58234yxT<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> interfaceC58234yxT) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        return combineLatest(Functions.EZpvd((InterfaceC58234yxT) interfaceC58234yxT), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58255yxo<? extends T7> interfaceC58255yxo7, InterfaceC58233yxS<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> interfaceC58233yxS) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo7, "source7 is null");
        return combineLatest(Functions.OLrzqt(interfaceC58233yxS), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6, interfaceC58255yxo7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58255yxo<? extends T7> interfaceC58255yxo7, InterfaceC58255yxo<? extends T8> interfaceC58255yxo8, InterfaceC58232yxR<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> interfaceC58232yxR) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo7, "source7 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo8, "source8 is null");
        return combineLatest(Functions.AEQbTJ((InterfaceC58232yxR) interfaceC58232yxR), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6, interfaceC58255yxo7, interfaceC58255yxo8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> AbstractC58247yxg<R> combineLatest(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58255yxo<? extends T7> interfaceC58255yxo7, InterfaceC58255yxo<? extends T8> interfaceC58255yxo8, InterfaceC58255yxo<? extends T9> interfaceC58255yxo9, InterfaceC58235yxU<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> interfaceC58235yxU) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo7, "source7 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo8, "source8 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo9, "source9 is null");
        return combineLatest(Functions.copydefault((InterfaceC58235yxU) interfaceC58235yxU), bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6, interfaceC58255yxo7, interfaceC58255yxo8, interfaceC58255yxo9);
    }

    public static <T, R> AbstractC58247yxg<R> combineLatestDelayError(InterfaceC58255yxo<? extends T>[] interfaceC58255yxoArr, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        return combineLatestDelayError(interfaceC58255yxoArr, interfaceC58229yxO, bufferSize());
    }

    public static <T, R> AbstractC58247yxg<R> combineLatestDelayError(InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i, InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return combineLatestDelayError(interfaceC58255yxoArr, interfaceC58229yxO, i);
    }

    public static <T, R> AbstractC58247yxg<R> combineLatestDelayError(InterfaceC58255yxo<? extends T>[] interfaceC58255yxoArr, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i) {
        C58297yyd.OLrzqt(i, "bufferSize");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        if (interfaceC58255yxoArr.length == 0) {
            return empty();
        }
        return yBG.EZpvd(new ObservableCombineLatest(interfaceC58255yxoArr, null, interfaceC58229yxO, i << 1, true));
    }

    public static <T, R> AbstractC58247yxg<R> combineLatestDelayError(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        return combineLatestDelayError(iterable, interfaceC58229yxO, bufferSize());
    }

    public static <T, R> AbstractC58247yxg<R> combineLatestDelayError(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(iterable, "sources is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableCombineLatest(null, iterable, interfaceC58229yxO, i << 1, true));
    }

    public static <T> AbstractC58247yxg<T> concat(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable) {
        C58297yyd.AEQbTJ(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.OLrzqt(), bufferSize(), false);
    }

    public static <T> AbstractC58247yxg<T> concat(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo) {
        return concat(interfaceC58255yxo, bufferSize());
    }

    public static <T> AbstractC58247yxg<T> concat(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.EZpvd(new ObservableConcatMap(interfaceC58255yxo, Functions.OLrzqt(), i, ErrorMode.IMMEDIATE));
    }

    public static <T> AbstractC58247yxg<T> concat(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        return concatArray(interfaceC58255yxo, interfaceC58255yxo2);
    }

    public static <T> AbstractC58247yxg<T> concat(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58255yxo<? extends T> interfaceC58255yxo3) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        return concatArray(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3);
    }

    public static <T> AbstractC58247yxg<T> concat(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58255yxo<? extends T> interfaceC58255yxo3, InterfaceC58255yxo<? extends T> interfaceC58255yxo4) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        return concatArray(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4);
    }

    public static <T> AbstractC58247yxg<T> concatArray(InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        if (interfaceC58255yxoArr.length == 0) {
            return empty();
        }
        if (interfaceC58255yxoArr.length == 1) {
            return wrap(interfaceC58255yxoArr[0]);
        }
        return yBG.EZpvd(new ObservableConcatMap(fromArray(interfaceC58255yxoArr), Functions.OLrzqt(), bufferSize(), ErrorMode.BOUNDARY));
    }

    public static <T> AbstractC58247yxg<T> concatArrayDelayError(InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        if (interfaceC58255yxoArr.length == 0) {
            return empty();
        }
        if (interfaceC58255yxoArr.length == 1) {
            return wrap(interfaceC58255yxoArr[0]);
        }
        return concatDelayError(fromArray(interfaceC58255yxoArr));
    }

    public static <T> AbstractC58247yxg<T> concatArrayEager(InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return concatArrayEager(bufferSize(), bufferSize(), interfaceC58255yxoArr);
    }

    public static <T> AbstractC58247yxg<T> concatArrayEager(int i, int i2, InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return fromArray(interfaceC58255yxoArr).concatMapEagerDelayError(Functions.OLrzqt(), i, i2, false);
    }

    public static <T> AbstractC58247yxg<T> concatArrayEagerDelayError(InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), interfaceC58255yxoArr);
    }

    public static <T> AbstractC58247yxg<T> concatArrayEagerDelayError(int i, int i2, InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return fromArray(interfaceC58255yxoArr).concatMapEagerDelayError(Functions.OLrzqt(), i, i2, true);
    }

    public static <T> AbstractC58247yxg<T> concatDelayError(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable) {
        C58297yyd.AEQbTJ(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> AbstractC58247yxg<T> concatDelayError(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo) {
        return concatDelayError(interfaceC58255yxo, bufferSize(), true);
    }

    public static <T> AbstractC58247yxg<T> concatDelayError(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, int i, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        C58297yyd.OLrzqt(i, "prefetch is null");
        return yBG.EZpvd(new ObservableConcatMap(interfaceC58255yxo, Functions.OLrzqt(), i, z ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    public static <T> AbstractC58247yxg<T> concatEager(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo) {
        return concatEager(interfaceC58255yxo, bufferSize(), bufferSize());
    }

    public static <T> AbstractC58247yxg<T> concatEager(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, int i, int i2) {
        return wrap(interfaceC58255yxo).concatMapEager(Functions.OLrzqt(), i, i2);
    }

    public static <T> AbstractC58247yxg<T> concatEager(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> AbstractC58247yxg<T> concatEager(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.OLrzqt(), i, i2, false);
    }

    public static <T> AbstractC58247yxg<T> create(InterfaceC58249yxi<T> interfaceC58249yxi) {
        C58297yyd.AEQbTJ(interfaceC58249yxi, "source is null");
        return yBG.EZpvd(new ObservableCreate(interfaceC58249yxi));
    }

    public static <T> AbstractC58247yxg<T> defer(Callable<? extends InterfaceC58255yxo<? extends T>> callable) {
        C58297yyd.AEQbTJ(callable, "supplier is null");
        return yBG.EZpvd(new C58371yzy(callable));
    }

    public static <T> AbstractC58247yxg<T> empty() {
        return yBG.EZpvd(C58330yzJ.EZpvd);
    }

    public static <T> AbstractC58247yxg<T> error(Callable<? extends java.lang.Throwable> callable) {
        C58297yyd.AEQbTJ(callable, "errorSupplier is null");
        return yBG.EZpvd(new C58334yzN(callable));
    }

    public static <T> AbstractC58247yxg<T> error(java.lang.Throwable th) {
        C58297yyd.AEQbTJ(th, "exception is null");
        return error((Callable<? extends java.lang.Throwable>) Functions.AEQbTJ(th));
    }

    public static <T> AbstractC58247yxg<T> fromArray(T... tArr) {
        C58297yyd.AEQbTJ(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        if (tArr.length == 1) {
            return just(tArr[0]);
        }
        return yBG.EZpvd(new C58333yzM(tArr));
    }

    public static <T> AbstractC58247yxg<T> fromCallable(Callable<? extends T> callable) {
        C58297yyd.AEQbTJ(callable, "supplier is null");
        return yBG.EZpvd((AbstractC58247yxg) new CallableC58335yzO(callable));
    }

    public static <T> AbstractC58247yxg<T> fromFuture(Future<? extends T> future) {
        C58297yyd.AEQbTJ(future, "future is null");
        return yBG.EZpvd(new C58340yzT(future, 0L, null));
    }

    public static <T> AbstractC58247yxg<T> fromFuture(Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        C58297yyd.AEQbTJ(future, "future is null");
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        return yBG.EZpvd(new C58340yzT(future, j, timeUnit));
    }

    public static <T> AbstractC58247yxg<T> fromFuture(Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return fromFuture(future, j, timeUnit).subscribeOn(abstractC58253yxm);
    }

    public static <T> AbstractC58247yxg<T> fromFuture(Future<? extends T> future, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return fromFuture(future).subscribeOn(abstractC58253yxm);
    }

    public static <T> AbstractC58247yxg<T> fromIterable(java.lang.Iterable<? extends T> iterable) {
        C58297yyd.AEQbTJ(iterable, "source is null");
        return yBG.EZpvd(new C58337yzQ(iterable));
    }

    public static <T> AbstractC58247yxg<T> fromPublisher(InterfaceC60096zvd<? extends T> interfaceC60096zvd) {
        C58297yyd.AEQbTJ(interfaceC60096zvd, "publisher is null");
        return yBG.EZpvd(new C58339yzS(interfaceC60096zvd));
    }

    public static <T> AbstractC58247yxg<T> generate(InterfaceC58227yxM<InterfaceC58181ywT<T>> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "generator is null");
        return generate(Functions.AhwBna(), ObservableInternalHelper.OLrzqt(interfaceC58227yxM), Functions.KWHzl());
    }

    public static <T, S> AbstractC58247yxg<T> generate(Callable<S> callable, InterfaceC58220yxF<S, InterfaceC58181ywT<T>> interfaceC58220yxF) {
        C58297yyd.AEQbTJ(interfaceC58220yxF, "generator is null");
        return generate(callable, ObservableInternalHelper.copydefault(interfaceC58220yxF), Functions.KWHzl());
    }

    public static <T, S> AbstractC58247yxg<T> generate(Callable<S> callable, InterfaceC58220yxF<S, InterfaceC58181ywT<T>> interfaceC58220yxF, InterfaceC58227yxM<? super S> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(interfaceC58220yxF, "generator is null");
        return generate(callable, ObservableInternalHelper.copydefault(interfaceC58220yxF), interfaceC58227yxM);
    }

    public static <T, S> AbstractC58247yxg<T> generate(Callable<S> callable, InterfaceC58223yxI<S, InterfaceC58181ywT<T>, S> interfaceC58223yxI) {
        return generate(callable, interfaceC58223yxI, Functions.KWHzl());
    }

    public static <T, S> AbstractC58247yxg<T> generate(Callable<S> callable, InterfaceC58223yxI<S, InterfaceC58181ywT<T>, S> interfaceC58223yxI, InterfaceC58227yxM<? super S> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(callable, "initialState is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "generator is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM, "disposeState is null");
        return yBG.EZpvd(new C58341yzU(callable, interfaceC58223yxI, interfaceC58227yxM));
    }

    public static AbstractC58247yxg<java.lang.Long> interval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58247yxg<java.lang.Long> interval(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableInterval(java.lang.Math.max(0L, j), java.lang.Math.max(0L, j2), timeUnit, abstractC58253yxm));
    }

    public static AbstractC58247yxg<java.lang.Long> interval(long j, java.util.concurrent.TimeUnit timeUnit) {
        return interval(j, j, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58247yxg<java.lang.Long> interval(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return interval(j, j, timeUnit, abstractC58253yxm);
    }

    public static AbstractC58247yxg<java.lang.Long> intervalRange(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58247yxg<java.lang.Long> intervalRange(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 required but it was " + j2);
        }
        if (j2 == 0) {
            return empty().delay(j3, timeUnit, abstractC58253yxm);
        }
        long j5 = j + (j2 - 1);
        if (j > 0 && j5 < 0) {
            throw new java.lang.IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableIntervalRange(j, j5, java.lang.Math.max(0L, j3), java.lang.Math.max(0L, j4), timeUnit, abstractC58253yxm));
    }

    public static <T> AbstractC58247yxg<T> just(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item is null");
        return yBG.EZpvd((AbstractC58247yxg) new C58344yzX(t));
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        return fromArray(t, t2);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        return fromArray(t, t2, t3);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3, T t4) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t4, "item4 is null");
        return fromArray(t, t2, t3, t4);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3, T t4, T t5) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t4, "item4 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t5, "item5 is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t4, "item4 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t5, "item5 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t6, "item6 is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t4, "item4 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t5, "item5 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t6, "item6 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t7, "item7 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t4, "item4 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t5, "item5 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t6, "item6 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t7, "item7 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t8, "item8 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t4, "item4 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t5, "item5 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t6, "item6 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t7, "item7 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t8, "item8 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t9, "item9 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <T> AbstractC58247yxg<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item1 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t2, "item2 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t3, "item3 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t4, "item4 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t5, "item5 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t6, "item6 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t7, "item7 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t8, "item8 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t9, "item9 is null");
        C58297yyd.AEQbTJ((java.lang.Object) t10, "item10 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    public static <T> AbstractC58247yxg<T> merge(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(Functions.OLrzqt(), false, i, i2);
    }

    public static <T> AbstractC58247yxg<T> mergeArray(int i, int i2, InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return fromArray(interfaceC58255yxoArr).flatMap(Functions.OLrzqt(), false, i, i2);
    }

    public static <T> AbstractC58247yxg<T> merge(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.OLrzqt());
    }

    public static <T> AbstractC58247yxg<T> merge(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(Functions.OLrzqt(), i);
    }

    public static <T> AbstractC58247yxg<T> merge(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        return yBG.EZpvd(new ObservableFlatMap(interfaceC58255yxo, Functions.OLrzqt(), false, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> AbstractC58247yxg<T> merge(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        return yBG.EZpvd(new ObservableFlatMap(interfaceC58255yxo, Functions.OLrzqt(), false, i, bufferSize()));
    }

    public static <T> AbstractC58247yxg<T> merge(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        return fromArray(interfaceC58255yxo, interfaceC58255yxo2).flatMap(Functions.OLrzqt(), false, 2);
    }

    public static <T> AbstractC58247yxg<T> merge(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58255yxo<? extends T> interfaceC58255yxo3) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        return fromArray(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3).flatMap(Functions.OLrzqt(), false, 3);
    }

    public static <T> AbstractC58247yxg<T> merge(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58255yxo<? extends T> interfaceC58255yxo3, InterfaceC58255yxo<? extends T> interfaceC58255yxo4) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        return fromArray(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4).flatMap(Functions.OLrzqt(), false, 4);
    }

    public static <T> AbstractC58247yxg<T> mergeArray(InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return fromArray(interfaceC58255yxoArr).flatMap(Functions.OLrzqt(), interfaceC58255yxoArr.length);
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.OLrzqt(), true);
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(Functions.OLrzqt(), true, i, i2);
    }

    public static <T> AbstractC58247yxg<T> mergeArrayDelayError(int i, int i2, InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return fromArray(interfaceC58255yxoArr).flatMap(Functions.OLrzqt(), true, i, i2);
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(Functions.OLrzqt(), true, i);
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        return yBG.EZpvd(new ObservableFlatMap(interfaceC58255yxo, Functions.OLrzqt(), true, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        return yBG.EZpvd(new ObservableFlatMap(interfaceC58255yxo, Functions.OLrzqt(), true, i, bufferSize()));
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        return fromArray(interfaceC58255yxo, interfaceC58255yxo2).flatMap(Functions.OLrzqt(), true, 2);
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58255yxo<? extends T> interfaceC58255yxo3) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        return fromArray(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3).flatMap(Functions.OLrzqt(), true, 3);
    }

    public static <T> AbstractC58247yxg<T> mergeDelayError(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58255yxo<? extends T> interfaceC58255yxo3, InterfaceC58255yxo<? extends T> interfaceC58255yxo4) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        return fromArray(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4).flatMap(Functions.OLrzqt(), true, 4);
    }

    public static <T> AbstractC58247yxg<T> mergeArrayDelayError(InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        return fromArray(interfaceC58255yxoArr).flatMap(Functions.OLrzqt(), true, interfaceC58255yxoArr.length);
    }

    public static <T> AbstractC58247yxg<T> never() {
        return yBG.EZpvd(C56299yAf.AEQbTJ);
    }

    public static AbstractC58247yxg<java.lang.Integer> range(int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 required but it was " + i2);
        }
        if (i2 == 0) {
            return empty();
        }
        if (i2 == 1) {
            return just(java.lang.Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) > 2147483647L) {
            throw new java.lang.IllegalArgumentException("Integer overflow");
        }
        return yBG.EZpvd(new ObservableRange(i, i2));
    }

    public static AbstractC58247yxg<java.lang.Long> rangeLong(long j, long j2) {
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 required but it was " + j2);
        }
        if (j2 == 0) {
            return empty();
        }
        if (j2 == 1) {
            return just(java.lang.Long.valueOf(j));
        }
        if (j > 0 && (j2 - 1) + j < 0) {
            throw new java.lang.IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return yBG.EZpvd(new ObservableRangeLong(j, j2));
    }

    public static <T> AbstractC58260yxt<java.lang.Boolean> sequenceEqual(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2) {
        return sequenceEqual(interfaceC58255yxo, interfaceC58255yxo2, C58297yyd.copydefault(), bufferSize());
    }

    public static <T> AbstractC58260yxt<java.lang.Boolean> sequenceEqual(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58224yxJ<? super T, ? super T> interfaceC58224yxJ) {
        return sequenceEqual(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58224yxJ, bufferSize());
    }

    public static <T> AbstractC58260yxt<java.lang.Boolean> sequenceEqual(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, InterfaceC58224yxJ<? super T, ? super T> interfaceC58224yxJ, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58224yxJ, "isEqual is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.AEQbTJ(new ObservableSequenceEqualSingle(interfaceC58255yxo, interfaceC58255yxo2, interfaceC58224yxJ, i));
    }

    public static <T> AbstractC58260yxt<java.lang.Boolean> sequenceEqual(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2, int i) {
        return sequenceEqual(interfaceC58255yxo, interfaceC58255yxo2, C58297yyd.copydefault(), i);
    }

    public static <T> AbstractC58247yxg<T> switchOnNext(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableSwitchMap(interfaceC58255yxo, Functions.OLrzqt(), i, false));
    }

    public static <T> AbstractC58247yxg<T> switchOnNext(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo) {
        return switchOnNext(interfaceC58255yxo, bufferSize());
    }

    public static <T> AbstractC58247yxg<T> switchOnNextDelayError(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo) {
        return switchOnNextDelayError(interfaceC58255yxo, bufferSize());
    }

    public static <T> AbstractC58247yxg<T> switchOnNextDelayError(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.EZpvd(new ObservableSwitchMap(interfaceC58255yxo, Functions.OLrzqt(), i, true));
    }

    public static AbstractC58247yxg<java.lang.Long> timer(long j, java.util.concurrent.TimeUnit timeUnit) {
        return timer(j, timeUnit, yBP.KWHzl());
    }

    public static AbstractC58247yxg<java.lang.Long> timer(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableTimer(java.lang.Math.max(j, 0L), timeUnit, abstractC58253yxm));
    }

    public static <T> AbstractC58247yxg<T> unsafeCreate(InterfaceC58255yxo<T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "onSubscribe is null");
        if (interfaceC58255yxo instanceof AbstractC58247yxg) {
            throw new java.lang.IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return yBG.EZpvd(new C58338yzR(interfaceC58255yxo));
    }

    public static <T, D> AbstractC58247yxg<T> using(Callable<? extends D> callable, InterfaceC58229yxO<? super D, ? extends InterfaceC58255yxo<? extends T>> interfaceC58229yxO, InterfaceC58227yxM<? super D> interfaceC58227yxM) {
        return using(callable, interfaceC58229yxO, interfaceC58227yxM, true);
    }

    public static <T, D> AbstractC58247yxg<T> using(Callable<? extends D> callable, InterfaceC58229yxO<? super D, ? extends InterfaceC58255yxo<? extends T>> interfaceC58229yxO, InterfaceC58227yxM<? super D> interfaceC58227yxM, boolean z) {
        C58297yyd.AEQbTJ(callable, "resourceSupplier is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "sourceSupplier is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM, "disposer is null");
        return yBG.EZpvd(new ObservableUsing(callable, interfaceC58229yxO, interfaceC58227yxM, z));
    }

    public static <T> AbstractC58247yxg<T> wrap(InterfaceC58255yxo<T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source is null");
        if (interfaceC58255yxo instanceof AbstractC58247yxg) {
            return yBG.EZpvd((AbstractC58247yxg) interfaceC58255yxo);
        }
        return yBG.EZpvd(new C58338yzR(interfaceC58255yxo));
    }

    public static <T, R> AbstractC58247yxg<R> zip(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.AEQbTJ(iterable, "sources is null");
        return yBG.EZpvd(new ObservableZip(null, iterable, interfaceC58229yxO, bufferSize(), false));
    }

    public static <T, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends InterfaceC58255yxo<? extends T>> interfaceC58255yxo, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sources is null");
        return yBG.EZpvd(new yAB(interfaceC58255yxo, 16).flatMap(ObservableInternalHelper.copydefault(interfaceC58229yxO)));
    }

    public static <T1, T2, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58223yxI<? super T1, ? super T2, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        return zipArray(Functions.EZpvd((InterfaceC58223yxI) interfaceC58223yxI), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2);
    }

    public static <T1, T2, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58223yxI<? super T1, ? super T2, ? extends R> interfaceC58223yxI, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        return zipArray(Functions.EZpvd((InterfaceC58223yxI) interfaceC58223yxI), z, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2);
    }

    public static <T1, T2, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58223yxI<? super T1, ? super T2, ? extends R> interfaceC58223yxI, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        return zipArray(Functions.EZpvd((InterfaceC58223yxI) interfaceC58223yxI), z, i, interfaceC58255yxo, interfaceC58255yxo2);
    }

    public static <T1, T2, T3, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58228yxN<? super T1, ? super T2, ? super T3, ? extends R> interfaceC58228yxN) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        return zipArray(Functions.OLrzqt(interfaceC58228yxN), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3);
    }

    public static <T1, T2, T3, T4, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58230yxP<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC58230yxP) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        return zipArray(Functions.KWHzl(interfaceC58230yxP), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4);
    }

    public static <T1, T2, T3, T4, T5, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58231yxQ<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> interfaceC58231yxQ) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        return zipArray(Functions.copydefault((InterfaceC58231yxQ) interfaceC58231yxQ), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58234yxT<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> interfaceC58234yxT) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        return zipArray(Functions.EZpvd((InterfaceC58234yxT) interfaceC58234yxT), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58255yxo<? extends T7> interfaceC58255yxo7, InterfaceC58233yxS<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> interfaceC58233yxS) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo7, "source7 is null");
        return zipArray(Functions.OLrzqt(interfaceC58233yxS), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6, interfaceC58255yxo7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58255yxo<? extends T7> interfaceC58255yxo7, InterfaceC58255yxo<? extends T8> interfaceC58255yxo8, InterfaceC58232yxR<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> interfaceC58232yxR) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo7, "source7 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo8, "source8 is null");
        return zipArray(Functions.AEQbTJ((InterfaceC58232yxR) interfaceC58232yxR), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6, interfaceC58255yxo7, interfaceC58255yxo8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> AbstractC58247yxg<R> zip(InterfaceC58255yxo<? extends T1> interfaceC58255yxo, InterfaceC58255yxo<? extends T2> interfaceC58255yxo2, InterfaceC58255yxo<? extends T3> interfaceC58255yxo3, InterfaceC58255yxo<? extends T4> interfaceC58255yxo4, InterfaceC58255yxo<? extends T5> interfaceC58255yxo5, InterfaceC58255yxo<? extends T6> interfaceC58255yxo6, InterfaceC58255yxo<? extends T7> interfaceC58255yxo7, InterfaceC58255yxo<? extends T8> interfaceC58255yxo8, InterfaceC58255yxo<? extends T9> interfaceC58255yxo9, InterfaceC58235yxU<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> interfaceC58235yxU) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "source1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "source2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "source3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "source4 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo5, "source5 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo6, "source6 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo7, "source7 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo8, "source8 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo9, "source9 is null");
        return zipArray(Functions.copydefault((InterfaceC58235yxU) interfaceC58235yxU), false, bufferSize(), interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4, interfaceC58255yxo5, interfaceC58255yxo6, interfaceC58255yxo7, interfaceC58255yxo8, interfaceC58255yxo9);
    }

    public static <T, R> AbstractC58247yxg<R> zipArray(InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, boolean z, int i, InterfaceC58255yxo<? extends T>... interfaceC58255yxoArr) {
        if (interfaceC58255yxoArr.length == 0) {
            return empty();
        }
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableZip(interfaceC58255yxoArr, null, interfaceC58229yxO, i, z));
    }

    public static <T, R> AbstractC58247yxg<R> zipIterable(java.lang.Iterable<? extends InterfaceC58255yxo<? extends T>> iterable, InterfaceC58229yxO<? super java.lang.Object[], ? extends R> interfaceC58229yxO, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "zipper is null");
        C58297yyd.AEQbTJ(iterable, "sources is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableZip(null, iterable, interfaceC58229yxO, i, z));
    }

    public final AbstractC58260yxt<java.lang.Boolean> all(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.AEQbTJ(new C58354yzh(this, interfaceC58239yxY));
    }

    public final AbstractC58247yxg<T> ambWith(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return ambArray(this, interfaceC58255yxo);
    }

    public final AbstractC58260yxt<java.lang.Boolean> any(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.AEQbTJ(new C58362yzp(this, interfaceC58239yxY));
    }

    public final <R> R as(InterfaceC58250yxj<T, ? extends R> interfaceC58250yxj) {
        return (R) ((InterfaceC58250yxj) C58297yyd.AEQbTJ(interfaceC58250yxj, "converter is null")).copydefault(this);
    }

    public final T blockingFirst() {
        C58303yyj c58303yyj = new C58303yyj();
        subscribe(c58303yyj);
        T tKWHzl = c58303yyj.KWHzl();
        if (tKWHzl != null) {
            return tKWHzl;
        }
        throw new NoSuchElementException();
    }

    public final T blockingFirst(T t) {
        C58303yyj c58303yyj = new C58303yyj();
        subscribe(c58303yyj);
        T tKWHzl = c58303yyj.KWHzl();
        return tKWHzl != null ? tKWHzl : t;
    }

    public final void blockingForEach(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        java.util.Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                interfaceC58227yxM.accept(it.next());
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                ((InterfaceC58217yxC) it).dispose();
                throw ExceptionHelper.AEQbTJ(th);
            }
        }
    }

    public final java.lang.Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final java.lang.Iterable<T> blockingIterable(int i) {
        C58297yyd.OLrzqt(i, "bufferSize");
        return new BlockingObservableIterable(this, i);
    }

    public final T blockingLast() {
        C58311yyr c58311yyr = new C58311yyr();
        subscribe(c58311yyr);
        T tKWHzl = c58311yyr.KWHzl();
        if (tKWHzl != null) {
            return tKWHzl;
        }
        throw new NoSuchElementException();
    }

    public final T blockingLast(T t) {
        C58311yyr c58311yyr = new C58311yyr();
        subscribe(c58311yyr);
        T tKWHzl = c58311yyr.KWHzl();
        return tKWHzl != null ? tKWHzl : t;
    }

    public final java.lang.Iterable<T> blockingLatest() {
        return new C58356yzj(this);
    }

    public final java.lang.Iterable<T> blockingMostRecent(T t) {
        return new C58358yzl(this, t);
    }

    public final java.lang.Iterable<T> blockingNext() {
        return new C58355yzi(this);
    }

    public final T blockingSingle() {
        T tKWHzl = singleElement().KWHzl();
        if (tKWHzl != null) {
            return tKWHzl;
        }
        throw new NoSuchElementException();
    }

    public final T blockingSingle(T t) {
        return single(t).KWHzl();
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureC58310yyq());
    }

    public final void blockingSubscribe() {
        C58361yzo.EZpvd(this);
    }

    public final void blockingSubscribe(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        C58361yzo.KWHzl(this, interfaceC58227yxM, Functions.isConnected, Functions.AEQbTJ);
    }

    public final void blockingSubscribe(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2) {
        C58361yzo.KWHzl(this, interfaceC58227yxM, interfaceC58227yxM2, Functions.AEQbTJ);
    }

    public final void blockingSubscribe(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH) {
        C58361yzo.KWHzl(this, interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH);
    }

    public final void blockingSubscribe(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        C58361yzo.AEQbTJ(this, interfaceC58256yxp);
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(int i, int i2) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(i, i2, ArrayListSupplier.asCallable());
    }

    public final <U extends java.util.Collection<? super T>> AbstractC58247yxg<U> buffer(int i, int i2, Callable<U> callable) {
        C58297yyd.OLrzqt(i, "count");
        C58297yyd.OLrzqt(i2, "skip");
        C58297yyd.AEQbTJ(callable, "bufferSupplier is null");
        return yBG.EZpvd(new ObservableBuffer(this, i, i2, callable));
    }

    public final <U extends java.util.Collection<? super T>> AbstractC58247yxg<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(j, j2, timeUnit, yBP.KWHzl(), ArrayListSupplier.asCallable());
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(j, j2, timeUnit, abstractC58253yxm, ArrayListSupplier.asCallable());
    }

    public final <U extends java.util.Collection<? super T>> AbstractC58247yxg<U> buffer(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, Callable<U> callable) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.AEQbTJ(callable, "bufferSupplier is null");
        return yBG.EZpvd(new C58367yzu(this, j, j2, timeUnit, abstractC58253yxm, callable, Integer.MAX_VALUE, false));
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit) {
        return buffer(j, timeUnit, yBP.KWHzl(), Integer.MAX_VALUE);
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, yBP.KWHzl(), i);
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, int i) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(j, timeUnit, abstractC58253yxm, i, ArrayListSupplier.asCallable(), false);
    }

    public final <U extends java.util.Collection<? super T>> AbstractC58247yxg<U> buffer(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, int i, Callable<U> callable, boolean z) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.AEQbTJ(callable, "bufferSupplier is null");
        C58297yyd.OLrzqt(i, "count");
        return yBG.EZpvd(new C58367yzu(this, j, j, timeUnit, abstractC58253yxm, callable, i, z));
    }

    public final AbstractC58247yxg<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(j, timeUnit, abstractC58253yxm, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    public final <TOpening, TClosing> AbstractC58247yxg<java.util.List<T>> buffer(InterfaceC58255yxo<? extends TOpening> interfaceC58255yxo, InterfaceC58229yxO<? super TOpening, ? extends InterfaceC58255yxo<? extends TClosing>> interfaceC58229yxO) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(interfaceC58255yxo, interfaceC58229yxO, ArrayListSupplier.asCallable());
    }

    public final <TOpening, TClosing, U extends java.util.Collection<? super T>> AbstractC58247yxg<U> buffer(InterfaceC58255yxo<? extends TOpening> interfaceC58255yxo, InterfaceC58229yxO<? super TOpening, ? extends InterfaceC58255yxo<? extends TClosing>> interfaceC58229yxO, Callable<U> callable) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "openingIndicator is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "closingIndicator is null");
        C58297yyd.AEQbTJ(callable, "bufferSupplier is null");
        return yBG.EZpvd(new ObservableBufferBoundary(this, interfaceC58255yxo, interfaceC58229yxO, callable));
    }

    public final <B> AbstractC58247yxg<java.util.List<T>> buffer(InterfaceC58255yxo<B> interfaceC58255yxo) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(interfaceC58255yxo, ArrayListSupplier.asCallable());
    }

    public final <B> AbstractC58247yxg<java.util.List<T>> buffer(InterfaceC58255yxo<B> interfaceC58255yxo, int i) {
        C58297yyd.OLrzqt(i, "initialCapacity");
        return (AbstractC58247yxg<java.util.List<T>>) buffer(interfaceC58255yxo, Functions.copydefault(i));
    }

    public final <B, U extends java.util.Collection<? super T>> AbstractC58247yxg<U> buffer(InterfaceC58255yxo<B> interfaceC58255yxo, Callable<U> callable) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "boundary is null");
        C58297yyd.AEQbTJ(callable, "bufferSupplier is null");
        return yBG.EZpvd(new C58360yzn(this, interfaceC58255yxo, callable));
    }

    public final <B> AbstractC58247yxg<java.util.List<T>> buffer(Callable<? extends InterfaceC58255yxo<B>> callable) {
        return (AbstractC58247yxg<java.util.List<T>>) buffer(callable, ArrayListSupplier.asCallable());
    }

    public final <B, U extends java.util.Collection<? super T>> AbstractC58247yxg<U> buffer(Callable<? extends InterfaceC58255yxo<B>> callable, Callable<U> callable2) {
        C58297yyd.AEQbTJ(callable, "boundarySupplier is null");
        C58297yyd.AEQbTJ(callable2, "bufferSupplier is null");
        return yBG.EZpvd(new C58359yzm(this, callable, callable2));
    }

    public final AbstractC58247yxg<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final AbstractC58247yxg<T> cacheWithInitialCapacity(int i) {
        C58297yyd.OLrzqt(i, "initialCapacity");
        return yBG.EZpvd(new ObservableCache(this, i));
    }

    public final <U> AbstractC58247yxg<U> cast(java.lang.Class<U> cls) {
        C58297yyd.AEQbTJ(cls, "clazz is null");
        return (AbstractC58247yxg<U>) map(Functions.KWHzl(cls));
    }

    public final <U> AbstractC58260yxt<U> collect(Callable<? extends U> callable, InterfaceC58220yxF<? super U, ? super T> interfaceC58220yxF) {
        C58297yyd.AEQbTJ(callable, "initialValueSupplier is null");
        C58297yyd.AEQbTJ(interfaceC58220yxF, "collector is null");
        return yBG.AEQbTJ(new C58365yzs(this, callable, interfaceC58220yxF));
    }

    public final <U> AbstractC58260yxt<U> collectInto(U u, InterfaceC58220yxF<? super U, ? super T> interfaceC58220yxF) {
        C58297yyd.AEQbTJ(u, "initialValue is null");
        return collect(Functions.AEQbTJ(u), interfaceC58220yxF);
    }

    public final <R> AbstractC58247yxg<R> compose(InterfaceC58252yxl<? super T, ? extends R> interfaceC58252yxl) {
        return wrap(((InterfaceC58252yxl) C58297yyd.AEQbTJ(interfaceC58252yxl, "composer is null")).AEQbTJ(this));
    }

    public final <R> AbstractC58247yxg<R> concatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO) {
        return concatMap(interfaceC58229yxO, 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yxg<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC58247yxg<R> concatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        if (this instanceof InterfaceCallableC58300yyg) {
            java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
            if (objCall == null) {
                return empty();
            }
            return ObservableScalarXMap.copydefault(objCall, interfaceC58229yxO);
        }
        return yBG.EZpvd(new ObservableConcatMap(this, interfaceC58229yxO, i, ErrorMode.IMMEDIATE));
    }

    public final <R> AbstractC58247yxg<R> concatMapDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO) {
        return concatMapDelayError(interfaceC58229yxO, bufferSize(), true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yxg<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC58247yxg<R> concatMapDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, int i, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        if (!(this instanceof InterfaceCallableC58300yyg)) {
            return yBG.EZpvd(new ObservableConcatMap(this, interfaceC58229yxO, i, z ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
        if (objCall == null) {
            return empty();
        }
        return ObservableScalarXMap.copydefault(objCall, interfaceC58229yxO);
    }

    public final <R> AbstractC58247yxg<R> concatMapEager(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO) {
        return concatMapEager(interfaceC58229yxO, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> AbstractC58247yxg<R> concatMapEager(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, int i, int i2) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        C58297yyd.OLrzqt(i2, "prefetch");
        return yBG.EZpvd(new ObservableConcatMapEager(this, interfaceC58229yxO, ErrorMode.IMMEDIATE, i, i2));
    }

    public final <R> AbstractC58247yxg<R> concatMapEagerDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, boolean z) {
        return concatMapEagerDelayError(interfaceC58229yxO, Integer.MAX_VALUE, bufferSize(), z);
    }

    public final <R> AbstractC58247yxg<R> concatMapEagerDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, int i, int i2, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        C58297yyd.OLrzqt(i2, "prefetch");
        return yBG.EZpvd(new ObservableConcatMapEager(this, interfaceC58229yxO, z ? ErrorMode.END : ErrorMode.BOUNDARY, i, i2));
    }

    public final AbstractC58177ywP concatMapCompletable(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO) {
        return concatMapCompletable(interfaceC58229yxO, 2);
    }

    public final AbstractC58177ywP concatMapCompletable(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "capacityHint");
        return yBG.copydefault(new ObservableConcatMapCompletable(this, interfaceC58229yxO, ErrorMode.IMMEDIATE, i));
    }

    public final AbstractC58177ywP concatMapCompletableDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO) {
        return concatMapCompletableDelayError(interfaceC58229yxO, true, 2);
    }

    public final AbstractC58177ywP concatMapCompletableDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO, boolean z) {
        return concatMapCompletableDelayError(interfaceC58229yxO, z, 2);
    }

    public final AbstractC58177ywP concatMapCompletableDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.copydefault(new ObservableConcatMapCompletable(this, interfaceC58229yxO, z ? ErrorMode.END : ErrorMode.BOUNDARY, i));
    }

    public final <U> AbstractC58247yxg<U> concatMapIterable(InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends U>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new C58336yzP(this, interfaceC58229yxO));
    }

    public final <U> AbstractC58247yxg<U> concatMapIterable(InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends U>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return (AbstractC58247yxg<U>) concatMap(ObservableInternalHelper.OLrzqt(interfaceC58229yxO), i);
    }

    public final <R> AbstractC58247yxg<R> concatMapMaybe(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO) {
        return concatMapMaybe(interfaceC58229yxO, 2);
    }

    public final <R> AbstractC58247yxg<R> concatMapMaybe(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.EZpvd(new ObservableConcatMapMaybe(this, interfaceC58229yxO, ErrorMode.IMMEDIATE, i));
    }

    public final <R> AbstractC58247yxg<R> concatMapMaybeDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO) {
        return concatMapMaybeDelayError(interfaceC58229yxO, true, 2);
    }

    public final <R> AbstractC58247yxg<R> concatMapMaybeDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO, boolean z) {
        return concatMapMaybeDelayError(interfaceC58229yxO, z, 2);
    }

    public final <R> AbstractC58247yxg<R> concatMapMaybeDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.EZpvd(new ObservableConcatMapMaybe(this, interfaceC58229yxO, z ? ErrorMode.END : ErrorMode.BOUNDARY, i));
    }

    public final <R> AbstractC58247yxg<R> concatMapSingle(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        return concatMapSingle(interfaceC58229yxO, 2);
    }

    public final <R> AbstractC58247yxg<R> concatMapSingle(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.EZpvd(new ObservableConcatMapSingle(this, interfaceC58229yxO, ErrorMode.IMMEDIATE, i));
    }

    public final <R> AbstractC58247yxg<R> concatMapSingleDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        return concatMapSingleDelayError(interfaceC58229yxO, true, 2);
    }

    public final <R> AbstractC58247yxg<R> concatMapSingleDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO, boolean z) {
        return concatMapSingleDelayError(interfaceC58229yxO, z, 2);
    }

    public final <R> AbstractC58247yxg<R> concatMapSingleDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "prefetch");
        return yBG.EZpvd(new ObservableConcatMapSingle(this, interfaceC58229yxO, z ? ErrorMode.END : ErrorMode.BOUNDARY, i));
    }

    public final AbstractC58247yxg<T> concatWith(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return concat(this, interfaceC58255yxo);
    }

    public final AbstractC58247yxg<T> concatWith(InterfaceC58261yxu<? extends T> interfaceC58261yxu) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "other is null");
        return yBG.EZpvd(new ObservableConcatWithSingle(this, interfaceC58261yxu));
    }

    public final AbstractC58247yxg<T> concatWith(InterfaceC58246yxf<? extends T> interfaceC58246yxf) {
        C58297yyd.AEQbTJ(interfaceC58246yxf, "other is null");
        return yBG.EZpvd(new ObservableConcatWithMaybe(this, interfaceC58246yxf));
    }

    public final AbstractC58247yxg<T> concatWith(InterfaceC58180ywS interfaceC58180ywS) {
        C58297yyd.AEQbTJ(interfaceC58180ywS, "other is null");
        return yBG.EZpvd(new ObservableConcatWithCompletable(this, interfaceC58180ywS));
    }

    public final AbstractC58260yxt<java.lang.Boolean> contains(java.lang.Object obj) {
        C58297yyd.AEQbTJ(obj, "element is null");
        return any(Functions.copydefault(obj));
    }

    public final AbstractC58260yxt<java.lang.Long> count() {
        return yBG.AEQbTJ(new C58364yzr(this));
    }

    public final <U> AbstractC58247yxg<T> debounce(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<U>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "debounceSelector is null");
        return yBG.EZpvd(new C58321yzA(this, interfaceC58229yxO));
    }

    public final AbstractC58247yxg<T> debounce(long j, java.util.concurrent.TimeUnit timeUnit) {
        return debounce(j, timeUnit, yBP.KWHzl());
    }

    public final AbstractC58247yxg<T> debounce(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableDebounceTimed(this, j, timeUnit, abstractC58253yxm));
    }

    public final AbstractC58247yxg<T> defaultIfEmpty(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    public final <U> AbstractC58247yxg<T> delay(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<U>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "itemDelay is null");
        return (AbstractC58247yxg<T>) flatMap(ObservableInternalHelper.KWHzl(interfaceC58229yxO));
    }

    public final AbstractC58247yxg<T> delay(long j, java.util.concurrent.TimeUnit timeUnit) {
        return delay(j, timeUnit, yBP.KWHzl(), false);
    }

    public final AbstractC58247yxg<T> delay(long j, java.util.concurrent.TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, yBP.KWHzl(), z);
    }

    public final AbstractC58247yxg<T> delay(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return delay(j, timeUnit, abstractC58253yxm, false);
    }

    public final AbstractC58247yxg<T> delay(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new C58369yzw(this, j, timeUnit, abstractC58253yxm, z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yxO<? super T, ? extends o.yxo<V>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> AbstractC58247yxg<T> delay(InterfaceC58255yxo<U> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO) {
        return delaySubscription(interfaceC58255yxo).delay(interfaceC58229yxO);
    }

    public final <U> AbstractC58247yxg<T> delaySubscription(InterfaceC58255yxo<U> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return yBG.EZpvd(new C58370yzx(this, interfaceC58255yxo));
    }

    public final AbstractC58247yxg<T> delaySubscription(long j, java.util.concurrent.TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, yBP.KWHzl());
    }

    public final AbstractC58247yxg<T> delaySubscription(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return delaySubscription(timer(j, timeUnit, abstractC58253yxm));
    }

    @java.lang.Deprecated
    public final <T2> AbstractC58247yxg<T2> dematerialize() {
        return yBG.EZpvd(new C58372yzz(this, Functions.OLrzqt()));
    }

    public final <R> AbstractC58247yxg<R> dematerialize(InterfaceC58229yxO<? super T, C58248yxh<R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        return yBG.EZpvd(new C58372yzz(this, interfaceC58229yxO));
    }

    public final AbstractC58247yxg<T> distinct() {
        return distinct(Functions.OLrzqt(), Functions.AEQbTJ());
    }

    public final <K> AbstractC58247yxg<T> distinct(InterfaceC58229yxO<? super T, K> interfaceC58229yxO) {
        return distinct(interfaceC58229yxO, Functions.AEQbTJ());
    }

    public final <K> AbstractC58247yxg<T> distinct(InterfaceC58229yxO<? super T, K> interfaceC58229yxO, Callable<? extends java.util.Collection<? super K>> callable) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "keySelector is null");
        C58297yyd.AEQbTJ(callable, "collectionSupplier is null");
        return yBG.EZpvd(new C58325yzE(this, interfaceC58229yxO, callable));
    }

    public final AbstractC58247yxg<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.OLrzqt());
    }

    public final <K> AbstractC58247yxg<T> distinctUntilChanged(InterfaceC58229yxO<? super T, K> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "keySelector is null");
        return yBG.EZpvd(new C58324yzD(this, interfaceC58229yxO, C58297yyd.copydefault()));
    }

    public final AbstractC58247yxg<T> distinctUntilChanged(InterfaceC58224yxJ<? super T, ? super T> interfaceC58224yxJ) {
        C58297yyd.AEQbTJ(interfaceC58224yxJ, "comparer is null");
        return yBG.EZpvd(new C58324yzD(this, Functions.OLrzqt(), interfaceC58224yxJ));
    }

    public final AbstractC58247yxg<T> doAfterNext(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onAfterNext is null");
        return yBG.EZpvd(new C58323yzC(this, interfaceC58227yxM));
    }

    public final AbstractC58247yxg<T> doAfterTerminate(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onFinally is null");
        return doOnEach(Functions.KWHzl(), Functions.KWHzl(), Functions.AEQbTJ, interfaceC58222yxH);
    }

    public final AbstractC58247yxg<T> doFinally(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onFinally is null");
        return yBG.EZpvd(new ObservableDoFinally(this, interfaceC58222yxH));
    }

    public final AbstractC58247yxg<T> doOnDispose(InterfaceC58222yxH interfaceC58222yxH) {
        return doOnLifecycle(Functions.KWHzl(), interfaceC58222yxH);
    }

    public final AbstractC58247yxg<T> doOnComplete(InterfaceC58222yxH interfaceC58222yxH) {
        return doOnEach(Functions.KWHzl(), Functions.KWHzl(), interfaceC58222yxH, Functions.AEQbTJ);
    }

    public final AbstractC58247yxg<T> doOnEach(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onNext is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH2, "onAfterTerminate is null");
        return yBG.EZpvd(new C58326yzF(this, interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, interfaceC58222yxH2));
    }

    public final AbstractC58247yxg<T> doOnEach(InterfaceC58227yxM<? super C58248yxh<T>> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onNotification is null");
        return doOnEach(Functions.OLrzqt(interfaceC58227yxM), Functions.EZpvd((InterfaceC58227yxM) interfaceC58227yxM), Functions.KWHzl(interfaceC58227yxM), Functions.AEQbTJ);
    }

    public final AbstractC58247yxg<T> doOnEach(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        C58297yyd.AEQbTJ(interfaceC58256yxp, "observer is null");
        return doOnEach(ObservableInternalHelper.AEQbTJ(interfaceC58256yxp), ObservableInternalHelper.OLrzqt(interfaceC58256yxp), ObservableInternalHelper.copydefault(interfaceC58256yxp), Functions.AEQbTJ);
    }

    public final AbstractC58247yxg<T> doOnError(InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        InterfaceC58227yxM<? super T> interfaceC58227yxMKWHzl = Functions.KWHzl();
        InterfaceC58222yxH interfaceC58222yxH = Functions.AEQbTJ;
        return doOnEach(interfaceC58227yxMKWHzl, interfaceC58227yxM, interfaceC58222yxH, interfaceC58222yxH);
    }

    public final AbstractC58247yxg<T> doOnLifecycle(InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM, InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onSubscribe is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onDispose is null");
        return yBG.EZpvd(new C58331yzK(this, interfaceC58227yxM, interfaceC58222yxH));
    }

    public final AbstractC58247yxg<T> doOnNext(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxMKWHzl = Functions.KWHzl();
        InterfaceC58222yxH interfaceC58222yxH = Functions.AEQbTJ;
        return doOnEach(interfaceC58227yxM, interfaceC58227yxMKWHzl, interfaceC58222yxH, interfaceC58222yxH);
    }

    public final AbstractC58247yxg<T> doOnSubscribe(InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM) {
        return doOnLifecycle(interfaceC58227yxM, Functions.AEQbTJ);
    }

    public final AbstractC58247yxg<T> doOnTerminate(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onTerminate is null");
        return doOnEach(Functions.KWHzl(), Functions.OLrzqt(interfaceC58222yxH), interfaceC58222yxH, Functions.AEQbTJ);
    }

    public final AbstractC58245yxe<T> elementAt(long j) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        return yBG.copydefault(new C58327yzG(this, j));
    }

    public final AbstractC58260yxt<T> elementAt(long j, T t) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        C58297yyd.AEQbTJ((java.lang.Object) t, "defaultItem is null");
        return yBG.AEQbTJ(new C58328yzH(this, j, t));
    }

    public final AbstractC58260yxt<T> elementAtOrError(long j) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("index >= 0 required but it was " + j);
        }
        return yBG.AEQbTJ(new C58328yzH(this, j, null));
    }

    public final AbstractC58247yxg<T> filter(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.EZpvd(new C58332yzL(this, interfaceC58239yxY));
    }

    public final AbstractC58245yxe<T> firstElement() {
        return elementAt(0L);
    }

    public final AbstractC58260yxt<T> first(T t) {
        return elementAt(0L, t);
    }

    public final AbstractC58260yxt<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO) {
        return flatMap((InterfaceC58229yxO) interfaceC58229yxO, false);
    }

    public final <R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, boolean z) {
        return flatMap(interfaceC58229yxO, z, Integer.MAX_VALUE);
    }

    public final <R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, boolean z, int i) {
        return flatMap(interfaceC58229yxO, z, i, bufferSize());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.yxg<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, boolean z, int i, int i2) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "maxConcurrency");
        C58297yyd.OLrzqt(i2, "bufferSize");
        if (this instanceof InterfaceCallableC58300yyg) {
            java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
            if (objCall == null) {
                return empty();
            }
            return ObservableScalarXMap.copydefault(objCall, interfaceC58229yxO);
        }
        return yBG.EZpvd(new ObservableFlatMap(this, interfaceC58229yxO, z, i, i2));
    }

    public final <R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO2, Callable<? extends InterfaceC58255yxo<? extends R>> callable) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "onNextMapper is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "onErrorMapper is null");
        C58297yyd.AEQbTJ(callable, "onCompleteSupplier is null");
        return merge(new C56295yAb(this, interfaceC58229yxO, interfaceC58229yxO2, callable));
    }

    public final <R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, InterfaceC58229yxO<java.lang.Throwable, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO2, Callable<? extends InterfaceC58255yxo<? extends R>> callable, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "onNextMapper is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "onErrorMapper is null");
        C58297yyd.AEQbTJ(callable, "onCompleteSupplier is null");
        return merge(new C56295yAb(this, interfaceC58229yxO, interfaceC58229yxO2, callable), i);
    }

    public final <R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, int i) {
        return flatMap((InterfaceC58229yxO) interfaceC58229yxO, false, i, bufferSize());
    }

    public final <U, R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends U>> interfaceC58229yxO, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI) {
        return flatMap(interfaceC58229yxO, interfaceC58223yxI, false, bufferSize(), bufferSize());
    }

    public final <U, R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends U>> interfaceC58229yxO, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI, boolean z) {
        return flatMap(interfaceC58229yxO, interfaceC58223yxI, z, bufferSize(), bufferSize());
    }

    public final <U, R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends U>> interfaceC58229yxO, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI, boolean z, int i) {
        return flatMap(interfaceC58229yxO, interfaceC58223yxI, z, i, bufferSize());
    }

    public final <U, R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends U>> interfaceC58229yxO, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI, boolean z, int i, int i2) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "combiner is null");
        return flatMap(ObservableInternalHelper.EZpvd(interfaceC58229yxO, interfaceC58223yxI), z, i, i2);
    }

    public final <U, R> AbstractC58247yxg<R> flatMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends U>> interfaceC58229yxO, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI, int i) {
        return flatMap(interfaceC58229yxO, interfaceC58223yxI, false, i, bufferSize());
    }

    public final AbstractC58177ywP flatMapCompletable(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO) {
        return flatMapCompletable(interfaceC58229yxO, false);
    }

    public final AbstractC58177ywP flatMapCompletable(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.copydefault(new ObservableFlatMapCompletableCompletable(this, interfaceC58229yxO, z));
    }

    public final <U> AbstractC58247yxg<U> flatMapIterable(InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends U>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new C58336yzP(this, interfaceC58229yxO));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.yxI<? super T, ? super U, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> AbstractC58247yxg<V> flatMapIterable(InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends U>> interfaceC58229yxO, InterfaceC58223yxI<? super T, ? super U, ? extends V> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "resultSelector is null");
        return (AbstractC58247yxg<V>) flatMap(ObservableInternalHelper.OLrzqt(interfaceC58229yxO), interfaceC58223yxI, false, bufferSize(), bufferSize());
    }

    public final <R> AbstractC58247yxg<R> flatMapMaybe(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO) {
        return flatMapMaybe(interfaceC58229yxO, false);
    }

    public final <R> AbstractC58247yxg<R> flatMapMaybe(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new ObservableFlatMapMaybe(this, interfaceC58229yxO, z));
    }

    public final <R> AbstractC58247yxg<R> flatMapSingle(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        return flatMapSingle(interfaceC58229yxO, false);
    }

    public final <R> AbstractC58247yxg<R> flatMapSingle(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new ObservableFlatMapSingle(this, interfaceC58229yxO, z));
    }

    public final InterfaceC58217yxC forEach(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        return subscribe(interfaceC58227yxM);
    }

    public final InterfaceC58217yxC forEachWhile(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        return forEachWhile(interfaceC58239yxY, Functions.isConnected, Functions.AEQbTJ);
    }

    public final InterfaceC58217yxC forEachWhile(InterfaceC58239yxY<? super T> interfaceC58239yxY, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        return forEachWhile(interfaceC58239yxY, interfaceC58227yxM, Functions.AEQbTJ);
    }

    public final InterfaceC58217yxC forEachWhile(InterfaceC58239yxY<? super T> interfaceC58239yxY, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM, InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "onNext is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(interfaceC58239yxY, interfaceC58227yxM, interfaceC58222yxH);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    public final <K> AbstractC58247yxg<AbstractC56346yBz<K, T>> groupBy(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO) {
        return (AbstractC58247yxg<AbstractC56346yBz<K, T>>) groupBy(interfaceC58229yxO, Functions.OLrzqt(), false, bufferSize());
    }

    public final <K> AbstractC58247yxg<AbstractC56346yBz<K, T>> groupBy(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, boolean z) {
        return (AbstractC58247yxg<AbstractC56346yBz<K, T>>) groupBy(interfaceC58229yxO, Functions.OLrzqt(), z, bufferSize());
    }

    public final <K, V> AbstractC58247yxg<AbstractC56346yBz<K, V>> groupBy(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2) {
        return groupBy(interfaceC58229yxO, interfaceC58229yxO2, false, bufferSize());
    }

    public final <K, V> AbstractC58247yxg<AbstractC56346yBz<K, V>> groupBy(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2, boolean z) {
        return groupBy(interfaceC58229yxO, interfaceC58229yxO2, z, bufferSize());
    }

    public final <K, V> AbstractC58247yxg<AbstractC56346yBz<K, V>> groupBy(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2, boolean z, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "keySelector is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "valueSelector is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableGroupBy(this, interfaceC58229yxO, interfaceC58229yxO2, i, z));
    }

    public final <TRight, TLeftEnd, TRightEnd, R> AbstractC58247yxg<R> groupJoin(InterfaceC58255yxo<? extends TRight> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<TLeftEnd>> interfaceC58229yxO, InterfaceC58229yxO<? super TRight, ? extends InterfaceC58255yxo<TRightEnd>> interfaceC58229yxO2, InterfaceC58223yxI<? super T, ? super AbstractC58247yxg<TRight>, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "leftEnd is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "rightEnd is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "resultSelector is null");
        return yBG.EZpvd(new ObservableGroupJoin(this, interfaceC58255yxo, interfaceC58229yxO, interfaceC58229yxO2, interfaceC58223yxI));
    }

    public final AbstractC58247yxg<T> hide() {
        return yBG.EZpvd(new C58343yzW(this));
    }

    public final AbstractC58177ywP ignoreElements() {
        return yBG.copydefault(new C58346yzZ(this));
    }

    public final AbstractC58260yxt<java.lang.Boolean> isEmpty() {
        return all(Functions.copydefault());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> AbstractC58247yxg<R> join(InterfaceC58255yxo<? extends TRight> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<TLeftEnd>> interfaceC58229yxO, InterfaceC58229yxO<? super TRight, ? extends InterfaceC58255yxo<TRightEnd>> interfaceC58229yxO2, InterfaceC58223yxI<? super T, ? super TRight, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "leftEnd is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "rightEnd is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "resultSelector is null");
        return yBG.EZpvd(new ObservableJoin(this, interfaceC58255yxo, interfaceC58229yxO, interfaceC58229yxO2, interfaceC58223yxI));
    }

    public final AbstractC58245yxe<T> lastElement() {
        return yBG.copydefault(new C58342yzV(this));
    }

    public final AbstractC58260yxt<T> last(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "defaultItem is null");
        return yBG.AEQbTJ(new C56297yAd(this, t));
    }

    public final AbstractC58260yxt<T> lastOrError() {
        return yBG.AEQbTJ(new C56297yAd(this, null));
    }

    public final <R> AbstractC58247yxg<R> lift(InterfaceC58254yxn<? extends R, ? super T> interfaceC58254yxn) {
        C58297yyd.AEQbTJ(interfaceC58254yxn, "lifter is null");
        return yBG.EZpvd(new C56296yAc(this, interfaceC58254yxn));
    }

    public final <R> AbstractC58247yxg<R> map(InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new C56294yAa(this, interfaceC58229yxO));
    }

    public final AbstractC58247yxg<C58248yxh<T>> materialize() {
        return yBG.EZpvd(new C56298yAe(this));
    }

    public final AbstractC58247yxg<T> mergeWith(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return merge(this, interfaceC58255yxo);
    }

    public final AbstractC58247yxg<T> mergeWith(InterfaceC58261yxu<? extends T> interfaceC58261yxu) {
        C58297yyd.AEQbTJ(interfaceC58261yxu, "other is null");
        return yBG.EZpvd(new ObservableMergeWithSingle(this, interfaceC58261yxu));
    }

    public final AbstractC58247yxg<T> mergeWith(InterfaceC58246yxf<? extends T> interfaceC58246yxf) {
        C58297yyd.AEQbTJ(interfaceC58246yxf, "other is null");
        return yBG.EZpvd(new ObservableMergeWithMaybe(this, interfaceC58246yxf));
    }

    public final AbstractC58247yxg<T> mergeWith(InterfaceC58180ywS interfaceC58180ywS) {
        C58297yyd.AEQbTJ(interfaceC58180ywS, "other is null");
        return yBG.EZpvd(new ObservableMergeWithCompletable(this, interfaceC58180ywS));
    }

    public final AbstractC58247yxg<T> observeOn(AbstractC58253yxm abstractC58253yxm) {
        return observeOn(abstractC58253yxm, false, bufferSize());
    }

    public final AbstractC58247yxg<T> observeOn(AbstractC58253yxm abstractC58253yxm, boolean z) {
        return observeOn(abstractC58253yxm, z, bufferSize());
    }

    public final AbstractC58247yxg<T> observeOn(AbstractC58253yxm abstractC58253yxm, boolean z, int i) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableObserveOn(this, abstractC58253yxm, z, i));
    }

    public final <U> AbstractC58247yxg<U> ofType(java.lang.Class<U> cls) {
        C58297yyd.AEQbTJ(cls, "clazz is null");
        return filter(Functions.OLrzqt(cls)).cast(cls);
    }

    public final AbstractC58247yxg<T> onErrorResumeNext(InterfaceC58229yxO<? super java.lang.Throwable, ? extends InterfaceC58255yxo<? extends T>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "resumeFunction is null");
        return yBG.EZpvd(new C56303yAj(this, interfaceC58229yxO, false));
    }

    public final AbstractC58247yxg<T> onErrorResumeNext(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "next is null");
        return onErrorResumeNext(Functions.EZpvd(interfaceC58255yxo));
    }

    public final AbstractC58247yxg<T> onErrorReturn(InterfaceC58229yxO<? super java.lang.Throwable, ? extends T> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "valueSupplier is null");
        return yBG.EZpvd(new C56301yAh(this, interfaceC58229yxO));
    }

    public final AbstractC58247yxg<T> onErrorReturnItem(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item is null");
        return onErrorReturn(Functions.EZpvd(t));
    }

    public final AbstractC58247yxg<T> onExceptionResumeNext(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "next is null");
        return yBG.EZpvd(new C56303yAj(this, Functions.EZpvd(interfaceC58255yxo), true));
    }

    public final AbstractC58247yxg<T> onTerminateDetach() {
        return yBG.EZpvd(new C58322yzB(this));
    }

    public final yBA<T> publish() {
        return ObservablePublish.copydefault(this);
    }

    public final <R> AbstractC58247yxg<R> publish(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        return yBG.EZpvd(new ObservablePublishSelector(this, interfaceC58229yxO));
    }

    public final AbstractC58245yxe<T> reduce(InterfaceC58223yxI<T, T, T> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58223yxI, "reducer is null");
        return yBG.copydefault(new C56302yAi(this, interfaceC58223yxI));
    }

    public final <R> AbstractC58260yxt<R> reduce(R r, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(r, "seed is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "reducer is null");
        return yBG.AEQbTJ(new C56307yAn(this, r, interfaceC58223yxI));
    }

    public final <R> AbstractC58260yxt<R> reduceWith(Callable<R> callable, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(callable, "seedSupplier is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "reducer is null");
        return yBG.AEQbTJ(new C56308yAo(this, callable, interfaceC58223yxI));
    }

    public final AbstractC58247yxg<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final AbstractC58247yxg<T> repeat(long j) {
        if (j >= 0) {
            if (j == 0) {
                return empty();
            }
            return yBG.EZpvd(new ObservableRepeat(this, j));
        }
        throw new java.lang.IllegalArgumentException("times >= 0 required but it was " + j);
    }

    public final AbstractC58247yxg<T> repeatUntil(InterfaceC58226yxL interfaceC58226yxL) {
        C58297yyd.AEQbTJ(interfaceC58226yxL, "stop is null");
        return yBG.EZpvd(new ObservableRepeatUntil(this, interfaceC58226yxL));
    }

    public final AbstractC58247yxg<T> repeatWhen(InterfaceC58229yxO<? super AbstractC58247yxg<java.lang.Object>, ? extends InterfaceC58255yxo<?>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "handler is null");
        return yBG.EZpvd(new ObservableRepeatWhen(this, interfaceC58229yxO));
    }

    public final yBA<T> replay() {
        return ObservableReplay.AEQbTJ(this);
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        return ObservableReplay.KWHzl(ObservableInternalHelper.copydefault(this), interfaceC58229yxO);
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return ObservableReplay.KWHzl(ObservableInternalHelper.EZpvd(this, i), interfaceC58229yxO);
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO, int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(interfaceC58229yxO, i, j, timeUnit, yBP.KWHzl());
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO, int i, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return ObservableReplay.KWHzl(ObservableInternalHelper.EZpvd(this, i, j, timeUnit, abstractC58253yxm), interfaceC58229yxO);
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO, int i, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return ObservableReplay.KWHzl(ObservableInternalHelper.EZpvd(this, i), ObservableInternalHelper.KWHzl(interfaceC58229yxO, abstractC58253yxm));
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO, long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(interfaceC58229yxO, j, timeUnit, yBP.KWHzl());
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return ObservableReplay.KWHzl(ObservableInternalHelper.AEQbTJ(this, j, timeUnit, abstractC58253yxm), interfaceC58229yxO);
    }

    public final <R> AbstractC58247yxg<R> replay(InterfaceC58229yxO<? super AbstractC58247yxg<T>, ? extends InterfaceC58255yxo<R>> interfaceC58229yxO, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "selector is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return ObservableReplay.KWHzl(ObservableInternalHelper.copydefault(this), ObservableInternalHelper.KWHzl(interfaceC58229yxO, abstractC58253yxm));
    }

    public final yBA<T> replay(int i) {
        C58297yyd.OLrzqt(i, "bufferSize");
        return ObservableReplay.AEQbTJ(this, i);
    }

    public final yBA<T> replay(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(i, j, timeUnit, yBP.KWHzl());
    }

    public final yBA<T> replay(int i, long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.OLrzqt(i, "bufferSize");
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return ObservableReplay.EZpvd(this, j, timeUnit, abstractC58253yxm, i);
    }

    public final yBA<T> replay(int i, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.OLrzqt(i, "bufferSize");
        return ObservableReplay.AEQbTJ(replay(i), abstractC58253yxm);
    }

    public final yBA<T> replay(long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(j, timeUnit, yBP.KWHzl());
    }

    public final yBA<T> replay(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return ObservableReplay.AEQbTJ(this, j, timeUnit, abstractC58253yxm);
    }

    public final yBA<T> replay(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return ObservableReplay.AEQbTJ(replay(), abstractC58253yxm);
    }

    public final AbstractC58247yxg<T> retry() {
        return retry(Long.MAX_VALUE, Functions.EZpvd());
    }

    public final AbstractC58247yxg<T> retry(InterfaceC58224yxJ<? super java.lang.Integer, ? super java.lang.Throwable> interfaceC58224yxJ) {
        C58297yyd.AEQbTJ(interfaceC58224yxJ, "predicate is null");
        return yBG.EZpvd(new ObservableRetryBiPredicate(this, interfaceC58224yxJ));
    }

    public final AbstractC58247yxg<T> retry(long j) {
        return retry(j, Functions.EZpvd());
    }

    public final AbstractC58247yxg<T> retry(long j, InterfaceC58239yxY<? super java.lang.Throwable> interfaceC58239yxY) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("times >= 0 required but it was " + j);
        }
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.EZpvd(new ObservableRetryPredicate(this, j, interfaceC58239yxY));
    }

    public final AbstractC58247yxg<T> retry(InterfaceC58239yxY<? super java.lang.Throwable> interfaceC58239yxY) {
        return retry(Long.MAX_VALUE, interfaceC58239yxY);
    }

    public final AbstractC58247yxg<T> retryUntil(InterfaceC58226yxL interfaceC58226yxL) {
        C58297yyd.AEQbTJ(interfaceC58226yxL, "stop is null");
        return retry(Long.MAX_VALUE, Functions.OLrzqt(interfaceC58226yxL));
    }

    public final AbstractC58247yxg<T> retryWhen(InterfaceC58229yxO<? super AbstractC58247yxg<java.lang.Throwable>, ? extends InterfaceC58255yxo<?>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "handler is null");
        return yBG.EZpvd(new ObservableRetryWhen(this, interfaceC58229yxO));
    }

    public final void safeSubscribe(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        C58297yyd.AEQbTJ(interfaceC58256yxp, "observer is null");
        if (interfaceC58256yxp instanceof yBF) {
            subscribe(interfaceC58256yxp);
        } else {
            subscribe(new yBF(interfaceC58256yxp));
        }
    }

    public final AbstractC58247yxg<T> sample(long j, java.util.concurrent.TimeUnit timeUnit) {
        return sample(j, timeUnit, yBP.KWHzl());
    }

    public final AbstractC58247yxg<T> sample(long j, java.util.concurrent.TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, yBP.KWHzl(), z);
    }

    public final AbstractC58247yxg<T> sample(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableSampleTimed(this, j, timeUnit, abstractC58253yxm, false));
    }

    public final AbstractC58247yxg<T> sample(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableSampleTimed(this, j, timeUnit, abstractC58253yxm, z));
    }

    public final <U> AbstractC58247yxg<T> sample(InterfaceC58255yxo<U> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sampler is null");
        return yBG.EZpvd(new ObservableSampleWithObservable(this, interfaceC58255yxo, false));
    }

    public final <U> AbstractC58247yxg<T> sample(InterfaceC58255yxo<U> interfaceC58255yxo, boolean z) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "sampler is null");
        return yBG.EZpvd(new ObservableSampleWithObservable(this, interfaceC58255yxo, z));
    }

    public final AbstractC58247yxg<T> scan(InterfaceC58223yxI<T, T, T> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58223yxI, "accumulator is null");
        return yBG.EZpvd(new C56304yAk(this, interfaceC58223yxI));
    }

    public final <R> AbstractC58247yxg<R> scan(R r, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(r, "initialValue is null");
        return scanWith(Functions.AEQbTJ(r), interfaceC58223yxI);
    }

    public final <R> AbstractC58247yxg<R> scanWith(Callable<R> callable, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(callable, "seedSupplier is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "accumulator is null");
        return yBG.EZpvd(new C56306yAm(this, callable, interfaceC58223yxI));
    }

    public final AbstractC58247yxg<T> serialize() {
        return yBG.EZpvd(new C56305yAl(this));
    }

    public final AbstractC58247yxg<T> share() {
        return publish().KWHzl();
    }

    public final AbstractC58245yxe<T> singleElement() {
        return yBG.copydefault(new C56311yAr(this));
    }

    public final AbstractC58260yxt<T> single(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "defaultItem is null");
        return yBG.AEQbTJ(new C56309yAp(this, t));
    }

    public final AbstractC58260yxt<T> singleOrError() {
        return yBG.AEQbTJ(new C56309yAp(this, null));
    }

    public final AbstractC58247yxg<T> skip(long j) {
        if (j <= 0) {
            return yBG.EZpvd(this);
        }
        return yBG.EZpvd(new C56310yAq(this, j));
    }

    public final AbstractC58247yxg<T> skip(long j, java.util.concurrent.TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    public final AbstractC58247yxg<T> skip(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return skipUntil(timer(j, timeUnit, abstractC58253yxm));
    }

    public final AbstractC58247yxg<T> skipLast(int i) {
        if (i >= 0) {
            if (i == 0) {
                return yBG.EZpvd(this);
            }
            return yBG.EZpvd(new ObservableSkipLast(this, i));
        }
        throw new java.lang.IndexOutOfBoundsException("count >= 0 required but it was " + i);
    }

    public final AbstractC58247yxg<T> skipLast(long j, java.util.concurrent.TimeUnit timeUnit) {
        return skipLast(j, timeUnit, yBP.copydefault(), false, bufferSize());
    }

    public final AbstractC58247yxg<T> skipLast(long j, java.util.concurrent.TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, yBP.copydefault(), z, bufferSize());
    }

    public final AbstractC58247yxg<T> skipLast(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return skipLast(j, timeUnit, abstractC58253yxm, false, bufferSize());
    }

    public final AbstractC58247yxg<T> skipLast(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        return skipLast(j, timeUnit, abstractC58253yxm, z, bufferSize());
    }

    public final AbstractC58247yxg<T> skipLast(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z, int i) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableSkipLastTimed(this, j, timeUnit, abstractC58253yxm, i << 1, z));
    }

    public final <U> AbstractC58247yxg<T> skipUntil(InterfaceC58255yxo<U> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return yBG.EZpvd(new C56312yAs(this, interfaceC58255yxo));
    }

    public final AbstractC58247yxg<T> skipWhile(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.EZpvd(new C56313yAt(this, interfaceC58239yxY));
    }

    public final AbstractC58247yxg<T> sorted() {
        return toList().bN_().map(Functions.KWHzl(Functions.gEmmrt())).flatMapIterable(Functions.OLrzqt());
    }

    public final AbstractC58247yxg<T> sorted(java.util.Comparator<? super T> comparator) {
        C58297yyd.AEQbTJ(comparator, "sortFunction is null");
        return toList().bN_().map(Functions.KWHzl(comparator)).flatMapIterable(Functions.OLrzqt());
    }

    public final AbstractC58247yxg<T> startWith(java.lang.Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final AbstractC58247yxg<T> startWith(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return concatArray(interfaceC58255yxo, this);
    }

    public final AbstractC58247yxg<T> startWith(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item is null");
        return concatArray(just(t), this);
    }

    public final AbstractC58247yxg<T> startWithArray(T... tArr) {
        AbstractC58247yxg abstractC58247yxgFromArray = fromArray(tArr);
        if (abstractC58247yxgFromArray == empty()) {
            return yBG.EZpvd(this);
        }
        return concatArray(abstractC58247yxgFromArray, this);
    }

    public final InterfaceC58217yxC subscribe() {
        return subscribe(Functions.KWHzl(), Functions.isConnected, Functions.AEQbTJ, Functions.KWHzl());
    }

    public final InterfaceC58217yxC subscribe(InterfaceC58227yxM<? super T> interfaceC58227yxM) {
        return subscribe(interfaceC58227yxM, Functions.isConnected, Functions.AEQbTJ, Functions.KWHzl());
    }

    public final InterfaceC58217yxC subscribe(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2) {
        return subscribe(interfaceC58227yxM, interfaceC58227yxM2, Functions.AEQbTJ, Functions.KWHzl());
    }

    public final InterfaceC58217yxC subscribe(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH) {
        return subscribe(interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, Functions.KWHzl());
    }

    public final InterfaceC58217yxC subscribe(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM3) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onNext is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, interfaceC58227yxM3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @Override // o.InterfaceC58255yxo
    public final void subscribe(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        C58297yyd.AEQbTJ(interfaceC58256yxp, "observer is null");
        try {
            InterfaceC58256yxp<? super T> interfaceC58256yxpEZpvd = yBG.EZpvd(this, interfaceC58256yxp);
            C58297yyd.AEQbTJ(interfaceC58256yxpEZpvd, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(interfaceC58256yxpEZpvd);
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

    public final <E extends InterfaceC58256yxp<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final AbstractC58247yxg<T> subscribeOn(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableSubscribeOn(this, abstractC58253yxm));
    }

    public final AbstractC58247yxg<T> switchIfEmpty(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return yBG.EZpvd(new C56316yAw(this, interfaceC58255yxo));
    }

    public final <R> AbstractC58247yxg<R> switchMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO) {
        return switchMap(interfaceC58229yxO, bufferSize());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yxg<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC58247yxg<R> switchMap(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        if (this instanceof InterfaceCallableC58300yyg) {
            java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
            if (objCall == null) {
                return empty();
            }
            return ObservableScalarXMap.copydefault(objCall, interfaceC58229yxO);
        }
        return yBG.EZpvd(new ObservableSwitchMap(this, interfaceC58229yxO, i, false));
    }

    public final AbstractC58177ywP switchMapCompletable(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.copydefault(new ObservableSwitchMapCompletable(this, interfaceC58229yxO, false));
    }

    public final AbstractC58177ywP switchMapCompletableDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.copydefault(new ObservableSwitchMapCompletable(this, interfaceC58229yxO, true));
    }

    public final <R> AbstractC58247yxg<R> switchMapMaybe(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new ObservableSwitchMapMaybe(this, interfaceC58229yxO, false));
    }

    public final <R> AbstractC58247yxg<R> switchMapMaybeDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new ObservableSwitchMapMaybe(this, interfaceC58229yxO, true));
    }

    public final <R> AbstractC58247yxg<R> switchMapSingle(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new ObservableSwitchMapSingle(this, interfaceC58229yxO, false));
    }

    public final <R> AbstractC58247yxg<R> switchMapSingleDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.EZpvd(new ObservableSwitchMapSingle(this, interfaceC58229yxO, true));
    }

    public final <R> AbstractC58247yxg<R> switchMapDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO) {
        return switchMapDelayError(interfaceC58229yxO, bufferSize());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yxg<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC58247yxg<R> switchMapDelayError(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<? extends R>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        if (this instanceof InterfaceCallableC58300yyg) {
            java.lang.Object objCall = ((InterfaceCallableC58300yyg) this).call();
            if (objCall == null) {
                return empty();
            }
            return ObservableScalarXMap.copydefault(objCall, interfaceC58229yxO);
        }
        return yBG.EZpvd(new ObservableSwitchMap(this, interfaceC58229yxO, i, true));
    }

    public final AbstractC58247yxg<T> take(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("count >= 0 required but it was " + j);
        }
        return yBG.EZpvd(new C56315yAv(this, j));
    }

    public final AbstractC58247yxg<T> take(long j, java.util.concurrent.TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    public final AbstractC58247yxg<T> take(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return takeUntil(timer(j, timeUnit, abstractC58253yxm));
    }

    public final AbstractC58247yxg<T> takeLast(int i) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("count >= 0 required but it was " + i);
        }
        if (i == 0) {
            return yBG.EZpvd(new C58345yzY(this));
        }
        if (i == 1) {
            return yBG.EZpvd(new C56318yAy(this));
        }
        return yBG.EZpvd(new ObservableTakeLast(this, i));
    }

    public final AbstractC58247yxg<T> takeLast(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, yBP.copydefault(), false, bufferSize());
    }

    public final AbstractC58247yxg<T> takeLast(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return takeLast(j, j2, timeUnit, abstractC58253yxm, false, bufferSize());
    }

    public final AbstractC58247yxg<T> takeLast(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z, int i) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("count >= 0 required but it was " + j);
        }
        return yBG.EZpvd(new ObservableTakeLastTimed(this, j, j2, timeUnit, abstractC58253yxm, i, z));
    }

    public final AbstractC58247yxg<T> takeLast(long j, java.util.concurrent.TimeUnit timeUnit) {
        return takeLast(j, timeUnit, yBP.copydefault(), false, bufferSize());
    }

    public final AbstractC58247yxg<T> takeLast(long j, java.util.concurrent.TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, yBP.copydefault(), z, bufferSize());
    }

    public final AbstractC58247yxg<T> takeLast(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return takeLast(j, timeUnit, abstractC58253yxm, false, bufferSize());
    }

    public final AbstractC58247yxg<T> takeLast(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        return takeLast(j, timeUnit, abstractC58253yxm, z, bufferSize());
    }

    public final AbstractC58247yxg<T> takeLast(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, abstractC58253yxm, z, i);
    }

    public final <U> AbstractC58247yxg<T> takeUntil(InterfaceC58255yxo<U> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return yBG.EZpvd(new ObservableTakeUntil(this, interfaceC58255yxo));
    }

    public final AbstractC58247yxg<T> takeUntil(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "stopPredicate is null");
        return yBG.EZpvd(new C56314yAu(this, interfaceC58239yxY));
    }

    public final AbstractC58247yxg<T> takeWhile(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.EZpvd(new C56317yAx(this, interfaceC58239yxY));
    }

    public final AbstractC58247yxg<T> throttleFirst(long j, java.util.concurrent.TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, yBP.KWHzl());
    }

    public final AbstractC58247yxg<T> throttleFirst(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableThrottleFirstTimed(this, j, timeUnit, abstractC58253yxm));
    }

    public final AbstractC58247yxg<T> throttleLast(long j, java.util.concurrent.TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final AbstractC58247yxg<T> throttleLast(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return sample(j, timeUnit, abstractC58253yxm);
    }

    public final AbstractC58247yxg<T> throttleLatest(long j, java.util.concurrent.TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, yBP.KWHzl(), false);
    }

    public final AbstractC58247yxg<T> throttleLatest(long j, java.util.concurrent.TimeUnit timeUnit, boolean z) {
        return throttleLatest(j, timeUnit, yBP.KWHzl(), z);
    }

    public final AbstractC58247yxg<T> throttleLatest(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return throttleLatest(j, timeUnit, abstractC58253yxm, false);
    }

    public final AbstractC58247yxg<T> throttleLatest(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, boolean z) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableThrottleLatest(this, j, timeUnit, abstractC58253yxm, z));
    }

    public final AbstractC58247yxg<T> throttleWithTimeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final AbstractC58247yxg<T> throttleWithTimeout(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return debounce(j, timeUnit, abstractC58253yxm);
    }

    public final AbstractC58247yxg<yBO<T>> timeInterval() {
        return timeInterval(java.util.concurrent.TimeUnit.MILLISECONDS, yBP.KWHzl());
    }

    public final AbstractC58247yxg<yBO<T>> timeInterval(AbstractC58253yxm abstractC58253yxm) {
        return timeInterval(java.util.concurrent.TimeUnit.MILLISECONDS, abstractC58253yxm);
    }

    public final AbstractC58247yxg<yBO<T>> timeInterval(java.util.concurrent.TimeUnit timeUnit) {
        return timeInterval(timeUnit, yBP.KWHzl());
    }

    public final AbstractC58247yxg<yBO<T>> timeInterval(java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new yAD(this, timeUnit, abstractC58253yxm));
    }

    public final <V> AbstractC58247yxg<T> timeout(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO) {
        return timeout0(null, interfaceC58229yxO, null);
    }

    public final <V> AbstractC58247yxg<T> timeout(InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO, InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return timeout0(null, interfaceC58229yxO, interfaceC58255yxo);
    }

    public final AbstractC58247yxg<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        return timeout0(j, timeUnit, null, yBP.KWHzl());
    }

    public final AbstractC58247yxg<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return timeout0(j, timeUnit, interfaceC58255yxo, yBP.KWHzl());
    }

    public final AbstractC58247yxg<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return timeout0(j, timeUnit, interfaceC58255yxo, abstractC58253yxm);
    }

    public final AbstractC58247yxg<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return timeout0(j, timeUnit, null, abstractC58253yxm);
    }

    public final <U, V> AbstractC58247yxg<T> timeout(InterfaceC58255yxo<U> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "firstTimeoutIndicator is null");
        return timeout0(interfaceC58255yxo, interfaceC58229yxO, null);
    }

    public final <U, V> AbstractC58247yxg<T> timeout(InterfaceC58255yxo<U> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO, InterfaceC58255yxo<? extends T> interfaceC58255yxo2) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "firstTimeoutIndicator is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "other is null");
        return timeout0(interfaceC58255yxo, interfaceC58229yxO, interfaceC58255yxo2);
    }

    public final AbstractC58247yxg<T> timeout0(long j, java.util.concurrent.TimeUnit timeUnit, InterfaceC58255yxo<? extends T> interfaceC58255yxo, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "timeUnit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableTimeoutTimed(this, j, timeUnit, abstractC58253yxm, interfaceC58255yxo));
    }

    public final <U, V> AbstractC58247yxg<T> timeout0(InterfaceC58255yxo<U> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO, InterfaceC58255yxo<? extends T> interfaceC58255yxo2) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "itemTimeoutIndicator is null");
        return yBG.EZpvd(new ObservableTimeout(this, interfaceC58255yxo, interfaceC58229yxO, interfaceC58255yxo2));
    }

    public final AbstractC58247yxg<yBO<T>> timestamp() {
        return timestamp(java.util.concurrent.TimeUnit.MILLISECONDS, yBP.KWHzl());
    }

    public final AbstractC58247yxg<yBO<T>> timestamp(AbstractC58253yxm abstractC58253yxm) {
        return timestamp(java.util.concurrent.TimeUnit.MILLISECONDS, abstractC58253yxm);
    }

    public final AbstractC58247yxg<yBO<T>> timestamp(java.util.concurrent.TimeUnit timeUnit) {
        return timestamp(timeUnit, yBP.KWHzl());
    }

    public final AbstractC58247yxg<yBO<T>> timestamp(java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return (AbstractC58247yxg<yBO<T>>) map(Functions.OLrzqt(timeUnit, abstractC58253yxm));
    }

    public final <R> R to(InterfaceC58229yxO<? super AbstractC58247yxg<T>, R> interfaceC58229yxO) {
        try {
            return (R) ((InterfaceC58229yxO) C58297yyd.AEQbTJ(interfaceC58229yxO, "converter is null")).apply(this);
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            throw ExceptionHelper.AEQbTJ(th);
        }
    }

    public final AbstractC58260yxt<java.util.List<T>> toList() {
        return toList(16);
    }

    public final AbstractC58260yxt<java.util.List<T>> toList(int i) {
        C58297yyd.OLrzqt(i, "capacityHint");
        return yBG.AEQbTJ(new yAA(this, i));
    }

    public final <U extends java.util.Collection<? super T>> AbstractC58260yxt<U> toList(Callable<U> callable) {
        C58297yyd.AEQbTJ(callable, "collectionSupplier is null");
        return yBG.AEQbTJ(new yAA(this, callable));
    }

    public final <K> AbstractC58260yxt<java.util.Map<K, T>> toMap(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "keySelector is null");
        return (AbstractC58260yxt<java.util.Map<K, T>>) collect(HashMapSupplier.asCallable(), Functions.copydefault((InterfaceC58229yxO) interfaceC58229yxO));
    }

    public final <K, V> AbstractC58260yxt<java.util.Map<K, V>> toMap(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "keySelector is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "valueSelector is null");
        return (AbstractC58260yxt<java.util.Map<K, V>>) collect(HashMapSupplier.asCallable(), Functions.AEQbTJ(interfaceC58229yxO, interfaceC58229yxO2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.concurrent.Callable<? extends java.util.Map<K, V>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> AbstractC58260yxt<java.util.Map<K, V>> toMap(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2, Callable<? extends java.util.Map<K, V>> callable) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "keySelector is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "valueSelector is null");
        C58297yyd.AEQbTJ(callable, "mapSupplier is null");
        return (AbstractC58260yxt<java.util.Map<K, V>>) collect(callable, Functions.AEQbTJ(interfaceC58229yxO, interfaceC58229yxO2));
    }

    public final <K> AbstractC58260yxt<java.util.Map<K, java.util.Collection<T>>> toMultimap(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO) {
        return (AbstractC58260yxt<java.util.Map<K, java.util.Collection<T>>>) toMultimap(interfaceC58229yxO, Functions.OLrzqt(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    public final <K, V> AbstractC58260yxt<java.util.Map<K, java.util.Collection<V>>> toMultimap(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2) {
        return toMultimap(interfaceC58229yxO, interfaceC58229yxO2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.concurrent.Callable<? extends java.util.Map<K, java.util.Collection<V>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> AbstractC58260yxt<java.util.Map<K, java.util.Collection<V>>> toMultimap(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2, Callable<? extends java.util.Map<K, java.util.Collection<V>>> callable, InterfaceC58229yxO<? super K, ? extends java.util.Collection<? super V>> interfaceC58229yxO3) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "keySelector is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO2, "valueSelector is null");
        C58297yyd.AEQbTJ(callable, "mapSupplier is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO3, "collectionFactory is null");
        return (AbstractC58260yxt<java.util.Map<K, java.util.Collection<V>>>) collect(callable, Functions.OLrzqt(interfaceC58229yxO, interfaceC58229yxO2, interfaceC58229yxO3));
    }

    public final <K, V> AbstractC58260yxt<java.util.Map<K, java.util.Collection<V>>> toMultimap(InterfaceC58229yxO<? super T, ? extends K> interfaceC58229yxO, InterfaceC58229yxO<? super T, ? extends V> interfaceC58229yxO2, Callable<java.util.Map<K, java.util.Collection<V>>> callable) {
        return toMultimap(interfaceC58229yxO, interfaceC58229yxO2, callable, ArrayListSupplier.asFunction());
    }

    public final AbstractC58185ywX<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        C58283yyP c58283yyP = new C58283yyP(this);
        int i = AnonymousClass4.OLrzqt[backpressureStrategy.ordinal()];
        if (i == 1) {
            return c58283yyP.AhwBna();
        }
        if (i == 2) {
            return c58283yyP.djBIcL();
        }
        if (i == 3) {
            return c58283yyP;
        }
        if (i == 4) {
            return yBG.AEQbTJ(new FlowableOnBackpressureError(c58283yyP));
        }
        return c58283yyP.AYXKKw();
    }

    /* JADX INFO: renamed from: o.yxg$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            OLrzqt = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public final AbstractC58260yxt<java.util.List<T>> toSortedList() {
        return toSortedList(Functions.djBIcL());
    }

    public final AbstractC58260yxt<java.util.List<T>> toSortedList(java.util.Comparator<? super T> comparator) {
        C58297yyd.AEQbTJ(comparator, "comparator is null");
        return (AbstractC58260yxt<java.util.List<T>>) toList().copydefault(Functions.KWHzl(comparator));
    }

    public final AbstractC58260yxt<java.util.List<T>> toSortedList(java.util.Comparator<? super T> comparator, int i) {
        C58297yyd.AEQbTJ(comparator, "comparator is null");
        return (AbstractC58260yxt<java.util.List<T>>) toList(i).copydefault(Functions.KWHzl(comparator));
    }

    public final AbstractC58260yxt<java.util.List<T>> toSortedList(int i) {
        return toSortedList(Functions.djBIcL(), i);
    }

    public final AbstractC58247yxg<T> unsubscribeOn(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.EZpvd(new ObservableUnsubscribeOn(this, abstractC58253yxm));
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, long j2, int i) {
        C58297yyd.KWHzl(j, "count");
        C58297yyd.KWHzl(j2, "skip");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableWindow(this, j, j2, i));
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return window(j, j2, timeUnit, yBP.KWHzl(), bufferSize());
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return window(j, j2, timeUnit, abstractC58253yxm, bufferSize());
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, long j2, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, int i) {
        C58297yyd.KWHzl(j, "timespan");
        C58297yyd.KWHzl(j2, "timeskip");
        C58297yyd.OLrzqt(i, "bufferSize");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        return yBG.EZpvd(new C56319yAz(this, j, j2, timeUnit, abstractC58253yxm, Long.MAX_VALUE, i, false));
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, java.util.concurrent.TimeUnit timeUnit) {
        return window(j, timeUnit, yBP.KWHzl(), Long.MAX_VALUE, false);
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, yBP.KWHzl(), j2, false);
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, yBP.KWHzl(), j2, z);
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        return window(j, timeUnit, abstractC58253yxm, Long.MAX_VALUE, false);
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, long j2) {
        return window(j, timeUnit, abstractC58253yxm, j2, false);
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, long j2, boolean z) {
        return window(j, timeUnit, abstractC58253yxm, j2, z, bufferSize());
    }

    public final AbstractC58247yxg<AbstractC58247yxg<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm, long j2, boolean z, int i) {
        C58297yyd.OLrzqt(i, "bufferSize");
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        C58297yyd.AEQbTJ(timeUnit, "unit is null");
        C58297yyd.KWHzl(j2, "count");
        return yBG.EZpvd(new C56319yAz(this, j, j, timeUnit, abstractC58253yxm, j2, i, z));
    }

    public final <B> AbstractC58247yxg<AbstractC58247yxg<T>> window(InterfaceC58255yxo<B> interfaceC58255yxo) {
        return window(interfaceC58255yxo, bufferSize());
    }

    public final <B> AbstractC58247yxg<AbstractC58247yxg<T>> window(InterfaceC58255yxo<B> interfaceC58255yxo, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "boundary is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableWindowBoundary(this, interfaceC58255yxo, i));
    }

    public final <U, V> AbstractC58247yxg<AbstractC58247yxg<T>> window(InterfaceC58255yxo<U> interfaceC58255yxo, InterfaceC58229yxO<? super U, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO) {
        return window(interfaceC58255yxo, interfaceC58229yxO, bufferSize());
    }

    public final <U, V> AbstractC58247yxg<AbstractC58247yxg<T>> window(InterfaceC58255yxo<U> interfaceC58255yxo, InterfaceC58229yxO<? super U, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO, int i) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "openingIndicator is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "closingIndicator is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new yAC(this, interfaceC58255yxo, interfaceC58229yxO, i));
    }

    public final <B> AbstractC58247yxg<AbstractC58247yxg<T>> window(Callable<? extends InterfaceC58255yxo<B>> callable) {
        return window(callable, bufferSize());
    }

    public final <B> AbstractC58247yxg<AbstractC58247yxg<T>> window(Callable<? extends InterfaceC58255yxo<B>> callable, int i) {
        C58297yyd.AEQbTJ(callable, "boundary is null");
        C58297yyd.OLrzqt(i, "bufferSize");
        return yBG.EZpvd(new ObservableWindowBoundarySupplier(this, callable, i));
    }

    public final <U, R> AbstractC58247yxg<R> withLatestFrom(InterfaceC58255yxo<? extends U> interfaceC58255yxo, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "combiner is null");
        return yBG.EZpvd(new ObservableWithLatestFrom(this, interfaceC58223yxI, interfaceC58255yxo));
    }

    public final <T1, T2, R> AbstractC58247yxg<R> withLatestFrom(InterfaceC58255yxo<T1> interfaceC58255yxo, InterfaceC58255yxo<T2> interfaceC58255yxo2, InterfaceC58228yxN<? super T, ? super T1, ? super T2, R> interfaceC58228yxN) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "o1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "o2 is null");
        C58297yyd.AEQbTJ(interfaceC58228yxN, "combiner is null");
        return withLatestFrom(new InterfaceC58255yxo[]{interfaceC58255yxo, interfaceC58255yxo2}, Functions.OLrzqt(interfaceC58228yxN));
    }

    public final <T1, T2, T3, R> AbstractC58247yxg<R> withLatestFrom(InterfaceC58255yxo<T1> interfaceC58255yxo, InterfaceC58255yxo<T2> interfaceC58255yxo2, InterfaceC58255yxo<T3> interfaceC58255yxo3, InterfaceC58230yxP<? super T, ? super T1, ? super T2, ? super T3, R> interfaceC58230yxP) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "o1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "o2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "o3 is null");
        C58297yyd.AEQbTJ(interfaceC58230yxP, "combiner is null");
        return withLatestFrom(new InterfaceC58255yxo[]{interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3}, Functions.KWHzl(interfaceC58230yxP));
    }

    public final <T1, T2, T3, T4, R> AbstractC58247yxg<R> withLatestFrom(InterfaceC58255yxo<T1> interfaceC58255yxo, InterfaceC58255yxo<T2> interfaceC58255yxo2, InterfaceC58255yxo<T3> interfaceC58255yxo3, InterfaceC58255yxo<T4> interfaceC58255yxo4, InterfaceC58231yxQ<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> interfaceC58231yxQ) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "o1 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo2, "o2 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo3, "o3 is null");
        C58297yyd.AEQbTJ(interfaceC58255yxo4, "o4 is null");
        C58297yyd.AEQbTJ(interfaceC58231yxQ, "combiner is null");
        return withLatestFrom(new InterfaceC58255yxo[]{interfaceC58255yxo, interfaceC58255yxo2, interfaceC58255yxo3, interfaceC58255yxo4}, Functions.copydefault((InterfaceC58231yxQ) interfaceC58231yxQ));
    }

    public final <R> AbstractC58247yxg<R> withLatestFrom(InterfaceC58255yxo<?>[] interfaceC58255yxoArr, InterfaceC58229yxO<? super java.lang.Object[], R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58255yxoArr, "others is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        return yBG.EZpvd(new ObservableWithLatestFromMany(this, interfaceC58255yxoArr, interfaceC58229yxO));
    }

    public final <R> AbstractC58247yxg<R> withLatestFrom(java.lang.Iterable<? extends InterfaceC58255yxo<?>> iterable, InterfaceC58229yxO<? super java.lang.Object[], R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(iterable, "others is null");
        C58297yyd.AEQbTJ(interfaceC58229yxO, "combiner is null");
        return yBG.EZpvd(new ObservableWithLatestFromMany(this, iterable, interfaceC58229yxO));
    }

    public final <U, R> AbstractC58247yxg<R> zipWith(java.lang.Iterable<U> iterable, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(iterable, "other is null");
        C58297yyd.AEQbTJ(interfaceC58223yxI, "zipper is null");
        return yBG.EZpvd(new yAI(this, iterable, interfaceC58223yxI));
    }

    public final <U, R> AbstractC58247yxg<R> zipWith(InterfaceC58255yxo<? extends U> interfaceC58255yxo, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI) {
        C58297yyd.AEQbTJ(interfaceC58255yxo, "other is null");
        return zip(this, interfaceC58255yxo, interfaceC58223yxI);
    }

    public final <U, R> AbstractC58247yxg<R> zipWith(InterfaceC58255yxo<? extends U> interfaceC58255yxo, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI, boolean z) {
        return zip(this, interfaceC58255yxo, interfaceC58223yxI, z);
    }

    public final <U, R> AbstractC58247yxg<R> zipWith(InterfaceC58255yxo<? extends U> interfaceC58255yxo, InterfaceC58223yxI<? super T, ? super U, ? extends R> interfaceC58223yxI, boolean z, int i) {
        return zip(this, interfaceC58255yxo, interfaceC58223yxI, z, i);
    }

    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    public final TestObserver<T> test(boolean z) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }
}
