package o;

import android.os.Build;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iTL extends C33003moJ implements InterfaceC33075mpc {
    public C23750iHy AYXKKw;
    public final boolean AkhnZx;
    public final boolean isConnected = true;
    public final boolean fetchVPNInfo = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.fetchVPNInfo;
    }

    public abstract android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    public abstract android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    @Override // o.InterfaceC33075mpc
    public void dismissLoading() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.isConnected;
    }

    @Override // o.InterfaceC33075mpc
    public void releaseLoading() {
    }

    @Override // o.InterfaceC33075mpc
    public void showLoading() {
    }

    public boolean valueOf() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.AkhnZx;
    }

    public int EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getColor(context, C52761wXj.Activity.registerUser);
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        android.view.Window window = dialogOnCreateDialog.getWindow();
        if (window == null) {
            return dialogOnCreateDialog;
        }
        WindowCompat.setDecorFitsSystemWindows(window, false);
        android.content.Context context = dialogOnCreateDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = EZpvd(context);
        window.setNavigationBarColor(iEZpvd);
        if (Build.VERSION.SDK_INT >= 28) {
            window.setNavigationBarDividerColor(iEZpvd);
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        if (insetsController != null) {
            Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog.getContext(), "");
            insetsController.setAppearanceLightNavigationBars(!C27543jxF.KWHzl(r2));
        }
        return dialogOnCreateDialog;
    }

    @Override // o.C33003moJ
    public void AEQbTJ() {
        if (values()) {
            setStyle(0, C32113mPz.Dialog.KWHzl);
        } else {
            setStyle(0, C32113mPz.Dialog.EZpvd);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int iAEQbTJ;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23750iHy c23750iHyEZpvd = C23750iHy.EZpvd(layoutInflater, viewGroup, false);
        this.AYXKKw = c23750iHyEZpvd;
        C23750iHy c23750iHy = null;
        if (c23750iHyEZpvd == null) {
            Intrinsics.gEmmrt("");
            c23750iHyEZpvd = null;
        }
        android.view.View viewCopydefault = copydefault(layoutInflater, c23750iHyEZpvd.EZpvd, bundle);
        if (viewCopydefault != null) {
            C23750iHy c23750iHy2 = this.AYXKKw;
            if (c23750iHy2 == null) {
                Intrinsics.gEmmrt("");
                c23750iHy2 = null;
            }
            c23750iHy2.EZpvd.removeAllViews();
            C23750iHy c23750iHy3 = this.AYXKKw;
            if (c23750iHy3 == null) {
                Intrinsics.gEmmrt("");
                c23750iHy3 = null;
            }
            c23750iHy3.EZpvd.addView(viewCopydefault);
        } else if (valueOf()) {
            C23750iHy c23750iHy4 = this.AYXKKw;
            if (c23750iHy4 == null) {
                Intrinsics.gEmmrt("");
                c23750iHy4 = null;
            }
            c23750iHy4.OLrzqt.setVisibility(0);
        }
        C23750iHy c23750iHy5 = this.AYXKKw;
        if (c23750iHy5 == null) {
            Intrinsics.gEmmrt("");
            c23750iHy5 = null;
        }
        android.view.View viewOLrzqt = OLrzqt(layoutInflater, c23750iHy5.KWHzl, bundle);
        if (viewOLrzqt != null) {
            C23750iHy c23750iHy6 = this.AYXKKw;
            if (c23750iHy6 == null) {
                Intrinsics.gEmmrt("");
                c23750iHy6 = null;
            }
            c23750iHy6.KWHzl.addView(viewOLrzqt);
        }
        if (djBIcL()) {
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int iOLrzqt = c33566myq.OLrzqt(contextRequireContext);
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            iAEQbTJ = iOLrzqt - c33566myq.AEQbTJ(contextRequireContext2);
        } else {
            iAEQbTJ = -2;
        }
        C23750iHy c23750iHy7 = this.AYXKKw;
        if (c23750iHy7 == null) {
            Intrinsics.gEmmrt("");
            c23750iHy7 = null;
        }
        ViewGroup.LayoutParams layoutParams = c23750iHy7.copydefault.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, iAEQbTJ);
        } else {
            layoutParams.height = iAEQbTJ;
        }
        C23750iHy c23750iHy8 = this.AYXKKw;
        if (c23750iHy8 == null) {
            Intrinsics.gEmmrt("");
            c23750iHy8 = null;
        }
        c23750iHy8.copydefault.setLayoutParams(layoutParams);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        C23750iHy c23750iHy9 = this.AYXKKw;
        if (c23750iHy9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23750iHy = c23750iHy9;
        }
        return c23750iHy.getRoot();
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetBehavior<android.widget.FrameLayout> behavior;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (behavior = bottomSheetDialog.getBehavior()) == null) {
            return;
        }
        behavior.setSkipCollapsed(AYXKKw());
    }
}
