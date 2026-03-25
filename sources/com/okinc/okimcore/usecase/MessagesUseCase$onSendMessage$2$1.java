package com.okinc.okimcore.usecase;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.im.OKInvisibleCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.WSRequest;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendAck;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44484sRn;
import o.C44486sRp;
import o.C44489sRs;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sPQ;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$onSendMessage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WSSendAck>, Object> {
    final /* synthetic */ String $clientMsgId;
    final /* synthetic */ InHouseIMMessageEntity $message;
    final /* synthetic */ OKMessage $okMessage;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$onSendMessage$2$1(C44502sSe c44502sSe, String str, InHouseIMMessageEntity inHouseIMMessageEntity, OKMessage oKMessage, Continuation<? super MessagesUseCase$onSendMessage$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$clientMsgId = str;
        this.$message = inHouseIMMessageEntity;
        this.$okMessage = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagesUseCase$onSendMessage$2$1(this.this$0, this.$clientMsgId, this.$message, this.$okMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WSSendAck> continuation) {
        return ((MessagesUseCase$onSendMessage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objDjBIcL;
        C44484sRn c44484sRn;
        String channelId;
        long sendTime;
        String messageId;
        Object objCopydefault;
        Object objAEQbTJ;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44486sRp c44486sRp = this.this$0.DbNXlk;
                String str = this.$clientMsgId;
                this.label = 1;
                objDjBIcL = c44486sRp.djBIcL(str, this);
                if (objDjBIcL == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        C56391yDq.AEQbTJ(obj);
                        c44484sRn = this.this$0.AEQbTJ;
                        channelId = this.$message.getChannelId();
                        sendTime = this.$message.getSendTime();
                        messageId = this.$message.getMessageId();
                        this.label = 3;
                        if (c44484sRn.EZpvd(channelId, sendTime, messageId, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                        C44489sRs c44489sRs = this.this$0.fARcdN;
                        OKMessage oKMessage = this.$okMessage;
                        this.label = 4;
                        objCopydefault = c44489sRs.copydefault(oKMessage, this);
                        if (objCopydefault == objCopydefault2) {
                        }
                        C44502sSe c44502sSe = this.this$0;
                        this.label = 5;
                        objAEQbTJ = c44502sSe.AEQbTJ((WSRequest) objCopydefault, (Continuation<? super WSSendAck>) this);
                        if (objAEQbTJ == objCopydefault2) {
                        }
                        return (WSSendAck) objAEQbTJ;
                    }
                    if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                        C44489sRs c44489sRs2 = this.this$0.fARcdN;
                        OKMessage oKMessage2 = this.$okMessage;
                        this.label = 4;
                        objCopydefault = c44489sRs2.copydefault(oKMessage2, this);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        C44502sSe c44502sSe2 = this.this$0;
                        this.label = 5;
                        objAEQbTJ = c44502sSe2.AEQbTJ((WSRequest) objCopydefault, (Continuation<? super WSSendAck>) this);
                        if (objAEQbTJ == objCopydefault2) {
                        }
                        return (WSSendAck) objAEQbTJ;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        objAEQbTJ = obj;
                        return (WSSendAck) objAEQbTJ;
                    }
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = obj;
                    C44502sSe c44502sSe22 = this.this$0;
                    this.label = 5;
                    objAEQbTJ = c44502sSe22.AEQbTJ((WSRequest) objCopydefault, (Continuation<? super WSSendAck>) this);
                    if (objAEQbTJ == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return (WSSendAck) objAEQbTJ;
                }
                C56391yDq.AEQbTJ(obj);
                objDjBIcL = obj;
            }
            InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) objDjBIcL;
            if (inHouseIMMessageEntity != null && inHouseIMMessageEntity.getSentStatus() == 1) {
                throw new Exception("Message is already being sent");
            }
            InHouseIMMessageEntity inHouseIMMessageEntity2 = this.$message;
            InHouseIMMessageEntity inHouseIMMessageEntityCopy = inHouseIMMessageEntity2.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity2.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity2.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity2.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity2.seq : 0L, ((-2) & 16) != 0 ? inHouseIMMessageEntity2.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity2.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity2.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity2.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity2.isVisible : null, ((-2) & 512) != 0 ? inHouseIMMessageEntity2.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity2.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity2.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity2.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity2.sentStatus : 1, ((-2) & 16384) != 0 ? inHouseIMMessageEntity2.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity2.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity2.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity2.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity2.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity2.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity2.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity2.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity2.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity2.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity2.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity2.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity2.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity2.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity2.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity2.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity2.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity2.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity2.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity2.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity2.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity2.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity2.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity2.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity2.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity2.replySeq : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity2.quotedMessage : null, (536870911 & 512) != 0 ? inHouseIMMessageEntity2.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity2.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity2.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity2.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity2.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity2.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity2.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity2.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity2.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity2.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity2.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity2.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity2.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity2.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity2.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity2.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity2.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity2.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity2.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity2.reactionUpdateTime : 0L);
            InHouseIMContentType inHouseIMContentTypeAEQbTJ = InHouseIMContentType.Companion.AEQbTJ(C56443yFo.AEQbTJ(this.$message.getContentType()));
            boolean z = this.$okMessage.getContent() instanceof OKInvisibleCustomMessage;
            if (sPQ.OLrzqt(inHouseIMContentTypeAEQbTJ) && !z) {
                C44486sRp c44486sRp2 = this.this$0.DbNXlk;
                this.label = 2;
                if (c44486sRp2.copydefault(inHouseIMMessageEntityCopy, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                c44484sRn = this.this$0.AEQbTJ;
                channelId = this.$message.getChannelId();
                sendTime = this.$message.getSendTime();
                messageId = this.$message.getMessageId();
                this.label = 3;
                if (c44484sRn.EZpvd(channelId, sendTime, messageId, this) == objCopydefault2) {
                }
            }
            C44489sRs c44489sRs22 = this.this$0.fARcdN;
            OKMessage oKMessage22 = this.$okMessage;
            this.label = 4;
            objCopydefault = c44489sRs22.copydefault(oKMessage22, this);
            if (objCopydefault == objCopydefault2) {
            }
            C44502sSe c44502sSe222 = this.this$0;
            this.label = 5;
            objAEQbTJ = c44502sSe222.AEQbTJ((WSRequest) objCopydefault, (Continuation<? super WSSendAck>) this);
            if (objAEQbTJ == objCopydefault2) {
            }
            return (WSSendAck) objAEQbTJ;
        } finally {
            this.this$0.fIwbmz.remove(this.$clientMsgId);
        }
    }
}
