package o;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.rxutils.SubHelper;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.DialogC57667ymj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57662yme extends androidx.fragment.app.DialogFragment {
    public DialogInterface.OnDismissListener fetchVPNInfo;
    public Activity isConnected;
    public DialogC57667ymj values;

    /* JADX INFO: renamed from: o.yme$Activity */
    public interface Activity {
        void OLrzqt();
    }

    public int AhwBna() {
        return 3;
    }

    public boolean valueOf() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        DialogC57667ymj dialogC57667ymj = new DialogC57667ymj(requireActivity(), getTheme());
        this.values = dialogC57667ymj;
        dialogC57667ymj.KWHzl(new DialogC57667ymj.StateListAnimator() { // from class: o.ymf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.DialogC57667ymj.StateListAnimator
            public final void AEQbTJ() {
                C57662yme.KWHzl(this.EZpvd);
            }
        });
        DialogC57667ymj dialogC57667ymj2 = this.values;
        Intrinsics.copydefault(dialogC57667ymj2, "");
        return dialogC57667ymj2;
    }

    public static final void KWHzl(C57662yme c57662yme) {
        Activity activity = c57662yme.isConnected;
        if (activity != null) {
            activity.OLrzqt();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C32113mPz.Dialog.QfsBiF);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetBehavior<android.widget.RelativeLayout> bottomSheetBehaviorEZpvd;
        BottomSheetBehavior<android.widget.RelativeLayout> bottomSheetBehaviorEZpvd2;
        android.view.Window window;
        super.onStart();
        java.lang.Integer numGEmmrt = gEmmrt();
        if (numGEmmrt != null) {
            int iIntValue = numGEmmrt.intValue();
            DialogC57667ymj dialogC57667ymj = this.values;
            if (dialogC57667ymj != null && (window = dialogC57667ymj.getWindow()) != null) {
                window.setNavigationBarColor(iIntValue);
            }
        }
        DialogC57667ymj dialogC57667ymj2 = this.values;
        if (dialogC57667ymj2 != null && (bottomSheetBehaviorEZpvd2 = dialogC57667ymj2.EZpvd()) != null) {
            bottomSheetBehaviorEZpvd2.setSkipCollapsed(valueOf());
        }
        DialogC57667ymj dialogC57667ymj3 = this.values;
        if (dialogC57667ymj3 == null || (bottomSheetBehaviorEZpvd = dialogC57667ymj3.EZpvd()) == null) {
            return;
        }
        bottomSheetBehaviorEZpvd.setState(AhwBna());
    }

    public java.lang.Integer gEmmrt() {
        return java.lang.Integer.valueOf(getResources().getColor(C32113mPz.ActionBar.QKVWgx));
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        DialogC57667ymj dialogC57667ymj = this.values;
        Intrinsics.copydefault(dialogC57667ymj);
        dialogC57667ymj.setCancelable(z);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.fetchVPNInfo;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        SubHelper.AEQbTJ(this);
    }

    public void KWHzl(boolean z) {
        DialogC57667ymj dialogC57667ymj = this.values;
        if (dialogC57667ymj != null) {
            dialogC57667ymj.EZpvd(z ? 8 : 0);
        }
    }

    public void AEQbTJ(int i) {
        DialogC57667ymj dialogC57667ymj = this.values;
        if (dialogC57667ymj != null) {
            dialogC57667ymj.copydefault(i);
        }
    }
}
