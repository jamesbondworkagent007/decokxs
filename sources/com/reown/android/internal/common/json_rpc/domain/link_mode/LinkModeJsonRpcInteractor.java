package com.reown.android.internal.common.json_rpc.domain.link_mode;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.codec.Codec;
import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.json_rpc.model.JsonRpcMapperKt;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.sync.ClientJsonRpc;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.internal.common.model.type.JsonRpcClientSync;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.android.push.notifications.PushMessagingService;
import com.reown.foundation.common.model.Topic;
import com.reown.util.UtilFunctionsKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import o.C56524yIo;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class LinkModeJsonRpcInteractor implements LinkModeJsonRpcInteractorInterface {
    public final MutableSharedFlow<WCRequest> _clientSyncJsonRpc;
    public final MutableSharedFlow<SDKError> _internalErrors;
    public final MutableSharedFlow<WCResponse> _peerResponse;
    public final Codec chaChaPolyCodec;
    public final SharedFlow<WCRequest> clientSyncJsonRpc;
    public final Context context;
    public final SharedFlow<SDKError> internalErrors;
    public final JsonRpcHistory jsonRpcHistory;
    public final SharedFlow<WCResponse> peerResponse;

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractor$serializeError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17671 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17671(Continuation<? super C17671> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkModeJsonRpcInteractor.this.serializeError(null, this);
        }
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractor$serializeResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17681 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17681(Continuation<? super C17681> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkModeJsonRpcInteractor.this.serializeResult(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<WCRequest> getClientSyncJsonRpc() {
        return this.clientSyncJsonRpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<SDKError> getInternalErrors() {
        return this.internalErrors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<WCResponse> getPeerResponse() {
        return this.peerResponse;
    }

    public LinkModeJsonRpcInteractor(@NotNull Codec codec, @NotNull JsonRpcHistory jsonRpcHistory, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(codec, "");
        Intrinsics.checkNotNullParameter(jsonRpcHistory, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.chaChaPolyCodec = codec;
        this.jsonRpcHistory = jsonRpcHistory;
        this.context = context;
        MutableSharedFlow<WCRequest> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._clientSyncJsonRpc = mutableSharedFlowMutableSharedFlow$default;
        this.clientSyncJsonRpc = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<WCResponse> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._peerResponse = mutableSharedFlowMutableSharedFlow$default2;
        this.peerResponse = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<SDKError> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._internalErrors = mutableSharedFlowMutableSharedFlow$default3;
        this.internalErrors = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    public final JsonRpcSerializer getSerializer() {
        return (JsonRpcSerializer) KoinApplicationKt.getWcKoinApp().OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, null);
    }

    @Override // com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface
    public void triggerRequest(@NotNull JsonRpcClientSync<?> jsonRpcClientSync, @NotNull Topic topic, @NotNull String str, @NotNull EnvelopeType envelopeType) {
        Intrinsics.checkNotNullParameter(jsonRpcClientSync, "");
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        String strSerialize = getSerializer().serialize(jsonRpcClientSync);
        if (strSerialize == null) {
            throw new IllegalStateException("LinkMode: Cannot serialize the request");
        }
        if (this.jsonRpcHistory.setRequest(jsonRpcClientSync.getId(), topic, jsonRpcClientSync.getMethod(), strSerialize, TransportType.LINK_MODE)) {
            String strEncodeToString = Base64.encodeToString(Codec.DefaultImpls.encrypt$default(this.chaChaPolyCodec, topic, strSerialize, envelopeType, null, 8, null), 11);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str + "?wc_ev=" + strEncodeToString + "&topic=" + topic.getValue()));
            intent.addFlags(268435456);
            this.context.startActivity(intent);
        }
    }

    @Override // com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface
    public void triggerResponse(@NotNull Topic topic, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull String str, Participants participants, @NotNull EnvelopeType envelopeType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        String strSerialize = getSerializer().serialize(jsonRpcResponse);
        if (strSerialize == null) {
            throw new IllegalStateException("LinkMode: Cannot serialize the response");
        }
        String strEncodeToString = Base64.encodeToString(this.chaChaPolyCodec.encrypt(topic, strSerialize, envelopeType, participants), 11);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str + "?wc_ev=" + strEncodeToString + "&topic=" + topic.getValue()));
        intent.addFlags(268435456);
        this.jsonRpcHistory.updateRequestWithResponse(jsonRpcResponse.getId(), strSerialize);
        this.context.startActivity(intent);
    }

    @Override // com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface
    public void dispatchEnvelope(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("wc_ev");
        if (queryParameter == null) {
            throw new IllegalStateException("LinkMode: Missing wc_ev parameter");
        }
        String queryParameter2 = uri.getQueryParameter(PushMessagingService.KEY_TOPIC);
        if (queryParameter2 == null) {
            throw new IllegalStateException("LinkMode: Missing topic parameter");
        }
        byte[] bArrDecode = Base64.decode(queryParameter, 11);
        Codec codec = this.chaChaPolyCodec;
        Topic topic = new Topic(queryParameter2);
        Intrinsics.copydefault(bArrDecode);
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(codec.decrypt(topic, bArrDecode), queryParameter2, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractor$dispatchEnvelope$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $envelope;
        public final /* synthetic */ String $topic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$envelope = str;
            this.$topic = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return LinkModeJsonRpcInteractor.this.new AnonymousClass1(this.$envelope, this.$topic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractor$dispatchEnvelope$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ String $envelope;
            public final /* synthetic */ String $topic;
            public int label;
            public final /* synthetic */ LinkModeJsonRpcInteractor this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07031(LinkModeJsonRpcInteractor linkModeJsonRpcInteractor, String str, String str2, Continuation<? super C07031> continuation) {
                super(2, continuation);
                this.this$0 = linkModeJsonRpcInteractor;
                this.$envelope = str;
                this.$topic = str2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07031(this.this$0, this.$envelope, this.$topic, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM7377constructorimpl;
                Unit unit;
                Object objM7377constructorimpl2;
                Object objM7377constructorimpl3;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    JsonRpcSerializer serializer = this.this$0.getSerializer();
                    String str = this.$envelope;
                    try {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(serializer.getMoshi().adapter(ClientJsonRpc.class).fromJson(str));
                    } catch (Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    unit = null;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    ClientJsonRpc clientJsonRpc = (ClientJsonRpc) objM7377constructorimpl;
                    if (clientJsonRpc != null) {
                        LinkModeJsonRpcInteractor linkModeJsonRpcInteractor = this.this$0;
                        String str2 = this.$topic;
                        String str3 = this.$envelope;
                        this.label = 1;
                        if (linkModeJsonRpcInteractor.serializeRequest(clientJsonRpc, str2, str3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        JsonRpcSerializer serializer2 = this.this$0.getSerializer();
                        String str4 = this.$envelope;
                        try {
                            Result.Application application3 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(serializer2.getMoshi().adapter(JsonRpcResponse.JsonRpcResult.class).fromJson(str4));
                        } catch (Throwable th2) {
                            Result.Application application4 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                        }
                        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                            objM7377constructorimpl2 = null;
                        }
                        JsonRpcResponse.JsonRpcResult jsonRpcResult = (JsonRpcResponse.JsonRpcResult) objM7377constructorimpl2;
                        if (jsonRpcResult != null) {
                            LinkModeJsonRpcInteractor linkModeJsonRpcInteractor2 = this.this$0;
                            this.label = 2;
                            if (linkModeJsonRpcInteractor2.serializeResult(jsonRpcResult, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            unit = Unit.INSTANCE;
                        } else {
                            JsonRpcSerializer serializer3 = this.this$0.getSerializer();
                            String str5 = this.$envelope;
                            try {
                                Result.Application application5 = Result.Companion;
                                objM7377constructorimpl3 = Result.m7377constructorimpl(serializer3.getMoshi().adapter(JsonRpcResponse.JsonRpcError.class).fromJson(str5));
                            } catch (Throwable th3) {
                                Result.Application application6 = Result.Companion;
                                objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                            }
                            if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                                objM7377constructorimpl3 = null;
                            }
                            JsonRpcResponse.JsonRpcError jsonRpcError = (JsonRpcResponse.JsonRpcError) objM7377constructorimpl3;
                            if (jsonRpcError != null) {
                                LinkModeJsonRpcInteractor linkModeJsonRpcInteractor3 = this.this$0;
                                this.label = 3;
                                if (linkModeJsonRpcInteractor3.serializeError(jsonRpcError, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                unit = Unit.INSTANCE;
                            }
                        }
                    }
                } else if (i == 1) {
                    C56391yDq.AEQbTJ(obj);
                    unit = Unit.INSTANCE;
                } else if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    unit = Unit.INSTANCE;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    throw new IllegalStateException("LinkMode: Received unknown object type");
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
                C07031 c07031 = new C07031(LinkModeJsonRpcInteractor.this, this.$envelope, this.$topic, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07031, this) == objCopydefault) {
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

    public final Object serializeRequest(ClientJsonRpc clientJsonRpc, String str, String str2, Continuation<? super Unit> continuation) {
        ClientParams clientParamsDeserialize;
        Object objEmit;
        return (this.jsonRpcHistory.setRequest(clientJsonRpc.getId(), new Topic(str == null ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str), clientJsonRpc.getMethod(), str2, TransportType.LINK_MODE) && (clientParamsDeserialize = getSerializer().deserialize(clientJsonRpc.getMethod(), str2)) != null && (objEmit = this._clientSyncJsonRpc.emit(getWCRequest(str, clientJsonRpc, clientParamsDeserialize), continuation)) == C56442yFn.copydefault()) ? objEmit : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object serializeResult(JsonRpcResponse.JsonRpcResult jsonRpcResult, Continuation<? super Unit> continuation) throws Throwable {
        C17681 c17681;
        Unit unit;
        if (continuation instanceof C17681) {
            c17681 = (C17681) continuation;
            int i = c17681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17681.label = i - Integer.MIN_VALUE;
            } else {
                c17681 = new C17681(continuation);
            }
        }
        Object obj = c17681.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17681.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strSerialize = getSerializer().serialize(jsonRpcResult);
            if (strSerialize == null) {
                throw new IllegalStateException("LinkMode: Unknown result params");
            }
            JsonRpcHistoryRecord jsonRpcHistoryRecordUpdateRequestWithResponse = this.jsonRpcHistory.updateRequestWithResponse(jsonRpcResult.getId(), strSerialize);
            if (jsonRpcHistoryRecordUpdateRequestWithResponse != null) {
                ClientParams clientParamsDeserialize = getSerializer().deserialize(jsonRpcHistoryRecordUpdateRequestWithResponse.getMethod(), jsonRpcHistoryRecordUpdateRequestWithResponse.getBody());
                if (clientParamsDeserialize != null) {
                    MutableSharedFlow<WCResponse> mutableSharedFlow = this._peerResponse;
                    WCResponse wCResponse = JsonRpcMapperKt.toWCResponse(jsonRpcHistoryRecordUpdateRequestWithResponse, new JsonRpcResponse.JsonRpcResult(jsonRpcResult.getId(), null, jsonRpcResult.getResult(), 2, null), clientParamsDeserialize);
                    c17681.label = 1;
                    if (mutableSharedFlow.emit(wCResponse, c17681) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    unit = null;
                    if (unit == null) {
                        throw new IllegalStateException("LinkMode: Cannot serialize result");
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        unit = Unit.INSTANCE;
        if (unit == null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object serializeError(JsonRpcResponse.JsonRpcError jsonRpcError, Continuation<? super Unit> continuation) throws Throwable {
        C17671 c17671;
        Unit unit;
        if (continuation instanceof C17671) {
            c17671 = (C17671) continuation;
            int i = c17671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17671.label = i - Integer.MIN_VALUE;
            } else {
                c17671 = new C17671(continuation);
            }
        }
        Object obj = c17671.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17671.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strSerialize = getSerializer().serialize(jsonRpcError);
            if (strSerialize == null) {
                throw new IllegalStateException("LinkMode: Unknown result params");
            }
            JsonRpcHistoryRecord jsonRpcHistoryRecordUpdateRequestWithResponse = this.jsonRpcHistory.updateRequestWithResponse(jsonRpcError.getId(), strSerialize);
            if (jsonRpcHistoryRecordUpdateRequestWithResponse != null) {
                ClientParams clientParamsDeserialize = getSerializer().deserialize(jsonRpcHistoryRecordUpdateRequestWithResponse.getMethod(), jsonRpcHistoryRecordUpdateRequestWithResponse.getBody());
                if (clientParamsDeserialize != null) {
                    MutableSharedFlow<WCResponse> mutableSharedFlow = this._peerResponse;
                    WCResponse wCResponse = JsonRpcMapperKt.toWCResponse(jsonRpcHistoryRecordUpdateRequestWithResponse, jsonRpcError, clientParamsDeserialize);
                    c17671.label = 1;
                    if (mutableSharedFlow.emit(wCResponse, c17671) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    unit = null;
                    if (unit == null) {
                        throw new IllegalStateException("LinkMode: Cannot serialize error");
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        unit = Unit.INSTANCE;
        if (unit == null) {
        }
        return Unit.INSTANCE;
    }

    public final WCRequest getWCRequest(String str, ClientJsonRpc clientJsonRpc, ClientParams clientParams) {
        if (str == null) {
            str = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        Topic topic = new Topic(str);
        long id = clientJsonRpc.getId();
        String method = clientJsonRpc.getMethod();
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        return new WCRequest(topic, id, method, clientParams, UtilFunctionsKt.getEmpty(c56529yIt), 0L, UtilFunctionsKt.getEmpty(c56529yIt), UtilFunctionsKt.getEmpty(c56529yIt), TransportType.LINK_MODE);
    }
}
