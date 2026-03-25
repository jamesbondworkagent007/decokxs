package com.reown.sign.engine.use_case.responses;

import com.reown.android.Core;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.SymmetricKey;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.CacaoVerifier;
import com.reown.android.internal.common.signing.cacao.Issuer;
import com.reown.android.internal.common.signing.cacao.UtilsKt;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.android.utils.ExtensionsKt;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.engine.use_case.calls.GetNamespacesFromReCaps;
import com.reown.sign.json_rpc.domain.GetSessionAuthenticateRequest;
import com.reown.sign.storage.authenticate.AuthenticateResponseTopicRepository;
import com.reown.sign.storage.link_mode.LinkModeStorageRepository;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionAuthenticateResponseUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final AuthenticateResponseTopicRepository authenticateResponseTopicRepository;
    public final CacaoVerifier cacaoVerifier;
    public final String clientId;
    public final KeyManagementRepository crypto;
    public final SharedFlow<EngineEvent> events;
    public final GetSessionAuthenticateRequest getSessionAuthenticateRequest;
    public final InsertEventUseCase insertEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final LinkModeStorageRepository linkModeStorageRepository;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final PairingControllerInterface pairingController;
    public final PairingInterface pairingInterface;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionAuthenticateResponseUseCase(@NotNull PairingControllerInterface pairingControllerInterface, @NotNull PairingInterface pairingInterface, @NotNull CacaoVerifier cacaoVerifier, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull KeyManagementRepository keyManagementRepository, @NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull AuthenticateResponseTopicRepository authenticateResponseTopicRepository, @NotNull Logger logger, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str, @NotNull GetSessionAuthenticateRequest getSessionAuthenticateRequest, @NotNull LinkModeStorageRepository linkModeStorageRepository) {
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        Intrinsics.checkNotNullParameter(pairingInterface, "");
        Intrinsics.checkNotNullParameter(cacaoVerifier, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(authenticateResponseTopicRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getSessionAuthenticateRequest, "");
        Intrinsics.checkNotNullParameter(linkModeStorageRepository, "");
        this.pairingController = pairingControllerInterface;
        this.pairingInterface = pairingInterface;
        this.cacaoVerifier = cacaoVerifier;
        this.sessionStorageRepository = sessionStorageRepository;
        this.crypto = keyManagementRepository;
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.authenticateResponseTopicRepository = authenticateResponseTopicRepository;
        this.logger = logger;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        this.getSessionAuthenticateRequest = getSessionAuthenticateRequest;
        this.linkModeStorageRepository = linkModeStorageRepository;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.SessionAuthenticateParams $params;
        public final /* synthetic */ WCResponse $wcResponse;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCResponse wCResponse, SignParams.SessionAuthenticateParams sessionAuthenticateParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$wcResponse = wCResponse;
            this.$params = sessionAuthenticateParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = OnSessionAuthenticateResponseUseCase.this.new AnonymousClass2(this.$wcResponse, this.$params, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:128:0x0567 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:8:0x0039, B:134:0x05da, B:136:0x061a, B:138:0x0620, B:11:0x0062, B:124:0x04dd, B:126:0x04f4, B:128:0x0567, B:12:0x0069, B:109:0x0422, B:13:0x006e, B:88:0x0315, B:14:0x0073, B:17:0x007c, B:69:0x022a, B:58:0x019a, B:60:0x01a4, B:61:0x01c0, B:63:0x01ca, B:65:0x01d2, B:72:0x028b, B:74:0x028f, B:76:0x0297, B:77:0x02b9, B:78:0x02d2, B:80:0x02d8, B:85:0x02ee, B:90:0x0318, B:92:0x0375, B:93:0x037d, B:94:0x038e, B:96:0x0394, B:97:0x03b1, B:98:0x03be, B:100:0x03c4, B:101:0x03ce, B:103:0x03d4, B:104:0x03fd, B:106:0x0403, B:111:0x0425, B:113:0x046d, B:115:0x04a5, B:117:0x04ab, B:120:0x04b2, B:125:0x04e9, B:57:0x018f, B:24:0x0093, B:49:0x016b, B:29:0x00a2, B:31:0x00d8, B:33:0x00fb, B:35:0x0107, B:37:0x0115, B:46:0x013b, B:40:0x011c, B:41:0x0120, B:43:0x0126, B:51:0x016e, B:20:0x008b, B:55:0x0187, B:52:0x0170), top: B:146:0x0011, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x061a A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:8:0x0039, B:134:0x05da, B:136:0x061a, B:138:0x0620, B:11:0x0062, B:124:0x04dd, B:126:0x04f4, B:128:0x0567, B:12:0x0069, B:109:0x0422, B:13:0x006e, B:88:0x0315, B:14:0x0073, B:17:0x007c, B:69:0x022a, B:58:0x019a, B:60:0x01a4, B:61:0x01c0, B:63:0x01ca, B:65:0x01d2, B:72:0x028b, B:74:0x028f, B:76:0x0297, B:77:0x02b9, B:78:0x02d2, B:80:0x02d8, B:85:0x02ee, B:90:0x0318, B:92:0x0375, B:93:0x037d, B:94:0x038e, B:96:0x0394, B:97:0x03b1, B:98:0x03be, B:100:0x03c4, B:101:0x03ce, B:103:0x03d4, B:104:0x03fd, B:106:0x0403, B:111:0x0425, B:113:0x046d, B:115:0x04a5, B:117:0x04ab, B:120:0x04b2, B:125:0x04e9, B:57:0x018f, B:24:0x0093, B:49:0x016b, B:29:0x00a2, B:31:0x00d8, B:33:0x00fb, B:35:0x0107, B:37:0x0115, B:46:0x013b, B:40:0x011c, B:41:0x0120, B:43:0x0126, B:51:0x016e, B:20:0x008b, B:55:0x0187, B:52:0x0170), top: B:146:0x0011, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x061f  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0640 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a4 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:8:0x0039, B:134:0x05da, B:136:0x061a, B:138:0x0620, B:11:0x0062, B:124:0x04dd, B:126:0x04f4, B:128:0x0567, B:12:0x0069, B:109:0x0422, B:13:0x006e, B:88:0x0315, B:14:0x0073, B:17:0x007c, B:69:0x022a, B:58:0x019a, B:60:0x01a4, B:61:0x01c0, B:63:0x01ca, B:65:0x01d2, B:72:0x028b, B:74:0x028f, B:76:0x0297, B:77:0x02b9, B:78:0x02d2, B:80:0x02d8, B:85:0x02ee, B:90:0x0318, B:92:0x0375, B:93:0x037d, B:94:0x038e, B:96:0x0394, B:97:0x03b1, B:98:0x03be, B:100:0x03c4, B:101:0x03ce, B:103:0x03d4, B:104:0x03fd, B:106:0x0403, B:111:0x0425, B:113:0x046d, B:115:0x04a5, B:117:0x04ab, B:120:0x04b2, B:125:0x04e9, B:57:0x018f, B:24:0x0093, B:49:0x016b, B:29:0x00a2, B:31:0x00d8, B:33:0x00fb, B:35:0x0107, B:37:0x0115, B:46:0x013b, B:40:0x011c, B:41:0x0120, B:43:0x0126, B:51:0x016e, B:20:0x008b, B:55:0x0187, B:52:0x0170), top: B:146:0x0011, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01ca A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:8:0x0039, B:134:0x05da, B:136:0x061a, B:138:0x0620, B:11:0x0062, B:124:0x04dd, B:126:0x04f4, B:128:0x0567, B:12:0x0069, B:109:0x0422, B:13:0x006e, B:88:0x0315, B:14:0x0073, B:17:0x007c, B:69:0x022a, B:58:0x019a, B:60:0x01a4, B:61:0x01c0, B:63:0x01ca, B:65:0x01d2, B:72:0x028b, B:74:0x028f, B:76:0x0297, B:77:0x02b9, B:78:0x02d2, B:80:0x02d8, B:85:0x02ee, B:90:0x0318, B:92:0x0375, B:93:0x037d, B:94:0x038e, B:96:0x0394, B:97:0x03b1, B:98:0x03be, B:100:0x03c4, B:101:0x03ce, B:103:0x03d4, B:104:0x03fd, B:106:0x0403, B:111:0x0425, B:113:0x046d, B:115:0x04a5, B:117:0x04ab, B:120:0x04b2, B:125:0x04e9, B:57:0x018f, B:24:0x0093, B:49:0x016b, B:29:0x00a2, B:31:0x00d8, B:33:0x00fb, B:35:0x0107, B:37:0x0115, B:46:0x013b, B:40:0x011c, B:41:0x0120, B:43:0x0126, B:51:0x016e, B:20:0x008b, B:55:0x0187, B:52:0x0170), top: B:146:0x0011, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x028a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x028b A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:8:0x0039, B:134:0x05da, B:136:0x061a, B:138:0x0620, B:11:0x0062, B:124:0x04dd, B:126:0x04f4, B:128:0x0567, B:12:0x0069, B:109:0x0422, B:13:0x006e, B:88:0x0315, B:14:0x0073, B:17:0x007c, B:69:0x022a, B:58:0x019a, B:60:0x01a4, B:61:0x01c0, B:63:0x01ca, B:65:0x01d2, B:72:0x028b, B:74:0x028f, B:76:0x0297, B:77:0x02b9, B:78:0x02d2, B:80:0x02d8, B:85:0x02ee, B:90:0x0318, B:92:0x0375, B:93:0x037d, B:94:0x038e, B:96:0x0394, B:97:0x03b1, B:98:0x03be, B:100:0x03c4, B:101:0x03ce, B:103:0x03d4, B:104:0x03fd, B:106:0x0403, B:111:0x0425, B:113:0x046d, B:115:0x04a5, B:117:0x04ab, B:120:0x04b2, B:125:0x04e9, B:57:0x018f, B:24:0x0093, B:49:0x016b, B:29:0x00a2, B:31:0x00d8, B:33:0x00fb, B:35:0x0107, B:37:0x0115, B:46:0x013b, B:40:0x011c, B:41:0x0120, B:43:0x0126, B:51:0x016e, B:20:0x008b, B:55:0x0187, B:52:0x0170), top: B:146:0x0011, inners: #0 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Topic topic;
            JsonRpcResponse response;
            CoreSignParams.SessionAuthenticateApproveParams sessionAuthenticateApproveParams;
            Object next;
            SignParams.SessionAuthenticateParams sessionAuthenticateParams;
            final OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase;
            WCResponse wCResponse;
            Topic topic2;
            SessionVO sessionVO;
            String str;
            Map map;
            Map map2;
            TransportType transportType;
            OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase2;
            CoreSignParams.SessionAuthenticateApproveParams sessionAuthenticateApproveParams2;
            JsonRpcResponse jsonRpcResponse;
            Topic topic3;
            String appLink;
            WCResponse wCResponse2;
            Map map3;
            Map map4;
            Topic topic4;
            JsonRpcResponse jsonRpcResponse2;
            MutableSharedFlow mutableSharedFlow;
            EngineDO.SessionAuthenticateResponse.Error error;
            WCResponse wCResponse3;
            SessionVO sessionVO2;
            MutableSharedFlow mutableSharedFlow2;
            EngineDO.SessionAuthenticateResponse.Result result;
            Request<SignParams.SessionAuthenticateParams> requestInvoke$sign_release;
            Topic topic5;
            Object objCopydefault = C56442yFn.copydefault();
            try {
                try {
                } catch (Throwable th) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (Exception e) {
                OnSessionAuthenticateResponseUseCase.this.logger.error("Received session authenticate response - exception:" + e);
                MutableSharedFlow mutableSharedFlow3 = OnSessionAuthenticateResponseUseCase.this._events;
                SDKError sDKError = new SDKError(e);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.label = 10;
                if (mutableSharedFlow3.emit(sDKError, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    requestInvoke$sign_release = OnSessionAuthenticateResponseUseCase.this.getSessionAuthenticateRequest.invoke$sign_release(this.$wcResponse.getResponse().getId());
                    OnSessionAuthenticateResponseUseCase.this.logger.log("Received session authenticate response: " + this.$wcResponse.getTopic());
                    if (requestInvoke$sign_release == null) {
                        OnSessionAuthenticateResponseUseCase.this.logger.error("Received session authenticate response - rpc entry doesn't exist: " + this.$wcResponse.getTopic());
                        return Unit.INSTANCE;
                    }
                    topic5 = requestInvoke$sign_release.getTopic();
                    if (requestInvoke$sign_release.getTransportType() == TransportType.RELAY) {
                        List<Core.Model.Pairing> pairings = OnSessionAuthenticateResponseUseCase.this.pairingInterface.getPairings();
                        if (!(pairings instanceof Collection) || !pairings.isEmpty()) {
                            Iterator<T> it = pairings.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.EZpvd((Object) ((Core.Model.Pairing) it.next()).getTopic(), (Object) topic5.getValue())) {
                                }
                            }
                        }
                        MutableSharedFlow mutableSharedFlow4 = OnSessionAuthenticateResponseUseCase.this._events;
                        SDKError sDKError2 = new SDKError(new Throwable("Received session authenticate response - pairing doesn't exist topic: " + this.$wcResponse.getTopic()));
                        this.label = 1;
                        if (mutableSharedFlow4.emit(sDKError2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase3 = OnSessionAuthenticateResponseUseCase.this;
                    Result.Application application2 = Result.Companion;
                    AuthenticateResponseTopicRepository authenticateResponseTopicRepository = onSessionAuthenticateResponseUseCase3.authenticateResponseTopicRepository;
                    String value = topic5.getValue();
                    this.L$0 = requestInvoke$sign_release;
                    this.L$1 = topic5;
                    this.label = 2;
                    if (authenticateResponseTopicRepository.delete(value, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    topic = topic5;
                    OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase4 = OnSessionAuthenticateResponseUseCase.this;
                    WCResponse wCResponse4 = this.$wcResponse;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        onSessionAuthenticateResponseUseCase4.logger.error("Received session authenticate response - failed to delete authenticate response topic: " + wCResponse4.getTopic());
                    }
                    response = this.$wcResponse.getResponse();
                    if (!(response instanceof JsonRpcResponse.JsonRpcError)) {
                        if (requestInvoke$sign_release.getTransportType() == TransportType.LINK_MODE) {
                            InsertEventUseCase insertEventUseCase = OnSessionAuthenticateResponseUseCase.this.insertEventUseCase;
                            Props props = new Props("SUCCESS", String.valueOf(Tags.SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_REJECT.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$wcResponse.getResponse().getId()), OnSessionAuthenticateResponseUseCase.this.clientId, Direction.RECEIVED.getState(), null, 2303, null));
                            this.L$0 = response;
                            this.L$1 = null;
                            this.label = 3;
                            if (insertEventUseCase.invoke(props, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        jsonRpcResponse2 = response;
                        OnSessionAuthenticateResponseUseCase.this.logger.error("Received session authenticate response - emitting rpc error: " + this.$wcResponse.getTopic() + ", " + ((JsonRpcResponse.JsonRpcError) jsonRpcResponse2).getError());
                        mutableSharedFlow = OnSessionAuthenticateResponseUseCase.this._events;
                        error = new EngineDO.SessionAuthenticateResponse.Error(jsonRpcResponse2.getId(), ((JsonRpcResponse.JsonRpcError) jsonRpcResponse2).getError().getCode(), ((JsonRpcResponse.JsonRpcError) jsonRpcResponse2).getError().getMessage());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (mutableSharedFlow.emit(error, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    if (response instanceof JsonRpcResponse.JsonRpcResult) {
                        if (requestInvoke$sign_release.getTransportType() == TransportType.RELAY) {
                            PairingControllerInterface.DefaultImpls.updateMetadata$default(OnSessionAuthenticateResponseUseCase.this.pairingController, new Core.Params.UpdateMetadata(topic.getValue(), ExtensionsKt.toClient(this.$params.getRequester().getMetadata()), AppMetaDataType.PEER), null, 2, null);
                        }
                        Object result2 = ((JsonRpcResponse.JsonRpcResult) response).getResult();
                        Intrinsics.copydefault(result2, "");
                        sessionAuthenticateApproveParams = (CoreSignParams.SessionAuthenticateApproveParams) result2;
                        List<Cacao> cacaos = sessionAuthenticateApproveParams.getCacaos();
                        OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase5 = OnSessionAuthenticateResponseUseCase.this;
                        Iterator<T> it2 = cacaos.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (!onSessionAuthenticateResponseUseCase5.cacaoVerifier.verify((Cacao) next)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next != null) {
                            OnSessionAuthenticateResponseUseCase.this.logger.error("Signature verification failed Session Authenticate");
                            MutableSharedFlow mutableSharedFlow5 = OnSessionAuthenticateResponseUseCase.this._events;
                            SDKError sDKError3 = new SDKError(new Throwable("Signature verification failed Session Authenticate"));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 5;
                            if (mutableSharedFlow5.emit(sDKError3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                        sessionAuthenticateParams = this.$params;
                        onSessionAuthenticateResponseUseCase = OnSessionAuthenticateResponseUseCase.this;
                        wCResponse = this.$wcResponse;
                        String strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I = onSessionAuthenticateResponseUseCase.crypto.mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(PublicKey.m7317constructorimpl(sessionAuthenticateParams.getRequester().getPublicKey()), PublicKey.m7317constructorimpl(sessionAuthenticateApproveParams.getResponder().getPublicKey()));
                        Topic topicFromKey = onSessionAuthenticateResponseUseCase.crypto.getTopicFromKey(SymmetricKey.m7238boximpl(strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I));
                        onSessionAuthenticateResponseUseCase.crypto.setKey(SymmetricKey.m7238boximpl(strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I), topicFromKey.getValue());
                        List<String> chains = UtilsKt.getChains(((Cacao) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionAuthenticateApproveParams.getCacaos())).getPayload().getResources());
                        if (chains.isEmpty()) {
                            chains = sessionAuthenticateParams.getAuthPayload().getChains();
                        }
                        List<Cacao> cacaos2 = sessionAuthenticateApproveParams.getCacaos();
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(cacaos2, 10));
                        Iterator<T> it3 = cacaos2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(new Issuer(((Cacao) it3.next()).getPayload().getIss()).getAddress());
                        }
                        List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = chains.iterator();
                        while (it4.hasNext()) {
                            String str2 = (String) it4.next();
                            Iterator it5 = listQbewEr.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(str2 + ":" + ((String) it5.next()));
                                listQbewEr = listQbewEr;
                                it4 = it4;
                            }
                        }
                        if (!onSessionAuthenticateResponseUseCase.areEVMAndCAIP2Chains(chains)) {
                            MutableSharedFlow mutableSharedFlow6 = onSessionAuthenticateResponseUseCase._events;
                            SDKError sDKError4 = new SDKError(new Exception("Chains are not CAIP-2 compliant or are not EVM chains"));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 6;
                            if (mutableSharedFlow6.emit(sDKError4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                        String namespace = new Issuer(((Cacao) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionAuthenticateApproveParams.getCacaos())).getPayload().getIss()).getNamespace();
                        List<String> methods = ((Cacao) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionAuthenticateApproveParams.getCacaos())).getPayload().getMethods();
                        List listGEmmrt = yDY.gEmmrt("chainChanged", "accountsChanged");
                        if (!methods.isEmpty()) {
                            str = "SUCCESS";
                            onSessionAuthenticateResponseUseCase.logger.log("Creating authenticated session");
                            Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(namespace, new Namespace.Session(chains, arrayList2, methods, listGEmmrt)));
                            Map mapEZpvd2 = C56423yEv.EZpvd(C56390yDp.OLrzqt(namespace, new Namespace.Proposal(listGEmmrt, chains, yDY.AhwBna())));
                            if (Intrinsics.EZpvd(sessionAuthenticateApproveParams.getLinkMode(), C56443yFo.KWHzl(true)) && (appLink = sessionAuthenticateApproveParams.getAppLink()) != null && appLink.length() != 0) {
                                LinkModeStorageRepository linkModeStorageRepository = onSessionAuthenticateResponseUseCase.linkModeStorageRepository;
                                String appLink2 = sessionAuthenticateApproveParams.getAppLink();
                                Intrinsics.copydefault((Object) appLink2);
                                this.L$0 = topic;
                                this.L$1 = response;
                                this.L$2 = sessionAuthenticateApproveParams;
                                this.L$3 = sessionAuthenticateParams;
                                this.L$4 = onSessionAuthenticateResponseUseCase;
                                this.L$5 = wCResponse;
                                this.L$6 = topicFromKey;
                                this.L$7 = mapEZpvd;
                                this.L$8 = mapEZpvd2;
                                this.label = 7;
                                if (linkModeStorageRepository.insert(appLink2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                wCResponse2 = wCResponse;
                                map3 = mapEZpvd2;
                                map4 = mapEZpvd;
                                topic4 = topicFromKey;
                                transportType = TransportType.LINK_MODE;
                                map = map3;
                                map2 = map4;
                                topic3 = topic4;
                                wCResponse = wCResponse2;
                                onSessionAuthenticateResponseUseCase2 = onSessionAuthenticateResponseUseCase;
                                sessionAuthenticateApproveParams2 = sessionAuthenticateApproveParams;
                                jsonRpcResponse = response;
                                SessionVO sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release = SessionVO.Companion.m7341createAuthenticatedSessiontF0nsiE$sign_release(topic3, PublicKey.m7317constructorimpl(sessionAuthenticateApproveParams2.getResponder().getPublicKey()), sessionAuthenticateApproveParams2.getResponder().getMetadata(), PublicKey.m7317constructorimpl(sessionAuthenticateParams.getRequester().getPublicKey()), sessionAuthenticateParams.getRequester().getMetadata(), PublicKey.m7317constructorimpl(sessionAuthenticateApproveParams2.getResponder().getPublicKey()), map, map2, topic.getValue(), transportType);
                                onSessionAuthenticateResponseUseCase2.metadataStorageRepository.insertOrAbortMetadata(topic3, sessionAuthenticateParams.getRequester().getMetadata(), AppMetaDataType.SELF);
                                onSessionAuthenticateResponseUseCase2.metadataStorageRepository.insertOrAbortMetadata(topic3, sessionAuthenticateApproveParams2.getResponder().getMetadata(), AppMetaDataType.PEER);
                                onSessionAuthenticateResponseUseCase2.sessionStorageRepository.insertSession(sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release, jsonRpcResponse.getId());
                                if (transportType == TransportType.LINK_MODE) {
                                    InsertEventUseCase insertEventUseCase2 = onSessionAuthenticateResponseUseCase2.insertEventUseCase;
                                    Props props2 = new Props(str, String.valueOf(Tags.SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_APPROVE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(wCResponse.getResponse().getId()), onSessionAuthenticateResponseUseCase2.clientId, Direction.RECEIVED.getState(), null, 2303, null));
                                    this.L$0 = jsonRpcResponse;
                                    this.L$1 = sessionAuthenticateApproveParams2;
                                    this.L$2 = onSessionAuthenticateResponseUseCase2;
                                    this.L$3 = wCResponse;
                                    this.L$4 = topic3;
                                    this.L$5 = sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.L$8 = null;
                                    this.label = 8;
                                    if (insertEventUseCase2.invoke(props2, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                wCResponse3 = wCResponse;
                                sessionVO2 = sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release;
                                topic2 = topic3;
                                sessionAuthenticateApproveParams = sessionAuthenticateApproveParams2;
                                response = jsonRpcResponse;
                                sessionVO = sessionVO2;
                                wCResponse = wCResponse3;
                                onSessionAuthenticateResponseUseCase = onSessionAuthenticateResponseUseCase2;
                                RelayJsonRpcInteractorInterface.DefaultImpls.subscribe$default(onSessionAuthenticateResponseUseCase.jsonRpcInteractor, topic2, null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ Throwable $error;
                                        public int label;
                                        public final /* synthetic */ OnSessionAuthenticateResponseUseCase this$0;

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.this$0 = onSessionAuthenticateResponseUseCase;
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
                                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(onSessionAuthenticateResponseUseCase, th2, null), 3, null);
                                    }
                                }, 2, null);
                                onSessionAuthenticateResponseUseCase.logger.log("Received session authenticate response - emitting rpc result: " + wCResponse.getTopic());
                                mutableSharedFlow2 = onSessionAuthenticateResponseUseCase._events;
                                result = new EngineDO.SessionAuthenticateResponse.Result(response.getId(), sessionAuthenticateApproveParams.getCacaos(), sessionVO != null ? EngineMapperKt.toEngineDO(sessionVO) : null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 9;
                                if (mutableSharedFlow2.emit(result, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            map = mapEZpvd2;
                            map2 = mapEZpvd;
                            transportType = TransportType.RELAY;
                            onSessionAuthenticateResponseUseCase2 = onSessionAuthenticateResponseUseCase;
                            sessionAuthenticateApproveParams2 = sessionAuthenticateApproveParams;
                            jsonRpcResponse = response;
                            topic3 = topicFromKey;
                            SessionVO sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release2 = SessionVO.Companion.m7341createAuthenticatedSessiontF0nsiE$sign_release(topic3, PublicKey.m7317constructorimpl(sessionAuthenticateApproveParams2.getResponder().getPublicKey()), sessionAuthenticateApproveParams2.getResponder().getMetadata(), PublicKey.m7317constructorimpl(sessionAuthenticateParams.getRequester().getPublicKey()), sessionAuthenticateParams.getRequester().getMetadata(), PublicKey.m7317constructorimpl(sessionAuthenticateApproveParams2.getResponder().getPublicKey()), map, map2, topic.getValue(), transportType);
                            onSessionAuthenticateResponseUseCase2.metadataStorageRepository.insertOrAbortMetadata(topic3, sessionAuthenticateParams.getRequester().getMetadata(), AppMetaDataType.SELF);
                            onSessionAuthenticateResponseUseCase2.metadataStorageRepository.insertOrAbortMetadata(topic3, sessionAuthenticateApproveParams2.getResponder().getMetadata(), AppMetaDataType.PEER);
                            onSessionAuthenticateResponseUseCase2.sessionStorageRepository.insertSession(sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release2, jsonRpcResponse.getId());
                            if (transportType == TransportType.LINK_MODE) {
                            }
                            wCResponse3 = wCResponse;
                            sessionVO2 = sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release2;
                            topic2 = topic3;
                            sessionAuthenticateApproveParams = sessionAuthenticateApproveParams2;
                            response = jsonRpcResponse;
                            sessionVO = sessionVO2;
                            wCResponse = wCResponse3;
                            onSessionAuthenticateResponseUseCase = onSessionAuthenticateResponseUseCase2;
                            RelayJsonRpcInteractorInterface.DefaultImpls.subscribe$default(onSessionAuthenticateResponseUseCase.jsonRpcInteractor, topic2, null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ Throwable $error;
                                    public int label;
                                    public final /* synthetic */ OnSessionAuthenticateResponseUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.this$0 = onSessionAuthenticateResponseUseCase;
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
                                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(onSessionAuthenticateResponseUseCase, th2, null), 3, null);
                                }
                            }, 2, null);
                            onSessionAuthenticateResponseUseCase.logger.log("Received session authenticate response - emitting rpc result: " + wCResponse.getTopic());
                            mutableSharedFlow2 = onSessionAuthenticateResponseUseCase._events;
                            result = new EngineDO.SessionAuthenticateResponse.Result(response.getId(), sessionAuthenticateApproveParams.getCacaos(), sessionVO != null ? EngineMapperKt.toEngineDO(sessionVO) : null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.label = 9;
                            if (mutableSharedFlow2.emit(result, this) == objCopydefault) {
                            }
                        } else {
                            topic2 = topicFromKey;
                            sessionVO = null;
                            RelayJsonRpcInteractorInterface.DefaultImpls.subscribe$default(onSessionAuthenticateResponseUseCase.jsonRpcInteractor, topic2, null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ Throwable $error;
                                    public int label;
                                    public final /* synthetic */ OnSessionAuthenticateResponseUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.this$0 = onSessionAuthenticateResponseUseCase;
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
                                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(onSessionAuthenticateResponseUseCase, th2, null), 3, null);
                                }
                            }, 2, null);
                            onSessionAuthenticateResponseUseCase.logger.log("Received session authenticate response - emitting rpc result: " + wCResponse.getTopic());
                            mutableSharedFlow2 = onSessionAuthenticateResponseUseCase._events;
                            result = new EngineDO.SessionAuthenticateResponse.Result(response.getId(), sessionAuthenticateApproveParams.getCacaos(), sessionVO != null ? EngineMapperKt.toEngineDO(sessionVO) : null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.label = 9;
                            if (mutableSharedFlow2.emit(result, this) == objCopydefault) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                case 2:
                    topic5 = (Topic) this.L$1;
                    requestInvoke$sign_release = (Request) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    topic = topic5;
                    OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase42 = OnSessionAuthenticateResponseUseCase.this;
                    WCResponse wCResponse42 = this.$wcResponse;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    }
                    response = this.$wcResponse.getResponse();
                    if (!(response instanceof JsonRpcResponse.JsonRpcError)) {
                    }
                    break;
                case 3:
                    jsonRpcResponse2 = (JsonRpcResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    OnSessionAuthenticateResponseUseCase.this.logger.error("Received session authenticate response - emitting rpc error: " + this.$wcResponse.getTopic() + ", " + ((JsonRpcResponse.JsonRpcError) jsonRpcResponse2).getError());
                    mutableSharedFlow = OnSessionAuthenticateResponseUseCase.this._events;
                    error = new EngineDO.SessionAuthenticateResponse.Error(jsonRpcResponse2.getId(), ((JsonRpcResponse.JsonRpcError) jsonRpcResponse2).getError().getCode(), ((JsonRpcResponse.JsonRpcError) jsonRpcResponse2).getError().getMessage());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(error, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 4:
                case 9:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                case 5:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                case 6:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                case 7:
                    map3 = (Map) this.L$8;
                    map4 = (Map) this.L$7;
                    topic4 = (Topic) this.L$6;
                    wCResponse2 = (WCResponse) this.L$5;
                    onSessionAuthenticateResponseUseCase = (OnSessionAuthenticateResponseUseCase) this.L$4;
                    sessionAuthenticateParams = (SignParams.SessionAuthenticateParams) this.L$3;
                    sessionAuthenticateApproveParams = (CoreSignParams.SessionAuthenticateApproveParams) this.L$2;
                    response = (JsonRpcResponse) this.L$1;
                    topic = (Topic) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str = "SUCCESS";
                    transportType = TransportType.LINK_MODE;
                    map = map3;
                    map2 = map4;
                    topic3 = topic4;
                    wCResponse = wCResponse2;
                    onSessionAuthenticateResponseUseCase2 = onSessionAuthenticateResponseUseCase;
                    sessionAuthenticateApproveParams2 = sessionAuthenticateApproveParams;
                    jsonRpcResponse = response;
                    SessionVO sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release22 = SessionVO.Companion.m7341createAuthenticatedSessiontF0nsiE$sign_release(topic3, PublicKey.m7317constructorimpl(sessionAuthenticateApproveParams2.getResponder().getPublicKey()), sessionAuthenticateApproveParams2.getResponder().getMetadata(), PublicKey.m7317constructorimpl(sessionAuthenticateParams.getRequester().getPublicKey()), sessionAuthenticateParams.getRequester().getMetadata(), PublicKey.m7317constructorimpl(sessionAuthenticateApproveParams2.getResponder().getPublicKey()), map, map2, topic.getValue(), transportType);
                    onSessionAuthenticateResponseUseCase2.metadataStorageRepository.insertOrAbortMetadata(topic3, sessionAuthenticateParams.getRequester().getMetadata(), AppMetaDataType.SELF);
                    onSessionAuthenticateResponseUseCase2.metadataStorageRepository.insertOrAbortMetadata(topic3, sessionAuthenticateApproveParams2.getResponder().getMetadata(), AppMetaDataType.PEER);
                    onSessionAuthenticateResponseUseCase2.sessionStorageRepository.insertSession(sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release22, jsonRpcResponse.getId());
                    if (transportType == TransportType.LINK_MODE) {
                    }
                    wCResponse3 = wCResponse;
                    sessionVO2 = sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release22;
                    topic2 = topic3;
                    sessionAuthenticateApproveParams = sessionAuthenticateApproveParams2;
                    response = jsonRpcResponse;
                    sessionVO = sessionVO2;
                    wCResponse = wCResponse3;
                    onSessionAuthenticateResponseUseCase = onSessionAuthenticateResponseUseCase2;
                    RelayJsonRpcInteractorInterface.DefaultImpls.subscribe$default(onSessionAuthenticateResponseUseCase.jsonRpcInteractor, topic2, null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ Throwable $error;
                            public int label;
                            public final /* synthetic */ OnSessionAuthenticateResponseUseCase this$0;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = onSessionAuthenticateResponseUseCase;
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
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(onSessionAuthenticateResponseUseCase, th2, null), 3, null);
                        }
                    }, 2, null);
                    onSessionAuthenticateResponseUseCase.logger.log("Received session authenticate response - emitting rpc result: " + wCResponse.getTopic());
                    mutableSharedFlow2 = onSessionAuthenticateResponseUseCase._events;
                    result = new EngineDO.SessionAuthenticateResponse.Result(response.getId(), sessionAuthenticateApproveParams.getCacaos(), sessionVO != null ? EngineMapperKt.toEngineDO(sessionVO) : null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 9;
                    if (mutableSharedFlow2.emit(result, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    sessionVO2 = (SessionVO) this.L$5;
                    topic3 = (Topic) this.L$4;
                    wCResponse3 = (WCResponse) this.L$3;
                    onSessionAuthenticateResponseUseCase2 = (OnSessionAuthenticateResponseUseCase) this.L$2;
                    sessionAuthenticateApproveParams2 = (CoreSignParams.SessionAuthenticateApproveParams) this.L$1;
                    jsonRpcResponse = (JsonRpcResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    topic2 = topic3;
                    sessionAuthenticateApproveParams = sessionAuthenticateApproveParams2;
                    response = jsonRpcResponse;
                    sessionVO = sessionVO2;
                    wCResponse = wCResponse3;
                    onSessionAuthenticateResponseUseCase = onSessionAuthenticateResponseUseCase2;
                    RelayJsonRpcInteractorInterface.DefaultImpls.subscribe$default(onSessionAuthenticateResponseUseCase.jsonRpcInteractor, topic2, null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase$invoke$2$5$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ Throwable $error;
                            public int label;
                            public final /* synthetic */ OnSessionAuthenticateResponseUseCase this$0;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = onSessionAuthenticateResponseUseCase;
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
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(onSessionAuthenticateResponseUseCase, th2, null), 3, null);
                        }
                    }, 2, null);
                    onSessionAuthenticateResponseUseCase.logger.log("Received session authenticate response - emitting rpc result: " + wCResponse.getTopic());
                    mutableSharedFlow2 = onSessionAuthenticateResponseUseCase._events;
                    result = new EngineDO.SessionAuthenticateResponse.Result(response.getId(), sessionAuthenticateApproveParams.getCacaos(), sessionVO != null ? EngineMapperKt.toEngineDO(sessionVO) : null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 9;
                    if (mutableSharedFlow2.emit(result, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 10:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object invoke(@NotNull WCResponse wCResponse, @NotNull SignParams.SessionAuthenticateParams sessionAuthenticateParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCResponse, sessionAuthenticateParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    public final boolean areEVMAndCAIP2Chains(List<String> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                if (!CoreValidator.INSTANCE.isChainIdCAIP2Compliant(str) || !Intrinsics.EZpvd((Object) SignValidator.INSTANCE.getNamespaceKeyFromChainId$sign_release(str), (Object) GetNamespacesFromReCaps.EIP155)) {
                    return false;
                }
            }
        }
        return true;
    }
}
