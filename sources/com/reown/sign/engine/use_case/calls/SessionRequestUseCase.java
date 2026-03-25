package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.exception.CannotFindSequenceForTopic;
import com.reown.android.internal.common.exception.InvalidExpiryException;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.InvalidRequestException;
import com.reown.sign.common.exceptions.UnauthorizedMethodException;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionRequestVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionRequestUseCase implements SessionRequestUseCaseInterface {
    public final MutableSharedFlow<SDKError> _errors;
    public final String clientId;
    public final SharedFlow<SDKError> errors;
    public final InsertEventUseCase insertEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.SessionRequestUseCaseInterface
    public SharedFlow<SDKError> getErrors() {
        return this.errors;
    }

    public SessionRequestUseCase(@NotNull SessionStorageRepository sessionStorageRepository, @NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(linkModeJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.sessionStorageRepository = sessionStorageRepository;
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.linkModeJsonRpcInteractor = linkModeJsonRpcInteractorInterface;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        this.logger = logger;
        MutableSharedFlow<SDKError> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._errors = mutableSharedFlowMutableSharedFlow$default;
        this.errors = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionRequestUseCase$sessionRequest$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19702 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function1<Long, Unit> $onSuccess;
        public final /* synthetic */ EngineDO.Request $request;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19702(EngineDO.Request request, Function1<? super Throwable, Unit> function1, Function1<? super Long, Unit> function12, Continuation<? super C19702> continuation) {
            super(2, continuation);
            this.$request = request;
            this.$onFailure = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SessionRequestUseCase.this.new C19702(this.$request, this.$onFailure, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19702) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                this.$onFailure.invoke(e);
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (SessionRequestUseCase.this.sessionStorageRepository.isSessionValid(new Topic(this.$request.getTopic()))) {
                    SessionVO sessionWithoutMetadataByTopic = SessionRequestUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(new Topic(this.$request.getTopic()));
                    SessionVO sessionVOM7336copyBsNgfLQ = sessionWithoutMetadataByTopic.m7336copyBsNgfLQ((65215 & 1) != 0 ? sessionWithoutMetadataByTopic.topic : null, (65215 & 2) != 0 ? sessionWithoutMetadataByTopic.expiry : null, (65215 & 4) != 0 ? sessionWithoutMetadataByTopic.relayProtocol : null, (65215 & 8) != 0 ? sessionWithoutMetadataByTopic.relayData : null, (65215 & 16) != 0 ? sessionWithoutMetadataByTopic.controllerKey : null, (65215 & 32) != 0 ? sessionWithoutMetadataByTopic.selfPublicKey : null, (65215 & 64) != 0 ? sessionWithoutMetadataByTopic.selfAppMetaData : null, (65215 & 128) != 0 ? sessionWithoutMetadataByTopic.peerPublicKey : null, (65215 & 256) != 0 ? sessionWithoutMetadataByTopic.peerAppMetaData : SessionRequestUseCase.this.metadataStorageRepository.getByTopicAndType(sessionWithoutMetadataByTopic.getTopic(), AppMetaDataType.PEER), (65215 & 512) != 0 ? sessionWithoutMetadataByTopic.sessionNamespaces : null, (65215 & 1024) != 0 ? sessionWithoutMetadataByTopic.requiredNamespaces : null, (65215 & 2048) != 0 ? sessionWithoutMetadataByTopic.optionalNamespaces : null, (65215 & 4096) != 0 ? sessionWithoutMetadataByTopic.properties : null, (65215 & 8192) != 0 ? sessionWithoutMetadataByTopic.isAcknowledged : false, (65215 & 16384) != 0 ? sessionWithoutMetadataByTopic.pairingTopic : null, (65215 & 32768) != 0 ? sessionWithoutMetadataByTopic.transportType : null);
                    long currentTimeInSeconds = Time.getCurrentTimeInSeconds();
                    CoreValidator coreValidator = CoreValidator.INSTANCE;
                    if (!coreValidator.isExpiryWithinBounds(this.$request.getExpiry())) {
                        SessionRequestUseCase.this.logger.error("Sending session request error: expiry not within bounds");
                        this.$onFailure.invoke(new InvalidExpiryException(null, 1, null));
                        return Unit.INSTANCE;
                    }
                    Expiry expiry = this.$request.getExpiry();
                    if (expiry == null) {
                        expiry = new Expiry(Time.getCurrentTimeInSeconds() + Time.getFiveMinutesInSeconds());
                    }
                    SignValidator signValidator = SignValidator.INSTANCE;
                    EngineDO.Request request = this.$request;
                    SessionRequestUseCase sessionRequestUseCase = SessionRequestUseCase.this;
                    Function1<Throwable, Unit> function1 = this.$onFailure;
                    if (request.getParams().length() != 0 && request.getMethod().length() != 0 && request.getChainId().length() != 0 && request.getTopic().length() != 0 && coreValidator.isChainIdCAIP2Compliant(request.getChainId())) {
                        Map<String, Namespace.Session> sessionNamespaces = SessionRequestUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(new Topic(this.$request.getTopic())).getSessionNamespaces();
                        String chainId = this.$request.getChainId();
                        String method = this.$request.getMethod();
                        SessionRequestUseCase sessionRequestUseCase2 = SessionRequestUseCase.this;
                        Function1<Throwable, Unit> function12 = this.$onFailure;
                        Map mapAllMethodsWithChains = signValidator.allMethodsWithChains(sessionNamespaces);
                        if (mapAllMethodsWithChains.get(method) != null) {
                            Object obj2 = mapAllMethodsWithChains.get(method);
                            Intrinsics.copydefault(obj2);
                            if (((List) obj2).contains(chainId)) {
                                final SignRpc.SessionRequest sessionRequest = new SignRpc.SessionRequest(0L, null, null, new SignParams.SessionRequestParams(new SessionRequestVO(this.$request.getMethod(), this.$request.getParams(), C56443yFo.KWHzl(expiry.getSeconds())), this.$request.getChainId()), 7, null);
                                if (sessionVOM7336copyBsNgfLQ.getTransportType() == TransportType.LINK_MODE && Intrinsics.EZpvd(sessionVOM7336copyBsNgfLQ.getPeerLinkMode(), C56443yFo.KWHzl(true))) {
                                    String peerAppLink = sessionVOM7336copyBsNgfLQ.getPeerAppLink();
                                    if (peerAppLink != null && peerAppLink.length() != 0) {
                                        LinkModeJsonRpcInteractorInterface.DefaultImpls.triggerRequest$default(SessionRequestUseCase.this.linkModeJsonRpcInteractor, sessionRequest, new Topic(this.$request.getTopic()), sessionVOM7336copyBsNgfLQ.getPeerAppLink(), null, 8, null);
                                        InsertEventUseCase insertEventUseCase = SessionRequestUseCase.this.insertEventUseCase;
                                        Props props = new Props("SUCCESS", String.valueOf(Tags.SESSION_REQUEST_LINK_MODE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(sessionRequest.getId()), SessionRequestUseCase.this.clientId, Direction.SENT.getState(), null, 2303, null));
                                        this.label = 1;
                                        if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } else {
                                        this.$onFailure.invoke(new IllegalStateException("App link is missing"));
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    long fiveMinutesInSeconds = Time.getFiveMinutesInSeconds();
                                    long seconds = expiry.getSeconds() - currentTimeInSeconds;
                                    Long lKWHzl = C56443yFo.KWHzl(seconds);
                                    lKWHzl.longValue();
                                    Long l = seconds >= fiveMinutesInSeconds ? lKWHzl : null;
                                    if (l != null) {
                                        fiveMinutesInSeconds = l.longValue();
                                    }
                                    IrnParams irnParams = new IrnParams(Tags.SESSION_REQUEST, new Ttl(fiveMinutesInSeconds), true);
                                    long seconds2 = expiry.getSeconds();
                                    SessionRequestUseCase.this.logger.log("Sending session request on topic: " + this.$request.getTopic() + "}");
                                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = SessionRequestUseCase.this.jsonRpcInteractor;
                                    Topic topic = new Topic(this.$request.getTopic());
                                    final SessionRequestUseCase sessionRequestUseCase3 = SessionRequestUseCase.this;
                                    final EngineDO.Request request2 = this.$request;
                                    final Function1<Long, Unit> function13 = this.$onSuccess;
                                    final long j = seconds2 - currentTimeInSeconds;
                                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionRequestUseCase.sessionRequest.2.3
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
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
                                            sessionRequestUseCase3.logger.log("Session request sent successfully on topic: " + request2.getTopic());
                                            function13.invoke(Long.valueOf(sessionRequest.getId()));
                                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(j, sessionRequestUseCase3, sessionRequest, null), 3, null);
                                        }

                                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionRequestUseCase$sessionRequest$2$3$1, reason: invalid class name */
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ long $requestTtlInSeconds;
                                            public final /* synthetic */ SignRpc.SessionRequest $sessionPayload;
                                            public int label;
                                            public final /* synthetic */ SessionRequestUseCase this$0;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(long j, SessionRequestUseCase sessionRequestUseCase, SignRpc.SessionRequest sessionRequest, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$requestTtlInSeconds = j;
                                                this.this$0 = sessionRequestUseCase;
                                                this.$sessionPayload = sessionRequest;
                                            }

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$requestTtlInSeconds, this.this$0, this.$sessionPayload, continuation);
                                            }

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object objCopydefault = C56442yFn.copydefault();
                                                int i = this.label;
                                                try {
                                                } catch (TimeoutCancellationException e) {
                                                    MutableSharedFlow mutableSharedFlow = this.this$0._errors;
                                                    SDKError sDKError = new SDKError(e);
                                                    this.label = 2;
                                                    if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                                                        return objCopydefault;
                                                    }
                                                }
                                                if (i == 0) {
                                                    C56391yDq.AEQbTJ(obj);
                                                    long millis = TimeUnit.SECONDS.toMillis(this.$requestTtlInSeconds);
                                                    C07831 c07831 = new C07831(this.this$0, this.$sessionPayload, null);
                                                    this.label = 1;
                                                    if (TimeoutKt.withTimeout(millis, c07831, this) == objCopydefault) {
                                                        return objCopydefault;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        if (i != 2) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        C56391yDq.AEQbTJ(obj);
                                                        return Unit.INSTANCE;
                                                    }
                                                    C56391yDq.AEQbTJ(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionRequestUseCase$sessionRequest$2$3$1$1, reason: invalid class name and collision with other inner class name */
                                            public static final class C07831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ SignRpc.SessionRequest $sessionPayload;
                                                public /* synthetic */ Object L$0;
                                                public int label;
                                                public final /* synthetic */ SessionRequestUseCase this$0;

                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C07831(SessionRequestUseCase sessionRequestUseCase, SignRpc.SessionRequest sessionRequest, Continuation<? super C07831> continuation) {
                                                    super(2, continuation);
                                                    this.this$0 = sessionRequestUseCase;
                                                    this.$sessionPayload = sessionRequest;
                                                }

                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                                    C07831 c07831 = new C07831(this.this$0, this.$sessionPayload, continuation);
                                                    c07831.L$0 = obj;
                                                    return c07831;
                                                }

                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                    return ((C07831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                    Object objCopydefault = C56442yFn.copydefault();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        C56391yDq.AEQbTJ(obj);
                                                        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                                                        SessionRequestUseCase sessionRequestUseCase = this.this$0;
                                                        long id = this.$sessionPayload.getId();
                                                        Function1<Result<? extends JsonRpcResponse.JsonRpcResult>, Unit> function1 = new Function1<Result<? extends JsonRpcResponse.JsonRpcResult>, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionRequestUseCase.sessionRequest.2.3.1.1.1
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                            {
                                                                super(1);
                                                            }

                                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* synthetic */ Unit invoke(Result<? extends JsonRpcResponse.JsonRpcResult> result) {
                                                                m7356invoke(result.m7386unboximpl());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                                                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                            public final void m7356invoke(@NotNull Object obj2) {
                                                                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                                                            }
                                                        };
                                                        this.label = 1;
                                                        if (sessionRequestUseCase.collectResponse(id, function1, this) == objCopydefault) {
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
                                    };
                                    final SessionRequestUseCase sessionRequestUseCase4 = SessionRequestUseCase.this;
                                    final Function1<Throwable, Unit> function14 = this.$onFailure;
                                    RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(relayJsonRpcInteractorInterface, topic, irnParams, sessionRequest, null, null, function0, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionRequestUseCase.sessionRequest.2.4
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
                                            sessionRequestUseCase4.logger.error("Sending session request error: " + th);
                                            function14.invoke(th);
                                        }
                                    }, 24, null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        ValidationError.UnauthorizedMethod unauthorizedMethod = ValidationError.UnauthorizedMethod.INSTANCE;
                        sessionRequestUseCase2.logger.error("Sending session request error: unauthorized method, " + unauthorizedMethod.getMessage());
                        function12.invoke(new UnauthorizedMethodException(unauthorizedMethod.getMessage()));
                        return Unit.INSTANCE;
                    }
                    ValidationError.InvalidSessionRequest invalidSessionRequest = ValidationError.InvalidSessionRequest.INSTANCE;
                    sessionRequestUseCase.logger.error("Sending session request error: invalid session request, " + invalidSessionRequest.getMessage());
                    function1.invoke(new InvalidRequestException(invalidSessionRequest.getMessage()));
                    return Unit.INSTANCE;
                }
                this.$onFailure.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + this.$request.getTopic()));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.SessionRequestUseCaseInterface
    public Object sessionRequest(@NotNull EngineDO.Request request, @NotNull Function1<? super Long, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new C19702(request, function12, function1, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.use_case.calls.SessionRequestUseCase */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object collectResponse$default(SessionRequestUseCase sessionRequestUseCase, long j, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<Result<? extends JsonRpcResponse.JsonRpcResult>, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionRequestUseCase.collectResponse.2
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m7355invoke(@NotNull Object obj2) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(Result<? extends JsonRpcResponse.JsonRpcResult> result) {
                    m7355invoke(result.m7386unboximpl());
                    return Unit.INSTANCE;
                }
            };
        }
        return sessionRequestUseCase.collectResponse(j, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectResponse(final long j, final Function1<? super Result<JsonRpcResponse.JsonRpcResult>, Unit> function1, Continuation<? super Unit> continuation) {
        final SharedFlow<WCResponse> peerResponse = this.jsonRpcInteractor.getPeerResponse();
        Object objCollect = new Flow<WCResponse>() { // from class: com.reown.sign.engine.use_case.calls.SessionRequestUseCase$collectResponse$$inlined$filter$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super WCResponse> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect2 = peerResponse.collect(new AnonymousClass2(flowCollector, j), continuation2);
                return objCollect2 == C56442yFn.copydefault() ? objCollect2 : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionRequestUseCase$collectResponse$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ long $id$inlined;
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionRequestUseCase$collectResponse$$inlined$filter$1$2$1, reason: invalid class name */
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
                public AnonymousClass2(FlowCollector flowCollector, long j) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$id$inlined = j;
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
                        if (((WCResponse) obj).getResponse().getId() == this.$id$inlined) {
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
        }.collect(new FlowCollector() { // from class: com.reown.sign.engine.use_case.calls.SessionRequestUseCase.collectResponse.4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((WCResponse) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(@NotNull WCResponse wCResponse, @NotNull Continuation<? super Unit> continuation2) {
                JsonRpcResponse response = wCResponse.getResponse();
                if (response instanceof JsonRpcResponse.JsonRpcResult) {
                    Function1<Result<JsonRpcResponse.JsonRpcResult>, Unit> function12 = function1;
                    Result.Application application = Result.Companion;
                    function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(response)));
                } else if (response instanceof JsonRpcResponse.JsonRpcError) {
                    Function1<Result<JsonRpcResponse.JsonRpcResult>, Unit> function13 = function1;
                    Result.Application application2 = Result.Companion;
                    function13.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Throwable(((JsonRpcResponse.JsonRpcError) response).getErrorMessage())))));
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }
}
