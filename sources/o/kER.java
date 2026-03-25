package o;

import com.okinc.business.market.home.favorites.domain.HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.business.market.home.favorites.domain.HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1;
import com.okinc.business.market.home.favorites.domain.HomeFavItemsAggregatedUseCase$onExecute$1;
import com.okinc.business.market.home.favorites.domain.HomeFavItemsAggregatedUseCase$onExecute$2;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kER extends AbstractC49400uno<Flow<? extends java.util.List<? extends qWH>>, Flow<? extends java.util.List<? extends qWH>>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C40470qXa EZpvd;
    public final qWR KWHzl;
    public final C40473qXd copydefault;
    public final C40434qVs gEmmrt;
    public final qWM valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public kER(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qWM qwm, @NotNull C40434qVs c40434qVs, @NotNull C40470qXa c40470qXa, @NotNull C40473qXd c40473qXd, @NotNull qWR qwr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qwm, "");
        Intrinsics.checkNotNullParameter(c40434qVs, "");
        Intrinsics.checkNotNullParameter(c40470qXa, "");
        Intrinsics.checkNotNullParameter(c40473qXd, "");
        Intrinsics.checkNotNullParameter(qwr, "");
        this.AEQbTJ = coroutineDispatcher;
        this.valueOf = qwm;
        this.gEmmrt = c40434qVs;
        this.EZpvd = c40470qXa;
        this.copydefault = c40473qXd;
        this.KWHzl = qwr;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kER.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class Application implements Flow<java.util.List<? extends BizInstrument>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.kER$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1 homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1) {
                    homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1 = (HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1 = new HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (t instanceof qWC) {
                            arrayList.add(t);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((qWC) it.next()).copydefault());
                    }
                    homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList2, homeFavItemsAggregatedUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<java.util.List<? extends qWG>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.kER$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1 homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1;
                if (continuation instanceof HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1) {
                    homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1 = (HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1) continuation;
                    int i = homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1 = new HomeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (t instanceof qWG) {
                            arrayList.add(t);
                        }
                    }
                    homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(arrayList, homeFavItemsAggregatedUseCase$onExecute$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends qWG>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Flow<? extends java.util.List<? extends qWH>> flow, @NotNull Continuation<? super Flow<? extends java.util.List<? extends qWH>>> continuation) throws java.lang.Throwable {
        HomeFavItemsAggregatedUseCase$onExecute$1 homeFavItemsAggregatedUseCase$onExecute$1;
        kER ker;
        Flow flow2;
        Flow<? extends java.util.List<? extends qWH>> flow3;
        Flow flow4;
        C40473qXd c40473qXd;
        Flow<? extends java.util.List<? extends qWH>> flow5;
        Flow flow6;
        Flow<? extends java.util.List<? extends qWH>> flow7;
        Flow flow8;
        Flow flow9;
        kER ker2;
        java.lang.Object objKWHzl;
        Flow flow10;
        Flow flow11;
        kER ker3;
        Flow flow12;
        if (continuation instanceof HomeFavItemsAggregatedUseCase$onExecute$1) {
            homeFavItemsAggregatedUseCase$onExecute$1 = (HomeFavItemsAggregatedUseCase$onExecute$1) continuation;
            int i = homeFavItemsAggregatedUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeFavItemsAggregatedUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                homeFavItemsAggregatedUseCase$onExecute$1 = new HomeFavItemsAggregatedUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = homeFavItemsAggregatedUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = homeFavItemsAggregatedUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("HomeFavItemsAggregatedUseCase", "start to fav data");
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(flow);
            Application application = new Application(flow);
            TaskDescription taskDescription = new TaskDescription(flow);
            Flow flowConflate = FlowKt.conflate((Flow) this.gEmmrt.KWHzl(flowDistinctUntilChanged));
            C40470qXa c40470qXa = this.EZpvd;
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(application, flowConflate);
            homeFavItemsAggregatedUseCase$onExecute$1.L$0 = this;
            homeFavItemsAggregatedUseCase$onExecute$1.L$1 = flowDistinctUntilChanged;
            homeFavItemsAggregatedUseCase$onExecute$1.L$2 = application;
            homeFavItemsAggregatedUseCase$onExecute$1.L$3 = taskDescription;
            homeFavItemsAggregatedUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd2 = c40470qXa.EZpvd(pairOLrzqt, homeFavItemsAggregatedUseCase$onExecute$1);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            ker = this;
            flow2 = application;
            objEZpvd = objEZpvd2;
            flow3 = taskDescription;
            flow4 = flowDistinctUntilChanged;
        } else if (i2 == 1) {
            flow3 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$3;
            Flow flow13 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$2;
            Flow flow14 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$1;
            kER ker4 = (kER) homeFavItemsAggregatedUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            ker = ker4;
            flow4 = flow14;
            flow2 = flow13;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flow12 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$3;
                    flow10 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$2;
                    flow11 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$1;
                    ker3 = (kER) homeFavItemsAggregatedUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    return FlowKt.conflate(FlowKt.combine(flow11, flow10, flow12, FlowKt.conflate((Flow) objEZpvd), new HomeFavItemsAggregatedUseCase$onExecute$2(ker3, null)));
                }
                flow7 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$3;
                flow8 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$2;
                flow9 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$1;
                ker2 = (kER) homeFavItemsAggregatedUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                Flow flowConflate2 = FlowKt.conflate((Flow) objEZpvd);
                pUU.KWHzl("HomeFavItemsAggregatedUseCase", "start to fav data --- bizCoinQuoteFlow");
                qWR qwr = ker2.KWHzl;
                homeFavItemsAggregatedUseCase$onExecute$1.L$0 = ker2;
                homeFavItemsAggregatedUseCase$onExecute$1.L$1 = flow9;
                homeFavItemsAggregatedUseCase$onExecute$1.L$2 = flow8;
                homeFavItemsAggregatedUseCase$onExecute$1.L$3 = flowConflate2;
                homeFavItemsAggregatedUseCase$onExecute$1.label = 4;
                objKWHzl = qwr.KWHzl(flow7, (Continuation<? super Flow<? extends java.util.List<? extends qWH>>>) homeFavItemsAggregatedUseCase$onExecute$1);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                flow10 = flow8;
                flow11 = flow9;
                ker3 = ker2;
                objEZpvd = objKWHzl;
                flow12 = flowConflate2;
                return FlowKt.conflate(FlowKt.combine(flow11, flow10, flow12, FlowKt.conflate((Flow) objEZpvd), new HomeFavItemsAggregatedUseCase$onExecute$2(ker3, null)));
            }
            flow6 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$5;
            c40473qXd = (C40473qXd) homeFavItemsAggregatedUseCase$onExecute$1.L$4;
            flow5 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$3;
            flow2 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$2;
            flow4 = (Flow) homeFavItemsAggregatedUseCase$onExecute$1.L$1;
            ker = (kER) homeFavItemsAggregatedUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            kotlin.Pair pairOLrzqt2 = C49380unU.OLrzqt(flow6, objEZpvd);
            homeFavItemsAggregatedUseCase$onExecute$1.L$0 = ker;
            homeFavItemsAggregatedUseCase$onExecute$1.L$1 = flow4;
            homeFavItemsAggregatedUseCase$onExecute$1.L$2 = flow2;
            homeFavItemsAggregatedUseCase$onExecute$1.L$3 = flow5;
            homeFavItemsAggregatedUseCase$onExecute$1.L$4 = null;
            homeFavItemsAggregatedUseCase$onExecute$1.L$5 = null;
            homeFavItemsAggregatedUseCase$onExecute$1.label = 3;
            objEZpvd = c40473qXd.EZpvd(pairOLrzqt2, homeFavItemsAggregatedUseCase$onExecute$1);
            if (objEZpvd != objCopydefault) {
                return objCopydefault;
            }
            flow7 = flow5;
            flow8 = flow2;
            flow9 = flow4;
            ker2 = ker;
            Flow flowConflate22 = FlowKt.conflate((Flow) objEZpvd);
            pUU.KWHzl("HomeFavItemsAggregatedUseCase", "start to fav data --- bizCoinQuoteFlow");
            qWR qwr2 = ker2.KWHzl;
            homeFavItemsAggregatedUseCase$onExecute$1.L$0 = ker2;
            homeFavItemsAggregatedUseCase$onExecute$1.L$1 = flow9;
            homeFavItemsAggregatedUseCase$onExecute$1.L$2 = flow8;
            homeFavItemsAggregatedUseCase$onExecute$1.L$3 = flowConflate22;
            homeFavItemsAggregatedUseCase$onExecute$1.label = 4;
            objKWHzl = qwr2.KWHzl(flow7, (Continuation<? super Flow<? extends java.util.List<? extends qWH>>>) homeFavItemsAggregatedUseCase$onExecute$1);
            if (objKWHzl != objCopydefault) {
            }
        }
        Flow flowConflate3 = FlowKt.conflate((Flow) objEZpvd);
        c40473qXd = ker.copydefault;
        qWM qwm = ker.valueOf;
        homeFavItemsAggregatedUseCase$onExecute$1.L$0 = ker;
        homeFavItemsAggregatedUseCase$onExecute$1.L$1 = flow4;
        homeFavItemsAggregatedUseCase$onExecute$1.L$2 = flow2;
        homeFavItemsAggregatedUseCase$onExecute$1.L$3 = flow3;
        homeFavItemsAggregatedUseCase$onExecute$1.L$4 = c40473qXd;
        homeFavItemsAggregatedUseCase$onExecute$1.L$5 = flowConflate3;
        homeFavItemsAggregatedUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd3 = qwm.EZpvd(homeFavItemsAggregatedUseCase$onExecute$1);
        if (objEZpvd3 == objCopydefault) {
            return objCopydefault;
        }
        flow5 = flow3;
        flow6 = flowConflate3;
        objEZpvd = objEZpvd3;
        kotlin.Pair pairOLrzqt22 = C49380unU.OLrzqt(flow6, objEZpvd);
        homeFavItemsAggregatedUseCase$onExecute$1.L$0 = ker;
        homeFavItemsAggregatedUseCase$onExecute$1.L$1 = flow4;
        homeFavItemsAggregatedUseCase$onExecute$1.L$2 = flow2;
        homeFavItemsAggregatedUseCase$onExecute$1.L$3 = flow5;
        homeFavItemsAggregatedUseCase$onExecute$1.L$4 = null;
        homeFavItemsAggregatedUseCase$onExecute$1.L$5 = null;
        homeFavItemsAggregatedUseCase$onExecute$1.label = 3;
        objEZpvd = c40473qXd.EZpvd(pairOLrzqt22, homeFavItemsAggregatedUseCase$onExecute$1);
        if (objEZpvd != objCopydefault) {
        }
    }

    public final java.lang.String AEQbTJ(qWH qwh) {
        if (qwh instanceof qWC) {
            qWC qwc = (qWC) qwh;
            return qwc.KWHzl().getInstId() + qwc.AhwBna();
        }
        if (qwh instanceof qWG) {
            qWG qwg = (qWG) qwh;
            return qwg.KWHzl().getChainId() + qwg.KWHzl().getTokenContractAddress();
        }
        return qwh.AhwBna() + qwh.hashCode();
    }
}
