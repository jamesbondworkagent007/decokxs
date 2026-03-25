package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.broadcastmessages.backtoexitdialog.BackToExitDialogFragment$internalCancel$1;
import com.okinc.im.imui.broadcastmessages.backtoexitdialog.BackToExitDialogFragment$internalDismiss$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nuR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35388nuR extends C32995moB {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nuT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35388nuR.AEQbTJ(this.OLrzqt);
        }
    });
    public java.lang.String EZpvd = "ACTION_DISMISS";

    /* JADX INFO: renamed from: o.nuR$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nuR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_LEAVE";
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_CANCEL";
        }

        public final java.lang.String copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_DISMISS";
        }

        public final C35388nuR OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C35388nuR c35388nuR = new C35388nuR();
            c35388nuR.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FRAGMENT_RESULT_KEY", str)));
            return c35388nuR;
        }
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String AEQbTJ(C35388nuR c35388nuR) {
        java.lang.String string;
        android.os.Bundle arguments = c35388nuR.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_FRAGMENT_RESULT_KEY")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = "ACTION_DISMISS";
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C35399nuc.LoaderManager.fvQaOB));
        viewOnClickListenerC54939xaY.EZpvd(getString(C35399nuc.LoaderManager.dxcTrN));
        java.lang.String string = getString(C35399nuc.LoaderManager.ODWQjV);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.nuU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35388nuR.EZpvd(this.OLrzqt, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.iwGUEr, new View.OnClickListener() { // from class: o.nuW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35388nuR.copydefault(this.AEQbTJ, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void EZpvd(C35388nuR c35388nuR, android.view.View view) {
        c35388nuR.EZpvd = "ACTION_LEAVE";
        c35388nuR.OLrzqt();
    }

    public static final void copydefault(C35388nuR c35388nuR, android.view.View view) {
        c35388nuR.KWHzl();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.EZpvd = "ACTION_CANCEL";
        AEQbTJ();
        super.onCancel(dialogInterface);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        AEQbTJ();
        super.onDismiss(dialogInterface);
    }

    private final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BackToExitDialogFragment$internalDismiss$1(this, null), 3, null);
    }

    private final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BackToExitDialogFragment$internalCancel$1(this, null), 3, null);
    }

    private final void AEQbTJ() {
        java.lang.String strEZpvd;
        java.lang.String str = this.EZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ACTION_LEAVE")) {
            strEZpvd = Companion.AEQbTJ(EZpvd());
        } else {
            strEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ACTION_CANCEL") ? Companion.EZpvd(EZpvd()) : Companion.copydefault(EZpvd());
        }
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "");
        FragmentKt.setFragmentResult(this, strEZpvd, bundle);
    }
}
