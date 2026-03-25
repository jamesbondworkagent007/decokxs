package o;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.WindowManager;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.market.search.features.kline.landscape.LandscapeNavSearchFragment;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47244tmQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39884qBi {
    public int AEQbTJ;
    public androidx.fragment.app.DialogFragment EZpvd;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.EZpvd = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull androidx.fragment.app.DialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(dialogFragment, "");
        this.EZpvd = dialogFragment;
    }

    public void EZpvd() {
        android.content.Context contextRequireContext;
        android.app.Dialog dialog;
        androidx.fragment.app.DialogFragment dialogFragment = this.EZpvd;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            dialog.requestWindowFeature(1);
        }
        androidx.fragment.app.DialogFragment dialogFragment2 = this.EZpvd;
        if (dialogFragment2 != null) {
            dialogFragment2.setStyle(1, C32113mPz.Dialog.OLrzqt);
        }
        androidx.fragment.app.DialogFragment dialogFragment3 = this.EZpvd;
        if (dialogFragment3 == null || (contextRequireContext = dialogFragment3.requireContext()) == null) {
            return;
        }
        OLrzqt(contextRequireContext);
    }

    public final void OLrzqt(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        this.OLrzqt = displayMetrics.widthPixels;
        this.AEQbTJ = displayMetrics.heightPixels;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault() {
        android.app.Dialog dialog;
        android.view.Window window;
        android.view.DisplayCutout cutout;
        FragmentActivity activity;
        FragmentActivity activity2;
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        androidx.fragment.app.DialogFragment dialogFragment = this.EZpvd;
        if (dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(C33070mpX.copydefault(C47244tmQ.Application.copydefault)));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        androidx.fragment.app.DialogFragment dialogFragment2 = this.EZpvd;
        if (dialogFragment2 != null && (activity2 = dialogFragment2.getActivity()) != null && (windowManager = activity2.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 8388611;
        }
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        window.setAttributes(attributes);
        window.setLayout(this.OLrzqt, this.AEQbTJ);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes2);
            int iOLrzqt = C33570myu.OLrzqt();
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(window.getDecorView());
            DisplayCutoutCompat displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
            if (displayCutout != null) {
                iOLrzqt = displayCutout.getSafeInsetLeft();
            } else {
                androidx.fragment.app.DialogFragment dialogFragment3 = this.EZpvd;
                android.view.WindowManager windowManager2 = (dialogFragment3 == null || (activity = dialogFragment3.getActivity()) == null) ? null : activity.getWindowManager();
                if (windowManager2 != null) {
                    if (i >= 30) {
                        android.view.DisplayCutout displayCutout2 = windowManager2.getCurrentWindowMetrics().getWindowInsets().getDisplayCutout();
                        iOLrzqt = displayCutout2 != null ? displayCutout2.getSafeInsetLeft() : 0;
                    } else if (i >= 29) {
                        android.view.Display defaultDisplay2 = windowManager2.getDefaultDisplay();
                        if (defaultDisplay2 != null && (cutout = defaultDisplay2.getCutout()) != null) {
                            iOLrzqt = cutout.getSafeInsetLeft();
                        }
                    }
                }
            }
            androidx.fragment.app.DialogFragment dialogFragment4 = this.EZpvd;
            LandscapeNavSearchFragment landscapeNavSearchFragment = dialogFragment4 instanceof LandscapeNavSearchFragment ? (LandscapeNavSearchFragment) dialogFragment4 : null;
            if (landscapeNavSearchFragment != null) {
                landscapeNavSearchFragment.copydefault(iOLrzqt);
            }
        }
    }
}
