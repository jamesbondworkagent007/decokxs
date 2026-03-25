package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelIdListResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageRequest;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseImChannelInfoResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SenderName;
import com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSConversationIds;
import com.okinc.okimcore.model.im.inhouseim.ws.WSConversationIdsResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetMsgBySeqList;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetNewestSeq;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetNewestSeqData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionBySeq;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetUpdateReactionTimeBySeq;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetUpdateReactionTimeResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStream;
import com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStreamAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSLeaveLiveStream;
import com.okinc.okimcore.model.im.inhouseim.ws.WSLeaveLiveStreamAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSRequest;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendIndicator;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendIndicatorData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendIndicatorMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMsg;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReaction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.repository.WebSocketMessageRepository$awaitForWebSocketConnected$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$getConversationIdsFromWs$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$getReactionBySeq$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$getReactionUpdateTimes$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$getWebSocketMessageLatestSequence$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$getWebSocketMessageLatestSequences$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$getWebSocketMessagesBySequences$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$sendJoinLiveStreamRequest$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$sendLeaveLiveStreamRequest$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$sendReaction$1;
import com.okinc.okimcore.repository.WebSocketMessageRepository$sendWebSocketMessage$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44489sRs {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InHouseIMUploadMediaService AEQbTJ;
    public final android.content.Context EZpvd;
    public final sED OLrzqt;

    /* JADX INFO: renamed from: o.sRs$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    public final long KWHzl() {
        return 500L;
    }

    @yCM
    public C44489sRs(@NotNull sED sed, @NotNull InHouseIMUploadMediaService inHouseIMUploadMediaService, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(sed, "");
        Intrinsics.checkNotNullParameter(inHouseIMUploadMediaService, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = sed;
        this.AEQbTJ = inHouseIMUploadMediaService;
        this.EZpvd = context;
    }

    /* JADX INFO: renamed from: o.sRs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sRs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[PHI: r2 r9 r10
  0x0044: PHI (r2v2 o.sRs) = (r2v1 o.sRs), (r2v3 o.sRs) binds: [B:14:0x0040, B:22:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:14:0x0040, B:22:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:14:0x0040, B:22:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:21:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$awaitForWebSocketConnected$1 webSocketMessageRepository$awaitForWebSocketConnected$1;
        C44489sRs c44489sRs;
        if (continuation instanceof WebSocketMessageRepository$awaitForWebSocketConnected$1) {
            webSocketMessageRepository$awaitForWebSocketConnected$1 = (WebSocketMessageRepository$awaitForWebSocketConnected$1) continuation;
            int i = webSocketMessageRepository$awaitForWebSocketConnected$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$awaitForWebSocketConnected$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$awaitForWebSocketConnected$1 = new WebSocketMessageRepository$awaitForWebSocketConnected$1(this, continuation);
            }
        }
        java.lang.Object obj = webSocketMessageRepository$awaitForWebSocketConnected$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$awaitForWebSocketConnected$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str3 = (java.lang.String) webSocketMessageRepository$awaitForWebSocketConnected$1.L$2;
            java.lang.String str4 = (java.lang.String) webSocketMessageRepository$awaitForWebSocketConnected$1.L$1;
            c44489sRs = (C44489sRs) webSocketMessageRepository$awaitForWebSocketConnected$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str3;
            str = str4;
            if (c44489sRs.OLrzqt.AhwBna()) {
                if (c44489sRs.OLrzqt.KWHzl() != OKWsConnectionState.OPEN) {
                    C44124sEe.imLogSync$default(str2 + ": web socket is connected, can continue", null, str, 2, null);
                } else {
                    C44124sEe.imLogSync$default(str2 + ": web socket is not connected, pending for connected again...", null, str, 2, null);
                    long jKWHzl = c44489sRs.KWHzl();
                    webSocketMessageRepository$awaitForWebSocketConnected$1.L$0 = c44489sRs;
                    webSocketMessageRepository$awaitForWebSocketConnected$1.L$1 = str;
                    webSocketMessageRepository$awaitForWebSocketConnected$1.L$2 = str2;
                    webSocketMessageRepository$awaitForWebSocketConnected$1.label = 1;
                    if (DelayKt.delay(jKWHzl, webSocketMessageRepository$awaitForWebSocketConnected$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (c44489sRs.OLrzqt.AhwBna()) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        c44489sRs = this;
        if (c44489sRs.OLrzqt.KWHzl() != OKWsConnectionState.OPEN) {
        }
    }

    public final void OLrzqt() {
        if (this.OLrzqt.KWHzl() != OKWsConnectionState.OPEN) {
            throw new java.lang.IllegalArgumentException("web socket is not available".toString());
        }
    }

    public final boolean EZpvd() {
        return this.OLrzqt.KWHzl() == OKWsConnectionState.OPEN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull WSRequest wSRequest, @NotNull Continuation<? super WSSendAck> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$sendWebSocketMessage$1 webSocketMessageRepository$sendWebSocketMessage$1;
        if (continuation instanceof WebSocketMessageRepository$sendWebSocketMessage$1) {
            webSocketMessageRepository$sendWebSocketMessage$1 = (WebSocketMessageRepository$sendWebSocketMessage$1) continuation;
            int i = webSocketMessageRepository$sendWebSocketMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$sendWebSocketMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$sendWebSocketMessage$1 = new WebSocketMessageRepository$sendWebSocketMessage$1(this, continuation);
            }
        }
        WebSocketMessageRepository$sendWebSocketMessage$1 webSocketMessageRepository$sendWebSocketMessage$12 = webSocketMessageRepository$sendWebSocketMessage$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$sendWebSocketMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$sendWebSocketMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$sendWebSocketMessage$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSRequest, 0L, webSocketMessageRepository$sendWebSocketMessage$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(WSSendAck.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, @NotNull Continuation<? super WSSendMsg> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1 webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1;
        if (continuation instanceof WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1) {
            webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1 = (WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1) continuation;
            int i = webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1 = new WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            android.content.Context context = this.EZpvd;
            webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1.label = 1;
            objOLrzqt = C44169sFw.OLrzqt(oKMessage, null, context, webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageOne$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return new WSSendMsg((InHouseIMMessageRequest) objOLrzqt);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull OKMessage oKMessage, @NotNull Continuation<? super WSRequest> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1 webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1;
        if (continuation instanceof WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1) {
            webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1 = (WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1) continuation;
            int i = webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1 = new WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InHouseIMUploadMediaService inHouseIMUploadMediaService = this.AEQbTJ;
            android.content.Context context = this.EZpvd;
            webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1.label = 1;
            objOLrzqt = C44169sFw.OLrzqt(oKMessage, inHouseIMUploadMediaService, context, webSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        InHouseIMMessageRequest inHouseIMMessageRequest = (InHouseIMMessageRequest) objOLrzqt;
        InHouseIMContentType contentType = inHouseIMMessageRequest.EZpvd().getContentType();
        if (contentType == InHouseIMContentType.TypingIndicator) {
            return new WSSendIndicator(new WSSendIndicatorData(java.lang.Long.parseLong(inHouseIMMessageRequest.AEQbTJ()), new WSSendIndicatorMessage(contentType.getApiValue())));
        }
        return new WSSendMsg(inHouseIMMessageRequest);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, long j, @NotNull Continuation<? super WSSendAck> continuation) {
        java.lang.String strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
        ReadReceiptMessageData readReceiptMessageData = new ReadReceiptMessageData(C33129mqd.gEmmrt(C56443yFo.KWHzl(j)));
        return copydefault(new WSSendMsg(new InHouseIMMessageRequest(str, new WSSendMessageDetailData(strCopydefault, str, InHouseIMContentType.ReadReceipt, EZpvd(oKConversationType), (InHouseIMPlatformType) null, (java.lang.Long) null, (TextMessageData) null, (ImageMessageData) null, (VideoMessageData) null, (VoiceMessageData) null, (ShareMessageData) null, (CallMessageData) null, (WSSendMessageDetailData) null, (CustomMessageData) null, (SystemMessageData) (0 == true ? 1 : 0), (StickerMessageData) null, readReceiptMessageData, (RecallMessageData) null, (RecallMessageData) null, (GroupInvitationMessageData) null, (StreamPlaceHolderMessageData) null, (StreamPlaceHolderMessageData) null, (MediaMessageData) null, (SenderName) null, (java.lang.Long) null, (JsonElement) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, (FrontendOption) null, (java.lang.Long) null, (WSSendReactionResponse) null, (java.util.List) null, -65552, 1, (DefaultConstructorMarker) null))), continuation);
    }

    public final InHouseIMChannelType EZpvd(@NotNull OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        if (TaskDescription.AEQbTJ[oKConversationType.ordinal()] == 1) {
            return InHouseIMChannelType.Individual;
        }
        return InHouseIMChannelType.Group;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData.copy$default(com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData, com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData, com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData, com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData, com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData, com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData, com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData, com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData, com.okinc.okimcore.model.im.inhouseim.ws.SenderName, java.lang.Long, kotlinx.serialization.json.JsonElement, java.lang.Integer, java.lang.String, java.util.List, com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse, java.util.List, int, int, java.lang.Object):com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData */
    public final WSSendMessageDetailData EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InHouseIMContentType inHouseIMContentType, @NotNull InHouseIMChannelType inHouseIMChannelType, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        Intrinsics.checkNotNullParameter(inHouseIMChannelType, "");
        WSSendMessageDetailData wSSendMessageDetailDataAEQbTJ = sQS.AEQbTJ(new WSSendMessageDetailData((java.lang.String) null, (java.lang.String) null, (InHouseIMContentType) null, (InHouseIMChannelType) null, (InHouseIMPlatformType) null, (java.lang.Long) null, (TextMessageData) null, (ImageMessageData) null, (VideoMessageData) null, (VoiceMessageData) null, (ShareMessageData) null, (CallMessageData) null, (WSSendMessageDetailData) null, (CustomMessageData) null, (SystemMessageData) null, (StickerMessageData) null, (ReadReceiptMessageData) null, (RecallMessageData) null, (RecallMessageData) null, (GroupInvitationMessageData) null, (StreamPlaceHolderMessageData) null, (StreamPlaceHolderMessageData) null, (MediaMessageData) null, (SenderName) null, (java.lang.Long) null, (JsonElement) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, (FrontendOption) null, (java.lang.Long) null, (WSSendReactionResponse) null, (java.util.List) null, -1, 1, (DefaultConstructorMarker) null));
        return wSSendMessageDetailDataAEQbTJ.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailDataAEQbTJ.senderUid : str2, ((-17039376) & 2) != 0 ? wSSendMessageDetailDataAEQbTJ.channelId : str, ((-17039376) & 4) != 0 ? wSSendMessageDetailDataAEQbTJ.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailDataAEQbTJ.channelType : inHouseIMChannelType, ((-17039376) & 16) != 0 ? wSSendMessageDetailDataAEQbTJ.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailDataAEQbTJ.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailDataAEQbTJ.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailDataAEQbTJ.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailDataAEQbTJ.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailDataAEQbTJ.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailDataAEQbTJ.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailDataAEQbTJ.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailDataAEQbTJ.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailDataAEQbTJ.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailDataAEQbTJ.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailDataAEQbTJ.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailDataAEQbTJ.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailDataAEQbTJ.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailDataAEQbTJ.adminRecallMessage : new RecallMessageData(java.lang.Long.valueOf(j), (java.lang.Boolean) (0 == true ? 1 : 0), (java.util.List) (0 == true ? 1 : 0), 6, (DefaultConstructorMarker) (0 == true ? 1 : 0)), ((-17039376) & 524288) != 0 ? wSSendMessageDetailDataAEQbTJ.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailDataAEQbTJ.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailDataAEQbTJ.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailDataAEQbTJ.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailDataAEQbTJ.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailDataAEQbTJ.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailDataAEQbTJ.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailDataAEQbTJ.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailDataAEQbTJ.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailDataAEQbTJ.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailDataAEQbTJ.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailDataAEQbTJ.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailDataAEQbTJ.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailDataAEQbTJ.reactionDisplay : null);
    }

    public final WSSendMessageDetailData copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InHouseIMContentType inHouseIMContentType, @NotNull InHouseIMChannelType inHouseIMChannelType, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        Intrinsics.checkNotNullParameter(inHouseIMChannelType, "");
        WSSendMessageDetailData wSSendMessageDetailDataAEQbTJ = sQS.AEQbTJ(new WSSendMessageDetailData((java.lang.String) null, (java.lang.String) null, (InHouseIMContentType) null, (InHouseIMChannelType) null, (InHouseIMPlatformType) null, (java.lang.Long) null, (TextMessageData) null, (ImageMessageData) null, (VideoMessageData) null, (VoiceMessageData) null, (ShareMessageData) null, (CallMessageData) null, (WSSendMessageDetailData) null, (CustomMessageData) null, (SystemMessageData) null, (StickerMessageData) null, (ReadReceiptMessageData) null, (RecallMessageData) null, (RecallMessageData) null, (GroupInvitationMessageData) null, (StreamPlaceHolderMessageData) null, (StreamPlaceHolderMessageData) null, (MediaMessageData) null, (SenderName) null, (java.lang.Long) null, (JsonElement) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, (FrontendOption) null, (java.lang.Long) null, (WSSendReactionResponse) null, (java.util.List) null, -1, 1, (DefaultConstructorMarker) null));
        return wSSendMessageDetailDataAEQbTJ.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailDataAEQbTJ.senderUid : str2, ((-17039376) & 2) != 0 ? wSSendMessageDetailDataAEQbTJ.channelId : str, ((-17039376) & 4) != 0 ? wSSendMessageDetailDataAEQbTJ.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailDataAEQbTJ.channelType : inHouseIMChannelType, ((-17039376) & 16) != 0 ? wSSendMessageDetailDataAEQbTJ.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailDataAEQbTJ.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailDataAEQbTJ.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailDataAEQbTJ.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailDataAEQbTJ.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailDataAEQbTJ.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailDataAEQbTJ.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailDataAEQbTJ.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailDataAEQbTJ.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailDataAEQbTJ.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailDataAEQbTJ.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailDataAEQbTJ.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailDataAEQbTJ.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailDataAEQbTJ.senderRecallMessage : new RecallMessageData(java.lang.Long.valueOf(j), (java.lang.Boolean) (0 == true ? 1 : 0), (java.util.List) (0 == true ? 1 : 0), 6, (DefaultConstructorMarker) (0 == true ? 1 : 0)), ((-17039376) & 262144) != 0 ? wSSendMessageDetailDataAEQbTJ.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailDataAEQbTJ.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailDataAEQbTJ.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailDataAEQbTJ.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailDataAEQbTJ.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailDataAEQbTJ.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailDataAEQbTJ.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailDataAEQbTJ.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailDataAEQbTJ.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailDataAEQbTJ.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailDataAEQbTJ.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailDataAEQbTJ.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailDataAEQbTJ.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailDataAEQbTJ.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailDataAEQbTJ.reactionDisplay : null);
    }

    public final WSSendMessageDetailData KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InHouseIMContentType inHouseIMContentType, @NotNull InHouseIMChannelType inHouseIMChannelType, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        Intrinsics.checkNotNullParameter(inHouseIMChannelType, "");
        if (inHouseIMContentType == InHouseIMContentType.RecallMessageByAdmin) {
            return EZpvd(str, str2, inHouseIMContentType, inHouseIMChannelType, j);
        }
        return copydefault(str, str2, inHouseIMContentType, inHouseIMChannelType, j);
    }

    public final WSSendMsg AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InHouseIMContentType inHouseIMContentType, @NotNull OKConversationType oKConversationType, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        return new WSSendMsg(new InHouseIMMessageRequest(str, KWHzl(str, str2, inHouseIMContentType, EZpvd(oKConversationType), j)));
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InHouseIMContentType inHouseIMContentType, @NotNull OKConversationType oKConversationType, long j, @NotNull Continuation<? super WSSendAck> continuation) {
        return copydefault(AEQbTJ(str, str2, inHouseIMContentType, oKConversationType, j), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull WSGetNewestSeq wSGetNewestSeq, @NotNull Continuation<? super InHouseIMChannelIdListResponse> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$getWebSocketMessageLatestSequences$1 webSocketMessageRepository$getWebSocketMessageLatestSequences$1;
        if (continuation instanceof WebSocketMessageRepository$getWebSocketMessageLatestSequences$1) {
            webSocketMessageRepository$getWebSocketMessageLatestSequences$1 = (WebSocketMessageRepository$getWebSocketMessageLatestSequences$1) continuation;
            int i = webSocketMessageRepository$getWebSocketMessageLatestSequences$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$getWebSocketMessageLatestSequences$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$getWebSocketMessageLatestSequences$1 = new WebSocketMessageRepository$getWebSocketMessageLatestSequences$1(this, continuation);
            }
        }
        WebSocketMessageRepository$getWebSocketMessageLatestSequences$1 webSocketMessageRepository$getWebSocketMessageLatestSequences$12 = webSocketMessageRepository$getWebSocketMessageLatestSequences$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$getWebSocketMessageLatestSequences$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$getWebSocketMessageLatestSequences$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$getWebSocketMessageLatestSequences$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSGetNewestSeq, 0L, webSocketMessageRepository$getWebSocketMessageLatestSequences$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(InHouseIMChannelIdListResponse.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final java.lang.Object KWHzl(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super InHouseIMChannelIdListResponse> continuation) {
        return OLrzqt(new WSGetNewestSeq(new WSGetNewestSeqData(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set))), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.util.List<InHouseImChannelInfoResponse>> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1 webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1;
        if (continuation instanceof WebSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1) {
            webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1 = (WebSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1) continuation;
            int i = webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1 = new WebSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1.label = 1;
            objKWHzl = KWHzl(set, webSocketMessageRepository$getWebSocketMessageLatestSequencesAsList$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        InHouseIMChannelIdListResponse inHouseIMChannelIdListResponse = (InHouseIMChannelIdListResponse) objKWHzl;
        if (inHouseIMChannelIdListResponse != null) {
            return inHouseIMChannelIdListResponse.AEQbTJ();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$getWebSocketMessageLatestSequence$1 webSocketMessageRepository$getWebSocketMessageLatestSequence$1;
        java.lang.Object next;
        java.lang.String strCopydefault;
        if (continuation instanceof WebSocketMessageRepository$getWebSocketMessageLatestSequence$1) {
            webSocketMessageRepository$getWebSocketMessageLatestSequence$1 = (WebSocketMessageRepository$getWebSocketMessageLatestSequence$1) continuation;
            int i = webSocketMessageRepository$getWebSocketMessageLatestSequence$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$getWebSocketMessageLatestSequence$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$getWebSocketMessageLatestSequence$1 = new WebSocketMessageRepository$getWebSocketMessageLatestSequence$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = webSocketMessageRepository$getWebSocketMessageLatestSequence$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$getWebSocketMessageLatestSequence$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.Set<java.lang.String> setAEQbTJ = yED.AEQbTJ(str);
            webSocketMessageRepository$getWebSocketMessageLatestSequence$1.L$0 = str;
            webSocketMessageRepository$getWebSocketMessageLatestSequence$1.label = 1;
            objEZpvd = EZpvd(setAEQbTJ, webSocketMessageRepository$getWebSocketMessageLatestSequence$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) webSocketMessageRepository$getWebSocketMessageLatestSequence$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list = (java.util.List) objEZpvd;
        if (list == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((InHouseImChannelInfoResponse) next).KWHzl(), (java.lang.Object) str)) {
                break;
            }
        }
        InHouseImChannelInfoResponse inHouseImChannelInfoResponse = (InHouseImChannelInfoResponse) next;
        if (inHouseImChannelInfoResponse == null || (strCopydefault = inHouseImChannelInfoResponse.copydefault()) == null) {
            return null;
        }
        return C56443yFo.KWHzl(java.lang.Long.parseLong(strCopydefault));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull WSGetMsgBySeqList wSGetMsgBySeqList, @NotNull Continuation<? super WSMessageListResponse> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$getWebSocketMessagesBySequences$1 webSocketMessageRepository$getWebSocketMessagesBySequences$1;
        if (continuation instanceof WebSocketMessageRepository$getWebSocketMessagesBySequences$1) {
            webSocketMessageRepository$getWebSocketMessagesBySequences$1 = (WebSocketMessageRepository$getWebSocketMessagesBySequences$1) continuation;
            int i = webSocketMessageRepository$getWebSocketMessagesBySequences$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$getWebSocketMessagesBySequences$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$getWebSocketMessagesBySequences$1 = new WebSocketMessageRepository$getWebSocketMessagesBySequences$1(this, continuation);
            }
        }
        WebSocketMessageRepository$getWebSocketMessagesBySequences$1 webSocketMessageRepository$getWebSocketMessagesBySequences$12 = webSocketMessageRepository$getWebSocketMessagesBySequences$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$getWebSocketMessagesBySequences$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$getWebSocketMessagesBySequences$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$getWebSocketMessagesBySequences$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSGetMsgBySeqList, 0L, webSocketMessageRepository$getWebSocketMessagesBySequences$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(WSMessageListResponse.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<InHouseIMConversationSimpleInfoEntity>> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$getConversationIdsFromWs$1 webSocketMessageRepository$getConversationIdsFromWs$1;
        java.lang.Object objDecodeFromJsonElement;
        if (continuation instanceof WebSocketMessageRepository$getConversationIdsFromWs$1) {
            webSocketMessageRepository$getConversationIdsFromWs$1 = (WebSocketMessageRepository$getConversationIdsFromWs$1) continuation;
            int i = webSocketMessageRepository$getConversationIdsFromWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$getConversationIdsFromWs$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$getConversationIdsFromWs$1 = new WebSocketMessageRepository$getConversationIdsFromWs$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = webSocketMessageRepository$getConversationIdsFromWs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$getConversationIdsFromWs$1.label;
        int i3 = 1;
        byte b = 0;
        byte b2 = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            WSConversationIds wSConversationIds = new WSConversationIds(b2 == true ? 1 : 0, i3, b == true ? 1 : 0);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$getConversationIdsFromWs$1.label = 1;
            objKWHzl = sed.KWHzl(wSConversationIds, 60000L, webSocketMessageRepository$getConversationIdsFromWs$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        JsonElement jsonElement = (JsonElement) objKWHzl;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            objDecodeFromJsonElement = jsonAEQbTJ.decodeFromJsonElement(WSConversationIdsResponse.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            objDecodeFromJsonElement = null;
        }
        WSConversationIdsResponse wSConversationIdsResponse = (WSConversationIdsResponse) objDecodeFromJsonElement;
        java.util.List<InHouseIMConversationSimpleInfoEntity> listCopydefault = wSConversationIdsResponse != null ? wSConversationIdsResponse.copydefault() : null;
        return listCopydefault == null ? yDY.AhwBna() : listCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull WSSendReaction wSSendReaction, @NotNull Continuation<? super WSSendReactionAck> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$sendReaction$1 webSocketMessageRepository$sendReaction$1;
        if (continuation instanceof WebSocketMessageRepository$sendReaction$1) {
            webSocketMessageRepository$sendReaction$1 = (WebSocketMessageRepository$sendReaction$1) continuation;
            int i = webSocketMessageRepository$sendReaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$sendReaction$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$sendReaction$1 = new WebSocketMessageRepository$sendReaction$1(this, continuation);
            }
        }
        WebSocketMessageRepository$sendReaction$1 webSocketMessageRepository$sendReaction$12 = webSocketMessageRepository$sendReaction$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$sendReaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$sendReaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$sendReaction$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSSendReaction, 0L, webSocketMessageRepository$sendReaction$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(WSSendReactionAck.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull WSGetUpdateReactionTimeBySeq wSGetUpdateReactionTimeBySeq, @NotNull Continuation<? super WSGetUpdateReactionTimeResponse> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$getReactionUpdateTimes$1 webSocketMessageRepository$getReactionUpdateTimes$1;
        if (continuation instanceof WebSocketMessageRepository$getReactionUpdateTimes$1) {
            webSocketMessageRepository$getReactionUpdateTimes$1 = (WebSocketMessageRepository$getReactionUpdateTimes$1) continuation;
            int i = webSocketMessageRepository$getReactionUpdateTimes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$getReactionUpdateTimes$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$getReactionUpdateTimes$1 = new WebSocketMessageRepository$getReactionUpdateTimes$1(this, continuation);
            }
        }
        WebSocketMessageRepository$getReactionUpdateTimes$1 webSocketMessageRepository$getReactionUpdateTimes$12 = webSocketMessageRepository$getReactionUpdateTimes$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$getReactionUpdateTimes$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$getReactionUpdateTimes$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$getReactionUpdateTimes$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSGetUpdateReactionTimeBySeq, 0L, webSocketMessageRepository$getReactionUpdateTimes$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(WSGetUpdateReactionTimeResponse.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sED.sendWebSocketCommand$default(o.sED, com.okinc.okimcore.model.im.inhouseim.ws.WSRequest, long, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull WSGetReactionBySeq wSGetReactionBySeq, @NotNull Continuation<? super WSGetReactionResponse> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$getReactionBySeq$1 webSocketMessageRepository$getReactionBySeq$1;
        if (continuation instanceof WebSocketMessageRepository$getReactionBySeq$1) {
            webSocketMessageRepository$getReactionBySeq$1 = (WebSocketMessageRepository$getReactionBySeq$1) continuation;
            int i = webSocketMessageRepository$getReactionBySeq$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$getReactionBySeq$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$getReactionBySeq$1 = new WebSocketMessageRepository$getReactionBySeq$1(this, continuation);
            }
        }
        WebSocketMessageRepository$getReactionBySeq$1 webSocketMessageRepository$getReactionBySeq$12 = webSocketMessageRepository$getReactionBySeq$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$getReactionBySeq$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$getReactionBySeq$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$getReactionBySeq$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSGetReactionBySeq, 0L, webSocketMessageRepository$getReactionBySeq$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(WSGetReactionResponse.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull WSJoinLiveStream wSJoinLiveStream, @NotNull Continuation<? super WSJoinLiveStreamAck> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$sendJoinLiveStreamRequest$1 webSocketMessageRepository$sendJoinLiveStreamRequest$1;
        if (continuation instanceof WebSocketMessageRepository$sendJoinLiveStreamRequest$1) {
            webSocketMessageRepository$sendJoinLiveStreamRequest$1 = (WebSocketMessageRepository$sendJoinLiveStreamRequest$1) continuation;
            int i = webSocketMessageRepository$sendJoinLiveStreamRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$sendJoinLiveStreamRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$sendJoinLiveStreamRequest$1 = new WebSocketMessageRepository$sendJoinLiveStreamRequest$1(this, continuation);
            }
        }
        WebSocketMessageRepository$sendJoinLiveStreamRequest$1 webSocketMessageRepository$sendJoinLiveStreamRequest$12 = webSocketMessageRepository$sendJoinLiveStreamRequest$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$sendJoinLiveStreamRequest$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$sendJoinLiveStreamRequest$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$sendJoinLiveStreamRequest$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSJoinLiveStream, 0L, webSocketMessageRepository$sendJoinLiveStreamRequest$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(WSJoinLiveStreamAck.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull WSLeaveLiveStream wSLeaveLiveStream, @NotNull Continuation<? super WSLeaveLiveStreamAck> continuation) throws java.lang.Throwable {
        WebSocketMessageRepository$sendLeaveLiveStreamRequest$1 webSocketMessageRepository$sendLeaveLiveStreamRequest$1;
        if (continuation instanceof WebSocketMessageRepository$sendLeaveLiveStreamRequest$1) {
            webSocketMessageRepository$sendLeaveLiveStreamRequest$1 = (WebSocketMessageRepository$sendLeaveLiveStreamRequest$1) continuation;
            int i = webSocketMessageRepository$sendLeaveLiveStreamRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketMessageRepository$sendLeaveLiveStreamRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketMessageRepository$sendLeaveLiveStreamRequest$1 = new WebSocketMessageRepository$sendLeaveLiveStreamRequest$1(this, continuation);
            }
        }
        WebSocketMessageRepository$sendLeaveLiveStreamRequest$1 webSocketMessageRepository$sendLeaveLiveStreamRequest$12 = webSocketMessageRepository$sendLeaveLiveStreamRequest$1;
        java.lang.Object objSendWebSocketCommand$default = webSocketMessageRepository$sendLeaveLiveStreamRequest$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = webSocketMessageRepository$sendLeaveLiveStreamRequest$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
            sED sed = this.OLrzqt;
            webSocketMessageRepository$sendLeaveLiveStreamRequest$12.label = 1;
            objSendWebSocketCommand$default = sED.sendWebSocketCommand$default(sed, wSLeaveLiveStream, 0L, webSocketMessageRepository$sendLeaveLiveStreamRequest$12, 2, null);
            if (objSendWebSocketCommand$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSendWebSocketCommand$default);
        }
        JsonElement jsonElement = (JsonElement) objSendWebSocketCommand$default;
        try {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            jsonAEQbTJ.getSerializersModule();
            return jsonAEQbTJ.decodeFromJsonElement(WSLeaveLiveStreamAck.Companion.serializer(), jsonElement);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
