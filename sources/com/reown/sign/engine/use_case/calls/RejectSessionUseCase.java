package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.PeerError;
import com.reown.sign.common.exceptions.SessionProposalExpiredException;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RejectSessionUseCase implements RejectSessionUseCaseInterface {
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final PairingControllerInterface pairingController;
    public final ProposalStorageRepository proposalStorageRepository;
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    public RejectSessionUseCase(@NotNull VerifyContextStorageRepository verifyContextStorageRepository, @NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull ProposalStorageRepository proposalStorageRepository, @NotNull PairingControllerInterface pairingControllerInterface, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.verifyContextStorageRepository = verifyContextStorageRepository;
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.proposalStorageRepository = proposalStorageRepository;
        this.pairingController = pairingControllerInterface;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RejectSessionUseCase$reject$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ String $proposerPublicKey;
        public final /* synthetic */ String $reason;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$proposerPublicKey = str;
            this.$reason = str2;
            this.$onSuccess = function0;
            this.$onFailure = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RejectSessionUseCase.this.new AnonymousClass2(this.$proposerPublicKey, this.$reason, this.$onSuccess, this.$onFailure, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                final ProposalVO proposalByKey$sign_release = RejectSessionUseCase.this.proposalStorageRepository.getProposalByKey$sign_release(this.$proposerPublicKey);
                Expiry expiry = proposalByKey$sign_release.getExpiry();
                if (expiry != null) {
                    RejectSessionUseCase rejectSessionUseCase = RejectSessionUseCase.this;
                    if (CoreValidator.INSTANCE.isExpired(expiry)) {
                        rejectSessionUseCase.logger.error("Proposal expired on reject, topic: " + proposalByKey$sign_release.getPairingTopic().getValue() + ", id: " + proposalByKey$sign_release.getRequestId());
                        throw new SessionProposalExpiredException("Session proposal expired");
                    }
                }
                RejectSessionUseCase.this.logger.log("Sending session rejection, topic: " + proposalByKey$sign_release.getPairingTopic().getValue());
                RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = RejectSessionUseCase.this.jsonRpcInteractor;
                WCRequest sessionProposeRequest = EngineMapperKt.toSessionProposeRequest(proposalByKey$sign_release);
                PeerError.EIP1193.UserRejectedRequest userRejectedRequest = new PeerError.EIP1193.UserRejectedRequest(this.$reason);
                IrnParams irnParams = new IrnParams(Tags.SESSION_PROPOSE_RESPONSE_REJECT, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                final RejectSessionUseCase rejectSessionUseCase2 = RejectSessionUseCase.this;
                final Function0<Unit> function0 = this.$onSuccess;
                final String str = this.$proposerPublicKey;
                Function1<WCRequest, Unit> function1 = new Function1<WCRequest, Unit>() { // from class: com.reown.sign.engine.use_case.calls.RejectSessionUseCase.reject.2.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WCRequest wCRequest) {
                        invoke2(wCRequest);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RejectSessionUseCase$reject$2$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ ProposalVO $proposal;
                        public final /* synthetic */ String $proposerPublicKey;
                        public int label;
                        public final /* synthetic */ RejectSessionUseCase this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(RejectSessionUseCase rejectSessionUseCase, String str, ProposalVO proposalVO, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = rejectSessionUseCase;
                            this.$proposerPublicKey = str;
                            this.$proposal = proposalVO;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, this.$proposerPublicKey, this.$proposal, continuation);
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
                                this.this$0.proposalStorageRepository.deleteProposal$sign_release(this.$proposerPublicKey);
                                VerifyContextStorageRepository verifyContextStorageRepository = this.this$0.verifyContextStorageRepository;
                                long requestId = this.$proposal.getRequestId();
                                this.label = 1;
                                if (verifyContextStorageRepository.delete(requestId, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(obj);
                            }
                            RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.this$0.jsonRpcInteractor, this.$proposal.getPairingTopic(), null, null, 6, null);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull WCRequest wCRequest) {
                        Intrinsics.checkNotNullParameter(wCRequest, "");
                        rejectSessionUseCase2.logger.log("Session rejection sent successfully, topic: " + proposalByKey$sign_release.getPairingTopic().getValue());
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(rejectSessionUseCase2, str, proposalByKey$sign_release, null), 3, null);
                        function0.invoke();
                    }
                };
                final RejectSessionUseCase rejectSessionUseCase3 = RejectSessionUseCase.this;
                final Function1<Throwable, Unit> function12 = this.$onFailure;
                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface, sessionProposeRequest, userRejectedRequest, irnParams, null, null, function1, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.RejectSessionUseCase.reject.2.3
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
                        rejectSessionUseCase3.logger.error("Session rejection sent failure, topic: " + proposalByKey$sign_release.getPairingTopic().getValue() + ". Error: " + th);
                        function12.invoke(th);
                    }
                }, 24, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.RejectSessionUseCaseInterface
    public Object reject(@NotNull String str, @NotNull String str2, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(str, str2, function0, function1, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
