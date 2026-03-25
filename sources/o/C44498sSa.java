package o;

import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendAck;
import com.okinc.okimcore.model.remote.UpdateConversationReq;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import com.okinc.okimcore.usecase.ConversationUseCase$clearConversationUnreadCount$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.sFE;
import o.sGI;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.sSa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44498sSa {
    public final C44486sRp EZpvd;
    public final sGI KWHzl;
    public final C44484sRn OLrzqt;
    public final C44489sRs copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ(@NotNull InHouseIMServerConversationEntity inHouseIMServerConversationEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMServerConversationEntity, "");
        return true;
    }

    @yCM
    public C44498sSa(@NotNull C44484sRn c44484sRn, @NotNull C44486sRp c44486sRp, @NotNull sGI sgi, @NotNull C44489sRs c44489sRs) {
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        Intrinsics.checkNotNullParameter(sgi, "");
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        this.OLrzqt = c44484sRn;
        this.EZpvd = c44486sRp;
        this.KWHzl = sgi;
        this.copydefault = c44489sRs;
    }

    /* JADX INFO: renamed from: o.sSa$Activity */
    public static final class Activity {
        public final InHouseIMConversationEntity AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, InHouseIMConversationEntity inHouseIMConversationEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                inHouseIMConversationEntity = activity.AEQbTJ;
            }
            return activity.EZpvd(inHouseIMConversationEntity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity) {
            Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
            return new Activity(inHouseIMConversationEntity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InHouseIMConversationEntity copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ClearUnreadCountResult(conversation=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity) {
            Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
            this.AEQbTJ = inHouseIMConversationEntity;
        }
    }

    /* JADX INFO: renamed from: o.sSa$StateListAnimator */
    public static final class StateListAnimator {
        public final WSSendAck copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, WSSendAck wSSendAck, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                wSSendAck = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(wSSendAck);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull WSSendAck wSSendAck) {
            Intrinsics.checkNotNullParameter(wSSendAck, "");
            return new StateListAnimator(wSSendAck);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SendReadReceiptResult(ack=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull WSSendAck wSSendAck) {
            Intrinsics.checkNotNullParameter(wSSendAck, "");
            this.copydefault = wSSendAck;
        }
    }

    /* JADX INFO: renamed from: o.sSa$Application */
    public static final class Application {
        public final StateListAnimator AEQbTJ;
        public final Activity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, Activity activity, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activity = application.copydefault;
            }
            if ((i & 2) != 0) {
                stateListAnimator = application.AEQbTJ;
            }
            return application.copydefault(activity, stateListAnimator);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(Activity activity, StateListAnimator stateListAnimator) {
            return new Application(activity, stateListAnimator);
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
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Activity activity = this.copydefault;
            int iHashCode = activity == null ? 0 : activity.hashCode();
            StateListAnimator stateListAnimator = this.AEQbTJ;
            return (iHashCode * 31) + (stateListAnimator != null ? stateListAnimator.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ClearConversationUnreadCountResult(clearUnreadCountResult=" + this.copydefault + ", sendReadReceiptResult=" + this.AEQbTJ + ")";
        }

        public Application(Activity activity, StateListAnimator stateListAnimator) {
            this.copydefault = activity;
            this.AEQbTJ = stateListAnimator;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [33=5] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0234 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x033e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03cf A[Catch: all -> 0x03db, TryCatch #2 {all -> 0x03db, blocks: (B:89:0x03c4, B:91:0x03cf, B:93:0x03d6), top: B:121:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03d5  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Application> continuation) throws java.lang.Exception {
        ConversationUseCase$clearConversationUnreadCount$1 conversationUseCase$clearConversationUnreadCount$1;
        java.lang.String strCopydefault;
        java.lang.Object objEZpvd;
        C44498sSa c44498sSa;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        java.lang.String str2;
        C44498sSa c44498sSa2;
        OKConversationType oKConversationType;
        java.lang.String str3;
        long jLongValue;
        java.lang.Object objOLrzqt;
        C44498sSa c44498sSa3;
        java.lang.String str4;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        int i;
        java.lang.String str5;
        java.lang.Object objAEQbTJ;
        OKConversationType oKConversationType2;
        int i2;
        C44498sSa c44498sSa4;
        int i3;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        long j;
        java.lang.String str6;
        java.lang.Long l;
        boolean z;
        java.lang.Object obj;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Long l2;
        OKConversationType oKConversationType3;
        long j2;
        C44498sSa c44498sSa5;
        Activity activity;
        java.lang.String str9;
        int i4;
        java.lang.Long l3;
        C44498sSa c44498sSa6;
        long j3;
        sGI sgi;
        UpdateConversationReq updateConversationReq;
        java.lang.Long l4;
        sFE.Application application;
        long j4;
        int i5;
        OKConversationType oKConversationType4;
        java.lang.String str10;
        ?? r1;
        java.lang.String str11;
        long j5;
        java.lang.String str12;
        StateListAnimator stateListAnimator;
        long j6;
        java.lang.String str13;
        C44498sSa c44498sSa7;
        java.lang.String str14;
        Activity activity2;
        C44489sRs c44489sRs;
        java.lang.String str15;
        long j7;
        OKConversationType oKConversationType5;
        C44498sSa c44498sSa8;
        java.lang.Object objKWHzl;
        java.lang.Object objM7377constructorimpl;
        Activity activity3;
        java.lang.Object obj2;
        java.lang.String str16 = str;
        if (continuation instanceof ConversationUseCase$clearConversationUnreadCount$1) {
            conversationUseCase$clearConversationUnreadCount$1 = (ConversationUseCase$clearConversationUnreadCount$1) continuation;
            int i6 = conversationUseCase$clearConversationUnreadCount$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                conversationUseCase$clearConversationUnreadCount$1.label = i6 - Integer.MIN_VALUE;
            } else {
                conversationUseCase$clearConversationUnreadCount$1 = new ConversationUseCase$clearConversationUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = conversationUseCase$clearConversationUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (conversationUseCase$clearConversationUnreadCount$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objValueOf);
                strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
                C44484sRn c44484sRn = this.OLrzqt;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = this;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str16;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = strCopydefault;
                conversationUseCase$clearConversationUnreadCount$1.label = 1;
                objEZpvd = c44484sRn.EZpvd(str16, conversationUseCase$clearConversationUnreadCount$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c44498sSa = this;
                inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
                if (inHouseIMConversationEntity != null) {
                    throw new java.lang.IllegalArgumentException(("conversation[" + str16 + "] is null").toString());
                }
                OKConversationType conversationType = C44169sFw.OLrzqt(inHouseIMConversationEntity).getConversationType();
                C44124sEe.imLogSync$default("clear conversation unread count => conversationType=" + conversationType, null, str16, 2, null);
                C44486sRp c44486sRp = c44498sSa.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str16;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = strCopydefault;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = conversationType;
                conversationUseCase$clearConversationUnreadCount$1.label = 2;
                java.lang.Object objAEQbTJ2 = c44486sRp.AEQbTJ(str16, conversationUseCase$clearConversationUnreadCount$1);
                if (objAEQbTJ2 == objCopydefault) {
                    return objCopydefault;
                }
                str2 = str16;
                c44498sSa2 = c44498sSa;
                oKConversationType = conversationType;
                str3 = strCopydefault;
                objValueOf = objAEQbTJ2;
                jLongValue = ((java.lang.Number) objValueOf).longValue();
                C44486sRp c44486sRp2 = c44498sSa2.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa2;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str2;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str3;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = oKConversationType;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = jLongValue;
                conversationUseCase$clearConversationUnreadCount$1.label = 3;
                objValueOf = c44486sRp2.valueOf(str2, conversationUseCase$clearConversationUnreadCount$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
                int iIntValue = ((java.lang.Number) objValueOf).intValue();
                C44486sRp c44486sRp3 = c44498sSa2.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa2;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str2;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str3;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = oKConversationType;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = jLongValue;
                conversationUseCase$clearConversationUnreadCount$1.I$0 = iIntValue;
                conversationUseCase$clearConversationUnreadCount$1.label = 4;
                objOLrzqt = c44486sRp3.OLrzqt(str2, str3, conversationUseCase$clearConversationUnreadCount$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c44498sSa3 = c44498sSa2;
                str4 = str3;
                inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                i = iIntValue;
                objValueOf = objOLrzqt;
                str5 = str2;
                int iIntValue2 = ((java.lang.Number) objValueOf).intValue();
                C44486sRp c44486sRp4 = c44498sSa3.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa3;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str5;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str4;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity2;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = oKConversationType;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = jLongValue;
                conversationUseCase$clearConversationUnreadCount$1.I$0 = i;
                conversationUseCase$clearConversationUnreadCount$1.I$1 = iIntValue2;
                conversationUseCase$clearConversationUnreadCount$1.label = 5;
                objAEQbTJ = c44486sRp4.AEQbTJ(str5, str4, conversationUseCase$clearConversationUnreadCount$1);
                if (objAEQbTJ != objCopydefault) {
                    return objCopydefault;
                }
                C44498sSa c44498sSa9 = c44498sSa3;
                oKConversationType2 = oKConversationType;
                i2 = iIntValue2;
                objValueOf = objAEQbTJ;
                c44498sSa4 = c44498sSa9;
                java.lang.String str17 = str5;
                i3 = i;
                inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                j = jLongValue;
                str6 = str17;
                l = (java.lang.Long) objValueOf;
                java.lang.Long lastReadMsgSeq = inHouseIMConversationEntity3.getLastReadMsgSeq();
                long jLongValue2 = lastReadMsgSeq == null ? lastReadMsgSeq.longValue() : 0L;
                boolean z2 = j <= jLongValue2;
                z = oKConversationType2 != OKConversationType.GROUP;
                C44124sEe.imLogSync$default("clear conversation unread count => maxSequence=" + j + ", unreadCount=" + i2 + ", isGroupChat=" + z + ", currentUserId=" + str4 + ", conversation=" + inHouseIMConversationEntity3 + ", lastReadSeq=" + jLongValue2 + ", hasLastReadMsgSeqDiff=" + z2, null, str6, 2, null);
                if (i3 <= 0 && (i2 > 0 || z2)) {
                    sFE sfe = sFE.OLrzqt;
                    C44484sRn c44484sRn2 = c44498sSa4.OLrzqt;
                    C44486sRp c44486sRp5 = c44498sSa4.EZpvd;
                    conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa4;
                    conversationUseCase$clearConversationUnreadCount$1.L$1 = str6;
                    conversationUseCase$clearConversationUnreadCount$1.L$2 = str4;
                    conversationUseCase$clearConversationUnreadCount$1.L$3 = oKConversationType2;
                    conversationUseCase$clearConversationUnreadCount$1.L$4 = l;
                    conversationUseCase$clearConversationUnreadCount$1.J$0 = j;
                    conversationUseCase$clearConversationUnreadCount$1.I$0 = i3;
                    conversationUseCase$clearConversationUnreadCount$1.I$1 = z ? 1 : 0;
                    conversationUseCase$clearConversationUnreadCount$1.label = 6;
                    C44498sSa c44498sSa10 = c44498sSa4;
                    java.lang.String str18 = str6;
                    long j8 = j;
                    java.lang.String str19 = str4;
                    java.lang.Object objAEQbTJ3 = sfe.AEQbTJ(c44484sRn2, c44486sRp5, inHouseIMConversationEntity3, j, conversationUseCase$clearConversationUnreadCount$1);
                    obj = objCopydefault;
                    if (objAEQbTJ3 == obj) {
                        return obj;
                    }
                    str9 = str18;
                    i4 = z ? 1 : 0;
                    str8 = str19;
                    objValueOf = objAEQbTJ3;
                    l3 = l;
                    c44498sSa6 = c44498sSa10;
                    j3 = j8;
                    sFE.Application application2 = (sFE.Application) objValueOf;
                    sgi = c44498sSa6.KWHzl;
                    updateConversationReq = new UpdateConversationReq(str9, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, C56443yFo.AEQbTJ(application2.KWHzl()), (java.lang.Integer) null, C56443yFo.AEQbTJ((int) j3), (java.lang.Integer) null, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, (DefaultConstructorMarker) null);
                    conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa6;
                    conversationUseCase$clearConversationUnreadCount$1.L$1 = str9;
                    conversationUseCase$clearConversationUnreadCount$1.L$2 = str8;
                    conversationUseCase$clearConversationUnreadCount$1.L$3 = oKConversationType2;
                    conversationUseCase$clearConversationUnreadCount$1.L$4 = l3;
                    conversationUseCase$clearConversationUnreadCount$1.L$5 = application2;
                    conversationUseCase$clearConversationUnreadCount$1.J$0 = j3;
                    conversationUseCase$clearConversationUnreadCount$1.I$0 = i3;
                    conversationUseCase$clearConversationUnreadCount$1.I$1 = i4;
                    conversationUseCase$clearConversationUnreadCount$1.label = 7;
                    C44498sSa c44498sSa11 = c44498sSa6;
                    java.lang.String str20 = str9;
                    if (sGI.TaskDescription.updateConversations$default(sgi, updateConversationReq, false, conversationUseCase$clearConversationUnreadCount$1, 2, null) != obj) {
                        return obj;
                    }
                    l4 = l3;
                    application = application2;
                    j4 = j3;
                    i5 = i3;
                    oKConversationType4 = oKConversationType2;
                    str10 = str20;
                    c44498sSa5 = c44498sSa11;
                    C44124sEe.imLogSync$default("clear conversation unread count => called api to update the conversation", null, str10, 2, null);
                    C44124sEe.imLogSync$default("clear conversation unread count => cleared unread count", null, str10, 2, null);
                    activity = new Activity(application.copydefault());
                    l2 = l4;
                    r1 = i4;
                    oKConversationType3 = oKConversationType4;
                    j2 = j4;
                    str7 = str10;
                    i3 = i5;
                    if (i3 > 0) {
                    }
                    str11 = str7;
                    j5 = j2;
                    str12 = str8;
                    stateListAnimator = null;
                    if (stateListAnimator != null) {
                    }
                    return new Application(activity, stateListAnimator);
                }
                java.lang.String str21 = str4;
                obj = objCopydefault;
                str7 = str6;
                str8 = str21;
                l2 = l;
                oKConversationType3 = oKConversationType2;
                j2 = j;
                c44498sSa5 = c44498sSa4;
                activity = null;
                r1 = z;
                if (i3 > 0 || l2 == null || r1 != 0) {
                    str11 = str7;
                    j5 = j2;
                    str12 = str8;
                    stateListAnimator = null;
                    if (stateListAnimator != null) {
                        C44486sRp c44486sRp6 = c44498sSa5.EZpvd;
                        conversationUseCase$clearConversationUnreadCount$1.L$0 = activity;
                        conversationUseCase$clearConversationUnreadCount$1.L$1 = stateListAnimator;
                        conversationUseCase$clearConversationUnreadCount$1.L$2 = null;
                        conversationUseCase$clearConversationUnreadCount$1.L$3 = null;
                        conversationUseCase$clearConversationUnreadCount$1.L$4 = null;
                        conversationUseCase$clearConversationUnreadCount$1.L$5 = null;
                        conversationUseCase$clearConversationUnreadCount$1.label = 10;
                        if (c44486sRp6.EZpvd(str11, j5, str12, conversationUseCase$clearConversationUnreadCount$1) == obj) {
                            return obj;
                        }
                        activity3 = activity;
                        activity = activity3;
                    }
                    return new Application(activity, stateListAnimator);
                }
                try {
                    Result.Application application3 = Result.Companion;
                    c44489sRs = c44498sSa5.copydefault;
                    conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa5;
                    conversationUseCase$clearConversationUnreadCount$1.L$1 = str7;
                    conversationUseCase$clearConversationUnreadCount$1.L$2 = str8;
                    conversationUseCase$clearConversationUnreadCount$1.L$3 = oKConversationType3;
                    conversationUseCase$clearConversationUnreadCount$1.L$4 = activity;
                    conversationUseCase$clearConversationUnreadCount$1.L$5 = c44498sSa5;
                    conversationUseCase$clearConversationUnreadCount$1.J$0 = j2;
                    conversationUseCase$clearConversationUnreadCount$1.label = 8;
                    break;
                } catch (java.lang.Throwable th) {
                    th = th;
                    j6 = j2;
                    str13 = str8;
                    c44498sSa7 = c44498sSa5;
                    str14 = str7;
                    activity2 = activity;
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    obj2 = objM7377constructorimpl;
                    c44498sSa5 = c44498sSa7;
                    if (Result.m7383isFailureimpl(obj2)) {
                    }
                    stateListAnimator = (StateListAnimator) obj2;
                    activity = activity2;
                    java.lang.String str22 = str14;
                    str12 = str13;
                    j5 = j6;
                    str11 = str22;
                    if (stateListAnimator != null) {
                    }
                    return new Application(activity, stateListAnimator);
                }
                if (c44489sRs.KWHzl(str7, "clear conversation unread count", conversationUseCase$clearConversationUnreadCount$1) == obj) {
                    return obj;
                }
                str15 = str7;
                j7 = j2;
                oKConversationType5 = oKConversationType3;
                c44498sSa8 = c44498sSa5;
                try {
                    C44489sRs c44489sRs2 = c44498sSa8.copydefault;
                    conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa5;
                    conversationUseCase$clearConversationUnreadCount$1.L$1 = str15;
                    conversationUseCase$clearConversationUnreadCount$1.L$2 = str8;
                    conversationUseCase$clearConversationUnreadCount$1.L$3 = activity;
                    conversationUseCase$clearConversationUnreadCount$1.L$4 = null;
                    conversationUseCase$clearConversationUnreadCount$1.L$5 = null;
                    conversationUseCase$clearConversationUnreadCount$1.J$0 = j7;
                    conversationUseCase$clearConversationUnreadCount$1.label = 9;
                    objKWHzl = c44489sRs2.KWHzl(str15, oKConversationType5, j7, conversationUseCase$clearConversationUnreadCount$1);
                    break;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    j6 = j7;
                    str14 = str15;
                    activity2 = activity;
                    str13 = str8;
                    c44498sSa7 = c44498sSa5;
                    Result.Application application42 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    obj2 = objM7377constructorimpl;
                    c44498sSa5 = c44498sSa7;
                    if (Result.m7383isFailureimpl(obj2)) {
                    }
                    stateListAnimator = (StateListAnimator) obj2;
                    activity = activity2;
                    java.lang.String str222 = str14;
                    str12 = str13;
                    j5 = j6;
                    str11 = str222;
                    if (stateListAnimator != null) {
                    }
                    return new Application(activity, stateListAnimator);
                }
                if (objKWHzl != obj) {
                    return obj;
                }
                j6 = j7;
                str14 = str15;
                activity2 = activity;
                str13 = str8;
                c44498sSa7 = c44498sSa5;
                objValueOf = objKWHzl;
                try {
                    WSSendAck wSSendAck = (WSSendAck) objValueOf;
                    C44124sEe.imLogSync$default("clear conversation unread count => sent read receipt command", null, str14, 2, null);
                    objM7377constructorimpl = Result.m7377constructorimpl(wSSendAck == null ? new StateListAnimator(wSSendAck) : null);
                    break;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    Result.Application application422 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                obj2 = objM7377constructorimpl;
                c44498sSa5 = c44498sSa7;
                if (Result.m7383isFailureimpl(obj2)) {
                    obj2 = null;
                }
                stateListAnimator = (StateListAnimator) obj2;
                activity = activity2;
                java.lang.String str2222 = str14;
                str12 = str13;
                j5 = j6;
                str11 = str2222;
                if (stateListAnimator != null) {
                }
                return new Application(activity, stateListAnimator);
            case 1:
                java.lang.String str23 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                java.lang.String str24 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                c44498sSa = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                strCopydefault = str23;
                str16 = str24;
                objEZpvd = objValueOf;
                inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
                if (inHouseIMConversationEntity != null) {
                }
                break;
            case 2:
                oKConversationType = (OKConversationType) conversationUseCase$clearConversationUnreadCount$1.L$4;
                inHouseIMConversationEntity = (InHouseIMConversationEntity) conversationUseCase$clearConversationUnreadCount$1.L$3;
                java.lang.String str25 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                java.lang.String str26 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                C44498sSa c44498sSa12 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                str2 = str26;
                c44498sSa2 = c44498sSa12;
                str3 = str25;
                jLongValue = ((java.lang.Number) objValueOf).longValue();
                C44486sRp c44486sRp22 = c44498sSa2.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa2;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str2;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str3;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = oKConversationType;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = jLongValue;
                conversationUseCase$clearConversationUnreadCount$1.label = 3;
                objValueOf = c44486sRp22.valueOf(str2, conversationUseCase$clearConversationUnreadCount$1);
                if (objValueOf == objCopydefault) {
                }
                int iIntValue3 = ((java.lang.Number) objValueOf).intValue();
                C44486sRp c44486sRp32 = c44498sSa2.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa2;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str2;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str3;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = oKConversationType;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = jLongValue;
                conversationUseCase$clearConversationUnreadCount$1.I$0 = iIntValue3;
                conversationUseCase$clearConversationUnreadCount$1.label = 4;
                objOLrzqt = c44486sRp32.OLrzqt(str2, str3, conversationUseCase$clearConversationUnreadCount$1);
                if (objOLrzqt == objCopydefault) {
                }
                break;
            case 3:
                jLongValue = conversationUseCase$clearConversationUnreadCount$1.J$0;
                oKConversationType = (OKConversationType) conversationUseCase$clearConversationUnreadCount$1.L$4;
                inHouseIMConversationEntity = (InHouseIMConversationEntity) conversationUseCase$clearConversationUnreadCount$1.L$3;
                str3 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                str2 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                c44498sSa2 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                int iIntValue32 = ((java.lang.Number) objValueOf).intValue();
                C44486sRp c44486sRp322 = c44498sSa2.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa2;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str2;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str3;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = oKConversationType;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = jLongValue;
                conversationUseCase$clearConversationUnreadCount$1.I$0 = iIntValue32;
                conversationUseCase$clearConversationUnreadCount$1.label = 4;
                objOLrzqt = c44486sRp322.OLrzqt(str2, str3, conversationUseCase$clearConversationUnreadCount$1);
                if (objOLrzqt == objCopydefault) {
                }
                break;
            case 4:
                int i7 = conversationUseCase$clearConversationUnreadCount$1.I$0;
                jLongValue = conversationUseCase$clearConversationUnreadCount$1.J$0;
                OKConversationType oKConversationType6 = (OKConversationType) conversationUseCase$clearConversationUnreadCount$1.L$4;
                inHouseIMConversationEntity2 = (InHouseIMConversationEntity) conversationUseCase$clearConversationUnreadCount$1.L$3;
                java.lang.String str27 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                java.lang.String str28 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                C44498sSa c44498sSa13 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                c44498sSa3 = c44498sSa13;
                str5 = str28;
                str4 = str27;
                i = i7;
                oKConversationType = oKConversationType6;
                int iIntValue22 = ((java.lang.Number) objValueOf).intValue();
                C44486sRp c44486sRp42 = c44498sSa3.EZpvd;
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa3;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str5;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str4;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = inHouseIMConversationEntity2;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = oKConversationType;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = jLongValue;
                conversationUseCase$clearConversationUnreadCount$1.I$0 = i;
                conversationUseCase$clearConversationUnreadCount$1.I$1 = iIntValue22;
                conversationUseCase$clearConversationUnreadCount$1.label = 5;
                objAEQbTJ = c44486sRp42.AEQbTJ(str5, str4, conversationUseCase$clearConversationUnreadCount$1);
                if (objAEQbTJ != objCopydefault) {
                }
                break;
            case 5:
                i2 = conversationUseCase$clearConversationUnreadCount$1.I$1;
                int i8 = conversationUseCase$clearConversationUnreadCount$1.I$0;
                long j9 = conversationUseCase$clearConversationUnreadCount$1.J$0;
                OKConversationType oKConversationType7 = (OKConversationType) conversationUseCase$clearConversationUnreadCount$1.L$4;
                InHouseIMConversationEntity inHouseIMConversationEntity4 = (InHouseIMConversationEntity) conversationUseCase$clearConversationUnreadCount$1.L$3;
                str4 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                java.lang.String str29 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                C44498sSa c44498sSa14 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                c44498sSa4 = c44498sSa14;
                oKConversationType2 = oKConversationType7;
                i3 = i8;
                inHouseIMConversationEntity3 = inHouseIMConversationEntity4;
                j = j9;
                str6 = str29;
                l = (java.lang.Long) objValueOf;
                java.lang.Long lastReadMsgSeq2 = inHouseIMConversationEntity3.getLastReadMsgSeq();
                long jLongValue22 = lastReadMsgSeq2 == null ? lastReadMsgSeq2.longValue() : 0L;
                if (j <= jLongValue22) {
                }
                if (oKConversationType2 != OKConversationType.GROUP) {
                }
                C44124sEe.imLogSync$default("clear conversation unread count => maxSequence=" + j + ", unreadCount=" + i2 + ", isGroupChat=" + z + ", currentUserId=" + str4 + ", conversation=" + inHouseIMConversationEntity3 + ", lastReadSeq=" + jLongValue22 + ", hasLastReadMsgSeqDiff=" + z2, null, str6, 2, null);
                if (i3 <= 0) {
                }
                java.lang.String str212 = str4;
                obj = objCopydefault;
                str7 = str6;
                str8 = str212;
                l2 = l;
                oKConversationType3 = oKConversationType2;
                j2 = j;
                c44498sSa5 = c44498sSa4;
                activity = null;
                r1 = z;
                if (i3 > 0) {
                }
                str11 = str7;
                j5 = j2;
                str12 = str8;
                stateListAnimator = null;
                if (stateListAnimator != null) {
                }
                return new Application(activity, stateListAnimator);
            case 6:
                i4 = conversationUseCase$clearConversationUnreadCount$1.I$1;
                int i9 = conversationUseCase$clearConversationUnreadCount$1.I$0;
                long j10 = conversationUseCase$clearConversationUnreadCount$1.J$0;
                java.lang.Long l5 = (java.lang.Long) conversationUseCase$clearConversationUnreadCount$1.L$4;
                OKConversationType oKConversationType8 = (OKConversationType) conversationUseCase$clearConversationUnreadCount$1.L$3;
                java.lang.String str30 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                java.lang.String str31 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                C44498sSa c44498sSa15 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                l3 = l5;
                oKConversationType2 = oKConversationType8;
                str8 = str30;
                str9 = str31;
                obj = objCopydefault;
                c44498sSa6 = c44498sSa15;
                i3 = i9;
                j3 = j10;
                sFE.Application application22 = (sFE.Application) objValueOf;
                sgi = c44498sSa6.KWHzl;
                updateConversationReq = new UpdateConversationReq(str9, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, C56443yFo.AEQbTJ(application22.KWHzl()), (java.lang.Integer) null, C56443yFo.AEQbTJ((int) j3), (java.lang.Integer) null, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, (DefaultConstructorMarker) null);
                conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa6;
                conversationUseCase$clearConversationUnreadCount$1.L$1 = str9;
                conversationUseCase$clearConversationUnreadCount$1.L$2 = str8;
                conversationUseCase$clearConversationUnreadCount$1.L$3 = oKConversationType2;
                conversationUseCase$clearConversationUnreadCount$1.L$4 = l3;
                conversationUseCase$clearConversationUnreadCount$1.L$5 = application22;
                conversationUseCase$clearConversationUnreadCount$1.J$0 = j3;
                conversationUseCase$clearConversationUnreadCount$1.I$0 = i3;
                conversationUseCase$clearConversationUnreadCount$1.I$1 = i4;
                conversationUseCase$clearConversationUnreadCount$1.label = 7;
                C44498sSa c44498sSa112 = c44498sSa6;
                java.lang.String str202 = str9;
                if (sGI.TaskDescription.updateConversations$default(sgi, updateConversationReq, false, conversationUseCase$clearConversationUnreadCount$1, 2, null) != obj) {
                }
                break;
            case 7:
                i4 = conversationUseCase$clearConversationUnreadCount$1.I$1;
                i5 = conversationUseCase$clearConversationUnreadCount$1.I$0;
                j4 = conversationUseCase$clearConversationUnreadCount$1.J$0;
                application = (sFE.Application) conversationUseCase$clearConversationUnreadCount$1.L$5;
                l4 = (java.lang.Long) conversationUseCase$clearConversationUnreadCount$1.L$4;
                oKConversationType4 = (OKConversationType) conversationUseCase$clearConversationUnreadCount$1.L$3;
                java.lang.String str32 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                str10 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                c44498sSa5 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                str8 = str32;
                obj = objCopydefault;
                C44124sEe.imLogSync$default("clear conversation unread count => called api to update the conversation", null, str10, 2, null);
                C44124sEe.imLogSync$default("clear conversation unread count => cleared unread count", null, str10, 2, null);
                activity = new Activity(application.copydefault());
                l2 = l4;
                r1 = i4;
                oKConversationType3 = oKConversationType4;
                j2 = j4;
                str7 = str10;
                i3 = i5;
                if (i3 > 0) {
                }
                str11 = str7;
                j5 = j2;
                str12 = str8;
                stateListAnimator = null;
                if (stateListAnimator != null) {
                }
                return new Application(activity, stateListAnimator);
            case 8:
                j6 = conversationUseCase$clearConversationUnreadCount$1.J$0;
                c44498sSa8 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$5;
                activity2 = (Activity) conversationUseCase$clearConversationUnreadCount$1.L$4;
                OKConversationType oKConversationType9 = (OKConversationType) conversationUseCase$clearConversationUnreadCount$1.L$3;
                java.lang.String str33 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                java.lang.String str34 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                C44498sSa c44498sSa16 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objValueOf);
                    j7 = j6;
                    activity = activity2;
                    oKConversationType5 = oKConversationType9;
                    str8 = str33;
                    c44498sSa5 = c44498sSa16;
                    obj = objCopydefault;
                    str15 = str34;
                    C44489sRs c44489sRs22 = c44498sSa8.copydefault;
                    conversationUseCase$clearConversationUnreadCount$1.L$0 = c44498sSa5;
                    conversationUseCase$clearConversationUnreadCount$1.L$1 = str15;
                    conversationUseCase$clearConversationUnreadCount$1.L$2 = str8;
                    conversationUseCase$clearConversationUnreadCount$1.L$3 = activity;
                    conversationUseCase$clearConversationUnreadCount$1.L$4 = null;
                    conversationUseCase$clearConversationUnreadCount$1.L$5 = null;
                    conversationUseCase$clearConversationUnreadCount$1.J$0 = j7;
                    conversationUseCase$clearConversationUnreadCount$1.label = 9;
                    objKWHzl = c44489sRs22.KWHzl(str15, oKConversationType5, j7, conversationUseCase$clearConversationUnreadCount$1);
                    if (objKWHzl != obj) {
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str13 = str33;
                    str14 = str34;
                    c44498sSa7 = c44498sSa16;
                    obj = objCopydefault;
                    Result.Application application4222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    obj2 = objM7377constructorimpl;
                    c44498sSa5 = c44498sSa7;
                    if (Result.m7383isFailureimpl(obj2)) {
                    }
                    stateListAnimator = (StateListAnimator) obj2;
                    activity = activity2;
                    java.lang.String str22222 = str14;
                    str12 = str13;
                    j5 = j6;
                    str11 = str22222;
                    if (stateListAnimator != null) {
                    }
                    return new Application(activity, stateListAnimator);
                }
                break;
            case 9:
                j6 = conversationUseCase$clearConversationUnreadCount$1.J$0;
                activity2 = (Activity) conversationUseCase$clearConversationUnreadCount$1.L$3;
                str13 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$2;
                str14 = (java.lang.String) conversationUseCase$clearConversationUnreadCount$1.L$1;
                c44498sSa7 = (C44498sSa) conversationUseCase$clearConversationUnreadCount$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objValueOf);
                    obj = objCopydefault;
                    WSSendAck wSSendAck2 = (WSSendAck) objValueOf;
                    C44124sEe.imLogSync$default("clear conversation unread count => sent read receipt command", null, str14, 2, null);
                    objM7377constructorimpl = Result.m7377constructorimpl(wSSendAck2 == null ? new StateListAnimator(wSSendAck2) : null);
                    break;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    obj = objCopydefault;
                    Result.Application application42222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    obj2 = objM7377constructorimpl;
                    c44498sSa5 = c44498sSa7;
                    if (Result.m7383isFailureimpl(obj2)) {
                    }
                    stateListAnimator = (StateListAnimator) obj2;
                    activity = activity2;
                    java.lang.String str222222 = str14;
                    str12 = str13;
                    j5 = j6;
                    str11 = str222222;
                    if (stateListAnimator != null) {
                    }
                    return new Application(activity, stateListAnimator);
                }
                obj2 = objM7377constructorimpl;
                c44498sSa5 = c44498sSa7;
                if (Result.m7383isFailureimpl(obj2)) {
                }
                stateListAnimator = (StateListAnimator) obj2;
                activity = activity2;
                java.lang.String str2222222 = str14;
                str12 = str13;
                j5 = j6;
                str11 = str2222222;
                if (stateListAnimator != null) {
                }
                return new Application(activity, stateListAnimator);
            case 10:
                stateListAnimator = (StateListAnimator) conversationUseCase$clearConversationUnreadCount$1.L$1;
                activity3 = (Activity) conversationUseCase$clearConversationUnreadCount$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                activity = activity3;
                return new Application(activity, stateListAnimator);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
