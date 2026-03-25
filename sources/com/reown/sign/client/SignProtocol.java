package com.reown.sign.client;

import com.reown.android.Core;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.codec.Codec;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.di.DatabaseConfig;
import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.CacaoVerifier;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.push_messages.PushMessagesRepository;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.pairing.model.mapper.PairingMapperKt;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.push.notifications.DecryptMessageUseCaseInterface;
import com.reown.android.relay.WSSConnectionState;
import com.reown.android.verify.domain.ResolveAttestationIdUseCase;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.util.Logger;
import com.reown.sign.client.Sign;
import com.reown.sign.client.SignInterface;
import com.reown.sign.client.mapper.ClientMapperKt;
import com.reown.sign.common.adapters.SessionEventVOJsonAdapter;
import com.reown.sign.common.adapters.SessionRequestVOJsonAdapter;
import com.reown.sign.common.exceptions.SignClientAlreadyInitializedException;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionEventVO;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionRequestVO;
import com.reown.sign.di.StorageModuleKt;
import com.reown.sign.engine.domain.SignEngine;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase;
import com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCaseInterface;
import com.reown.sign.engine.use_case.calls.ApproveSessionUseCase;
import com.reown.sign.engine.use_case.calls.ApproveSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.DecryptSignMessageUseCase;
import com.reown.sign.engine.use_case.calls.DisconnectSessionUseCase;
import com.reown.sign.engine.use_case.calls.DisconnectSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.EmitEventUseCase;
import com.reown.sign.engine.use_case.calls.EmitEventUseCaseInterface;
import com.reown.sign.engine.use_case.calls.ExtendSessionUseCase;
import com.reown.sign.engine.use_case.calls.ExtendSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.FormatAuthenticateMessageUseCase;
import com.reown.sign.engine.use_case.calls.FormatAuthenticateMessageUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetListOfVerifyContextsUseCase;
import com.reown.sign.engine.use_case.calls.GetListOfVerifyContextsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetNamespacesFromReCaps;
import com.reown.sign.engine.use_case.calls.GetPairingForSessionAuthenticateUseCase;
import com.reown.sign.engine.use_case.calls.GetPairingsUseCase;
import com.reown.sign.engine.use_case.calls.GetPairingsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetPendingAuthenticateRequestUseCase;
import com.reown.sign.engine.use_case.calls.GetPendingAuthenticateRequestUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetSessionProposalsUseCase;
import com.reown.sign.engine.use_case.calls.GetSessionProposalsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetSessionsUseCase;
import com.reown.sign.engine.use_case.calls.GetSessionsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetVerifyContextByIdUseCase;
import com.reown.sign.engine.use_case.calls.GetVerifyContextByIdUseCaseInterface;
import com.reown.sign.engine.use_case.calls.PairUseCase;
import com.reown.sign.engine.use_case.calls.PairUseCaseInterface;
import com.reown.sign.engine.use_case.calls.PingUseCase;
import com.reown.sign.engine.use_case.calls.PingUseCaseInterface;
import com.reown.sign.engine.use_case.calls.ProposeSessionUseCase;
import com.reown.sign.engine.use_case.calls.ProposeSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCase;
import com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCaseInterface;
import com.reown.sign.engine.use_case.calls.RejectSessionUseCase;
import com.reown.sign.engine.use_case.calls.RejectSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCase;
import com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCaseInterface;
import com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase;
import com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCaseInterface;
import com.reown.sign.engine.use_case.calls.SessionRequestUseCase;
import com.reown.sign.engine.use_case.calls.SessionRequestUseCaseInterface;
import com.reown.sign.engine.use_case.calls.SessionUpdateUseCase;
import com.reown.sign.engine.use_case.calls.SessionUpdateUseCaseInterface;
import com.reown.sign.engine.use_case.requests.OnPingUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionAuthenticateUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionDeleteUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionEventUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionExtendUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionProposalUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionRequestUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionSettleUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionUpdateUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionProposalResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionRequestResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionSettleResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionUpdateResponseUseCase;
import com.reown.sign.json_rpc.domain.DeleteRequestByIdUseCase;
import com.reown.sign.json_rpc.domain.GetPendingJsonRpcHistoryEntryByIdUseCase;
import com.reown.sign.json_rpc.domain.GetPendingRequestsUseCaseByTopic;
import com.reown.sign.json_rpc.domain.GetPendingRequestsUseCaseByTopicInterface;
import com.reown.sign.json_rpc.domain.GetPendingSessionAuthenticateRequest;
import com.reown.sign.json_rpc.domain.GetPendingSessionRequestByTopicUseCase;
import com.reown.sign.json_rpc.domain.GetPendingSessionRequestByTopicUseCaseInterface;
import com.reown.sign.json_rpc.domain.GetPendingSessionRequests;
import com.reown.sign.json_rpc.domain.GetSessionAuthenticateRequest;
import com.reown.sign.json_rpc.domain.GetSessionRequestByIdUseCase;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import com.reown.sign.storage.authenticate.AuthenticateResponseTopicRepository;
import com.reown.sign.storage.link_mode.LinkModeStorageRepository;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import com.reown.utils.UtilFunctionsKt;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC59982ztK;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56524yIo;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60018ztu;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.InterfaceC59997ztZ;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class SignProtocol implements SignInterface {
    public static final Companion Companion = new Companion(null);
    public static final SignProtocol instance = new SignProtocol(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    public AtomicBoolean atomicBoolean;
    public final C60018ztu koinApp;
    public SignEngine signEngine;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SignProtocol(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        this.koinApp = c60018ztu;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:o.ztu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ztu:0x0004: INVOKE  STATIC call: com.reown.android.internal.common.KoinApplicationKt.getWcKoinApp():o.ztu A[MD:():o.ztu (m), WRAPPED] (LINE:31)) : (r1v0 o.ztu))
 A[MD:(o.ztu):void (m)] (LINE:31) call: com.reown.sign.client.SignProtocol.<init>(o.ztu):void type: THIS */
    public /* synthetic */ SignProtocol(C60018ztu c60018ztu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KoinApplicationKt.getWcKoinApp() : c60018ztu);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.client.SignProtocol.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final SignProtocol getInstance() {
            return SignProtocol.instance;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void initialize(@NotNull Sign.Params.Init init, @NotNull Function0<Unit> function0, @NotNull Function1<? super Sign.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(init, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.signEngine == null) {
            try {
                SignEngine signEngine = null;
                this.koinApp.EZpvd(C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.sign.di.SignJsonRpcModuleKt.signJsonRpcModule.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                        invoke2(c59991ztT);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C59991ztT c59991ztT) {
                        Intrinsics.checkNotNullParameter(c59991ztT, "");
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionPropose.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionPing.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionEvent.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionUpdate.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionRequest.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionDelete.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionSettle.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionExtend.class));
                        UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(SignRpc.SessionAuthenticate.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_PROPOSE, C56524yIo.AEQbTJ(SignRpc.SessionPropose.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_SETTLE, C56524yIo.AEQbTJ(SignRpc.SessionSettle.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_REQUEST, C56524yIo.AEQbTJ(SignRpc.SessionRequest.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_DELETE, C56524yIo.AEQbTJ(SignRpc.SessionDelete.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_PING, C56524yIo.AEQbTJ(SignRpc.SessionPing.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_EVENT, C56524yIo.AEQbTJ(SignRpc.SessionEvent.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_UPDATE, C56524yIo.AEQbTJ(SignRpc.SessionUpdate.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_EXTEND, C56524yIo.AEQbTJ(SignRpc.SessionExtend.class));
                        UtilFunctionsKt.addDeserializerEntry(c59991ztT, JsonRpcMethod.WC_SESSION_AUTHENTICATE, C56524yIo.AEQbTJ(SignRpc.SessionAuthenticate.class));
                        UtilFunctionsKt.addJsonAdapter(c59991ztT, SessionEventVO.class, C07591.INSTANCE);
                        UtilFunctionsKt.addJsonAdapter(c59991ztT, SessionRequestVO.class, AnonymousClass2.INSTANCE);
                    }

                    /* JADX INFO: renamed from: com.reown.sign.di.SignJsonRpcModuleKt$signJsonRpcModule$1$1, reason: invalid class name and collision with other inner class name */
                    public final /* synthetic */ class C07591 extends FunctionReferenceImpl implements Function1<Moshi, SessionEventVOJsonAdapter> {
                        public static final C07591 INSTANCE = new C07591();

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public C07591() {
                            super(1, SessionEventVOJsonAdapter.class, "<init>", "<init>(Lcom/squareup/moshi/Moshi;)V", 0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        public final SessionEventVOJsonAdapter invoke(@NotNull Moshi moshi) {
                            Intrinsics.checkNotNullParameter(moshi, "");
                            return new SessionEventVOJsonAdapter(moshi);
                        }
                    }

                    /* JADX INFO: renamed from: com.reown.sign.di.SignJsonRpcModuleKt$signJsonRpcModule$1$2, reason: invalid class name */
                    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Moshi, SessionRequestVOJsonAdapter> {
                        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public AnonymousClass2() {
                            super(1, SessionRequestVOJsonAdapter.class, "<init>", "<init>(Lcom/squareup/moshi/Moshi;)V", 0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        public final SessionRequestVOJsonAdapter invoke(@NotNull Moshi moshi) {
                            Intrinsics.checkNotNullParameter(moshi, "");
                            return new SessionRequestVOJsonAdapter(moshi);
                        }
                    }
                }, 1, null), StorageModuleKt.storageModule(((DatabaseConfig) this.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(DatabaseConfig.class), null, null)).getSIGN_SDK_DB_NAME()), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                        invoke2(c59991ztT);
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Class process forced to load method for inline: com.reown.sign.di.CallsModuleKt.callsModule():o.ztT */
                    /* JADX DEBUG: Class process forced to load method for inline: com.reown.sign.di.RequestsModuleKt.requestsModule():o.ztT */
                    /* JADX DEBUG: Class process forced to load method for inline: com.reown.sign.di.ResponsesModuleKt.responsesModule():o.ztT */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C59991ztT c59991ztT) {
                        Intrinsics.checkNotNullParameter(c59991ztT, "");
                        c59991ztT.OLrzqt(C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT2) {
                                invoke2(c59991ztT2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull C59991ztT c59991ztT2) {
                                Intrinsics.checkNotNullParameter(c59991ztT2, "");
                                C07551 c07551 = new Function2<C60060zuj, C60053zuc, ProposeSessionUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.1
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final ProposeSessionUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        AppMetaData appMetaData = (AppMetaData) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppMetaData.class), null, null);
                                        return new ProposeSessionUseCase(relayJsonRpcInteractorInterface, keyManagementRepository, (ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null), appMetaData, (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                                Kind kind = Kind.Singleton;
                                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(ProposeSessionUseCaseInterface.class), null, c07551, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS);
                                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, SessionAuthenticateUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.2
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final SessionAuthenticateUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new SessionAuthenticateUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null), (AppMetaData) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppMetaData.class), null, null), (AuthenticateResponseTopicRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AuthenticateResponseTopicRepository.class), null, null), (ProposeSessionUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposeSessionUseCaseInterface.class), null, null), (GetPairingForSessionAuthenticateUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPairingForSessionAuthenticateUseCase.class), null, null), (GetNamespacesFromReCaps) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetNamespacesFromReCaps.class), null, null), (LinkModeJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeJsonRpcInteractorInterface.class), null, null), (LinkModeStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeStorageRepository.class), null, null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SessionAuthenticateUseCaseInterface.class), null, anonymousClass2, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS2);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS2);
                                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, PairUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.3
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final PairUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new PairUseCase((PairingInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingInterface.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PairUseCaseInterface.class), null, anonymousClass3, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS3);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS3);
                                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, ApproveSessionUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.4
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final ApproveSessionUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        ProposalStorageRepository proposalStorageRepository = (ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null);
                                        AppMetaData appMetaData = (AppMetaData) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppMetaData.class), null, null);
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        MetadataStorageRepositoryInterface metadataStorageRepositoryInterface = (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null);
                                        return new ApproveSessionUseCase(relayJsonRpcInteractorInterface, keyManagementRepository, (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), proposalStorageRepository, metadataStorageRepositoryInterface, (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null), appMetaData, (InsertTelemetryEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ApproveSessionUseCaseInterface.class), null, anonymousClass4, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS4);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS4);
                                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, ApproveSessionAuthenticateUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.5
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final ApproveSessionAuthenticateUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        CacaoVerifier cacaoVerifier = (CacaoVerifier) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(CacaoVerifier.class), null, null);
                                        Logger logger = (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null);
                                        VerifyContextStorageRepository verifyContextStorageRepository = (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null);
                                        GetPendingSessionAuthenticateRequest getPendingSessionAuthenticateRequest = (GetPendingSessionAuthenticateRequest) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPendingSessionAuthenticateRequest.class), null, null);
                                        AppMetaData appMetaData = (AppMetaData) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppMetaData.class), null, null);
                                        SessionStorageRepository sessionStorageRepository = (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null);
                                        return new ApproveSessionAuthenticateUseCase(relayJsonRpcInteractorInterface, getPendingSessionAuthenticateRequest, keyManagementRepository, cacaoVerifier, verifyContextStorageRepository, logger, (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null), appMetaData, sessionStorageRepository, (InsertTelemetryEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), (LinkModeJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeJsonRpcInteractorInterface.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ApproveSessionAuthenticateUseCaseInterface.class), null, anonymousClass5, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS5);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS5);
                                AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, RejectSessionAuthenticateUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.6
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final RejectSessionAuthenticateUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        Logger logger = (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null);
                                        VerifyContextStorageRepository verifyContextStorageRepository = (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null);
                                        return new RejectSessionAuthenticateUseCase(relayJsonRpcInteractorInterface, (GetPendingSessionAuthenticateRequest) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPendingSessionAuthenticateRequest.class), null, null), keyManagementRepository, verifyContextStorageRepository, (LinkModeJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeJsonRpcInteractorInterface.class), null, null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), logger);
                                    }
                                };
                                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(RejectSessionAuthenticateUseCaseInterface.class), null, anonymousClass6, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS6);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS6);
                                AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, RejectSessionUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.7
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final RejectSessionUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        VerifyContextStorageRepository verifyContextStorageRepository = (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null);
                                        ProposalStorageRepository proposalStorageRepository = (ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null);
                                        return new RejectSessionUseCase(verifyContextStorageRepository, (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), proposalStorageRepository, (PairingControllerInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(RejectSessionUseCaseInterface.class), null, anonymousClass7, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS7);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS7);
                                AnonymousClass8 anonymousClass8 = new Function2<C60060zuj, C60053zuc, SessionUpdateUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.8
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final SessionUpdateUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new SessionUpdateUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SessionUpdateUseCaseInterface.class), null, anonymousClass8, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS8);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS8);
                                AnonymousClass9 anonymousClass9 = new Function2<C60060zuj, C60053zuc, SessionRequestUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.9
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final SessionRequestUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        return new SessionRequestUseCase((SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), relayJsonRpcInteractorInterface, (LinkModeJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeJsonRpcInteractorInterface.class), null, null), (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SessionRequestUseCaseInterface.class), null, anonymousClass9, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS9);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS9);
                                AnonymousClass10 anonymousClass10 = new Function2<C60060zuj, C60053zuc, RespondSessionRequestUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.10
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final RespondSessionRequestUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        VerifyContextStorageRepository verifyContextStorageRepository = (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null);
                                        SessionStorageRepository sessionStorageRepository = (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null);
                                        Logger logger = (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null);
                                        return new RespondSessionRequestUseCase(relayJsonRpcInteractorInterface, sessionStorageRepository, (GetPendingJsonRpcHistoryEntryByIdUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPendingJsonRpcHistoryEntryByIdUseCase.class), null, null), (LinkModeJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeJsonRpcInteractorInterface.class), null, null), logger, verifyContextStorageRepository, (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS10 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(RespondSessionRequestUseCaseInterface.class), null, anonymousClass10, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS10);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS10);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS10);
                                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.DECRYPT_SIGN_MESSAGE);
                                AnonymousClass11 anonymousClass11 = new Function2<C60060zuj, C60053zuc, DecryptMessageUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.11
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final DecryptMessageUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        DecryptSignMessageUseCase decryptSignMessageUseCase = new DecryptSignMessageUseCase((Codec) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Codec.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null), (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null), (PushMessagesRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PushMessagesRepository.class), null, null));
                                        ((Map) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Map.class), C60058zuh.OLrzqt(AndroidCommonDITags.DECRYPT_USE_CASES), null)).put(String.valueOf(Tags.SESSION_PROPOSE.getId()), decryptSignMessageUseCase);
                                        return decryptSignMessageUseCase;
                                    }
                                };
                                C59990ztS<?> c59990ztS11 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(DecryptMessageUseCaseInterface.class), interfaceC59997ztZOLrzqt, anonymousClass11, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS11);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS11);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS11);
                                AnonymousClass12 anonymousClass12 = new Function2<C60060zuj, C60053zuc, PingUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.12
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final PingUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        SessionStorageRepository sessionStorageRepository = (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null);
                                        return new PingUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), sessionStorageRepository, (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS12 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PingUseCaseInterface.class), null, anonymousClass12, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS12);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS12);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS12);
                                AnonymousClass13 anonymousClass13 = new Function2<C60060zuj, C60053zuc, EmitEventUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.13
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final EmitEventUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new EmitEventUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS13 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(EmitEventUseCaseInterface.class), null, anonymousClass13, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS13);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS13);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS13);
                                AnonymousClass14 anonymousClass14 = new Function2<C60060zuj, C60053zuc, ExtendSessionUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.14
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final ExtendSessionUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new ExtendSessionUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS14 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ExtendSessionUseCaseInterface.class), null, anonymousClass14, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS14);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS14);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS14);
                                AnonymousClass15 anonymousClass15 = new Function2<C60060zuj, C60053zuc, DisconnectSessionUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.15
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final DisconnectSessionUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new DisconnectSessionUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS15 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(DisconnectSessionUseCaseInterface.class), null, anonymousClass15, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS15);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS15);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS15);
                                AnonymousClass16 anonymousClass16 = new Function2<C60060zuj, C60053zuc, GetSessionsUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.16
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetSessionsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetSessionsUseCase((MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (AppMetaData) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppMetaData.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS16 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetSessionsUseCaseInterface.class), null, anonymousClass16, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS16);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS16);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS16);
                                AnonymousClass17 anonymousClass17 = new Function2<C60060zuj, C60053zuc, GetPairingsUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.17
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetPairingsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetPairingsUseCase((PairingInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingInterface.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS17 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetPairingsUseCaseInterface.class), null, anonymousClass17, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS17);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS17);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS17);
                                AnonymousClass18 anonymousClass18 = new Function2<C60060zuj, C60053zuc, GetPairingForSessionAuthenticateUseCase>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.18
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetPairingForSessionAuthenticateUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetPairingForSessionAuthenticateUseCase((PairingInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingInterface.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS18 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetPairingForSessionAuthenticateUseCase.class), null, anonymousClass18, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS18);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS18);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS18);
                                AnonymousClass19 anonymousClass19 = new Function2<C60060zuj, C60053zuc, GetNamespacesFromReCaps>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.19
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetNamespacesFromReCaps invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetNamespacesFromReCaps();
                                    }
                                };
                                C59990ztS<?> c59990ztS19 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetNamespacesFromReCaps.class), null, anonymousClass19, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS19);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS19);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS19);
                                AnonymousClass20 anonymousClass20 = new Function2<C60060zuj, C60053zuc, GetPendingRequestsUseCaseByTopicInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.20
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetPendingRequestsUseCaseByTopicInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetPendingRequestsUseCaseByTopic((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS20 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetPendingRequestsUseCaseByTopicInterface.class), null, anonymousClass20, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS20);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS20);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS20);
                                AnonymousClass21 anonymousClass21 = new Function2<C60060zuj, C60053zuc, GetPendingSessionRequestByTopicUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.21
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetPendingSessionRequestByTopicUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetPendingSessionRequestByTopicUseCase((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null), (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS21 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetPendingSessionRequestByTopicUseCaseInterface.class), null, anonymousClass21, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS21);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS21);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS21);
                                AnonymousClass22 anonymousClass22 = new Function2<C60060zuj, C60053zuc, GetSessionProposalsUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.22
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetSessionProposalsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetSessionProposalsUseCase((ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS22 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetSessionProposalsUseCaseInterface.class), null, anonymousClass22, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS22);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS22);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS22);
                                AnonymousClass23 anonymousClass23 = new Function2<C60060zuj, C60053zuc, GetVerifyContextByIdUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.23
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetVerifyContextByIdUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetVerifyContextByIdUseCase((VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS23 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetVerifyContextByIdUseCaseInterface.class), null, anonymousClass23, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS23);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS23);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS23);
                                AnonymousClass24 anonymousClass24 = new Function2<C60060zuj, C60053zuc, GetListOfVerifyContextsUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.24
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final GetListOfVerifyContextsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new GetListOfVerifyContextsUseCase((VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null));
                                    }
                                };
                                C59990ztS<?> c59990ztS24 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetListOfVerifyContextsUseCaseInterface.class), null, anonymousClass24, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS24);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS24);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS24);
                                AnonymousClass25 anonymousClass25 = new Function2<C60060zuj, C60053zuc, FormatAuthenticateMessageUseCaseInterface>() { // from class: com.reown.sign.di.CallsModuleKt.callsModule.1.25
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final FormatAuthenticateMessageUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new FormatAuthenticateMessageUseCase();
                                    }
                                };
                                C59990ztS<?> c59990ztS25 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(FormatAuthenticateMessageUseCaseInterface.class), null, anonymousClass25, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS25);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS25);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS25);
                            }
                        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT2) {
                                invoke2(c59991ztT2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull C59991ztT c59991ztT2) {
                                Intrinsics.checkNotNullParameter(c59991ztT2, "");
                                C07571 c07571 = new Function2<C60060zuj, C60053zuc, OnSessionProposalUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.1
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionProposalUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        PairingControllerInterface pairingControllerInterface = (PairingControllerInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null);
                                        return new OnSessionProposalUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null), (ResolveAttestationIdUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ResolveAttestationIdUseCase.class), null, null), pairingControllerInterface, (InsertTelemetryEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                                Kind kind = Kind.Singleton;
                                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(OnSessionProposalUseCase.class), null, c07571, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS);
                                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, OnSessionAuthenticateUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.2
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionAuthenticateUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        ResolveAttestationIdUseCase resolveAttestationIdUseCase = (ResolveAttestationIdUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ResolveAttestationIdUseCase.class), null, null);
                                        Logger logger = (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), null, null);
                                        return new OnSessionAuthenticateUseCase(relayJsonRpcInteractorInterface, resolveAttestationIdUseCase, (PairingControllerInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null), (InsertTelemetryEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), logger);
                                    }
                                };
                                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionAuthenticateUseCase.class), null, anonymousClass2, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS2);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS2);
                                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, OnSessionSettleUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.3
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionSettleUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        ProposalStorageRepository proposalStorageRepository = (ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null);
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        PairingControllerInterface pairingControllerInterface = (PairingControllerInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null);
                                        MetadataStorageRepositoryInterface metadataStorageRepositoryInterface = (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null);
                                        SessionStorageRepository sessionStorageRepository = (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null);
                                        return new OnSessionSettleUseCase((KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null), relayJsonRpcInteractorInterface, proposalStorageRepository, sessionStorageRepository, pairingControllerInterface, (AppMetaData) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppMetaData.class), null, null), metadataStorageRepositoryInterface, (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionSettleUseCase.class), null, anonymousClass3, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS3);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS3);
                                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, OnSessionRequestUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.4
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionRequestUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        MetadataStorageRepositoryInterface metadataStorageRepositoryInterface = (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null);
                                        SessionStorageRepository sessionStorageRepository = (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null);
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        ResolveAttestationIdUseCase resolveAttestationIdUseCase = (ResolveAttestationIdUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ResolveAttestationIdUseCase.class), null, null);
                                        Logger logger = (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null);
                                        return new OnSessionRequestUseCase(relayJsonRpcInteractorInterface, sessionStorageRepository, metadataStorageRepositoryInterface, resolveAttestationIdUseCase, (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), logger);
                                    }
                                };
                                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionRequestUseCase.class), null, anonymousClass4, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS4);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS4);
                                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, OnSessionDeleteUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.5
                                    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [82=4, 68=4] */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionDeleteUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        return new OnSessionDeleteUseCase(relayJsonRpcInteractorInterface, (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), keyManagementRepository, (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionDeleteUseCase.class), null, anonymousClass5, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS5);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS5);
                                AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, OnSessionEventUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.6
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionEventUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new OnSessionEventUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionEventUseCase.class), null, anonymousClass6, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS6);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS6);
                                AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, OnSessionUpdateUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.7
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionUpdateUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new OnSessionUpdateUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionUpdateUseCase.class), null, anonymousClass7, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS7);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS7);
                                AnonymousClass8 anonymousClass8 = new Function2<C60060zuj, C60053zuc, OnSessionExtendUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.8
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionExtendUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new OnSessionExtendUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionExtendUseCase.class), null, anonymousClass8, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS8);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS8);
                                AnonymousClass9 anonymousClass9 = new Function2<C60060zuj, C60053zuc, OnPingUseCase>() { // from class: com.reown.sign.di.RequestsModuleKt.requestsModule.1.9
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnPingUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new OnPingUseCase((RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnPingUseCase.class), null, anonymousClass9, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS9);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS9);
                            }
                        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.sign.di.ResponsesModuleKt.responsesModule.1
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT2) {
                                invoke2(c59991ztT2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull C59991ztT c59991ztT2) {
                                Intrinsics.checkNotNullParameter(c59991ztT2, "");
                                C07581 c07581 = new Function2<C60060zuj, C60053zuc, OnSessionProposalResponseUseCase>() { // from class: com.reown.sign.di.ResponsesModuleKt.responsesModule.1.1
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionProposalResponseUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        return new OnSessionProposalResponseUseCase(relayJsonRpcInteractorInterface, (PairingControllerInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null), keyManagementRepository, (ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                                Kind kind = Kind.Singleton;
                                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(OnSessionProposalResponseUseCase.class), null, c07581, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS);
                                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, OnSessionSettleResponseUseCase>() { // from class: com.reown.sign.di.ResponsesModuleKt.responsesModule.1.2
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionSettleResponseUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        return new OnSessionSettleResponseUseCase((SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), relayJsonRpcInteractorInterface, (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null), keyManagementRepository, (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionSettleResponseUseCase.class), null, anonymousClass2, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS2);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS2);
                                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, OnSessionAuthenticateResponseUseCase>() { // from class: com.reown.sign.di.ResponsesModuleKt.responsesModule.1.3
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionAuthenticateResponseUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        PairingControllerInterface pairingControllerInterface = (PairingControllerInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null);
                                        PairingInterface pairingInterface = (PairingInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingInterface.class), null, null);
                                        CacaoVerifier cacaoVerifier = (CacaoVerifier) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(CacaoVerifier.class), null, null);
                                        SessionStorageRepository sessionStorageRepository = (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null);
                                        KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                        AuthenticateResponseTopicRepository authenticateResponseTopicRepository = (AuthenticateResponseTopicRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AuthenticateResponseTopicRepository.class), null, null);
                                        Logger logger = (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null);
                                        GetSessionAuthenticateRequest getSessionAuthenticateRequest = (GetSessionAuthenticateRequest) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetSessionAuthenticateRequest.class), null, null);
                                        MetadataStorageRepositoryInterface metadataStorageRepositoryInterface = (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null);
                                        LinkModeStorageRepository linkModeStorageRepository = (LinkModeStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeStorageRepository.class), null, null);
                                        return new OnSessionAuthenticateResponseUseCase(pairingControllerInterface, pairingInterface, cacaoVerifier, sessionStorageRepository, keyManagementRepository, relayJsonRpcInteractorInterface, metadataStorageRepositoryInterface, authenticateResponseTopicRepository, logger, (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null), getSessionAuthenticateRequest, linkModeStorageRepository);
                                    }
                                };
                                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionAuthenticateResponseUseCase.class), null, anonymousClass3, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS3);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS3);
                                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, OnSessionUpdateResponseUseCase>() { // from class: com.reown.sign.di.ResponsesModuleKt.responsesModule.1.4
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionUpdateResponseUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new OnSessionUpdateResponseUseCase((SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionUpdateResponseUseCase.class), null, anonymousClass4, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS4);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS4);
                                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, OnSessionRequestResponseUseCase>() { // from class: com.reown.sign.di.ResponsesModuleKt.responsesModule.1.5
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final OnSessionRequestResponseUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                                        return new OnSessionRequestResponseUseCase((Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null), (InsertEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertEventUseCase.class), null, null), (GetSessionRequestByIdUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetSessionRequestByIdUseCase.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null));
                                    }
                                };
                                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OnSessionRequestResponseUseCase.class), null, anonymousClass5, kind, yDY.AhwBna()));
                                c59991ztT2.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                                if (c59991ztT2.OLrzqt()) {
                                    c59991ztT2.KWHzl(c59990ztS5);
                                }
                                new C59976ztE(c59991ztT2, c59990ztS5);
                            }
                        }, 1, null));
                        C07561 c07561 = new Function2<C60060zuj, C60053zuc, GetPendingSessionRequests>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.1
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final GetPendingSessionRequests invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new GetPendingSessionRequests((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null));
                            }
                        };
                        C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                        C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                        Kind kind = Kind.Singleton;
                        C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(GetPendingSessionRequests.class), null, c07561, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS);
                        }
                        new C59976ztE(c59991ztT, c59990ztS);
                        C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetPendingAuthenticateRequestUseCaseInterface.class), null, new Function2<C60060zuj, C60053zuc, GetPendingAuthenticateRequestUseCaseInterface>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.2
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final GetPendingAuthenticateRequestUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new GetPendingAuthenticateRequestUseCase((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS2);
                        }
                        new C59976ztE(c59991ztT, c59990ztS2);
                        C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(DeleteRequestByIdUseCase.class), null, new Function2<C60060zuj, C60053zuc, DeleteRequestByIdUseCase>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.3
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final DeleteRequestByIdUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new DeleteRequestByIdUseCase((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS3);
                        }
                        new C59976ztE(c59991ztT, c59990ztS3);
                        C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetPendingJsonRpcHistoryEntryByIdUseCase.class), null, new Function2<C60060zuj, C60053zuc, GetPendingJsonRpcHistoryEntryByIdUseCase>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.4
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final GetPendingJsonRpcHistoryEntryByIdUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new GetPendingJsonRpcHistoryEntryByIdUseCase((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS4);
                        }
                        new C59976ztE(c59991ztT, c59990ztS4);
                        C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetSessionRequestByIdUseCase.class), null, new Function2<C60060zuj, C60053zuc, GetSessionRequestByIdUseCase>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.5
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final GetSessionRequestByIdUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new GetSessionRequestByIdUseCase((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS5);
                        }
                        new C59976ztE(c59991ztT, c59990ztS5);
                        C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetPendingSessionAuthenticateRequest.class), null, new Function2<C60060zuj, C60053zuc, GetPendingSessionAuthenticateRequest>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.6
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final GetPendingSessionAuthenticateRequest invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new GetPendingSessionAuthenticateRequest((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS6);
                        }
                        new C59976ztE(c59991ztT, c59990ztS6);
                        C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetSessionAuthenticateRequest.class), null, new Function2<C60060zuj, C60053zuc, GetSessionAuthenticateRequest>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.7
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final GetSessionAuthenticateRequest invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new GetSessionAuthenticateRequest((JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (JsonRpcSerializer) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS7);
                        }
                        new C59976ztE(c59991ztT, c59990ztS7);
                        C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(CacaoVerifier.class), null, new Function2<C60060zuj, C60053zuc, CacaoVerifier>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.8
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final CacaoVerifier invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                return new CacaoVerifier((ProjectId) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProjectId.class), null, null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS8);
                        }
                        new C59976ztE(c59991ztT, c59990ztS8);
                        C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SignEngine.class), null, new Function2<C60060zuj, C60053zuc, SignEngine>() { // from class: com.reown.sign.di.EngineModuleKt.engineModule.1.9
                            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function2
                            public final SignEngine invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                                Intrinsics.checkNotNullParameter(c60060zuj, "");
                                Intrinsics.checkNotNullParameter(c60053zuc, "");
                                VerifyContextStorageRepository verifyContextStorageRepository = (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null);
                                RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = (RelayJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, null);
                                KeyManagementRepository keyManagementRepository = (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null);
                                AuthenticateResponseTopicRepository authenticateResponseTopicRepository = (AuthenticateResponseTopicRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AuthenticateResponseTopicRepository.class), null, null);
                                ProposalStorageRepository proposalStorageRepository = (ProposalStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, null);
                                SessionAuthenticateUseCaseInterface sessionAuthenticateUseCaseInterface = (SessionAuthenticateUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionAuthenticateUseCaseInterface.class), null, null);
                                SessionStorageRepository sessionStorageRepository = (SessionStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionStorageRepository.class), null, null);
                                MetadataStorageRepositoryInterface metadataStorageRepositoryInterface = (MetadataStorageRepositoryInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, null);
                                ApproveSessionUseCaseInterface approveSessionUseCaseInterface = (ApproveSessionUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ApproveSessionUseCaseInterface.class), null, null);
                                DisconnectSessionUseCaseInterface disconnectSessionUseCaseInterface = (DisconnectSessionUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DisconnectSessionUseCaseInterface.class), null, null);
                                EmitEventUseCaseInterface emitEventUseCaseInterface = (EmitEventUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(EmitEventUseCaseInterface.class), null, null);
                                ExtendSessionUseCaseInterface extendSessionUseCaseInterface = (ExtendSessionUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ExtendSessionUseCaseInterface.class), null, null);
                                DecryptMessageUseCaseInterface decryptMessageUseCaseInterface = (DecryptMessageUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DecryptMessageUseCaseInterface.class), C60058zuh.OLrzqt(AndroidCommonDITags.DECRYPT_SIGN_MESSAGE), null);
                                GetListOfVerifyContextsUseCaseInterface getListOfVerifyContextsUseCaseInterface = (GetListOfVerifyContextsUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetListOfVerifyContextsUseCaseInterface.class), null, null);
                                GetPairingsUseCaseInterface getPairingsUseCaseInterface = (GetPairingsUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPairingsUseCaseInterface.class), null, null);
                                GetPendingRequestsUseCaseByTopicInterface getPendingRequestsUseCaseByTopicInterface = (GetPendingRequestsUseCaseByTopicInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPendingRequestsUseCaseByTopicInterface.class), null, null);
                                GetPendingSessionRequests getPendingSessionRequests = (GetPendingSessionRequests) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPendingSessionRequests.class), null, null);
                                GetSessionProposalsUseCaseInterface getSessionProposalsUseCaseInterface = (GetSessionProposalsUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetSessionProposalsUseCaseInterface.class), null, null);
                                GetSessionsUseCaseInterface getSessionsUseCaseInterface = (GetSessionsUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetSessionsUseCaseInterface.class), null, null);
                                OnPingUseCase onPingUseCase = (OnPingUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnPingUseCase.class), null, null);
                                GetVerifyContextByIdUseCaseInterface getVerifyContextByIdUseCaseInterface = (GetVerifyContextByIdUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetVerifyContextByIdUseCaseInterface.class), null, null);
                                OnSessionDeleteUseCase onSessionDeleteUseCase = (OnSessionDeleteUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionDeleteUseCase.class), null, null);
                                OnSessionEventUseCase onSessionEventUseCase = (OnSessionEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionEventUseCase.class), null, null);
                                OnSessionExtendUseCase onSessionExtendUseCase = (OnSessionExtendUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionExtendUseCase.class), null, null);
                                GetPendingSessionRequestByTopicUseCaseInterface getPendingSessionRequestByTopicUseCaseInterface = (GetPendingSessionRequestByTopicUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPendingSessionRequestByTopicUseCaseInterface.class), null, null);
                                OnSessionProposalResponseUseCase onSessionProposalResponseUseCase = (OnSessionProposalResponseUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionProposalResponseUseCase.class), null, null);
                                OnSessionProposalUseCase onSessionProposalUseCase = (OnSessionProposalUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionProposalUseCase.class), null, null);
                                OnSessionRequestResponseUseCase onSessionRequestResponseUseCase = (OnSessionRequestResponseUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionRequestResponseUseCase.class), null, null);
                                OnSessionRequestUseCase onSessionRequestUseCase = (OnSessionRequestUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionRequestUseCase.class), null, null);
                                OnSessionSettleResponseUseCase onSessionSettleResponseUseCase = (OnSessionSettleResponseUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionSettleResponseUseCase.class), null, null);
                                OnSessionSettleUseCase onSessionSettleUseCase = (OnSessionSettleUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionSettleUseCase.class), null, null);
                                OnSessionUpdateResponseUseCase onSessionUpdateResponseUseCase = (OnSessionUpdateResponseUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionUpdateResponseUseCase.class), null, null);
                                OnSessionUpdateUseCase onSessionUpdateUseCase = (OnSessionUpdateUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionUpdateUseCase.class), null, null);
                                PairingControllerInterface pairingControllerInterface = (PairingControllerInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null);
                                PairUseCaseInterface pairUseCaseInterface = (PairUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairUseCaseInterface.class), null, null);
                                PingUseCaseInterface pingUseCaseInterface = (PingUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PingUseCaseInterface.class), null, null);
                                ProposeSessionUseCaseInterface proposeSessionUseCaseInterface = (ProposeSessionUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposeSessionUseCaseInterface.class), null, null);
                                RejectSessionUseCaseInterface rejectSessionUseCaseInterface = (RejectSessionUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RejectSessionUseCaseInterface.class), null, null);
                                RespondSessionRequestUseCaseInterface respondSessionRequestUseCaseInterface = (RespondSessionRequestUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RespondSessionRequestUseCaseInterface.class), null, null);
                                SessionRequestUseCaseInterface sessionRequestUseCaseInterface = (SessionRequestUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionRequestUseCaseInterface.class), null, null);
                                SessionUpdateUseCaseInterface sessionUpdateUseCaseInterface = (SessionUpdateUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionUpdateUseCaseInterface.class), null, null);
                                OnSessionAuthenticateUseCase onSessionAuthenticateUseCase = (OnSessionAuthenticateUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionAuthenticateUseCase.class), null, null);
                                OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase = (OnSessionAuthenticateResponseUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OnSessionAuthenticateResponseUseCase.class), null, null);
                                ApproveSessionAuthenticateUseCaseInterface approveSessionAuthenticateUseCaseInterface = (ApproveSessionAuthenticateUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ApproveSessionAuthenticateUseCaseInterface.class), null, null);
                                RejectSessionAuthenticateUseCaseInterface rejectSessionAuthenticateUseCaseInterface = (RejectSessionAuthenticateUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RejectSessionAuthenticateUseCaseInterface.class), null, null);
                                FormatAuthenticateMessageUseCaseInterface formatAuthenticateMessageUseCaseInterface = (FormatAuthenticateMessageUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(FormatAuthenticateMessageUseCaseInterface.class), null, null);
                                DeleteRequestByIdUseCase deleteRequestByIdUseCase = (DeleteRequestByIdUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DeleteRequestByIdUseCase.class), null, null);
                                return new SignEngine(relayJsonRpcInteractorInterface, getPendingRequestsUseCaseByTopicInterface, getPendingSessionRequestByTopicUseCaseInterface, getPendingSessionRequests, (GetPendingAuthenticateRequestUseCaseInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GetPendingAuthenticateRequestUseCaseInterface.class), null, null), deleteRequestByIdUseCase, keyManagementRepository, authenticateResponseTopicRepository, proposalStorageRepository, sessionStorageRepository, metadataStorageRepositoryInterface, pairingControllerInterface, verifyContextStorageRepository, proposeSessionUseCaseInterface, sessionAuthenticateUseCaseInterface, pairUseCaseInterface, rejectSessionUseCaseInterface, approveSessionUseCaseInterface, approveSessionAuthenticateUseCaseInterface, rejectSessionAuthenticateUseCaseInterface, sessionUpdateUseCaseInterface, sessionRequestUseCaseInterface, respondSessionRequestUseCaseInterface, pingUseCaseInterface, formatAuthenticateMessageUseCaseInterface, emitEventUseCaseInterface, extendSessionUseCaseInterface, disconnectSessionUseCaseInterface, decryptMessageUseCaseInterface, getSessionsUseCaseInterface, getPairingsUseCaseInterface, getSessionProposalsUseCaseInterface, getVerifyContextByIdUseCaseInterface, getListOfVerifyContextsUseCaseInterface, onSessionProposalUseCase, onSessionAuthenticateUseCase, onSessionSettleUseCase, onSessionRequestUseCase, onSessionDeleteUseCase, onSessionEventUseCase, onSessionUpdateUseCase, onSessionExtendUseCase, onPingUseCase, onSessionProposalResponseUseCase, onSessionAuthenticateResponseUseCase, onSessionSettleResponseUseCase, onSessionUpdateResponseUseCase, onSessionRequestResponseUseCase, (InsertTelemetryEventUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, null), (LinkModeJsonRpcInteractorInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeJsonRpcInteractorInterface.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                            }
                        }, kind, yDY.AhwBna()));
                        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
                        if (c59991ztT.OLrzqt()) {
                            c59991ztT.KWHzl(c59990ztS9);
                        }
                        new C59976ztE(c59991ztT, c59990ztS9);
                    }
                }, 1, null));
                SignEngine signEngine2 = (SignEngine) this.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(SignEngine.class), null, null);
                this.signEngine = signEngine2;
                if (signEngine2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    signEngine = signEngine2;
                }
                signEngine.setup();
                function0.invoke();
                return;
            } catch (Exception e) {
                function1.invoke(new Sign.Model.Error(e));
                return;
            }
        }
        function1.invoke(new Sign.Model.Error(new SignClientAlreadyInitializedException()));
    }

    @Override // com.reown.sign.client.SignInterface
    public void setWalletDelegate(@NotNull final SignInterface.WalletDelegate walletDelegate) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(walletDelegate, "");
        checkEngineInitialization();
        KoinApplicationKt.getWcKoinApp().OLrzqt(C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.sign.client.SignProtocol.setWalletDelegate.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.ENABLE_AUTHENTICATE);
                final SignInterface.WalletDelegate walletDelegate2 = walletDelegate;
                Function2<C60060zuj, C60053zuc, Boolean> function2 = new Function2<C60060zuj, C60053zuc, Boolean>() { // from class: com.reown.sign.client.SignProtocol.setWalletDelegate.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Boolean invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return Boolean.valueOf(walletDelegate2.getOnSessionAuthenticate() != null);
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(Boolean.class), interfaceC59997ztZOLrzqt, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null));
        handleConnectionState(new Function1<Sign.Model.ConnectionState, Unit>() { // from class: com.reown.sign.client.SignProtocol.setWalletDelegate.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.ConnectionState connectionState) {
                invoke2(connectionState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.ConnectionState connectionState) {
                Intrinsics.checkNotNullParameter(connectionState, "");
                walletDelegate.onConnectionStateChange(connectionState);
            }
        });
        SignEngine signEngine = this.signEngine;
        if (signEngine == null) {
            Intrinsics.gEmmrt("");
            signEngine = null;
        }
        FlowKt.launchIn(FlowKt.onEach(signEngine.getEngineEvent(), new AnonymousClass3(walletDelegate, null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$setWalletDelegate$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<EngineEvent, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignInterface.WalletDelegate $delegate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SignInterface.WalletDelegate walletDelegate, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$delegate = walletDelegate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$delegate, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull EngineEvent engineEvent, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(engineEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EngineEvent engineEvent = (EngineEvent) this.L$0;
                if (engineEvent instanceof EngineDO.SessionProposalEvent) {
                    EngineDO.SessionProposalEvent sessionProposalEvent = (EngineDO.SessionProposalEvent) engineEvent;
                    this.$delegate.onSessionProposal(ClientMapperKt.toClientSessionProposal(sessionProposalEvent.getProposal()), ClientMapperKt.toCore(sessionProposalEvent.getContext()));
                } else if (engineEvent instanceof EngineDO.SessionAuthenticateEvent) {
                    Function2<Sign.Model.SessionAuthenticate, Sign.Model.VerifyContext, Unit> onSessionAuthenticate = this.$delegate.getOnSessionAuthenticate();
                    if (onSessionAuthenticate != null) {
                        EngineDO.SessionAuthenticateEvent sessionAuthenticateEvent = (EngineDO.SessionAuthenticateEvent) engineEvent;
                        onSessionAuthenticate.invoke(ClientMapperKt.toClientSessionAuthenticate(sessionAuthenticateEvent), ClientMapperKt.toCore(sessionAuthenticateEvent.getVerifyContext()));
                    }
                } else if (engineEvent instanceof EngineDO.SessionRequestEvent) {
                    EngineDO.SessionRequestEvent sessionRequestEvent = (EngineDO.SessionRequestEvent) engineEvent;
                    this.$delegate.onSessionRequest(ClientMapperKt.toClientSessionRequest(sessionRequestEvent.getRequest()), ClientMapperKt.toCore(sessionRequestEvent.getContext()));
                } else if (engineEvent instanceof EngineDO.SessionDelete) {
                    this.$delegate.onSessionDelete(ClientMapperKt.toClientDeletedSession((EngineDO.SessionDelete) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionExtend) {
                    this.$delegate.onSessionExtend(ClientMapperKt.toClientActiveSession((EngineDO.SessionExtend) engineEvent));
                } else if (engineEvent instanceof EngineDO.SettledSessionResponse) {
                    this.$delegate.onSessionSettleResponse(ClientMapperKt.toClientSettledSessionResponse((EngineDO.SettledSessionResponse) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionUpdateNamespacesResponse) {
                    this.$delegate.onSessionUpdateResponse(ClientMapperKt.toClientUpdateSessionNamespacesResponse((EngineDO.SessionUpdateNamespacesResponse) engineEvent));
                } else if (engineEvent instanceof EngineDO.ExpiredProposal) {
                    this.$delegate.onProposalExpired(ClientMapperKt.toClient((EngineDO.ExpiredProposal) engineEvent));
                } else if (engineEvent instanceof EngineDO.ExpiredRequest) {
                    this.$delegate.onRequestExpired(ClientMapperKt.toClient((EngineDO.ExpiredRequest) engineEvent));
                } else if (engineEvent instanceof SDKError) {
                    this.$delegate.onError(ClientMapperKt.toClientError((SDKError) engineEvent));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void setDappDelegate(@NotNull final SignInterface.DappDelegate dappDelegate) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(dappDelegate, "");
        checkEngineInitialization();
        handleConnectionState(new Function1<Sign.Model.ConnectionState, Unit>() { // from class: com.reown.sign.client.SignProtocol.setDappDelegate.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.ConnectionState connectionState) {
                invoke2(connectionState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.ConnectionState connectionState) {
                Intrinsics.checkNotNullParameter(connectionState, "");
                dappDelegate.onConnectionStateChange(connectionState);
            }
        });
        SignEngine signEngine = this.signEngine;
        if (signEngine == null) {
            Intrinsics.gEmmrt("");
            signEngine = null;
        }
        FlowKt.launchIn(FlowKt.onEach(signEngine.getEngineEvent(), new AnonymousClass2(dappDelegate, null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$setDappDelegate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<EngineEvent, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignInterface.DappDelegate $delegate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SignInterface.DappDelegate dappDelegate, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$delegate = dappDelegate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$delegate, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull EngineEvent engineEvent, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(engineEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EngineEvent engineEvent = (EngineEvent) this.L$0;
                if (engineEvent instanceof EngineDO.SessionRejected) {
                    this.$delegate.onSessionRejected(ClientMapperKt.toClientSessionRejected((EngineDO.SessionRejected) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionApproved) {
                    this.$delegate.onSessionApproved(ClientMapperKt.toClientSessionApproved((EngineDO.SessionApproved) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionUpdateNamespaces) {
                    this.$delegate.onSessionUpdate(ClientMapperKt.toClientSessionsNamespaces((EngineDO.SessionUpdateNamespaces) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionDelete) {
                    this.$delegate.onSessionDelete(ClientMapperKt.toClientDeletedSession((EngineDO.SessionDelete) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionEvent) {
                    EngineDO.SessionEvent sessionEvent = (EngineDO.SessionEvent) engineEvent;
                    this.$delegate.onSessionEvent(ClientMapperKt.toClientSessionEvent(sessionEvent));
                    this.$delegate.onSessionEvent(ClientMapperKt.toClientEvent(sessionEvent));
                } else if (engineEvent instanceof EngineDO.SessionExtend) {
                    this.$delegate.onSessionExtend(ClientMapperKt.toClientActiveSession((EngineDO.SessionExtend) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionPayloadResponse) {
                    this.$delegate.onSessionRequestResponse(ClientMapperKt.toClientSessionPayloadResponse((EngineDO.SessionPayloadResponse) engineEvent));
                } else if (engineEvent instanceof EngineDO.SessionAuthenticateResponse) {
                    this.$delegate.onSessionAuthenticateResponse(ClientMapperKt.toClientSessionAuthenticateResponse((EngineDO.SessionAuthenticateResponse) engineEvent));
                } else if (engineEvent instanceof EngineDO.ExpiredProposal) {
                    this.$delegate.onProposalExpired(ClientMapperKt.toClient((EngineDO.ExpiredProposal) engineEvent));
                } else if (engineEvent instanceof EngineDO.ExpiredRequest) {
                    this.$delegate.onRequestExpired(ClientMapperKt.toClient((EngineDO.ExpiredRequest) engineEvent));
                } else if (engineEvent instanceof SDKError) {
                    this.$delegate.onError(ClientMapperKt.toClientError((SDKError) engineEvent));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$connect$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.Connect $connect;
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<String, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19331(Sign.Params.Connect connect, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super C19331> continuation) {
            super(2, continuation);
            this.$connect = connect;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19331(this.$connect, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    Map<String, Sign.Model.Namespace.Proposal> namespaces = this.$connect.getNamespaces();
                    Map<String, EngineDO.Namespace.Proposal> mapOfEngineNamespacesRequired = namespaces != null ? ClientMapperKt.toMapOfEngineNamespacesRequired(namespaces) : null;
                    Map<String, Sign.Model.Namespace.Proposal> optionalNamespaces = this.$connect.getOptionalNamespaces();
                    Map<String, EngineDO.Namespace.Proposal> mapOfEngineNamespacesOptional = optionalNamespaces != null ? ClientMapperKt.toMapOfEngineNamespacesOptional(optionalNamespaces) : null;
                    Map<String, String> properties = this.$connect.getProperties();
                    Pairing pairing = PairingMapperKt.toPairing(this.$connect.getPairing());
                    final Function1<String, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Connect connect = this.$connect;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.connect.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
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
                            function1.invoke(connect.getPairing().getUri());
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.connect.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine.proposeSession(mapOfEngineNamespacesRequired, mapOfEngineNamespacesOptional, properties, pairing, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void connect(@NotNull Sign.Params.Connect connect, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(connect, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19331(connect, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$authenticate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.Authenticate $authenticate;
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<String, Unit> $onSuccess;
        public final /* synthetic */ String $walletAppLink;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19321(Sign.Params.Authenticate authenticate, String str, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super C19321> continuation) {
            super(2, continuation);
            this.$authenticate = authenticate;
            this.$walletAppLink = str;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19321(this.$authenticate, this.$walletAppLink, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    EngineDO.Authenticate authenticate = ClientMapperKt.toAuthenticate(this.$authenticate);
                    List<String> methods = this.$authenticate.getMethods();
                    String pairingTopic = this.$authenticate.getPairingTopic();
                    Expiry expiry = this.$authenticate.getExpiry() != null ? new Expiry(this.$authenticate.getExpiry().longValue()) : null;
                    String str = this.$walletAppLink;
                    final Function1<String, Unit> function1 = this.$onSuccess;
                    Function1<String, Unit> function12 = new Function1<String, Unit>() { // from class: com.reown.sign.client.SignProtocol.authenticate.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                            invoke2(str2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String str2) {
                            Intrinsics.checkNotNullParameter(str2, "");
                            function1.invoke(str2);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function13 = this.$onError;
                    Function1<Throwable, Unit> function14 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.authenticate.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function13.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine.authenticate(authenticate, methods, pairingTopic, expiry, str, function12, function14, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void authenticate(@NotNull Sign.Params.Authenticate authenticate, String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(authenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19321(authenticate, str, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$dispatchEnvelope$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ String $urlWithEnvelope;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19361(String str, Function1<? super Sign.Model.Error, Unit> function1, Continuation<? super C19361> continuation) {
            super(2, continuation);
            this.$urlWithEnvelope = str;
            this.$onError = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19361(this.$urlWithEnvelope, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    signEngine.dispatchEnvelope(this.$urlWithEnvelope);
                } catch (Exception e) {
                    this.$onError.invoke(new Sign.Model.Error(e));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void dispatchEnvelope(@NotNull String str, @NotNull Function1<? super Sign.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19361(str, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$formatAuthMessage$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public final /* synthetic */ Sign.Params.FormatMessage $formatMessage;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19391(Sign.Params.FormatMessage formatMessage, Continuation<? super C19391> continuation) {
            super(2, continuation);
            this.$formatMessage = formatMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19391(this.$formatMessage, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C19391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                EngineDO.PayloadParams engine = ClientMapperKt.toEngine(this.$formatMessage.getPayloadParams());
                String iss = this.$formatMessage.getIss();
                this.label = 1;
                obj = signEngine.formatMessage(engine, iss, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public String formatAuthMessage(@NotNull Sign.Params.FormatMessage formatMessage) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(formatMessage, "");
        checkEngineInitialization();
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new C19391(formatMessage, null), 1, null);
    }

    @Override // com.reown.sign.client.SignInterface
    public void approveSession(@NotNull Sign.Params.Approve approve, @NotNull Function1<? super Sign.Params.Approve, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(approve, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19311(approve, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$approveSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class C19311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.Approve $approve;
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.Approve, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Approve, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19311(Sign.Params.Approve approve, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.Approve, Unit> function12, Continuation<? super C19311> continuation) {
            super(2, continuation);
            this.$approve = approve;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19311(this.$approve, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    String proposerPublicKey = this.$approve.getProposerPublicKey();
                    Map<String, EngineDO.Namespace.Session> mapOfEngineNamespacesSession = ClientMapperKt.toMapOfEngineNamespacesSession(this.$approve.getNamespaces());
                    final Function1<Sign.Params.Approve, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Approve approve = this.$approve;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.approveSession.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Approve, kotlin.Unit> */
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
                            function1.invoke(approve);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.approveSession.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine2.approve(proposerPublicKey, mapOfEngineNamespacesSession, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void rejectSession(@NotNull Sign.Params.Reject reject, @NotNull Function1<? super Sign.Params.Reject, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(reject, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19501(reject, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$rejectSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.Reject, Unit> $onSuccess;
        public final /* synthetic */ Sign.Params.Reject $reject;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Reject, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19501(Sign.Params.Reject reject, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.Reject, Unit> function12, Continuation<? super C19501> continuation) {
            super(2, continuation);
            this.$reject = reject;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19501(this.$reject, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    String proposerPublicKey = this.$reject.getProposerPublicKey();
                    String reason = this.$reject.getReason();
                    final Function1<Sign.Params.Reject, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Reject reject = this.$reject;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.rejectSession.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Reject, kotlin.Unit> */
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
                            function1.invoke(reject);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.rejectSession.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine2.reject(proposerPublicKey, reason, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void approveAuthenticate(@NotNull Sign.Params.ApproveAuthenticate approveAuthenticate, @NotNull Function1<? super Sign.Params.ApproveAuthenticate, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(approveAuthenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(approveAuthenticate, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$approveAuthenticate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.ApproveAuthenticate $approve;
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.ApproveAuthenticate, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$ApproveAuthenticate, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Sign.Params.ApproveAuthenticate approveAuthenticate, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.ApproveAuthenticate, Unit> function12, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$approve = approveAuthenticate;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new AnonymousClass1(this.$approve, this.$onError, this.$onSuccess, continuation);
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
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    long id = this.$approve.getId();
                    List<Cacao> common = ClientMapperKt.toCommon(this.$approve.getCacaos());
                    final Function1<Sign.Params.ApproveAuthenticate, Unit> function1 = this.$onSuccess;
                    final Sign.Params.ApproveAuthenticate approveAuthenticate = this.$approve;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.approveAuthenticate.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$ApproveAuthenticate, kotlin.Unit> */
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
                            function1.invoke(approveAuthenticate);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.approveAuthenticate.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine2.approveSessionAuthenticate(id, common, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void rejectAuthenticate(@NotNull Sign.Params.RejectAuthenticate rejectAuthenticate, @NotNull Function1<? super Sign.Params.RejectAuthenticate, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(rejectAuthenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19491(rejectAuthenticate, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$rejectAuthenticate$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.RejectAuthenticate, Unit> $onSuccess;
        public final /* synthetic */ Sign.Params.RejectAuthenticate $reject;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$RejectAuthenticate, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19491(Sign.Params.RejectAuthenticate rejectAuthenticate, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.RejectAuthenticate, Unit> function12, Continuation<? super C19491> continuation) {
            super(2, continuation);
            this.$reject = rejectAuthenticate;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19491(this.$reject, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    long id = this.$reject.getId();
                    String reason = this.$reject.getReason();
                    final Function1<Sign.Params.RejectAuthenticate, Unit> function1 = this.$onSuccess;
                    final Sign.Params.RejectAuthenticate rejectAuthenticate = this.$reject;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.rejectAuthenticate.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$RejectAuthenticate, kotlin.Unit> */
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
                            function1.invoke(rejectAuthenticate);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.rejectAuthenticate.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine2.rejectSessionAuthenticate(id, reason, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void request(@NotNull Sign.Params.Request request, @NotNull Function1<? super Sign.Model.SentRequest, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19511(request, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Model.SentRequest, Unit> $onSuccess;
        public final /* synthetic */ Sign.Params.Request $request;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$SentRequest, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19511(Sign.Params.Request request, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Model.SentRequest, Unit> function12, Continuation<? super C19511> continuation) {
            super(2, continuation);
            this.$request = request;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19511(this.$request, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    EngineDO.Request engineDORequest = ClientMapperKt.toEngineDORequest(this.$request);
                    final Function1<Sign.Model.SentRequest, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Request request = this.$request;
                    Function1<Long, Unit> function12 = new Function1<Long, Unit>() { // from class: com.reown.sign.client.SignProtocol.request.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$SentRequest, kotlin.Unit> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            function1.invoke(ClientMapperKt.toSentRequest(request, j));
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function13 = this.$onError;
                    Function1<Throwable, Unit> function14 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.request.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function13.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine.sessionRequest(engineDORequest, function12, function14, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void respond(@NotNull Sign.Params.Response response, @NotNull Function1<? super Sign.Params.Response, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(response, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19521(response, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$respond$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.Response, Unit> $onSuccess;
        public final /* synthetic */ Sign.Params.Response $response;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Response, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19521(Sign.Params.Response response, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.Response, Unit> function12, Continuation<? super C19521> continuation) {
            super(2, continuation);
            this.$response = response;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19521(this.$response, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    String sessionTopic = this.$response.getSessionTopic();
                    JsonRpcResponse jsonRpcResponse = ClientMapperKt.toJsonRpcResponse(this.$response.getJsonRpcResponse());
                    final Function1<Sign.Params.Response, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Response response = this.$response;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.respond.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Response, kotlin.Unit> */
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
                            function1.invoke(response);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.respond.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine2.respondSessionRequest(sessionTopic, jsonRpcResponse, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void update(@NotNull Sign.Params.Update update, @NotNull Function1<? super Sign.Params.Update, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(update, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19561(update, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$update$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class C19561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.Update, Unit> $onSuccess;
        public final /* synthetic */ Sign.Params.Update $update;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Update, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19561(Sign.Params.Update update, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.Update, Unit> function12, Continuation<? super C19561> continuation) {
            super(2, continuation);
            this.$update = update;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19561(this.$update, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    String sessionTopic = this.$update.getSessionTopic();
                    Map<String, EngineDO.Namespace.Session> mapOfEngineNamespacesSession = ClientMapperKt.toMapOfEngineNamespacesSession(this.$update.getNamespaces());
                    final Function1<Sign.Params.Update, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Update update = this.$update;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.update.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Update, kotlin.Unit> */
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
                            function1.invoke(update);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.update.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine2.sessionUpdate(sessionTopic, mapOfEngineNamespacesSession, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void extend(@NotNull Sign.Params.Extend extend, @NotNull Function1<? super Sign.Params.Extend, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(extend, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19381(extend, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$extend$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.Extend $extend;
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.Extend, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Extend, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19381(Sign.Params.Extend extend, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.Extend, Unit> function12, Continuation<? super C19381> continuation) {
            super(2, continuation);
            this.$extend = extend;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19381(this.$extend, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    String topic = this.$extend.getTopic();
                    final Function1<Sign.Params.Extend, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Extend extend = this.$extend;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.extend.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Extend, kotlin.Unit> */
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
                            function1.invoke(extend);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.extend.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine.extend(topic, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void emit(@NotNull Sign.Params.Emit emit, @NotNull Function1<? super Sign.Params.Emit, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(emit, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19371(emit, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$emit$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.Emit $emit;
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.Emit, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Emit, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19371(Sign.Params.Emit emit, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.Emit, Unit> function12, Continuation<? super C19371> continuation) {
            super(2, continuation);
            this.$emit = emit;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19371(this.$emit, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    String topic = this.$emit.getTopic();
                    EngineDO.Event engineEvent = ClientMapperKt.toEngineEvent(this.$emit.getEvent(), this.$emit.getChainId());
                    final Function1<Sign.Params.Emit, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Emit emit = this.$emit;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.emit.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Emit, kotlin.Unit> */
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
                            function1.invoke(emit);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.emit.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (EmitEventUseCaseInterface.DefaultImpls.emit$default(signEngine2, topic, engineEvent, null, function0, function13, this, 4, null) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void ping(@NotNull Sign.Params.Ping ping, Sign.Listeners.SessionPing sessionPing) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(ping, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19481(ping, sessionPing, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$ping$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.Ping $ping;
        public final /* synthetic */ Sign.Listeners.SessionPing $sessionPing;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19481(Sign.Params.Ping ping, Sign.Listeners.SessionPing sessionPing, Continuation<? super C19481> continuation) {
            super(2, continuation);
            this.$ping = ping;
            this.$sessionPing = sessionPing;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19481(this.$ping, this.$sessionPing, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    String topic = this.$ping.getTopic();
                    final Sign.Listeners.SessionPing sessionPing = this.$sessionPing;
                    Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.reown.sign.client.SignProtocol.ping.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String str) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Sign.Listeners.SessionPing sessionPing2 = sessionPing;
                            if (sessionPing2 != null) {
                                sessionPing2.onSuccess(new Sign.Model.Ping.Success(str));
                            }
                        }
                    };
                    final Sign.Listeners.SessionPing sessionPing2 = this.$sessionPing;
                    Function1<Throwable, Unit> function12 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.ping.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
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
                            Sign.Listeners.SessionPing sessionPing3 = sessionPing2;
                            if (sessionPing3 != null) {
                                sessionPing3.onError(new Sign.Model.Ping.Error(th));
                            }
                        }
                    };
                    long jM7331getTimeoutUwyO8pc = this.$ping.m7331getTimeoutUwyO8pc();
                    this.label = 1;
                    if (signEngine2.mo7342pingzkXUZaI(topic, function1, function12, jM7331getTimeoutUwyO8pc, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                Sign.Listeners.SessionPing sessionPing3 = this.$sessionPing;
                if (sessionPing3 != null) {
                    sessionPing3.onError(new Sign.Model.Ping.Error(e));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void disconnect(@NotNull Sign.Params.Disconnect disconnect, @NotNull Function1<? super Sign.Params.Disconnect, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(disconnect, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19351(disconnect, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$disconnect$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Sign.Params.Disconnect $disconnect;
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Params.Disconnect, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Disconnect, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19351(Sign.Params.Disconnect disconnect, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Params.Disconnect, Unit> function12, Continuation<? super C19351> continuation) {
            super(2, continuation);
            this.$disconnect = disconnect;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19351(this.$disconnect, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    String sessionTopic = this.$disconnect.getSessionTopic();
                    final Function1<Sign.Params.Disconnect, Unit> function1 = this.$onSuccess;
                    final Sign.Params.Disconnect disconnect = this.$disconnect;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignProtocol.disconnect.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Params$Disconnect, kotlin.Unit> */
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
                            function1.invoke(disconnect);
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function12 = this.$onError;
                    Function1<Throwable, Unit> function13 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.disconnect.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function12.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine.disconnect(sessionTopic, function0, function13, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public void decryptMessage(@NotNull Sign.Params.DecryptMessage decryptMessage, @NotNull Function1<? super Sign.Model.Message, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(decryptMessage, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19341(decryptMessage, function12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$decryptMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C19341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Sign.Model.Message, Unit> $onSuccess;
        public final /* synthetic */ Sign.Params.DecryptMessage $params;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Message, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19341(Sign.Params.DecryptMessage decryptMessage, Function1<? super Sign.Model.Error, Unit> function1, Function1<? super Sign.Model.Message, Unit> function12, Continuation<? super C19341> continuation) {
            super(2, continuation);
            this.$params = decryptMessage;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19341(this.$params, this.$onError, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SignEngine signEngine = SignProtocol.this.signEngine;
                    if (signEngine == null) {
                        Intrinsics.gEmmrt("");
                        signEngine = null;
                    }
                    SignEngine signEngine2 = signEngine;
                    String topic = this.$params.getTopic();
                    String encryptedMessage = this.$params.getEncryptedMessage();
                    final Function1<Sign.Model.Message, Unit> function1 = this.$onSuccess;
                    Function1<Core.Model.Message, Unit> function12 = new Function1<Core.Model.Message, Unit>() { // from class: com.reown.sign.client.SignProtocol.decryptMessage.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Message, kotlin.Unit> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Core.Model.Message message) {
                            invoke2(message);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Core.Model.Message message) {
                            Intrinsics.checkNotNullParameter(message, "");
                            if (message instanceof Core.Model.Message.SessionRequest) {
                                function1.invoke(ClientMapperKt.toSign((Core.Model.Message.SessionRequest) message));
                            } else if (message instanceof Core.Model.Message.SessionProposal) {
                                function1.invoke(ClientMapperKt.toSign((Core.Model.Message.SessionProposal) message));
                            } else if (message instanceof Core.Model.Message.SessionAuthenticate) {
                                function1.invoke(ClientMapperKt.toSign((Core.Model.Message.SessionAuthenticate) message));
                            }
                        }
                    };
                    final Function1<Sign.Model.Error, Unit> function13 = this.$onError;
                    Function1<Throwable, Unit> function14 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.client.SignProtocol.decryptMessage.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$Error, kotlin.Unit> */
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
                            function13.invoke(new Sign.Model.Error(th));
                        }
                    };
                    this.label = 1;
                    if (signEngine2.decryptNotification(topic, encryptedMessage, function12, function14, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                this.$onError.invoke(new Sign.Model.Error(e));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$getListOfActiveSessions$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Sign.Model.Session>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19411(Continuation<? super C19411> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19411(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Sign.Model.Session>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Sign.Model.Session>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<Sign.Model.Session>> continuation) {
            return ((C19411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                this.label = 1;
                obj = signEngine.getListOfSettledSessions(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(ClientMapperKt.toClientActiveSession((EngineDO.Session) it.next()));
            }
            return arrayList;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.Session> getListOfActiveSessions() throws IllegalStateException {
        checkEngineInitialization();
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new C19411(null), 1, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$getActiveSessionByTopic$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Sign.Model.Session>, Object> {
        public final /* synthetic */ String $topic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19401(String str, Continuation<? super C19401> continuation) {
            super(2, continuation);
            this.$topic = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19401(this.$topic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Sign.Model.Session> continuation) {
            return ((C19401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                this.label = 1;
                obj = signEngine.getListOfSettledSessions(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(ClientMapperKt.toClientActiveSession((EngineDO.Session) it.next()));
            }
            String str = this.$topic;
            for (Object obj2 : arrayList) {
                if (Intrinsics.EZpvd((Object) ((Sign.Model.Session) obj2).getTopic(), (Object) str)) {
                    return obj2;
                }
            }
            return null;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public Sign.Model.Session getActiveSessionByTopic(@NotNull String str) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        checkEngineInitialization();
        return (Sign.Model.Session) BuildersKt__BuildersKt.runBlocking$default(null, new C19401(str, null), 1, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$getPendingSessionRequests$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Sign.Model.SessionRequest>>, Object> {
        public final /* synthetic */ String $topic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19441(String str, Continuation<? super C19441> continuation) {
            super(2, continuation);
            this.$topic = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19441(this.$topic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Sign.Model.SessionRequest>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Sign.Model.SessionRequest>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<Sign.Model.SessionRequest>> continuation) {
            return ((C19441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                Topic topic = new Topic(this.$topic);
                this.label = 1;
                obj = signEngine.getPendingSessionRequests(topic, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return ClientMapperKt.mapToPendingSessionRequests((List) obj);
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.SessionRequest> getPendingSessionRequests(@NotNull String str) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        checkEngineInitialization();
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new C19441(str, null), 1, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$getSessionProposals$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Sign.Model.SessionProposal>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19451(Continuation<? super C19451> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19451(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Sign.Model.SessionProposal>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Sign.Model.SessionProposal>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<Sign.Model.SessionProposal>> continuation) {
            return ((C19451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                this.label = 1;
                obj = signEngine.getSessionProposals(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(ClientMapperKt.toClientSessionProposal((EngineDO.SessionProposal) it.next()));
            }
            return arrayList;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.SessionProposal> getSessionProposals() throws IllegalStateException {
        checkEngineInitialization();
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new C19451(null), 1, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$getPendingAuthenticateRequests$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Sign.Model.SessionAuthenticate>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19431(Continuation<? super C19431> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19431(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Sign.Model.SessionAuthenticate>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Sign.Model.SessionAuthenticate>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<Sign.Model.SessionAuthenticate>> continuation) {
            return ((C19431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                this.label = 1;
                obj = signEngine.getPendingAuthenticateRequests(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(ClientMapperKt.toClient((Request) it.next()));
            }
            return arrayList;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.SessionAuthenticate> getPendingAuthenticateRequests() throws IllegalStateException {
        checkEngineInitialization();
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new C19431(null), 1, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$getVerifyContext$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Sign.Model.VerifyContext>, Object> {
        public final /* synthetic */ long $id;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19461(long j, Continuation<? super C19461> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19461(this.$id, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Sign.Model.VerifyContext> continuation) {
            return ((C19461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                long j = this.$id;
                this.label = 1;
                obj = signEngine.getVerifyContext(j, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            EngineDO.VerifyContext verifyContext = (EngineDO.VerifyContext) obj;
            if (verifyContext != null) {
                return ClientMapperKt.toCore(verifyContext);
            }
            return null;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public Sign.Model.VerifyContext getVerifyContext(long j) throws IllegalStateException {
        checkEngineInitialization();
        return (Sign.Model.VerifyContext) BuildersKt__BuildersKt.runBlocking$default(null, new C19461(j, null), 1, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$getListOfVerifyContexts$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Sign.Model.VerifyContext>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19421(Continuation<? super C19421> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignProtocol.this.new C19421(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Sign.Model.VerifyContext>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Sign.Model.VerifyContext>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<Sign.Model.VerifyContext>> continuation) {
            return ((C19421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SignEngine signEngine = SignProtocol.this.signEngine;
                if (signEngine == null) {
                    Intrinsics.gEmmrt("");
                    signEngine = null;
                }
                this.label = 1;
                obj = signEngine.getListOfVerifyContexts(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(ClientMapperKt.toCore((EngineDO.VerifyContext) it.next()));
            }
            return arrayList;
        }
    }

    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.VerifyContext> getListOfVerifyContexts() throws IllegalStateException {
        checkEngineInitialization();
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new C19421(null), 1, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.client.SignProtocol$handleConnectionState$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19471 extends SuspendLambda implements Function2<WSSConnectionState, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Sign.Model.ConnectionState, Unit> $onDelegate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.sign.client.Sign$Model$ConnectionState, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19471(Function1<? super Sign.Model.ConnectionState, Unit> function1, Continuation<? super C19471> continuation) {
            super(2, continuation);
            this.$onDelegate = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19471 c19471 = SignProtocol.this.new C19471(this.$onDelegate, continuation);
            c19471.L$0 = obj;
            return c19471;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull WSSConnectionState wSSConnectionState, Continuation<? super Unit> continuation) {
            return ((C19471) create(wSSConnectionState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                WSSConnectionState wSSConnectionState = (WSSConnectionState) this.L$0;
                if (SignProtocol.this.atomicBoolean == null) {
                    SignProtocol.this.atomicBoolean = new AtomicBoolean();
                    if (wSSConnectionState instanceof WSSConnectionState.Disconnected.ConnectionFailed) {
                        this.$onDelegate.invoke(new Sign.Model.ConnectionState(false, new Sign.Model.ConnectionState.Reason.ConnectionFailed(((WSSConnectionState.Disconnected.ConnectionFailed) wSSConnectionState).getThrowable())));
                    } else if (wSSConnectionState instanceof WSSConnectionState.Disconnected.ConnectionClosed) {
                        Function1<Sign.Model.ConnectionState, Unit> function1 = this.$onDelegate;
                        String message = ((WSSConnectionState.Disconnected.ConnectionClosed) wSSConnectionState).getMessage();
                        function1.invoke(new Sign.Model.ConnectionState(false, new Sign.Model.ConnectionState.Reason.ConnectionClosed(message != null ? message : "Connection closed")));
                    } else {
                        this.$onDelegate.invoke(new Sign.Model.ConnectionState(true, null, 2, null));
                    }
                } else {
                    AtomicBoolean atomicBoolean = SignProtocol.this.atomicBoolean;
                    if (atomicBoolean == null || !atomicBoolean.get() || !(wSSConnectionState instanceof WSSConnectionState.Disconnected.ConnectionFailed)) {
                        AtomicBoolean atomicBoolean2 = SignProtocol.this.atomicBoolean;
                        if (atomicBoolean2 == null || !atomicBoolean2.get() || !(wSSConnectionState instanceof WSSConnectionState.Disconnected.ConnectionClosed)) {
                            AtomicBoolean atomicBoolean3 = SignProtocol.this.atomicBoolean;
                            if (atomicBoolean3 != null && !atomicBoolean3.get() && (wSSConnectionState instanceof WSSConnectionState.Connected)) {
                                AtomicBoolean atomicBoolean4 = SignProtocol.this.atomicBoolean;
                                if (atomicBoolean4 != null) {
                                    atomicBoolean4.set(true);
                                }
                                this.$onDelegate.invoke(new Sign.Model.ConnectionState(true, null, 2, null));
                            }
                        } else {
                            AtomicBoolean atomicBoolean5 = SignProtocol.this.atomicBoolean;
                            if (atomicBoolean5 != null) {
                                atomicBoolean5.set(false);
                            }
                            Function1<Sign.Model.ConnectionState, Unit> function12 = this.$onDelegate;
                            String message2 = ((WSSConnectionState.Disconnected.ConnectionClosed) wSSConnectionState).getMessage();
                            function12.invoke(new Sign.Model.ConnectionState(false, new Sign.Model.ConnectionState.Reason.ConnectionClosed(message2 != null ? message2 : "Connection closed")));
                        }
                    } else {
                        AtomicBoolean atomicBoolean6 = SignProtocol.this.atomicBoolean;
                        if (atomicBoolean6 != null) {
                            atomicBoolean6.set(false);
                        }
                        this.$onDelegate.invoke(new Sign.Model.ConnectionState(false, new Sign.Model.ConnectionState.Reason.ConnectionFailed(((WSSConnectionState.Disconnected.ConnectionFailed) wSSConnectionState).getThrowable())));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleConnectionState(Function1<? super Sign.Model.ConnectionState, Unit> function1) {
        SignEngine signEngine = this.signEngine;
        if (signEngine == null) {
            Intrinsics.gEmmrt("");
            signEngine = null;
        }
        FlowKt.launchIn(FlowKt.onEach(signEngine.getWssConnection(), new C19471(function1, null)), WalletConnectScopeKt.getScope());
    }

    public final void checkEngineInitialization() throws IllegalStateException {
        if (this.signEngine == null) {
            throw new IllegalStateException("SignClient needs to be initialized first using the initialize function".toString());
        }
    }
}
