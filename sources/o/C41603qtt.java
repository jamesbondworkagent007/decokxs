package o;

import com.okinc.market.quotation.domain.spot.SubscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosWithWatchingUseCase$onExecute$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosWithWatchingUseCase$onExecute$resultFlow$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41603qtt implements InterfaceC49404uns<C41597qtn, Flow<? extends java.util.List<? extends InterfaceC41641que>>> {
    public static final int KWHzl = 8;
    public final C41596qtm EZpvd;
    public final C40488qXs OLrzqt;

    @yCM
    public C41603qtt(@NotNull C41596qtm c41596qtm, @NotNull C40488qXs c40488qXs) {
        Intrinsics.checkNotNullParameter(c41596qtm, "");
        Intrinsics.checkNotNullParameter(c40488qXs, "");
        this.EZpvd = c41596qtm;
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
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41597qtn) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull C41597qtn c41597qtn, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c41597qtn, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41597qtn c41597qtn, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>> continuation) throws java.lang.Throwable {
        SubscribeSpotVosWithWatchingUseCase$onExecute$1 subscribeSpotVosWithWatchingUseCase$onExecute$1;
        C41603qtt c41603qtt;
        Flow flow;
        if (continuation instanceof SubscribeSpotVosWithWatchingUseCase$onExecute$1) {
            subscribeSpotVosWithWatchingUseCase$onExecute$1 = (SubscribeSpotVosWithWatchingUseCase$onExecute$1) continuation;
            int i = subscribeSpotVosWithWatchingUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotVosWithWatchingUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotVosWithWatchingUseCase$onExecute$1 = new SubscribeSpotVosWithWatchingUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeSpotVosWithWatchingUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotVosWithWatchingUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj.KWHzl.KWHzl("SubscribeSpotVosWithWatchingUseCase", "start subscribe spot vos with watching, input=" + c41597qtn);
            C41596qtm c41596qtm = this.EZpvd;
            subscribeSpotVosWithWatchingUseCase$onExecute$1.L$0 = this;
            subscribeSpotVosWithWatchingUseCase$onExecute$1.label = 1;
            objEZpvd = c41596qtm.EZpvd(c41597qtn, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>>) subscribeSpotVosWithWatchingUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41603qtt = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (Flow) subscribeSpotVosWithWatchingUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return FlowKt.combine(flow, new ActionBar((Flow) objEZpvd), new SubscribeSpotVosWithWatchingUseCase$onExecute$resultFlow$1(null));
            }
            c41603qtt = (C41603qtt) subscribeSpotVosWithWatchingUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Flow flow2 = (Flow) objEZpvd;
        C40488qXs c40488qXs = c41603qtt.OLrzqt;
        subscribeSpotVosWithWatchingUseCase$onExecute$1.L$0 = flow2;
        subscribeSpotVosWithWatchingUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c40488qXs.EZpvd("SPOT", subscribeSpotVosWithWatchingUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        objEZpvd = objEZpvd2;
        flow = flow2;
        return FlowKt.combine(flow, new ActionBar((Flow) objEZpvd), new SubscribeSpotVosWithWatchingUseCase$onExecute$resultFlow$1(null));
    }

    /* JADX INFO: renamed from: o.qtt$ActionBar */
    public static final class ActionBar implements Flow<java.util.Map<java.lang.String, ? extends BizInstrument>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qtt$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.lang.Object obj3 = ((java.util.Map) obj).get("SPOT");
                    subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(obj3, subscribeSpotVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
