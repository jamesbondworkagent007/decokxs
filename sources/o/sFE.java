package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.facade.UnreadCountFacade$setLastReadMessageSequence$1;
import com.okinc.okimcore.facade.UnreadCountFacade$setUnreadCount$1;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C44486sRp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sFE {
    public static final sFE OLrzqt = new sFE();

    private sFE() {
    }

    public static final class Application {
        public final InHouseIMConversationEntity KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, InHouseIMConversationEntity inHouseIMConversationEntity, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                inHouseIMConversationEntity = application.KWHzl;
            }
            if ((i3 & 2) != 0) {
                i = application.OLrzqt;
            }
            if ((i3 & 4) != 0) {
                i2 = application.copydefault;
            }
            return application.KWHzl(inHouseIMConversationEntity, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity, int i, int i2) {
            Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
            return new Application(inHouseIMConversationEntity, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InHouseIMConversationEntity copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.OLrzqt == application.OLrzqt && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SetUnreadCountResult(updatedConversation=" + this.KWHzl + ", totalUnreadCount=" + this.OLrzqt + ", totalOfMentionCount=" + this.copydefault + ")";
        }

        public Application(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity, int i, int i2) {
            Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
            this.KWHzl = inHouseIMConversationEntity;
            this.OLrzqt = i;
            this.copydefault = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C44486sRp c44486sRp, @NotNull java.lang.String str, long j, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        UnreadCountFacade$setLastReadMessageSequence$1 unreadCountFacade$setLastReadMessageSequence$1;
        if (continuation instanceof UnreadCountFacade$setLastReadMessageSequence$1) {
            unreadCountFacade$setLastReadMessageSequence$1 = (UnreadCountFacade$setLastReadMessageSequence$1) continuation;
            int i = unreadCountFacade$setLastReadMessageSequence$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unreadCountFacade$setLastReadMessageSequence$1.label = i - Integer.MIN_VALUE;
            } else {
                unreadCountFacade$setLastReadMessageSequence$1 = new UnreadCountFacade$setLastReadMessageSequence$1(this, continuation);
            }
        }
        java.lang.Object obj = unreadCountFacade$setLastReadMessageSequence$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unreadCountFacade$setLastReadMessageSequence$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C44124sEe.imLogSync$default("set unread count => lastReadMessageSequence=" + j, null, str, 2, null);
                unreadCountFacade$setLastReadMessageSequence$1.L$0 = str;
                unreadCountFacade$setLastReadMessageSequence$1.J$0 = j;
                unreadCountFacade$setLastReadMessageSequence$1.label = 1;
                if (c44486sRp.AYXKKw(str, j, unreadCountFacade$setLastReadMessageSequence$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = unreadCountFacade$setLastReadMessageSequence$1.J$0;
                str = (java.lang.String) unreadCountFacade$setLastReadMessageSequence$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            throw new java.lang.Exception("conversation[" + str + "]:setLastReadMessageSequence lastReadMessageSequence=" + j, th);
        }
    }

    public final InHouseIMConversationEntity OLrzqt(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity, @NotNull C44486sRp.StateListAnimator stateListAnimator) {
        java.lang.String lastUserMessageId;
        long lastUserMessageSendTime;
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        int iAEQbTJ = stateListAnimator.AEQbTJ();
        InHouseIMMessageEntity inHouseIMMessageEntityCopydefault = stateListAnimator.copydefault();
        if (inHouseIMMessageEntityCopydefault == null || (lastUserMessageId = inHouseIMMessageEntityCopydefault.getMessageId()) == null) {
            lastUserMessageId = inHouseIMConversationEntity.getLastUserMessageId();
        }
        java.lang.String str = lastUserMessageId;
        if (inHouseIMMessageEntityCopydefault != null) {
            lastUserMessageSendTime = inHouseIMMessageEntityCopydefault.getSendTime();
        } else {
            lastUserMessageSendTime = inHouseIMConversationEntity.getLastUserMessageSendTime();
        }
        return inHouseIMConversationEntity.copy((536769023 & 1) != 0 ? inHouseIMConversationEntity.channelId : null, (536769023 & 2) != 0 ? inHouseIMConversationEntity.channelType : null, (536769023 & 4) != 0 ? inHouseIMConversationEntity.groupAtType : 0, (536769023 & 8) != 0 ? inHouseIMConversationEntity.inGroupStatus : null, (536769023 & 16) != 0 ? inHouseIMConversationEntity.groupStatus : null, (536769023 & 32) != 0 ? inHouseIMConversationEntity.pinnedStatus : 0, (536769023 & 64) != 0 ? inHouseIMConversationEntity.isFlagged : 0, (536769023 & 128) != 0 ? inHouseIMConversationEntity.muteStatus : null, (536769023 & 256) != 0 ? inHouseIMConversationEntity.role : 0, (536769023 & 512) != 0 ? inHouseIMConversationEntity.unreadCount : iAEQbTJ, (536769023 & 1024) != 0 ? inHouseIMConversationEntity.unreadMentionedCount : stateListAnimator.OLrzqt(), (536769023 & 2048) != 0 ? inHouseIMConversationEntity.unreadMentionedType : stateListAnimator.EZpvd(), (536769023 & 4096) != 0 ? inHouseIMConversationEntity.startMsgSeq : null, (536769023 & 8192) != 0 ? inHouseIMConversationEntity.lastReadMsgSeq : null, (536769023 & 16384) != 0 ? inHouseIMConversationEntity.extra : null, (536769023 & 32768) != 0 ? inHouseIMConversationEntity.lastUserMessageId : str, (536769023 & 65536) != 0 ? inHouseIMConversationEntity.lastUserMessageSendTime : lastUserMessageSendTime, (536769023 & 131072) != 0 ? inHouseIMConversationEntity.draftMessage : null, (262144 & 536769023) != 0 ? inHouseIMConversationEntity.updateTime : null, (536769023 & 524288) != 0 ? inHouseIMConversationEntity.conversationStatus : null, (536769023 & 1048576) != 0 ? inHouseIMConversationEntity.relatedId : null, (536769023 & 2097152) != 0 ? inHouseIMConversationEntity.avatar : null, (536769023 & 4194304) != 0 ? inHouseIMConversationEntity.nickname : null, (536769023 & 8388608) != 0 ? inHouseIMConversationEntity.enNickname : null, (536769023 & 16777216) != 0 ? inHouseIMConversationEntity.bizGroupName : null, (536769023 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMConversationEntity.tags : null, (536769023 & 67108864) != 0 ? inHouseIMConversationEntity.groupType : null, (536769023 & 134217728) != 0 ? inHouseIMConversationEntity.conversationIcons : null, (536769023 & 268435456) != 0 ? inHouseIMConversationEntity.entityInfoExtra : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C44484sRn c44484sRn, @NotNull C44486sRp c44486sRp, @NotNull InHouseIMConversationEntity inHouseIMConversationEntity, long j, @NotNull Continuation<? super Application> continuation) throws java.lang.Exception {
        UnreadCountFacade$setUnreadCount$1 unreadCountFacade$setUnreadCount$1;
        C44486sRp c44486sRp2;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        java.lang.String str;
        java.lang.String str2;
        long j2;
        C44484sRn c44484sRn2;
        sFE sfe;
        java.lang.Object objAhwBna;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        long j3;
        long j4;
        kotlin.Pair pairOLrzqt;
        int iAEQbTJ;
        java.lang.String messageId;
        int iOLrzqt;
        InHouseIMConversationEntity inHouseIMConversationEntityOLrzqt;
        kotlin.Pair pair;
        InHouseIMConversationEntity inHouseIMConversationEntity4;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        long j5;
        if (continuation instanceof UnreadCountFacade$setUnreadCount$1) {
            unreadCountFacade$setUnreadCount$1 = (UnreadCountFacade$setUnreadCount$1) continuation;
            int i2 = unreadCountFacade$setUnreadCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unreadCountFacade$setUnreadCount$1.label = i2 - Integer.MIN_VALUE;
            } else {
                unreadCountFacade$setUnreadCount$1 = new UnreadCountFacade$setUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object obj = unreadCountFacade$setUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = unreadCountFacade$setUnreadCount$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strEZpvd = C44157sFk.EZpvd();
            pUU.EZpvd("UnreadCountFacade", "uuid for setUnreadCount is " + strEZpvd);
            java.lang.String channelId = inHouseIMConversationEntity.getChannelId();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            sFE sfe2 = OLrzqt;
            unreadCountFacade$setUnreadCount$1.L$0 = this;
            unreadCountFacade$setUnreadCount$1.L$1 = c44484sRn;
            unreadCountFacade$setUnreadCount$1.L$2 = c44486sRp;
            unreadCountFacade$setUnreadCount$1.L$3 = inHouseIMConversationEntity;
            unreadCountFacade$setUnreadCount$1.L$4 = strEZpvd;
            unreadCountFacade$setUnreadCount$1.L$5 = channelId;
            unreadCountFacade$setUnreadCount$1.J$0 = jCurrentTimeMillis;
            unreadCountFacade$setUnreadCount$1.label = 1;
            if (sfe2.EZpvd(c44486sRp, channelId, j, unreadCountFacade$setUnreadCount$1) == objCopydefault) {
                return objCopydefault;
            }
            c44486sRp2 = c44486sRp;
            inHouseIMConversationEntity2 = inHouseIMConversationEntity;
            str = strEZpvd;
            str2 = channelId;
            j2 = jCurrentTimeMillis;
            c44484sRn2 = c44484sRn;
            sfe = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = unreadCountFacade$setUnreadCount$1.J$1;
                    i = unreadCountFacade$setUnreadCount$1.I$1;
                    iAEQbTJ = unreadCountFacade$setUnreadCount$1.I$0;
                    j3 = unreadCountFacade$setUnreadCount$1.J$0;
                    inHouseIMConversationEntity4 = (InHouseIMConversationEntity) unreadCountFacade$setUnreadCount$1.L$3;
                    str4 = (java.lang.String) unreadCountFacade$setUnreadCount$1.L$2;
                    pair = (kotlin.Pair) unreadCountFacade$setUnreadCount$1.L$1;
                    str3 = (java.lang.String) unreadCountFacade$setUnreadCount$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                        C44124sEe.logSyncAnalysis$default("sync conversations => Set unread count - setMessageReadTime:" + j3 + ", insertUnreadCountTime :" + (jCurrentTimeMillis2 - j5) + ", getTotalUnreadCountStartTime:" + pair.getSecond() + ", lastMessageId :" + str4 + ", totalUnreadCount=" + iAEQbTJ + ", totalOfMentionCount=" + i + ", ", null, str3, 2, null);
                        return new Application(inHouseIMConversationEntity4, iAEQbTJ, i);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        iOLrzqt = i;
                        messageId = str4;
                        str2 = str3;
                        throw new java.lang.Exception("conversation[" + str2 + "]:set unread count => cannot update conversation [4] with unreadCount=" + iAEQbTJ + ", lastMessageId=" + messageId + ", mentionCount=" + iOLrzqt, th);
                    }
                }
                j4 = unreadCountFacade$setUnreadCount$1.J$1;
                long j6 = unreadCountFacade$setUnreadCount$1.J$0;
                java.lang.String str5 = (java.lang.String) unreadCountFacade$setUnreadCount$1.L$3;
                InHouseIMConversationEntity inHouseIMConversationEntity5 = (InHouseIMConversationEntity) unreadCountFacade$setUnreadCount$1.L$2;
                c44484sRn2 = (C44484sRn) unreadCountFacade$setUnreadCount$1.L$1;
                sfe = (sFE) unreadCountFacade$setUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(obj);
                inHouseIMConversationEntity3 = inHouseIMConversationEntity5;
                objAhwBna = obj;
                str2 = str5;
                j3 = j6;
                pairOLrzqt = C56390yDp.OLrzqt((C44486sRp.StateListAnimator) objAhwBna, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j4));
                C44486sRp.StateListAnimator stateListAnimator = (C44486sRp.StateListAnimator) pairOLrzqt.getFirst();
                iAEQbTJ = stateListAnimator.AEQbTJ();
                InHouseIMMessageEntity inHouseIMMessageEntityCopydefault = stateListAnimator.copydefault();
                messageId = inHouseIMMessageEntityCopydefault == null ? inHouseIMMessageEntityCopydefault.getMessageId() : null;
                iOLrzqt = stateListAnimator.OLrzqt();
                try {
                    inHouseIMConversationEntityOLrzqt = sfe.OLrzqt(inHouseIMConversationEntity3, stateListAnimator);
                    long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
                    unreadCountFacade$setUnreadCount$1.L$0 = str2;
                    unreadCountFacade$setUnreadCount$1.L$1 = pairOLrzqt;
                    unreadCountFacade$setUnreadCount$1.L$2 = messageId;
                    unreadCountFacade$setUnreadCount$1.L$3 = inHouseIMConversationEntityOLrzqt;
                    unreadCountFacade$setUnreadCount$1.J$0 = j3;
                    unreadCountFacade$setUnreadCount$1.I$0 = iAEQbTJ;
                    unreadCountFacade$setUnreadCount$1.I$1 = iOLrzqt;
                    unreadCountFacade$setUnreadCount$1.J$1 = jCurrentTimeMillis3;
                    unreadCountFacade$setUnreadCount$1.label = 3;
                    if (c44484sRn2.EZpvd(inHouseIMConversationEntityOLrzqt, unreadCountFacade$setUnreadCount$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    pair = pairOLrzqt;
                    inHouseIMConversationEntity4 = inHouseIMConversationEntityOLrzqt;
                    str3 = str2;
                    str4 = messageId;
                    i = iOLrzqt;
                    j5 = jCurrentTimeMillis3;
                    long jCurrentTimeMillis22 = java.lang.System.currentTimeMillis();
                    C44124sEe.logSyncAnalysis$default("sync conversations => Set unread count - setMessageReadTime:" + j3 + ", insertUnreadCountTime :" + (jCurrentTimeMillis22 - j5) + ", getTotalUnreadCountStartTime:" + pair.getSecond() + ", lastMessageId :" + str4 + ", totalUnreadCount=" + iAEQbTJ + ", totalOfMentionCount=" + i + ", ", null, str3, 2, null);
                    return new Application(inHouseIMConversationEntity4, iAEQbTJ, i);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    throw new java.lang.Exception("conversation[" + str2 + "]:set unread count => cannot update conversation [4] with unreadCount=" + iAEQbTJ + ", lastMessageId=" + messageId + ", mentionCount=" + iOLrzqt, th);
                }
            }
            j2 = unreadCountFacade$setUnreadCount$1.J$0;
            str2 = (java.lang.String) unreadCountFacade$setUnreadCount$1.L$5;
            str = (java.lang.String) unreadCountFacade$setUnreadCount$1.L$4;
            inHouseIMConversationEntity2 = (InHouseIMConversationEntity) unreadCountFacade$setUnreadCount$1.L$3;
            c44486sRp2 = (C44486sRp) unreadCountFacade$setUnreadCount$1.L$2;
            c44484sRn2 = (C44484sRn) unreadCountFacade$setUnreadCount$1.L$1;
            sfe = (sFE) unreadCountFacade$setUnreadCount$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        long jCurrentTimeMillis4 = java.lang.System.currentTimeMillis() - j2;
        long jCurrentTimeMillis5 = java.lang.System.currentTimeMillis();
        unreadCountFacade$setUnreadCount$1.L$0 = sfe;
        unreadCountFacade$setUnreadCount$1.L$1 = c44484sRn2;
        unreadCountFacade$setUnreadCount$1.L$2 = inHouseIMConversationEntity2;
        unreadCountFacade$setUnreadCount$1.L$3 = str2;
        unreadCountFacade$setUnreadCount$1.L$4 = null;
        unreadCountFacade$setUnreadCount$1.L$5 = null;
        unreadCountFacade$setUnreadCount$1.J$0 = jCurrentTimeMillis4;
        unreadCountFacade$setUnreadCount$1.J$1 = jCurrentTimeMillis5;
        unreadCountFacade$setUnreadCount$1.label = 2;
        objAhwBna = c44486sRp2.AhwBna(str2, str, unreadCountFacade$setUnreadCount$1);
        if (objAhwBna == objCopydefault) {
            return objCopydefault;
        }
        inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
        j3 = jCurrentTimeMillis4;
        j4 = jCurrentTimeMillis5;
        pairOLrzqt = C56390yDp.OLrzqt((C44486sRp.StateListAnimator) objAhwBna, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j4));
        C44486sRp.StateListAnimator stateListAnimator2 = (C44486sRp.StateListAnimator) pairOLrzqt.getFirst();
        iAEQbTJ = stateListAnimator2.AEQbTJ();
        InHouseIMMessageEntity inHouseIMMessageEntityCopydefault2 = stateListAnimator2.copydefault();
        if (inHouseIMMessageEntityCopydefault2 == null) {
        }
        iOLrzqt = stateListAnimator2.OLrzqt();
        inHouseIMConversationEntityOLrzqt = sfe.OLrzqt(inHouseIMConversationEntity3, stateListAnimator2);
        long jCurrentTimeMillis32 = java.lang.System.currentTimeMillis();
        unreadCountFacade$setUnreadCount$1.L$0 = str2;
        unreadCountFacade$setUnreadCount$1.L$1 = pairOLrzqt;
        unreadCountFacade$setUnreadCount$1.L$2 = messageId;
        unreadCountFacade$setUnreadCount$1.L$3 = inHouseIMConversationEntityOLrzqt;
        unreadCountFacade$setUnreadCount$1.J$0 = j3;
        unreadCountFacade$setUnreadCount$1.I$0 = iAEQbTJ;
        unreadCountFacade$setUnreadCount$1.I$1 = iOLrzqt;
        unreadCountFacade$setUnreadCount$1.J$1 = jCurrentTimeMillis32;
        unreadCountFacade$setUnreadCount$1.label = 3;
        if (c44484sRn2.EZpvd(inHouseIMConversationEntityOLrzqt, unreadCountFacade$setUnreadCount$1) != objCopydefault) {
        }
    }
}
