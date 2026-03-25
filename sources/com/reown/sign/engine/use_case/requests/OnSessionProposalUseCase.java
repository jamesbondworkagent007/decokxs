package com.reown.sign.engine.use_case.requests;

import com.reown.android.Core;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.model.EventType;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.android.verify.domain.ResolveAttestationIdUseCase;
import com.reown.android.verify.model.VerifyContext;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C60022zty;
import o.C60058zuh;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionProposalUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final SharedFlow<EngineEvent> events;
    public final InsertTelemetryEventUseCase insertEventUseCase;
    public final InterfaceC56387yDm isAuthenticateEnabled$delegate;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final PairingControllerInterface pairingController;
    public final ProposalStorageRepository proposalStorageRepository;
    public final ResolveAttestationIdUseCase resolveAttestationIdUseCase;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionProposalUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull ProposalStorageRepository proposalStorageRepository, @NotNull ResolveAttestationIdUseCase resolveAttestationIdUseCase, @NotNull PairingControllerInterface pairingControllerInterface, @NotNull InsertTelemetryEventUseCase insertTelemetryEventUseCase, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        Intrinsics.checkNotNullParameter(resolveAttestationIdUseCase, "");
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        Intrinsics.checkNotNullParameter(insertTelemetryEventUseCase, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.proposalStorageRepository = proposalStorageRepository;
        this.resolveAttestationIdUseCase = resolveAttestationIdUseCase;
        this.pairingController = pairingControllerInterface;
        this.insertEventUseCase = insertTelemetryEventUseCase;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.isAuthenticateEnabled$delegate = C56392yDr.copydefault(new Function0<Boolean>() { // from class: com.reown.sign.engine.use_case.requests.OnSessionProposalUseCase.isAuthenticateEnabled.2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                C60022zty c60022ztyOLrzqt = KoinApplicationKt.getWcKoinApp().OLrzqt();
                return (Boolean) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(Boolean.class), C60058zuh.OLrzqt(AndroidCommonDITags.ENABLE_AUTHENTICATE), null);
            }
        });
    }

    public final boolean isAuthenticateEnabled() {
        return ((Boolean) this.isAuthenticateEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionProposalUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.SessionProposeParams $payloadParams;
        public final /* synthetic */ WCRequest $request;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.SessionProposeParams sessionProposeParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$payloadParams = sessionProposeParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionProposalUseCase.this.new AnonymousClass2(this.$request, this.$payloadParams, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [67=5, 68=5, 69=5, 70=5, 60=5, 61=5, 62=5, 63=5] */
        /* JADX WARN: Not initialized variable reg: 14, insn: 0x0793: MOVE (r7 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:145:0x0793 */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0834: MOVE (r7 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:158:0x0834 */
        /* JADX WARN: Removed duplicated region for block: B:161:0x08a6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IrnParams irnParams;
            IrnParams irnParams2;
            MutableSharedFlow mutableSharedFlow;
            SDKError sDKError;
            IrnParams irnParams3;
            IrnParams irnParams4;
            OnSessionProposalUseCase onSessionProposalUseCase;
            WCRequest wCRequest;
            ValidationError validationError;
            ValidationError unsupportedChains;
            OnSessionProposalUseCase onSessionProposalUseCase2;
            IrnParams irnParams5;
            WCRequest wCRequest2;
            ValidationError unsupportedChains2;
            OnSessionProposalUseCase onSessionProposalUseCase3;
            IrnParams irnParams6;
            WCRequest wCRequest3;
            ValidationError unsupportedChains3;
            OnSessionProposalUseCase onSessionProposalUseCase4;
            IrnParams irnParams7;
            WCRequest wCRequest4;
            ValidationError unsupportedChains4;
            OnSessionProposalUseCase onSessionProposalUseCase5;
            IrnParams irnParams8;
            WCRequest wCRequest5;
            ValidationError validationError2;
            OnSessionProposalUseCase onSessionProposalUseCase6;
            IrnParams irnParams9;
            WCRequest wCRequest6;
            ValidationError unsupportedChains5;
            OnSessionProposalUseCase onSessionProposalUseCase7;
            IrnParams irnParams10;
            WCRequest wCRequest7;
            ValidationError unsupportedChains6;
            OnSessionProposalUseCase onSessionProposalUseCase8;
            IrnParams irnParams11;
            WCRequest wCRequest8;
            ValidationError unsupportedChains7;
            OnSessionProposalUseCase onSessionProposalUseCase9;
            IrnParams irnParams12;
            WCRequest wCRequest9;
            ValidationError unsupportedChains8;
            OnSessionProposalUseCase onSessionProposalUseCase10;
            IrnParams irnParams13;
            WCRequest wCRequest10;
            ValidationError validationError3;
            OnSessionProposalUseCase onSessionProposalUseCase11;
            IrnParams irnParams14;
            WCRequest wCRequest11;
            Object objCopydefault = C56442yFn.copydefault();
            try {
                try {
                } catch (Exception e) {
                    e = e;
                    irnParams2 = irnParams;
                    OnSessionProposalUseCase.this.logger.error("Session proposal received error: " + e);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionProposalUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot handle a session proposal: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams2, null, null, null, null, 120, null);
                    mutableSharedFlow = OnSessionProposalUseCase.this._events;
                    sDKError = new SDKError(e);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 12;
                    if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Exception e2) {
                e = e2;
                irnParams2 = irnParams3;
                OnSessionProposalUseCase.this.logger.error("Session proposal received error: " + e);
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionProposalUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot handle a session proposal: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams2, null, null, null, null, 120, null);
                mutableSharedFlow = OnSessionProposalUseCase.this._events;
                sDKError = new SDKError(e);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 12;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    irnParams4 = new IrnParams(Tags.SESSION_PROPOSE_RESPONSE_AUTO_REJECT, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                    if (OnSessionProposalUseCase.this.isSessionAuthenticateImplemented(this.$request)) {
                        OnSessionProposalUseCase.this.logger.error("Session proposal received error: pairing supports authenticated sessions");
                        return Unit.INSTANCE;
                    }
                    OnSessionProposalUseCase.this.logger.log("Session proposal received: " + this.$request.getTopic());
                    SignValidator signValidator = SignValidator.INSTANCE;
                    Map<String, Namespace.Proposal> requiredNamespaces = this.$payloadParams.getRequiredNamespaces();
                    OnSessionProposalUseCase onSessionProposalUseCase12 = OnSessionProposalUseCase.this;
                    WCRequest wCRequest12 = this.$request;
                    boolean z = true;
                    if (!signValidator.areNamespacesKeysProperlyFormatted(requiredNamespaces)) {
                        validationError3 = ValidationError.UnsupportedNamespaceKey.INSTANCE;
                        onSessionProposalUseCase12.logger.error("Session proposal received error: required namespace validation: " + validationError3.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase = onSessionProposalUseCase12.insertEventUseCase;
                        Props props = new Props(null, EventType.Error.REQUIRED_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest12.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase12;
                        this.L$2 = wCRequest12;
                        this.L$3 = validationError3;
                        this.label = 1;
                        if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase11 = onSessionProposalUseCase12;
                        irnParams14 = irnParams4;
                        wCRequest11 = wCRequest12;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase11.jsonRpcInteractor, wCRequest11, EngineMapperKt.toPeerError(validationError3), irnParams14, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainsDefined(requiredNamespaces)) {
                        unsupportedChains8 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE);
                        onSessionProposalUseCase12.logger.error("Session proposal received error: required namespace validation: " + unsupportedChains8.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase2 = onSessionProposalUseCase12.insertEventUseCase;
                        Props props2 = new Props(null, EventType.Error.REQUIRED_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest12.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase12;
                        this.L$2 = wCRequest12;
                        this.L$3 = unsupportedChains8;
                        this.label = 2;
                        if (insertTelemetryEventUseCase2.invoke(props2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase10 = onSessionProposalUseCase12;
                        irnParams13 = irnParams4;
                        wCRequest10 = wCRequest12;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase10.jsonRpcInteractor, wCRequest10, EngineMapperKt.toPeerError(unsupportedChains8), irnParams13, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainsNotEmpty(requiredNamespaces)) {
                        unsupportedChains7 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
                        onSessionProposalUseCase12.logger.error("Session proposal received error: required namespace validation: " + unsupportedChains7.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase3 = onSessionProposalUseCase12.insertEventUseCase;
                        Props props3 = new Props(null, EventType.Error.REQUIRED_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest12.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase12;
                        this.L$2 = wCRequest12;
                        this.L$3 = unsupportedChains7;
                        this.label = 3;
                        if (insertTelemetryEventUseCase3.invoke(props3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase9 = onSessionProposalUseCase12;
                        irnParams12 = irnParams4;
                        wCRequest9 = wCRequest12;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase9.jsonRpcInteractor, wCRequest9, EngineMapperKt.toPeerError(unsupportedChains7), irnParams12, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainIdsValid(requiredNamespaces)) {
                        unsupportedChains6 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                        onSessionProposalUseCase12.logger.error("Session proposal received error: required namespace validation: " + unsupportedChains6.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase4 = onSessionProposalUseCase12.insertEventUseCase;
                        Props props4 = new Props(null, EventType.Error.REQUIRED_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest12.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase12;
                        this.L$2 = wCRequest12;
                        this.L$3 = unsupportedChains6;
                        this.label = 4;
                        if (insertTelemetryEventUseCase4.invoke(props4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase8 = onSessionProposalUseCase12;
                        irnParams11 = irnParams4;
                        wCRequest8 = wCRequest12;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase8.jsonRpcInteractor, wCRequest8, EngineMapperKt.toPeerError(unsupportedChains6), irnParams11, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainsInMatchingNamespace(requiredNamespaces)) {
                        unsupportedChains5 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
                        onSessionProposalUseCase12.logger.error("Session proposal received error: required namespace validation: " + unsupportedChains5.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase5 = onSessionProposalUseCase12.insertEventUseCase;
                        Props props5 = new Props(null, EventType.Error.REQUIRED_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest12.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase12;
                        this.L$2 = wCRequest12;
                        this.L$3 = unsupportedChains5;
                        this.label = 5;
                        if (insertTelemetryEventUseCase5.invoke(props5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase7 = onSessionProposalUseCase12;
                        irnParams10 = irnParams4;
                        wCRequest7 = wCRequest12;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase7.jsonRpcInteractor, wCRequest7, EngineMapperKt.toPeerError(unsupportedChains5), irnParams10, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    Map<String, Namespace.Proposal> optionalNamespaces = this.$payloadParams.getOptionalNamespaces();
                    if (optionalNamespaces == null) {
                        optionalNamespaces = C56424yEw.KWHzl();
                    }
                    OnSessionProposalUseCase onSessionProposalUseCase13 = OnSessionProposalUseCase.this;
                    WCRequest wCRequest13 = this.$request;
                    if (!signValidator.areNamespacesKeysProperlyFormatted(optionalNamespaces)) {
                        validationError2 = ValidationError.UnsupportedNamespaceKey.INSTANCE;
                        onSessionProposalUseCase13.logger.error("Session proposal received error: optional namespace validation: " + validationError2.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase6 = onSessionProposalUseCase13.insertEventUseCase;
                        Props props6 = new Props(null, EventType.Error.OPTIONAL_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest13.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase13;
                        this.L$2 = wCRequest13;
                        this.L$3 = validationError2;
                        this.label = 6;
                        if (insertTelemetryEventUseCase6.invoke(props6, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase6 = onSessionProposalUseCase13;
                        irnParams9 = irnParams4;
                        wCRequest6 = wCRequest13;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase6.jsonRpcInteractor, wCRequest6, EngineMapperKt.toPeerError(validationError2), irnParams9, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainsDefined(optionalNamespaces)) {
                        unsupportedChains4 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE);
                        onSessionProposalUseCase13.logger.error("Session proposal received error: optional namespace validation: " + unsupportedChains4.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase7 = onSessionProposalUseCase13.insertEventUseCase;
                        Props props7 = new Props(null, EventType.Error.OPTIONAL_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest13.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase13;
                        this.L$2 = wCRequest13;
                        this.L$3 = unsupportedChains4;
                        this.label = 7;
                        if (insertTelemetryEventUseCase7.invoke(props7, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase5 = onSessionProposalUseCase13;
                        irnParams8 = irnParams4;
                        wCRequest5 = wCRequest13;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase5.jsonRpcInteractor, wCRequest5, EngineMapperKt.toPeerError(unsupportedChains4), irnParams8, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainsNotEmpty(optionalNamespaces)) {
                        unsupportedChains3 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
                        onSessionProposalUseCase13.logger.error("Session proposal received error: optional namespace validation: " + unsupportedChains3.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase8 = onSessionProposalUseCase13.insertEventUseCase;
                        Props props8 = new Props(null, EventType.Error.OPTIONAL_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest13.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase13;
                        this.L$2 = wCRequest13;
                        this.L$3 = unsupportedChains3;
                        this.label = 8;
                        if (insertTelemetryEventUseCase8.invoke(props8, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase4 = onSessionProposalUseCase13;
                        irnParams7 = irnParams4;
                        wCRequest4 = wCRequest13;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase4.jsonRpcInteractor, wCRequest4, EngineMapperKt.toPeerError(unsupportedChains3), irnParams7, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainIdsValid(optionalNamespaces)) {
                        unsupportedChains2 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                        onSessionProposalUseCase13.logger.error("Session proposal received error: optional namespace validation: " + unsupportedChains2.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase9 = onSessionProposalUseCase13.insertEventUseCase;
                        Props props9 = new Props(null, EventType.Error.OPTIONAL_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest13.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase13;
                        this.L$2 = wCRequest13;
                        this.L$3 = unsupportedChains2;
                        this.label = 9;
                        if (insertTelemetryEventUseCase9.invoke(props9, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase3 = onSessionProposalUseCase13;
                        irnParams6 = irnParams4;
                        wCRequest3 = wCRequest13;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase3.jsonRpcInteractor, wCRequest3, EngineMapperKt.toPeerError(unsupportedChains2), irnParams6, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (!signValidator.areChainsInMatchingNamespace(optionalNamespaces)) {
                        unsupportedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
                        onSessionProposalUseCase13.logger.error("Session proposal received error: optional namespace validation: " + unsupportedChains.getMessage());
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase10 = onSessionProposalUseCase13.insertEventUseCase;
                        Props props10 = new Props(null, EventType.Error.OPTIONAL_NAMESPACE_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest13.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                        this.L$0 = irnParams4;
                        this.L$1 = onSessionProposalUseCase13;
                        this.L$2 = wCRequest13;
                        this.L$3 = unsupportedChains;
                        this.label = 10;
                        if (insertTelemetryEventUseCase10.invoke(props10, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        onSessionProposalUseCase2 = onSessionProposalUseCase13;
                        irnParams5 = irnParams4;
                        wCRequest2 = wCRequest13;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase2.jsonRpcInteractor, wCRequest2, EngineMapperKt.toPeerError(unsupportedChains), irnParams5, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    if (this.$payloadParams.getProperties() != null) {
                        SignParams.SessionProposeParams sessionProposeParams = this.$payloadParams;
                        onSessionProposalUseCase = OnSessionProposalUseCase.this;
                        wCRequest = this.$request;
                        if (sessionProposeParams.getProperties().isEmpty()) {
                            validationError = ValidationError.InvalidSessionProperties.INSTANCE;
                            onSessionProposalUseCase.logger.error("Session proposal received error: session properties validation: " + validationError.getMessage());
                            InsertTelemetryEventUseCase insertTelemetryEventUseCase11 = onSessionProposalUseCase.insertEventUseCase;
                            Props props11 = new Props(null, EventType.Error.SESSION_PROPERTIES_VALIDATION_FAILURE, new Properties(null, null, null, null, null, null, null, wCRequest.getTopic().getValue(), null, null, null, null, 3967, null), 1, null);
                            this.L$0 = irnParams4;
                            this.L$1 = onSessionProposalUseCase;
                            this.L$2 = wCRequest;
                            this.L$3 = validationError;
                            this.label = 11;
                            if (insertTelemetryEventUseCase11.invoke(props11, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(validationError), irnParams4, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    OnSessionProposalUseCase.this.proposalStorageRepository.insertProposal$sign_release(EngineMapperKt.toVO(this.$payloadParams, this.$request.getTopic(), this.$request.getId()));
                    PairingControllerInterface.DefaultImpls.setRequestReceived$default(OnSessionProposalUseCase.this.pairingController, new Core.Params.RequestReceived(this.$request.getTopic().getValue()), null, 2, null);
                    String url = this.$payloadParams.getProposer().getMetadata().getUrl();
                    OnSessionProposalUseCase.this.logger.log("Resolving session proposal attestation: " + System.currentTimeMillis());
                    ResolveAttestationIdUseCase resolveAttestationIdUseCase = OnSessionProposalUseCase.this.resolveAttestationIdUseCase;
                    WCRequest wCRequest14 = this.$request;
                    if (wCRequest14.getTransportType() != TransportType.LINK_MODE) {
                        z = false;
                    }
                    Boolean boolKWHzl = C56443yFo.KWHzl(z);
                    Redirect redirect = this.$payloadParams.getProposer().getMetadata().getRedirect();
                    String universal = redirect != null ? redirect.getUniversal() : null;
                    final OnSessionProposalUseCase onSessionProposalUseCase14 = OnSessionProposalUseCase.this;
                    final SignParams.SessionProposeParams sessionProposeParams2 = this.$payloadParams;
                    final WCRequest wCRequest15 = this.$request;
                    resolveAttestationIdUseCase.invoke(wCRequest14, url, boolKWHzl, universal, new Function1<VerifyContext, Unit>() { // from class: com.reown.sign.engine.use_case.requests.OnSessionProposalUseCase.invoke.2.4
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
                            onSessionProposalUseCase14.logger.log("Session proposal attestation resolved: " + System.currentTimeMillis());
                            EngineDO.SessionProposalEvent sessionProposalEvent = new EngineDO.SessionProposalEvent(EngineMapperKt.toEngineDO(sessionProposeParams2, wCRequest15.getTopic()), EngineMapperKt.toEngineDO(verifyContext));
                            onSessionProposalUseCase14.logger.log("Session proposal received on topic: " + wCRequest15.getTopic() + " - emitting");
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(onSessionProposalUseCase14, sessionProposalEvent, null), 3, null);
                        }

                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionProposalUseCase$invoke$2$4$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ EngineDO.SessionProposalEvent $sessionProposalEvent;
                            public int label;
                            public final /* synthetic */ OnSessionProposalUseCase this$0;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(OnSessionProposalUseCase onSessionProposalUseCase, EngineDO.SessionProposalEvent sessionProposalEvent, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = onSessionProposalUseCase;
                                this.$sessionProposalEvent = sessionProposalEvent;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.this$0, this.$sessionProposalEvent, continuation);
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
                                    MutableSharedFlow mutableSharedFlow = this.this$0._events;
                                    EngineDO.SessionProposalEvent sessionProposalEvent = this.$sessionProposalEvent;
                                    this.label = 1;
                                    if (mutableSharedFlow.emit(sessionProposalEvent, this) == objCopydefault) {
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
                    });
                    return Unit.INSTANCE;
                case 1:
                    validationError3 = (ValidationError) this.L$3;
                    WCRequest wCRequest16 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase15 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams15 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams14 = irnParams15;
                    wCRequest11 = wCRequest16;
                    onSessionProposalUseCase11 = onSessionProposalUseCase15;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase11.jsonRpcInteractor, wCRequest11, EngineMapperKt.toPeerError(validationError3), irnParams14, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 2:
                    unsupportedChains8 = (ValidationError) this.L$3;
                    WCRequest wCRequest17 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase16 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams16 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams13 = irnParams16;
                    wCRequest10 = wCRequest17;
                    onSessionProposalUseCase10 = onSessionProposalUseCase16;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase10.jsonRpcInteractor, wCRequest10, EngineMapperKt.toPeerError(unsupportedChains8), irnParams13, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 3:
                    unsupportedChains7 = (ValidationError) this.L$3;
                    WCRequest wCRequest18 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase17 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams17 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams12 = irnParams17;
                    wCRequest9 = wCRequest18;
                    onSessionProposalUseCase9 = onSessionProposalUseCase17;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase9.jsonRpcInteractor, wCRequest9, EngineMapperKt.toPeerError(unsupportedChains7), irnParams12, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 4:
                    unsupportedChains6 = (ValidationError) this.L$3;
                    WCRequest wCRequest19 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase18 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams18 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams11 = irnParams18;
                    wCRequest8 = wCRequest19;
                    onSessionProposalUseCase8 = onSessionProposalUseCase18;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase8.jsonRpcInteractor, wCRequest8, EngineMapperKt.toPeerError(unsupportedChains6), irnParams11, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 5:
                    unsupportedChains5 = (ValidationError) this.L$3;
                    WCRequest wCRequest20 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase19 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams19 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams10 = irnParams19;
                    wCRequest7 = wCRequest20;
                    onSessionProposalUseCase7 = onSessionProposalUseCase19;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase7.jsonRpcInteractor, wCRequest7, EngineMapperKt.toPeerError(unsupportedChains5), irnParams10, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 6:
                    validationError2 = (ValidationError) this.L$3;
                    WCRequest wCRequest21 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase20 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams20 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams9 = irnParams20;
                    wCRequest6 = wCRequest21;
                    onSessionProposalUseCase6 = onSessionProposalUseCase20;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase6.jsonRpcInteractor, wCRequest6, EngineMapperKt.toPeerError(validationError2), irnParams9, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 7:
                    unsupportedChains4 = (ValidationError) this.L$3;
                    WCRequest wCRequest22 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase21 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams21 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams8 = irnParams21;
                    wCRequest5 = wCRequest22;
                    onSessionProposalUseCase5 = onSessionProposalUseCase21;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase5.jsonRpcInteractor, wCRequest5, EngineMapperKt.toPeerError(unsupportedChains4), irnParams8, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 8:
                    unsupportedChains3 = (ValidationError) this.L$3;
                    WCRequest wCRequest23 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase22 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams22 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams7 = irnParams22;
                    wCRequest4 = wCRequest23;
                    onSessionProposalUseCase4 = onSessionProposalUseCase22;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase4.jsonRpcInteractor, wCRequest4, EngineMapperKt.toPeerError(unsupportedChains3), irnParams7, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 9:
                    unsupportedChains2 = (ValidationError) this.L$3;
                    WCRequest wCRequest24 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase23 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams23 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams6 = irnParams23;
                    wCRequest3 = wCRequest24;
                    onSessionProposalUseCase3 = onSessionProposalUseCase23;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase3.jsonRpcInteractor, wCRequest3, EngineMapperKt.toPeerError(unsupportedChains2), irnParams6, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 10:
                    unsupportedChains = (ValidationError) this.L$3;
                    WCRequest wCRequest25 = (WCRequest) this.L$2;
                    OnSessionProposalUseCase onSessionProposalUseCase24 = (OnSessionProposalUseCase) this.L$1;
                    IrnParams irnParams24 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    irnParams5 = irnParams24;
                    wCRequest2 = wCRequest25;
                    onSessionProposalUseCase2 = onSessionProposalUseCase24;
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase2.jsonRpcInteractor, wCRequest2, EngineMapperKt.toPeerError(unsupportedChains), irnParams5, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 11:
                    validationError = (ValidationError) this.L$3;
                    wCRequest = (WCRequest) this.L$2;
                    onSessionProposalUseCase = (OnSessionProposalUseCase) this.L$1;
                    irnParams4 = (IrnParams) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionProposalUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(validationError), irnParams4, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                case 12:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.SessionProposeParams sessionProposeParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, sessionProposeParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    public final boolean isSessionAuthenticateImplemented(WCRequest wCRequest) {
        String methods;
        Pairing pairingByTopic = this.pairingController.getPairingByTopic(wCRequest.getTopic());
        return pairingByTopic != null && (methods = pairingByTopic.getMethods()) != null && StringsKt__StringsKt.contains$default((CharSequence) methods, (CharSequence) JsonRpcMethod.WC_SESSION_AUTHENTICATE, false, 2, (Object) null) && isAuthenticateEnabled();
    }
}
