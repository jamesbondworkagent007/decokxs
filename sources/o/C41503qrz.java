package o;

import com.okinc.market.quotation.data.util.TwoKeyMap;
import com.okinc.market.quotation.domain.dex.SubscribeDexVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.dex.SubscribeDexVosUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.dex.SubscribeDexVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.dex.SubscribeDexVosUseCase$onExecute$combinedFlow$1;
import com.okinc.market.quotation.domain.dex.SubscribeDexVosUseCase$onExecute$combinedFlow$3;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41503qrz implements InterfaceC49404uns<C41455qrD, Flow<? extends java.util.List<? extends InterfaceC41655qus>>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41452qrA EZpvd;
    public final C41423qqY KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final C41454qrC copydefault;

    /* JADX INFO: renamed from: o.qrz$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends InterfaceC41655qus>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C41503qrz EZpvd;
        public final /* synthetic */ DexSortByEnum KWHzl;
        public final /* synthetic */ SortOrder OLrzqt;

        /* JADX INFO: renamed from: o.qrz$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ SortOrder AEQbTJ;
            public final /* synthetic */ C41503qrz EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;
            public final /* synthetic */ DexSortByEnum copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C41503qrz c41503qrz, DexSortByEnum dexSortByEnum, SortOrder sortOrder) {
                this.OLrzqt = flowCollector;
                this.EZpvd = c41503qrz;
                this.copydefault = dexSortByEnum;
                this.AEQbTJ = sortOrder;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeDexVosUseCase$onExecute$$inlined$map$1$2$1 subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof SubscribeDexVosUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeDexVosUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeDexVosUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.OLrzqt;
                    C41452qrA c41452qrA = this.EZpvd.EZpvd;
                    Triple triple = new Triple(this.copydefault, this.AEQbTJ, (java.util.List) obj);
                    subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = flowCollector2;
                    subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objEZpvd = c41452qrA.EZpvd(triple, subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1);
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
                    FlowCollector flowCollector3 = (FlowCollector) subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, subscribeDexVosUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, C41503qrz c41503qrz, DexSortByEnum dexSortByEnum, SortOrder sortOrder) {
            this.AEQbTJ = flow;
            this.EZpvd = c41503qrz;
            this.KWHzl = dexSortByEnum;
            this.OLrzqt = sortOrder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC41655qus>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.EZpvd, this.KWHzl, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41503qrz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41454qrC c41454qrC, @NotNull C41423qqY c41423qqY, @NotNull C41452qrA c41452qrA) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41454qrC, "");
        Intrinsics.checkNotNullParameter(c41423qqY, "");
        Intrinsics.checkNotNullParameter(c41452qrA, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c41454qrC;
        this.KWHzl = c41423qqY;
        this.EZpvd = c41452qrA;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qrH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41503qrz.KWHzl();
            }
        });
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41455qrD) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex KWHzl() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    private final Mutex copydefault() {
        return (Mutex) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.qrD] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41455qrD c41455qrD, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) {
        SubscribeDexVosUseCase$invoke$1 subscribeDexVosUseCase$invoke$1;
        C41503qrz c41503qrz;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SubscribeDexVosUseCase$invoke$1) {
            subscribeDexVosUseCase$invoke$1 = (SubscribeDexVosUseCase$invoke$1) continuation;
            int i = subscribeDexVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeDexVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeDexVosUseCase$invoke$1 = new SubscribeDexVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeDexVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeDexVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexCopydefault = copydefault();
                subscribeDexVosUseCase$invoke$1.L$0 = this;
                subscribeDexVosUseCase$invoke$1.L$1 = c41455qrD;
                subscribeDexVosUseCase$invoke$1.L$2 = mutexCopydefault;
                subscribeDexVosUseCase$invoke$1.label = 1;
                if (mutexCopydefault.lock(null, subscribeDexVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41503qrz = this;
                r2 = c41455qrD;
                mutex = mutexCopydefault;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) subscribeDexVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41455qrD = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) subscribeDexVosUseCase$invoke$1.L$2;
                C41455qrD c41455qrD2 = (C41455qrD) subscribeDexVosUseCase$invoke$1.L$1;
                c41503qrz = (C41503qrz) subscribeDexVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41455qrD2;
                mutex = mutex3;
            }
            subscribeDexVosUseCase$invoke$1.L$0 = mutex;
            subscribeDexVosUseCase$invoke$1.L$1 = null;
            subscribeDexVosUseCase$invoke$1.L$2 = null;
            subscribeDexVosUseCase$invoke$1.label = 2;
            objEZpvd = InterfaceC49404uns.Activity.EZpvd(c41503qrz, r2, subscribeDexVosUseCase$invoke$1);
            c41455qrD = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            c41455qrD.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41455qrD c41455qrD, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        SubscribeDexVosUseCase$onExecute$1 subscribeDexVosUseCase$onExecute$1;
        java.util.List<InterfaceC41655qus> listAEQbTJ;
        DexSortByEnum dexSortByEnumKWHzl;
        SortOrder sortOrderCopydefault;
        DexPeriodEnum dexPeriodEnumOLrzqt;
        Flow flowFlowOf;
        C41503qrz c41503qrz;
        java.util.List<InterfaceC41655qus> list;
        SortOrder sortOrder;
        DexPeriodEnum dexPeriodEnum;
        if (continuation instanceof SubscribeDexVosUseCase$onExecute$1) {
            subscribeDexVosUseCase$onExecute$1 = (SubscribeDexVosUseCase$onExecute$1) continuation;
            int i = subscribeDexVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeDexVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeDexVosUseCase$onExecute$1 = new SubscribeDexVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeDexVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeDexVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            listAEQbTJ = c41455qrD.AEQbTJ();
            dexSortByEnumKWHzl = c41455qrD.KWHzl();
            sortOrderCopydefault = c41455qrD.copydefault();
            dexPeriodEnumOLrzqt = c41455qrD.OLrzqt();
            boolean zEZpvd = c41455qrD.EZpvd();
            C41434qqj.KWHzl.KWHzl("SubscribeDexVosUseCase", "subscribe dex vos, [input: " + c41455qrD + "]");
            if (listAEQbTJ.isEmpty()) {
                return FlowKt.flowOf(yDY.AhwBna());
            }
            kotlin.Pair pair = new kotlin.Pair(listAEQbTJ, dexPeriodEnumOLrzqt);
            if (zEZpvd) {
                C41454qrC c41454qrC = this.copydefault;
                subscribeDexVosUseCase$onExecute$1.L$0 = this;
                subscribeDexVosUseCase$onExecute$1.L$1 = listAEQbTJ;
                subscribeDexVosUseCase$onExecute$1.L$2 = dexSortByEnumKWHzl;
                subscribeDexVosUseCase$onExecute$1.L$3 = sortOrderCopydefault;
                subscribeDexVosUseCase$onExecute$1.L$4 = dexPeriodEnumOLrzqt;
                subscribeDexVosUseCase$onExecute$1.label = 1;
                java.lang.Object objOLrzqt = c41454qrC.OLrzqt((java.lang.Object) pair, (Continuation) subscribeDexVosUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c41503qrz = this;
                list = listAEQbTJ;
                sortOrder = sortOrderCopydefault;
                obj = objOLrzqt;
                dexPeriodEnum = dexPeriodEnumOLrzqt;
            } else {
                flowFlowOf = FlowKt.flowOf(new TwoKeyMap());
                c41503qrz = this;
                return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.conflate(new TaskDescription(FlowKt.flowCombine(FlowKt.flowOf(listAEQbTJ), flowFlowOf, new SubscribeDexVosUseCase$onExecute$combinedFlow$1(c41503qrz, dexPeriodEnumOLrzqt, null)), c41503qrz, dexSortByEnumKWHzl, sortOrderCopydefault)), new SubscribeDexVosUseCase$onExecute$combinedFlow$3(null)), c41503qrz.AEQbTJ);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dexPeriodEnum = (DexPeriodEnum) subscribeDexVosUseCase$onExecute$1.L$4;
            sortOrder = (SortOrder) subscribeDexVosUseCase$onExecute$1.L$3;
            dexSortByEnumKWHzl = (DexSortByEnum) subscribeDexVosUseCase$onExecute$1.L$2;
            list = (java.util.List) subscribeDexVosUseCase$onExecute$1.L$1;
            c41503qrz = (C41503qrz) subscribeDexVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        dexPeriodEnumOLrzqt = dexPeriodEnum;
        flowFlowOf = (Flow) obj;
        sortOrderCopydefault = sortOrder;
        listAEQbTJ = list;
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.conflate(new TaskDescription(FlowKt.flowCombine(FlowKt.flowOf(listAEQbTJ), flowFlowOf, new SubscribeDexVosUseCase$onExecute$combinedFlow$1(c41503qrz, dexPeriodEnumOLrzqt, null)), c41503qrz, dexSortByEnumKWHzl, sortOrderCopydefault)), new SubscribeDexVosUseCase$onExecute$combinedFlow$3(null)), c41503qrz.AEQbTJ);
    }
}
