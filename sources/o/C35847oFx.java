package o;

import com.okinc.im.usecase.okmessage.BuildOkMessageUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReadReceiptMessage;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35847oFx {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final oFD AEQbTJ;
    public final oGR EZpvd;
    public final oFB KWHzl;
    public final oFE copydefault;

    @yCM
    public C35847oFx(@NotNull oFE ofe, @NotNull oFD ofd, @NotNull oFB ofb, @NotNull oGR ogr) {
        Intrinsics.checkNotNullParameter(ofe, "");
        Intrinsics.checkNotNullParameter(ofd, "");
        Intrinsics.checkNotNullParameter(ofb, "");
        Intrinsics.checkNotNullParameter(ogr, "");
        this.copydefault = ofe;
        this.AEQbTJ = ofd;
        this.KWHzl = ofb;
        this.EZpvd = ogr;
    }

    /* JADX INFO: renamed from: o.oFx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull OKMessage oKMessage, java.lang.Long l, sQB sqb, C44468sQy c44468sQy, C44469sQz c44469sQz, @NotNull Continuation<? super OKMessage> continuation) throws java.lang.Throwable {
        BuildOkMessageUseCase$execute$1 buildOkMessageUseCase$execute$1;
        OKMessage.SentStatus sentStatus;
        java.lang.String messageUId;
        OKMessageContent originalOKMessageContent;
        OKMessage oKMessageCopy;
        OKMessage oKMessage2;
        if (continuation instanceof BuildOkMessageUseCase$execute$1) {
            buildOkMessageUseCase$execute$1 = (BuildOkMessageUseCase$execute$1) continuation;
            int i = buildOkMessageUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                buildOkMessageUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                buildOkMessageUseCase$execute$1 = new BuildOkMessageUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = buildOkMessageUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = buildOkMessageUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessage oKMessageCopy2 = oKMessage.copy((262143 & 1) != 0 ? oKMessage.seq : 0L, (262143 & 2) != 0 ? oKMessage.clientMessageId : null, (262143 & 4) != 0 ? oKMessage.targetId : null, (262143 & 8) != 0 ? oKMessage.senderUserId : null, (262143 & 16) != 0 ? oKMessage.messageType : null, (262143 & 32) != 0 ? oKMessage.conversationType : null, (262143 & 64) != 0 ? oKMessage.sentTime : 0L, (262143 & 128) != 0 ? oKMessage.receivedTime : 0L, (262143 & 256) != 0 ? oKMessage.extra : null, (262143 & 512) != 0 ? oKMessage.objectName : null, (262143 & 1024) != 0 ? oKMessage.messageDirection : null, (262143 & 2048) != 0 ? oKMessage.sentStatus : null, (262143 & 4096) != 0 ? oKMessage.content : null, (262143 & 8192) != 0 ? oKMessage.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessage.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessage.isVisible : false, (262143 & 65536) != 0 ? oKMessage.error : null, (262143 & 131072) != 0 ? oKMessage.reactionDisplay : null);
            if (sqb != null) {
                int iAEQbTJ = sqb.AEQbTJ();
                if (iAEQbTJ == 0) {
                    sentStatus = OKMessage.SentStatus.SENDING;
                } else if (iAEQbTJ == 1) {
                    sentStatus = OKMessage.SentStatus.SENT;
                } else if (iAEQbTJ == 2) {
                    sentStatus = OKMessage.SentStatus.SENDING;
                } else if (iAEQbTJ == 3) {
                    sentStatus = OKMessage.SentStatus.FAILED;
                } else if (iAEQbTJ == 4) {
                    sentStatus = OKMessage.SentStatus.CANCELED;
                } else {
                    sentStatus = oKMessageCopy2.getSentStatus();
                }
            } else if (c44468sQy != null) {
                int iOLrzqt = c44468sQy.OLrzqt();
                if (iOLrzqt == 0) {
                    sentStatus = OKMessage.SentStatus.SENDING;
                } else if (iOLrzqt == 1) {
                    sentStatus = OKMessage.SentStatus.SENT;
                } else if (iOLrzqt == 2) {
                    sentStatus = OKMessage.SentStatus.FAILED;
                } else {
                    sentStatus = oKMessageCopy2.getSentStatus();
                }
            } else if (c44469sQz != null) {
                OKMessageContent content = c44469sQz.copydefault().getContent();
                OKReadReceiptMessage oKReadReceiptMessage = content instanceof OKReadReceiptMessage ? (OKReadReceiptMessage) content : null;
                java.lang.Long fieldNames = (oKReadReceiptMessage == null || (messageUId = oKReadReceiptMessage.getMessageUId()) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(messageUId);
                if (fieldNames != null && oKMessage.getMessageDirection() == OKMessage.MessageDirection.SEND && oKMessage.getSentStatus() == OKMessage.SentStatus.SENT && oKMessage.getSeq() <= fieldNames.longValue()) {
                    sentStatus = OKMessage.SentStatus.READ;
                } else {
                    sentStatus = oKMessageCopy2.getSentStatus();
                }
            } else {
                sentStatus = oKMessageCopy2.getSentStatus();
            }
            OKMessage.SentStatus sentStatus2 = sentStatus;
            OKMessageContent content2 = oKMessageCopy2.getContent();
            OKReferenceMessage oKReferenceMessage = content2 instanceof OKReferenceMessage ? (OKReferenceMessage) content2 : null;
            if (oKReferenceMessage == null) {
                originalOKMessageContent = oKMessageCopy2.getContent();
            } else {
                boolean zEZpvd = this.AEQbTJ.EZpvd(oKReferenceMessage, l);
                pUU.KWHzl("BuildOkMessageUseCase", "execute: [" + oKMessage.getSeq() + "]: isValidOkReferenceMessage:" + zEZpvd);
                if (zEZpvd) {
                    originalOKMessageContent = oKMessageCopy2.getContent();
                } else {
                    originalOKMessageContent = oKReferenceMessage.getOriginalOKMessageContent();
                }
            }
            oKMessageCopy = oKMessage.copy((262143 & 1) != 0 ? oKMessage.seq : 0L, (262143 & 2) != 0 ? oKMessage.clientMessageId : null, (262143 & 4) != 0 ? oKMessage.targetId : null, (262143 & 8) != 0 ? oKMessage.senderUserId : null, (262143 & 16) != 0 ? oKMessage.messageType : null, (262143 & 32) != 0 ? oKMessage.conversationType : null, (262143 & 64) != 0 ? oKMessage.sentTime : 0L, (262143 & 128) != 0 ? oKMessage.receivedTime : 0L, (262143 & 256) != 0 ? oKMessage.extra : null, (262143 & 512) != 0 ? oKMessage.objectName : null, (262143 & 1024) != 0 ? oKMessage.messageDirection : null, (262143 & 2048) != 0 ? oKMessage.sentStatus : sentStatus2, (262143 & 4096) != 0 ? oKMessage.content : originalOKMessageContent, (262143 & 8192) != 0 ? oKMessage.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessage.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessage.isVisible : false, (262143 & 65536) != 0 ? oKMessage.error : null, (262143 & 131072) != 0 ? oKMessage.reactionDisplay : null);
            boolean zCopydefault = this.copydefault.copydefault(oKMessageCopy, l);
            boolean zCopydefault2 = this.KWHzl.copydefault(oKMessageCopy);
            pUU.KWHzl("BuildOkMessageUseCase", "<" + java.lang.Thread.currentThread().getName() + "> execute: [" + oKMessageCopy.getSeq() + "]: sentStatus:" + oKMessageCopy.getSentStatus() + ", isValidMessage:" + zCopydefault + ", isBlacklistedMessage:" + zCopydefault2);
            if (!zCopydefault || zCopydefault2) {
                return null;
            }
            java.lang.String senderUserId = oKMessageCopy.getSenderUserId();
            if (senderUserId != null && !C44157sFk.KWHzl(senderUserId) && oKMessage.getConversationType() != OKConversationType.PRIVATE) {
                try {
                    Result.Application application = Result.Companion;
                    oGR ogr = this.EZpvd;
                    buildOkMessageUseCase$execute$1.L$0 = oKMessageCopy;
                    buildOkMessageUseCase$execute$1.label = 1;
                    if (ogr.AEQbTJ(oKMessageCopy, buildOkMessageUseCase$execute$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    oKMessage2 = oKMessageCopy;
                } catch (java.lang.Throwable th) {
                    th = th;
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    return oKMessageCopy;
                }
            }
            return oKMessageCopy;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oKMessage2 = (OKMessage) buildOkMessageUseCase$execute$1.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
        } catch (java.lang.Throwable th2) {
            th = th2;
            oKMessageCopy = oKMessage2;
            Result.Application application22 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            return oKMessageCopy;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return oKMessage2;
    }
}
