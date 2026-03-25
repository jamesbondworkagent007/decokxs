package o;

import androidx.core.os.BundleKt;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C9678baC;
import o.fWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fWX {
    public final java.lang.String AEQbTJ;
    public final Function0<Unit> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public boolean gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 boolean)
  (r4v0 java.lang.String)
  (r5v0 kotlin.jvm.functions.Function0)
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] call: o.fWX.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ fWX(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public fWX(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0<Unit> function0) {
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.copydefault = z;
        this.AEQbTJ = str3;
        this.EZpvd = function0;
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:13) call: o.fWX.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ fWX(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : function0, null);
    }

    public static final class LoaderManager extends fWX {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str) {
            super(C33069mpW.copydefault(C13754dXa.FragmentManager.RjCdvp, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str))), "", true, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class Fragment extends fWX {
        public Fragment() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcher2), "", false, null, null, 24, null);
        }
    }

    public static final class VoiceInteractor extends fWX {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceInteractor(@NotNull java.lang.String str) {
            super(C33069mpW.copydefault(C13754dXa.FragmentManager.RjCdvp, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RhlVAI), true, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class SharedElementCallback extends fWX {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedElementCallback(@NotNull java.lang.String str) {
            super(C33069mpW.copydefault(C13754dXa.FragmentManager.RjCdvp, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RjCdvpRjCdvp), true, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class PictureInPictureParams extends fWX {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PictureInPictureParams(@NotNull java.lang.String str) {
            super(C33069mpW.copydefault(C13754dXa.FragmentManager.RjCdvp, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RsCxkX), true, null, null, 24, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class ActionBar extends fWX {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
            super(C33069mpW.copydefault(C13754dXa.FragmentManager.cancelPendingInputEvents, C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str), C56390yDp.OLrzqt("num", str2))), "", false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityApi33Impl), function0, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
        }
    }

    public static final class PendingIntent extends fWX {
        public boolean djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public void EZpvd(boolean z) {
            this.djBIcL = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public boolean OLrzqt() {
            return this.djBIcL;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PendingIntent(boolean z, @NotNull java.lang.String str) {
            java.lang.String strCopydefault;
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.QTtQrx);
            if (z) {
                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.SFHvfS);
            } else {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.SaJVGb, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", str)));
            }
            super(strAYXKKw, strCopydefault, true, null, null, 24, null);
        }
    }

    public static final class Dialog extends fWX {
        public boolean AhwBna;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public void EZpvd(boolean z) {
            this.AhwBna = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public boolean OLrzqt() {
            return this.AhwBna;
        }

        public Dialog() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fruYXx), C33070mpX.AYXKKw(C13754dXa.FragmentManager.OFQuKP), false, null, null, 24, null);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class FragmentManager extends fWX {
        public boolean AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public void EZpvd(boolean z) {
            this.AYXKKw = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public boolean OLrzqt() {
            return this.AYXKKw;
        }

        public FragmentManager() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fruYXx), C33070mpX.AYXKKw(C13754dXa.FragmentManager.SFHvfSaKzXkR), false, null, null, 24, null);
        }
    }

    public static final class StateListAnimator extends fWX {
        public boolean AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public void EZpvd(boolean z) {
            this.AYXKKw = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public boolean OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(boolean z, @NotNull java.lang.String str) {
            java.lang.String strCopydefault;
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.SUwuXE);
            if (z) {
                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.SFHvfS);
            } else {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.onLost, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", str)));
            }
            super(strAYXKKw, strCopydefault, true, null, null, 24, null);
        }
    }

    public static final class Application extends fWX {
        public Application() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OhRmUC), C33070mpX.AYXKKw(C13754dXa.FragmentManager.OFQuKP), false, null, null, 24, null);
        }
    }

    public static final class TaskStackBuilder extends fWX {
        public TaskStackBuilder() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAvailable), C33070mpX.AYXKKw(C13754dXa.FragmentManager.SQPLEi), true, null, null, 24, null);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class AssistContent extends fWX {
        public AssistContent() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hTAtCx), "", false, null, null, 24, null);
        }
    }

    public static final class ComponentName extends fWX {
        public boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public void EZpvd(boolean z) {
            this.valueOf = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fWX
        public boolean OLrzqt() {
            return this.valueOf;
        }

        public ComponentName() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi19), "", true, null, null, 24, null);
        }
    }

    public static final class ComponentCallbacks2 extends fWX {
        public ComponentCallbacks2() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMetadataUpdate), "", false, null, null, 24, null);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity extends fWX {
        public Activity() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatActivity1), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setTheme), false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV), new Function0() { // from class: o.fWZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fWX.Activity.AhwBna();
                }
            }, null);
        }

        public static final Unit AhwBna() {
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.SlnMSS));
            android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
            if (activeActivity$default != null) {
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activeActivity$default, bundleBundleOf, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription extends fWX {
        public TaskDescription() {
            super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.supportShouldUpRecreateTask), C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatActivity2), false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV), new Function0() { // from class: o.fXb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fWX.TaskDescription.djBIcL();
                }
            }, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit djBIcL() {
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.SlnMSS));
            android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
            if (activeActivity$default != null) {
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activeActivity$default, bundleBundleOf, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }
}
