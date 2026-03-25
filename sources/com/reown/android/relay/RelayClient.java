package com.reown.android.relay;

import com.reown.android.Core;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.connection.ConnectivityState;
import com.reown.android.internal.common.connection.DefaultConnectionLifecycle;
import com.reown.android.internal.common.connection.ManualConnectionLifecycle;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.exception.MessagesKt;
import com.reown.android.relay.WSSConnectionState;
import com.reown.android.utils.ExtensionsKt;
import com.reown.foundation.network.BaseRelayClient;
import com.reown.foundation.network.data.service.RelayService;
import com.reown.foundation.network.model.Relay;
import com.reown.foundation.util.Logger;
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
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C60018ztu;
import o.C60022zty;
import o.C60058zuh;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RelayClient extends BaseRelayClient implements RelayConnectionInterface {
    public final MutableStateFlow<WSSConnectionState> _wssConnectionState;
    public ConnectionType connectionType;
    public final InterfaceC56387yDm defaultConnection$delegate;
    public final InterfaceC56387yDm isNetworkAvailable$delegate;
    public final C60018ztu koinApp;
    public final InterfaceC56387yDm manualConnection$delegate;
    public final InterfaceC56387yDm networkState$delegate;
    public final StateFlow<WSSConnectionState> wssConnectionState;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ConnectionType.values().length];
            try {
                iArr[ConnectionType.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionType.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RelayClient() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.relay.RelayConnectionInterface
    public StateFlow<WSSConnectionState> getWssConnectionState() {
        return this.wssConnectionState;
    }

    public RelayClient(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        this.koinApp = c60018ztu;
        this.manualConnection$delegate = C56392yDr.copydefault(new Function0<ManualConnectionLifecycle>() { // from class: com.reown.android.relay.RelayClient$manualConnection$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ManualConnectionLifecycle invoke() {
                C60022zty c60022ztyOLrzqt = this.this$0.koinApp.OLrzqt();
                return (ManualConnectionLifecycle) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(ManualConnectionLifecycle.class), C60058zuh.OLrzqt(AndroidCommonDITags.MANUAL_CONNECTION_LIFECYCLE), null);
            }
        });
        this.defaultConnection$delegate = C56392yDr.copydefault(new Function0<DefaultConnectionLifecycle>() { // from class: com.reown.android.relay.RelayClient$defaultConnection$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DefaultConnectionLifecycle invoke() {
                C60022zty c60022ztyOLrzqt = this.this$0.koinApp.OLrzqt();
                return (DefaultConnectionLifecycle) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(DefaultConnectionLifecycle.class), C60058zuh.OLrzqt(AndroidCommonDITags.DEFAULT_CONNECTION_LIFECYCLE), null);
            }
        });
        this.networkState$delegate = C56392yDr.copydefault(new Function0<ConnectivityState>() { // from class: com.reown.android.relay.RelayClient$networkState$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ConnectivityState invoke() {
                C60022zty c60022ztyOLrzqt = this.this$0.koinApp.OLrzqt();
                return (ConnectivityState) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(ConnectivityState.class), C60058zuh.OLrzqt(AndroidCommonDITags.CONNECTIVITY_STATE), null);
            }
        });
        this.isNetworkAvailable$delegate = C56392yDr.copydefault(new Function0<StateFlow<? extends Boolean>>() { // from class: com.reown.android.relay.RelayClient.isNetworkAvailable.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final StateFlow<? extends Boolean> invoke() {
                return RelayClient.this.getNetworkState().isAvailable();
            }
        });
        MutableStateFlow<WSSConnectionState> MutableStateFlow = StateFlowKt.MutableStateFlow(new WSSConnectionState.Disconnected.ConnectionClosed(null, 1, null));
        this._wssConnectionState = MutableStateFlow;
        this.wssConnectionState = MutableStateFlow;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:o.ztu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ztu:0x0004: INVOKE  STATIC call: com.reown.android.internal.common.KoinApplicationKt.getWcKoinApp():o.ztu A[MD:():o.ztu (m), WRAPPED] (LINE:30)) : (r1v0 o.ztu))
 A[MD:(o.ztu):void (m)] (LINE:30) call: com.reown.android.relay.RelayClient.<init>(o.ztu):void type: THIS */
    public /* synthetic */ RelayClient(C60018ztu c60018ztu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KoinApplicationKt.getWcKoinApp() : c60018ztu);
    }

    public final ManualConnectionLifecycle getManualConnection() {
        return (ManualConnectionLifecycle) this.manualConnection$delegate.getValue();
    }

    public final DefaultConnectionLifecycle getDefaultConnection() {
        return (DefaultConnectionLifecycle) this.defaultConnection$delegate.getValue();
    }

    public final ConnectivityState getNetworkState() {
        return (ConnectivityState) this.networkState$delegate.getValue();
    }

    @Override // com.reown.android.relay.RelayConnectionInterface
    public StateFlow<Boolean> isNetworkAvailable() {
        return (StateFlow) this.isNetworkAvailable$delegate.getValue();
    }

    @Override // com.reown.android.relay.RelayConnectionInterface
    public Flow<Object> getOnResubscribe() {
        final StateFlow<Boolean> onResume = getConnectionLifecycle().getOnResume();
        return FlowKt.merge(new Flow<Boolean>() { // from class: com.reown.android.relay.RelayClient$special$$inlined$filter$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = onResume.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.android.relay.RelayClient$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.android.relay.RelayClient$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

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

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
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
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && bool.booleanValue()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
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
        }, FlowKt.filterIsInstance(getWssConnectionState(), C56524yIo.AEQbTJ(WSSConnectionState.Connected.class)));
    }

    public final /* synthetic */ void initialize(ConnectionType connectionType, final Function1 function1) {
        Intrinsics.checkNotNullParameter(connectionType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.connectionType = connectionType;
        setLogger((Logger) this.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
        setRelayService((RelayService) this.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(RelayService.class), C60058zuh.OLrzqt(AndroidCommonDITags.RELAY_SERVICE), null));
        setConnectionLifecycle(connectionType == ConnectionType.MANUAL ? getManualConnection() : getDefaultConnection());
        collectConnectionInitializationErrors(new Function1<Throwable, Unit>() { // from class: com.reown.android.relay.RelayClient.initialize.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
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
                function1.invoke(th);
            }
        });
        monitorConnectionState();
        observeResults();
    }

    /* JADX INFO: renamed from: com.reown.android.relay.RelayClient$collectConnectionInitializationErrors$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onError;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Throwable, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onError = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RelayClient.this.new AnonymousClass1(this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.relay.RelayClient$collectConnectionInitializationErrors$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Throwable, Unit> $onError;
            public int label;
            public final /* synthetic */ RelayClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07171(RelayClient relayClient, Function1<? super Throwable, Unit> function1, Continuation<? super C07171> continuation) {
                super(2, continuation);
                this.this$0 = relayClient;
                this.$onError = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07171(this.this$0, this.$onError, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<Relay.Model.Event> eventsFlow = this.this$0.getEventsFlow();
                    C07181 c07181 = new C07181(this.$onError, null);
                    this.label = 1;
                    if (FlowKt.first(eventsFlow, c07181, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.reown.android.relay.RelayClient$collectConnectionInitializationErrors$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07181 extends SuspendLambda implements Function2<Relay.Model.Event, Continuation<? super Boolean>, Object> {
                public final /* synthetic */ Function1<Throwable, Unit> $onError;
                public /* synthetic */ Object L$0;
                public int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07181(Function1<? super Throwable, Unit> function1, Continuation<? super C07181> continuation) {
                    super(2, continuation);
                    this.$onError = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    C07181 c07181 = new C07181(this.$onError, continuation);
                    c07181.L$0 = obj;
                    return c07181;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull Relay.Model.Event event, Continuation<? super Boolean> continuation) {
                    return ((C07181) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        Relay.Model.Event event = (Relay.Model.Event) this.L$0;
                        if (event instanceof Relay.Model.Event.OnConnectionFailed) {
                            this.$onError.invoke(ExtensionsKt.getToWalletConnectException(((Relay.Model.Event.OnConnectionFailed) event).getThrowable()));
                        }
                        return C56443yFo.KWHzl(!(event instanceof Relay.Model.Event.OnConnectionOpened));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C07171 c07171 = new C07171(RelayClient.this, this.$onError, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07171, this) == objCopydefault) {
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

    public final void collectConnectionInitializationErrors(Function1<? super Throwable, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.android.relay.RelayClient$monitorConnectionState$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18391 extends SuspendLambda implements Function2<Relay.Model.Event, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18391(Continuation<? super C18391> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C18391 c18391 = RelayClient.this.new C18391(continuation);
            c18391.L$0 = obj;
            return c18391;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull Relay.Model.Event event, Continuation<? super Unit> continuation) {
            return ((C18391) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            RelayClient.this.setIsWSSConnectionOpened((Relay.Model.Event) this.L$0);
            return Unit.INSTANCE;
        }
    }

    public final void monitorConnectionState() {
        FlowKt.launchIn(FlowKt.onEach(getEventsFlow(), new C18391(null)), WalletConnectScopeKt.getScope());
    }

    public final void setIsWSSConnectionOpened(Relay.Model.Event event) {
        if ((event instanceof Relay.Model.Event.OnConnectionOpened) && (this._wssConnectionState.getValue() instanceof WSSConnectionState.Disconnected)) {
            this._wssConnectionState.setValue(WSSConnectionState.Connected.INSTANCE);
            return;
        }
        if ((event instanceof Relay.Model.Event.OnConnectionFailed) && (this._wssConnectionState.getValue() instanceof WSSConnectionState.Connected)) {
            this._wssConnectionState.setValue(new WSSConnectionState.Disconnected.ConnectionFailed(ExtensionsKt.getToWalletConnectException(((Relay.Model.Event.OnConnectionFailed) event).getThrowable())));
            return;
        }
        if ((event instanceof Relay.Model.Event.OnConnectionClosed) && (this._wssConnectionState.getValue() instanceof WSSConnectionState.Connected)) {
            Relay.Model.Event.OnConnectionClosed onConnectionClosed = (Relay.Model.Event.OnConnectionClosed) event;
            this._wssConnectionState.setValue(new WSSConnectionState.Disconnected.ConnectionClosed("Connection closed: " + onConnectionClosed.getShutdownReason().getReason() + " " + onConnectionClosed.getShutdownReason().getCode()));
        }
    }

    @Override // com.reown.android.relay.RelayConnectionInterface
    public void connect(@NotNull Function1<? super Core.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ConnectionType connectionType = this.connectionType;
        if (connectionType == null) {
            Intrinsics.gEmmrt("");
            connectionType = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[connectionType.ordinal()];
        if (i == 1) {
            function1.invoke(new Core.Model.Error(new IllegalStateException(MessagesKt.WRONG_CONNECTION_TYPE)));
        } else {
            if (i != 2) {
                return;
            }
            getManualConnection().connect();
        }
    }

    @Override // com.reown.android.relay.RelayConnectionInterface
    public void disconnect(@NotNull Function1<? super Core.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ConnectionType connectionType = this.connectionType;
        if (connectionType == null) {
            Intrinsics.gEmmrt("");
            connectionType = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[connectionType.ordinal()];
        if (i == 1) {
            function1.invoke(new Core.Model.Error(new IllegalStateException(MessagesKt.WRONG_CONNECTION_TYPE)));
        } else {
            if (i != 2) {
                return;
            }
            getManualConnection().disconnect();
        }
    }

    @Override // com.reown.android.relay.RelayConnectionInterface
    public void restart(@NotNull Function1<? super Core.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            ConnectionType connectionType = this.connectionType;
            if (connectionType == null) {
                Intrinsics.gEmmrt("");
                connectionType = null;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[connectionType.ordinal()];
            if (i == 1) {
                function1.invoke(new Core.Model.Error(new IllegalStateException(MessagesKt.WRONG_CONNECTION_TYPE)));
            } else {
                if (i != 2) {
                    return;
                }
                getManualConnection().reconnect();
            }
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
        }
    }

    @Override // com.reown.android.relay.RelayConnectionInterface
    public void connect(@NotNull Function1<? super Core.Model.Error, Unit> function1, @NotNull Function1<? super String, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        ConnectionType connectionType = this.connectionType;
        if (connectionType == null) {
            Intrinsics.gEmmrt("");
            connectionType = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[connectionType.ordinal()];
        if (i == 1) {
            function12.invoke(MessagesKt.WRONG_CONNECTION_TYPE);
        } else {
            if (i != 2) {
                return;
            }
            getManualConnection().connect();
        }
    }

    @Override // com.reown.android.relay.RelayConnectionInterface
    public void disconnect(@NotNull Function1<? super Core.Model.Error, Unit> function1, @NotNull Function1<? super String, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        ConnectionType connectionType = this.connectionType;
        if (connectionType == null) {
            Intrinsics.gEmmrt("");
            connectionType = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[connectionType.ordinal()];
        if (i == 1) {
            function12.invoke(MessagesKt.WRONG_CONNECTION_TYPE);
        } else {
            if (i != 2) {
                return;
            }
            getManualConnection().disconnect();
        }
    }
}
