package com.reown.sign.engine.use_case.calls;

import com.reown.android.Core;
import com.reown.android.internal.common.crypto.UtilsKt;
import com.reown.android.internal.common.crypto.codec.Codec;
import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.sync.ClientJsonRpc;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.push_messages.PushMessagesRepository;
import com.reown.android.push.notifications.DecryptMessageUseCaseInterface;
import com.reown.android.utils.ExtensionsKt;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.exceptions.InvalidSignParamsType;
import com.reown.sign.common.model.vo.clientsync.common.PayloadParams;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import org.bouncycastle.util.encoders.Base64;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DecryptSignMessageUseCase implements DecryptMessageUseCaseInterface {
    public static final Companion Companion = new Companion(null);
    public final Codec codec;
    public final MetadataStorageRepositoryInterface metadataRepository;
    public final PushMessagesRepository pushMessageStorage;
    public final JsonRpcSerializer serializer;

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.DecryptSignMessageUseCase$decryptNotification$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
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
            return DecryptSignMessageUseCase.this.decryptNotification(null, null, null, null, this);
        }
    }

    public DecryptSignMessageUseCase(@NotNull Codec codec, @NotNull JsonRpcSerializer jsonRpcSerializer, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull PushMessagesRepository pushMessagesRepository) {
        Intrinsics.checkNotNullParameter(codec, "");
        Intrinsics.checkNotNullParameter(jsonRpcSerializer, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(pushMessagesRepository, "");
        this.codec = codec;
        this.serializer = jsonRpcSerializer;
        this.metadataRepository = metadataStorageRepositoryInterface;
        this.pushMessageStorage = pushMessagesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.reown.android.push.notifications.DecryptMessageUseCaseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decryptNotification(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Core.Model.Message, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        DecryptSignMessageUseCase decryptSignMessageUseCase;
        Object objM7377constructorimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objDoesPushMessageExist = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objDoesPushMessageExist);
                PushMessagesRepository pushMessagesRepository = this.pushMessageStorage;
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                String strSha256 = UtilsKt.sha256(bytes);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = str2;
                anonymousClass1.L$3 = function1;
                anonymousClass1.L$4 = function12;
                anonymousClass1.label = 1;
                objDoesPushMessageExist = pushMessagesRepository.doesPushMessageExist(strSha256, anonymousClass1);
                if (objDoesPushMessageExist == objCopydefault) {
                    return objCopydefault;
                }
                decryptSignMessageUseCase = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function12 = (Function1) anonymousClass1.L$4;
                function1 = (Function1) anonymousClass1.L$3;
                str2 = (String) anonymousClass1.L$2;
                str = (String) anonymousClass1.L$1;
                decryptSignMessageUseCase = (DecryptSignMessageUseCase) anonymousClass1.L$0;
                C56391yDq.AEQbTJ(objDoesPushMessageExist);
            }
            String str3 = str;
            if (!((Boolean) objDoesPushMessageExist).booleanValue()) {
                Codec codec = decryptSignMessageUseCase.codec;
                Topic topic = new Topic(str3);
                byte[] bArrDecode = Base64.decode(str2);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                String strDecrypt = codec.decrypt(topic, bArrDecode);
                JsonRpcSerializer jsonRpcSerializer = decryptSignMessageUseCase.serializer;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(jsonRpcSerializer.getMoshi().adapter(ClientJsonRpc.class).fromJson(strDecrypt));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                ClientJsonRpc clientJsonRpc = (ClientJsonRpc) objM7377constructorimpl;
                if (clientJsonRpc == null) {
                    function12.invoke(new InvalidSignParamsType());
                    return Unit.INSTANCE;
                }
                ClientParams clientParamsDeserialize = decryptSignMessageUseCase.serializer.deserialize(clientJsonRpc.getMethod(), strDecrypt);
                if (clientParamsDeserialize == null) {
                    function12.invoke(new InvalidSignParamsType());
                    return Unit.INSTANCE;
                }
                AppMetaData byTopicAndType = decryptSignMessageUseCase.metadataRepository.getByTopicAndType(new Topic(str3), AppMetaDataType.PEER);
                if (byTopicAndType == null) {
                    function12.invoke(new InvalidSignParamsType());
                    return Unit.INSTANCE;
                }
                if (clientParamsDeserialize instanceof SignParams.SessionProposeParams) {
                    function1.invoke(Companion.toCore((SignParams.SessionProposeParams) clientParamsDeserialize, clientJsonRpc.getId(), str3));
                } else if (clientParamsDeserialize instanceof SignParams.SessionRequestParams) {
                    function1.invoke(Companion.toCore((SignParams.SessionRequestParams) clientParamsDeserialize, clientJsonRpc.getId(), str3, byTopicAndType));
                } else if (clientParamsDeserialize instanceof SignParams.SessionAuthenticateParams) {
                    function1.invoke(Companion.toCore((SignParams.SessionAuthenticateParams) clientParamsDeserialize, clientJsonRpc.getId(), str3, byTopicAndType));
                } else {
                    function12.invoke(new InvalidSignParamsType());
                }
            }
        } catch (Exception e) {
            function12.invoke(e);
        }
        return Unit.INSTANCE;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.use_case.calls.DecryptSignMessageUseCase.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Core.Model.Message.SessionProposal toCore(@NotNull SignParams.SessionProposeParams sessionProposeParams, long j, @NotNull String str) {
            String str2;
            Intrinsics.checkNotNullParameter(sessionProposeParams, "");
            Intrinsics.checkNotNullParameter(str, "");
            String name = sessionProposeParams.getProposer().getMetadata().getName();
            String description = sessionProposeParams.getProposer().getMetadata().getDescription();
            String url = sessionProposeParams.getProposer().getMetadata().getUrl();
            List<String> icons = sessionProposeParams.getProposer().getMetadata().getIcons();
            Redirect redirect = sessionProposeParams.getProposer().getMetadata().getRedirect();
            String str3 = (redirect == null || (str2 = redirect.getNative()) == null) ? "" : str2;
            Map<String, Core.Model.Namespace.Proposal> core = toCore(sessionProposeParams.getRequiredNamespaces());
            Map<String, Namespace.Proposal> optionalNamespaces = sessionProposeParams.getOptionalNamespaces();
            if (optionalNamespaces == null) {
                optionalNamespaces = C56424yEw.KWHzl();
            }
            return new Core.Model.Message.SessionProposal(j, str, name, description, url, icons, str3, core, toCore(optionalNamespaces), sessionProposeParams.getProperties(), sessionProposeParams.getProposer().getPublicKey(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionProposeParams.getRelays())).getProtocol(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionProposeParams.getRelays())).getData());
        }

        public final Core.Model.Message.SessionRequest toCore(@NotNull SignParams.SessionRequestParams sessionRequestParams, long j, @NotNull String str, @NotNull AppMetaData appMetaData) {
            Intrinsics.checkNotNullParameter(sessionRequestParams, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaData, "");
            return new Core.Model.Message.SessionRequest(str, sessionRequestParams.getChainId(), ExtensionsKt.toClient(appMetaData), new Core.Model.Message.SessionRequest.JSONRPCRequest(j, sessionRequestParams.getRequest().getMethod(), sessionRequestParams.getRequest().getParams()));
        }

        public final Core.Model.Message.SessionAuthenticate toCore(@NotNull SignParams.SessionAuthenticateParams sessionAuthenticateParams, long j, @NotNull String str, @NotNull AppMetaData appMetaData) {
            Intrinsics.checkNotNullParameter(sessionAuthenticateParams, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaData, "");
            return new Core.Model.Message.SessionAuthenticate(j, str, ExtensionsKt.toClient(appMetaData), toClient(sessionAuthenticateParams.getAuthPayload()), sessionAuthenticateParams.getExpiryTimestamp());
        }

        public final Core.Model.Message.SessionAuthenticate.PayloadParams toClient(@NotNull PayloadParams payloadParams) {
            Intrinsics.checkNotNullParameter(payloadParams, "");
            return new Core.Model.Message.SessionAuthenticate.PayloadParams(payloadParams.getChains(), payloadParams.getDomain(), payloadParams.getNonce(), payloadParams.getAud(), payloadParams.getType(), payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getStatement(), payloadParams.getRequestId(), payloadParams.getResources(), payloadParams.getIat());
        }

        public final Map<String, Core.Model.Namespace.Proposal> toCore(@NotNull Map<String, Namespace.Proposal> map) {
            Intrinsics.checkNotNullParameter(map, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Namespace.Proposal proposal = (Namespace.Proposal) entry.getValue();
                linkedHashMap.put(key, new Core.Model.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
            }
            return linkedHashMap;
        }
    }
}
