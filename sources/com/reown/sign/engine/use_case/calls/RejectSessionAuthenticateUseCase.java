package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.exception.RequestExpiredException;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.SymmetricKey;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.MissingSessionAuthenticateRequest;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.json_rpc.domain.GetPendingSessionAuthenticateRequest;
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
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RejectSessionAuthenticateUseCase implements RejectSessionAuthenticateUseCaseInterface {
    public final String clientId;
    public final KeyManagementRepository crypto;
    public final GetPendingSessionAuthenticateRequest getPendingSessionAuthenticateRequest;
    public final InsertEventUseCase insertEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractor;
    public final Logger logger;
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    public RejectSessionAuthenticateUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull GetPendingSessionAuthenticateRequest getPendingSessionAuthenticateRequest, @NotNull KeyManagementRepository keyManagementRepository, @NotNull VerifyContextStorageRepository verifyContextStorageRepository, @NotNull LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(getPendingSessionAuthenticateRequest, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        Intrinsics.checkNotNullParameter(linkModeJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.getPendingSessionAuthenticateRequest = getPendingSessionAuthenticateRequest;
        this.crypto = keyManagementRepository;
        this.verifyContextStorageRepository = verifyContextStorageRepository;
        this.linkModeJsonRpcInteractor = linkModeJsonRpcInteractorInterface;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase$rejectSessionAuthenticate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ long $id;
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ String $reason;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(long j, Function1<? super Throwable, Unit> function1, String str, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$id = j;
            this.$onFailure = function1;
            this.$reason = str;
            this.$onSuccess = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return RejectSessionAuthenticateUseCase.this.new AnonymousClass2(this.$id, this.$onFailure, this.$reason, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Redirect redirect;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Request<SignParams.SessionAuthenticateParams> requestInvoke$sign_release = RejectSessionAuthenticateUseCase.this.getPendingSessionAuthenticateRequest.invoke$sign_release(this.$id);
                    if (requestInvoke$sign_release == null) {
                        RejectSessionAuthenticateUseCase.this.logger.error(new MissingSessionAuthenticateRequest().getMessage());
                        this.$onFailure.invoke(new MissingSessionAuthenticateRequest());
                        return Unit.INSTANCE;
                    }
                    Expiry expiry = requestInvoke$sign_release.getExpiry();
                    if (expiry != null) {
                        RejectSessionAuthenticateUseCase rejectSessionAuthenticateUseCase = RejectSessionAuthenticateUseCase.this;
                        if (CoreValidator.INSTANCE.isExpired(expiry)) {
                            rejectSessionAuthenticateUseCase.logger.error("Session Authenticate Request Expired: " + requestInvoke$sign_release.getTopic() + ", id: " + requestInvoke$sign_release.getId());
                            throw new RequestExpiredException("This request has expired, id: " + requestInvoke$sign_release.getId());
                        }
                    }
                    JsonRpcResponse.JsonRpcError jsonRpcError = new JsonRpcResponse.JsonRpcError(this.$id, null, new JsonRpcResponse.Error(12001, this.$reason), 2, null);
                    SignParams.SessionAuthenticateParams params = requestInvoke$sign_release.getParams();
                    AppMetaData metadata = params.getRequester().getMetadata();
                    String strM7317constructorimpl = PublicKey.m7317constructorimpl(params.getRequester().getPublicKey());
                    String strMo7181generateAndStoreX25519KeyPairuN_RPug = RejectSessionAuthenticateUseCase.this.crypto.mo7181generateAndStoreX25519KeyPairuN_RPug();
                    String strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I = RejectSessionAuthenticateUseCase.this.crypto.mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(strMo7181generateAndStoreX25519KeyPairuN_RPug, strM7317constructorimpl);
                    final Topic topicFromKey = RejectSessionAuthenticateUseCase.this.crypto.getTopicFromKey(PublicKey.m7316boximpl(strM7317constructorimpl));
                    RejectSessionAuthenticateUseCase.this.crypto.setKey(SymmetricKey.m7238boximpl(strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I), topicFromKey.getValue());
                    if (requestInvoke$sign_release.getTransportType() == TransportType.LINK_MODE && (redirect = metadata.getRedirect()) != null && redirect.getLinkMode()) {
                        Redirect redirect2 = metadata.getRedirect();
                        String universal = redirect2 != null ? redirect2.getUniversal() : null;
                        if (universal != null && universal.length() != 0) {
                            LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface = RejectSessionAuthenticateUseCase.this.linkModeJsonRpcInteractor;
                            Redirect redirect3 = metadata.getRedirect();
                            String universal2 = redirect3 != null ? redirect3.getUniversal() : null;
                            Intrinsics.copydefault((Object) universal2);
                            linkModeJsonRpcInteractorInterface.triggerResponse(topicFromKey, jsonRpcError, universal2, new Participants(strMo7181generateAndStoreX25519KeyPairuN_RPug, strM7317constructorimpl, null), EnvelopeType.ONE);
                            InsertEventUseCase insertEventUseCase = RejectSessionAuthenticateUseCase.this.insertEventUseCase;
                            Props props = new Props("SUCCESS", String.valueOf(Tags.SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_REJECT.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$id), RejectSessionAuthenticateUseCase.this.clientId, Direction.SENT.getState(), null, 2303, null));
                            this.label = 1;
                            if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            this.$onFailure.invoke(new IllegalStateException("App link is missing"));
                            return Unit.INSTANCE;
                        }
                    } else {
                        IrnParams irnParams = new IrnParams(Tags.SESSION_AUTHENTICATE_RESPONSE_REJECT, new Ttl(Time.getDayInSeconds()), false);
                        RejectSessionAuthenticateUseCase.this.logger.log("Sending Session Authenticate Reject on topic: " + topicFromKey);
                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = RejectSessionAuthenticateUseCase.this.jsonRpcInteractor;
                        EnvelopeType envelopeType = EnvelopeType.ONE;
                        Participants participants = new Participants(strMo7181generateAndStoreX25519KeyPairuN_RPug, strM7317constructorimpl, null);
                        final RejectSessionAuthenticateUseCase rejectSessionAuthenticateUseCase2 = RejectSessionAuthenticateUseCase.this;
                        final Function0<Unit> function0 = this.$onSuccess;
                        final long j = this.$id;
                        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase.rejectSessionAuthenticate.2.2
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

                            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase$rejectSessionAuthenticate$2$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ long $id;
                                public int label;
                                public final /* synthetic */ RejectSessionAuthenticateUseCase this$0;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(RejectSessionAuthenticateUseCase rejectSessionAuthenticateUseCase, long j, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = rejectSessionAuthenticateUseCase;
                                    this.$id = j;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$id, continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase$rejectSessionAuthenticate$2$2$1$1, reason: invalid class name and collision with other inner class name */
                                public static final class C07781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ long $id;
                                    public int label;
                                    public final /* synthetic */ RejectSessionAuthenticateUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C07781(RejectSessionAuthenticateUseCase rejectSessionAuthenticateUseCase, long j, Continuation<? super C07781> continuation) {
                                        super(2, continuation);
                                        this.this$0 = rejectSessionAuthenticateUseCase;
                                        this.$id = j;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                        return new C07781(this.this$0, this.$id, continuation);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C07781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object objCopydefault = C56442yFn.copydefault();
                                        int i = this.label;
                                        if (i == 0) {
                                            C56391yDq.AEQbTJ(obj);
                                            VerifyContextStorageRepository verifyContextStorageRepository = this.this$0.verifyContextStorageRepository;
                                            long j = this.$id;
                                            this.label = 1;
                                            if (verifyContextStorageRepository.delete(j, this) == objCopydefault) {
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
                                        C07781 c07781 = new C07781(this.this$0, this.$id, null);
                                        this.label = 1;
                                        if (SupervisorKt.supervisorScope(c07781, this) == objCopydefault) {
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

                            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                rejectSessionAuthenticateUseCase2.logger.log("Session Authenticate Reject Responded on topic: " + topicFromKey);
                                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(rejectSessionAuthenticateUseCase2, j, null), 3, null);
                                function0.invoke();
                            }
                        };
                        final RejectSessionAuthenticateUseCase rejectSessionAuthenticateUseCase3 = RejectSessionAuthenticateUseCase.this;
                        final Function1<Throwable, Unit> function1 = this.$onFailure;
                        final long j2 = this.$id;
                        relayJsonRpcInteractorInterface.publishJsonRpcResponse(topicFromKey, irnParams, jsonRpcError, function02, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase.rejectSessionAuthenticate.2.3
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

                            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase$rejectSessionAuthenticate$2$3$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ long $id;
                                public int label;
                                public final /* synthetic */ RejectSessionAuthenticateUseCase this$0;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(RejectSessionAuthenticateUseCase rejectSessionAuthenticateUseCase, long j, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = rejectSessionAuthenticateUseCase;
                                    this.$id = j;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$id, continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase$rejectSessionAuthenticate$2$3$1$1, reason: invalid class name and collision with other inner class name */
                                public static final class C07791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ long $id;
                                    public int label;
                                    public final /* synthetic */ RejectSessionAuthenticateUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C07791(RejectSessionAuthenticateUseCase rejectSessionAuthenticateUseCase, long j, Continuation<? super C07791> continuation) {
                                        super(2, continuation);
                                        this.this$0 = rejectSessionAuthenticateUseCase;
                                        this.$id = j;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                        return new C07791(this.this$0, this.$id, continuation);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C07791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object objCopydefault = C56442yFn.copydefault();
                                        int i = this.label;
                                        if (i == 0) {
                                            C56391yDq.AEQbTJ(obj);
                                            VerifyContextStorageRepository verifyContextStorageRepository = this.this$0.verifyContextStorageRepository;
                                            long j = this.$id;
                                            this.label = 1;
                                            if (verifyContextStorageRepository.delete(j, this) == objCopydefault) {
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
                                        C07791 c07791 = new C07791(this.this$0, this.$id, null);
                                        this.label = 1;
                                        if (SupervisorKt.supervisorScope(c07791, this) == objCopydefault) {
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
                                rejectSessionAuthenticateUseCase3.logger.error("Session Authenticate Error Responded on topic: " + topicFromKey);
                                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(rejectSessionAuthenticateUseCase3, j2, null), 3, null);
                                function1.invoke(th);
                            }
                        }, participants, envelopeType);
                    }
                } else {
                    if (i != 1) {
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

    @Override // com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCaseInterface
    public Object rejectSessionAuthenticate(long j, @NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(j, function1, str, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
