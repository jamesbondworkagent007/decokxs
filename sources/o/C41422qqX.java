package o;

import com.okinc.market.quotation.domain.coin.SubscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinVosWithWatchingUseCase$onExecute$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinVosWithWatchingUseCase$onExecute$resultFlow$1;
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

/* JADX INFO: renamed from: o.qqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41422qqX implements InterfaceC49404uns<C41418qqT, Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>> {
    private static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final C41419qqU EZpvd;
    public final C40488qXs OLrzqt;

    @yCM
    public C41422qqX(@NotNull C41419qqU c41419qqU, @NotNull C40488qXs c40488qXs) {
        Intrinsics.checkNotNullParameter(c41419qqU, "");
        Intrinsics.checkNotNullParameter(c40488qXs, "");
        this.EZpvd = c41419qqU;
        this.OLrzqt = c40488qXs;
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
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C41418qqT) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull C41418qqT c41418qqT, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c41418qqT, continuation);
    }

    /* JADX INFO: renamed from: o.qqX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qqX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41418qqT c41418qqT, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>> continuation) throws java.lang.Throwable {
        SubscribeCoinVosWithWatchingUseCase$onExecute$1 subscribeCoinVosWithWatchingUseCase$onExecute$1;
        C41422qqX c41422qqX;
        Flow flow;
        if (continuation instanceof SubscribeCoinVosWithWatchingUseCase$onExecute$1) {
            subscribeCoinVosWithWatchingUseCase$onExecute$1 = (SubscribeCoinVosWithWatchingUseCase$onExecute$1) continuation;
            int i = subscribeCoinVosWithWatchingUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeCoinVosWithWatchingUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeCoinVosWithWatchingUseCase$onExecute$1 = new SubscribeCoinVosWithWatchingUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeCoinVosWithWatchingUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeCoinVosWithWatchingUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj.KWHzl.KWHzl("SubscribeCoinVosWithWatchingUseCase", "start subscribe vos with watching input = " + c41418qqT);
            C41419qqU c41419qqU = this.EZpvd;
            subscribeCoinVosWithWatchingUseCase$onExecute$1.L$0 = this;
            subscribeCoinVosWithWatchingUseCase$onExecute$1.label = 1;
            objEZpvd = c41419qqU.EZpvd(c41418qqT, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>>) subscribeCoinVosWithWatchingUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41422qqX = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (Flow) subscribeCoinVosWithWatchingUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return FlowKt.combine(flow, new ActionBar((Flow) objEZpvd), new SubscribeCoinVosWithWatchingUseCase$onExecute$resultFlow$1(null));
            }
            c41422qqX = (C41422qqX) subscribeCoinVosWithWatchingUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Flow flow2 = (Flow) objEZpvd;
        C40488qXs c40488qXs = c41422qqX.OLrzqt;
        subscribeCoinVosWithWatchingUseCase$onExecute$1.L$0 = flow2;
        subscribeCoinVosWithWatchingUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c40488qXs.EZpvd("CRYPTO", subscribeCoinVosWithWatchingUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        objEZpvd = objEZpvd2;
        flow = flow2;
        return FlowKt.combine(flow, new ActionBar((Flow) objEZpvd), new SubscribeCoinVosWithWatchingUseCase$onExecute$resultFlow$1(null));
    }

    /* JADX INFO: renamed from: o.qqX$ActionBar */
    public static final class ActionBar implements Flow<java.util.Map<java.lang.String, ? extends BizInstrument>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qqX$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.lang.Object obj3 = ((java.util.Map) obj).get("COIN");
                    subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(obj3, subscribeCoinVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
