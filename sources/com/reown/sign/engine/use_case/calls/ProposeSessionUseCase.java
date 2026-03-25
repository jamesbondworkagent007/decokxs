package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Expiration;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.InvalidNamespaceException;
import com.reown.sign.common.exceptions.InvalidPropertiesException;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProposeSessionUseCase implements ProposeSessionUseCaseInterface {
    public final KeyManagementRepository crypto;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final ProposalStorageRepository proposalStorageRepository;
    public final AppMetaData selfAppMetaData;

    public ProposeSessionUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull KeyManagementRepository keyManagementRepository, @NotNull ProposalStorageRepository proposalStorageRepository, @NotNull AppMetaData appMetaData, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.crypto = keyManagementRepository;
        this.proposalStorageRepository = proposalStorageRepository;
        this.selfAppMetaData = appMetaData;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ProposeSessionUseCase$proposeSession$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ Map<String, EngineDO.Namespace.Proposal> $optionalNamespaces;
        public final /* synthetic */ Pairing $pairing;
        public final /* synthetic */ Map<String, String> $properties;
        public final /* synthetic */ Map<String, EngineDO.Namespace.Proposal> $requiredNamespaces;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ProposeSessionUseCase this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Pairing pairing, ProposeSessionUseCase proposeSessionUseCase, Map<String, EngineDO.Namespace.Proposal> map, Map<String, EngineDO.Namespace.Proposal> map2, Map<String, String> map3, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$pairing = pairing;
            this.this$0 = proposeSessionUseCase;
            this.$requiredNamespaces = map;
            this.$optionalNamespaces = map2;
            this.$properties = map3;
            this.$onFailure = function1;
            this.$onSuccess = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$pairing, this.this$0, this.$requiredNamespaces, this.$optionalNamespaces, this.$properties, this.$onFailure, this.$onSuccess, continuation);
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
            Object objM7377constructorimpl;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                RelayProtocolOptions relayProtocolOptions = new RelayProtocolOptions(this.$pairing.getRelayProtocol(), this.$pairing.getRelayData());
                ProposeSessionUseCase proposeSessionUseCase = this.this$0;
                Map<String, EngineDO.Namespace.Proposal> map = this.$requiredNamespaces;
                Map<String, EngineDO.Namespace.Proposal> map2 = this.$optionalNamespaces;
                Map<String, String> map3 = this.$properties;
                try {
                    Result.Application application = Result.Companion;
                    proposeSessionUseCase.validate(map, map2, map3);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                final ProposeSessionUseCase proposeSessionUseCase2 = this.this$0;
                Map<String, EngineDO.Namespace.Proposal> mapKWHzl = this.$requiredNamespaces;
                Map<String, EngineDO.Namespace.Proposal> mapKWHzl2 = this.$optionalNamespaces;
                Map<String, String> map4 = this.$properties;
                final Pairing pairing = this.$pairing;
                final Function1<Throwable, Unit> function1 = this.$onFailure;
                final Function0<Unit> function0 = this.$onSuccess;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    proposeSessionUseCase2.logger.error("Failed to validate session proposal: " + thM7380exceptionOrNullimpl);
                    function1.invoke(thM7380exceptionOrNullimpl);
                } else {
                    Expiry expiry = new Expiry(Expiration.getPROPOSAL_EXPIRY());
                    String strMo7181generateAndStoreX25519KeyPairuN_RPug = proposeSessionUseCase2.crypto.mo7181generateAndStoreX25519KeyPairuN_RPug();
                    List listEZpvd = C56402yEa.EZpvd(relayProtocolOptions);
                    if (mapKWHzl == null) {
                        mapKWHzl = C56424yEw.KWHzl();
                    }
                    Map<String, EngineDO.Namespace.Proposal> map5 = mapKWHzl;
                    if (mapKWHzl2 == null) {
                        mapKWHzl2 = C56424yEw.KWHzl();
                    }
                    SignParams.SessionProposeParams sessionProposeParamsM7345toSessionProposeParams94aGZGE = EngineMapperKt.m7345toSessionProposeParams94aGZGE(listEZpvd, map5, mapKWHzl2, map4, strMo7181generateAndStoreX25519KeyPairuN_RPug, proposeSessionUseCase2.selfAppMetaData, expiry);
                    SignRpc.SessionPropose sessionPropose = new SignRpc.SessionPropose(0L, null, null, sessionProposeParamsM7345toSessionProposeParams94aGZGE, 7, null);
                    proposeSessionUseCase2.proposalStorageRepository.insertProposal$sign_release(EngineMapperKt.toVO(sessionProposeParamsM7345toSessionProposeParams94aGZGE, pairing.getTopic(), sessionPropose.getId()));
                    IrnParams irnParams = new IrnParams(Tags.SESSION_PROPOSE, new Ttl(Time.getFiveMinutesInSeconds()), true);
                    RelayJsonRpcInteractorInterface.DefaultImpls.subscribe$default(proposeSessionUseCase2.jsonRpcInteractor, pairing.getTopic(), null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ProposeSessionUseCase$proposeSession$2$2$1
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
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                            invoke2(th2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable th2) {
                            Intrinsics.checkNotNullParameter(th2, "");
                            function1.invoke(th2);
                        }
                    }, 2, null);
                    proposeSessionUseCase2.logger.log("Sending proposal on topic: " + pairing.getTopic().getValue());
                    RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(proposeSessionUseCase2.jsonRpcInteractor, pairing.getTopic(), irnParams, sessionPropose, null, null, new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.ProposeSessionUseCase$proposeSession$2$2$2
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
                            proposeSessionUseCase2.logger.log("Session proposal sent successfully, topic: " + pairing.getTopic());
                            function0.invoke();
                        }
                    }, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ProposeSessionUseCase$proposeSession$2$2$3
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
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                            invoke2(th2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable th2) {
                            Intrinsics.checkNotNullParameter(th2, "");
                            proposeSessionUseCase2.logger.error("Failed to send a session proposal: " + th2);
                            function1.invoke(th2);
                        }
                    }, 24, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.ProposeSessionUseCaseInterface
    public Object proposeSession(Map<String, EngineDO.Namespace.Proposal> map, Map<String, EngineDO.Namespace.Proposal> map2, Map<String, String> map3, @NotNull Pairing pairing, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(pairing, this, map, map2, map3, function1, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [96=5, 97=5, 89=5, 90=5] */
    public final void validate(Map<String, EngineDO.Namespace.Proposal> map, Map<String, EngineDO.Namespace.Proposal> map2, Map<String, String> map3) throws InvalidPropertiesException, InvalidNamespaceException {
        if (map != null) {
            SignValidator signValidator = SignValidator.INSTANCE;
            Map namespacesVORequired = EngineMapperKt.toNamespacesVORequired(map);
            if (!signValidator.areNamespacesKeysProperlyFormatted(namespacesVORequired)) {
                ValidationError.UnsupportedNamespaceKey unsupportedNamespaceKey = ValidationError.UnsupportedNamespaceKey.INSTANCE;
                this.logger.error("Failed to send a session proposal - required namespaces error: " + unsupportedNamespaceKey);
                throw new InvalidNamespaceException(unsupportedNamespaceKey.getMessage());
            }
            if (!signValidator.areChainsDefined(namespacesVORequired)) {
                ValidationError.UnsupportedChains unsupportedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE);
                this.logger.error("Failed to send a session proposal - required namespaces error: " + unsupportedChains);
                throw new InvalidNamespaceException(unsupportedChains.getMessage());
            }
            if (!signValidator.areChainsNotEmpty(namespacesVORequired)) {
                ValidationError.UnsupportedChains unsupportedChains2 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
                this.logger.error("Failed to send a session proposal - required namespaces error: " + unsupportedChains2);
                throw new InvalidNamespaceException(unsupportedChains2.getMessage());
            }
            if (!signValidator.areChainIdsValid(namespacesVORequired)) {
                ValidationError.UnsupportedChains unsupportedChains3 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                this.logger.error("Failed to send a session proposal - required namespaces error: " + unsupportedChains3);
                throw new InvalidNamespaceException(unsupportedChains3.getMessage());
            }
            if (!signValidator.areChainsInMatchingNamespace(namespacesVORequired)) {
                ValidationError.UnsupportedChains unsupportedChains4 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
                this.logger.error("Failed to send a session proposal - required namespaces error: " + unsupportedChains4);
                throw new InvalidNamespaceException(unsupportedChains4.getMessage());
            }
        }
        if (map2 != null) {
            SignValidator signValidator2 = SignValidator.INSTANCE;
            Map namespacesVOOptional = EngineMapperKt.toNamespacesVOOptional(map2);
            if (!signValidator2.areNamespacesKeysProperlyFormatted(namespacesVOOptional)) {
                ValidationError.UnsupportedNamespaceKey unsupportedNamespaceKey2 = ValidationError.UnsupportedNamespaceKey.INSTANCE;
                this.logger.error("Failed to send a session proposal - optional namespaces error: " + unsupportedNamespaceKey2);
                throw new InvalidNamespaceException(unsupportedNamespaceKey2.getMessage());
            }
            if (!signValidator2.areChainsDefined(namespacesVOOptional)) {
                ValidationError.UnsupportedChains unsupportedChains5 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE);
                this.logger.error("Failed to send a session proposal - optional namespaces error: " + unsupportedChains5);
                throw new InvalidNamespaceException(unsupportedChains5.getMessage());
            }
            if (!signValidator2.areChainsNotEmpty(namespacesVOOptional)) {
                ValidationError.UnsupportedChains unsupportedChains6 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
                this.logger.error("Failed to send a session proposal - optional namespaces error: " + unsupportedChains6);
                throw new InvalidNamespaceException(unsupportedChains6.getMessage());
            }
            if (!signValidator2.areChainIdsValid(namespacesVOOptional)) {
                ValidationError.UnsupportedChains unsupportedChains7 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                this.logger.error("Failed to send a session proposal - optional namespaces error: " + unsupportedChains7);
                throw new InvalidNamespaceException(unsupportedChains7.getMessage());
            }
            if (!signValidator2.areChainsInMatchingNamespace(namespacesVOOptional)) {
                ValidationError.UnsupportedChains unsupportedChains8 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
                this.logger.error("Failed to send a session proposal - optional namespaces error: " + unsupportedChains8);
                throw new InvalidNamespaceException(unsupportedChains8.getMessage());
            }
        }
        if (map3 != null) {
            SignValidator signValidator3 = SignValidator.INSTANCE;
            if (map3.isEmpty()) {
                ValidationError.InvalidSessionProperties invalidSessionProperties = ValidationError.InvalidSessionProperties.INSTANCE;
                this.logger.error("Failed to send a session proposal - session properties error: " + invalidSessionProperties);
                throw new InvalidPropertiesException(invalidSessionProperties.getMessage());
            }
        }
    }
}
