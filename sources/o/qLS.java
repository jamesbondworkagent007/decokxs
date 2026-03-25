package o;

import com.okinc.market.search.features.navigation.history.domain.GetNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.history.domain.GetNavSearchHistoryUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLS extends AbstractC49400uno<Unit, Flow<? extends java.util.List<? extends C40174qMb>>> {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC54577xNn OLrzqt;
    public final qLR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public qLS(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull qLR qlr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qlr, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = interfaceC54577xNn;
        this.copydefault = qlr;
    }

    public static final class StateListAnimator implements Flow<java.util.List<? extends C40174qMb>> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ InterfaceC54581xNr copydefault;

        /* JADX INFO: renamed from: o.qLS$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC54581xNr EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, InterfaceC54581xNr interfaceC54581xNr) {
                this.KWHzl = flowCollector;
                this.EZpvd = interfaceC54581xNr;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                GetNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1 getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1;
                BizInstrument bizInstrumentCopydefault;
                C40174qMb c40174qMb;
                if (continuation instanceof GetNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1) {
                    getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1 = (GetNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1 = new GetNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (SearchTradeBizInfo searchTradeBizInfo : (java.util.List) obj) {
                        if (Intrinsics.EZpvd((java.lang.Object) searchTradeBizInfo.getInstType(), (java.lang.Object) "CEDEFI")) {
                            DexInstrument dexRawPo = searchTradeBizInfo.getDexRawPo();
                            c40174qMb = dexRawPo != null ? new C40174qMb(dexRawPo, searchTradeBizInfo) : null;
                        } else {
                            InterfaceC54581xNr interfaceC54581xNr = this.EZpvd;
                            if (interfaceC54581xNr != null && (bizInstrumentCopydefault = interfaceC54581xNr.copydefault(searchTradeBizInfo.getInstType(), searchTradeBizInfo.getInstId(), searchTradeBizInfo.getIndex(), searchTradeBizInfo.getAlias())) != null) {
                                c40174qMb = new C40174qMb(bizInstrumentCopydefault, searchTradeBizInfo);
                            }
                        }
                        if (c40174qMb != null) {
                            arrayList.add(c40174qMb);
                        }
                    }
                    getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, getNavSearchHistoryUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, InterfaceC54581xNr interfaceC54581xNr) {
            this.KWHzl = flow;
            this.copydefault = interfaceC54581xNr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends C40174qMb>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super Flow<? extends java.util.List<C40174qMb>>> continuation) throws java.lang.Throwable {
        GetNavSearchHistoryUseCase$onExecute$1 getNavSearchHistoryUseCase$onExecute$1;
        qLS qls;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        qLS qls2;
        java.util.Iterator it;
        java.lang.Object objEZpvd;
        InterfaceC54581xNr interfaceC54581xNr;
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        if (continuation instanceof GetNavSearchHistoryUseCase$onExecute$1) {
            getNavSearchHistoryUseCase$onExecute$1 = (GetNavSearchHistoryUseCase$onExecute$1) continuation;
            int i = getNavSearchHistoryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNavSearchHistoryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getNavSearchHistoryUseCase$onExecute$1 = new GetNavSearchHistoryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getNavSearchHistoryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNavSearchHistoryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn = this.OLrzqt;
            if (interfaceC54577xNn != null) {
                getNavSearchHistoryUseCase$onExecute$1.L$0 = this;
                getNavSearchHistoryUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getNavSearchHistoryUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                qls = this;
            } else {
                qls = this;
                interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                if (interfaceC54581xNrOLrzqt != null) {
                    interfaceC54581xNrOLrzqt.AxsJAY();
                }
                qls2 = qls;
                it = yDY.gEmmrt("SPOT", "SWAP", "FUTURES", "OPTION").iterator();
                while (it.hasNext()) {
                }
                qLR qlr = qls2.copydefault;
                getNavSearchHistoryUseCase$onExecute$1.L$0 = interfaceC54581xNrOLrzqt;
                getNavSearchHistoryUseCase$onExecute$1.L$1 = null;
                getNavSearchHistoryUseCase$onExecute$1.L$2 = null;
                getNavSearchHistoryUseCase$onExecute$1.label = 3;
                objEZpvd = qlr.EZpvd(getNavSearchHistoryUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC54581xNr = (InterfaceC54581xNr) getNavSearchHistoryUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return new StateListAnimator((Flow) obj, interfaceC54581xNr);
                }
                it = (java.util.Iterator) getNavSearchHistoryUseCase$onExecute$1.L$2;
                InterfaceC54581xNr interfaceC54581xNr2 = (InterfaceC54581xNr) getNavSearchHistoryUseCase$onExecute$1.L$1;
                qls2 = (qLS) getNavSearchHistoryUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                interfaceC54581xNrOLrzqt = interfaceC54581xNr2;
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwDjBIcL = interfaceC54581xNrOLrzqt.djBIcL(str)) != null) {
                        getNavSearchHistoryUseCase$onExecute$1.L$0 = qls2;
                        getNavSearchHistoryUseCase$onExecute$1.L$1 = interfaceC54581xNrOLrzqt;
                        getNavSearchHistoryUseCase$onExecute$1.L$2 = it;
                        getNavSearchHistoryUseCase$onExecute$1.label = 2;
                        if (C55608xnE.copydefault(abstractC54531xLwDjBIcL, getNavSearchHistoryUseCase$onExecute$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                qLR qlr2 = qls2.copydefault;
                getNavSearchHistoryUseCase$onExecute$1.L$0 = interfaceC54581xNrOLrzqt;
                getNavSearchHistoryUseCase$onExecute$1.L$1 = null;
                getNavSearchHistoryUseCase$onExecute$1.L$2 = null;
                getNavSearchHistoryUseCase$onExecute$1.label = 3;
                objEZpvd = qlr2.EZpvd(getNavSearchHistoryUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                InterfaceC54581xNr interfaceC54581xNr3 = interfaceC54581xNrOLrzqt;
                obj = objEZpvd;
                interfaceC54581xNr = interfaceC54581xNr3;
                return new StateListAnimator((Flow) obj, interfaceC54581xNr);
            }
            qls = (qLS) getNavSearchHistoryUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
        }
        qls2 = qls;
        it = yDY.gEmmrt("SPOT", "SWAP", "FUTURES", "OPTION").iterator();
        while (it.hasNext()) {
        }
        qLR qlr22 = qls2.copydefault;
        getNavSearchHistoryUseCase$onExecute$1.L$0 = interfaceC54581xNrOLrzqt;
        getNavSearchHistoryUseCase$onExecute$1.L$1 = null;
        getNavSearchHistoryUseCase$onExecute$1.L$2 = null;
        getNavSearchHistoryUseCase$onExecute$1.label = 3;
        objEZpvd = qlr22.EZpvd(getNavSearchHistoryUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
        }
    }
}
