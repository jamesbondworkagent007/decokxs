package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41577qtT<T> implements InterfaceC49405unt<kotlin.Pair<? extends java.util.List<? extends T>, ? extends Function1<? super T, ? extends CountDownInfo>>, java.util.List<? extends T>> {
    @yCM
    public C41577qtT() {
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.List<T> copydefault(@NotNull kotlin.Pair<? extends java.util.List<? extends T>, ? extends Function1<? super T, CountDownInfo>> pair) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, pair);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public java.util.List<T> AEQbTJ(@NotNull kotlin.Pair<? extends java.util.List<? extends T>, ? extends Function1<? super T, CountDownInfo>> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List<? extends T> listComponent1 = pair.component1();
        Function1<? super T, CountDownInfo> function1Component2 = pair.component2();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (T t : listComponent1) {
            if (function1Component2.invoke(t) != null) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        kotlin.Pair pair2 = new kotlin.Pair(arrayList, arrayList2);
        java.util.List list = (java.util.List) pair2.component1();
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator(function1Component2)), (java.lang.Iterable) pair2.component2());
    }

    /* JADX INFO: renamed from: o.qtT$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            this.EZpvd = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            long jValueOf;
            CountDownInfo countDownInfo = (CountDownInfo) this.EZpvd.invoke(t);
            CountDownType showType = countDownInfo != null ? countDownInfo.getShowType() : null;
            CountDownType countDownType = CountDownType.SHOW_EXPECT;
            long jValueOf2 = Long.MAX_VALUE;
            if (showType == countDownType) {
                jValueOf = Long.MAX_VALUE;
            } else {
                jValueOf = C33129mqd.valueOf(countDownInfo != null ? countDownInfo.getWaitOnlineTime() : null);
            }
            CountDownInfo countDownInfo2 = (CountDownInfo) this.EZpvd.invoke(t2);
            if ((countDownInfo2 != null ? countDownInfo2.getShowType() : null) != countDownType) {
                jValueOf2 = C33129mqd.valueOf(countDownInfo2 != null ? countDownInfo2.getWaitOnlineTime() : null);
            }
            return yET.KWHzl(java.lang.Long.valueOf(jValueOf), java.lang.Long.valueOf(jValueOf2));
        }
    }
}
