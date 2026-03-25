package o;

import com.okinc.uilab.view.OKSortTextView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qDV extends AbstractC49400uno<kotlin.Pair<? extends kotlin.Pair<? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType>, ? extends java.util.List<? extends C39999qFp>>, java.util.List<? extends C39999qFp>> {
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public qDV(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends kotlin.Pair<? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType>, ? extends java.util.List<C39999qFp>> pair, @NotNull Continuation<? super java.util.List<C39999qFp>> continuation) {
        kotlin.Pair<? extends OKSortTextView.SortType, ? extends OKSortTextView.SortType> pairComponent1 = pair.component1();
        java.util.List<C39999qFp> listComponent2 = pair.component2();
        OKSortTextView.SortType sortTypeComponent1 = pairComponent1.component1();
        OKSortTextView.SortType sortTypeComponent2 = pairComponent1.component2();
        int iHashCode = pairComponent1.toString().hashCode();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent2, 10));
        for (C39999qFp c39999qFp : listComponent2) {
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(c39999qFp.AEQbTJ((6143 & 1) != 0 ? c39999qFp.djBIcL : null, (6143 & 2) != 0 ? c39999qFp.KWHzl : null, (6143 & 4) != 0 ? c39999qFp.gEmmrt : null, (6143 & 8) != 0 ? c39999qFp.AEQbTJ : null, (6143 & 16) != 0 ? c39999qFp.OLrzqt : null, (6143 & 32) != 0 ? c39999qFp.EZpvd : null, (6143 & 64) != 0 ? c39999qFp.AkhnZx : null, (6143 & 128) != 0 ? c39999qFp.copydefault : null, (6143 & 256) != 0 ? c39999qFp.AhwBna : null, (6143 & 512) != 0 ? c39999qFp.isConnected : null, (6143 & 1024) != 0 ? c39999qFp.valueOf : null, (6143 & 2048) != 0 ? c39999qFp.DbNXlk : iHashCode, (6143 & 4096) != 0 ? c39999qFp.AYXKKw : 0.0f));
            arrayList = arrayList2;
        }
        java.util.ArrayList arrayList3 = arrayList;
        OKSortTextView.SortType sortType = OKSortTextView.SortType.UP;
        if (sortTypeComponent1 != sortType) {
            OKSortTextView.SortType sortType2 = OKSortTextView.SortType.DOWN;
            if (sortTypeComponent1 == sortType2) {
                return CollectionsKt___CollectionsKt.EZpvd(arrayList3, new Application());
            }
            if (sortTypeComponent2 == sortType) {
                return CollectionsKt___CollectionsKt.EZpvd(arrayList3, new StateListAnimator());
            }
            return sortTypeComponent2 == sortType2 ? CollectionsKt___CollectionsKt.EZpvd(arrayList3, new Activity()) : arrayList3;
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList3, new TaskDescription());
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t).valueOf().getPriceChange24H())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t2).valueOf().getPriceChange24H())));
        }
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t).valueOf().getPrice())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t2).valueOf().getPrice())));
        }
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t2).valueOf().getPriceChange24H())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t).valueOf().getPriceChange24H())));
        }
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t2).valueOf().getPrice())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C39999qFp) t).valueOf().getPrice())));
        }
    }
}
