package com.reown.sign.engine.use_case.calls;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.exception.NoInternetConnectionException;
import com.reown.android.internal.common.exception.NoRelayConnectionException;
import com.reown.android.internal.common.exception.RequestExpiredException;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Participant;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.SymmetricKey;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.CacaoVerifier;
import com.reown.android.internal.common.signing.cacao.Issuer;
import com.reown.android.internal.common.signing.cacao.UtilsKt;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.EventType;
import com.reown.android.pulse.model.Trace;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.MissingSessionAuthenticateRequest;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.json_rpc.domain.GetPendingSessionAuthenticateRequest;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ApproveSessionAuthenticateUseCase implements ApproveSessionAuthenticateUseCaseInterface {
    public final CacaoVerifier cacaoVerifier;
    public final String clientId;
    public final KeyManagementRepository crypto;
    public final GetPendingSessionAuthenticateRequest getPendingSessionAuthenticateRequest;
    public final InsertEventUseCase insertEventUseCase;
    public final InsertTelemetryEventUseCase insertTelemetryEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final AppMetaData selfAppMetaData;
    public final SessionStorageRepository sessionStorageRepository;
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    public ApproveSessionAuthenticateUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull GetPendingSessionAuthenticateRequest getPendingSessionAuthenticateRequest, @NotNull KeyManagementRepository keyManagementRepository, @NotNull CacaoVerifier cacaoVerifier, @NotNull VerifyContextStorageRepository verifyContextStorageRepository, @NotNull Logger logger, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull AppMetaData appMetaData, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull InsertTelemetryEventUseCase insertTelemetryEventUseCase, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str, @NotNull LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(getPendingSessionAuthenticateRequest, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(cacaoVerifier, "");
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(insertTelemetryEventUseCase, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(linkModeJsonRpcInteractorInterface, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.getPendingSessionAuthenticateRequest = getPendingSessionAuthenticateRequest;
        this.crypto = keyManagementRepository;
        this.cacaoVerifier = cacaoVerifier;
        this.verifyContextStorageRepository = verifyContextStorageRepository;
        this.logger = logger;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.selfAppMetaData = appMetaData;
        this.sessionStorageRepository = sessionStorageRepository;
        this.insertTelemetryEventUseCase = insertTelemetryEventUseCase;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        this.linkModeJsonRpcInteractor = linkModeJsonRpcInteractorInterface;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase$approveSessionAuthenticate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<Cacao> $cacaos;
        public final /* synthetic */ long $id;
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(long j, Function1<? super Throwable, Unit> function1, List<Cacao> list, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$id = j;
            this.$onFailure = function1;
            this.$cacaos = list;
            this.$onSuccess = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ApproveSessionAuthenticateUseCase.this.new AnonymousClass2(this.$id, this.$onFailure, this.$cacaos, this.$onSuccess, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:159:0x0651 A[Catch: Exception -> 0x06af, TRY_LEAVE, TryCatch #0 {Exception -> 0x06af, blocks: (B:155:0x063e, B:159:0x0651), top: B:186:0x058e }] */
        /* JADX WARN: Removed duplicated region for block: B:174:0x06d9  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0733  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object obj2;
            List list;
            List list2;
            final List arrayList;
            final List list3;
            Request<SignParams.SessionAuthenticateParams> requestInvoke$sign_release;
            Object next;
            CoroutineScope coroutineScope;
            Topic topic;
            final Topic topic2;
            String str;
            AppMetaData appMetaData;
            TransportType transportType;
            String universal;
            TransportType transportType2;
            String appLink;
            Request<SignParams.SessionAuthenticateParams> request;
            ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase;
            List list4;
            Object objCopydefault = C56442yFn.copydefault();
            try {
            } catch (Exception e) {
                e = e;
                obj2 = objCopydefault;
            }
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    arrayList = new ArrayList();
                    arrayList.add(Trace.SessionAuthenticate.SESSION_AUTHENTICATE_APPROVE_STARTED);
                    ApproveSessionAuthenticateUseCase.this.logger.log(Trace.SessionAuthenticate.SESSION_AUTHENTICATE_APPROVE_STARTED);
                    try {
                        requestInvoke$sign_release = ApproveSessionAuthenticateUseCase.this.getPendingSessionAuthenticateRequest.invoke$sign_release(this.$id);
                    } catch (Exception e2) {
                        e = e2;
                        obj2 = objCopydefault;
                    }
                    if (requestInvoke$sign_release == null) {
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase = ApproveSessionAuthenticateUseCase.this.insertTelemetryEventUseCase;
                        Props props = new Props(null, EventType.Error.MISSING_SESSION_AUTH_REQUEST, new Properties(null, null, null, null, null, null, arrayList, null, null, null, null, null, 4031, null), 1, null);
                        this.L$0 = arrayList;
                        this.label = 1;
                        if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        Unit unit = Unit.INSTANCE;
                        ApproveSessionAuthenticateUseCase.this.logger.error(new MissingSessionAuthenticateRequest().getMessage());
                        this.$onFailure.invoke(new MissingSessionAuthenticateRequest());
                        return unit;
                    }
                    Expiry expiry = requestInvoke$sign_release.getExpiry();
                    if (expiry != null) {
                        ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase2 = ApproveSessionAuthenticateUseCase.this;
                        if (CoreValidator.INSTANCE.isExpired(expiry)) {
                            InsertTelemetryEventUseCase insertTelemetryEventUseCase2 = approveSessionAuthenticateUseCase2.insertTelemetryEventUseCase;
                            Props props2 = new Props(null, EventType.Error.SESSION_AUTH_REQUEST_EXPIRED, new Properties(null, null, null, null, null, null, arrayList, null, null, null, null, null, 4031, null), 1, null);
                            this.L$0 = arrayList;
                            this.L$1 = requestInvoke$sign_release;
                            this.L$2 = approveSessionAuthenticateUseCase2;
                            this.label = 2;
                            if (insertTelemetryEventUseCase2.invoke(props2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            request = requestInvoke$sign_release;
                            approveSessionAuthenticateUseCase = approveSessionAuthenticateUseCase2;
                            list4 = arrayList;
                            Unit unit2 = Unit.INSTANCE;
                            approveSessionAuthenticateUseCase.logger.error("Session Authenticate Request Expired: " + request.getTopic() + ", id: " + request.getId());
                            throw new RequestExpiredException("This request has expired, id: " + request.getId());
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    arrayList.add(Trace.SessionAuthenticate.AUTHENTICATED_SESSION_NOT_EXPIRED);
                    SignParams.SessionAuthenticateParams params = requestInvoke$sign_release.getParams();
                    List<String> chains = UtilsKt.getChains(((Cacao) CollectionsKt___CollectionsKt.AuCTelauCTel(this.$cacaos)).getPayload().getResources());
                    if (chains.isEmpty()) {
                        chains = params.getAuthPayload().getChains();
                    }
                    if (!(chains instanceof Collection) || !chains.isEmpty()) {
                        Iterator<T> it = chains.iterator();
                        while (it.hasNext()) {
                            if (!CoreValidator.INSTANCE.isChainIdCAIP2Compliant((String) it.next())) {
                                InsertTelemetryEventUseCase insertTelemetryEventUseCase3 = ApproveSessionAuthenticateUseCase.this.insertTelemetryEventUseCase;
                                Props props3 = new Props(null, EventType.Error.CHAINS_CAIP2_COMPLIANT_FAILURE, new Properties(null, null, null, null, null, null, arrayList, null, null, null, null, null, 4031, null), 1, null);
                                this.L$0 = arrayList;
                                this.label = 3;
                                if (insertTelemetryEventUseCase3.invoke(props3, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                throw new Exception("Chains are not CAIP-2 compliant");
                            }
                        }
                    }
                    arrayList.add(Trace.SessionAuthenticate.CHAINS_CAIP2_COMPLIANT);
                    if (!(chains instanceof Collection) || !chains.isEmpty()) {
                        Iterator<T> it2 = chains.iterator();
                        while (it2.hasNext()) {
                            if (!Intrinsics.EZpvd((Object) SignValidator.INSTANCE.getNamespaceKeyFromChainId$sign_release((String) it2.next()), (Object) GetNamespacesFromReCaps.EIP155)) {
                                InsertTelemetryEventUseCase insertTelemetryEventUseCase4 = ApproveSessionAuthenticateUseCase.this.insertTelemetryEventUseCase;
                                Props props4 = new Props(null, EventType.Error.CHAINS_EVM_COMPLIANT_FAILURE, new Properties(null, null, null, null, null, null, arrayList, null, null, null, null, null, 4031, null), 1, null);
                                this.L$0 = arrayList;
                                this.label = 4;
                                if (insertTelemetryEventUseCase4.invoke(props4, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                throw new Exception("Only eip155 (EVM) is supported");
                            }
                        }
                    }
                    arrayList.add(Trace.SessionAuthenticate.CHAINS_EVM_COMPLIANT);
                    String strM7317constructorimpl = PublicKey.m7317constructorimpl(params.getRequester().getPublicKey());
                    AppMetaData metadata = params.getRequester().getMetadata();
                    String strMo7181generateAndStoreX25519KeyPairuN_RPug = ApproveSessionAuthenticateUseCase.this.crypto.mo7181generateAndStoreX25519KeyPairuN_RPug();
                    String strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I = ApproveSessionAuthenticateUseCase.this.crypto.mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(strMo7181generateAndStoreX25519KeyPairuN_RPug, strM7317constructorimpl);
                    Topic topicFromKey = ApproveSessionAuthenticateUseCase.this.crypto.getTopicFromKey(PublicKey.m7316boximpl(strM7317constructorimpl));
                    Topic topicFromKey2 = ApproveSessionAuthenticateUseCase.this.crypto.getTopicFromKey(SymmetricKey.m7238boximpl(strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I));
                    arrayList.add(Trace.SessionAuthenticate.CREATE_AUTHENTICATED_SESSION_TOPIC);
                    IrnParams irnParams = new IrnParams(Tags.SESSION_AUTHENTICATE_RESPONSE_APPROVE, new Ttl(Time.getDayInSeconds()), false, 4, null);
                    List<Cacao> list5 = this.$cacaos;
                    ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase3 = ApproveSessionAuthenticateUseCase.this;
                    Iterator<T> it3 = list5.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (!approveSessionAuthenticateUseCase3.cacaoVerifier.verify((Cacao) next)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    if (next != null) {
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase5 = ApproveSessionAuthenticateUseCase.this.insertTelemetryEventUseCase;
                        Props props5 = new Props(null, EventType.Error.INVALID_CACAO, new Properties(null, null, null, null, null, null, arrayList, topicFromKey2.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                        this.L$0 = arrayList;
                        this.label = 5;
                        if (insertTelemetryEventUseCase5.invoke(props5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        Unit unit4 = Unit.INSTANCE;
                        ApproveSessionAuthenticateUseCase.this.logger.error("Invalid Cacao for Session Authenticate");
                        this.$onFailure.invoke(new Throwable("Signature verification failed Session Authenticate, please try again"));
                        return unit4;
                    }
                    arrayList.add(Trace.SessionAuthenticate.CACAOS_VERIFIED);
                    List<Cacao> list6 = this.$cacaos;
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list6, 10));
                    Iterator<T> it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(new Issuer(((Cacao) it4.next()).getPayload().getIss()).getAddress());
                    }
                    List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it5 = chains.iterator();
                    while (it5.hasNext()) {
                        String str2 = (String) it5.next();
                        Iterator it6 = listQbewEr.iterator();
                        while (it6.hasNext()) {
                            List list7 = listQbewEr;
                            arrayList3.add(str2 + ":" + ((String) it6.next()));
                            it5 = it5;
                            listQbewEr = list7;
                            str2 = str2;
                        }
                    }
                    String namespace = new Issuer(((Cacao) CollectionsKt___CollectionsKt.AuCTelauCTel(this.$cacaos)).getPayload().getIss()).getNamespace();
                    List<String> methods = ((Cacao) CollectionsKt___CollectionsKt.AuCTelauCTel(this.$cacaos)).getPayload().getMethods();
                    List listGEmmrt = yDY.gEmmrt("chainChanged", "accountsChanged");
                    if (!methods.isEmpty()) {
                        ApproveSessionAuthenticateUseCase.this.logger.log("Creating authenticated session");
                        Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(namespace, new Namespace.Proposal(methods, chains, listGEmmrt)));
                        Map mapEZpvd2 = C56423yEv.EZpvd(C56390yDp.OLrzqt(namespace, new Namespace.Session(chains, arrayList3, methods, listGEmmrt)));
                        if (Intrinsics.EZpvd(params.getLinkMode(), C56443yFo.KWHzl(true)) && (appLink = params.getAppLink()) != null && appLink.length() != 0) {
                            transportType2 = TransportType.LINK_MODE;
                        } else {
                            transportType2 = TransportType.RELAY;
                        }
                        topic = topicFromKey2;
                        topic2 = topicFromKey;
                        str = strMo7181generateAndStoreX25519KeyPairuN_RPug;
                        coroutineScope = coroutineScope2;
                        appMetaData = metadata;
                        SessionVO sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release = SessionVO.Companion.m7341createAuthenticatedSessiontF0nsiE$sign_release(topicFromKey2, strM7317constructorimpl, metadata, strMo7181generateAndStoreX25519KeyPairuN_RPug, ApproveSessionAuthenticateUseCase.this.selfAppMetaData, str, mapEZpvd, mapEZpvd2, requestInvoke$sign_release.getTopic().getValue(), transportType2);
                        ApproveSessionAuthenticateUseCase.this.metadataStorageRepository.insertOrAbortMetadata(topic, ApproveSessionAuthenticateUseCase.this.selfAppMetaData, AppMetaDataType.SELF);
                        ApproveSessionAuthenticateUseCase.this.metadataStorageRepository.insertOrAbortMetadata(topic, appMetaData, AppMetaDataType.PEER);
                        ApproveSessionAuthenticateUseCase.this.sessionStorageRepository.insertSession(sessionVOM7341createAuthenticatedSessiontF0nsiE$sign_release, this.$id);
                        arrayList.add(Trace.SessionAuthenticate.STORE_AUTHENTICATED_SESSION);
                    } else {
                        coroutineScope = coroutineScope2;
                        topic = topicFromKey2;
                        topic2 = topicFromKey;
                        str = strMo7181generateAndStoreX25519KeyPairuN_RPug;
                        appMetaData = metadata;
                    }
                    JsonRpcResponse.JsonRpcResult jsonRpcResult = new JsonRpcResponse.JsonRpcResult(this.$id, null, new CoreSignParams.SessionAuthenticateApproveParams(new Participant(str, ApproveSessionAuthenticateUseCase.this.selfAppMetaData), this.$cacaos), 2, null);
                    ApproveSessionAuthenticateUseCase.this.crypto.setKey(SymmetricKey.m7238boximpl(strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I), topic.getValue());
                    arrayList.add(Trace.SessionAuthenticate.SUBSCRIBING_AUTHENTICATED_SESSION_TOPIC);
                    ApproveSessionAuthenticateUseCase.this.logger.log("Subscribing Session Authenticate on topic: " + topic2);
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = ApproveSessionAuthenticateUseCase.this.jsonRpcInteractor;
                    final ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase4 = ApproveSessionAuthenticateUseCase.this;
                    Function1<Topic, Unit> function1 = new Function1<Topic, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase.approveSessionAuthenticate.2.10
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Topic topic3) {
                            invoke2(topic3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Topic topic3) {
                            Intrinsics.checkNotNullParameter(topic3, "");
                            arrayList.add(Trace.SessionAuthenticate.SUBSCRIBE_AUTHENTICATED_SESSION_TOPIC_SUCCESS);
                            ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase5 = approveSessionAuthenticateUseCase4;
                            Topic topic4 = topic2;
                            approveSessionAuthenticateUseCase5.logger.log("Subscribed Session Authenticate on topic: " + topic4);
                        }
                    };
                    final Function1<Throwable, Unit> function12 = this.$onFailure;
                    final ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase5 = ApproveSessionAuthenticateUseCase.this;
                    String str3 = str;
                    final Topic topic3 = topic2;
                    final Topic topic4 = topic;
                    try {
                        relayJsonRpcInteractorInterface.subscribe(topic4, function1, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase.approveSessionAuthenticate.2.11
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
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase$approveSessionAuthenticate$2$11$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ Topic $sessionTopic;
                                public final /* synthetic */ List<String> $trace;
                                public int label;
                                public final /* synthetic */ ApproveSessionAuthenticateUseCase this$0;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = approveSessionAuthenticateUseCase;
                                    this.$trace = list;
                                    this.$sessionTopic = topic;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$trace, this.$sessionTopic, continuation);
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase$approveSessionAuthenticate$2$11$1$1, reason: invalid class name and collision with other inner class name */
                                public static final class C07671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ Topic $sessionTopic;
                                    public final /* synthetic */ List<String> $trace;
                                    public int label;
                                    public final /* synthetic */ ApproveSessionAuthenticateUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C07671(ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase, List<String> list, Topic topic, Continuation<? super C07671> continuation) {
                                        super(2, continuation);
                                        this.this$0 = approveSessionAuthenticateUseCase;
                                        this.$trace = list;
                                        this.$sessionTopic = topic;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                        return new C07671(this.this$0, this.$trace, this.$sessionTopic, continuation);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C07671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object objCopydefault = C56442yFn.copydefault();
                                        int i = this.label;
                                        if (i == 0) {
                                            C56391yDq.AEQbTJ(obj);
                                            InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertTelemetryEventUseCase;
                                            Props props = new Props(null, EventType.Error.SUBSCRIBE_AUTH_SESSION_TOPIC_FAILURE, new Properties(null, null, null, null, null, null, this.$trace, this.$sessionTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                                            this.label = 1;
                                            if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
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
                                        C07671 c07671 = new C07671(this.this$0, this.$trace, this.$sessionTopic, null);
                                        this.label = 1;
                                        if (SupervisorKt.supervisorScope(c07671, this) == objCopydefault) {
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
                                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(approveSessionAuthenticateUseCase5, arrayList, topic4, null), 3, null);
                                ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase6 = approveSessionAuthenticateUseCase5;
                                Topic topic5 = topic3;
                                approveSessionAuthenticateUseCase6.logger.log("Subscribing Session Authenticate error on topic: " + topic5 + ", " + th);
                                function12.invoke(th);
                            }
                        });
                        transportType = requestInvoke$sign_release.getTransportType();
                        obj2 = TransportType.LINK_MODE;
                        try {
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        list3 = arrayList;
                        obj2 = objCopydefault;
                    }
                    if (transportType == obj2) {
                        try {
                            Redirect redirect = appMetaData.getRedirect();
                            if (redirect != null && redirect.getLinkMode()) {
                                Redirect redirect2 = appMetaData.getRedirect();
                                if (redirect2 != null) {
                                    universal = redirect2.getUniversal();
                                    break;
                                } else {
                                    universal = null;
                                }
                                if (universal != null) {
                                    if (universal.length() != 0) {
                                        try {
                                            LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface = ApproveSessionAuthenticateUseCase.this.linkModeJsonRpcInteractor;
                                            Redirect redirect3 = appMetaData.getRedirect();
                                            Intrinsics.copydefault(redirect3);
                                            String universal2 = redirect3.getUniversal();
                                            Intrinsics.copydefault((Object) universal2);
                                            linkModeJsonRpcInteractorInterface.triggerResponse(topic3, jsonRpcResult, universal2, new Participants(str3, strM7317constructorimpl, null), EnvelopeType.ONE);
                                            InsertEventUseCase insertEventUseCase = ApproveSessionAuthenticateUseCase.this.insertEventUseCase;
                                            Props props6 = new Props("SUCCESS", String.valueOf(Tags.SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_APPROVE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(this.$id), ApproveSessionAuthenticateUseCase.this.clientId, Direction.SENT.getState(), null, 2303, null));
                                            this.L$0 = arrayList;
                                            this.label = 6;
                                            if (insertEventUseCase.invoke(props6, this) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            obj2 = objCopydefault;
                                            try {
                                                this.$onFailure.invoke(e);
                                            } catch (Exception e6) {
                                                e = e6;
                                                list = arrayList;
                                                ApproveSessionAuthenticateUseCase.this.logger.error("Error Responding Session Authenticate, error: " + e);
                                                if (e instanceof NoRelayConnectionException) {
                                                }
                                                list2 = list;
                                                if (e instanceof NoInternetConnectionException) {
                                                }
                                                this.$onFailure.invoke(e);
                                            }
                                        }
                                    }
                                    break;
                                }
                                this.$onFailure.invoke(new IllegalStateException("App link is missing"));
                                return Unit.INSTANCE;
                            }
                            obj2 = objCopydefault;
                            arrayList.add(Trace.SessionAuthenticate.PUBLISHING_AUTHENTICATED_SESSION_APPROVE);
                            ApproveSessionAuthenticateUseCase.this.logger.log("Sending Session Authenticate Approve on topic: " + topic3);
                            RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface2 = ApproveSessionAuthenticateUseCase.this.jsonRpcInteractor;
                            EnvelopeType envelopeType = EnvelopeType.ONE;
                            Participants participants = new Participants(str3, strM7317constructorimpl, null);
                            final Function0<Unit> function0 = this.$onSuccess;
                            final ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase6 = ApproveSessionAuthenticateUseCase.this;
                            final long j = this.$id;
                            Function0<Unit> function02 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase.approveSessionAuthenticate.2.13
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
                                    arrayList.add(Trace.SessionAuthenticate.AUTHENTICATED_SESSION_APPROVE_PUBLISH_SUCCESS);
                                    ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase7 = approveSessionAuthenticateUseCase6;
                                    Topic topic5 = topic3;
                                    approveSessionAuthenticateUseCase7.logger.log("Session Authenticate Approve Responded on topic: " + topic5);
                                    function0.invoke();
                                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C07682(approveSessionAuthenticateUseCase6, j, null), 3, null);
                                }

                                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase$approveSessionAuthenticate$2$13$2, reason: invalid class name and collision with other inner class name */
                                public static final class C07682 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ long $id;
                                    public int label;
                                    public final /* synthetic */ ApproveSessionAuthenticateUseCase this$0;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C07682(ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase, long j, Continuation<? super C07682> continuation) {
                                        super(2, continuation);
                                        this.this$0 = approveSessionAuthenticateUseCase;
                                        this.$id = j;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                        return new C07682(this.this$0, this.$id, continuation);
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C07682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase$approveSessionAuthenticate$2$13$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ long $id;
                                        public int label;
                                        public final /* synthetic */ ApproveSessionAuthenticateUseCase this$0;

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase, long j, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.this$0 = approveSessionAuthenticateUseCase;
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
                                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, null);
                                            this.label = 1;
                                            if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
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
                            };
                            final ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase7 = ApproveSessionAuthenticateUseCase.this;
                            final Function1<Throwable, Unit> function13 = this.$onFailure;
                            list3 = arrayList;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            try {
                                relayJsonRpcInteractorInterface2.publishJsonRpcResponse(topic3, irnParams, jsonRpcResult, function02, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase.approveSessionAuthenticate.2.14
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
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull Throwable th) {
                                        Object objM7377constructorimpl;
                                        Intrinsics.checkNotNullParameter(th, "");
                                        ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase8 = approveSessionAuthenticateUseCase7;
                                        Topic topic5 = topic4;
                                        try {
                                            Result.Application application = Result.Companion;
                                            approveSessionAuthenticateUseCase8.crypto.removeKeys(topic5.getValue());
                                            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                                        } catch (Throwable th2) {
                                            Result.Application application2 = Result.Companion;
                                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                                        }
                                        ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase9 = approveSessionAuthenticateUseCase7;
                                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                        if (thM7380exceptionOrNullimpl != null) {
                                            approveSessionAuthenticateUseCase9.logger.error(thM7380exceptionOrNullimpl);
                                        }
                                        approveSessionAuthenticateUseCase7.sessionStorageRepository.deleteSession(topic4);
                                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass3(approveSessionAuthenticateUseCase7, list3, topic3, null), 3, null);
                                        ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase10 = approveSessionAuthenticateUseCase7;
                                        Topic topic6 = topic3;
                                        approveSessionAuthenticateUseCase10.logger.error("Error Responding Session Authenticate on topic: " + topic6 + ", error: " + th);
                                        function13.invoke(th);
                                    }

                                    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase$approveSessionAuthenticate$2$14$3, reason: invalid class name */
                                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ Topic $responseTopic;
                                        public final /* synthetic */ List<String> $trace;
                                        public int label;
                                        public final /* synthetic */ ApproveSessionAuthenticateUseCase this$0;

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass3(ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase, List<String> list, Topic topic, Continuation<? super AnonymousClass3> continuation) {
                                            super(2, continuation);
                                            this.this$0 = approveSessionAuthenticateUseCase;
                                            this.$trace = list;
                                            this.$responseTopic = topic;
                                        }

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                            return new AnonymousClass3(this.this$0, this.$trace, this.$responseTopic, continuation);
                                        }

                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCase$approveSessionAuthenticate$2$14$3$1, reason: invalid class name */
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ Topic $responseTopic;
                                            public final /* synthetic */ List<String> $trace;
                                            public int label;
                                            public final /* synthetic */ ApproveSessionAuthenticateUseCase this$0;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(ApproveSessionAuthenticateUseCase approveSessionAuthenticateUseCase, List<String> list, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.this$0 = approveSessionAuthenticateUseCase;
                                                this.$trace = list;
                                                this.$responseTopic = topic;
                                            }

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.this$0, this.$trace, this.$responseTopic, continuation);
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
                                                    InsertTelemetryEventUseCase insertTelemetryEventUseCase = this.this$0.insertTelemetryEventUseCase;
                                                    Props props = new Props(null, EventType.Error.AUTHENTICATED_SESSION_APPROVE_PUBLISH_FAILURE, new Properties(null, null, null, null, null, null, this.$trace, this.$responseTopic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                                                    this.label = 1;
                                                    if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
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
                                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$trace, this.$responseTopic, null);
                                                this.label = 1;
                                                if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
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
                                }, participants, envelopeType);
                            } catch (Exception e7) {
                                e = e7;
                                list = list3;
                                ApproveSessionAuthenticateUseCase.this.logger.error("Error Responding Session Authenticate, error: " + e);
                                if (e instanceof NoRelayConnectionException) {
                                }
                                list2 = list;
                                if (e instanceof NoInternetConnectionException) {
                                }
                                this.$onFailure.invoke(e);
                            }
                            break;
                        } catch (Exception e8) {
                            e = e8;
                            obj2 = objCopydefault;
                            list3 = arrayList;
                            list = list3;
                            ApproveSessionAuthenticateUseCase.this.logger.error("Error Responding Session Authenticate, error: " + e);
                            if (e instanceof NoRelayConnectionException) {
                            }
                            list2 = list;
                            if (e instanceof NoInternetConnectionException) {
                            }
                            this.$onFailure.invoke(e);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    ApproveSessionAuthenticateUseCase.this.logger.error("Error Responding Session Authenticate, error: " + e);
                    if (e instanceof NoRelayConnectionException) {
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase6 = ApproveSessionAuthenticateUseCase.this.insertTelemetryEventUseCase;
                        Props props7 = new Props(null, EventType.Error.NO_WSS_CONNECTION, new Properties(null, null, null, null, null, null, list, null, null, null, null, null, 4031, null), 1, null);
                        this.L$0 = list;
                        this.L$1 = e;
                        this.L$2 = null;
                        this.label = 7;
                        if (insertTelemetryEventUseCase6.invoke(props7, this) == obj2) {
                            return obj2;
                        }
                    }
                    list2 = list;
                    if (e instanceof NoInternetConnectionException) {
                        InsertTelemetryEventUseCase insertTelemetryEventUseCase7 = ApproveSessionAuthenticateUseCase.this.insertTelemetryEventUseCase;
                        Props props8 = new Props(null, EventType.Error.NO_INTERNET_CONNECTION, new Properties(null, null, null, null, null, null, list2, null, null, null, null, null, 4031, null), 1, null);
                        this.L$0 = e;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 8;
                        if (insertTelemetryEventUseCase7.invoke(props8, this) == obj2) {
                            return obj2;
                        }
                    }
                    this.$onFailure.invoke(e);
                    return Unit.INSTANCE;
                case 1:
                    C56391yDq.AEQbTJ(obj);
                    Unit unit5 = Unit.INSTANCE;
                    ApproveSessionAuthenticateUseCase.this.logger.error(new MissingSessionAuthenticateRequest().getMessage());
                    this.$onFailure.invoke(new MissingSessionAuthenticateRequest());
                    return unit5;
                case 2:
                    approveSessionAuthenticateUseCase = (ApproveSessionAuthenticateUseCase) this.L$2;
                    request = (Request) this.L$1;
                    list4 = (List) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        Unit unit22 = Unit.INSTANCE;
                        approveSessionAuthenticateUseCase.logger.error("Session Authenticate Request Expired: " + request.getTopic() + ", id: " + request.getId());
                        throw new RequestExpiredException("This request has expired, id: " + request.getId());
                    } catch (Exception e9) {
                        e = e9;
                        obj2 = objCopydefault;
                        list = list4;
                    }
                    break;
                case 3:
                    C56391yDq.AEQbTJ(obj);
                    throw new Exception("Chains are not CAIP-2 compliant");
                case 4:
                    C56391yDq.AEQbTJ(obj);
                    throw new Exception("Only eip155 (EVM) is supported");
                case 5:
                    C56391yDq.AEQbTJ(obj);
                    Unit unit42 = Unit.INSTANCE;
                    ApproveSessionAuthenticateUseCase.this.logger.error("Invalid Cacao for Session Authenticate");
                    this.$onFailure.invoke(new Throwable("Signature verification failed Session Authenticate, please try again"));
                    return unit42;
                case 6:
                    arrayList = (List) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        break;
                    } catch (Exception e10) {
                        e = e10;
                        obj2 = objCopydefault;
                        this.$onFailure.invoke(e);
                        break;
                    }
                    return Unit.INSTANCE;
                case 7:
                    e = (Exception) this.L$1;
                    List list8 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj2 = objCopydefault;
                    list2 = list8;
                    if (e instanceof NoInternetConnectionException) {
                    }
                    this.$onFailure.invoke(e);
                    return Unit.INSTANCE;
                case 8:
                    e = (Exception) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.$onFailure.invoke(e);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCaseInterface
    public Object approveSessionAuthenticate(long j, @NotNull List<Cacao> list, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(j, function1, list, function0, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
