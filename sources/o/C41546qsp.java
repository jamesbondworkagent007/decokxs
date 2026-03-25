package o;

import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosWithWatchingUseCase$onExecute$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosWithWatchingUseCase$onExecute$resultFlow$1;
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

/* JADX INFO: renamed from: o.qsp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41546qsp implements InterfaceC49404uns<C41540qsj, Flow<? extends java.util.List<? extends InterfaceC41638qub>>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C40488qXs AEQbTJ;
    public final C41542qsl EZpvd;

    @yCM
    public C41546qsp(@NotNull C41542qsl c41542qsl, @NotNull C40488qXs c40488qXs) {
        Intrinsics.checkNotNullParameter(c41542qsl, "");
        Intrinsics.checkNotNullParameter(c40488qXs, "");
        this.EZpvd = c41542qsl;
        this.AEQbTJ = c40488qXs;
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

    public java.lang.Object KWHzl(@NotNull C41540qsj c41540qsj, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c41540qsj, continuation);
    }

    public /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41540qsj) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>>) continuation);
    }

    /* JADX INFO: renamed from: o.qsp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsp.TaskDescription.<init>():void type: THIS */
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
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41540qsj c41540qsj, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesVosWithWatchingUseCase$onExecute$1 subscribeFuturesVosWithWatchingUseCase$onExecute$1;
        C41546qsp c41546qsp;
        Flow flow;
        if (continuation instanceof SubscribeFuturesVosWithWatchingUseCase$onExecute$1) {
            subscribeFuturesVosWithWatchingUseCase$onExecute$1 = (SubscribeFuturesVosWithWatchingUseCase$onExecute$1) continuation;
            int i = subscribeFuturesVosWithWatchingUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesVosWithWatchingUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesVosWithWatchingUseCase$onExecute$1 = new SubscribeFuturesVosWithWatchingUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeFuturesVosWithWatchingUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesVosWithWatchingUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj.KWHzl.KWHzl("SubscribeFuturesVosWithWatchingUseCase", "subscribe futures vos with watching [input = " + c41540qsj + "]");
            C41542qsl c41542qsl = this.EZpvd;
            subscribeFuturesVosWithWatchingUseCase$onExecute$1.L$0 = this;
            subscribeFuturesVosWithWatchingUseCase$onExecute$1.label = 1;
            objEZpvd = c41542qsl.EZpvd(c41540qsj, subscribeFuturesVosWithWatchingUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41546qsp = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (Flow) subscribeFuturesVosWithWatchingUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return FlowKt.combine(flow, new StateListAnimator((Flow) objEZpvd), new SubscribeFuturesVosWithWatchingUseCase$onExecute$resultFlow$1(null));
            }
            c41546qsp = (C41546qsp) subscribeFuturesVosWithWatchingUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Flow flow2 = (Flow) objEZpvd;
        C40488qXs c40488qXs = c41546qsp.AEQbTJ;
        subscribeFuturesVosWithWatchingUseCase$onExecute$1.L$0 = flow2;
        subscribeFuturesVosWithWatchingUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c40488qXs.EZpvd("FUTURES", subscribeFuturesVosWithWatchingUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        objEZpvd = objEZpvd2;
        flow = flow2;
        return FlowKt.combine(flow, new StateListAnimator((Flow) objEZpvd), new SubscribeFuturesVosWithWatchingUseCase$onExecute$resultFlow$1(null));
    }

    /* JADX INFO: renamed from: o.qsp$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.Map<java.lang.String, ? extends BizInstrument>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qsp$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.Map map = (java.util.Map) obj;
                    java.util.Map mapKWHzl = (java.util.Map) map.get("SWAP");
                    if (mapKWHzl == null) {
                        mapKWHzl = C56424yEw.KWHzl();
                    }
                    java.util.Map mapKWHzl2 = (java.util.Map) map.get("FUTURES");
                    if (mapKWHzl2 == null) {
                        mapKWHzl2 = C56424yEw.KWHzl();
                    }
                    java.util.Map mapOLrzqt = C56424yEw.OLrzqt(mapKWHzl, mapKWHzl2);
                    subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapOLrzqt, subscribeFuturesVosWithWatchingUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
