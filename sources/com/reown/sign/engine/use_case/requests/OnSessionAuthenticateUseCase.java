package com.reown.sign.engine.use_case.requests;

import com.reown.android.Core;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.exception.Invalid;
import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.EventType;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.android.verify.domain.ResolveAttestationIdUseCase;
import com.reown.android.verify.model.VerifyContext;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
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
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionAuthenticateUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final String clientId;
    public final SharedFlow<EngineEvent> events;
    public final InsertEventUseCase insertEventUseCase;
    public final InsertTelemetryEventUseCase insertTelemetryEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final PairingControllerInterface pairingController;
    public final ResolveAttestationIdUseCase resolveAttestationIdUseCase;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionAuthenticateUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull ResolveAttestationIdUseCase resolveAttestationIdUseCase, @NotNull PairingControllerInterface pairingControllerInterface, @NotNull InsertTelemetryEventUseCase insertTelemetryEventUseCase, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(resolveAttestationIdUseCase, "");
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        Intrinsics.checkNotNullParameter(insertTelemetryEventUseCase, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.resolveAttestationIdUseCase = resolveAttestationIdUseCase;
        this.pairingController = pairingControllerInterface;
        this.insertTelemetryEventUseCase = insertTelemetryEventUseCase;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionAuthenticateUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.SessionAuthenticateParams $authenticateSessionParams;
        public final /* synthetic */ WCRequest $request;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.SessionAuthenticateParams sessionAuthenticateParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$authenticateSessionParams = sessionAuthenticateParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionAuthenticateUseCase.this.new AnonymousClass2(this.$request, this.$authenticateSessionParams, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.reown.android.internal.common.model.IrnParams */
        /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: com.reown.android.internal.common.model.IrnParams */
        /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: com.reown.android.internal.common.model.IrnParams */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0157 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x027c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IrnParams irnParams;
            MutableSharedFlow mutableSharedFlow;
            SDKError sDKError;
            IrnParams irnParams2;
            String str;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                e = e;
                irnParams = "Received session authenticate - expiry error: ";
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C56391yDq.AEQbTJ(obj);
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    String str2 = (String) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    str = str2;
                    ResolveAttestationIdUseCase resolveAttestationIdUseCase = OnSessionAuthenticateUseCase.this.resolveAttestationIdUseCase;
                    WCRequest wCRequest = this.$request;
                    Boolean linkMode = this.$authenticateSessionParams.getLinkMode();
                    String appLink = this.$authenticateSessionParams.getAppLink();
                    final OnSessionAuthenticateUseCase onSessionAuthenticateUseCase = OnSessionAuthenticateUseCase.this;
                    final WCRequest wCRequest2 = this.$request;
                    final SignParams.SessionAuthenticateParams sessionAuthenticateParams = this.$authenticateSessionParams;
                    resolveAttestationIdUseCase.invoke(wCRequest, str, linkMode, appLink, new Function1<VerifyContext, Unit>() { // from class: com.reown.sign.engine.use_case.requests.OnSessionAuthenticateUseCase.invoke.2.2
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
                            onSessionAuthenticateUseCase.emitSessionAuthenticate(wCRequest2, sessionAuthenticateParams, verifyContext);
                        }
                    });
                    return Unit.INSTANCE;
                }
                irnParams2 = (IrnParams) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionAuthenticateUseCase.this.jsonRpcInteractor, this.$request, Invalid.RequestExpired.INSTANCE, irnParams2, null, null, null, null, 120, null);
                    MutableSharedFlow mutableSharedFlow2 = OnSessionAuthenticateUseCase.this._events;
                    SDKError sDKError2 = new SDKError(new Throwable("Received session authenticate - expiry error: " + this.$request.getTopic()));
                    this.L$0 = irnParams2;
                    this.L$1 = null;
                    this.label = 2;
                    return mutableSharedFlow2.emit(sDKError2, this) != objCopydefault ? objCopydefault : Unit.INSTANCE;
                } catch (Exception e2) {
                    e = e2;
                    irnParams = irnParams2;
                    OnSessionAuthenticateUseCase.this.logger.log("Received session authenticate - cannot handle request: " + this.$request.getTopic());
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionAuthenticateUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot handle a auth request: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                    mutableSharedFlow = OnSessionAuthenticateUseCase.this._events;
                    sDKError = new SDKError(e);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
            C56391yDq.AEQbTJ(obj);
            IrnParams irnParams3 = new IrnParams(Tags.SESSION_AUTHENTICATE_RESPONSE_AUTO_REJECT, new Ttl(Time.getDayInSeconds()), false, 4, null);
            OnSessionAuthenticateUseCase.this.logger.log("Received session authenticate: " + this.$request.getTopic());
            try {
            } catch (Exception e3) {
                e = e3;
                irnParams2 = irnParams3;
                irnParams = irnParams2;
                OnSessionAuthenticateUseCase.this.logger.log("Received session authenticate - cannot handle request: " + this.$request.getTopic());
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionAuthenticateUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot handle a auth request: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                mutableSharedFlow = OnSessionAuthenticateUseCase.this._events;
                sDKError = new SDKError(e);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                }
            }
            if (CoreValidator.INSTANCE.isExpired(new Expiry(this.$authenticateSessionParams.getExpiryTimestamp()))) {
                OnSessionAuthenticateUseCase.this.logger.log("Received session authenticate - expiry error: " + this.$request.getTopic());
                Unit unit = Unit.INSTANCE;
                OnSessionAuthenticateUseCase onSessionAuthenticateUseCase2 = OnSessionAuthenticateUseCase.this;
                WCRequest wCRequest3 = this.$request;
                InsertTelemetryEventUseCase insertTelemetryEventUseCase = onSessionAuthenticateUseCase2.insertTelemetryEventUseCase;
                Props props = new Props(null, EventType.Error.AUTHENTICATED_SESSION_EXPIRED, new Properties(null, null, null, null, null, null, null, wCRequest3.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                this.L$0 = irnParams3;
                this.L$1 = unit;
                this.label = 1;
                if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
                    return objCopydefault;
                }
                irnParams2 = irnParams3;
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionAuthenticateUseCase.this.jsonRpcInteractor, this.$request, Invalid.RequestExpired.INSTANCE, irnParams2, null, null, null, null, 120, null);
                MutableSharedFlow mutableSharedFlow22 = OnSessionAuthenticateUseCase.this._events;
                SDKError sDKError22 = new SDKError(new Throwable("Received session authenticate - expiry error: " + this.$request.getTopic()));
                this.L$0 = irnParams2;
                this.L$1 = null;
                this.label = 2;
                if (mutableSharedFlow22.emit(sDKError22, this) != objCopydefault) {
                }
            } else {
                String metadataUrl = this.$authenticateSessionParams.getMetadataUrl();
                PairingControllerInterface.DefaultImpls.setRequestReceived$default(OnSessionAuthenticateUseCase.this.pairingController, new Core.Params.RequestReceived(this.$request.getTopic().getValue()), null, 2, null);
                if (this.$request.getTransportType() == TransportType.LINK_MODE) {
                    InsertEventUseCase insertEventUseCase = OnSessionAuthenticateUseCase.this.insertEventUseCase;
                    Props props2 = new Props("SUCCESS", String.valueOf(Tags.SESSION_AUTHENTICATE_LINK_MODE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$request.getId()), OnSessionAuthenticateUseCase.this.clientId, Direction.RECEIVED.getState(), null, 2303, null));
                    this.L$0 = irnParams3;
                    this.L$1 = metadataUrl;
                    this.label = 3;
                    if (insertEventUseCase.invoke(props2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                str = metadataUrl;
                ResolveAttestationIdUseCase resolveAttestationIdUseCase2 = OnSessionAuthenticateUseCase.this.resolveAttestationIdUseCase;
                WCRequest wCRequest4 = this.$request;
                Boolean linkMode2 = this.$authenticateSessionParams.getLinkMode();
                String appLink2 = this.$authenticateSessionParams.getAppLink();
                final OnSessionAuthenticateUseCase onSessionAuthenticateUseCase3 = OnSessionAuthenticateUseCase.this;
                final WCRequest wCRequest22 = this.$request;
                final SignParams.SessionAuthenticateParams sessionAuthenticateParams2 = this.$authenticateSessionParams;
                resolveAttestationIdUseCase2.invoke(wCRequest4, str, linkMode2, appLink2, new Function1<VerifyContext, Unit>() { // from class: com.reown.sign.engine.use_case.requests.OnSessionAuthenticateUseCase.invoke.2.2
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
                        onSessionAuthenticateUseCase3.emitSessionAuthenticate(wCRequest22, sessionAuthenticateParams2, verifyContext);
                    }
                });
                return Unit.INSTANCE;
            }
        }
    }

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.SessionAuthenticateParams sessionAuthenticateParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, sessionAuthenticateParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionAuthenticateUseCase$emitSessionAuthenticate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.SessionAuthenticateParams $authenticateSessionParams;
        public final /* synthetic */ WCRequest $request;
        public final /* synthetic */ VerifyContext $verifyContext;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WCRequest wCRequest, SignParams.SessionAuthenticateParams sessionAuthenticateParams, VerifyContext verifyContext, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$authenticateSessionParams = sessionAuthenticateParams;
            this.$verifyContext = verifyContext;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionAuthenticateUseCase.this.new AnonymousClass1(this.$request, this.$authenticateSessionParams, this.$verifyContext, continuation);
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
                OnSessionAuthenticateUseCase.this.logger.log("Received session authenticate - emitting: " + this.$request.getTopic());
                MutableSharedFlow mutableSharedFlow = OnSessionAuthenticateUseCase.this._events;
                EngineDO.SessionAuthenticateEvent sessionAuthenticateEvent = new EngineDO.SessionAuthenticateEvent(this.$request.getId(), this.$request.getTopic().getValue(), EngineMapperKt.toEngineDO(this.$authenticateSessionParams.getAuthPayload()), EngineMapperKt.toEngineDO(this.$authenticateSessionParams.getRequester()), this.$authenticateSessionParams.getExpiryTimestamp(), EngineMapperKt.toEngineDO(this.$verifyContext));
                this.label = 1;
                if (mutableSharedFlow.emit(sessionAuthenticateEvent, this) == objCopydefault) {
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

    public final void emitSessionAuthenticate(WCRequest wCRequest, SignParams.SessionAuthenticateParams sessionAuthenticateParams, VerifyContext verifyContext) {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(wCRequest, sessionAuthenticateParams, verifyContext, null), 3, null);
    }
}
