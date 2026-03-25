package o;

import com.okinc.market.ticker.usecase.WatchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40434qVs implements InterfaceC49405unt<Flow<? extends java.util.List<? extends qWH>>, Flow<? extends java.util.List<? extends TickersData>>> {
    public final C40423qVh EZpvd;

    @yCM
    public C40434qVs(@NotNull C40423qVh c40423qVh) {
        Intrinsics.checkNotNullParameter(c40423qVh, "");
        this.EZpvd = c40423qVh;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Flow<java.util.List<TickersData>> KWHzl(@NotNull Flow<? extends java.util.List<? extends qWH>> flow) {
        return (Flow) InterfaceC49405unt.Activity.EZpvd(this, flow);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Flow<java.util.List<TickersData>> AEQbTJ(@NotNull Flow<? extends java.util.List<? extends qWH>> flow) {
        Intrinsics.checkNotNullParameter(flow, "");
        return this.EZpvd.AEQbTJ(new Activity(flow));
    }

    /* JADX INFO: renamed from: o.qVs$Activity */
    public static final class Activity implements Flow<java.util.List<? extends BizInstrument>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qVs$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1 watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof WatchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1) {
                    watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1 = (WatchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1) continuation;
                    int i = watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1 = new WatchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.ArrayList<qWC> arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (t instanceof qWC) {
                            arrayList.add(t);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (qWC qwc : arrayList) {
                        if (!(!Intrinsics.EZpvd((java.lang.Object) qwc.AhwBna(), (java.lang.Object) "CEDEFI"))) {
                            qwc = null;
                        }
                        BizInstrument bizInstrumentCopydefault = qwc != null ? qwc.copydefault() : null;
                        if (bizInstrumentCopydefault != null) {
                            arrayList2.add(bizInstrumentCopydefault);
                        }
                    }
                    watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList2, watchListDataSubscribeUseCaseV2$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
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
