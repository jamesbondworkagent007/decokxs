package o;

import com.okinc.market.quotation.domain.options.SubscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsVosUseCase$onExecute$combinedFlow$1;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.trade.arch.util.Quintet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41509qsE extends AbstractC49400uno<C41507qsC, Flow<? extends java.util.List<? extends InterfaceC41642quf>>> {
    public final C41547qsq EZpvd;
    public final C41544qsn KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C41511qsG copydefault;
    public final C41510qsF djBIcL;
    private static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41507qsC) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41642quf>>>) continuation);
    }

    /* JADX INFO: renamed from: o.qsE$Application */
    public static final class Application implements Flow<java.util.List<? extends InterfaceC41642quf>> {
        public final /* synthetic */ SortBy AEQbTJ;
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C41509qsE KWHzl;
        public final /* synthetic */ SortOrder OLrzqt;

        /* JADX INFO: renamed from: o.qsE$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C41509qsE EZpvd;
            public final /* synthetic */ SortBy KWHzl;
            public final /* synthetic */ SortOrder copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C41509qsE c41509qsE, SortBy sortBy, SortOrder sortOrder) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = c41509qsE;
                this.KWHzl = sortBy;
                this.copydefault = sortOrder;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1 subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof SubscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.AEQbTJ;
                    C41511qsG c41511qsG = this.EZpvd.copydefault;
                    Triple triple = new Triple(this.KWHzl, this.copydefault, (java.util.List) obj);
                    subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = flowCollector2;
                    subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objEZpvd = c41511qsG.EZpvd(triple, subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objEZpvd;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, subscribeOptionsVosUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, C41509qsE c41509qsE, SortBy sortBy, SortOrder sortOrder) {
            this.EZpvd = flow;
            this.KWHzl = c41509qsE;
            this.AEQbTJ = sortBy;
            this.OLrzqt = sortOrder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC41642quf>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.KWHzl, this.AEQbTJ, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41509qsE(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41547qsq c41547qsq, @NotNull C41510qsF c41510qsF, @NotNull C41544qsn c41544qsn, @NotNull C41511qsG c41511qsG) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41547qsq, "");
        Intrinsics.checkNotNullParameter(c41510qsF, "");
        Intrinsics.checkNotNullParameter(c41544qsn, "");
        Intrinsics.checkNotNullParameter(c41511qsG, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c41547qsq;
        this.djBIcL = c41510qsF;
        this.KWHzl = c41544qsn;
        this.copydefault = c41511qsG;
    }

    /* JADX INFO: renamed from: o.qsE$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41507qsC c41507qsC, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41642quf>>> continuation) throws java.lang.Throwable {
        SubscribeOptionsVosUseCase$onExecute$1 subscribeOptionsVosUseCase$onExecute$1;
        boolean zGEmmrt;
        SortBy sortByComponent1;
        C41509qsE c41509qsE;
        SortOrder sortOrder;
        java.util.List list;
        SortOrder sortOrder2;
        SortBy sortBy;
        C41509qsE c41509qsE2;
        if (continuation instanceof SubscribeOptionsVosUseCase$onExecute$1) {
            subscribeOptionsVosUseCase$onExecute$1 = (SubscribeOptionsVosUseCase$onExecute$1) continuation;
            int i = subscribeOptionsVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeOptionsVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeOptionsVosUseCase$onExecute$1 = new SubscribeOptionsVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeOptionsVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeOptionsVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C41434qqj.KWHzl.KWHzl("SubscribeOptionsVosUseCase", "start subscribe options vos input = " + c41507qsC);
            OptionsCategoryGroupVo optionsCategoryGroupVoOLrzqt = c41507qsC.OLrzqt();
            java.lang.String strAEQbTJ = c41507qsC.AEQbTJ();
            java.lang.String strKWHzl = c41507qsC.KWHzl();
            OptionsDirection optionsDirectionEZpvd = c41507qsC.EZpvd();
            kotlin.Pair<SortBy, SortOrder> pairCopydefault = c41507qsC.copydefault();
            java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>> mapValueOf = c41507qsC.valueOf();
            zGEmmrt = c41507qsC.gEmmrt();
            sortByComponent1 = pairCopydefault.component1();
            SortOrder sortOrderComponent2 = pairCopydefault.component2();
            Quintet quintet = new Quintet(optionsCategoryGroupVoOLrzqt, strAEQbTJ, strKWHzl, optionsDirectionEZpvd, mapValueOf);
            C41547qsq c41547qsq = this.EZpvd;
            subscribeOptionsVosUseCase$onExecute$1.L$0 = this;
            subscribeOptionsVosUseCase$onExecute$1.L$1 = sortByComponent1;
            subscribeOptionsVosUseCase$onExecute$1.L$2 = sortOrderComponent2;
            subscribeOptionsVosUseCase$onExecute$1.Z$0 = zGEmmrt;
            subscribeOptionsVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41547qsq.EZpvd(quintet, (Continuation) subscribeOptionsVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41509qsE = this;
            sortOrder = sortOrderComponent2;
            obj = objEZpvd;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) subscribeOptionsVosUseCase$onExecute$1.L$3;
                sortOrder2 = (SortOrder) subscribeOptionsVosUseCase$onExecute$1.L$2;
                sortBy = (SortBy) subscribeOptionsVosUseCase$onExecute$1.L$1;
                c41509qsE2 = (C41509qsE) subscribeOptionsVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                return FlowKt.flowOn(FlowKt.conflate(new Application(FlowKt.flowCombine(FlowKt.flowOf(list), (Flow) obj, new SubscribeOptionsVosUseCase$onExecute$combinedFlow$1(c41509qsE2, null)), c41509qsE2, sortBy, sortOrder2)), c41509qsE2.AEQbTJ());
            }
            zGEmmrt = subscribeOptionsVosUseCase$onExecute$1.Z$0;
            sortOrder = (SortOrder) subscribeOptionsVosUseCase$onExecute$1.L$2;
            sortByComponent1 = (SortBy) subscribeOptionsVosUseCase$onExecute$1.L$1;
            c41509qsE = (C41509qsE) subscribeOptionsVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.List list2 = (java.util.List) obj;
        if (list2 != null) {
            if (!C33129mqd.KWHzl((java.util.Collection) list2)) {
                list2 = null;
            }
            if (list2 != null) {
                kotlin.Pair pair = new kotlin.Pair(list2, C56443yFo.KWHzl(zGEmmrt));
                C41510qsF c41510qsF = c41509qsE.djBIcL;
                subscribeOptionsVosUseCase$onExecute$1.L$0 = c41509qsE;
                subscribeOptionsVosUseCase$onExecute$1.L$1 = sortByComponent1;
                subscribeOptionsVosUseCase$onExecute$1.L$2 = sortOrder;
                subscribeOptionsVosUseCase$onExecute$1.L$3 = list2;
                subscribeOptionsVosUseCase$onExecute$1.label = 2;
                java.lang.Object objOLrzqt = c41510qsF.OLrzqt(pair, subscribeOptionsVosUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
                obj = objOLrzqt;
                sortOrder2 = sortOrder;
                sortBy = sortByComponent1;
                c41509qsE2 = c41509qsE;
                return FlowKt.flowOn(FlowKt.conflate(new Application(FlowKt.flowCombine(FlowKt.flowOf(list), (Flow) obj, new SubscribeOptionsVosUseCase$onExecute$combinedFlow$1(c41509qsE2, null)), c41509qsE2, sortBy, sortOrder2)), c41509qsE2.AEQbTJ());
            }
        }
        C41434qqj.w$default(C41434qqj.KWHzl, "SubscribeOptionsVosUseCase", "filtered options list is empty", null, 4, null);
        return FlowKt.flowOf(yDY.AhwBna());
    }
}
