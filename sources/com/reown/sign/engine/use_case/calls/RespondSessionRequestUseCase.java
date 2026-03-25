package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.exception.CannotFindSequenceForTopic;
import com.reown.android.internal.common.exception.RequestExpiredException;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionRequestVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.engine.SessionRequestQueueKt;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.json_rpc.domain.GetPendingJsonRpcHistoryEntryByIdUseCase;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import java.util.Iterator;
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
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RespondSessionRequestUseCase implements RespondSessionRequestUseCaseInterface {
    public final MutableSharedFlow<EngineEvent> _events;
    public final String clientId;
    public final SharedFlow<EngineEvent> events;
    public final GetPendingJsonRpcHistoryEntryByIdUseCase getPendingJsonRpcHistoryEntryByIdUseCase;
    public final InsertEventUseCase insertEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final SessionStorageRepository sessionStorageRepository;
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCase$removePendingSessionRequestAndEmit$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RespondSessionRequestUseCase.this.removePendingSessionRequestAndEmit(0L, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCaseInterface
    public SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public RespondSessionRequestUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull GetPendingJsonRpcHistoryEntryByIdUseCase getPendingJsonRpcHistoryEntryByIdUseCase, @NotNull LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface, @NotNull Logger logger, @NotNull VerifyContextStorageRepository verifyContextStorageRepository, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(getPendingJsonRpcHistoryEntryByIdUseCase, "");
        Intrinsics.checkNotNullParameter(linkModeJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.getPendingJsonRpcHistoryEntryByIdUseCase = getPendingJsonRpcHistoryEntryByIdUseCase;
        this.linkModeJsonRpcInteractor = linkModeJsonRpcInteractorInterface;
        this.logger = logger;
        this.verifyContextStorageRepository = verifyContextStorageRepository;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCase$respondSessionRequest$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JsonRpcResponse $jsonRpcResponse;
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ String $topic;
        public Object L$0;
        public int label;
        public final /* synthetic */ RespondSessionRequestUseCase this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, RespondSessionRequestUseCase respondSessionRequestUseCase, JsonRpcResponse jsonRpcResponse, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$topic = str;
            this.this$0 = respondSessionRequestUseCase;
            this.$jsonRpcResponse = jsonRpcResponse;
            this.$onFailure = function1;
            this.$onSuccess = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$topic, this.this$0, this.$jsonRpcResponse, this.$onFailure, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x01fc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SessionVO sessionVOM7336copyBsNgfLQ;
            SignParams.SessionRequestParams params;
            SessionRequestVO request;
            Long expiryTimestamp;
            InsertEventUseCase insertEventUseCase;
            Props props;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Topic topic = new Topic(this.$topic);
                    if (!this.this$0.sessionStorageRepository.isSessionValid(topic)) {
                        this.this$0.logger.error("Request response -  invalid session: " + this.$topic + ", id: " + this.$jsonRpcResponse.getId());
                        this.$onFailure.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + this.$topic));
                        return Unit.INSTANCE;
                    }
                    SessionVO sessionWithoutMetadataByTopic = this.this$0.sessionStorageRepository.getSessionWithoutMetadataByTopic(topic);
                    sessionVOM7336copyBsNgfLQ = sessionWithoutMetadataByTopic.m7336copyBsNgfLQ((65215 & 1) != 0 ? sessionWithoutMetadataByTopic.topic : null, (65215 & 2) != 0 ? sessionWithoutMetadataByTopic.expiry : null, (65215 & 4) != 0 ? sessionWithoutMetadataByTopic.relayProtocol : null, (65215 & 8) != 0 ? sessionWithoutMetadataByTopic.relayData : null, (65215 & 16) != 0 ? sessionWithoutMetadataByTopic.controllerKey : null, (65215 & 32) != 0 ? sessionWithoutMetadataByTopic.selfPublicKey : null, (65215 & 64) != 0 ? sessionWithoutMetadataByTopic.selfAppMetaData : null, (65215 & 128) != 0 ? sessionWithoutMetadataByTopic.peerPublicKey : null, (65215 & 256) != 0 ? sessionWithoutMetadataByTopic.peerAppMetaData : this.this$0.metadataStorageRepository.getByTopicAndType(sessionWithoutMetadataByTopic.getTopic(), AppMetaDataType.PEER), (65215 & 512) != 0 ? sessionWithoutMetadataByTopic.sessionNamespaces : null, (65215 & 1024) != 0 ? sessionWithoutMetadataByTopic.requiredNamespaces : null, (65215 & 2048) != 0 ? sessionWithoutMetadataByTopic.optionalNamespaces : null, (65215 & 4096) != 0 ? sessionWithoutMetadataByTopic.properties : null, (65215 & 8192) != 0 ? sessionWithoutMetadataByTopic.isAcknowledged : false, (65215 & 16384) != 0 ? sessionWithoutMetadataByTopic.pairingTopic : null, (65215 & 32768) != 0 ? sessionWithoutMetadataByTopic.transportType : null);
                    if (this.this$0.getPendingJsonRpcHistoryEntryByIdUseCase.invoke(this.$jsonRpcResponse.getId()) != null) {
                        Request<SignParams.SessionRequestParams> requestInvoke = this.this$0.getPendingJsonRpcHistoryEntryByIdUseCase.invoke(this.$jsonRpcResponse.getId());
                        if (requestInvoke != null && (params = requestInvoke.getParams()) != null && (request = params.getRequest()) != null && (expiryTimestamp = request.getExpiryTimestamp()) != null) {
                            RespondSessionRequestUseCase respondSessionRequestUseCase = this.this$0;
                            String str = this.$topic;
                            JsonRpcResponse jsonRpcResponse = this.$jsonRpcResponse;
                            if (CoreValidator.INSTANCE.isExpired(new Expiry(expiryTimestamp.longValue()))) {
                                respondSessionRequestUseCase.logger.error("Request Expired: " + str + ", id: " + jsonRpcResponse.getId());
                                throw new RequestExpiredException("This request has expired, id: " + jsonRpcResponse.getId());
                            }
                        }
                        if (sessionVOM7336copyBsNgfLQ.getTransportType() == TransportType.LINK_MODE && Intrinsics.EZpvd(sessionVOM7336copyBsNgfLQ.getPeerLinkMode(), C56443yFo.KWHzl(true))) {
                            String peerAppLink = sessionVOM7336copyBsNgfLQ.getPeerAppLink();
                            if (peerAppLink == null || peerAppLink.length() == 0) {
                                this.$onFailure.invoke(new IllegalStateException("App link is missing"));
                                return Unit.INSTANCE;
                            }
                            RespondSessionRequestUseCase respondSessionRequestUseCase2 = this.this$0;
                            long id = this.$jsonRpcResponse.getId();
                            this.L$0 = sessionVOM7336copyBsNgfLQ;
                            this.label = 1;
                            if (respondSessionRequestUseCase2.removePendingSessionRequestAndEmit(id, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            LinkModeJsonRpcInteractorInterface.DefaultImpls.triggerResponse$default(this.this$0.linkModeJsonRpcInteractor, new Topic(this.$topic), this.$jsonRpcResponse, sessionVOM7336copyBsNgfLQ.getPeerAppLink(), null, null, 24, null);
                            insertEventUseCase = this.this$0.insertEventUseCase;
                            props = new Props("SUCCESS", String.valueOf(Tags.SESSION_REQUEST_LINK_MODE_RESPONSE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$jsonRpcResponse.getId()), this.this$0.clientId, Direction.SENT.getState(), null, 2303, null));
                            this.L$0 = null;
                            this.label = 2;
                            if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                            }
                        } else {
                            IrnParams irnParams = new IrnParams(Tags.SESSION_REQUEST_RESPONSE, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                            this.this$0.logger.log("Sending session request response on topic: " + this.$topic + ", id: " + this.$jsonRpcResponse.getId());
                            RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = this.this$0.jsonRpcInteractor;
                            Topic topic2 = new Topic(this.$topic);
                            final JsonRpcResponse jsonRpcResponse2 = this.$jsonRpcResponse;
                            final Function0<Unit> function0 = this.$onSuccess;
                            final RespondSessionRequestUseCase respondSessionRequestUseCase3 = this.this$0;
                            final String str2 = this.$topic;
                            Function0<Unit> function02 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCase.respondSessionRequest.2.2
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
                                    respondSessionRequestUseCase3.logger.log("Session request response sent successfully on topic: " + str2 + ", id: " + jsonRpcResponse2.getId());
                                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(respondSessionRequestUseCase3, jsonRpcResponse2, null), 3, null);
                                }

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCase$respondSessionRequest$2$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ JsonRpcResponse $jsonRpcResponse;
                                    public int label;
                                    public final /* synthetic */ RespondSessionRequestUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(RespondSessionRequestUseCase respondSessionRequestUseCase, JsonRpcResponse jsonRpcResponse, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.this$0 = respondSessionRequestUseCase;
                                        this.$jsonRpcResponse = jsonRpcResponse;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.this$0, this.$jsonRpcResponse, continuation);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCase$respondSessionRequest$2$2$1$1, reason: invalid class name and collision with other inner class name */
                                    public static final class C07821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ JsonRpcResponse $jsonRpcResponse;
                                        public int label;
                                        public final /* synthetic */ RespondSessionRequestUseCase this$0;

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C07821(RespondSessionRequestUseCase respondSessionRequestUseCase, JsonRpcResponse jsonRpcResponse, Continuation<? super C07821> continuation) {
                                            super(2, continuation);
                                            this.this$0 = respondSessionRequestUseCase;
                                            this.$jsonRpcResponse = jsonRpcResponse;
                                        }

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                            return new C07821(this.this$0, this.$jsonRpcResponse, continuation);
                                        }

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((C07821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object objCopydefault = C56442yFn.copydefault();
                                            int i = this.label;
                                            if (i == 0) {
                                                C56391yDq.AEQbTJ(obj);
                                                RespondSessionRequestUseCase respondSessionRequestUseCase = this.this$0;
                                                long id = this.$jsonRpcResponse.getId();
                                                this.label = 1;
                                                if (respondSessionRequestUseCase.removePendingSessionRequestAndEmit(id, this) == objCopydefault) {
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

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object objCopydefault = C56442yFn.copydefault();
                                        int i = this.label;
                                        if (i == 0) {
                                            C56391yDq.AEQbTJ(obj);
                                            C07821 c07821 = new C07821(this.this$0, this.$jsonRpcResponse, null);
                                            this.label = 1;
                                            if (SupervisorKt.supervisorScope(c07821, this) == objCopydefault) {
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
                            };
                            final RespondSessionRequestUseCase respondSessionRequestUseCase4 = this.this$0;
                            final JsonRpcResponse jsonRpcResponse3 = this.$jsonRpcResponse;
                            final Function1<Throwable, Unit> function1 = this.$onFailure;
                            RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcResponse$default(relayJsonRpcInteractorInterface, topic2, irnParams, jsonRpcResponse2, function02, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCase.respondSessionRequest.2.3
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
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                    invoke2(th);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Throwable th) {
                                    Intrinsics.checkNotNullParameter(th, "");
                                    respondSessionRequestUseCase4.logger.error("Sending session response error: " + th + ", id: " + jsonRpcResponse3.getId());
                                    function1.invoke(th);
                                }
                            }, null, null, 96, null);
                        }
                    } else {
                        this.this$0.logger.error("Request doesn't exist: " + this.$topic + ", id: " + this.$jsonRpcResponse.getId());
                        throw new RequestExpiredException("This request has expired, id: " + this.$jsonRpcResponse.getId());
                    }
                } else if (i == 1) {
                    sessionVOM7336copyBsNgfLQ = (SessionVO) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    LinkModeJsonRpcInteractorInterface.DefaultImpls.triggerResponse$default(this.this$0.linkModeJsonRpcInteractor, new Topic(this.$topic), this.$jsonRpcResponse, sessionVOM7336copyBsNgfLQ.getPeerAppLink(), null, null, 24, null);
                    insertEventUseCase = this.this$0.insertEventUseCase;
                    props = new Props("SUCCESS", String.valueOf(Tags.SESSION_REQUEST_LINK_MODE_RESPONSE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$jsonRpcResponse.getId()), this.this$0.clientId, Direction.SENT.getState(), null, 2303, null));
                    this.L$0 = null;
                    this.label = 2;
                    if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onFailure.invoke(e);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCaseInterface
    public Object respondSessionRequest(@NotNull String str, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(str, this, jsonRpcResponse, function1, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removePendingSessionRequestAndEmit(long j, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        RespondSessionRequestUseCase respondSessionRequestUseCase;
        Object next;
        Object next2;
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
            VerifyContextStorageRepository verifyContextStorageRepository = this.verifyContextStorageRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.J$0 = j;
            anonymousClass1.label = 1;
            if (verifyContextStorageRepository.delete(j, anonymousClass1) == objCopydefault) {
                return objCopydefault;
            }
            respondSessionRequestUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            j = anonymousClass1.J$0;
            respondSessionRequestUseCase = (RespondSessionRequestUseCase) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Iterator<T> it = SessionRequestQueueKt.getSessionRequestEventsQueue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((EngineDO.SessionRequestEvent) next).getRequest().getRequest().getId() == j) {
                break;
            }
        }
        EngineDO.SessionRequestEvent sessionRequestEvent = (EngineDO.SessionRequestEvent) next;
        if (sessionRequestEvent != null) {
            C56443yFo.KWHzl(SessionRequestQueueKt.getSessionRequestEventsQueue().remove(sessionRequestEvent));
        }
        if (!SessionRequestQueueKt.getSessionRequestEventsQueue().isEmpty()) {
            Iterator<T> it2 = SessionRequestQueueKt.getSessionRequestEventsQueue().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                EngineDO.SessionRequestEvent sessionRequestEvent2 = (EngineDO.SessionRequestEvent) next2;
                if (sessionRequestEvent2.getRequest().getExpiry() == null || !CoreValidator.INSTANCE.isExpired(sessionRequestEvent2.getRequest().getExpiry())) {
                    break;
                }
            }
            EngineDO.SessionRequestEvent sessionRequestEvent3 = (EngineDO.SessionRequestEvent) next2;
            if (sessionRequestEvent3 != null) {
                MutableSharedFlow<EngineEvent> mutableSharedFlow = respondSessionRequestUseCase._events;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 2;
                if (mutableSharedFlow.emit(sessionRequestEvent3, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
