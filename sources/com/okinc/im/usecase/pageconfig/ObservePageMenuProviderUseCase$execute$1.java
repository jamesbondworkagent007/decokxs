package com.okinc.im.usecase.pageconfig;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import o.C36550odA;
import o.C56391yDq;
import o.C56442yFn;
import o.oFO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePageMenuProviderUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super C36550odA>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oFO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservePageMenuProviderUseCase$execute$1(oFO ofo, String str, Continuation<? super ObservePageMenuProviderUseCase$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = ofo;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObservePageMenuProviderUseCase$execute$1 observePageMenuProviderUseCase$execute$1 = new ObservePageMenuProviderUseCase$execute$1(this.this$0, this.$channelId, continuation);
        observePageMenuProviderUseCase$execute$1.L$0 = obj;
        return observePageMenuProviderUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C36550odA> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObservePageMenuProviderUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<OKConversation> flowKWHzl = this.this$0.KWHzl.KWHzl(this.$channelId);
            Flow flowCombine = FlowKt.combine(flowKWHzl, FlowKt__MergeKt.flattenMerge$default(new Application(flowKWHzl, this.this$0, this.$channelId), 0, 1, null), FlowKt.flowOf(new C36550odA()), new ObservePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1(null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowCombine, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Flow<Flow<? extends GroupInfo>> {
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ oFO OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.im.usecase.pageconfig.ObservePageMenuProviderUseCase$execute$1$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ String EZpvd;
            public final /* synthetic */ oFO OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, oFO ofo, String str) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = ofo;
                this.EZpvd = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ObservePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1 observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1;
                Flow<GroupInfo> flowFlowOf;
                if (continuation instanceof ObservePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1) {
                    observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1 = (ObservePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1 = new ObservePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    OKConversation oKConversation = (OKConversation) obj;
                    if ((oKConversation != null ? oKConversation.getConversationType() : null) == OKConversationType.GROUP) {
                        flowFlowOf = this.OLrzqt.OLrzqt.AEQbTJ(this.EZpvd);
                    } else {
                        flowFlowOf = FlowKt.flowOf((Object) null);
                    }
                    observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(flowFlowOf, observePageMenuProviderUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, oFO ofo, String str) {
            this.copydefault = flow;
            this.OLrzqt = ofo;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Flow<? extends GroupInfo>> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector, this.OLrzqt, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
