package o;

import android.os.Build;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.managerV2.AudioRecordManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC36502ocF;
import o.AbstractC36510ocN;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.okS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36939okS extends AbstractC36933okM {
    public nKH gEmmrt;
    public final int valueOf = C35399nuc.Dialog.DGUQLI;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    /* JADX INFO: renamed from: o.okS$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.okS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl();
        view.post(new java.lang.Runnable() { // from class: o.okT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36939okS.AEQbTJ(this.AEQbTJ);
            }
        });
        pUU.KWHzl("VoiceBoardFragment", "VoiceBoardFragment view initialized");
    }

    public static final void AEQbTJ(C36939okS c36939okS) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36939okS, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.gEmmrt = nKH.OLrzqt(layoutInflater, viewGroup, false);
        pUU.KWHzl("VoiceBoardFragment", "View created");
        nKH nkh = this.gEmmrt;
        if (nkh != null) {
            return nkh.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
        pUU.KWHzl("VoiceBoardFragment", "View destroyed");
    }

    public final void KWHzl() {
        nKH nkh = this.gEmmrt;
        final C36527oce c36527oce = nkh != null ? nkh.AEQbTJ : null;
        if (c36527oce != null) {
            c36527oce.setMaxVoiceRecordingLimit(60);
        }
        AudioRecordManager.Application application = AudioRecordManager.Companion;
        application.OLrzqt().AEQbTJ(60);
        application.OLrzqt().KWHzl(new Function1() { // from class: o.okU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36939okS.OLrzqt(c36527oce, this, (AbstractC36510ocN) obj);
            }
        });
        application.OLrzqt().copydefault(new Function1() { // from class: o.okR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36939okS.AEQbTJ(this.copydefault, (AbstractC36502ocF) obj);
            }
        });
        application.OLrzqt().EZpvd(new Function1() { // from class: o.okV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36939okS.copydefault(c36527oce, ((java.lang.Integer) obj).intValue());
            }
        });
        if (c36527oce != null) {
            c36527oce.setOnRecordStart(new Function0() { // from class: o.okX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36939okS.OLrzqt(c36527oce, this);
                }
            });
            c36527oce.setOnRecordStop(new Function0() { // from class: o.okZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36939okS.copydefault(c36527oce, this);
                }
            });
            c36527oce.setOnRecordCancel(new Function0() { // from class: o.ola
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36939okS.EZpvd(c36527oce);
                }
            });
            c36527oce.setOnRecordContinue(new Function0() { // from class: o.okY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36939okS.copydefault(c36527oce);
                }
            });
        }
    }

    public static final Unit OLrzqt(C36527oce c36527oce, C36939okS c36939okS, AbstractC36510ocN abstractC36510ocN) {
        Intrinsics.checkNotNullParameter(abstractC36510ocN, "");
        if (abstractC36510ocN instanceof AbstractC36510ocN.StateListAnimator) {
            if (c36527oce != null) {
                c36527oce.setIdleOrStopRecordView();
            }
            pUU.KWHzl("VoiceBoardFragment", "Audio recording state: Idle");
        } else if (abstractC36510ocN instanceof AbstractC36510ocN.TaskDescription) {
            if (c36527oce != null) {
                c36527oce.setStartRecordView();
            }
            pUU.KWHzl("VoiceBoardFragment", "Audio recording state: StartRecording");
        } else if (abstractC36510ocN instanceof AbstractC36510ocN.Application) {
            c36939okS.AhwBna();
            pUU.KWHzl("VoiceBoardFragment", "Audio recording state: AddVibrateEvent");
        } else if (abstractC36510ocN instanceof AbstractC36510ocN.ActionBar) {
            if (c36527oce != null) {
                c36527oce.EZpvd();
            }
            pUU.KWHzl("VoiceBoardFragment", "Audio recording state: Cancel");
        } else if (abstractC36510ocN instanceof AbstractC36510ocN.FragmentManager) {
            if (c36527oce != null) {
                c36527oce.EZpvd(((AbstractC36510ocN.FragmentManager) abstractC36510ocN).EZpvd());
            }
            pUU.KWHzl("VoiceBoardFragment", "Audio recording state: TimerUpdate with time: " + ((AbstractC36510ocN.FragmentManager) abstractC36510ocN).EZpvd());
        } else {
            if (!Intrinsics.EZpvd(abstractC36510ocN, AbstractC36510ocN.Activity.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String string = c36939okS.getString(C35399nuc.LoaderManager.dxTXDv);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C36939okS c36939okS, AbstractC36502ocF abstractC36502ocF) {
        Intrinsics.checkNotNullParameter(abstractC36502ocF, "");
        if (abstractC36502ocF instanceof AbstractC36502ocF.Activity) {
            AbstractC36502ocF.Activity activity = (AbstractC36502ocF.Activity) abstractC36502ocF;
            pUU.EZpvd("VoiceBoardFragment", "Audio file record successfully: " + activity.copydefault());
            c36939okS.EZpvd(activity.copydefault(), activity.OLrzqt());
        } else {
            if (!(abstractC36502ocF instanceof AbstractC36502ocF.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.copydefault("VoiceBoardFragment", "Failed to send audio file: " + ((AbstractC36502ocF.TaskDescription) abstractC36502ocF).OLrzqt());
        }
        if (c36939okS.getActivity() != null) {
            FragmentKt.setFragmentResult(c36939okS, "VOICE_BOARD_REQUEST_CODE", BundleKt.bundleOf(C56390yDp.OLrzqt("VOICE_BOARD_RESULT_CODE", java.lang.Boolean.FALSE)));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C36527oce c36527oce, int i) {
        if (c36527oce != null) {
            c36527oce.KWHzl(i);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C36527oce c36527oce, C36939okS c36939okS) {
        android.content.Context context = c36527oce.getContext();
        if (context != null) {
            pUU.KWHzl("VoiceBoardFragment", "Starting audio recording");
            AudioRecordManager.Companion.OLrzqt().OLrzqt(context);
            FragmentKt.setFragmentResult(c36939okS, "VOICE_BOARD_REQUEST_CODE", BundleKt.bundleOf(C56390yDp.OLrzqt("VOICE_BOARD_RESULT_CODE", java.lang.Boolean.TRUE)));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C36527oce c36527oce, C36939okS c36939okS) {
        if (c36527oce.getContext() != null) {
            pUU.KWHzl("VoiceBoardFragment", "Stopping audio recording");
            AudioRecordManager.Companion.OLrzqt().iwGUEr();
            FragmentKt.setFragmentResult(c36939okS, "VOICE_BOARD_REQUEST_CODE", BundleKt.bundleOf(C56390yDp.OLrzqt("VOICE_BOARD_RESULT_CODE", java.lang.Boolean.FALSE)));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36527oce c36527oce) {
        if (c36527oce.getContext() != null) {
            pUU.KWHzl("VoiceBoardFragment", "Cancelling audio recording");
            AudioRecordManager.Companion.OLrzqt().getFieldNames();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C36527oce c36527oce) {
        if (c36527oce.getContext() != null) {
            pUU.KWHzl("VoiceBoardFragment", "Continuing audio recording");
            AudioRecordManager.Companion.OLrzqt().valueOf();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.net.Uri uri, int i) {
        pUU.KWHzl("VoiceBoardFragment", "Sending voice message with duration: " + i);
        C35290nsY.copydefault(this, new GeneralAction.SendMessages(yDY.copydefault(new SendMessageRequestParam.Voice(uri, C56548yJl.valueOf(i, AudioRecordManager.Companion.OLrzqt().AkhnZx())))));
    }

    public final void AhwBna() {
        java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (Build.VERSION.SDK_INT >= 26) {
            if (vibrator != null) {
                vibrator.vibrate(android.os.VibrationEffect.createOneShot(500L, -1));
            }
            pUU.KWHzl("VoiceBoardFragment", "Vibrating for 0.5 seconds");
        } else {
            if (vibrator != null) {
                vibrator.vibrate(500L);
            }
            pUU.KWHzl("VoiceBoardFragment", "Vibrating for 500 milliseconds (pre-Oreo)");
        }
    }
}
