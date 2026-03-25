package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.quotation.domain.stock.SubscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1;
import com.okinc.market.quotation.domain.stock.SubscribeStockTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.stock.SubscribeStockTickersUseCase$onExecute$3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41608qty implements InterfaceC49404uns<Unit, Flow<? extends StockListPo>> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final long OLrzqt = C38364pWa.KWHzl.OLrzqt();
    public final CoroutineDispatcher AEQbTJ;
    public final C40419qVd copydefault;

    @yCM
    public C41608qty(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40419qVd c40419qVd) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40419qVd, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c40419qVd;
    }

    public /* synthetic */ java.lang.Object EZpvd(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super Flow<StockListPo>>) continuation);
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

    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super Flow<StockListPo>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, unit, continuation);
    }

    /* JADX INFO: renamed from: o.qty$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qty.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super Flow<StockListPo>> continuation) throws java.lang.Throwable {
        SubscribeStockTickersUseCase$onExecute$1 subscribeStockTickersUseCase$onExecute$1;
        C41608qty c41608qty;
        if (continuation instanceof SubscribeStockTickersUseCase$onExecute$1) {
            subscribeStockTickersUseCase$onExecute$1 = (SubscribeStockTickersUseCase$onExecute$1) continuation;
            int i = subscribeStockTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeStockTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeStockTickersUseCase$onExecute$1 = new SubscribeStockTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = subscribeStockTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = subscribeStockTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C41434qqj.KWHzl.KWHzl("SubscribeStockTickersUseCase", "Starting stock ticker subscription");
            C40419qVd c40419qVd = this.copydefault;
            subscribeStockTickersUseCase$onExecute$1.L$0 = this;
            subscribeStockTickersUseCase$onExecute$1.label = 1;
            objCopydefault = c40419qVd.copydefault(subscribeStockTickersUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41608qty = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41608qty = (C41608qty) subscribeStockTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.sample(new StateListAnimator((Flow) objCopydefault), OLrzqt), new SubscribeStockTickersUseCase$onExecute$3(null)), c41608qty.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.qty$StateListAnimator */
    public static final class StateListAnimator implements Flow<StockListPo> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qty$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1 subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SubscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1) {
                    subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1 = (SubscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1) continuation;
                    int i = subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1 = new SubscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((java.util.List) obj);
                    if (objFirstOrNull != null) {
                        subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(objFirstOrNull, subscribeStockTickersUseCase$onExecute$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        public StateListAnimator(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super StockListPo> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
