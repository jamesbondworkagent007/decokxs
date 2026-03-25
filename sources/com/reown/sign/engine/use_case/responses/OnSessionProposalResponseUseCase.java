package com.reown.sign.engine.use_case.responses;

import com.reown.android.Core;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionProposalResponseUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final KeyManagementRepository crypto;
    public final SharedFlow<EngineEvent> events;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final PairingControllerInterface pairingController;
    public final ProposalStorageRepository proposalStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionProposalResponseUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull PairingControllerInterface pairingControllerInterface, @NotNull KeyManagementRepository keyManagementRepository, @NotNull ProposalStorageRepository proposalStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.pairingController = pairingControllerInterface;
        this.crypto = keyManagementRepository;
        this.proposalStorageRepository = proposalStorageRepository;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionProposalResponseUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.SessionProposeParams $params;
        public final /* synthetic */ WCResponse $wcResponse;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCResponse wCResponse, SignParams.SessionProposeParams sessionProposeParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$wcResponse = wCResponse;
            this.$params = sessionProposeParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionProposalResponseUseCase.this.new AnonymousClass2(this.$wcResponse, this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                OnSessionProposalResponseUseCase.this.logger.error("Session proposal response received failure on topic: " + this.$wcResponse.getTopic() + ": " + e);
                MutableSharedFlow mutableSharedFlow = OnSessionProposalResponseUseCase.this._events;
                SDKError sDKError = new SDKError(e);
                this.label = 2;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                OnSessionProposalResponseUseCase.this.logger.log("Session proposal response received on topic: " + this.$wcResponse.getTopic());
                Topic topic = this.$wcResponse.getTopic();
                PairingControllerInterface.DefaultImpls.deleteAndUnsubscribePairing$default(OnSessionProposalResponseUseCase.this.pairingController, new Core.Params.Delete(topic.getValue()), null, 2, null);
                JsonRpcResponse response = this.$wcResponse.getResponse();
                if (response instanceof JsonRpcResponse.JsonRpcResult) {
                    OnSessionProposalResponseUseCase.this.logger.log("Session proposal approval received on topic: " + this.$wcResponse.getTopic());
                    String strM7317constructorimpl = PublicKey.m7317constructorimpl(this.$params.getProposer().getPublicKey());
                    Object result = ((JsonRpcResponse.JsonRpcResult) response).getResult();
                    Intrinsics.copydefault(result, "");
                    final Topic topicMo7183generateTopicFromKeyAgreementV_lFtQw = OnSessionProposalResponseUseCase.this.crypto.mo7183generateTopicFromKeyAgreementV_lFtQw(strM7317constructorimpl, PublicKey.m7317constructorimpl(((CoreSignParams.ApprovalParams) result).getResponderPublicKey()));
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionProposalResponseUseCase.this.jsonRpcInteractor;
                    final OnSessionProposalResponseUseCase onSessionProposalResponseUseCase = OnSessionProposalResponseUseCase.this;
                    Function1<Topic, Unit> function1 = new Function1<Topic, Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionProposalResponseUseCase.invoke.2.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Topic topic2) {
                            invoke2(topic2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Topic topic2) {
                            Intrinsics.checkNotNullParameter(topic2, "");
                            onSessionProposalResponseUseCase.logger.log("Session proposal approval subscribed on session topic: " + topicMo7183generateTopicFromKeyAgreementV_lFtQw);
                        }
                    };
                    final OnSessionProposalResponseUseCase onSessionProposalResponseUseCase2 = OnSessionProposalResponseUseCase.this;
                    relayJsonRpcInteractorInterface.subscribe(topicMo7183generateTopicFromKeyAgreementV_lFtQw, function1, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionProposalResponseUseCase.invoke.2.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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

                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionProposalResponseUseCase$invoke$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ Throwable $error;
                            public int label;
                            public final /* synthetic */ OnSessionProposalResponseUseCase this$0;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(OnSessionProposalResponseUseCase onSessionProposalResponseUseCase, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = onSessionProposalResponseUseCase;
                                this.$error = th;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.this$0, this.$error, continuation);
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
                                    SDKError sDKError = new SDKError(this.$error);
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

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable th) {
                            Intrinsics.checkNotNullParameter(th, "");
                            onSessionProposalResponseUseCase2.logger.error("Session proposal approval subscribe error on session topic: " + topicMo7183generateTopicFromKeyAgreementV_lFtQw + " - " + th);
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(onSessionProposalResponseUseCase2, th, null), 3, null);
                        }
                    });
                } else if (response instanceof JsonRpcResponse.JsonRpcError) {
                    OnSessionProposalResponseUseCase.this.proposalStorageRepository.deleteProposal$sign_release(this.$params.getProposer().getPublicKey());
                    OnSessionProposalResponseUseCase.this.logger.log("Session proposal rejection received on topic: " + this.$wcResponse.getTopic());
                    MutableSharedFlow mutableSharedFlow2 = OnSessionProposalResponseUseCase.this._events;
                    EngineDO.SessionRejected sessionRejected = new EngineDO.SessionRejected(topic.getValue(), ((JsonRpcResponse.JsonRpcError) response).getErrorMessage());
                    this.label = 1;
                    if (mutableSharedFlow2.emit(sessionRejected, this) == objCopydefault) {
                        return objCopydefault;
                    }
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
    }

    public final Object invoke(@NotNull WCResponse wCResponse, @NotNull SignParams.SessionProposeParams sessionProposeParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCResponse, sessionProposeParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
