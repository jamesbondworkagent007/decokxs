package o;

import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.CountDownInfo;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qDW extends AbstractC49400uno<Triple<? extends kotlin.Pair<? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType>, ? extends java.util.List<? extends C39994qFk>, ? extends java.lang.Boolean>, java.util.List<? extends C39994qFk>> {
    public final C41577qtT<C39994qFk> EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public qDW(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41577qtT<C39994qFk> c41577qtT) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41577qtT, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c41577qtT;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Triple<? extends kotlin.Pair<? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType>, ? extends java.util.List<C39994qFk>, java.lang.Boolean> triple, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) {
        java.util.List listEZpvd;
        kotlin.Pair<? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType> pairComponent1 = triple.component1();
        java.util.List<C39994qFk> listComponent2 = triple.component2();
        boolean zBooleanValue = triple.component3().booleanValue();
        OKSortTextView.SortType sortTypeComponent1 = pairComponent1.component1();
        OKSortTextView.SortType sortTypeComponent2 = pairComponent1.component2();
        int iHashCode = pairComponent1.toString().hashCode();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent2, 10));
        for (C39994qFk c39994qFk : listComponent2) {
            C39994qFk c39994qFkCopy$default = C39994qFk.copy$default(c39994qFk, null, null, null, 0, false, null, false, null, false, null, false, null, false, false, false, false, null, false, null, null, false, false, false, C56443yFo.AEQbTJ(iHashCode), false, null, 0.0f, 125829119, null);
            c39994qFkCopy$default.AEQbTJ(c39994qFk.isConnected());
            arrayList.add(c39994qFkCopy$default);
        }
        OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
        if (sortTypeComponent1 != sortType) {
            if (sortTypeComponent1 == OKSortTextView.SortType.UP) {
                listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application());
            } else {
                listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity());
            }
            if (zBooleanValue) {
                listEZpvd = (java.util.List) this.EZpvd.copydefault(C56390yDp.OLrzqt(listEZpvd, new Function1() { // from class: o.qDY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return qDW.AEQbTJ((C39994qFk) obj);
                    }
                }));
            }
        } else {
            if (sortTypeComponent2 == sortType) {
                return arrayList;
            }
            if (sortTypeComponent2 == OKSortTextView.SortType.UP) {
                listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription());
            } else {
                listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar());
            }
            if (zBooleanValue) {
                listEZpvd = (java.util.List) this.EZpvd.copydefault(C56390yDp.OLrzqt(listEZpvd, new Function1() { // from class: o.qDU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return qDW.OLrzqt((C39994qFk) obj);
                    }
                }));
            }
        }
        return listEZpvd;
    }

    public static final CountDownInfo AEQbTJ(C39994qFk c39994qFk) {
        Intrinsics.checkNotNullParameter(c39994qFk, "");
        return c39994qFk.KWHzl().getCountDownInfo();
    }

    public static final CountDownInfo OLrzqt(C39994qFk c39994qFk) {
        Intrinsics.checkNotNullParameter(c39994qFk, "");
        return c39994qFk.KWHzl().getCountDownInfo();
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            double dAEQbTJ;
            C39994qFk c39994qFk = (C39994qFk) t;
            double dAEQbTJ2 = -1.0d;
            if (c39994qFk.KWHzl().getCountDownInfo() != null) {
                dAEQbTJ = -1.0d;
            } else {
                C41787qxR c41787qxRUzCIH = c39994qFk.uzCIH();
                dAEQbTJ = C33129mqd.AEQbTJ(c41787qxRUzCIH != null ? c41787qxRUzCIH.KWHzl() : null);
            }
            C39994qFk c39994qFk2 = (C39994qFk) t2;
            if (c39994qFk2.KWHzl().getCountDownInfo() == null) {
                C41787qxR c41787qxRUzCIH2 = c39994qFk2.uzCIH();
                dAEQbTJ2 = C33129mqd.AEQbTJ(c41787qxRUzCIH2 != null ? c41787qxRUzCIH2.KWHzl() : null);
            }
            return yET.KWHzl(java.lang.Double.valueOf(dAEQbTJ), java.lang.Double.valueOf(dAEQbTJ2));
        }
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dValueOf;
            C39994qFk c39994qFk = (C39994qFk) t;
            CountDownInfo countDownInfo = c39994qFk.KWHzl().getCountDownInfo();
            java.lang.Double dValueOf2 = java.lang.Double.valueOf(-1.0d);
            if (countDownInfo != null) {
                dValueOf = dValueOf2;
            } else {
                C41787qxR c41787qxRUzCIH = c39994qFk.uzCIH();
                dValueOf = c41787qxRUzCIH != null ? java.lang.Double.valueOf(c41787qxRUzCIH.OLrzqt()) : null;
            }
            C39994qFk c39994qFk2 = (C39994qFk) t2;
            if (c39994qFk2.KWHzl().getCountDownInfo() == null) {
                C41787qxR c41787qxRUzCIH2 = c39994qFk2.uzCIH();
                dValueOf2 = c41787qxRUzCIH2 != null ? java.lang.Double.valueOf(c41787qxRUzCIH2.OLrzqt()) : null;
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dValueOf;
            C39994qFk c39994qFk = (C39994qFk) t2;
            CountDownInfo countDownInfo = c39994qFk.KWHzl().getCountDownInfo();
            java.lang.Double dValueOf2 = java.lang.Double.valueOf(Double.MAX_VALUE);
            if (countDownInfo != null) {
                dValueOf = dValueOf2;
            } else {
                C41787qxR c41787qxRUzCIH = c39994qFk.uzCIH();
                dValueOf = c41787qxRUzCIH != null ? java.lang.Double.valueOf(c41787qxRUzCIH.OLrzqt()) : null;
            }
            C39994qFk c39994qFk2 = (C39994qFk) t;
            if (c39994qFk2.KWHzl().getCountDownInfo() == null) {
                C41787qxR c41787qxRUzCIH2 = c39994qFk2.uzCIH();
                dValueOf2 = c41787qxRUzCIH2 != null ? java.lang.Double.valueOf(c41787qxRUzCIH2.OLrzqt()) : null;
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            double dAEQbTJ;
            C39994qFk c39994qFk = (C39994qFk) t2;
            double dAEQbTJ2 = Double.MAX_VALUE;
            if (c39994qFk.KWHzl().getCountDownInfo() != null) {
                dAEQbTJ = Double.MAX_VALUE;
            } else {
                C41787qxR c41787qxRUzCIH = c39994qFk.uzCIH();
                dAEQbTJ = C33129mqd.AEQbTJ(c41787qxRUzCIH != null ? c41787qxRUzCIH.KWHzl() : null);
            }
            C39994qFk c39994qFk2 = (C39994qFk) t;
            if (c39994qFk2.KWHzl().getCountDownInfo() == null) {
                C41787qxR c41787qxRUzCIH2 = c39994qFk2.uzCIH();
                dAEQbTJ2 = C33129mqd.AEQbTJ(c41787qxRUzCIH2 != null ? c41787qxRUzCIH2.KWHzl() : null);
            }
            return yET.KWHzl(java.lang.Double.valueOf(dAEQbTJ), java.lang.Double.valueOf(dAEQbTJ2));
        }
    }
}
