package o;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity;
import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.im.imui.messages.audio.call.model.CallRequest;
import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSTerminateMessage;
import com.okinc.okimcore.model.im.OKCallSession;
import dagger.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC37162ood;
import o.C35399nuc;
import o.ServiceC37177oos;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37127onv {
    public static final C37127onv AEQbTJ = new C37127onv();
    public static final MutableLiveData<C32989mnw<ServiceC37177oos.Application>> EZpvd = new MutableLiveData<>();
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.onr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37127onv.EZpvd();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ons
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37127onv.copydefault();
        }
    });
    public static final ActionBar OLrzqt = new ActionBar();
    public static final int copydefault = 8;

    /* JADX INFO: renamed from: o.onv$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKCallCommon.OKCallDisconnectedReason.values().length];
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.CANCEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.BUSY_LINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_BUSY_LINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.NO_RESPONSE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_NO_RESPONSE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.ENGINE_UNSUPPORTED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.NETWORK_ERROR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_NETWORK_ERROR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.INIT_VIDEO_ERROR.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.OTHER_DEVICE_HAD_ACCEPTED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_CANCEL.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_REJECT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_ENGINE_UNSUPPORTED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.SERVICE_DISCONNECTED.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REJECTED_BY_BLACKLIST.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.SERVICE_NOT_OPENED.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.KICKED_BY_SERVER.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.TERMINATED.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<ServiceC37177oos.Application>> AEQbTJ() {
        return EZpvd;
    }

    private C37127onv() {
    }

    public final InterfaceC36577odb gEmmrt() {
        return (InterfaceC36577odb) AhwBna.getValue();
    }

    public static final InterfaceC36577odb EZpvd() {
        return (InterfaceC36577odb) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC36577odb.class);
    }

    public final Lazy<InterfaceC35259nru> djBIcL() {
        return (Lazy) KWHzl.getValue();
    }

    public static final Lazy copydefault() {
        return AEQbTJ.gEmmrt().QSLkRj();
    }

    /* JADX INFO: renamed from: o.onv$ActionBar */
    public static final class ActionBar implements InterfaceC35215nrC {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC35215nrC
        public void EZpvd(C44455sQl c44455sQl) {
            Intrinsics.checkNotNullParameter(c44455sQl, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC35215nrC
        public void KWHzl(C44455sQl c44455sQl) {
            Intrinsics.checkNotNullParameter(c44455sQl, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC35215nrC
        public void copydefault(C44455sQl c44455sQl) {
            Intrinsics.checkNotNullParameter(c44455sQl, "");
        }

        @Override // o.InterfaceC35215nrC
        public void AEQbTJ(C44455sQl c44455sQl, boolean z) {
            Intrinsics.checkNotNullParameter(c44455sQl, "");
            if (ServiceC37177oos.Companion.AEQbTJ()) {
                C44124sEe.imLogVoiceCall$default("onReceiveCallEvent: service already started, skipping to avoid duplicate", null, 2, null);
                return;
            }
            if (!C37119onn.copydefault.KWHzl(C35397nua.Companion.OLrzqt())) {
                C37127onv.AEQbTJ.copydefault(c44455sQl, z);
            } else {
                C44124sEe.imLogVoiceCall$default("onReceiveCallEvent: launching full-screen intent activity", null, 2, null);
                C37127onv.AEQbTJ.AEQbTJ(c44455sQl, z);
            }
        }
    }

    public final void AYXKKw() {
        AhwBna().AEQbTJ(OLrzqt);
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.onu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37127onv.OLrzqt(str);
            }
        });
    }

    public static final void OLrzqt(java.lang.String str) {
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 80, 0, C55298xhM.dp2px$default(176.0f, null, 1, null), 11, (java.lang.Object) null);
    }

    public final java.lang.String EZpvd(@NotNull OKCallSTerminateMessage oKCallSTerminateMessage) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(oKCallSTerminateMessage, "");
        OKCallCommon.OKCallDisconnectedReason reason = oKCallSTerminateMessage.getReason();
        if (reason == OKCallCommon.OKCallDisconnectedReason.HANGUP || reason == OKCallCommon.OKCallDisconnectedReason.REMOTE_HANGUP) {
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) oKCallSTerminateMessage.getChildExtra())) {
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.iflRwn);
            }
            int i = C35399nuc.LoaderManager.svUkWZ;
            java.lang.String extra = oKCallSTerminateMessage.getExtra();
            return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("okim_audio_call_message_list_time", extra != null ? extra : "")));
        }
        java.lang.Integer numEZpvd = EZpvd(reason);
        return (numEZpvd == null || (strAYXKKw = C33070mpX.AYXKKw(numEZpvd.intValue())) == null) ? "" : strAYXKKw;
    }

    public final java.lang.String OLrzqt(@NotNull OKAudioCallRecordMessage oKAudioCallRecordMessage) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(oKAudioCallRecordMessage, "");
        OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReasonAEQbTJ = AhwBna().AEQbTJ(oKAudioCallRecordMessage);
        if (oKCallDisconnectedReasonAEQbTJ == OKCallCommon.OKCallDisconnectedReason.HANGUP || oKCallDisconnectedReasonAEQbTJ == OKCallCommon.OKCallDisconnectedReason.REMOTE_HANGUP) {
            java.lang.String strKWHzl = KWHzl(oKAudioCallRecordMessage.getDuration());
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.iflRwn);
            }
            return C33069mpW.copydefault(C35399nuc.LoaderManager.svUkWZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("okim_audio_call_message_list_time", strKWHzl)));
        }
        java.lang.Integer numEZpvd = EZpvd(oKCallDisconnectedReasonAEQbTJ);
        return (numEZpvd == null || (strAYXKKw = C33070mpX.AYXKKw(numEZpvd.intValue())) == null) ? "" : strAYXKKw;
    }

    public final InterfaceC54816xWj valueOf() {
        return C37094onO.copydefault;
    }

    public final void KWHzl(@NotNull C32989mnw<ServiceC37177oos.Application> c32989mnw) {
        Intrinsics.checkNotNullParameter(c32989mnw, "");
        EZpvd.setValue(c32989mnw);
    }

    public final InterfaceC35259nru AhwBna() {
        InterfaceC35259nru interfaceC35259nru = djBIcL().get();
        Intrinsics.checkNotNullExpressionValue(interfaceC35259nru, "");
        return interfaceC35259nru;
    }

    public final java.lang.Integer EZpvd(OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        switch (oKCallDisconnectedReason == null ? -1 : StateListAnimator.KWHzl[oKCallDisconnectedReason.ordinal()]) {
            case 1:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.aHXSQp);
            case 2:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.akftKQ);
            case 3:
            case 4:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.fLIjIY);
            case 5:
            case 6:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.fsSxsn);
            case 7:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.DKr);
            case 8:
            case 9:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.dvImUD);
            case 10:
            case 11:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.isAvailable);
            case 12:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.dLBcXg);
            case 13:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.sVXHln);
            case 14:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.UimiPOhkCVbT);
            case 15:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.gxJrGF);
            case 16:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.zYHWMc);
            case 17:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.sGvRiA);
            case 18:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.alsFma);
            case 19:
                return java.lang.Integer.valueOf(C35399nuc.LoaderManager.QDqgQU);
            default:
                return null;
        }
    }

    public final java.lang.String KWHzl(long j) {
        if (j <= 0) {
            return "";
        }
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 > 0) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "%d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        C56529yIt c56529yIt2 = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format(java.util.Locale.getDefault(), "%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j5)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final void copydefault(C44455sQl c44455sQl, boolean z) {
        java.lang.Object objM7377constructorimpl;
        android.app.Application applicationOLrzqt = C35397nua.Companion.OLrzqt();
        android.content.Intent intentCopydefault = ServiceC37177oos.Companion.copydefault(applicationOLrzqt, new AbstractC37162ood.Activity("action_audio_call_call_in", null, null, c44455sQl.AEQbTJ(), new AudioCallUIParams(false, false, false, null, null, false, z, false, 191, null), null, null, 102, null));
        try {
            Result.Application application = Result.Companion;
            ContextCompat.startForegroundService(applicationOLrzqt, intentCopydefault);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.fIwbmz("onReceiveCallEvent: failed to start service", thM7380exceptionOrNullimpl);
        }
    }

    public final void AEQbTJ(C44455sQl c44455sQl, boolean z) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        android.content.Context contextOLrzqt = C35397nua.Companion.OLrzqt();
        OKCallSession oKCallSessionAEQbTJ = c44455sQl.AEQbTJ();
        C44124sEe.imLogVoiceCall$default("launchFullScreenIntentActivity: conversationId[" + oKCallSessionAEQbTJ.getTargetId() + "] remoteUserId[" + oKCallSessionAEQbTJ.getContactId() + "]", null, 2, null);
        AudioCallUIParams audioCallUIParams = new AudioCallUIParams(false, false, false, null, null, false, z, true, 63, null);
        android.content.Intent intentCopydefault = ServiceC37177oos.Companion.copydefault(contextOLrzqt, new AbstractC37162ood.Activity("action_audio_call_call_in", null, null, oKCallSessionAEQbTJ, audioCallUIParams, null, null, 102, null));
        try {
            Result.Application application = Result.Companion;
            ContextCompat.startForegroundService(contextOLrzqt, intentCopydefault);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.fIwbmz("launchFullScreenIntentActivity: failed to start service", thM7380exceptionOrNullimpl);
        }
        try {
            Result.Application application3 = Result.Companion;
            android.content.Intent intentCopydefault2 = OKIMAudioCallViewActivity.Companion.copydefault(contextOLrzqt, new CallRequest.OneToOne(oKCallSessionAEQbTJ.getTargetId(), oKCallSessionAEQbTJ.getContactId()));
            intentCopydefault2.setFlags(335544320);
            intentCopydefault2.putExtra("key_audio_call_call_session_event", oKCallSessionAEQbTJ);
            intentCopydefault2.putExtra("key_audio_call_ui_params", audioCallUIParams);
            contextOLrzqt.startActivity(intentCopydefault2);
            C44124sEe.imLogVoiceCall$default("launchFullScreenIntentActivity: activity started successfully", null, 2, null);
            objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            C44124sEe.fIwbmz("launchFullScreenIntentActivity: failed to start activity", thM7380exceptionOrNullimpl2);
        }
    }
}
