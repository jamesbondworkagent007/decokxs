package o;

import com.okinc.trade.arch.util.Quintet;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qDT extends AbstractC49400uno<kotlin.Pair<? extends Quintet<? extends java.lang.Long, ? extends java.lang.String, ? extends java.lang.String, ? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType>, ? extends java.util.List<? extends C40005qFv>>, java.util.List<? extends C40005qFv>> {
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public qDT(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends Quintet<java.lang.Long, java.lang.String, java.lang.String, ? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType>, ? extends java.util.List<C40005qFv>> pair, @NotNull Continuation<? super java.util.List<C40005qFv>> continuation) {
        Quintet<java.lang.Long, java.lang.String, java.lang.String, ? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType> quintetComponent1 = pair.component1();
        java.util.List<C40005qFv> listComponent2 = pair.component2();
        java.lang.String strComponent2 = quintetComponent1.component2();
        java.lang.String strComponent3 = quintetComponent1.component3();
        OKSortTextView.SortType sortTypeComponent4 = quintetComponent1.component4();
        OKSortTextView.SortType sortTypeComponent5 = quintetComponent1.component5();
        int iHashCode = quintetComponent1.toString().hashCode();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent2, 10));
        java.util.Iterator<T> it = listComponent2.iterator();
        while (it.hasNext()) {
            arrayList.add(C40005qFv.copy$default((C40005qFv) it.next(), null, null, null, null, null, null, null, false, false, C56443yFo.AEQbTJ(iHashCode), false, 1535, null));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            C40005qFv c40005qFv = (C40005qFv) obj;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strComponent3) || Intrinsics.EZpvd((java.lang.Object) c40005qFv.KWHzl().getOptionOptType(), (java.lang.Object) strComponent3)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            C40005qFv c40005qFv2 = (C40005qFv) obj2;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strComponent2) || Intrinsics.EZpvd((java.lang.Object) c40005qFv2.KWHzl().getStk(), (java.lang.Object) strComponent2)) {
                arrayList3.add(obj2);
            }
        }
        OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
        if (sortTypeComponent4 != sortType) {
            if (sortTypeComponent4 == OKSortTextView.SortType.UP) {
                return CollectionsKt___CollectionsKt.EZpvd(arrayList3, new StateListAnimator());
            }
            return CollectionsKt___CollectionsKt.EZpvd(arrayList3, new Activity());
        }
        if (sortTypeComponent5 == sortType) {
            return arrayList3;
        }
        if (sortTypeComponent5 == OKSortTextView.SortType.UP) {
            return CollectionsKt___CollectionsKt.EZpvd(arrayList3, new Application());
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList3, new TaskDescription());
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            C41787qxR c41787qxRDjBIcL = ((C40005qFv) t).djBIcL();
            java.lang.Double dValueOf = c41787qxRDjBIcL != null ? java.lang.Double.valueOf(c41787qxRDjBIcL.OLrzqt()) : null;
            C41787qxR c41787qxRDjBIcL2 = ((C40005qFv) t2).djBIcL();
            return yET.KWHzl(dValueOf, c41787qxRDjBIcL2 != null ? java.lang.Double.valueOf(c41787qxRDjBIcL2.OLrzqt()) : null);
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            C41787qxR c41787qxRDjBIcL = ((C40005qFv) t).djBIcL();
            double dAEQbTJ = C33129mqd.AEQbTJ(c41787qxRDjBIcL != null ? c41787qxRDjBIcL.KWHzl() : null);
            C41787qxR c41787qxRDjBIcL2 = ((C40005qFv) t2).djBIcL();
            return yET.KWHzl(java.lang.Double.valueOf(dAEQbTJ), java.lang.Double.valueOf(C33129mqd.AEQbTJ(c41787qxRDjBIcL2 != null ? c41787qxRDjBIcL2.KWHzl() : null)));
        }
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            C41787qxR c41787qxRDjBIcL = ((C40005qFv) t2).djBIcL();
            double dAEQbTJ = C33129mqd.AEQbTJ(c41787qxRDjBIcL != null ? c41787qxRDjBIcL.KWHzl() : null);
            C41787qxR c41787qxRDjBIcL2 = ((C40005qFv) t).djBIcL();
            return yET.KWHzl(java.lang.Double.valueOf(dAEQbTJ), java.lang.Double.valueOf(C33129mqd.AEQbTJ(c41787qxRDjBIcL2 != null ? c41787qxRDjBIcL2.KWHzl() : null)));
        }
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            C41787qxR c41787qxRDjBIcL = ((C40005qFv) t2).djBIcL();
            java.lang.Double dValueOf = c41787qxRDjBIcL != null ? java.lang.Double.valueOf(c41787qxRDjBIcL.OLrzqt()) : null;
            C41787qxR c41787qxRDjBIcL2 = ((C40005qFv) t).djBIcL();
            return yET.KWHzl(dValueOf, c41787qxRDjBIcL2 != null ? java.lang.Double.valueOf(c41787qxRDjBIcL2.OLrzqt()) : null);
        }
    }
}
