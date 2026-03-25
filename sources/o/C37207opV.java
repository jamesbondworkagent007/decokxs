package o;

import android.os.Build;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity;
import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.im.imui.messages.audio.call.model.CallRequest;
import com.okinc.im.imui.messages.audio.call.ringing.RingtoneDownloadManager;
import com.okinc.im.imui.pushnotification.handler.PushNotificationHandler$buildVoiceCallContext$1;
import com.okinc.im.imui.pushnotification.handler.PushNotificationHandler$dispatchWSPushNotification$2;
import com.okinc.im.imui.pushnotification.handler.PushNotificationHandler$processMessageNotification$1;
import com.okinc.im.imui.pushnotification.handler.PushNotificationHandler$processVoiceCallNotification$1;
import com.okinc.im.imui.pushnotification.handler.PushNotificationHandler$processWSPushNotification$1;
import com.okinc.im.imui.pushnotification.handler.PushNotificationHandler$setUnreadCount$1;
import com.okinc.im.imui.pushnotification.model.VoiceCallNotificationData;
import com.okinc.okimcore.feature.notification.model.LaunchUrlData;
import com.okinc.okimcore.feature.notification.model.NotificationData;
import com.okinc.okimcore.feature.notification.model.NotificationSource;
import com.okinc.okimcore.feature.notification.model.NotificationType;
import com.okinc.okimcore.feature.notification.model.PayloadData;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.room.ContactEntity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import o.AbstractC37162ood;
import o.C35397nua;
import o.ServiceC37177oos;
import o.rXQ;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37207opV {
    public static CoroutineScope OLrzqt;
    public static final C37207opV copydefault = new C37207opV();
    public static final CoroutineDispatcher AEQbTJ = CoroutineDispatcher.limitedParallelism$default(sDN.copydefault.copydefault(), 1, null, 2, null);
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.opY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37207opV.OLrzqt();
        }
    });
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.opV$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NotificationSource.values().length];
            try {
                iArr[NotificationSource.PUSH_CHANNEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationSource.WS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[NotificationType.values().length];
            try {
                iArr2[NotificationType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[NotificationType.VOICE_CALL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr2;
        }
    }

    private C37207opV() {
    }

    public final java.lang.String AEQbTJ() {
        return C33070mpX.AYXKKw(sDX.StateListAnimator.copydefault);
    }

    public final java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(sDX.StateListAnimator.values);
    }

    public final CoroutineScope EZpvd() {
        CoroutineScope coroutineScope = OLrzqt;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope coroutineScopeGtdfxv = ((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).gtdfxv();
        OLrzqt = coroutineScopeGtdfxv;
        return coroutineScopeGtdfxv;
    }

    public final rXQ AYXKKw() {
        return (rXQ) EZpvd.getValue();
    }

    public static final rXQ OLrzqt() {
        return (rXQ) C43251rlk.copydefault(rXQ.class);
    }

    public final void AEQbTJ(C44363sNa c44363sNa, C44467sQx c44467sQx, @NotNull NotificationSource notificationSource) {
        Intrinsics.checkNotNullParameter(notificationSource, "");
        int i = TaskDescription.AEQbTJ[notificationSource.ordinal()];
        if (i == 1) {
            if (c44363sNa == null) {
                return;
            }
            pUU.KWHzl("PushNotificationHandler", "processNotification, source: " + notificationSource + ", pushChannelNotification: " + c44363sNa);
            EZpvd(c44363sNa.EZpvd(), c44363sNa.AEQbTJ());
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (c44467sQx == null) {
            return;
        }
        pUU.KWHzl("PushNotificationHandler", "processNotification, source: " + notificationSource + ", receiveEvent: " + c44467sQx);
        OLrzqt(c44467sQx);
    }

    public final void OLrzqt(@NotNull C44467sQx c44467sQx) {
        Intrinsics.checkNotNullParameter(c44467sQx, "");
        BuildersKt__Builders_commonKt.launch$default(EZpvd(), AEQbTJ, null, new PushNotificationHandler$processWSPushNotification$1(c44467sQx, null), 2, null);
    }

    public final java.lang.Object copydefault(boolean z, @NotNull C44364sNb c44364sNb, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new PushNotificationHandler$dispatchWSPushNotification$2(c44364sNb, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull C46952tgq c46952tgq, @NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        Intrinsics.checkNotNullParameter(notificationType, "");
        try {
            Json jsonKWHzl = C43284rmQ.KWHzl();
            java.lang.String strEZpvd = c46952tgq.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            jsonKWHzl.getSerializersModule();
            NotificationData notificationData = (NotificationData) jsonKWHzl.decodeFromString(NotificationData.Companion.serializer(), strEZpvd);
            sSY ssy = sSY.AEQbTJ;
            java.lang.String strCopydefault = c46952tgq.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            LaunchUrlData launchUrlDataOLrzqt = ssy.OLrzqt(strCopydefault);
            int i = TaskDescription.EZpvd[notificationType.ordinal()];
            if (i == 1) {
                AEQbTJ(c46952tgq, notificationData, launchUrlDataOLrzqt);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                EZpvd(c46952tgq, notificationData, launchUrlDataOLrzqt);
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault("PushNotificationHandler", "Error parsing notification data, error: " + th.getMessage() + ", type: " + notificationType + ", notification: " + c46952tgq);
            rXQ rxqAYXKKw = AYXKKw();
            java.lang.String strAEQbTJ = AEQbTJ();
            int iCurrentTimeMillis = (int) java.lang.System.currentTimeMillis();
            java.lang.String strGEmmrt = c46952tgq.gEmmrt();
            java.lang.String str = strGEmmrt == null ? "" : strGEmmrt;
            java.lang.String strOLrzqt = c46952tgq.OLrzqt();
            rXQ.Activity.showSystemNotification$default(rxqAYXKKw, "okex_im_message_v2", strAEQbTJ, iCurrentTimeMillis, null, str, strOLrzqt == null ? "" : strOLrzqt, false, null, sSY.AEQbTJ.EZpvd((OKConversation) null), true, false, 128, null);
        }
    }

    public final void AEQbTJ(C46952tgq c46952tgq, NotificationData notificationData, LaunchUrlData launchUrlData) {
        BuildersKt__Builders_commonKt.launch$default(EZpvd(), sDN.copydefault.copydefault(), null, new PushNotificationHandler$processMessageNotification$1(launchUrlData, notificationData, c46952tgq, null), 2, null);
    }

    public final void EZpvd(C46952tgq c46952tgq, NotificationData notificationData, LaunchUrlData launchUrlData) {
        sSY ssy = sSY.AEQbTJ;
        java.lang.String strKWHzl = c46952tgq.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        PayloadData payloadDataCopydefault = ssy.copydefault(strKWHzl);
        VoiceCallNotificationData voiceCallNotificationDataKWHzl = KWHzl(c46952tgq.EZpvd());
        pUU.KWHzl("PushNotificationHandler", "processVoiceCallNotification: received, conversationId=" + launchUrlData.getConversationId() + ", voiceCallData=" + voiceCallNotificationDataKWHzl);
        RingtoneDownloadManager.downloadIfNeeded$default(RingtoneDownloadManager.copydefault, RingtoneDownloadManager.RingtoneType.INCOMING, null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(EZpvd(), sDN.copydefault.copydefault(), null, new PushNotificationHandler$processVoiceCallNotification$1(c46952tgq, notificationData, launchUrlData, voiceCallNotificationDataKWHzl, payloadDataCopydefault, null), 2, null);
    }

    public final VoiceCallNotificationData KWHzl(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            Json jsonKWHzl = C43284rmQ.KWHzl();
            jsonKWHzl.getSerializersModule();
            objM7377constructorimpl = Result.m7377constructorimpl((VoiceCallNotificationData) jsonKWHzl.decodeFromString(VoiceCallNotificationData.Companion.serializer(), str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (VoiceCallNotificationData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    /* JADX INFO: renamed from: o.opV$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final int AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final boolean djBIcL;
        public final java.lang.String fetchVPNInfo;
        public final android.net.Uri gEmmrt;
        public final LaunchUrlData valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LaunchUrlData AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(int i, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, android.net.Uri uri, boolean z, @NotNull LaunchUrlData launchUrlData) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(launchUrlData, "");
            return new Application(i, str, str2, str3, str4, str5, str6, str7, uri, z, launchUrlData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.fetchVPNInfo;
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
            return this.AYXKKw == application.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) application.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, application.gEmmrt) && this.djBIcL == application.djBIcL && Intrinsics.EZpvd(this.valueOf, application.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AYXKKw);
            java.lang.String str = this.AhwBna;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.fetchVPNInfo.hashCode();
            int iHashCode4 = this.AEQbTJ.hashCode();
            java.lang.String str2 = this.copydefault;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            int iHashCode6 = this.KWHzl.hashCode();
            int iHashCode7 = this.EZpvd.hashCode();
            int iHashCode8 = this.OLrzqt.hashCode();
            android.net.Uri uri = this.gEmmrt;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (uri != null ? uri.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.valueOf.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "VoiceCallContext(notifyId=" + this.AYXKKw + ", notifyGroupId=" + this.AhwBna + ", title=" + this.fetchVPNInfo + ", content=" + this.AEQbTJ + ", avatarUrl=" + this.copydefault + ", deeplink=" + this.KWHzl + ", channelId=" + this.EZpvd + ", channelName=" + this.OLrzqt + ", soundUri=" + this.gEmmrt + ", isIncomingVoiceCall=" + this.djBIcL + ", launchUrlData=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.net.Uri valueOf() {
            return this.gEmmrt;
        }

        public Application(int i, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, android.net.Uri uri, boolean z, @NotNull LaunchUrlData launchUrlData) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(launchUrlData, "");
            this.AYXKKw = i;
            this.AhwBna = str;
            this.fetchVPNInfo = str2;
            this.AEQbTJ = str3;
            this.copydefault = str4;
            this.KWHzl = str5;
            this.EZpvd = str6;
            this.OLrzqt = str7;
            this.gEmmrt = uri;
            this.djBIcL = z;
            this.valueOf = launchUrlData;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(C46952tgq c46952tgq, NotificationData notificationData, LaunchUrlData launchUrlData, VoiceCallNotificationData voiceCallNotificationData, PayloadData payloadData, Continuation<? super Application> continuation) throws java.lang.Exception {
        PushNotificationHandler$buildVoiceCallContext$1 pushNotificationHandler$buildVoiceCallContext$1;
        C46952tgq c46952tgq2;
        NotificationData notificationData2;
        LaunchUrlData launchUrlData2;
        VoiceCallNotificationData voiceCallNotificationData2;
        PayloadData payloadData2;
        C37207opV c37207opV;
        java.lang.String strCopydefault;
        java.lang.Object objKWHzl;
        ContactEntity contactEntity;
        C37207opV c37207opV2;
        boolean z;
        LaunchUrlData launchUrlData3;
        PayloadData payloadData3;
        java.lang.String str;
        C46952tgq c46952tgq3;
        NotificationData notificationData3;
        java.lang.String strOLrzqt;
        if (continuation instanceof PushNotificationHandler$buildVoiceCallContext$1) {
            pushNotificationHandler$buildVoiceCallContext$1 = (PushNotificationHandler$buildVoiceCallContext$1) continuation;
            int i = pushNotificationHandler$buildVoiceCallContext$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pushNotificationHandler$buildVoiceCallContext$1.label = i - Integer.MIN_VALUE;
            } else {
                pushNotificationHandler$buildVoiceCallContext$1 = new PushNotificationHandler$buildVoiceCallContext$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = pushNotificationHandler$buildVoiceCallContext$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = pushNotificationHandler$buildVoiceCallContext$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            sIB sibCopydefault = sDZ.AEQbTJ.djBIcL().copydefault();
            sSY ssy = sSY.AEQbTJ;
            java.lang.String senderUid = launchUrlData.getSenderUid();
            pushNotificationHandler$buildVoiceCallContext$1.L$0 = this;
            c46952tgq2 = c46952tgq;
            pushNotificationHandler$buildVoiceCallContext$1.L$1 = c46952tgq2;
            notificationData2 = notificationData;
            pushNotificationHandler$buildVoiceCallContext$1.L$2 = notificationData2;
            launchUrlData2 = launchUrlData;
            pushNotificationHandler$buildVoiceCallContext$1.L$3 = launchUrlData2;
            voiceCallNotificationData2 = voiceCallNotificationData;
            pushNotificationHandler$buildVoiceCallContext$1.L$4 = voiceCallNotificationData2;
            payloadData2 = payloadData;
            pushNotificationHandler$buildVoiceCallContext$1.L$5 = payloadData2;
            pushNotificationHandler$buildVoiceCallContext$1.label = 1;
            objAEQbTJ = ssy.AEQbTJ(sibCopydefault, senderUid, pushNotificationHandler$buildVoiceCallContext$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c37207opV = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = pushNotificationHandler$buildVoiceCallContext$1.Z$0;
                java.lang.String str2 = (java.lang.String) pushNotificationHandler$buildVoiceCallContext$1.L$6;
                contactEntity = (ContactEntity) pushNotificationHandler$buildVoiceCallContext$1.L$5;
                payloadData3 = (PayloadData) pushNotificationHandler$buildVoiceCallContext$1.L$4;
                LaunchUrlData launchUrlData4 = (LaunchUrlData) pushNotificationHandler$buildVoiceCallContext$1.L$3;
                notificationData3 = (NotificationData) pushNotificationHandler$buildVoiceCallContext$1.L$2;
                c46952tgq3 = (C46952tgq) pushNotificationHandler$buildVoiceCallContext$1.L$1;
                c37207opV2 = (C37207opV) pushNotificationHandler$buildVoiceCallContext$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                z = z2;
                str = str2;
                launchUrlData3 = launchUrlData4;
                OKConversation oKConversation = (OKConversation) objAEQbTJ;
                sSY ssy2 = sSY.AEQbTJ;
                int iOLrzqt = ssy2.OLrzqt(launchUrlData3.getConversationId(), C33129mqd.AhwBna(notificationData3.getSeq()));
                java.lang.String strCopydefault2 = ssy2.copydefault(launchUrlData3, NotificationType.VOICE_CALL);
                strOLrzqt = c46952tgq3.OLrzqt();
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                return new Application(iOLrzqt, strCopydefault2, str, strOLrzqt, contactEntity == null ? contactEntity.getAvatar() : null, ssy2.copydefault(launchUrlData3, oKConversation), !z ? "okex_im_voice_call_v2" : "okex_im_message_v2", !z ? c37207opV2.KWHzl() : c37207opV2.AEQbTJ(), z ? c37207opV2.OLrzqt(payloadData3) : null, z, launchUrlData3);
            }
            PayloadData payloadData4 = (PayloadData) pushNotificationHandler$buildVoiceCallContext$1.L$5;
            VoiceCallNotificationData voiceCallNotificationData3 = (VoiceCallNotificationData) pushNotificationHandler$buildVoiceCallContext$1.L$4;
            LaunchUrlData launchUrlData5 = (LaunchUrlData) pushNotificationHandler$buildVoiceCallContext$1.L$3;
            NotificationData notificationData4 = (NotificationData) pushNotificationHandler$buildVoiceCallContext$1.L$2;
            C46952tgq c46952tgq4 = (C46952tgq) pushNotificationHandler$buildVoiceCallContext$1.L$1;
            C37207opV c37207opV3 = (C37207opV) pushNotificationHandler$buildVoiceCallContext$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            payloadData2 = payloadData4;
            voiceCallNotificationData2 = voiceCallNotificationData3;
            c37207opV = c37207opV3;
            launchUrlData2 = launchUrlData5;
            notificationData2 = notificationData4;
            c46952tgq2 = c46952tgq4;
        }
        ContactEntity contactEntity2 = (ContactEntity) objAEQbTJ;
        boolean zIsIncomingCall = payloadData2.isIncomingCall();
        if (voiceCallNotificationData2 == null || (strCopydefault = voiceCallNotificationData2.getCallerNickname()) == null) {
            strCopydefault = sSY.AEQbTJ.copydefault(contactEntity2, c46952tgq2, NotificationType.VOICE_CALL, null);
            sSY ssy3 = sSY.AEQbTJ;
            NotificationType notificationType = NotificationType.VOICE_CALL;
            pushNotificationHandler$buildVoiceCallContext$1.L$0 = c37207opV;
            pushNotificationHandler$buildVoiceCallContext$1.L$1 = c46952tgq2;
            pushNotificationHandler$buildVoiceCallContext$1.L$2 = notificationData2;
            pushNotificationHandler$buildVoiceCallContext$1.L$3 = launchUrlData2;
            pushNotificationHandler$buildVoiceCallContext$1.L$4 = payloadData2;
            pushNotificationHandler$buildVoiceCallContext$1.L$5 = contactEntity2;
            pushNotificationHandler$buildVoiceCallContext$1.L$6 = strCopydefault;
            pushNotificationHandler$buildVoiceCallContext$1.Z$0 = zIsIncomingCall;
            pushNotificationHandler$buildVoiceCallContext$1.label = 2;
            objKWHzl = ssy3.KWHzl(launchUrlData2, notificationType, pushNotificationHandler$buildVoiceCallContext$1);
            if (objKWHzl != objCopydefault) {
                return objCopydefault;
            }
            contactEntity = contactEntity2;
            objAEQbTJ = objKWHzl;
            c37207opV2 = c37207opV;
            z = zIsIncomingCall;
            launchUrlData3 = launchUrlData2;
            payloadData3 = payloadData2;
            str = strCopydefault;
            NotificationData notificationData5 = notificationData2;
            c46952tgq3 = c46952tgq2;
            notificationData3 = notificationData5;
        } else {
            if (strCopydefault.length() <= 0) {
                strCopydefault = null;
            }
            if (strCopydefault == null) {
            }
            sSY ssy32 = sSY.AEQbTJ;
            NotificationType notificationType2 = NotificationType.VOICE_CALL;
            pushNotificationHandler$buildVoiceCallContext$1.L$0 = c37207opV;
            pushNotificationHandler$buildVoiceCallContext$1.L$1 = c46952tgq2;
            pushNotificationHandler$buildVoiceCallContext$1.L$2 = notificationData2;
            pushNotificationHandler$buildVoiceCallContext$1.L$3 = launchUrlData2;
            pushNotificationHandler$buildVoiceCallContext$1.L$4 = payloadData2;
            pushNotificationHandler$buildVoiceCallContext$1.L$5 = contactEntity2;
            pushNotificationHandler$buildVoiceCallContext$1.L$6 = strCopydefault;
            pushNotificationHandler$buildVoiceCallContext$1.Z$0 = zIsIncomingCall;
            pushNotificationHandler$buildVoiceCallContext$1.label = 2;
            objKWHzl = ssy32.KWHzl(launchUrlData2, notificationType2, pushNotificationHandler$buildVoiceCallContext$1);
            if (objKWHzl != objCopydefault) {
            }
        }
        OKConversation oKConversation2 = (OKConversation) objAEQbTJ;
        sSY ssy22 = sSY.AEQbTJ;
        int iOLrzqt2 = ssy22.OLrzqt(launchUrlData3.getConversationId(), C33129mqd.AhwBna(notificationData3.getSeq()));
        java.lang.String strCopydefault22 = ssy22.copydefault(launchUrlData3, NotificationType.VOICE_CALL);
        strOLrzqt = c46952tgq3.OLrzqt();
        if (strOLrzqt == null) {
        }
        return new Application(iOLrzqt2, strCopydefault22, str, strOLrzqt, contactEntity == null ? contactEntity.getAvatar() : null, ssy22.copydefault(launchUrlData3, oKConversation2), !z ? "okex_im_voice_call_v2" : "okex_im_message_v2", !z ? c37207opV2.KWHzl() : c37207opV2.AEQbTJ(), z ? c37207opV2.OLrzqt(payloadData3) : null, z, launchUrlData3);
    }

    public final void copydefault(java.lang.String str, NotificationData notificationData) {
        java.util.Iterator<T> it = sSY.AEQbTJ.EZpvd(str, notificationData).iterator();
        while (it.hasNext()) {
            copydefault.AYXKKw().KWHzl(((java.lang.Number) it.next()).intValue());
        }
    }

    public final boolean AEQbTJ(boolean z) {
        android.app.Application applicationOLrzqt = C35397nua.Companion.OLrzqt();
        if (z) {
            C37119onn c37119onn = C37119onn.copydefault;
            if (c37119onn.KWHzl(applicationOLrzqt) && c37119onn.EZpvd(applicationOLrzqt) && !C32986mnt.EZpvd.valueOf()) {
                return true;
            }
        }
        return false;
    }

    public final void AEQbTJ(Application application, VoiceCallNotificationData voiceCallNotificationData) {
        java.lang.Object objM7377constructorimpl;
        boolean z = (voiceCallNotificationData != null ? voiceCallNotificationData.getConversationType() : null) == OKConversationType.GROUP;
        java.lang.String channelId = voiceCallNotificationData != null ? voiceCallNotificationData.getChannelId() : null;
        java.lang.Integer callType = voiceCallNotificationData != null ? voiceCallNotificationData.getCallType() : null;
        OKConversationType conversationType = voiceCallNotificationData != null ? voiceCallNotificationData.getConversationType() : null;
        pUU.KWHzl("PushNotificationHandler", "handleFullScreenIncomingCall: isGroupCall=[" + z + "], groupId=[" + channelId + "], callType=[" + callType + "], conversationType=[" + conversationType + "], title=[" + application.djBIcL() + "]");
        try {
            Result.Application application2 = Result.Companion;
            if (z && channelId != null && channelId.length() != 0) {
                KWHzl(channelId, application.djBIcL(), application.EZpvd());
            } else {
                KWHzl(application.AYXKKw(), application.djBIcL(), application.EZpvd());
            }
            pUU.KWHzl("PushNotificationHandler", "handleFullScreenIncomingCall: call service started, isGroupCall=" + z);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("PushNotificationHandler", "handleFullScreenIncomingCall: failed to start call service", thM7380exceptionOrNullimpl);
            copydefault.AEQbTJ(application);
        }
    }

    public final void AEQbTJ(Application application) {
        pUU.KWHzl("PushNotificationHandler", "showVoiceCallNotification: title=[" + application.djBIcL() + "], channelId=[" + application.OLrzqt() + "], notificationId=[" + application.gEmmrt() + "], isIncomingVoiceCall=[" + application.AkhnZx() + "], deeplink=[" + application.AEQbTJ() + "]");
        AYXKKw().AEQbTJ(application.OLrzqt(), application.copydefault(), application.gEmmrt(), application.AhwBna(), application.djBIcL(), application.KWHzl(), false, application.valueOf(), application.AEQbTJ(), true, application.AkhnZx());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PushNotificationHandler$setUnreadCount$1 pushNotificationHandler$setUnreadCount$1;
        android.content.Context context;
        if (continuation instanceof PushNotificationHandler$setUnreadCount$1) {
            pushNotificationHandler$setUnreadCount$1 = (PushNotificationHandler$setUnreadCount$1) continuation;
            int i = pushNotificationHandler$setUnreadCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pushNotificationHandler$setUnreadCount$1.label = i - Integer.MIN_VALUE;
            } else {
                pushNotificationHandler$setUnreadCount$1 = new PushNotificationHandler$setUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object obj = pushNotificationHandler$setUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = pushNotificationHandler$setUnreadCount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            sGB sgbOLrzqt = ((sEZ) C58113yvE.copydefault(c32979mnm.OLrzqt(), sEZ.class)).ggKfIT().OLrzqt();
            android.app.Application applicationOLrzqt = c32979mnm.OLrzqt();
            pushNotificationHandler$setUnreadCount$1.L$0 = applicationOLrzqt;
            pushNotificationHandler$setUnreadCount$1.label = 1;
            java.lang.Object objDjBIcL = sgbOLrzqt.djBIcL(pushNotificationHandler$setUnreadCount$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
            context = applicationOLrzqt;
            obj = objDjBIcL;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (android.content.Context) pushNotificationHandler$setUnreadCount$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        xVV.djBIcL(context, ((java.lang.Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final android.net.Uri OLrzqt(@NotNull PayloadData payloadData) {
        Intrinsics.checkNotNullParameter(payloadData, "");
        if (Intrinsics.EZpvd((java.lang.Object) payloadData.getSound(), (java.lang.Object) "voip_incoming_ring")) {
            return RingtoneDownloadManager.copydefault.KWHzl(RingtoneDownloadManager.RingtoneType.INCOMING);
        }
        return null;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object objM7377constructorimpl;
        pUU.KWHzl("PushNotificationHandler", "startGroupCallFromPush: groupId=[" + str + "], title=[" + str2 + "]");
        java.lang.String strEZpvd = C44157sFk.EZpvd();
        OKCallSession oKCallSession = new OKCallSession(str + "-group-" + strEZpvd + "-" + java.lang.System.currentTimeMillis(), (OKConversationType) null, str, str, (java.lang.Long) null, OKCallCommon.OKCallMediaType.AUDIO, "", strEZpvd, (java.lang.Long) null, (java.lang.String) null, OKCallCommon.OKVoiceCallType.GROUP, 274, (DefaultConstructorMarker) null);
        ServiceC37177oos.StateListAnimator stateListAnimator = ServiceC37177oos.Companion;
        C35397nua.TaskDescription taskDescription = C35397nua.Companion;
        android.content.Intent intentCopydefault = stateListAnimator.copydefault(taskDescription.OLrzqt(), new AbstractC37162ood.Application(str, oKCallSession, new AudioCallUIParams(false, false, false, str3, str2, false, false, true, 39, null), null, null, 24, null));
        if (Build.VERSION.SDK_INT >= 26) {
            taskDescription.OLrzqt().startForegroundService(intentCopydefault);
        } else {
            taskDescription.OLrzqt().startService(intentCopydefault);
        }
        try {
            Result.Application application = Result.Companion;
            android.content.Intent intentCopydefault2 = OKIMAudioCallViewActivity.Companion.copydefault(taskDescription.OLrzqt(), new CallRequest.GroupCall(str));
            intentCopydefault2.setFlags(335544320);
            intentCopydefault2.putExtra("key_audio_call_call_session_event", oKCallSession);
            intentCopydefault2.putExtra("key_audio_call_ui_params", new AudioCallUIParams(false, false, false, str3, str2, false, false, true, 7, null));
            taskDescription.OLrzqt().startActivity(intentCopydefault2);
            pUU.KWHzl("PushNotificationHandler", "startGroupCallFromPush: group call activity started successfully");
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("PushNotificationHandler", "startGroupCallFromPush: failed to start group call activity", thM7380exceptionOrNullimpl);
        }
    }

    public final void KWHzl(LaunchUrlData launchUrlData, java.lang.String str, java.lang.String str2) {
        pUU.KWHzl("PushNotificationHandler", "startOneToOneCallFromPush: conversationId=[" + launchUrlData.getConversationId() + "], senderUid=[" + launchUrlData.getSenderUid() + "], title=[" + str + "]");
        OKCallSession oKCallSessionOLrzqt = OLrzqt(launchUrlData);
        EZpvd(oKCallSessionOLrzqt, str, str2);
        AEQbTJ(launchUrlData, oKCallSessionOLrzqt, str, str2);
    }

    public final OKCallSession OLrzqt(LaunchUrlData launchUrlData) {
        java.lang.String strEZpvd = C44157sFk.EZpvd();
        return new OKCallSession(launchUrlData.getConversationId() + "-" + strEZpvd + "-" + launchUrlData.getSenderUid() + "-" + java.lang.System.currentTimeMillis(), (OKConversationType) null, launchUrlData.getConversationId(), launchUrlData.getSenderUid(), (java.lang.Long) null, OKCallCommon.OKCallMediaType.AUDIO, launchUrlData.getSenderUid(), strEZpvd, (java.lang.Long) null, launchUrlData.getSenderUid(), OKCallCommon.OKVoiceCallType.DEFAULT, 274, (DefaultConstructorMarker) null);
    }

    public final void EZpvd(OKCallSession oKCallSession, java.lang.String str, java.lang.String str2) {
        ServiceC37177oos.StateListAnimator stateListAnimator = ServiceC37177oos.Companion;
        C35397nua.TaskDescription taskDescription = C35397nua.Companion;
        android.content.Intent intentCopydefault = stateListAnimator.copydefault(taskDescription.OLrzqt(), new AbstractC37162ood.Activity("action_audio_call_call_in", null, null, oKCallSession, new AudioCallUIParams(false, false, false, str2, str, false, false, true, 39, null), null, null, 102, null));
        if (Build.VERSION.SDK_INT >= 26) {
            taskDescription.OLrzqt().startForegroundService(intentCopydefault);
        } else {
            taskDescription.OLrzqt().startService(intentCopydefault);
        }
    }

    public final void AEQbTJ(LaunchUrlData launchUrlData, OKCallSession oKCallSession, java.lang.String str, java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            OKIMAudioCallViewActivity.ActionBar actionBar = OKIMAudioCallViewActivity.Companion;
            C35397nua.TaskDescription taskDescription = C35397nua.Companion;
            android.content.Intent intentCopydefault = actionBar.copydefault(taskDescription.OLrzqt(), new CallRequest.OneToOne(launchUrlData.getConversationId(), launchUrlData.getSenderUid()));
            intentCopydefault.setFlags(335544320);
            intentCopydefault.putExtra("key_audio_call_call_session_event", oKCallSession);
            intentCopydefault.putExtra("key_audio_call_ui_params", new AudioCallUIParams(false, false, false, str2, str, false, false, true, 7, null));
            taskDescription.OLrzqt().startActivity(intentCopydefault);
            pUU.KWHzl("PushNotificationHandler", "startOneToOneCallFromPush: activity started successfully");
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("PushNotificationHandler", "startOneToOneCallFromPush: failed to start activity", thM7380exceptionOrNullimpl);
        }
    }
}
