package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.exception.CannotFindSequenceForTopic;
import com.reown.android.internal.common.exception.GenericException;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.InvalidNamespaceException;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.exceptions.NotSettledSessionException;
import com.reown.sign.common.exceptions.UnauthorizedPeerException;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
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
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionUpdateUseCase implements SessionUpdateUseCaseInterface {
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    public SessionUpdateUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionUpdateUseCase$sessionUpdate$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Map<String, EngineDO.Namespace.Session> $namespaces;
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ String $topic;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, Map<String, EngineDO.Namespace.Session> map, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$topic = str;
            this.$namespaces = map;
            this.$onFailure = function1;
            this.$onSuccess = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SessionUpdateUseCase.this.new AnonymousClass2(this.$topic, this.$namespaces, this.$onFailure, this.$onSuccess, continuation);
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
                SessionUpdateUseCase sessionUpdateUseCase = SessionUpdateUseCase.this;
                String str = this.$topic;
                Map<String, EngineDO.Namespace.Session> map = this.$namespaces;
                try {
                    Result.Application application = Result.Companion;
                    sessionUpdateUseCase.validate(str, map);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Map<String, EngineDO.Namespace.Session> map2 = this.$namespaces;
                final SessionUpdateUseCase sessionUpdateUseCase2 = SessionUpdateUseCase.this;
                final String str2 = this.$topic;
                final Function1<Throwable, Unit> function1 = this.$onFailure;
                final Function0<Unit> function0 = this.$onSuccess;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    sessionUpdateUseCase2.logger.error("Error updating namespaces: " + thM7380exceptionOrNullimpl);
                    function1.invoke(thM7380exceptionOrNullimpl);
                } else {
                    final SignRpc.SessionUpdate sessionUpdate = new SignRpc.SessionUpdate(0L, null, null, new SignParams.UpdateNamespacesParams(EngineMapperKt.toMapOfNamespacesVOSession(map2)), 7, null);
                    IrnParams irnParams = new IrnParams(Tags.SESSION_UPDATE, new Ttl(Time.getDayInSeconds()), false, 4, null);
                    try {
                        sessionUpdateUseCase2.logger.log("Sending session update on topic: " + str2);
                        sessionUpdateUseCase2.sessionStorageRepository.insertTempNamespaces(str2, EngineMapperKt.toMapOfNamespacesVOSession(map2), sessionUpdate.getId());
                        RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(sessionUpdateUseCase2.jsonRpcInteractor, new Topic(str2), irnParams, sessionUpdate, null, null, new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionUpdateUseCase$sessionUpdate$2$2$1
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
                                sessionUpdateUseCase2.logger.log("Update sent successfully, topic: " + str2);
                                function0.invoke();
                            }
                        }, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionUpdateUseCase$sessionUpdate$2$2$2
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
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                invoke2(th2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Throwable th2) {
                                Intrinsics.checkNotNullParameter(th2, "");
                                sessionUpdateUseCase2.logger.error("Sending session update error: " + th2 + ", topic: " + str2);
                                sessionUpdateUseCase2.sessionStorageRepository.deleteTempNamespacesByRequestId(sessionUpdate.getId());
                                function1.invoke(th2);
                            }
                        }, 24, null);
                    } catch (Exception e) {
                        sessionUpdateUseCase2.logger.error("Error updating namespaces: " + e);
                        function1.invoke(new GenericException("Error updating namespaces: " + e));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.SessionUpdateUseCaseInterface
    public Object sessionUpdate(@NotNull String str, @NotNull Map<String, EngineDO.Namespace.Session> map, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(str, map, function1, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [89=10, 90=10] */
    public final void validate(String str, Map<String, EngineDO.Namespace.Session> map) throws UnauthorizedPeerException, CannotFindSequenceForTopic, NotSettledSessionException, InvalidNamespaceException {
        if (!this.sessionStorageRepository.isSessionValid(new Topic(str))) {
            this.logger.error("Sending session update error: cannot find sequence for topic: " + str);
            throw new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str);
        }
        SessionVO sessionWithoutMetadataByTopic = this.sessionStorageRepository.getSessionWithoutMetadataByTopic(new Topic(str));
        if (!sessionWithoutMetadataByTopic.isSelfController()) {
            this.logger.error("Sending session update error: unauthorized peer");
            throw new UnauthorizedPeerException(MessagesKt.UNAUTHORIZED_UPDATE_MESSAGE);
        }
        if (!sessionWithoutMetadataByTopic.isAcknowledged()) {
            this.logger.error("Sending session update error: session is not acknowledged");
            throw new NotSettledSessionException(MessagesKt.SESSION_IS_NOT_ACKNOWLEDGED_MESSAGE + str);
        }
        SignValidator signValidator = SignValidator.INSTANCE;
        Map mapOfNamespacesVOSession = EngineMapperKt.toMapOfNamespacesVOSession(map);
        Map<String, Namespace.Proposal> requiredNamespaces = sessionWithoutMetadataByTopic.getRequiredNamespaces();
        if (mapOfNamespacesVOSession.isEmpty()) {
            ValidationError.EmptyNamespaces emptyNamespaces = ValidationError.EmptyNamespaces.INSTANCE;
            this.logger.error("Sending session update error: invalid namespaces " + emptyNamespaces);
            throw new InvalidNamespaceException(emptyNamespaces.getMessage());
        }
        if (!signValidator.areNamespacesKeysProperlyFormatted(mapOfNamespacesVOSession)) {
            ValidationError.UnsupportedNamespaceKey unsupportedNamespaceKey = ValidationError.UnsupportedNamespaceKey.INSTANCE;
            this.logger.error("Sending session update error: invalid namespaces " + unsupportedNamespaceKey);
            throw new InvalidNamespaceException(unsupportedNamespaceKey.getMessage());
        }
        if (!signValidator.areChainsNotEmpty(mapOfNamespacesVOSession)) {
            ValidationError.UnsupportedChains unsupportedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
            this.logger.error("Sending session update error: invalid namespaces " + unsupportedChains);
            throw new InvalidNamespaceException(unsupportedChains.getMessage());
        }
        if (!signValidator.areChainIdsValid(mapOfNamespacesVOSession)) {
            ValidationError.UnsupportedChains unsupportedChains2 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
            this.logger.error("Sending session update error: invalid namespaces " + unsupportedChains2);
            throw new InvalidNamespaceException(unsupportedChains2.getMessage());
        }
        if (!signValidator.areChainsInMatchingNamespace(mapOfNamespacesVOSession)) {
            ValidationError.UnsupportedChains unsupportedChains3 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
            this.logger.error("Sending session update error: invalid namespaces " + unsupportedChains3);
            throw new InvalidNamespaceException(unsupportedChains3.getMessage());
        }
        if (!signValidator.areAccountIdsValid(mapOfNamespacesVOSession)) {
            ValidationError.UserRejectedChains userRejectedChains = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE);
            this.logger.error("Sending session update error: invalid namespaces " + userRejectedChains);
            throw new InvalidNamespaceException(userRejectedChains.getMessage());
        }
        if (!signValidator.areAccountsInMatchingNamespaceAndChains(mapOfNamespacesVOSession)) {
            ValidationError.UserRejectedChains userRejectedChains2 = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE);
            this.logger.error("Sending session update error: invalid namespaces " + userRejectedChains2);
            throw new InvalidNamespaceException(userRejectedChains2.getMessage());
        }
        if (!signValidator.areAllNamespacesApproved(mapOfNamespacesVOSession.keySet(), requiredNamespaces.keySet())) {
            ValidationError.UserRejected userRejected = ValidationError.UserRejected.INSTANCE;
            this.logger.error("Sending session update error: invalid namespaces " + userRejected);
            throw new InvalidNamespaceException(userRejected.getMessage());
        }
        if (!signValidator.areAllMethodsApproved(signValidator.allMethodsWithChains(mapOfNamespacesVOSession), signValidator.allMethodsWithChains(requiredNamespaces))) {
            ValidationError.UserRejectedMethods userRejectedMethods = ValidationError.UserRejectedMethods.INSTANCE;
            this.logger.error("Sending session update error: invalid namespaces " + userRejectedMethods);
            throw new InvalidNamespaceException(userRejectedMethods.getMessage());
        }
        if (signValidator.areAllEventsApproved(signValidator.allEventsWithChains(mapOfNamespacesVOSession), signValidator.allEventsWithChains(requiredNamespaces))) {
            return;
        }
        ValidationError.UserRejectedEvents userRejectedEvents = ValidationError.UserRejectedEvents.INSTANCE;
        this.logger.error("Sending session update error: invalid namespaces " + userRejectedEvents);
        throw new InvalidNamespaceException(userRejectedEvents.getMessage());
    }
}
