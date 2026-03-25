package com.okinc.business.market.features.position.ui;

import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import com.okinc.business.market.features.holdings.ui.PositionSortType;
import com.okinc.business.market.features.position.ui.PositionsViewModel$triggerSortingFilter$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C28442kap;
import o.C28443kaq;
import o.C28444kar;
import o.C29092knC;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.yET;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$triggerSortingFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C29092knC $activePosition;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PositionSortType.values().length];
            try {
                iArr[PositionSortType.BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionSortType.PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$triggerSortingFilter$1(PositionsViewModel positionsViewModel, C29092knC c29092knC, Continuation<? super PositionsViewModel$triggerSortingFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
        this.$activePosition = c29092knC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$triggerSortingFilter$1(this.this$0, this.$activePosition, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$triggerSortingFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application<T> implements Comparator {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            this.copydefault = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.copydefault;
            return yET.KWHzl((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
        }
    }

    public static final class ActionBar<T> implements Comparator {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            this.copydefault = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.copydefault;
            return yET.KWHzl((Comparable) function1.invoke(t2), (Comparable) function1.invoke(t));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listDjBIcL;
        Comparator application;
        Object next;
        Object next2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final C28444kar c28444karGEmmrt = this.this$0.gEmmrt();
            C29092knC c29092knC = this.$activePosition;
            if (c29092knC == null) {
                c29092knC = (C29092knC) this.this$0.AEQbTJ.getValue();
            }
            C29092knC c29092knC2 = c29092knC;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            List<HoldingAsset> listOLrzqt = c29092knC2.OLrzqt();
            if (listOLrzqt != null) {
                PositionsViewModel positionsViewModel = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listOLrzqt) {
                    HoldingAsset holdingAsset = (HoldingAsset) obj2;
                    C28443kaq c28443kaq = (C28443kaq) positionsViewModel.EZpvd.getValue();
                    if (c28443kaq != null) {
                        Iterator<T> it = c28443kaq.AEQbTJ().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            C28442kap c28442kap = (C28442kap) next2;
                            if (Intrinsics.EZpvd((Object) String.valueOf(c28442kap.AEQbTJ()), (Object) holdingAsset.OLrzqt()) && Intrinsics.EZpvd((Object) c28442kap.OLrzqt(), (Object) holdingAsset.fetchVPNInfo())) {
                                break;
                            }
                        }
                        if (next2 == null && (!c28443kaq.EZpvd() || !C33129mqd.valueOf(holdingAsset.KWHzl(), c28443kaq.OLrzqt()))) {
                            if (!c28443kaq.KWHzl() || (!holdingAsset.gEmmrt() && !holdingAsset.DbNXlk())) {
                            }
                        }
                    }
                    arrayList.add(obj2);
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean z = false;
                    if (it2.hasNext()) {
                        Object next3 = it2.next();
                        HoldingAsset holdingAsset2 = (HoldingAsset) next3;
                        boolean z2 = !Intrinsics.EZpvd((Object) holdingAsset2.KWHzl(), (Object) "--") && holdingAsset2.KWHzl().length() > 0;
                        if (!Intrinsics.EZpvd((Object) holdingAsset2.fARcdN(), (Object) "--") && holdingAsset2.fARcdN().length() > 0) {
                            z = true;
                        }
                        int i = Activity.OLrzqt[c28444karGEmmrt.KWHzl().ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z) {
                                arrayList2.add(next3);
                            } else {
                                arrayList3.add(next3);
                            }
                        } else if (z2) {
                            arrayList2.add(next3);
                        } else {
                            arrayList3.add(next3);
                        }
                    } else {
                        Pair pair = new Pair(arrayList2, arrayList3);
                        List list = (List) pair.component1();
                        List list2 = (List) pair.component2();
                        Function1 function1 = new Function1() { // from class: o.kog
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return java.lang.Float.valueOf(PositionsViewModel$triggerSortingFilter$1.invokeSuspend$lambda$6$lambda$4(c28444karGEmmrt, (HoldingAsset) obj3));
                            }
                        };
                        if (c28444karGEmmrt.EZpvd()) {
                            application = new ActionBar(function1);
                        } else {
                            application = new Application(function1);
                        }
                        List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, application);
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (((HoldingAsset) next).ejfBZ()) {
                                break;
                            }
                        }
                        booleanRef.element = next != null;
                        listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) listEZpvd, (Iterable) list2);
                    }
                }
            } else {
                listDjBIcL = null;
            }
            this.this$0.AEQbTJ.setValue(C29092knC.copy$default(c29092knC2, false, listDjBIcL, null, booleanRef.element, 0L, 21, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$6$lambda$4(C28444kar c28444kar, HoldingAsset holdingAsset) {
        int i = Activity.OLrzqt[c28444kar.KWHzl().ordinal()];
        if (i == 1) {
            return C33129mqd.djBIcL(holdingAsset.KWHzl());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C33129mqd.djBIcL(holdingAsset.fARcdN());
    }
}
