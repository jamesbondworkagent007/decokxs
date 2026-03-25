package com.reown.sign.engine.use_case.calls;

import android.util.Base64;
import com.reown.android.Core;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.exception.InvalidExpiryException;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.UtilsKt;
import com.reown.android.internal.utils.ContextKt;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.android.pairing.model.mapper.PairingMapperKt;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.model.Direction;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.common.Requester;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.authenticate.AuthenticateResponseTopicRepository;
import com.reown.sign.storage.link_mode.LinkModeStorageRepository;
import com.reown.utils.UtilFunctionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56529yIt;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionAuthenticateUseCase implements SessionAuthenticateUseCaseInterface {
    public final AuthenticateResponseTopicRepository authenticateResponseTopicRepository;
    public final String clientId;
    public final KeyManagementRepository crypto;
    public final GetNamespacesFromReCaps getNamespacesFromReCaps;
    public final GetPairingForSessionAuthenticateUseCase getPairingForSessionAuthenticate;
    public final InsertEventUseCase insertEventUseCase;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractor;
    public final LinkModeStorageRepository linkModeStorageRepository;
    public final Logger logger;
    public final ProposeSessionUseCaseInterface proposeSessionUseCase;
    public final AppMetaData selfAppMetaData;

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$authenticate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionAuthenticateUseCase.this.authenticate(null, null, null, null, null, null, null, this);
        }
    }

    public SessionAuthenticateUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull KeyManagementRepository keyManagementRepository, @NotNull AppMetaData appMetaData, @NotNull AuthenticateResponseTopicRepository authenticateResponseTopicRepository, @NotNull ProposeSessionUseCaseInterface proposeSessionUseCaseInterface, @NotNull GetPairingForSessionAuthenticateUseCase getPairingForSessionAuthenticateUseCase, @NotNull GetNamespacesFromReCaps getNamespacesFromReCaps, @NotNull LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface, @NotNull LinkModeStorageRepository linkModeStorageRepository, @NotNull InsertEventUseCase insertEventUseCase, @NotNull String str, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(authenticateResponseTopicRepository, "");
        Intrinsics.checkNotNullParameter(proposeSessionUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(getPairingForSessionAuthenticateUseCase, "");
        Intrinsics.checkNotNullParameter(getNamespacesFromReCaps, "");
        Intrinsics.checkNotNullParameter(linkModeJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(linkModeStorageRepository, "");
        Intrinsics.checkNotNullParameter(insertEventUseCase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.crypto = keyManagementRepository;
        this.selfAppMetaData = appMetaData;
        this.authenticateResponseTopicRepository = authenticateResponseTopicRepository;
        this.proposeSessionUseCase = proposeSessionUseCaseInterface;
        this.getPairingForSessionAuthenticate = getPairingForSessionAuthenticateUseCase;
        this.getNamespacesFromReCaps = getNamespacesFromReCaps;
        this.linkModeJsonRpcInteractor = linkModeJsonRpcInteractorInterface;
        this.linkModeStorageRepository = linkModeStorageRepository;
        this.insertEventUseCase = insertEventUseCase;
        this.clientId = str;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCaseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object authenticate(@NotNull EngineDO.Authenticate authenticate, List<String> list, String str, Expiry expiry, String str2, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) throws Exception {
        AnonymousClass1 anonymousClass1;
        String str3;
        String strReplace$default;
        final Topic topicFromKey;
        SignRpc.SessionAuthenticate sessionAuthenticate;
        Object objIsLinkModeEnabled;
        SessionAuthenticateUseCase sessionAuthenticateUseCase;
        String str4;
        Expiry expiry2;
        Map map;
        Function1<? super String, Unit> function13;
        String str5;
        List<String> listCopydefault;
        InsertEventUseCase insertEventUseCase;
        Props props;
        Function1<? super Throwable, Unit> function14;
        SessionAuthenticateUseCase sessionAuthenticateUseCase2;
        Expiry expiry3 = expiry;
        final Function1<? super Throwable, Unit> function15 = function12;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (authenticate.getChains().isEmpty()) {
                this.logger.error("Sending session authenticate request error: chains are empty");
                function15.invoke(new IllegalArgumentException("Chains are empty"));
                return Unit.INSTANCE;
            }
            if (!CoreValidator.INSTANCE.isExpiryWithinBounds(expiry3)) {
                this.logger.error("Sending session authenticate request error: expiry not within bounds");
                function15.invoke(new InvalidExpiryException(null, 1, null));
                return Unit.INSTANCE;
            }
            if (expiry3 == null) {
                expiry3 = new Expiry(Time.getCurrentTimeInSeconds() + Time.getOneHourInSeconds());
            }
            Map mapOfEngineNamespacesOptional = EngineMapperKt.toMapOfEngineNamespacesOptional(this.getNamespacesFromReCaps.invoke(authenticate.getChains(), (list == null || list.isEmpty()) ? C56402yEa.EZpvd("personal_sign") : list));
            String externalReCapsJson = getExternalReCapsJson(authenticate);
            String signReCapsJson = getSignReCapsJson(list, authenticate);
            if (externalReCapsJson.length() <= 0 || signReCapsJson.length() <= 0) {
                if (signReCapsJson.length() > 0) {
                    str3 = signReCapsJson;
                }
                strReplace$default = C59449zhJ.replace$default(str3, "\\\\/", "/", false, 4, (Object) null);
                if (strReplace$default.length() > 0) {
                    byte[] bytes = strReplace$default.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    String str6 = Cacao.Payload.RECAPS_PREFIX + Base64.encodeToString(bytes, 3);
                    if (authenticate.getResources() == null) {
                        listCopydefault = C56402yEa.EZpvd(str6);
                    } else {
                        List<String> resources = authenticate.getResources();
                        Intrinsics.copydefault(resources);
                        listCopydefault = CollectionsKt___CollectionsKt.copydefault((Collection<? extends String>) resources, str6);
                    }
                    authenticate.setResources(listCopydefault);
                }
                String strMo7181generateAndStoreX25519KeyPairuN_RPug = this.crypto.mo7181generateAndStoreX25519KeyPairuN_RPug();
                topicFromKey = this.crypto.getTopicFromKey(PublicKey.m7316boximpl(strMo7181generateAndStoreX25519KeyPairuN_RPug));
                sessionAuthenticate = new SignRpc.SessionAuthenticate(0L, null, null, new SignParams.SessionAuthenticateParams(new Requester(strMo7181generateAndStoreX25519KeyPairuN_RPug, this.selfAppMetaData), EngineMapperKt.toCommon(authenticate), expiry3.getSeconds()), 7, null);
                this.crypto.setKey(PublicKey.m7316boximpl(strMo7181generateAndStoreX25519KeyPairuN_RPug), ContextKt.getParticipantTag(topicFromKey));
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = str2;
                anonymousClass1.L$3 = function1;
                anonymousClass1.L$4 = function15;
                anonymousClass1.L$5 = expiry3;
                anonymousClass1.L$6 = mapOfEngineNamespacesOptional;
                anonymousClass1.L$7 = topicFromKey;
                anonymousClass1.L$8 = sessionAuthenticate;
                anonymousClass1.label = 1;
                objIsLinkModeEnabled = isLinkModeEnabled(str2, anonymousClass1);
                if (objIsLinkModeEnabled != objCopydefault) {
                    return objCopydefault;
                }
                sessionAuthenticateUseCase = this;
                str4 = str;
                expiry2 = expiry3;
                map = mapOfEngineNamespacesOptional;
                function13 = function1;
                obj = objIsLinkModeEnabled;
                str5 = str2;
            } else {
                externalReCapsJson = UtilsKt.mergeReCaps(new JSONObject(signReCapsJson), new JSONObject(externalReCapsJson));
            }
            str3 = externalReCapsJson;
            strReplace$default = C59449zhJ.replace$default(str3, "\\\\/", "/", false, 4, (Object) null);
            if (strReplace$default.length() > 0) {
            }
            String strMo7181generateAndStoreX25519KeyPairuN_RPug2 = this.crypto.mo7181generateAndStoreX25519KeyPairuN_RPug();
            topicFromKey = this.crypto.getTopicFromKey(PublicKey.m7316boximpl(strMo7181generateAndStoreX25519KeyPairuN_RPug2));
            sessionAuthenticate = new SignRpc.SessionAuthenticate(0L, null, null, new SignParams.SessionAuthenticateParams(new Requester(strMo7181generateAndStoreX25519KeyPairuN_RPug2, this.selfAppMetaData), EngineMapperKt.toCommon(authenticate), expiry3.getSeconds()), 7, null);
            this.crypto.setKey(PublicKey.m7316boximpl(strMo7181generateAndStoreX25519KeyPairuN_RPug2), ContextKt.getParticipantTag(topicFromKey));
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = str2;
            anonymousClass1.L$3 = function1;
            anonymousClass1.L$4 = function15;
            anonymousClass1.L$5 = expiry3;
            anonymousClass1.L$6 = mapOfEngineNamespacesOptional;
            anonymousClass1.L$7 = topicFromKey;
            anonymousClass1.L$8 = sessionAuthenticate;
            anonymousClass1.label = 1;
            objIsLinkModeEnabled = isLinkModeEnabled(str2, anonymousClass1);
            if (objIsLinkModeEnabled != objCopydefault) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function14 = (Function1) anonymousClass1.L$1;
                sessionAuthenticateUseCase2 = (SessionAuthenticateUseCase) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    sessionAuthenticateUseCase2.logger.log("Link Mode - Request triggered successfully");
                } catch (Error e) {
                    e = e;
                    function15 = function14;
                    function15.invoke(e);
                }
                return Unit.INSTANCE;
            }
            sessionAuthenticate = (SignRpc.SessionAuthenticate) anonymousClass1.L$8;
            Topic topic = (Topic) anonymousClass1.L$7;
            Map map2 = (Map) anonymousClass1.L$6;
            Expiry expiry4 = (Expiry) anonymousClass1.L$5;
            function15 = (Function1) anonymousClass1.L$4;
            Function1<? super String, Unit> function16 = (Function1) anonymousClass1.L$3;
            str5 = (String) anonymousClass1.L$2;
            str4 = (String) anonymousClass1.L$1;
            SessionAuthenticateUseCase sessionAuthenticateUseCase3 = (SessionAuthenticateUseCase) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(obj);
            map = map2;
            expiry2 = expiry4;
            function13 = function16;
            sessionAuthenticateUseCase = sessionAuthenticateUseCase3;
            topicFromKey = topic;
        }
        if (((Boolean) obj).booleanValue()) {
            try {
                LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface = sessionAuthenticateUseCase.linkModeJsonRpcInteractor;
                Intrinsics.copydefault((Object) str5);
                linkModeJsonRpcInteractorInterface.triggerRequest(sessionAuthenticate, new Topic(sessionAuthenticateUseCase.generateUUID()), str5, EnvelopeType.TWO);
                insertEventUseCase = sessionAuthenticateUseCase.insertEventUseCase;
                props = new Props("SUCCESS", String.valueOf(Tags.SESSION_AUTHENTICATE_LINK_MODE.getId()), new Properties(null, null, null, null, null, null, null, null, C56443yFo.KWHzl(sessionAuthenticate.getId()), sessionAuthenticateUseCase.clientId, Direction.SENT.getState(), null, 2303, null));
                anonymousClass1.L$0 = sessionAuthenticateUseCase;
                anonymousClass1.L$1 = function15;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.L$7 = null;
                anonymousClass1.L$8 = null;
                anonymousClass1.label = 2;
            } catch (Error e2) {
                e = e2;
                function15.invoke(e);
            }
            if (insertEventUseCase.invoke(props, anonymousClass1) == objCopydefault) {
                return objCopydefault;
            }
            function14 = function15;
            sessionAuthenticateUseCase2 = sessionAuthenticateUseCase;
            sessionAuthenticateUseCase2.logger.log("Link Mode - Request triggered successfully");
            return Unit.INSTANCE;
        }
        final Core.Model.Pairing pairingInvoke = sessionAuthenticateUseCase.getPairingForSessionAuthenticate.invoke(str4);
        sessionAuthenticateUseCase.logger.log("Session authenticate subscribing on topic: " + topicFromKey);
        sessionAuthenticateUseCase.jsonRpcInteractor.subscribe(topicFromKey, new Function1<Topic, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase.authenticate.2
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

            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$authenticate$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Core.Model.Pairing $pairing;
                public final /* synthetic */ Topic $responseTopic;
                public int label;
                public final /* synthetic */ SessionAuthenticateUseCase this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SessionAuthenticateUseCase sessionAuthenticateUseCase, Core.Model.Pairing pairing, Topic topic, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = sessionAuthenticateUseCase;
                    this.$pairing = pairing;
                    this.$responseTopic = topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$pairing, this.$responseTopic, continuation);
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
                        AuthenticateResponseTopicRepository authenticateResponseTopicRepository = this.this$0.authenticateResponseTopicRepository;
                        String topic = this.$pairing.getTopic();
                        String value = this.$responseTopic.getValue();
                        this.label = 1;
                        if (authenticateResponseTopicRepository.insertOrAbort(topic, value, this) == objCopydefault) {
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
            public final void invoke2(@NotNull Topic topic2) {
                Intrinsics.checkNotNullParameter(topic2, "");
                SessionAuthenticateUseCase.this.logger.log("Session authenticate subscribed on topic: " + topicFromKey);
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(SessionAuthenticateUseCase.this, pairingInvoke, topicFromKey, null), 3, null);
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase.authenticate.3
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
                SessionAuthenticateUseCase.this.logger.error("Session authenticate subscribing on topic error: " + topicFromKey + ", " + th);
                function15.invoke(th);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, sessionAuthenticateUseCase.new AnonymousClass4(pairingInvoke, sessionAuthenticate, topicFromKey, expiry2, map, function13, function15, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$authenticate$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignRpc.SessionAuthenticate $authRequest;
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function1<String, Unit> $onSuccess;
        public final /* synthetic */ Map<String, EngineDO.Namespace.Proposal> $optionalNamespaces;
        public final /* synthetic */ Core.Model.Pairing $pairing;
        public final /* synthetic */ Expiry $requestExpiry;
        public final /* synthetic */ Topic $responseTopic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Core.Model.Pairing pairing, SignRpc.SessionAuthenticate sessionAuthenticate, Topic topic, Expiry expiry, Map<String, EngineDO.Namespace.Proposal> map, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$pairing = pairing;
            this.$authRequest = sessionAuthenticate;
            this.$responseTopic = topic;
            this.$requestExpiry = expiry;
            this.$optionalNamespaces = map;
            this.$onSuccess = function1;
            this.$onFailure = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SessionAuthenticateUseCase.this.new AnonymousClass4(this.$pairing, this.$authRequest, this.$responseTopic, this.$requestExpiry, this.$optionalNamespaces, this.$onSuccess, this.$onFailure, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$authenticate$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ SignRpc.SessionAuthenticate $authRequest;
            public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
            public final /* synthetic */ Function1<String, Unit> $onSuccess;
            public final /* synthetic */ Map<String, EngineDO.Namespace.Proposal> $optionalNamespaces;
            public final /* synthetic */ Core.Model.Pairing $pairing;
            public final /* synthetic */ Expiry $requestExpiry;
            public final /* synthetic */ Topic $responseTopic;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ SessionAuthenticateUseCase this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(SessionAuthenticateUseCase sessionAuthenticateUseCase, Core.Model.Pairing pairing, SignRpc.SessionAuthenticate sessionAuthenticate, Topic topic, Expiry expiry, Map<String, EngineDO.Namespace.Proposal> map, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sessionAuthenticateUseCase;
                this.$pairing = pairing;
                this.$authRequest = sessionAuthenticate;
                this.$responseTopic = topic;
                this.$requestExpiry = expiry;
                this.$optionalNamespaces = map;
                this.$onSuccess = function1;
                this.$onFailure = function12;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pairing, this.$authRequest, this.$responseTopic, this.$requestExpiry, this.$optionalNamespaces, this.$onSuccess, this.$onFailure, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c3 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                CoroutineScope coroutineScope;
                Object objM7353publishSessionAuthenticateDeferredyxL6bBk;
                Object obj2;
                Object objM7386unboximpl;
                CoroutineScope coroutineScope2;
                Object objAwait;
                CoroutineScope coroutineScope3;
                Object obj3;
                Object objAwait2;
                Object obj4;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    SessionAuthenticateUseCase sessionAuthenticateUseCase = this.this$0;
                    Core.Model.Pairing pairing = this.$pairing;
                    SignRpc.SessionAuthenticate sessionAuthenticate = this.$authRequest;
                    Topic topic = this.$responseTopic;
                    Expiry expiry = this.$requestExpiry;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    objM7353publishSessionAuthenticateDeferredyxL6bBk = sessionAuthenticateUseCase.m7353publishSessionAuthenticateDeferredyxL6bBk(pairing, sessionAuthenticate, topic, expiry, this);
                    if (objM7353publishSessionAuthenticateDeferredyxL6bBk == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7353publishSessionAuthenticateDeferredyxL6bBk = ((Result) obj).m7386unboximpl();
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            obj3 = this.L$1;
                            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                            C56391yDq.AEQbTJ(obj);
                            coroutineScope3 = coroutineScope4;
                            Object objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new SessionAuthenticateUseCase$authenticate$4$1$sessionProposeResult$1(obj3, null), 3, null);
                            this.L$0 = objM7386unboximpl2;
                            this.L$1 = null;
                            this.label = 4;
                            objAwait2 = deferredAsync$default.await(this);
                            if (objAwait2 != objCopydefault) {
                                return objCopydefault;
                            }
                            obj4 = objM7386unboximpl2;
                            obj = objAwait2;
                            Object objM7386unboximpl3 = ((Result) obj).m7386unboximpl();
                            if (!Result.m7384isSuccessimpl(obj4)) {
                                if (!Result.m7383isFailureimpl(obj4)) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj4 = this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        Object objM7386unboximpl32 = ((Result) obj).m7386unboximpl();
                        if (!Result.m7384isSuccessimpl(obj4) && Result.m7384isSuccessimpl(objM7386unboximpl32)) {
                            this.$onSuccess.invoke(this.$pairing.getUri());
                        } else if (!Result.m7383isFailureimpl(obj4)) {
                            Function1<Throwable, Unit> function1 = this.$onFailure;
                            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj4);
                            if (thM7380exceptionOrNullimpl == null) {
                                thM7380exceptionOrNullimpl = new Throwable("Session authenticate failed");
                            }
                            function1.invoke(thM7380exceptionOrNullimpl);
                        } else if (Result.m7383isFailureimpl(objM7386unboximpl32)) {
                            Function1<Throwable, Unit> function12 = this.$onFailure;
                            Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl32);
                            if (thM7380exceptionOrNullimpl2 == null) {
                                thM7380exceptionOrNullimpl2 = new Throwable("Session proposal as a fallback failed");
                            }
                            function12.invoke(thM7380exceptionOrNullimpl2);
                        } else {
                            this.$onFailure.invoke(new Throwable("Session authenticate failed, please try again"));
                        }
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SessionAuthenticateUseCase$authenticate$4$1$sessionAuthenticateResult$1(obj2, null), 3, null);
                    this.L$0 = coroutineScope2;
                    this.L$1 = objM7386unboximpl;
                    this.label = 3;
                    objAwait = deferredAsync$default2.await(this);
                    if (objAwait != objCopydefault) {
                        return objCopydefault;
                    }
                    coroutineScope3 = coroutineScope2;
                    obj3 = objM7386unboximpl;
                    obj = objAwait;
                    Object objM7386unboximpl22 = ((Result) obj).m7386unboximpl();
                    Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new SessionAuthenticateUseCase$authenticate$4$1$sessionProposeResult$1(obj3, null), 3, null);
                    this.L$0 = objM7386unboximpl22;
                    this.L$1 = null;
                    this.label = 4;
                    objAwait2 = deferredAsync$default3.await(this);
                    if (objAwait2 != objCopydefault) {
                    }
                }
                SessionAuthenticateUseCase sessionAuthenticateUseCase2 = this.this$0;
                Core.Model.Pairing pairing2 = this.$pairing;
                Map<String, EngineDO.Namespace.Proposal> map = this.$optionalNamespaces;
                Topic topic2 = this.$responseTopic;
                this.L$0 = coroutineScope;
                this.L$1 = objM7353publishSessionAuthenticateDeferredyxL6bBk;
                this.label = 2;
                Object objM7354publishSessionProposeDeferredBWLJW6A = sessionAuthenticateUseCase2.m7354publishSessionProposeDeferredBWLJW6A(pairing2, map, topic2, this);
                if (objM7354publishSessionProposeDeferredBWLJW6A == objCopydefault) {
                    return objCopydefault;
                }
                CoroutineScope coroutineScope5 = coroutineScope;
                obj2 = objM7353publishSessionAuthenticateDeferredyxL6bBk;
                objM7386unboximpl = objM7354publishSessionProposeDeferredBWLJW6A;
                coroutineScope2 = coroutineScope5;
                Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SessionAuthenticateUseCase$authenticate$4$1$sessionAuthenticateResult$1(obj2, null), 3, null);
                this.L$0 = coroutineScope2;
                this.L$1 = objM7386unboximpl;
                this.label = 3;
                objAwait = deferredAsync$default22.await(this);
                if (objAwait != objCopydefault) {
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SessionAuthenticateUseCase.this, this.$pairing, this.$authRequest, this.$responseTopic, this.$requestExpiry, this.$optionalNamespaces, this.$onSuccess, this.$onFailure, null);
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

    public final Object isLinkModeEnabled(String str, Continuation<? super Boolean> continuation) {
        Redirect redirect;
        return (str == null || str.length() == 0 || (redirect = this.selfAppMetaData.getRedirect()) == null || !redirect.getLinkMode()) ? C56443yFo.KWHzl(false) : this.linkModeStorageRepository.isEnabled(str, continuation);
    }

    public final String getSignReCapsJson(List<String> list, EngineDO.Authenticate authenticate) throws JSONException {
        if (list != null && !list.isEmpty()) {
            String namespaceKeyFromChainId$sign_release = SignValidator.INSTANCE.getNamespaceKeyFromChainId$sign_release((String) CollectionsKt___CollectionsKt.AuCTelauCTel(authenticate.getChains()));
            JSONObject jSONObject = new JSONObject();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.put("request/" + ((String) it.next()), new JSONArray().put(0, new JSONObject()));
            }
            String string = new JSONObject().put(Cacao.Payload.ATT_KEY, new JSONObject().put(namespaceKeyFromChainId$sign_release, jSONObject)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return C59449zhJ.replace$default(string, "\\/", "/", false, 4, (Object) null);
        }
        return UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
    }

    public final String getExternalReCapsJson(EngineDO.Authenticate authenticate) {
        try {
            if (areExternalReCapsNotEmpty(authenticate)) {
                List<String> resources = authenticate.getResources();
                Intrinsics.copydefault(resources);
                ListIterator<String> listIterator = resources.listIterator(resources.size());
                while (listIterator.hasPrevious()) {
                    String strPrevious = listIterator.previous();
                    if (C59449zhJ.startsWith$default(strPrevious, Cacao.Payload.RECAPS_PREFIX, false, 2, null)) {
                        byte[] bArrDecode = Base64.decode(StringsKt__StringsKt.KWHzl(strPrevious, (CharSequence) Cacao.Payload.RECAPS_PREFIX), 2);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                        return new String(bArrDecode, Charsets.UTF_8);
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            }
            return UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        } catch (Exception unused) {
            return UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
    }

    public final boolean areExternalReCapsNotEmpty(EngineDO.Authenticate authenticate) {
        if (authenticate.getResources() == null) {
            return false;
        }
        List<String> resources = authenticate.getResources();
        Intrinsics.copydefault(resources);
        if ((resources instanceof Collection) && resources.isEmpty()) {
            return false;
        }
        Iterator<T> it = resources.iterator();
        while (it.hasNext()) {
            if (C59449zhJ.startsWith$default((String) it.next(), Cacao.Payload.RECAPS_PREFIX, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: publishSessionAuthenticateDeferred-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7353publishSessionAuthenticateDeferredyxL6bBk(final Core.Model.Pairing pairing, SignRpc.SessionAuthenticate sessionAuthenticate, final Topic topic, Expiry expiry, Continuation<? super Result<Unit>> continuation) throws Throwable {
        SessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1 sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1;
        if (continuation instanceof SessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1) {
            sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1 = (SessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1) continuation;
            int i = sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1.label = i - Integer.MIN_VALUE;
            } else {
                sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1 = new SessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1(this, continuation);
            }
        }
        Object objAwait = sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            this.logger.log("Sending session authenticate on topic: " + pairing.getTopic());
            IrnParams irnParams = new IrnParams(Tags.SESSION_AUTHENTICATE, getIrnParamsTtl(expiry, Time.getCurrentTimeInSeconds()), true);
            final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            RelayJsonRpcInteractorInterface.DefaultImpls.publishJsonRpcRequest$default(this.jsonRpcInteractor, new Topic(pairing.getTopic()), irnParams, sessionAuthenticate, null, null, new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$publishSessionAuthenticateDeferred$2
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
                    this.this$0.logger.log("Session authenticate sent successfully on topic: " + pairing.getTopic());
                    CompletableDeferred<Result<Unit>> completableDeferred = completableDeferredCompletableDeferred$default;
                    Result.Application application = Result.Companion;
                    completableDeferred.complete(Result.m7376boximpl(Result.m7377constructorimpl(Unit.INSTANCE)));
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$publishSessionAuthenticateDeferred$3
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

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.this$0.jsonRpcInteractor, topic, null, null, 6, null);
                    this.this$0.logger.error("Failed to send a auth request: " + th);
                    CompletableDeferred<Result<Unit>> completableDeferred = completableDeferredCompletableDeferred$default;
                    Result.Application application = Result.Companion;
                    completableDeferred.complete(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th))));
                }
            }, 24, null);
            sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1.label = 1;
            objAwait = completableDeferredCompletableDeferred$default.await(sessionAuthenticateUseCase$publishSessionAuthenticateDeferred$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAwait);
        }
        return ((Result) objAwait).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: publishSessionProposeDeferred-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7354publishSessionProposeDeferredBWLJW6A(final Core.Model.Pairing pairing, Map<String, EngineDO.Namespace.Proposal> map, final Topic topic, Continuation<? super Result<Unit>> continuation) throws Throwable {
        SessionAuthenticateUseCase$publishSessionProposeDeferred$1 sessionAuthenticateUseCase$publishSessionProposeDeferred$1;
        CompletableDeferred completableDeferred;
        if (continuation instanceof SessionAuthenticateUseCase$publishSessionProposeDeferred$1) {
            sessionAuthenticateUseCase$publishSessionProposeDeferred$1 = (SessionAuthenticateUseCase$publishSessionProposeDeferred$1) continuation;
            int i = sessionAuthenticateUseCase$publishSessionProposeDeferred$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionAuthenticateUseCase$publishSessionProposeDeferred$1.label = i - Integer.MIN_VALUE;
            } else {
                sessionAuthenticateUseCase$publishSessionProposeDeferred$1 = new SessionAuthenticateUseCase$publishSessionProposeDeferred$1(this, continuation);
            }
        }
        Object objAwait = sessionAuthenticateUseCase$publishSessionProposeDeferred$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = sessionAuthenticateUseCase$publishSessionProposeDeferred$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            this.logger.log("Sending session proposal as a fallback on topic: " + pairing.getTopic());
            final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            ProposeSessionUseCaseInterface proposeSessionUseCaseInterface = this.proposeSessionUseCase;
            Map<String, EngineDO.Namespace.Proposal> mapKWHzl = C56424yEw.KWHzl();
            Pairing pairing2 = PairingMapperKt.toPairing(pairing);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$publishSessionProposeDeferred$2
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
                    this.this$0.logger.log("Session proposal as a fallback sent successfully on topic: " + pairing.getTopic());
                    CompletableDeferred<Result<Unit>> completableDeferred2 = completableDeferredCompletableDeferred$default;
                    Result.Application application = Result.Companion;
                    completableDeferred2.complete(Result.m7376boximpl(Result.m7377constructorimpl(Unit.INSTANCE)));
                }
            };
            Function1<Throwable, Unit> function1 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCase$publishSessionProposeDeferred$3
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

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.this$0.jsonRpcInteractor, topic, null, null, 6, null);
                    this.this$0.logger.error("Failed to send a session proposal as a fallback: " + th);
                    CompletableDeferred<Result<Unit>> completableDeferred2 = completableDeferredCompletableDeferred$default;
                    Result.Application application = Result.Companion;
                    completableDeferred2.complete(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th))));
                }
            };
            sessionAuthenticateUseCase$publishSessionProposeDeferred$1.L$0 = completableDeferredCompletableDeferred$default;
            sessionAuthenticateUseCase$publishSessionProposeDeferred$1.label = 1;
            if (proposeSessionUseCaseInterface.proposeSession(mapKWHzl, map, null, pairing2, function0, function1, sessionAuthenticateUseCase$publishSessionProposeDeferred$1) == objCopydefault) {
                return objCopydefault;
            }
            completableDeferred = completableDeferredCompletableDeferred$default;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
                return ((Result) objAwait).m7386unboximpl();
            }
            completableDeferred = (CompletableDeferred) sessionAuthenticateUseCase$publishSessionProposeDeferred$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
        }
        sessionAuthenticateUseCase$publishSessionProposeDeferred$1.L$0 = null;
        sessionAuthenticateUseCase$publishSessionProposeDeferred$1.label = 2;
        objAwait = completableDeferred.await(sessionAuthenticateUseCase$publishSessionProposeDeferred$1);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        return ((Result) objAwait).m7386unboximpl();
    }

    public final Ttl getIrnParamsTtl(Expiry expiry, long j) {
        if (expiry != null) {
            long dayInSeconds = Time.getDayInSeconds();
            long seconds = expiry.getSeconds() - j;
            Long lValueOf = Long.valueOf(seconds);
            if (seconds < dayInSeconds) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                dayInSeconds = lValueOf.longValue();
            }
            return new Ttl(dayInSeconds);
        }
        return new Ttl(Time.getDayInSeconds());
    }

    public final String generateUUID() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
