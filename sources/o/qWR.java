package o;

import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.market.watch.usecase.GetAndSubscribeDexWatchListUseCase$invoke$1;
import com.okinc.market.watch.usecase.GetAndSubscribeDexWatchListUseCase$onExecute$$inlined$flatMapLatest$1;
import com.okinc.market.watch.usecase.GetAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1;
import com.okinc.market.watch.usecase.GetAndSubscribeDexWatchListUseCase$processDexData$1;
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

/* JADX INFO: loaded from: classes9.dex */
public final class qWR implements InterfaceC49404uns<Flow<? extends java.util.List<? extends qWH>>, Flow<? extends java.util.List<? extends qWH>>> {
    public final InterfaceC56387yDm EZpvd;
    public final C41503qrz KWHzl;
    public final C41492qro OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public qWR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41492qro c41492qro, @NotNull C41503qrz c41503qrz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41492qro, "");
        Intrinsics.checkNotNullParameter(c41503qrz, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = c41492qro;
        this.KWHzl = c41503qrz;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qWR.copydefault();
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

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    private final Mutex KWHzl() {
        return (Mutex) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex copydefault() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.Flow<? extends java.util.List<? extends o.qWH>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Flow<? extends java.util.List<? extends qWH>> flow, @NotNull Continuation<? super Flow<? extends java.util.List<? extends qWH>>> continuation) {
        GetAndSubscribeDexWatchListUseCase$invoke$1 getAndSubscribeDexWatchListUseCase$invoke$1;
        qWR qwr;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetAndSubscribeDexWatchListUseCase$invoke$1) {
            getAndSubscribeDexWatchListUseCase$invoke$1 = (GetAndSubscribeDexWatchListUseCase$invoke$1) continuation;
            int i = getAndSubscribeDexWatchListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAndSubscribeDexWatchListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAndSubscribeDexWatchListUseCase$invoke$1 = new GetAndSubscribeDexWatchListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAndSubscribeDexWatchListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAndSubscribeDexWatchListUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexKWHzl = KWHzl();
                getAndSubscribeDexWatchListUseCase$invoke$1.L$0 = this;
                getAndSubscribeDexWatchListUseCase$invoke$1.L$1 = flow;
                getAndSubscribeDexWatchListUseCase$invoke$1.L$2 = mutexKWHzl;
                getAndSubscribeDexWatchListUseCase$invoke$1.label = 1;
                if (mutexKWHzl.lock(null, getAndSubscribeDexWatchListUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                qwr = this;
                r2 = flow;
                mutex = mutexKWHzl;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getAndSubscribeDexWatchListUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    flow = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getAndSubscribeDexWatchListUseCase$invoke$1.L$2;
                Flow flow2 = (Flow) getAndSubscribeDexWatchListUseCase$invoke$1.L$1;
                qwr = (qWR) getAndSubscribeDexWatchListUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = flow2;
                mutex = mutex3;
            }
            getAndSubscribeDexWatchListUseCase$invoke$1.L$0 = mutex;
            getAndSubscribeDexWatchListUseCase$invoke$1.L$1 = null;
            getAndSubscribeDexWatchListUseCase$invoke$1.L$2 = null;
            getAndSubscribeDexWatchListUseCase$invoke$1.label = 2;
            objEZpvd = InterfaceC49404uns.Activity.EZpvd(qwr, r2, getAndSubscribeDexWatchListUseCase$invoke$1);
            flow = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            flow.unlock(null);
        }
    }

    public static final class TaskDescription implements Flow<java.util.List<? extends qWG>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qWR$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                GetAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1 getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1;
                if (continuation instanceof GetAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1) {
                    getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1 = (GetAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1) continuation;
                    int i = getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1 = new GetAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (InterfaceC41655qus interfaceC41655qus : (java.util.List) obj) {
                        qWG qwgOLrzqt = interfaceC41655qus instanceof qWK ? qWG.Companion.OLrzqt((qWK) interfaceC41655qus) : null;
                        if (qwgOLrzqt != null) {
                            arrayList.add(qwgOLrzqt);
                        }
                    }
                    getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, getAndSubscribeDexWatchListUseCase$processDexData$$inlined$map$1$2$1) == objCopydefault) {
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
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends qWG>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.List<qWG> list, Continuation<? super Flow<? extends java.util.List<? extends qWH>>> continuation) throws java.lang.Throwable {
        GetAndSubscribeDexWatchListUseCase$processDexData$1 getAndSubscribeDexWatchListUseCase$processDexData$1;
        qWR qwr;
        java.util.List list2;
        if (continuation instanceof GetAndSubscribeDexWatchListUseCase$processDexData$1) {
            getAndSubscribeDexWatchListUseCase$processDexData$1 = (GetAndSubscribeDexWatchListUseCase$processDexData$1) continuation;
            int i = getAndSubscribeDexWatchListUseCase$processDexData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAndSubscribeDexWatchListUseCase$processDexData$1.label = i - Integer.MIN_VALUE;
            } else {
                getAndSubscribeDexWatchListUseCase$processDexData$1 = new GetAndSubscribeDexWatchListUseCase$processDexData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAndSubscribeDexWatchListUseCase$processDexData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAndSubscribeDexWatchListUseCase$processDexData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((qWG) it.next()).KWHzl());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((qWG) it2.next()).copydefault());
            }
            C41490qrm c41490qrm = new C41490qrm(arrayList, qWG.Companion.copydefault());
            C41492qro c41492qro = this.OLrzqt;
            getAndSubscribeDexWatchListUseCase$processDexData$1.L$0 = this;
            getAndSubscribeDexWatchListUseCase$processDexData$1.L$1 = arrayList2;
            getAndSubscribeDexWatchListUseCase$processDexData$1.label = 1;
            objEZpvd = c41492qro.EZpvd(c41490qrm, getAndSubscribeDexWatchListUseCase$processDexData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            qwr = this;
            list2 = arrayList2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return new TaskDescription((Flow) objEZpvd);
            }
            list2 = (java.util.List) getAndSubscribeDexWatchListUseCase$processDexData$1.L$1;
            qwr = (qWR) getAndSubscribeDexWatchListUseCase$processDexData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list3 = (java.util.List) objEZpvd;
        C41455qrD c41455qrD = new C41455qrD(list3.isEmpty() ? list2 : list3, DexSortByEnum.NONE, SortOrder.NONE, DexPeriodEnum.ONE_DAY, false, 16, null);
        C41503qrz c41503qrz = qwr.KWHzl;
        getAndSubscribeDexWatchListUseCase$processDexData$1.L$0 = null;
        getAndSubscribeDexWatchListUseCase$processDexData$1.L$1 = null;
        getAndSubscribeDexWatchListUseCase$processDexData$1.label = 2;
        objEZpvd = c41503qrz.EZpvd(c41455qrD, getAndSubscribeDexWatchListUseCase$processDexData$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        return new TaskDescription((Flow) objEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Flow<? extends java.util.List<? extends qWH>> flow, @NotNull Continuation<? super Flow<? extends java.util.List<? extends qWH>>> continuation) {
        return FlowKt.transformLatest(flow, new GetAndSubscribeDexWatchListUseCase$onExecute$$inlined$flatMapLatest$1(null, this));
    }
}
