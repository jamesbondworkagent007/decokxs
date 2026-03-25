package com.reown.android.internal.common.json_rpc.domain.relay;

import com.reown.android.internal.common.ConditionalExponentialBackoffStrategy;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.UtilsKt;
import com.reown.android.internal.common.crypto.codec.Codec;
import com.reown.android.internal.common.exception.NoConnectivityException;
import com.reown.android.internal.common.exception.NoInternetConnectionException;
import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.json_rpc.model.JsonRpcMapperKt;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.params.ChatNotifyResponseAuthParams;
import com.reown.android.internal.common.model.sync.ClientJsonRpc;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.internal.common.model.type.Error;
import com.reown.android.internal.common.model.type.JsonRpcClientSync;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.push_messages.PushMessagesRepository;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.android.internal.utils.ObservableMap;
import com.reown.android.relay.RelayConnectionInterface;
import com.reown.android.relay.WSSConnectionState;
import com.reown.foundation.common.model.SubscriptionId;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.network.RelayInterface;
import com.reown.foundation.network.model.Relay;
import com.reown.foundation.util.Logger;
import com.reown.utils.UtilFunctionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C56379yDe;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56524yIo;
import o.C56529yIt;
import org.bouncycastle.util.encoders.Base64;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RelayJsonRpcInteractor implements RelayJsonRpcInteractorInterface {
    public final MutableSharedFlow<WCRequest> _clientSyncJsonRpc;
    public final MutableSharedFlow<SDKError> _internalErrors;
    public final MutableSharedFlow<WCResponse> _peerResponse;
    public final ConditionalExponentialBackoffStrategy backoffStrategy;
    public final Codec chaChaPolyCodec;
    public final SharedFlow<WCRequest> clientSyncJsonRpc;
    public final SharedFlow<SDKError> internalErrors;
    public final JsonRpcHistory jsonRpcHistory;
    public final Logger logger;
    public final SharedFlow<WCResponse> peerResponse;
    public final PushMessagesRepository pushMessageStorage;
    public final RelayConnectionInterface relay;
    public ObservableMap<String, String> subscriptions;

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$handleJsonRpcError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17701 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17701(Continuation<? super C17701> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelayJsonRpcInteractor.this.handleJsonRpcError(null, this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$handleJsonRpcResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17711 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17711(Continuation<? super C17711> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelayJsonRpcInteractor.this.handleJsonRpcResult(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$handleRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17721 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17721(Continuation<? super C17721> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelayJsonRpcInteractor.this.handleRequest(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$manageSubscriptions$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelayJsonRpcInteractor.this.manageSubscriptions(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<WCRequest> getClientSyncJsonRpc() {
        return this.clientSyncJsonRpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<SDKError> getInternalErrors() {
        return this.internalErrors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<WCResponse> getPeerResponse() {
        return this.peerResponse;
    }

    public RelayJsonRpcInteractor(@NotNull RelayConnectionInterface relayConnectionInterface, @NotNull Codec codec, @NotNull JsonRpcHistory jsonRpcHistory, @NotNull PushMessagesRepository pushMessagesRepository, @NotNull Logger logger, @NotNull ConditionalExponentialBackoffStrategy conditionalExponentialBackoffStrategy) {
        Intrinsics.checkNotNullParameter(relayConnectionInterface, "");
        Intrinsics.checkNotNullParameter(codec, "");
        Intrinsics.checkNotNullParameter(jsonRpcHistory, "");
        Intrinsics.checkNotNullParameter(pushMessagesRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(conditionalExponentialBackoffStrategy, "");
        this.relay = relayConnectionInterface;
        this.chaChaPolyCodec = codec;
        this.jsonRpcHistory = jsonRpcHistory;
        this.pushMessageStorage = pushMessagesRepository;
        this.logger = logger;
        this.backoffStrategy = conditionalExponentialBackoffStrategy;
        MutableSharedFlow<WCRequest> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._clientSyncJsonRpc = mutableSharedFlowMutableSharedFlow$default;
        this.clientSyncJsonRpc = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<WCResponse> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._peerResponse = mutableSharedFlowMutableSharedFlow$default2;
        this.peerResponse = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<SDKError> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._internalErrors = mutableSharedFlowMutableSharedFlow$default3;
        this.internalErrors = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        this.subscriptions = new ObservableMap<>(null, new Function1<Map<String, ? extends String>, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$subscriptions$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
                invoke2((Map<String, String>) map);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(map, "");
                if (map.isEmpty()) {
                    this.this$0.backoffStrategy.shouldBackoff(false);
                }
            }
        }, 1, null);
        manageSubscriptions();
    }

    private final JsonRpcSerializer getSerializer() {
        return (JsonRpcSerializer) KoinApplicationKt.getWcKoinApp().OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null);
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public StateFlow<WSSConnectionState> getWssConnectionState() {
        return this.relay.getWssConnectionState();
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public Flow<Object> getOnResubscribe() {
        return this.relay.getOnResubscribe();
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void checkNetworkConnectivity() throws NoInternetConnectionException {
        if (this.relay.isNetworkAvailable().getValue() != null && Intrinsics.EZpvd(this.relay.isNetworkAvailable().getValue(), Boolean.FALSE)) {
            throw new NoInternetConnectionException("Connection error: Please check your Internet connection");
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void publishJsonRpcRequest(@NotNull Topic topic, @NotNull IrnParams irnParams, @NotNull JsonRpcClientSync<?> jsonRpcClientSync, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(jsonRpcClientSync, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            checkNetworkConnectivity();
            try {
                String strSerialize = getSerializer().serialize(jsonRpcClientSync);
                if (strSerialize == null) {
                    throw new IllegalStateException("RelayJsonRpcInteractor: Unknown Request Params");
                }
                if (this.jsonRpcHistory.setRequest(jsonRpcClientSync.getId(), topic, jsonRpcClientSync.getMethod(), strSerialize, TransportType.RELAY)) {
                    String base64String = Base64.toBase64String(this.chaChaPolyCodec.encrypt(topic, strSerialize, envelopeType, participants));
                    RelayConnectionInterface relayConnectionInterface = this.relay;
                    String value = topic.getValue();
                    Intrinsics.copydefault((Object) base64String);
                    RelayInterface.DefaultImpls.publish$default(relayConnectionInterface, value, base64String, JsonRpcMapperKt.toRelay(irnParams), null, new Function1<Result<? extends Relay.Model.Call.Publish.Acknowledgement>, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.publishJsonRpcRequest.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(Result<? extends Relay.Model.Call.Publish.Acknowledgement> result) {
                            m7194invoke(result.m7386unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m7194invoke(@NotNull Object obj) {
                            Function0<Unit> function02 = function0;
                            RelayJsonRpcInteractor relayJsonRpcInteractor = this;
                            Function1<Throwable, Unit> function12 = function1;
                            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                            if (thM7380exceptionOrNullimpl != null) {
                                relayJsonRpcInteractor.logger.error("JsonRpcInteractor: Cannot send the request, error: " + thM7380exceptionOrNullimpl);
                                function12.invoke(new Throwable("Publish error: " + thM7380exceptionOrNullimpl.getMessage()));
                                return;
                            }
                            function02.invoke();
                        }
                    }, 8, null);
                }
            } catch (Exception e) {
                this.logger.error("JsonRpcInteractor: Cannot send the request, exception: " + e);
                function1.invoke(new Throwable("Publish Request Error: " + e));
            }
        } catch (NoConnectivityException e2) {
            function1.invoke(e2);
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void publishJsonRpcResponse(@NotNull Topic topic, @NotNull IrnParams irnParams, @NotNull final JsonRpcResponse jsonRpcResponse, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1, Participants participants, @NotNull EnvelopeType envelopeType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        try {
            checkNetworkConnectivity();
            try {
                final String strSerialize = getSerializer().serialize(jsonRpcResponse);
                if (strSerialize == null) {
                    throw new IllegalStateException("RelayJsonRpcInteractor: Unknown Response Params");
                }
                String base64String = Base64.toBase64String(this.chaChaPolyCodec.encrypt(topic, strSerialize, envelopeType, participants));
                RelayConnectionInterface relayConnectionInterface = this.relay;
                String value = topic.getValue();
                Intrinsics.copydefault((Object) base64String);
                RelayInterface.DefaultImpls.publish$default(relayConnectionInterface, value, base64String, JsonRpcMapperKt.toRelay(irnParams), null, new Function1<Result<? extends Relay.Model.Call.Publish.Acknowledgement>, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.publishJsonRpcResponse.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Result<? extends Relay.Model.Call.Publish.Acknowledgement> result) {
                        m7195invoke(result.m7386unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m7195invoke(@NotNull Object obj) {
                        RelayJsonRpcInteractor relayJsonRpcInteractor = RelayJsonRpcInteractor.this;
                        JsonRpcResponse jsonRpcResponse2 = jsonRpcResponse;
                        String str = strSerialize;
                        Function0<Unit> function02 = function0;
                        Function1<Throwable, Unit> function12 = function1;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                        if (thM7380exceptionOrNullimpl == null) {
                            relayJsonRpcInteractor.jsonRpcHistory.updateRequestWithResponse(jsonRpcResponse2.getId(), str);
                            function02.invoke();
                            return;
                        }
                        relayJsonRpcInteractor.logger.error("JsonRpcInteractor: Cannot send the response, error: " + thM7380exceptionOrNullimpl);
                        function12.invoke(new Throwable("Publish error: " + thM7380exceptionOrNullimpl.getMessage()));
                    }
                }, 8, null);
            } catch (Exception e) {
                this.logger.error("JsonRpcInteractor: Cannot send the response, exception: " + e);
                function1.invoke(new Throwable("Publish Response Error: " + e));
            }
        } catch (NoConnectivityException e2) {
            function1.invoke(e2);
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void subscribe(@NotNull final Topic topic, @NotNull final Function1<? super Topic, Unit> function1, @NotNull final Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        try {
            checkNetworkConnectivity();
            try {
                this.backoffStrategy.shouldBackoff(true);
                RelayInterface.DefaultImpls.subscribe$default(this.relay, topic.getValue(), null, new Function1<Result<? extends Relay.Model.Call.Subscribe.Acknowledgement>, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.subscribe.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.foundation.common.model.Topic, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Result<? extends Relay.Model.Call.Subscribe.Acknowledgement> result) {
                        m7196invoke(result.m7386unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m7196invoke(@NotNull Object obj) {
                        RelayJsonRpcInteractor relayJsonRpcInteractor = RelayJsonRpcInteractor.this;
                        Topic topic2 = topic;
                        Function1<Topic, Unit> function13 = function1;
                        Function1<Throwable, Unit> function14 = function12;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                        if (thM7380exceptionOrNullimpl == null) {
                            relayJsonRpcInteractor.subscriptions.put(topic2.getValue(), ((Relay.Model.Call.Subscribe.Acknowledgement) obj).getResult());
                            function13.invoke(topic2);
                            return;
                        }
                        relayJsonRpcInteractor.logger.error("Subscribe to topic error: " + topic2 + " error: " + thM7380exceptionOrNullimpl);
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Subscribe error: ");
                        sb.append(message);
                        function14.invoke(new Throwable(sb.toString()));
                    }
                }, 2, null);
            } catch (Exception e) {
                this.logger.error("Subscribe to topic error: " + topic + " error: " + e);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Subscribe error: ");
                sb.append(message);
                function12.invoke(new Throwable(sb.toString()));
            }
        } catch (NoConnectivityException e2) {
            function12.invoke(e2);
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void batchSubscribe(@NotNull final List<String> list, @NotNull final Function1<? super List<String>, Unit> function1, @NotNull final Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        try {
            checkNetworkConnectivity();
            if (!list.isEmpty()) {
                this.backoffStrategy.shouldBackoff(true);
                try {
                    RelayInterface.DefaultImpls.batchSubscribe$default(this.relay, list, null, new Function1<Result<? extends Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.batchSubscribe.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> */
                        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(Result<? extends Relay.Model.Call.BatchSubscribe.Acknowledgement> result) {
                            m7193invoke(result.m7386unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m7193invoke(@NotNull Object obj) {
                            RelayJsonRpcInteractor relayJsonRpcInteractor = RelayJsonRpcInteractor.this;
                            List<String> list2 = list;
                            Function1<List<String>, Unit> function13 = function1;
                            Function1<Throwable, Unit> function14 = function12;
                            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                            if (thM7380exceptionOrNullimpl == null) {
                                relayJsonRpcInteractor.subscriptions.putAll(C56424yEw.copydefault(CollectionsKt___CollectionsKt.values(list2, ((Relay.Model.Call.BatchSubscribe.Acknowledgement) obj).getResult())));
                                function13.invoke(list2);
                                return;
                            }
                            relayJsonRpcInteractor.logger.error("Batch subscribe to topics error: " + list2 + " error: " + thM7380exceptionOrNullimpl);
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Batch subscribe error: ");
                            sb.append(message);
                            function14.invoke(new Throwable(sb.toString()));
                        }
                    }, 2, null);
                } catch (Exception e) {
                    this.logger.error("Batch subscribe to topics error: " + list + " error: " + e);
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Batch subscribe error: ");
                    sb.append(message);
                    function12.invoke(new Throwable(sb.toString()));
                }
            }
        } catch (NoConnectivityException e2) {
            function12.invoke(e2);
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void unsubscribe(@NotNull final Topic topic, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            checkNetworkConnectivity();
            if (this.subscriptions.containsKey(topic.getValue())) {
                RelayInterface.DefaultImpls.unsubscribe$default(this.relay, topic.getValue(), new SubscriptionId(String.valueOf(this.subscriptions.get(topic.getValue()))).getId(), null, new Function1<Result<? extends Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.unsubscribe.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Result<? extends Relay.Model.Call.Unsubscribe.Acknowledgement> result) {
                        m7197invoke(result.m7386unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m7197invoke(@NotNull Object obj) {
                        RelayJsonRpcInteractor relayJsonRpcInteractor = RelayJsonRpcInteractor.this;
                        Topic topic2 = topic;
                        Function0<Unit> function02 = function0;
                        Function1<Throwable, Unit> function12 = function1;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                        if (thM7380exceptionOrNullimpl == null) {
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new RelayJsonRpcInteractor$unsubscribe$1$1$1(relayJsonRpcInteractor, topic2, function02, null), 3, null);
                            return;
                        }
                        relayJsonRpcInteractor.logger.error("Unsubscribe to topic: " + topic2 + " error: " + thM7380exceptionOrNullimpl);
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsubscribe error: ");
                        sb.append(message);
                        function12.invoke(new Throwable(sb.toString()));
                    }
                }, 4, null);
            }
        } catch (NoConnectivityException e) {
            function1.invoke(e);
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void respondWithParams(@NotNull WCRequest wCRequest, @NotNull ClientParams clientParams, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull final Function1<? super Throwable, Unit> function1, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(wCRequest, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        publishJsonRpcResponse(wCRequest.getTopic(), irnParams, new JsonRpcResponse.JsonRpcResult(wCRequest.getId(), null, clientParams, 2, null), new Function0<Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithParams.1
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
                function0.invoke();
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithParams.2
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
        }, participants, envelopeType);
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void respondWithParams(long j, @NotNull Topic topic, @NotNull ClientParams clientParams, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull final Function1<? super Throwable, Unit> function1, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        publishJsonRpcResponse(topic, irnParams, new JsonRpcResponse.JsonRpcResult(j, null, clientParams, 2, null), new Function0<Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithParams.3
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
                function0.invoke();
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithParams.4
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
        }, participants, envelopeType);
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void respondWithSuccess(@NotNull WCRequest wCRequest, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants) {
        Intrinsics.checkNotNullParameter(wCRequest, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        try {
            RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcResponse$default(this, wCRequest.getTopic(), irnParams, new JsonRpcResponse.JsonRpcResult(wCRequest.getId(), null, Boolean.TRUE, 2, null), null, new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithSuccess.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
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
                    RelayJsonRpcInteractor.this.handleError("Cannot send the responseWithSuccess, error: " + C56379yDe.AEQbTJ(th));
                }
            }, participants, envelopeType, 8, null);
        } catch (Exception e) {
            handleError("publishFailure; " + C56379yDe.AEQbTJ(e));
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void respondWithError(@NotNull final WCRequest wCRequest, @NotNull Error error, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull final Function1<? super WCRequest, Unit> function1, @NotNull final Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(wCRequest, "");
        Intrinsics.checkNotNullParameter(error, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.logger.error("Responding with error: " + error.getMessage() + ": " + error.getCode());
        try {
            publishJsonRpcResponse(wCRequest.getTopic(), irnParams, new JsonRpcResponse.JsonRpcError(wCRequest.getId(), null, new JsonRpcResponse.Error(error.getCode(), error.getMessage()), 2, null), new Function0<Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithError.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.internal.common.model.WCRequest, kotlin.Unit> */
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
                    function1.invoke(wCRequest);
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithError.2
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
                    function12.invoke(th);
                    this.handleError("Cannot send respondWithError: " + C56379yDe.AEQbTJ(th));
                }
            }, participants, envelopeType);
        } catch (Exception e) {
            handleError("publishFailure; " + C56379yDe.AEQbTJ(e));
        }
    }

    @Override // com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface
    public void respondWithError(long j, @NotNull Topic topic, @NotNull Error error, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(error, "");
        Intrinsics.checkNotNullParameter(irnParams, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.logger.error("Responding with error: " + error.getMessage() + ": " + error.getCode());
        try {
            publishJsonRpcResponse(topic, irnParams, new JsonRpcResponse.JsonRpcError(j, null, new JsonRpcResponse.Error(error.getCode(), error.getMessage()), 2, null), new Function0<Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithError.3
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
                    function0.invoke();
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor.respondWithError.4
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
                    this.handleError("Cannot send respondWithError: " + C56379yDe.AEQbTJ(th));
                }
            }, participants, envelopeType);
        } catch (Exception e) {
            handleError("publishFailure; " + C56379yDe.AEQbTJ(e));
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$manageSubscriptions$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17731(Continuation<? super C17731> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RelayJsonRpcInteractor.this.new C17731(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                final Flow<Relay.Model.Call.Subscription.Request> subscriptionRequest = RelayJsonRpcInteractor.this.relay.getSubscriptionRequest();
                final RelayJsonRpcInteractor relayJsonRpcInteractor = RelayJsonRpcInteractor.this;
                Flow<Subscription> flow = new Flow<Subscription>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(@NotNull FlowCollector<? super Subscription> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = subscriptionRequest.collect(new AnonymousClass2(flowCollector, relayJsonRpcInteractor), continuation);
                        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector $this_unsafeFlow;
                        public final /* synthetic */ RelayJsonRpcInteractor this$0;

                        /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public Object L$0;
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
                        public AnonymousClass2(FlowCollector flowCollector, RelayJsonRpcInteractor relayJsonRpcInteractor) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = relayJsonRpcInteractor;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            Subscription subscription;
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
                                Relay.Model.Call.Subscription.Request request = (Relay.Model.Call.Subscription.Request) obj;
                                if (request.getTag() == 4050) {
                                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                                    subscription = new Subscription(UtilFunctionsKt.getEmpty(c56529yIt), UtilFunctionsKt.getEmpty(c56529yIt), new Topic(""), 0L, UtilFunctionsKt.getEmpty(c56529yIt));
                                } else {
                                    Topic topic = new Topic(request.getSubscriptionTopic());
                                    this.this$0.storePushRequestsIfEnabled(request, topic);
                                    subscription = new Subscription(this.this$0.decryptMessage(topic, request), request.getMessage(), topic, request.getPublishedAt(), request.getAttestation());
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(subscription, anonymousClass1) == objCopydefault) {
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
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RelayJsonRpcInteractor.this);
                this.label = 1;
                if (flow.collect(anonymousClass2, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$manageSubscriptions$1$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ RelayJsonRpcInteractor this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(RelayJsonRpcInteractor relayJsonRpcInteractor) {
                this.this$0 = relayJsonRpcInteractor;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(@NotNull Subscription subscription, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                RelayJsonRpcInteractor$manageSubscriptions$1$2$emit$1 relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1;
                Exception e;
                AnonymousClass2<T> anonymousClass2;
                if (continuation instanceof RelayJsonRpcInteractor$manageSubscriptions$1$2$emit$1) {
                    relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1 = (RelayJsonRpcInteractor$manageSubscriptions$1$2$emit$1) continuation;
                    int i = relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1 = new RelayJsonRpcInteractor$manageSubscriptions$1$2$emit$1(this, continuation);
                    }
                }
                Object obj = relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (subscription.getDecryptedMessage().length() > 0) {
                        try {
                            RelayJsonRpcInteractor relayJsonRpcInteractor = this.this$0;
                            relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1.L$0 = this;
                            relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1.label = 1;
                            if (relayJsonRpcInteractor.manageSubscriptions(subscription, relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            anonymousClass2 = this;
                            anonymousClass2.this$0.handleError("ManSub: " + C56379yDe.AEQbTJ(e));
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    anonymousClass2 = (AnonymousClass2) relayJsonRpcInteractor$manageSubscriptions$1$2$emit$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                    } catch (Exception e3) {
                        e = e3;
                        anonymousClass2.this$0.handleError("ManSub: " + C56379yDe.AEQbTJ(e));
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Subscription) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    public final void manageSubscriptions() {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C17731(null), 3, null);
    }

    public final void storePushRequestsIfEnabled(Relay.Model.Call.Subscription.Request request, Topic topic) {
        final StateFlow<Boolean> arePushNotificationsEnabled = this.pushMessageStorage.getArePushNotificationsEnabled();
        FlowKt.launchIn(FlowKt.onEach(new Flow<Boolean>() { // from class: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$storePushRequestsIfEnabled$$inlined$filter$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = arePushNotificationsEnabled.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$storePushRequestsIfEnabled$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$storePushRequestsIfEnabled$$inlined$filter$1$2$1, reason: invalid class name */
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
                        if (((Boolean) obj).booleanValue()) {
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
        }, new C17832(request, topic, null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$storePushRequestsIfEnabled$2, reason: invalid class name and case insensitive filesystem */
    public static final class C17832 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Relay.Model.Call.Subscription.Request $relayRequest;
        public final /* synthetic */ Topic $topic;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17832(Relay.Model.Call.Subscription.Request request, Topic topic, Continuation<? super C17832> continuation) {
            super(2, continuation);
            this.$relayRequest = request;
            this.$topic = topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RelayJsonRpcInteractor.this.new C17832(this.$relayRequest, this.$topic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C17832) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RelayJsonRpcInteractor relayJsonRpcInteractor;
            Relay.Model.Call.Subscription.Request request;
            Topic topic;
            Iterator it;
            Iterable iterable;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List<Integer> notificationTags = RelayJsonRpcInteractor.this.pushMessageStorage.getNotificationTags();
                Relay.Model.Call.Subscription.Request request2 = this.$relayRequest;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : notificationTags) {
                    if (((Number) obj2).intValue() == request2.getTag()) {
                        arrayList.add(obj2);
                    }
                }
                relayJsonRpcInteractor = RelayJsonRpcInteractor.this;
                request = this.$relayRequest;
                topic = this.$topic;
                it = arrayList.iterator();
                iterable = arrayList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$4;
                Iterable iterable2 = (Iterable) this.L$3;
                topic = (Topic) this.L$2;
                request = (Relay.Model.Call.Subscription.Request) this.L$1;
                relayJsonRpcInteractor = (RelayJsonRpcInteractor) this.L$0;
                C56391yDq.AEQbTJ(obj);
                iterable = iterable2;
            }
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                PushMessagesRepository pushMessagesRepository = relayJsonRpcInteractor.pushMessageStorage;
                byte[] bytes = request.getMessage().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                String strSha256 = UtilsKt.sha256(bytes);
                String value = topic.getValue();
                String message = request.getMessage();
                this.L$0 = relayJsonRpcInteractor;
                this.L$1 = request;
                this.L$2 = topic;
                this.L$3 = iterable;
                this.L$4 = it;
                this.label = 1;
                if (pushMessagesRepository.insertPushMessage(strSha256, value, message, iIntValue, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final String decryptMessage(Topic topic, Relay.Model.Call.Subscription.Request request) {
        try {
            Codec codec = this.chaChaPolyCodec;
            byte[] bArrDecode = Base64.decode(request.getMessage());
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return codec.decrypt(topic, bArrDecode);
        } catch (Exception e) {
            handleError("ManSub: " + C56379yDe.AEQbTJ(e));
            return UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object manageSubscriptions(Subscription subscription, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass2 anonymousClass2;
        Object objM7377constructorimpl;
        Unit unit;
        Object objM7377constructorimpl2;
        Object objM7377constructorimpl3;
        RelayJsonRpcInteractor relayJsonRpcInteractor;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        }
        Object obj = anonymousClass2.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            JsonRpcSerializer serializer = getSerializer();
            String decryptedMessage = subscription.getDecryptedMessage();
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(serializer.getMoshi().adapter(ClientJsonRpc.class).fromJson(decryptedMessage));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            unit = null;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            ClientJsonRpc clientJsonRpc = (ClientJsonRpc) objM7377constructorimpl;
            if (clientJsonRpc != null) {
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = subscription;
                anonymousClass2.label = 1;
                if (handleRequest(clientJsonRpc, subscription, anonymousClass2) == objCopydefault) {
                    return objCopydefault;
                }
                relayJsonRpcInteractor = this;
                unit = Unit.INSTANCE;
            } else {
                JsonRpcSerializer serializer2 = getSerializer();
                String decryptedMessage2 = subscription.getDecryptedMessage();
                try {
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(serializer2.getMoshi().adapter(JsonRpcResponse.JsonRpcResult.class).fromJson(decryptedMessage2));
                } catch (Throwable th2) {
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                    objM7377constructorimpl2 = null;
                }
                JsonRpcResponse.JsonRpcResult jsonRpcResult = (JsonRpcResponse.JsonRpcResult) objM7377constructorimpl2;
                if (jsonRpcResult != null) {
                    Topic topic = subscription.getTopic();
                    anonymousClass2.L$0 = this;
                    anonymousClass2.L$1 = null;
                    anonymousClass2.label = 2;
                    if (handleJsonRpcResult(jsonRpcResult, topic, anonymousClass2) == objCopydefault) {
                        return objCopydefault;
                    }
                    relayJsonRpcInteractor = this;
                    unit = Unit.INSTANCE;
                } else {
                    JsonRpcSerializer serializer3 = getSerializer();
                    String decryptedMessage3 = subscription.getDecryptedMessage();
                    try {
                        Result.Application application5 = Result.Companion;
                        objM7377constructorimpl3 = Result.m7377constructorimpl(serializer3.getMoshi().adapter(JsonRpcResponse.JsonRpcError.class).fromJson(decryptedMessage3));
                    } catch (Throwable th3) {
                        Result.Application application6 = Result.Companion;
                        objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                        objM7377constructorimpl3 = null;
                    }
                    JsonRpcResponse.JsonRpcError jsonRpcError = (JsonRpcResponse.JsonRpcError) objM7377constructorimpl3;
                    if (jsonRpcError != null) {
                        anonymousClass2.L$0 = this;
                        anonymousClass2.L$1 = null;
                        anonymousClass2.label = 3;
                        if (handleJsonRpcError(jsonRpcError, anonymousClass2) == objCopydefault) {
                            return objCopydefault;
                        }
                        relayJsonRpcInteractor = this;
                        unit = Unit.INSTANCE;
                    } else {
                        relayJsonRpcInteractor = this;
                    }
                }
            }
        } else if (i2 == 1) {
            relayJsonRpcInteractor = (RelayJsonRpcInteractor) anonymousClass2.L$0;
            C56391yDq.AEQbTJ(obj);
            unit = Unit.INSTANCE;
        } else if (i2 == 2) {
            relayJsonRpcInteractor = (RelayJsonRpcInteractor) anonymousClass2.L$0;
            C56391yDq.AEQbTJ(obj);
            unit = Unit.INSTANCE;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            relayJsonRpcInteractor = (RelayJsonRpcInteractor) anonymousClass2.L$0;
            C56391yDq.AEQbTJ(obj);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            relayJsonRpcInteractor.handleError("JsonRpcInteractor: Received unknown object type");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleRequest(ClientJsonRpc clientJsonRpc, Subscription subscription, Continuation<? super Unit> continuation) throws Throwable {
        C17721 c17721;
        Unit unit;
        RelayJsonRpcInteractor relayJsonRpcInteractor;
        if (continuation instanceof C17721) {
            c17721 = (C17721) continuation;
            int i = c17721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17721.label = i - Integer.MIN_VALUE;
            } else {
                c17721 = new C17721(continuation);
            }
        }
        Object obj = c17721.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17721.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            JsonRpcHistory jsonRpcHistory = this.jsonRpcHistory;
            long id = clientJsonRpc.getId();
            Topic topic = subscription.getTopic();
            String method = clientJsonRpc.getMethod();
            String decryptedMessage = subscription.getDecryptedMessage();
            TransportType transportType = TransportType.RELAY;
            if (jsonRpcHistory.setRequest(id, topic, method, decryptedMessage, transportType)) {
                ClientParams clientParamsDeserialize = getSerializer().deserialize(clientJsonRpc.getMethod(), subscription.getDecryptedMessage());
                if (clientParamsDeserialize != null) {
                    MutableSharedFlow<WCRequest> mutableSharedFlow = this._clientSyncJsonRpc;
                    WCRequest wCRequest = JsonRpcMapperKt.toWCRequest(subscription, clientJsonRpc, clientParamsDeserialize, transportType);
                    c17721.L$0 = this;
                    c17721.label = 1;
                    if (mutableSharedFlow.emit(wCRequest, c17721) == objCopydefault) {
                        return objCopydefault;
                    }
                    relayJsonRpcInteractor = this;
                } else {
                    unit = null;
                    relayJsonRpcInteractor = this;
                    if (unit == null) {
                        relayJsonRpcInteractor.handleError("JsonRpcInteractor: Unknown request params");
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        relayJsonRpcInteractor = (RelayJsonRpcInteractor) c17721.L$0;
        C56391yDq.AEQbTJ(obj);
        unit = Unit.INSTANCE;
        if (unit == null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleJsonRpcResult(JsonRpcResponse.JsonRpcResult jsonRpcResult, Topic topic, Continuation<? super Unit> continuation) throws Throwable {
        C17711 c17711;
        Unit unit;
        RelayJsonRpcInteractor relayJsonRpcInteractor;
        if (continuation instanceof C17711) {
            c17711 = (C17711) continuation;
            int i = c17711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17711.label = i - Integer.MIN_VALUE;
            } else {
                c17711 = new C17711(continuation);
            }
        }
        Object obj = c17711.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17711.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strSerialize = getSerializer().serialize(jsonRpcResult);
            if (strSerialize == null) {
                handleError("JsonRpcInteractor: Unknown result params");
                return Unit.INSTANCE;
            }
            JsonRpcHistoryRecord jsonRpcHistoryRecordUpdateRequestWithResponse = this.jsonRpcHistory.updateRequestWithResponse(jsonRpcResult.getId(), strSerialize);
            if (jsonRpcHistoryRecordUpdateRequestWithResponse != null) {
                ClientParams clientParamsDeserialize = getSerializer().deserialize(jsonRpcHistoryRecordUpdateRequestWithResponse.getMethod(), jsonRpcHistoryRecordUpdateRequestWithResponse.getBody());
                if (clientParamsDeserialize != null) {
                    JsonRpcResponse.JsonRpcResult jsonRpcResult2 = new JsonRpcResponse.JsonRpcResult(jsonRpcResult.getId(), null, jsonRpcResult.getResult(), 2, null);
                    MutableSharedFlow<WCResponse> mutableSharedFlow = this._peerResponse;
                    WCResponse wCResponse = JsonRpcMapperKt.toWCResponse(jsonRpcHistoryRecordUpdateRequestWithResponse, jsonRpcResult2, clientParamsDeserialize);
                    c17711.L$0 = this;
                    c17711.label = 1;
                    if (mutableSharedFlow.emit(wCResponse, c17711) == objCopydefault) {
                        return objCopydefault;
                    }
                    relayJsonRpcInteractor = this;
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                    relayJsonRpcInteractor = this;
                }
            } else {
                c17711.label = 2;
                if (handleJsonRpcResponsesWithoutStoredRequest(jsonRpcResult, topic, c17711) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            relayJsonRpcInteractor = (RelayJsonRpcInteractor) c17711.L$0;
            C56391yDq.AEQbTJ(obj);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            relayJsonRpcInteractor.handleError("JsonRpcInteractor: Unknown result params");
        }
        return Unit.INSTANCE;
    }

    public final Object handleJsonRpcResponsesWithoutStoredRequest(JsonRpcResponse.JsonRpcResult jsonRpcResult, Topic topic, Continuation<? super Unit> continuation) {
        if (!(jsonRpcResult.getResult() instanceof ChatNotifyResponseAuthParams.ResponseAuth)) {
            return Unit.INSTANCE;
        }
        Object objEmit = this._peerResponse.emit(new WCResponse(topic, UtilFunctionsKt.getEmpty(C56529yIt.KWHzl), jsonRpcResult, (ClientParams) jsonRpcResult.getResult()), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleJsonRpcError(JsonRpcResponse.JsonRpcError jsonRpcError, Continuation<? super Unit> continuation) throws Throwable {
        C17701 c17701;
        Unit unit;
        RelayJsonRpcInteractor relayJsonRpcInteractor;
        if (continuation instanceof C17701) {
            c17701 = (C17701) continuation;
            int i = c17701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17701.label = i - Integer.MIN_VALUE;
            } else {
                c17701 = new C17701(continuation);
            }
        }
        Object obj = c17701.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17701.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strSerialize = getSerializer().serialize(jsonRpcError);
            if (strSerialize == null) {
                handleError("JsonRpcInteractor: Unknown result params");
                return Unit.INSTANCE;
            }
            JsonRpcHistoryRecord jsonRpcHistoryRecordUpdateRequestWithResponse = this.jsonRpcHistory.updateRequestWithResponse(jsonRpcError.getId(), strSerialize);
            if (jsonRpcHistoryRecordUpdateRequestWithResponse != null) {
                ClientParams clientParamsDeserialize = getSerializer().deserialize(jsonRpcHistoryRecordUpdateRequestWithResponse.getMethod(), jsonRpcHistoryRecordUpdateRequestWithResponse.getBody());
                if (clientParamsDeserialize != null) {
                    MutableSharedFlow<WCResponse> mutableSharedFlow = this._peerResponse;
                    WCResponse wCResponse = JsonRpcMapperKt.toWCResponse(jsonRpcHistoryRecordUpdateRequestWithResponse, jsonRpcError, clientParamsDeserialize);
                    c17701.L$0 = this;
                    c17701.label = 1;
                    if (mutableSharedFlow.emit(wCResponse, c17701) == objCopydefault) {
                        return objCopydefault;
                    }
                    relayJsonRpcInteractor = this;
                } else {
                    unit = null;
                    relayJsonRpcInteractor = this;
                    if (unit == null) {
                        relayJsonRpcInteractor.handleError("JsonRpcInteractor: Unknown error params");
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        relayJsonRpcInteractor = (RelayJsonRpcInteractor) c17701.L$0;
        C56391yDq.AEQbTJ(obj);
        unit = Unit.INSTANCE;
        if (unit == null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor$handleError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $errorMessage;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17691(String str, Continuation<? super C17691> continuation) {
            super(2, continuation);
            this.$errorMessage = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RelayJsonRpcInteractor.this.new C17691(this.$errorMessage, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = RelayJsonRpcInteractor.this._internalErrors;
                SDKError sDKError = new SDKError(new Throwable(this.$errorMessage));
                this.label = 1;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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

    public final void handleError(String str) {
        this.logger.error("JsonRpcInteractor error: " + str);
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C17691(str, null), 3, null);
    }
}
