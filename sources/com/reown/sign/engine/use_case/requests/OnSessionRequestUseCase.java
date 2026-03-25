package com.reown.sign.engine.use_case.requests;

import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.exception.Invalid;
import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.android.verify.domain.ResolveAttestationIdUseCase;
import com.reown.android.verify.model.VerifyContext;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.SessionRequestQueueKt;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import com.reown.utils.UtilFunctionsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionRequestUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final String clientId;
    public final SharedFlow<EngineEvent> events;
    public final InsertEventUseCase insertEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final ResolveAttestationIdUseCase resolveAttestationIdUseCase;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionRequestUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull ResolveAttestationIdUseCase resolveAttestationIdUseCase, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(resolveAttestationIdUseCase, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.resolveAttestationIdUseCase = resolveAttestationIdUseCase;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionRequestUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.SessionRequestParams $params;
        public final /* synthetic */ WCRequest $request;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.SessionRequestParams sessionRequestParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$params = sessionRequestParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionRequestUseCase.this.new AnonymousClass2(this.$request, this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Not initialized variable reg: 7, insn: 0x02f2: MOVE (r8 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:72:0x02f2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IrnParams irnParams;
            final AppMetaData appMetaData;
            String empty;
            Redirect redirect;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            boolean z = true;
            try {
            } catch (Exception e) {
                OnSessionRequestUseCase.this.logger.error("Session request received failure on topic: " + this.$request.getTopic() + " - " + e.getMessage());
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionRequestUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot handle a session request: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                MutableSharedFlow mutableSharedFlow = OnSessionRequestUseCase.this._events;
                SDKError sDKError = new SDKError(e);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                IrnParams irnParams2 = new IrnParams(Tags.SESSION_REQUEST_RESPONSE, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                OnSessionRequestUseCase.this.logger.log("Session request received on topic: " + this.$request.getTopic());
                Long expiryTimestamp = this.$params.getRequest().getExpiryTimestamp();
                if (expiryTimestamp != null) {
                    OnSessionRequestUseCase onSessionRequestUseCase = OnSessionRequestUseCase.this;
                    WCRequest wCRequest = this.$request;
                    if (CoreValidator.INSTANCE.isExpired(new Expiry(expiryTimestamp.longValue()))) {
                        onSessionRequestUseCase.logger.error("Session request received failure on topic: " + wCRequest.getTopic() + " - request expired");
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionRequestUseCase.jsonRpcInteractor, wCRequest, Invalid.RequestExpired.INSTANCE, irnParams2, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                }
                SignValidator signValidator = SignValidator.INSTANCE;
                EngineDO.Request engineDO = EngineMapperKt.toEngineDO(this.$params, this.$request.getTopic());
                OnSessionRequestUseCase onSessionRequestUseCase2 = OnSessionRequestUseCase.this;
                WCRequest wCRequest2 = this.$request;
                if (engineDO.getParams().length() != 0 && engineDO.getMethod().length() != 0 && engineDO.getChainId().length() != 0 && engineDO.getTopic().length() != 0 && CoreValidator.INSTANCE.isChainIdCAIP2Compliant(engineDO.getChainId())) {
                    if (!OnSessionRequestUseCase.this.sessionStorageRepository.isSessionValid(this.$request.getTopic())) {
                        OnSessionRequestUseCase.this.logger.error("Session request received failure on topic: " + this.$request.getTopic() + " - invalid session");
                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionRequestUseCase.this.jsonRpcInteractor;
                        WCRequest wCRequest3 = this.$request;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface, wCRequest3, new Uncategorized.NoMatchingTopic("SESSION", wCRequest3.getTopic().getValue()), irnParams2, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    SessionVO sessionWithoutMetadataByTopic = OnSessionRequestUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(this.$request.getTopic());
                    Pair pairOLrzqt = C56390yDp.OLrzqt(sessionWithoutMetadataByTopic.getSessionNamespaces(), OnSessionRequestUseCase.this.metadataStorageRepository.getByTopicAndType(sessionWithoutMetadataByTopic.getTopic(), AppMetaDataType.PEER));
                    Map map = (Map) pairOLrzqt.component1();
                    AppMetaData appMetaData2 = (AppMetaData) pairOLrzqt.component2();
                    String method = this.$params.getRequest().getMethod();
                    String chainId = this.$params.getChainId();
                    OnSessionRequestUseCase onSessionRequestUseCase3 = OnSessionRequestUseCase.this;
                    WCRequest wCRequest4 = this.$request;
                    Map mapAllMethodsWithChains = signValidator.allMethodsWithChains(map);
                    if (mapAllMethodsWithChains.get(method) != null) {
                        Object obj2 = mapAllMethodsWithChains.get(method);
                        Intrinsics.copydefault(obj2);
                        if (((List) obj2).contains(chainId)) {
                            if (this.$request.getTransportType() == TransportType.LINK_MODE) {
                                InsertEventUseCase insertEventUseCase = OnSessionRequestUseCase.this.insertEventUseCase;
                                Props props = new Props("SUCCESS", String.valueOf(Tags.SESSION_REQUEST_LINK_MODE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$request.getId()), OnSessionRequestUseCase.this.clientId, Direction.RECEIVED.getState(), null, 2303, null));
                                this.L$0 = irnParams2;
                                this.L$1 = appMetaData2;
                                this.label = 1;
                                if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            appMetaData = appMetaData2;
                        }
                    }
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionRequestUseCase3.jsonRpcInteractor, wCRequest4, EngineMapperKt.toPeerError(ValidationError.UnauthorizedMethod.INSTANCE), irnParams2, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                }
                ValidationError.InvalidSessionRequest invalidSessionRequest = ValidationError.InvalidSessionRequest.INSTANCE;
                onSessionRequestUseCase2.logger.error("Session request received failure on topic: " + wCRequest2.getTopic() + " - invalid request");
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionRequestUseCase2.jsonRpcInteractor, wCRequest2, EngineMapperKt.toPeerError(invalidSessionRequest), irnParams2, null, null, null, null, 120, null);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            appMetaData = (AppMetaData) this.L$1;
            C56391yDq.AEQbTJ(obj);
            if (appMetaData == null || (empty = appMetaData.getUrl()) == null) {
                empty = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
            }
            String str = empty;
            OnSessionRequestUseCase.this.logger.log("Resolving session request attestation: " + System.currentTimeMillis());
            ResolveAttestationIdUseCase resolveAttestationIdUseCase = OnSessionRequestUseCase.this.resolveAttestationIdUseCase;
            WCRequest wCRequest5 = this.$request;
            if (wCRequest5.getTransportType() != TransportType.LINK_MODE) {
                z = false;
            }
            Boolean boolKWHzl = C56443yFo.KWHzl(z);
            String universal = (appMetaData == null || (redirect = appMetaData.getRedirect()) == null) ? null : redirect.getUniversal();
            final OnSessionRequestUseCase onSessionRequestUseCase4 = OnSessionRequestUseCase.this;
            final SignParams.SessionRequestParams sessionRequestParams = this.$params;
            final WCRequest wCRequest6 = this.$request;
            resolveAttestationIdUseCase.invoke(wCRequest5, str, boolKWHzl, universal, new Function1<VerifyContext, Unit>() { // from class: com.reown.sign.engine.use_case.requests.OnSessionRequestUseCase.invoke.2.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VerifyContext verifyContext) {
                    invoke2(verifyContext);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VerifyContext verifyContext) {
                    Intrinsics.checkNotNullParameter(verifyContext, "");
                    onSessionRequestUseCase4.logger.log("Session request attestation resolved: " + System.currentTimeMillis());
                    onSessionRequestUseCase4.emitSessionRequest(sessionRequestParams, wCRequest6, appMetaData, verifyContext);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.SessionRequestParams sessionRequestParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, sessionRequestParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void emitSessionRequest(SignParams.SessionRequestParams sessionRequestParams, WCRequest wCRequest, AppMetaData appMetaData, VerifyContext verifyContext) {
        EngineDO.SessionRequestEvent sessionRequestEvent;
        Object next;
        EngineDO.SessionRequestEvent sessionRequestEvent2 = new EngineDO.SessionRequestEvent(EngineMapperKt.toEngineDO(sessionRequestParams, wCRequest, appMetaData), EngineMapperKt.toEngineDO(verifyContext));
        if (SessionRequestQueueKt.getSessionRequestEventsQueue().isEmpty()) {
            sessionRequestEvent = sessionRequestEvent2;
        } else {
            Iterator<T> it = SessionRequestQueueKt.getSessionRequestEventsQueue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                EngineDO.SessionRequestEvent sessionRequestEvent3 = (EngineDO.SessionRequestEvent) next;
                if (sessionRequestEvent3.getRequest().getExpiry() == null || !CoreValidator.INSTANCE.isExpired(sessionRequestEvent3.getRequest().getExpiry())) {
                    break;
                }
            }
            sessionRequestEvent = (EngineDO.SessionRequestEvent) next;
            if (sessionRequestEvent == null) {
            }
        }
        SessionRequestQueueKt.getSessionRequestEventsQueue().add(sessionRequestEvent2);
        this.logger.log("Session request received on topic: " + wCRequest.getTopic() + " - emitting");
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(sessionRequestEvent, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionRequestUseCase$emitSessionRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ EngineDO.SessionRequestEvent $event;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EngineDO.SessionRequestEvent sessionRequestEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = sessionRequestEvent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionRequestUseCase.this.new AnonymousClass1(this.$event, continuation);
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
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = OnSessionRequestUseCase.this._events;
                EngineDO.SessionRequestEvent sessionRequestEvent = this.$event;
                this.label = 1;
                if (mutableSharedFlow.emit(sessionRequestEvent, this) == objCopydefault) {
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
