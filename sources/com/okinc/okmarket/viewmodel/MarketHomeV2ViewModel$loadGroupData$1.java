package com.okinc.okmarket.viewmodel;

import com.okinc.market.watch.data.UserGroup;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C40483qXn;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.pUU;
import o.qWM;
import o.qWX;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$loadGroupData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MarketHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2ViewModel$loadGroupData$1(MarketHomeV2ViewModel marketHomeV2ViewModel, Continuation<? super MarketHomeV2ViewModel$loadGroupData$1> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2ViewModel$loadGroupData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2ViewModel$loadGroupData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements Flow<List<? extends UserGroupVo>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$loadGroupData$1$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MarketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1 marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1;
                if (continuation instanceof MarketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1) {
                    marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1 = (MarketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1) continuation;
                    int i = marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1 = new MarketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    ArrayList arrayList = new ArrayList();
                    for (T t : (List) obj) {
                        if (!((UserGroup) t).isHidden()) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new UserGroupVo((UserGroup) it.next()));
                    }
                    marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList2, marketHomeV2ViewModel$loadGroupData$1$invokeSuspend$lambda$6$lambda$5$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends UserGroupVo>> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x000a */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: kotlin.Unit */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: kotlin.Unit */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: kotlin.Unit */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Object obj3;
        Throwable thM7380exceptionOrNullimpl;
        Object obj4;
        MarketHomeV2ViewModel marketHomeV2ViewModel;
        Object objM7377constructorimpl2;
        Unit unit;
        Object objEZpvd;
        Object obj5;
        Flow activity;
        Flow flow;
        Object objCopydefault = C56442yFn.copydefault();
        Object obj6 = "MarketHomeV2ViewModel";
        try {
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (Throwable th2) {
            th = th2;
            obj2 = obj6;
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            unit = obj2;
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            }
            flow = (Flow) objM7377constructorimpl2;
            if (flow != null) {
            }
            return Unit.INSTANCE;
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData start");
                MarketHomeV2ViewModel marketHomeV2ViewModel2 = this.this$0;
                Result.Application application3 = Result.Companion;
                qWM qwm = marketHomeV2ViewModel2.djBIcL;
                this.label = 1;
                if (qwm.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                obj3 = objM7377constructorimpl;
                MarketHomeV2ViewModel marketHomeV2ViewModel3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj3);
                if (thM7380exceptionOrNullimpl != null) {
                    if (thM7380exceptionOrNullimpl instanceof CancellationException) {
                        pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData watchBizRep initWatchBiz has catched error " + thM7380exceptionOrNullimpl);
                    } else {
                        MarketHomeV2ViewModel$loadGroupData$1$2$1 marketHomeV2ViewModel$loadGroupData$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$loadGroupData$1$2$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj7) {
                                return ((MarketHomeV2ViewModel.ActionBar) obj7).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj7, Object obj8) {
                                ((MarketHomeV2ViewModel.ActionBar) obj7).KWHzl((InterfaceC49371unL) obj8);
                            }
                        };
                        InterfaceC49371unL.Application application4 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = obj3;
                        this.L$1 = thM7380exceptionOrNullimpl;
                        this.label = 2;
                        if (marketHomeV2ViewModel3.KWHzl(marketHomeV2ViewModel$loadGroupData$1$2$1, application4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData watchBizRep initWatchBiz error " + thM7380exceptionOrNullimpl);
                    }
                }
                MarketHomeV2ViewModel marketHomeV2ViewModel4 = this.this$0;
                if (Result.m7384isSuccessimpl(obj3)) {
                    Object obj7 = (Unit) obj3;
                    pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData watchBizRep initWatchBiz success");
                    try {
                        Result.Application application5 = Result.Companion;
                        C40483qXn c40483qXn = marketHomeV2ViewModel4.copydefault;
                        Boolean boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = obj3;
                        this.L$1 = marketHomeV2ViewModel4;
                        this.L$2 = obj7;
                        this.label = 3;
                        objEZpvd = c40483qXn.EZpvd(boolKWHzl, this);
                    } catch (Throwable th3) {
                        obj4 = obj3;
                        marketHomeV2ViewModel = marketHomeV2ViewModel4;
                        th = th3;
                        obj2 = obj7;
                        Result.Application application22 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        unit = obj2;
                    }
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj4 = obj3;
                    marketHomeV2ViewModel = marketHomeV2ViewModel4;
                    obj = objEZpvd;
                    obj5 = obj7;
                    activity = new Activity(FlowKt.distinctUntilChanged((Flow) obj));
                    qWX qwx = marketHomeV2ViewModel.AEQbTJ;
                    Unit unit2 = Unit.INSTANCE;
                    this.L$0 = obj4;
                    this.L$1 = marketHomeV2ViewModel;
                    this.L$2 = obj5;
                    this.L$3 = activity;
                    this.label = 4;
                    obj = qwx.EZpvd(unit2, this);
                    obj6 = obj5;
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl2 = Result.m7377constructorimpl(FlowKt.flowCombine(activity, FlowKt.distinctUntilChanged((Flow) obj), new MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1(null)));
                    unit = obj6;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                        objM7377constructorimpl2 = null;
                    }
                    flow = (Flow) objM7377constructorimpl2;
                    if (flow != null) {
                        MarketHomeV2ViewModel$loadGroupData$1$3$1 marketHomeV2ViewModel$loadGroupData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$loadGroupData$1$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj8) {
                                return ((MarketHomeV2ViewModel.ActionBar) obj8).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj8, Object obj9) {
                                ((MarketHomeV2ViewModel.ActionBar) obj8).KWHzl((InterfaceC49371unL) obj9);
                            }
                        };
                        InterfaceC49371unL.Application application6 = new InterfaceC49371unL.Application(new NullPointerException("flow is null"), null, 2, null);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        if (marketHomeV2ViewModel.KWHzl(marketHomeV2ViewModel$loadGroupData$1$3$1, application6, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.m7441catch(flow, new MarketHomeV2ViewModel$loadGroupData$1$3$2(unit, marketHomeV2ViewModel, null)), new MarketHomeV2ViewModel$loadGroupData$1$3$3(null));
                        MarketHomeV2ViewModel$loadGroupData$1$3$4 marketHomeV2ViewModel$loadGroupData$1$3$4 = new MarketHomeV2ViewModel$loadGroupData$1$3$4(marketHomeV2ViewModel, null);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 6;
                        if (FlowKt.collectLatest(flowOnCompletion, marketHomeV2ViewModel$loadGroupData$1$3$4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                obj3 = objM7377constructorimpl;
                MarketHomeV2ViewModel marketHomeV2ViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj3);
                if (thM7380exceptionOrNullimpl != null) {
                }
                MarketHomeV2ViewModel marketHomeV2ViewModel42 = this.this$0;
                if (Result.m7384isSuccessimpl(obj3)) {
                }
                return Unit.INSTANCE;
            case 2:
                thM7380exceptionOrNullimpl = (Throwable) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData watchBizRep initWatchBiz error " + thM7380exceptionOrNullimpl);
                MarketHomeV2ViewModel marketHomeV2ViewModel422 = this.this$0;
                if (Result.m7384isSuccessimpl(obj3)) {
                }
                return Unit.INSTANCE;
            case 3:
                Object obj8 = (Unit) this.L$2;
                marketHomeV2ViewModel = (MarketHomeV2ViewModel) this.L$1;
                obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj5 = obj8;
                activity = new Activity(FlowKt.distinctUntilChanged((Flow) obj));
                qWX qwx2 = marketHomeV2ViewModel.AEQbTJ;
                Unit unit22 = Unit.INSTANCE;
                this.L$0 = obj4;
                this.L$1 = marketHomeV2ViewModel;
                this.L$2 = obj5;
                this.L$3 = activity;
                this.label = 4;
                obj = qwx2.EZpvd(unit22, this);
                obj6 = obj5;
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl(FlowKt.flowCombine(activity, FlowKt.distinctUntilChanged((Flow) obj), new MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1(null)));
                unit = obj6;
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                }
                flow = (Flow) objM7377constructorimpl2;
                if (flow != null) {
                }
                return Unit.INSTANCE;
            case 4:
                activity = (Flow) this.L$3;
                Object obj9 = (Unit) this.L$2;
                marketHomeV2ViewModel = (MarketHomeV2ViewModel) this.L$1;
                obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj6 = obj9;
                objM7377constructorimpl2 = Result.m7377constructorimpl(FlowKt.flowCombine(activity, FlowKt.distinctUntilChanged((Flow) obj), new MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1(null)));
                unit = obj6;
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                }
                flow = (Flow) objM7377constructorimpl2;
                if (flow != null) {
                }
                return Unit.INSTANCE;
            case 5:
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
