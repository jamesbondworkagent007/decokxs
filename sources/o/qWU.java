package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.GroupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.watch.usecase.GroupWatchListSubscribeUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWU extends AbstractC49400uno<java.lang.String, Flow<? extends java.util.List<? extends BizInstrument>>> {
    private static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final qWQ AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public qWU(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = qwq;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qWU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<? extends BizInstrument>>> continuation) throws java.lang.Throwable {
        GroupWatchListSubscribeUseCase$onExecute$1 groupWatchListSubscribeUseCase$onExecute$1;
        if (continuation instanceof GroupWatchListSubscribeUseCase$onExecute$1) {
            groupWatchListSubscribeUseCase$onExecute$1 = (GroupWatchListSubscribeUseCase$onExecute$1) continuation;
            int i = groupWatchListSubscribeUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchListSubscribeUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchListSubscribeUseCase$onExecute$1 = new GroupWatchListSubscribeUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = groupWatchListSubscribeUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupWatchListSubscribeUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            qWQ qwq = this.AEQbTJ;
            java.lang.String strKWHzl = C55686xod.KWHzl();
            groupWatchListSubscribeUseCase$onExecute$1.label = 1;
            objKWHzl = qwq.KWHzl(strKWHzl, str, groupWatchListSubscribeUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return new ActionBar(FlowKt.distinctUntilChanged((Flow) objKWHzl));
    }

    public static final class ActionBar implements Flow<java.util.List<? extends BizInstrument>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qWU$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0130 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                GroupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                java.util.List<BizInstrument> arrayList;
                FlowCollector flowCollector2;
                java.util.List list;
                AbstractC54531xLw abstractC54531xLwOLrzqt;
                AbstractC54531xLw abstractC54531xLwOLrzqt2;
                if (continuation instanceof GroupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) {
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 = (GroupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 = new GroupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.EZpvd;
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        BizInstrument bizInstrumentKWHzl = qWJ.KWHzl(qWJ.EZpvd((MarketUserFavorite) it.next()));
                        if (bizInstrumentKWHzl != null) {
                            arrayList.add(bizInstrumentKWHzl);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (BizInstrument bizInstrument : arrayList) {
                            if (!Intrinsics.EZpvd((java.lang.Object) bizInstrument.getBizStatus(), (java.lang.Object) "LIVE") && Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT")) {
                                InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                                groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$0 = flowCollector;
                                groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$1 = arrayList;
                                groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1, 3, null) == objCopydefault) {
                                    return objCopydefault;
                                }
                                flowCollector2 = flowCollector;
                                list = arrayList;
                            }
                        }
                    }
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$1 = null;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = 3;
                    if (flowCollector.emit(arrayList, groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    list = (java.util.List) groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$1;
                    flowCollector2 = (FlowCollector) groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                    pUU.KWHzl("WatchListSubscribeUseCase", "request load biz done + " + ((interfaceC54581xNrOLrzqt != null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt("SPOT")) == null) ? null : C56443yFo.KWHzl(abstractC54531xLwOLrzqt2.iwGUEr())));
                    arrayList = list;
                    flowCollector = flowCollector2;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$1 = null;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = 3;
                    if (flowCollector.emit(arrayList, groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                list = (java.util.List) groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$1;
                flowCollector2 = (FlowCollector) groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                ((Result) obj2).m7386unboximpl();
                pUU.KWHzl("WatchListSubscribeUseCase", "request count down should load biz");
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt("SPOT")) != null) {
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$0 = flowCollector2;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$1 = list;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = 2;
                    if (C55608xnE.copydefault(abstractC54531xLwOLrzqt, groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = pWO.KWHzl().OLrzqt();
                if (interfaceC54581xNrOLrzqt3 != null) {
                    pUU.KWHzl("WatchListSubscribeUseCase", "request load biz done + " + ((interfaceC54581xNrOLrzqt3 != null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt3.OLrzqt("SPOT")) == null) ? null : C56443yFo.KWHzl(abstractC54531xLwOLrzqt2.iwGUEr())));
                    arrayList = list;
                    flowCollector = flowCollector2;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.L$1 = null;
                    groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = 3;
                    if (flowCollector.emit(arrayList, groupWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
