package com.okinc.oklive.app.manager;

import com.okinc.im.config.page.ServiceName;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveStreamCustomMessageManager$startListening$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ Function1<OKMessage, Unit> $onMessageReceived;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LiveStreamCustomMessageManager$startListening$1(String str, Function1<? super OKMessage, Unit> function1, Continuation<? super LiveStreamCustomMessageManager$startListening$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$onMessageReceived = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveStreamCustomMessageManager$startListening$1(this.$channelId, this.$onMessageReceived, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveStreamCustomMessageManager$startListening$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<OKMessage> {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.oklive.app.manager.LiveStreamCustomMessageManager$startListening$1$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ String OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, String str) {
                this.copydefault = flowCollector;
                this.OLrzqt = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                LiveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1 liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof LiveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (LiveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i = liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new LiveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                Object obj2 = liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    OKMessage oKMessage = (OKMessage) obj;
                    OKMessageContent content = oKMessage.getContent();
                    if (content instanceof OKCustomMessage) {
                        OKCustomMessage oKCustomMessage = (OKCustomMessage) content;
                        pUU.EZpvd("LiveStreamCustomMessageManager", "Received custom message for channel " + this.OLrzqt + ": serviceName=" + oKCustomMessage.getServiceName() + ", bizName=" + oKCustomMessage.getBizName());
                    } else {
                        oKMessage = null;
                    }
                    if (oKMessage != null) {
                        liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(oKMessage, liveStreamCustomMessageManager$startListening$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        public StateListAnimator(Flow flow, String str) {
            this.EZpvd = flow;
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super OKMessage> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            Flow<OKMessage> flowOLrzqt = interfaceC35180nqU != null ? interfaceC35180nqU.OLrzqt(this.$channelId, ServiceName.LIVE_STREAM) : null;
            if (flowOLrzqt != null) {
                StateListAnimator stateListAnimator = new StateListAnimator(flowOLrzqt, this.$channelId);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onMessageReceived, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateListAnimator, anonymousClass2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.oklive.app.manager.LiveStreamCustomMessageManager$startListening$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<OKMessage, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<OKMessage, Unit> $onMessageReceived;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super OKMessage, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onMessageReceived = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onMessageReceived, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OKMessage oKMessage, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(oKMessage, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.oklive.app.manager.LiveStreamCustomMessageManager$startListening$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OKMessage $message;
            final /* synthetic */ Function1<OKMessage, Unit> $onMessageReceived;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function1<? super OKMessage, Unit> function1, OKMessage oKMessage, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$onMessageReceived = function1;
                this.$message = oKMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$onMessageReceived, this.$message, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    try {
                        this.$onMessageReceived.invoke(this.$message);
                    } catch (Exception e) {
                        pUU.AEQbTJ("LiveStreamCustomMessageManager", "Error handling custom message", e);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                OKMessage oKMessage = (OKMessage) this.L$0;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onMessageReceived, oKMessage, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
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
    }
}
