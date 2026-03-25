package o;

import com.okinc.business.market.common.websocket.WsDataWindowHelper$processData$1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27592jyB<T> {
    public final ConcurrentHashMap<java.lang.Long, StateListAnimator<T>> copydefault = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o.jyB$StateListAnimator */
    public static final class StateListAnimator<T> {
        public final Mutex AEQbTJ;
        public final java.util.List<T>[] KWHzl;
        public final long OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.jyB$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, long j, int i, java.util.List[] listArr, Mutex mutex, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                j = stateListAnimator.OLrzqt;
            }
            long j2 = j;
            if ((i2 & 2) != 0) {
                i = stateListAnimator.copydefault;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                listArr = stateListAnimator.KWHzl;
            }
            java.util.List[] listArr2 = listArr;
            if ((i2 & 8) != 0) {
                mutex = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(j2, i3, listArr2, mutex);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Mutex OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator<T> OLrzqt(long j, int i, @NotNull java.util.List<T>[] listArr, @NotNull Mutex mutex) {
            Intrinsics.checkNotNullParameter(listArr, "");
            Intrinsics.checkNotNullParameter(mutex, "");
            return new StateListAnimator<>(j, i, listArr, mutex);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<T>[] copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Long.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.util.Arrays.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TransactionData(transactionId=" + this.OLrzqt + ", totalPage=" + this.copydefault + ", pages=" + java.util.Arrays.toString(this.KWHzl) + ", mutex=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(long j, int i, @NotNull java.util.List<T>[] listArr, @NotNull Mutex mutex) {
            Intrinsics.checkNotNullParameter(listArr, "");
            Intrinsics.checkNotNullParameter(mutex, "");
            this.OLrzqt = j;
            this.copydefault = i;
            this.KWHzl = listArr;
            this.AEQbTJ = mutex;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ StateListAnimator(long j, int i, java.util.List[] listArr, Mutex mutex, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 4) != 0) {
                listArr = new java.util.List[i];
                for (int i3 = 0; i3 < i; i3++) {
                    listArr[i3] = null;
                }
            }
            this(j, i, listArr, (i2 & 8) != 0 ? MutexKt.Mutex$default(false, 1, null) : mutex);
        }
    }

    public static /* synthetic */ java.lang.Object processData$default(C27592jyB c27592jyB, java.util.List list, java.lang.Long l, int i, java.lang.Integer num, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        return c27592jyB.KWHzl(list, l, i, num, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<? extends T> list, java.lang.Long l, final int i, java.lang.Integer num, @NotNull Continuation<? super java.util.List<? extends T>> continuation) throws java.lang.Throwable {
        WsDataWindowHelper$processData$1 wsDataWindowHelper$processData$1;
        C27592jyB<T> c27592jyB;
        java.lang.Long l2;
        Mutex mutex;
        java.util.List<? extends T> list2;
        int i2;
        StateListAnimator<T> stateListAnimator;
        if (continuation instanceof WsDataWindowHelper$processData$1) {
            wsDataWindowHelper$processData$1 = (WsDataWindowHelper$processData$1) continuation;
            int i3 = wsDataWindowHelper$processData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wsDataWindowHelper$processData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                wsDataWindowHelper$processData$1 = new WsDataWindowHelper$processData$1(this, continuation);
            }
        }
        java.lang.Object obj = wsDataWindowHelper$processData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = wsDataWindowHelper$processData$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (list == null || list.isEmpty() || l == null || i <= 0) {
                return null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            ConcurrentHashMap<java.lang.Long, StateListAnimator<T>> concurrentHashMap = this.copydefault;
            final Function1 function1 = new Function1() { // from class: o.jyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C27592jyB.EZpvd(i, (java.lang.Long) obj2);
                }
            };
            StateListAnimator<T> stateListAnimatorComputeIfAbsent = concurrentHashMap.computeIfAbsent(l, new java.util.function.Function() { // from class: o.jyC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return C27592jyB.EZpvd(function1, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(stateListAnimatorComputeIfAbsent, "");
            StateListAnimator<T> stateListAnimator2 = stateListAnimatorComputeIfAbsent;
            Mutex mutexOLrzqt = stateListAnimator2.OLrzqt();
            wsDataWindowHelper$processData$1.L$0 = this;
            wsDataWindowHelper$processData$1.L$1 = list;
            wsDataWindowHelper$processData$1.L$2 = l;
            wsDataWindowHelper$processData$1.L$3 = stateListAnimator2;
            wsDataWindowHelper$processData$1.L$4 = mutexOLrzqt;
            wsDataWindowHelper$processData$1.I$0 = i;
            wsDataWindowHelper$processData$1.I$1 = iIntValue;
            wsDataWindowHelper$processData$1.label = 1;
            if (mutexOLrzqt.lock(null, wsDataWindowHelper$processData$1) == objCopydefault) {
                return objCopydefault;
            }
            c27592jyB = this;
            l2 = l;
            mutex = mutexOLrzqt;
            list2 = list;
            i2 = iIntValue;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = wsDataWindowHelper$processData$1.I$1;
            i = wsDataWindowHelper$processData$1.I$0;
            mutex = (Mutex) wsDataWindowHelper$processData$1.L$4;
            stateListAnimator = (StateListAnimator) wsDataWindowHelper$processData$1.L$3;
            l2 = (java.lang.Long) wsDataWindowHelper$processData$1.L$2;
            list2 = (java.util.List) wsDataWindowHelper$processData$1.L$1;
            c27592jyB = (C27592jyB) wsDataWindowHelper$processData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (i2 == 0) {
            try {
                int length = stateListAnimator.copydefault().length;
                for (int i5 = 0; i5 < length; i5++) {
                    stateListAnimator.copydefault()[i5] = null;
                }
            } catch (java.lang.Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
        if (i2 < i) {
            stateListAnimator.copydefault()[i2] = list2;
        }
        for (java.util.List<T> list3 : stateListAnimator.copydefault()) {
            if (list3 == null) {
                mutex.unlock(null);
                return null;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<T> list4 : stateListAnimator.copydefault()) {
            if (list4 != null) {
                arrayList.addAll(list4);
            }
        }
        c27592jyB.copydefault.remove(l2);
        c27592jyB.copydefault();
        mutex.unlock(null);
        return arrayList;
    }

    public static final StateListAnimator EZpvd(Function1 function1, java.lang.Object obj) {
        return (StateListAnimator) function1.invoke(obj);
    }

    public static final StateListAnimator EZpvd(int i, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return new StateListAnimator(l.longValue(), i, null, null, 12, null);
    }

    public final void copydefault() {
        if (this.copydefault.size() > 2) {
            java.util.Set<java.lang.Long> setKeySet = this.copydefault.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.iZzfmt(setKeySet), 2);
            java.util.Set<java.lang.Long> setKeySet2 = this.copydefault.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet2, "");
            java.util.Iterator<T> it = yEJ.EZpvd((java.util.Set) setKeySet2, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(listAhwBna)).iterator();
            while (it.hasNext()) {
                this.copydefault.remove((java.lang.Long) it.next());
            }
        }
    }

    public final void KWHzl() {
        this.copydefault.clear();
    }
}
