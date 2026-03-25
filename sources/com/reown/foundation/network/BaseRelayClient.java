package com.reown.foundation.network;

import com.reown.foundation.common.RelayMapperKt;
import com.reown.foundation.common.model.SubscriptionId;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.di.FoundationCommonModuleKt;
import com.reown.foundation.network.ConnectionState;
import com.reown.foundation.network.data.service.RelayService;
import com.reown.foundation.network.model.Relay;
import com.reown.foundation.network.model.RelayDTO;
import com.reown.foundation.util.Logger;
import com.reown.foundation.util.ScopeKt;
import com.reown.util.UtilFunctionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C60018ztu;
import o.InterfaceC56387yDm;
import o.InterfaceC58092yuk;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseRelayClient implements RelayInterface {

    @Deprecated
    public static final long CONNECTION_TIMEOUT = 15000;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_RETRIES = 3;

    @Deprecated
    public static final int REPLAY = 1;

    @Deprecated
    public static final long RESULT_TIMEOUT = 60000;
    public ConnectionLifecycle connectionLifecycle;
    private final InterfaceC56387yDm eventsFlow$delegate;
    private boolean isConnecting;
    private boolean isLoggingEnabled;
    private Logger logger;
    public RelayService relayService;
    private int retryCount;
    private final InterfaceC56387yDm subscriptionRequest$delegate;
    private C60018ztu foundationKoinApp = C60018ztu.OLrzqt.AEQbTJ();
    private final MutableSharedFlow<RelayDTO> resultState = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    private MutableStateFlow<ConnectionState> connectionState = StateFlowKt.MutableStateFlow(ConnectionState.Idle.INSTANCE);
    private List<String> unAckedTopics = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void reset() {
        this.isConnecting = false;
        this.retryCount = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<ConnectionState> getConnectionState$foundation() {
        return this.connectionState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Logger getLogger() {
        return this.logger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.foundation.network.RelayInterface
    public boolean isLoggingEnabled() {
        return this.isLoggingEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnectionLifecycle(@NotNull ConnectionLifecycle connectionLifecycle) {
        Intrinsics.checkNotNullParameter(connectionLifecycle, "");
        this.connectionLifecycle = connectionLifecycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnectionState$foundation(@NotNull MutableStateFlow<ConnectionState> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        this.connectionState = mutableStateFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogger(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "");
        this.logger = logger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.foundation.network.RelayInterface
    public void setLoggingEnabled(boolean z) {
        this.isLoggingEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRelayService(@NotNull RelayService relayService) {
        Intrinsics.checkNotNullParameter(relayService, "");
        this.relayService = relayService;
    }

    public BaseRelayClient() {
        this.foundationKoinApp.OLrzqt(FoundationCommonModuleKt.foundationCommonModule());
        this.logger = (Logger) this.foundationKoinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(Logger.class), null, null);
        this.eventsFlow$delegate = C56392yDr.copydefault(new Function0<SharedFlow<? extends Relay.Model.Event>>() { // from class: com.reown.foundation.network.BaseRelayClient$eventsFlow$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'kotlinx.coroutines.flow.SharedFlow<com.reown.foundation.network.model.Relay$Model$Event>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final SharedFlow<? extends Relay.Model.Event> invoke() {
                final Flow flowOnEach = FlowKt.onEach(this.this$0.getRelayService().observeWebSocketEvent(), new AnonymousClass1(this.this$0, null));
                final BaseRelayClient baseRelayClient = this.this$0;
                return FlowKt.shareIn(new Flow<Relay.Model.Event>() { // from class: com.reown.foundation.network.BaseRelayClient$eventsFlow$2$invoke$$inlined$map$1

                    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$eventsFlow$2$invoke$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 implements FlowCollector<InterfaceC58092yuk.Activity> {
                        final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                        final /* synthetic */ BaseRelayClient$eventsFlow$2$invoke$$inlined$map$1 this$0;

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$eventsFlow$2$invoke$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$eventsFlow$2$invoke$$inlined$map$1 baseRelayClient$eventsFlow$2$invoke$$inlined$map$1) {
                            this.$this_unsafeFlow$inlined = flowCollector;
                            this.this$0 = baseRelayClient$eventsFlow$2$invoke$$inlined$map$1;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public Object emit(InterfaceC58092yuk.Activity activity, @NotNull Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj = anonymousClass1.result;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                C56391yDq.AEQbTJ(obj);
                                FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                InterfaceC58092yuk.Activity activity2 = activity;
                                baseRelayClient.getLogger().log("Event: " + activity2);
                                Relay.Model.Event relayEvent = RelayMapperKt.toRelayEvent(activity2);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(relayEvent, anonymousClass1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(@NotNull FlowCollector<? super Relay.Model.Event> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowOnEach.collect(new AnonymousClass2(flowCollector, this), continuation);
                        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                    }
                }, ScopeKt.getScope(), SharingStarted.Companion.getLazily(), 1);
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$eventsFlow$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC58092yuk.Activity, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BaseRelayClient this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BaseRelayClient baseRelayClient, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = baseRelayClient;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull InterfaceC58092yuk.Activity activity, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        InterfaceC58092yuk.Activity activity = (InterfaceC58092yuk.Activity) this.L$0;
                        if (activity instanceof InterfaceC58092yuk.Activity.TaskDescription) {
                            this.this$0.getConnectionState$foundation().setValue(ConnectionState.Open.INSTANCE);
                        } else if ((activity instanceof InterfaceC58092yuk.Activity.Application) || (activity instanceof InterfaceC58092yuk.Activity.ActionBar)) {
                            this.this$0.getConnectionState$foundation().setValue(new ConnectionState.Closed(this.this$0.getError(activity)));
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        });
        this.subscriptionRequest$delegate = C56392yDr.copydefault(new Function0<Flow<? extends Relay.Model.Call.Subscription.Request>>() { // from class: com.reown.foundation.network.BaseRelayClient$subscriptionRequest$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$subscriptionRequest$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<Relay.Model.Call.Subscription.Request, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BaseRelayClient this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BaseRelayClient baseRelayClient, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = baseRelayClient;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull Relay.Model.Call.Subscription.Request request, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$subscriptionRequest$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Relay.Model.Call.Subscription.Request $relayRequest;
                    int label;
                    final /* synthetic */ BaseRelayClient this$0;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(BaseRelayClient baseRelayClient, Relay.Model.Call.Subscription.Request request, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = baseRelayClient;
                        this.$relayRequest = request;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$relayRequest, continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        C56442yFn.copydefault();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.publishSubscriptionAcknowledgement(this.$relayRequest.getId());
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Relay.Model.Call.Subscription.Request) this.L$0, null);
                        this.label = 1;
                        if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
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

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'kotlinx.coroutines.flow.Flow<com.reown.foundation.network.model.Relay$Model$Call$Subscription$Request>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final Flow<? extends Relay.Model.Call.Subscription.Request> invoke() {
                final Flow<RelayDTO.Subscription.Request> flowObserveSubscriptionRequest = this.this$0.getRelayService().observeSubscriptionRequest();
                return FlowKt.onEach(new Flow<Relay.Model.Call.Subscription.Request>() { // from class: com.reown.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1

                    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 implements FlowCollector<RelayDTO.Subscription.Request> {
                        final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                        final /* synthetic */ BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1 this$0;

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1 baseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1) {
                            this.$this_unsafeFlow$inlined = flowCollector;
                            this.this$0 = baseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public Object emit(RelayDTO.Subscription.Request request, @NotNull Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj = anonymousClass1.result;
                            Object objCopydefault = C56442yFn.copydefault();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                C56391yDq.AEQbTJ(obj);
                                FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                Relay.Model.Call.Subscription.Request relay = RelayMapperKt.toRelay(request);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(relay, anonymousClass1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(@NotNull FlowCollector<? super Relay.Model.Call.Subscription.Request> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowObserveSubscriptionRequest.collect(new AnonymousClass2(flowCollector, this), continuation);
                        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                    }
                }, new AnonymousClass2(this.this$0, null));
            }
        });
    }

    public final RelayService getRelayService() {
        RelayService relayService = this.relayService;
        if (relayService != null) {
            return relayService;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final ConnectionLifecycle getConnectionLifecycle() {
        ConnectionLifecycle connectionLifecycle = this.connectionLifecycle;
        if (connectionLifecycle != null) {
            return connectionLifecycle;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeResults$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19141(Continuation<? super C19141> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return BaseRelayClient.this.new C19141(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowM7441catch = FlowKt.m7441catch(FlowKt.merge(BaseRelayClient.this.getRelayService().observePublishAcknowledgement(), BaseRelayClient.this.getRelayService().observePublishError(), BaseRelayClient.this.getRelayService().observeBatchSubscribeAcknowledgement(), BaseRelayClient.this.getRelayService().observeBatchSubscribeError(), BaseRelayClient.this.getRelayService().observeSubscribeAcknowledgement(), BaseRelayClient.this.getRelayService().observeSubscribeError(), BaseRelayClient.this.getRelayService().observeUnsubscribeAcknowledgement(), BaseRelayClient.this.getRelayService().observeUnsubscribeError()), new C07361(BaseRelayClient.this, null));
                final BaseRelayClient baseRelayClient = BaseRelayClient.this;
                FlowCollector<RelayDTO> flowCollector = new FlowCollector<RelayDTO>() { // from class: com.reown.foundation.network.BaseRelayClient$observeResults$1$invokeSuspend$$inlined$collect$1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public Object emit(RelayDTO relayDTO, @NotNull Continuation continuation) {
                        RelayDTO relayDTO2 = relayDTO;
                        if (baseRelayClient.isLoggingEnabled()) {
                            System.out.println((Object) ("Result: " + relayDTO2 + "; timestamp: " + System.currentTimeMillis()));
                        }
                        Object objEmit = baseRelayClient.resultState.emit(relayDTO2, continuation);
                        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM7441catch.collect(flowCollector, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeResults$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07361 extends SuspendLambda implements yHO<FlowCollector<? super RelayDTO>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BaseRelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07361(BaseRelayClient baseRelayClient, Continuation<? super C07361> continuation) {
                super(3, continuation);
                this.this$0 = baseRelayClient;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.yHO
            public final Object invoke(@NotNull FlowCollector<? super RelayDTO> flowCollector, @NotNull Throwable th, Continuation<? super Unit> continuation) {
                C07361 c07361 = new C07361(this.this$0, continuation);
                c07361.L$0 = th;
                return c07361.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.getLogger().error((Throwable) this.L$0);
                return Unit.INSTANCE;
            }
        }
    }

    public final void observeResults() {
        BuildersKt__Builders_commonKt.launch$default(ScopeKt.getScope(), null, null, new C19141(null), 3, null);
    }

    @Override // com.reown.foundation.network.RelayInterface
    public SharedFlow<Relay.Model.Event> getEventsFlow() {
        return (SharedFlow) this.eventsFlow$delegate.getValue();
    }

    @Override // com.reown.foundation.network.RelayInterface
    public Flow<Relay.Model.Call.Subscription.Request> getSubscriptionRequest() {
        return (Flow) this.subscriptionRequest$delegate.getValue();
    }

    @Override // com.reown.foundation.network.RelayInterface
    public void publish(@NotNull final String str, @NotNull final String str2, @NotNull final Relay.Model.IrnParams irnParams, final Long l, @NotNull final Function1<? super Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(function1, "");
        connectAndCallRelay(new Function0<Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.publish.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Publish$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Relay.Model.IrnParams irnParams2 = irnParams;
                RelayDTO.Publish.Request.Params params = new RelayDTO.Publish.Request.Params(new Topic(str), str2, new Ttl(irnParams2.component2()), irnParams2.component1(), Boolean.valueOf(irnParams2.component3()));
                Long l2 = l;
                RelayDTO.Publish.Request request = new RelayDTO.Publish.Request(l2 != null ? l2.longValue() : UtilFunctionsKt.generateClientToServerId(), null, null, params, 6, null);
                this.observePublishResult(request.getId(), function1);
                this.getRelayService().publishRequest(request);
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.publish.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Publish$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function12 = function1;
                Result.Application application = Result.Companion;
                function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th))));
            }
        });
    }

    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observePublishResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        final /* synthetic */ Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRelayClient this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Publish$Acknowledgement>, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19131(Function1<? super Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1, BaseRelayClient baseRelayClient, long j, Continuation<? super C19131> continuation) {
            super(2, continuation);
            this.$onResult = function1;
            this.this$0 = baseRelayClient;
            this.$id = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19131 c19131 = new C19131(this.$onResult, this.this$0, this.$id, continuation);
            c19131.L$0 = obj;
            return c19131;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Exception e;
            TimeoutCancellationException e2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    C07351 c07351 = new C07351(this.this$0, this.$id, this.$onResult, null);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (TimeoutKt.withTimeout(60000L, c07351, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (TimeoutCancellationException e3) {
                    coroutineScope = coroutineScope2;
                    e2 = e3;
                    Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1 = this.$onResult;
                    Result.Application application = Result.Companion;
                    function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e4) {
                    coroutineScope = coroutineScope2;
                    e = e4;
                    Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function12 = this.$onResult;
                    Result.Application application2 = Result.Companion;
                    function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (TimeoutCancellationException e5) {
                    e2 = e5;
                    Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function13 = this.$onResult;
                    Result.Application application3 = Result.Companion;
                    function13.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e6) {
                    e = e6;
                    Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function122 = this.$onResult;
                    Result.Application application22 = Result.Companion;
                    function122.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelayDTO.Publish.Result>, Object> {
            final /* synthetic */ long $id;
            final /* synthetic */ Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> $onResult;
            int label;
            final /* synthetic */ BaseRelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Publish$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07351(BaseRelayClient baseRelayClient, long j, Function1<? super Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1, Continuation<? super C07351> continuation) {
                super(2, continuation);
                this.this$0 = baseRelayClient;
                this.$id = j;
                this.$onResult = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07351(this.this$0, this.$id, this.$onResult, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super RelayDTO.Publish.Result> continuation) {
                return ((C07351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    final MutableSharedFlow mutableSharedFlow = this.this$0.resultState;
                    final Flow<Object> flow = new Flow<Object>() { // from class: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<Object> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 baseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filterIsInstance$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filterIsInstance$1;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (!(obj instanceof RelayDTO.Publish.Result)) {
                                        return Unit.INSTANCE;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
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

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    final long j = this.$id;
                    Flow<RelayDTO.Publish.Result> flow2 = new Flow<RelayDTO.Publish.Result>() { // from class: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<RelayDTO.Publish.Result> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filter$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filter$1 baseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filter$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observePublishResult$1$1$invokeSuspend$$inlined$filter$1;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(RelayDTO.Publish.Result result, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (result.getId() == j) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(result, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super RelayDTO.Publish.Result> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onResult, null);
                    this.label = 1;
                    obj = FlowKt.first(flow2, anonymousClass2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observePublishResult$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<RelayDTO.Publish.Result, Continuation<? super Boolean>, Object> {
                final /* synthetic */ Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> $onResult;
                /* synthetic */ Object L$0;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Publish$Acknowledgement>, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function1<? super Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$onResult = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onResult, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull RelayDTO.Publish.Result result, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RelayDTO.Publish.Result result = (RelayDTO.Publish.Result) this.L$0;
                        if (result instanceof RelayDTO.Publish.Result.Acknowledgement) {
                            Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1 = this.$onResult;
                            Result.Application application = Result.Companion;
                            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(RelayMapperKt.toRelay((RelayDTO.Publish.Result.Acknowledgement) result))));
                        } else if (result instanceof RelayDTO.Publish.Result.JsonRpcError) {
                            Function1<Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function12 = this.$onResult;
                            Result.Application application2 = Result.Companion;
                            function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Throwable(((RelayDTO.Publish.Result.JsonRpcError) result).getError().getErrorMessage())))));
                        }
                        return C56443yFo.KWHzl(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observePublishResult(long j, Function1<? super Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ScopeKt.getScope(), null, null, new C19131(function1, this, j, null), 3, null);
    }

    @Override // com.reown.foundation.network.RelayInterface
    public void subscribe(@NotNull final String str, final Long l, @NotNull final Function1<? super Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        connectAndCallRelay(new Function0<Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.subscribe.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Long l2 = l;
                RelayDTO.Subscribe.Request request = new RelayDTO.Subscribe.Request(l2 != null ? l2.longValue() : UtilFunctionsKt.generateClientToServerId(), null, null, new RelayDTO.Subscribe.Request.Params(new Topic(str)), 6, null);
                if (this.isLoggingEnabled()) {
                    this.getLogger().log("Sending SubscribeRequest: " + request + ";  timestamp: " + System.currentTimeMillis());
                }
                this.observeSubscribeResult(request.getId(), function1);
                this.getRelayService().subscribeRequest(request);
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.subscribe.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function12 = function1;
                Result.Application application = Result.Companion;
                function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th))));
            }
        });
    }

    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        final /* synthetic */ Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRelayClient this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Acknowledgement>, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19151(Function1<? super Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1, BaseRelayClient baseRelayClient, long j, Continuation<? super C19151> continuation) {
            super(2, continuation);
            this.$onResult = function1;
            this.this$0 = baseRelayClient;
            this.$id = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19151 c19151 = new C19151(this.$onResult, this.this$0, this.$id, continuation);
            c19151.L$0 = obj;
            return c19151;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Exception e;
            TimeoutCancellationException e2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    C07371 c07371 = new C07371(this.this$0, this.$id, this.$onResult, null);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (TimeoutKt.withTimeout(60000L, c07371, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (TimeoutCancellationException e3) {
                    coroutineScope = coroutineScope2;
                    e2 = e3;
                    Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1 = this.$onResult;
                    Result.Application application = Result.Companion;
                    function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e4) {
                    coroutineScope = coroutineScope2;
                    e = e4;
                    Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function12 = this.$onResult;
                    Result.Application application2 = Result.Companion;
                    function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (TimeoutCancellationException e5) {
                    e2 = e5;
                    Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function13 = this.$onResult;
                    Result.Application application3 = Result.Companion;
                    function13.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e6) {
                    e = e6;
                    Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function122 = this.$onResult;
                    Result.Application application22 = Result.Companion;
                    function122.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelayDTO.Subscribe.Result>, Object> {
            final /* synthetic */ long $id;
            final /* synthetic */ Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> $onResult;
            int label;
            final /* synthetic */ BaseRelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07371(BaseRelayClient baseRelayClient, long j, Function1<? super Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1, Continuation<? super C07371> continuation) {
                super(2, continuation);
                this.this$0 = baseRelayClient;
                this.$id = j;
                this.$onResult = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07371(this.this$0, this.$id, this.$onResult, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super RelayDTO.Subscribe.Result> continuation) {
                return ((C07371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (this.this$0.isLoggingEnabled()) {
                        System.out.println((Object) ("ObserveSubscribeResult: " + this.$id + "; timestamp: " + System.currentTimeMillis()));
                    }
                    final Flow flowOnEach = FlowKt.onEach(this.this$0.resultState, new C07381(this.this$0, null));
                    final Flow flowOnEach2 = FlowKt.onEach(new Flow<Object>() { // from class: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<Object> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 baseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (!(obj instanceof RelayDTO.Subscribe.Result)) {
                                        return Unit.INSTANCE;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
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

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = flowOnEach.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    }, new AnonymousClass2(this.this$0, null));
                    final long j = this.$id;
                    Flow<RelayDTO.Subscribe.Result> flow = new Flow<RelayDTO.Subscribe.Result>() { // from class: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<RelayDTO.Subscribe.Result> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filter$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filter$1 baseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filter$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observeSubscribeResult$1$1$invokeSuspend$$inlined$filter$1;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(RelayDTO.Subscribe.Result result, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (result.getId() == j) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(result, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super RelayDTO.Subscribe.Result> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = flowOnEach2.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$onResult, null);
                    this.label = 1;
                    obj = FlowKt.first(flow, anonymousClass4, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07381 extends SuspendLambda implements Function2<RelayDTO, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BaseRelayClient this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07381(BaseRelayClient baseRelayClient, Continuation<? super C07381> continuation) {
                    super(2, continuation);
                    this.this$0 = baseRelayClient;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    C07381 c07381 = new C07381(this.this$0, continuation);
                    c07381.L$0 = obj;
                    return c07381;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull RelayDTO relayDTO, Continuation<? super Unit> continuation) {
                    return ((C07381) create(relayDTO, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    RelayDTO relayDTO = (RelayDTO) this.L$0;
                    if (this.this$0.isLoggingEnabled()) {
                        this.this$0.getLogger().log("SubscribeResult 1: " + relayDTO);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<RelayDTO.Subscribe.Result, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BaseRelayClient this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BaseRelayClient baseRelayClient, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = baseRelayClient;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull RelayDTO.Subscribe.Result result, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    RelayDTO.Subscribe.Result result = (RelayDTO.Subscribe.Result) this.L$0;
                    if (this.this$0.isLoggingEnabled()) {
                        this.this$0.getLogger().log("SubscribeResult 2: " + result);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeSubscribeResult$1$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<RelayDTO.Subscribe.Result, Continuation<? super Boolean>, Object> {
                final /* synthetic */ Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> $onResult;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BaseRelayClient this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Acknowledgement>, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass4(BaseRelayClient baseRelayClient, Function1<? super Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = baseRelayClient;
                    this.$onResult = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$onResult, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull RelayDTO.Subscribe.Result result, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass4) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RelayDTO.Subscribe.Result result = (RelayDTO.Subscribe.Result) this.L$0;
                        if (this.this$0.isLoggingEnabled()) {
                            System.out.println((Object) ("SubscribeResult 3: " + result));
                        }
                        if (result instanceof RelayDTO.Subscribe.Result.Acknowledgement) {
                            Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1 = this.$onResult;
                            Result.Application application = Result.Companion;
                            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(RelayMapperKt.toRelay((RelayDTO.Subscribe.Result.Acknowledgement) result))));
                        } else if (result instanceof RelayDTO.Subscribe.Result.JsonRpcError) {
                            Function1<Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function12 = this.$onResult;
                            Result.Application application2 = Result.Companion;
                            function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Throwable(((RelayDTO.Subscribe.Result.JsonRpcError) result).getError().getErrorMessage())))));
                        }
                        return C56443yFo.KWHzl(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeSubscribeResult(long j, Function1<? super Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ScopeKt.getScope(), null, null, new C19151(function1, this, j, null), 3, null);
    }

    @Override // com.reown.foundation.network.RelayInterface
    public void batchSubscribe(@NotNull final List<String> list, final Long l, @NotNull final Function1<? super Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        connectAndCallRelay(new Function0<Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.batchSubscribe.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (BaseRelayClient.this.unAckedTopics.containsAll(list)) {
                    return;
                }
                BaseRelayClient.this.unAckedTopics.addAll(list);
                Long l2 = l;
                RelayDTO.BatchSubscribe.Request request = new RelayDTO.BatchSubscribe.Request(l2 != null ? l2.longValue() : UtilFunctionsKt.generateClientToServerId(), null, null, new RelayDTO.BatchSubscribe.Request.Params(list), 6, null);
                BaseRelayClient.this.observeBatchSubscribeResult(request.getId(), list, function1);
                BaseRelayClient.this.getRelayService().batchSubscribeRequest(request);
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.batchSubscribe.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function12 = function1;
                Result.Application application = Result.Companion;
                function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th))));
            }
        });
    }

    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        final /* synthetic */ Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> $onResult;
        final /* synthetic */ List<String> $topics;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRelayClient this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Acknowledgement>, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19121(Function1<? super Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1, BaseRelayClient baseRelayClient, List<String> list, long j, Continuation<? super C19121> continuation) {
            super(2, continuation);
            this.$onResult = function1;
            this.this$0 = baseRelayClient;
            this.$topics = list;
            this.$id = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19121 c19121 = new C19121(this.$onResult, this.this$0, this.$topics, this.$id, continuation);
            c19121.L$0 = obj;
            return c19121;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Exception e;
            TimeoutCancellationException e2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    C07331 c07331 = new C07331(this.this$0, this.$topics, this.$id, this.$onResult, null);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (TimeoutKt.withTimeout(60000L, c07331, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (TimeoutCancellationException e3) {
                    coroutineScope = coroutineScope2;
                    e2 = e3;
                    Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1 = this.$onResult;
                    Result.Application application = Result.Companion;
                    function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e4) {
                    coroutineScope = coroutineScope2;
                    e = e4;
                    Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function12 = this.$onResult;
                    Result.Application application2 = Result.Companion;
                    function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (TimeoutCancellationException e5) {
                    e2 = e5;
                    Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function13 = this.$onResult;
                    Result.Application application3 = Result.Companion;
                    function13.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e6) {
                    e = e6;
                    Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function122 = this.$onResult;
                    Result.Application application22 = Result.Companion;
                    function122.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelayDTO.BatchSubscribe.Result>, Object> {
            final /* synthetic */ long $id;
            final /* synthetic */ Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> $onResult;
            final /* synthetic */ List<String> $topics;
            int label;
            final /* synthetic */ BaseRelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07331(BaseRelayClient baseRelayClient, List<String> list, long j, Function1<? super Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1, Continuation<? super C07331> continuation) {
                super(2, continuation);
                this.this$0 = baseRelayClient;
                this.$topics = list;
                this.$id = j;
                this.$onResult = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07331(this.this$0, this.$topics, this.$id, this.$onResult, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super RelayDTO.BatchSubscribe.Result> continuation) {
                return ((C07331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    final MutableSharedFlow mutableSharedFlow = this.this$0.resultState;
                    final Flow flowOnEach = FlowKt.onEach(new Flow<Object>() { // from class: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<Object> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 baseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (!(obj instanceof RelayDTO.BatchSubscribe.Result)) {
                                        return Unit.INSTANCE;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
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

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    }, new C07341(this.this$0, this.$topics, null));
                    final long j = this.$id;
                    Flow<RelayDTO.BatchSubscribe.Result> flow = new Flow<RelayDTO.BatchSubscribe.Result>() { // from class: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<RelayDTO.BatchSubscribe.Result> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filter$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filter$1 baseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filter$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observeBatchSubscribeResult$1$1$invokeSuspend$$inlined$filter$1;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(RelayDTO.BatchSubscribe.Result result, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (result.getId() == j) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(result, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super RelayDTO.BatchSubscribe.Result> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = flowOnEach.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$onResult, null);
                    this.label = 1;
                    obj = FlowKt.first(flow, anonymousClass3, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07341 extends SuspendLambda implements Function2<RelayDTO.BatchSubscribe.Result, Continuation<? super Unit>, Object> {
                final /* synthetic */ List<String> $topics;
                int label;
                final /* synthetic */ BaseRelayClient this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07341(BaseRelayClient baseRelayClient, List<String> list, Continuation<? super C07341> continuation) {
                    super(2, continuation);
                    this.this$0 = baseRelayClient;
                    this.$topics = list;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C07341(this.this$0, this.$topics, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull RelayDTO.BatchSubscribe.Result result, Continuation<? super Unit> continuation) {
                    return ((C07341) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    if (!this.this$0.unAckedTopics.isEmpty()) {
                        this.this$0.unAckedTopics.removeAll(this.$topics);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeBatchSubscribeResult$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<RelayDTO.BatchSubscribe.Result, Continuation<? super Boolean>, Object> {
                final /* synthetic */ Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> $onResult;
                /* synthetic */ Object L$0;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Acknowledgement>, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass3(Function1<? super Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$onResult = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$onResult, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull RelayDTO.BatchSubscribe.Result result, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass3) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RelayDTO.BatchSubscribe.Result result = (RelayDTO.BatchSubscribe.Result) this.L$0;
                        if (result instanceof RelayDTO.BatchSubscribe.Result.Acknowledgement) {
                            Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1 = this.$onResult;
                            Result.Application application = Result.Companion;
                            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(RelayMapperKt.toRelay((RelayDTO.BatchSubscribe.Result.Acknowledgement) result))));
                        } else if (result instanceof RelayDTO.BatchSubscribe.Result.JsonRpcError) {
                            Function1<Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function12 = this.$onResult;
                            Result.Application application2 = Result.Companion;
                            function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Throwable(((RelayDTO.BatchSubscribe.Result.JsonRpcError) result).getError().getErrorMessage())))));
                        }
                        return C56443yFo.KWHzl(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeBatchSubscribeResult(long j, List<String> list, Function1<? super Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ScopeKt.getScope(), null, null, new C19121(function1, this, list, j, null), 3, null);
    }

    @Override // com.reown.foundation.network.RelayInterface
    public void unsubscribe(@NotNull final String str, @NotNull final String str2, final Long l, @NotNull final Function1<? super Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        connectAndCallRelay(new Function0<Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.unsubscribe.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Long l2 = l;
                RelayDTO.Unsubscribe.Request request = new RelayDTO.Unsubscribe.Request(l2 != null ? l2.longValue() : UtilFunctionsKt.generateClientToServerId(), null, null, new RelayDTO.Unsubscribe.Request.Params(new Topic(str), new SubscriptionId(str2)), 6, null);
                this.observeUnsubscribeResult(request.getId(), function1);
                this.getRelayService().unsubscribeRequest(request);
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.unsubscribe.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function12 = function1;
                Result.Application application = Result.Companion;
                function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th))));
            }
        });
    }

    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        final /* synthetic */ Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> $onResult;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRelayClient this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Acknowledgement>, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19161(Function1<? super Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1, BaseRelayClient baseRelayClient, long j, Continuation<? super C19161> continuation) {
            super(2, continuation);
            this.$onResult = function1;
            this.this$0 = baseRelayClient;
            this.$id = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19161 c19161 = new C19161(this.$onResult, this.this$0, this.$id, continuation);
            c19161.L$0 = obj;
            return c19161;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Exception e;
            TimeoutCancellationException e2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    C07391 c07391 = new C07391(this.this$0, this.$id, this.$onResult, null);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (TimeoutKt.withTimeout(60000L, c07391, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (TimeoutCancellationException e3) {
                    coroutineScope = coroutineScope2;
                    e2 = e3;
                    Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1 = this.$onResult;
                    Result.Application application = Result.Companion;
                    function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e4) {
                    coroutineScope = coroutineScope2;
                    e = e4;
                    Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function12 = this.$onResult;
                    Result.Application application2 = Result.Companion;
                    function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (TimeoutCancellationException e5) {
                    e2 = e5;
                    Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function13 = this.$onResult;
                    Result.Application application3 = Result.Companion;
                    function13.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e2))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e6) {
                    e = e6;
                    Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function122 = this.$onResult;
                    Result.Application application22 = Result.Companion;
                    function122.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e))));
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelayDTO.Unsubscribe.Result>, Object> {
            final /* synthetic */ long $id;
            final /* synthetic */ Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> $onResult;
            int label;
            final /* synthetic */ BaseRelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Acknowledgement>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07391(BaseRelayClient baseRelayClient, long j, Function1<? super Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1, Continuation<? super C07391> continuation) {
                super(2, continuation);
                this.this$0 = baseRelayClient;
                this.$id = j;
                this.$onResult = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07391(this.this$0, this.$id, this.$onResult, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super RelayDTO.Unsubscribe.Result> continuation) {
                return ((C07391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    final MutableSharedFlow mutableSharedFlow = this.this$0.resultState;
                    final Flow<Object> flow = new Flow<Object>() { // from class: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<Object> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1 baseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filterIsInstance$1;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (!(obj instanceof RelayDTO.Unsubscribe.Result)) {
                                        return Unit.INSTANCE;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
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

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    final long j = this.$id;
                    Flow<RelayDTO.Unsubscribe.Result> flow2 = new Flow<RelayDTO.Unsubscribe.Result>() { // from class: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<RelayDTO.Unsubscribe.Result> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filter$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filter$1 baseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filter$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$observeUnsubscribeResult$1$1$invokeSuspend$$inlined$filter$1;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(RelayDTO.Unsubscribe.Result result, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (result.getId() == j) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(result, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super RelayDTO.Unsubscribe.Result> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onResult, null);
                    this.label = 1;
                    obj = FlowKt.first(flow2, anonymousClass2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<RelayDTO.Unsubscribe.Result, Continuation<? super Boolean>, Object> {
                final /* synthetic */ Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> $onResult;
                /* synthetic */ Object L$0;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Acknowledgement>, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function1<? super Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$onResult = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onResult, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull RelayDTO.Unsubscribe.Result result, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        RelayDTO.Unsubscribe.Result result = (RelayDTO.Unsubscribe.Result) this.L$0;
                        if (result instanceof RelayDTO.Unsubscribe.Result.Acknowledgement) {
                            Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1 = this.$onResult;
                            Result.Application application = Result.Companion;
                            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(RelayMapperKt.toRelay((RelayDTO.Unsubscribe.Result.Acknowledgement) result))));
                        } else if (result instanceof RelayDTO.Unsubscribe.Result.JsonRpcError) {
                            Function1<Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function12 = this.$onResult;
                            Result.Application application2 = Result.Companion;
                            function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Throwable(((RelayDTO.Unsubscribe.Result.JsonRpcError) result).getError().getErrorMessage())))));
                        }
                        return C56443yFo.KWHzl(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeUnsubscribeResult(long j, Function1<? super Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ScopeKt.getScope(), null, null, new C19161(function1, this, j, null), 3, null);
    }

    private final void connectAndCallRelay(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        if (shouldConnect()) {
            connect(function0, function1);
        } else if (this.isConnecting) {
            awaitConnection(function0, function1);
        } else if (Intrinsics.EZpvd(this.connectionState.getValue(), ConnectionState.Open.INSTANCE)) {
            function0.invoke();
        }
    }

    private final boolean shouldConnect() {
        return !this.isConnecting && ((this.connectionState.getValue() instanceof ConnectionState.Closed) || (this.connectionState.getValue() instanceof ConnectionState.Idle));
    }

    private final void connect(final Function0<Unit> function0, final Function1<? super Throwable, Unit> function1) {
        this.isConnecting = true;
        getConnectionLifecycle().reconnect();
        awaitConnectionWithRetry(new Function0<Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.connect.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BaseRelayClient.this.reset();
                function0.invoke();
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.connect.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                BaseRelayClient.this.reset();
                function1.invoke(th);
            }
        });
    }

    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onConnected;
        final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRelayClient this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Throwable, Unit> function1, BaseRelayClient baseRelayClient, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onFailure = function1;
            this.this$0 = baseRelayClient;
            this.$onConnected = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onFailure, this.this$0, this.$onConnected, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            TimeoutCancellationException e;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    try {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$onFailure, this.$onConnected, null);
                        this.L$0 = coroutineScope2;
                        this.label = 1;
                        if (TimeoutKt.withTimeout(15000L, anonymousClass1, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } catch (TimeoutCancellationException e2) {
                        coroutineScope = coroutineScope2;
                        e = e2;
                        this.$onFailure.invoke(e);
                        this.this$0.cancelJobIfActive(coroutineScope);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        this.$onFailure.invoke(e);
                        this.this$0.cancelJobIfActive(coroutineScope);
                    }
                }
            } catch (Exception e4) {
                if (!(e4 instanceof CancellationException)) {
                    this.$onFailure.invoke(e4);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConnectionState>, Object> {
            final /* synthetic */ Function0<Unit> $onConnected;
            final /* synthetic */ Function1<Throwable, Unit> $onFailure;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BaseRelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(BaseRelayClient baseRelayClient, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = baseRelayClient;
                this.$onFailure = function1;
                this.$onConnected = function0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$onFailure, this.$onConnected, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ConnectionState> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    final MutableStateFlow<ConnectionState> connectionState$foundation = this.this$0.getConnectionState$foundation();
                    final Flow flowOnEach = FlowKt.onEach(FlowKt.take(new Flow<ConnectionState>() { // from class: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<ConnectionState> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$1 baseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$1;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(ConnectionState connectionState, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (!Intrinsics.EZpvd(connectionState, ConnectionState.Idle.INSTANCE)) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(connectionState, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super ConnectionState> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = connectionState$foundation.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    }, 4), new C07322(this.this$0, coroutineScope, this.$onFailure, null));
                    Flow<ConnectionState> flow = new Flow<ConnectionState>() { // from class: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$2

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$2$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<ConnectionState> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$2 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$2$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$2 baseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$2) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$awaitConnectionWithRetry$2$1$invokeSuspend$$inlined$filter$2;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(ConnectionState connectionState, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (Intrinsics.EZpvd(connectionState, ConnectionState.Open.INSTANCE)) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(connectionState, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super ConnectionState> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = flowOnEach.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$onConnected, null);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flow, anonymousClass4, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$2, reason: invalid class name and collision with other inner class name */
            public static final class C07322 extends SuspendLambda implements Function2<ConnectionState, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$withTimeout;
                final /* synthetic */ Function1<Throwable, Unit> $onFailure;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BaseRelayClient this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07322(BaseRelayClient baseRelayClient, CoroutineScope coroutineScope, Function1<? super Throwable, Unit> function1, Continuation<? super C07322> continuation) {
                    super(2, continuation);
                    this.this$0 = baseRelayClient;
                    this.$$this$withTimeout = coroutineScope;
                    this.$onFailure = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    C07322 c07322 = new C07322(this.this$0, this.$$this$withTimeout, this.$onFailure, continuation);
                    c07322.L$0 = obj;
                    return c07322;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull ConnectionState connectionState, Continuation<? super Unit> continuation) {
                    return ((C07322) create(connectionState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.handleRetries(this.$$this$withTimeout, (ConnectionState) this.L$0, this.$onFailure);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnectionWithRetry$2$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<ConnectionState, Continuation<? super Boolean>, Object> {
                final /* synthetic */ Function0<Unit> $onConnected;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Function0<Unit> function0, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$onConnected = function0;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass4(this.$onConnected, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull ConnectionState connectionState, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass4) create(connectionState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.$onConnected.invoke();
                        return C56443yFo.KWHzl(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.foundation.network.BaseRelayClient */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void awaitConnectionWithRetry$default(BaseRelayClient baseRelayClient, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitConnectionWithRetry");
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Throwable, Unit>() { // from class: com.reown.foundation.network.BaseRelayClient.awaitConnectionWithRetry.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            };
        }
        baseRelayClient.awaitConnectionWithRetry(function0, function1);
    }

    private final void awaitConnectionWithRetry(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ScopeKt.getScope(), null, null, new AnonymousClass2(function1, this, function0, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnection$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onConnected;
        final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseRelayClient this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Throwable, Unit> function1, BaseRelayClient baseRelayClient, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onFailure = function1;
            this.this$0 = baseRelayClient;
            this.$onConnected = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onFailure, this.this$0, this.$onConnected, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Exception e;
            TimeoutCancellationException e2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    C07311 c07311 = new C07311(this.this$0, this.$onConnected, null);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (TimeoutKt.withTimeout(15000L, c07311, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (TimeoutCancellationException e3) {
                    coroutineScope = coroutineScope2;
                    e2 = e3;
                    this.$onFailure.invoke(e2);
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e4) {
                    coroutineScope = coroutineScope2;
                    e = e4;
                    if (!(e instanceof CancellationException)) {
                        this.$onFailure.invoke(e);
                    }
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (TimeoutCancellationException e5) {
                    e2 = e5;
                    this.$onFailure.invoke(e2);
                    this.this$0.cancelJobIfActive(coroutineScope);
                } catch (Exception e6) {
                    e = e6;
                    if (!(e instanceof CancellationException)) {
                    }
                    this.this$0.cancelJobIfActive(coroutineScope);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnection$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConnectionState>, Object> {
            final /* synthetic */ Function0<Unit> $onConnected;
            int label;
            final /* synthetic */ BaseRelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07311(BaseRelayClient baseRelayClient, Function0<Unit> function0, Continuation<? super C07311> continuation) {
                super(2, continuation);
                this.this$0 = baseRelayClient;
                this.$onConnected = function0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07311(this.this$0, this.$onConnected, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ConnectionState> continuation) {
                return ((C07311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    final MutableStateFlow<ConnectionState> connectionState$foundation = this.this$0.getConnectionState$foundation();
                    Flow<ConnectionState> flow = new Flow<ConnectionState>() { // from class: com.reown.foundation.network.BaseRelayClient$awaitConnection$1$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnection$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector<ConnectionState> {
                            final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                            final /* synthetic */ BaseRelayClient$awaitConnection$1$1$invokeSuspend$$inlined$filter$1 this$0;

                            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnection$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, BaseRelayClient$awaitConnection$1$1$invokeSuspend$$inlined$filter$1 baseRelayClient$awaitConnection$1$1$invokeSuspend$$inlined$filter$1) {
                                this.$this_unsafeFlow$inlined = flowCollector;
                                this.this$0 = baseRelayClient$awaitConnection$1$1$invokeSuspend$$inlined$filter$1;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public Object emit(ConnectionState connectionState, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj = anonymousClass1.result;
                                Object objCopydefault = C56442yFn.copydefault();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    C56391yDq.AEQbTJ(obj);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    if (connectionState instanceof ConnectionState.Open) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(connectionState, anonymousClass1) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C56391yDq.AEQbTJ(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(@NotNull FlowCollector<? super ConnectionState> flowCollector, @NotNull Continuation continuation) {
                            Object objCollect = connectionState$foundation.collect(new AnonymousClass2(flowCollector, this), continuation);
                            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onConnected, null);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flow, anonymousClass2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return obj;
            }

            /* JADX INFO: renamed from: com.reown.foundation.network.BaseRelayClient$awaitConnection$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<ConnectionState, Continuation<? super Boolean>, Object> {
                final /* synthetic */ Function0<Unit> $onConnected;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$onConnected = function0;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.$onConnected, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull ConnectionState connectionState, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass2) create(connectionState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.$onConnected.invoke();
                        return C56443yFo.KWHzl(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    private final void awaitConnection(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ScopeKt.getScope(), null, null, new AnonymousClass1(function1, this, function0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRetries(CoroutineScope coroutineScope, ConnectionState connectionState, Function1<? super Throwable, Unit> function1) {
        if (connectionState instanceof ConnectionState.Closed) {
            if (this.retryCount == 3) {
                function1.invoke(new Throwable("Connectivity error, please check your Internet connection and try again"));
                cancelJobIfActive(coroutineScope);
            } else {
                getConnectionLifecycle().reconnect();
                this.retryCount++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getError(InterfaceC58092yuk.Activity activity) {
        return activity instanceof InterfaceC58092yuk.Activity.Application ? new Throwable(((InterfaceC58092yuk.Activity.Application) activity).EZpvd().OLrzqt()) : activity instanceof InterfaceC58092yuk.Activity.ActionBar ? ((InterfaceC58092yuk.Activity.ActionBar) activity).KWHzl() : new Throwable("Unknown");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishSubscriptionAcknowledgement(long j) {
        getRelayService().publishSubscriptionAcknowledgement(new RelayDTO.Subscription.Result.Acknowledgement(j, null, true, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelJobIfActive(CoroutineScope coroutineScope) {
        if (JobKt.getJob(coroutineScope.getCoroutineContext()).isActive()) {
            Job.DefaultImpls.cancel$default(JobKt.getJob(coroutineScope.getCoroutineContext()), (CancellationException) null, 1, (Object) null);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.BaseRelayClient.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
