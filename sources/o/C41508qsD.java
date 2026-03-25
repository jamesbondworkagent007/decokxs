package o;

import com.okinc.market.quotation.domain.options.SubscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsVosWithWatchingUseCase$onExecute$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsVosWithWatchingUseCase$onExecute$resultFlow$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41508qsD implements InterfaceC49404uns<C41507qsC, Flow<? extends java.util.List<? extends InterfaceC41642quf>>> {
    private static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final C41509qsE AEQbTJ;
    public final C40488qXs copydefault;

    @yCM
    public C41508qsD(@NotNull C41509qsE c41509qsE, @NotNull C40488qXs c40488qXs) {
        Intrinsics.checkNotNullParameter(c41509qsE, "");
        Intrinsics.checkNotNullParameter(c40488qXs, "");
        this.AEQbTJ = c41509qsE;
        this.copydefault = c40488qXs;
    }

    public /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C41507qsC) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41642quf>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    public java.lang.Object EZpvd(@NotNull C41507qsC c41507qsC, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41642quf>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c41507qsC, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qsD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41507qsC c41507qsC, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41642quf>>> continuation) throws java.lang.Throwable {
        SubscribeOptionsVosWithWatchingUseCase$onExecute$1 subscribeOptionsVosWithWatchingUseCase$onExecute$1;
        C41508qsD c41508qsD;
        Flow flow;
        if (continuation instanceof SubscribeOptionsVosWithWatchingUseCase$onExecute$1) {
            subscribeOptionsVosWithWatchingUseCase$onExecute$1 = (SubscribeOptionsVosWithWatchingUseCase$onExecute$1) continuation;
            int i = subscribeOptionsVosWithWatchingUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeOptionsVosWithWatchingUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeOptionsVosWithWatchingUseCase$onExecute$1 = new SubscribeOptionsVosWithWatchingUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeOptionsVosWithWatchingUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeOptionsVosWithWatchingUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj.KWHzl.KWHzl("SubscribeOptionsVosWithWatchingUseCase", "subscribe options vos with watching [input = " + c41507qsC + "]");
            C41509qsE c41509qsE = this.AEQbTJ;
            subscribeOptionsVosWithWatchingUseCase$onExecute$1.L$0 = this;
            subscribeOptionsVosWithWatchingUseCase$onExecute$1.label = 1;
            objEZpvd = c41509qsE.EZpvd(c41507qsC, subscribeOptionsVosWithWatchingUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41508qsD = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (Flow) subscribeOptionsVosWithWatchingUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return FlowKt.combine(flow, new TaskDescription((Flow) objEZpvd), new SubscribeOptionsVosWithWatchingUseCase$onExecute$resultFlow$1(null));
            }
            c41508qsD = (C41508qsD) subscribeOptionsVosWithWatchingUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Flow flow2 = (Flow) objEZpvd;
        C40488qXs c40488qXs = c41508qsD.copydefault;
        subscribeOptionsVosWithWatchingUseCase$onExecute$1.L$0 = flow2;
        subscribeOptionsVosWithWatchingUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c40488qXs.EZpvd("OPTIONS", subscribeOptionsVosWithWatchingUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        objEZpvd = objEZpvd2;
        flow = flow2;
        return FlowKt.combine(flow, new TaskDescription((Flow) objEZpvd), new SubscribeOptionsVosWithWatchingUseCase$onExecute$resultFlow$1(null));
    }

    /* JADX INFO: renamed from: o.qsD$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.Map<java.lang.String, ? extends BizInstrument>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qsD$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Object obj3 = ((java.util.Map) obj).get("OPTION");
                    subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(obj3, subscribeOptionsVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
