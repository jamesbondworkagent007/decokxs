package o;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractDialogInterfaceOnKeyListenerC57208yeA extends AbstractC57671ymn implements DialogInterface.OnKeyListener {
    public C57211yeD AYXKKw;
    public Activity DbNXlk;
    public C57210yeC djBIcL;
    public boolean gEmmrt;
    public boolean values;
    public boolean isConnected = true;
    public final java.util.ArrayList<Activity> fetchVPNInfo = new java.util.ArrayList<>();
    public final Application valueOf = new Application();
    public java.lang.Float AhwBna = java.lang.Float.valueOf(0.92f);

    /* JADX INFO: renamed from: o.yeA$Activity */
    public interface Activity {
        void copydefault(android.os.Bundle bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.Float f) {
        this.AhwBna = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57211yeD KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Activity activity) {
        this.DbNXlk = activity;
    }

    public android.os.Bundle OLrzqt(android.os.Bundle bundle) {
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public boolean isConnected() {
        return this.values;
    }

    /* JADX INFO: renamed from: o.yeA$Application */
    public static final class Application extends FragmentManager.FragmentLifecycleCallbacks {
        public Application() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
            android.app.Dialog dialog;
            android.view.Window window;
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(context, "");
            super.onFragmentAttached(fragmentManager, fragment, context);
            if (!(fragment instanceof AbstractC57212yeE) || !((AbstractC57212yeE) fragment).copydefault() || (dialog = AbstractDialogInterfaceOnKeyListenerC57208yeA.this.getDialog()) == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(16);
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDetached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            android.app.Dialog dialog;
            android.view.Window window;
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDetached(fragmentManager, fragment);
            if (!(fragment instanceof AbstractC57212yeE) || !((AbstractC57212yeE) fragment).copydefault() || (dialog = AbstractDialogInterfaceOnKeyListenerC57208yeA.this.getDialog()) == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(32);
        }
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.AYXKKw = new C57211yeD(childFragmentManager, C13754dXa.ActionBar.fMBJsc, 0, 0, 0, 0, 60, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(this);
        }
        android.app.Dialog dialog2 = getDialog();
        DialogC33577mzA dialogC33577mzA = dialog2 instanceof DialogC33577mzA ? (DialogC33577mzA) dialog2 : null;
        if (dialogC33577mzA != null && (bottomSheetBehaviorCopydefault = dialogC33577mzA.copydefault()) != null) {
            bottomSheetBehaviorCopydefault.setSkipCollapsed(this.isConnected);
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.registerFragmentLifecycleCallbacks(this.valueOf, true);
        }
        view.post(new java.lang.Runnable() { // from class: o.yey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractDialogInterfaceOnKeyListenerC57208yeA.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(AbstractDialogInterfaceOnKeyListenerC57208yeA abstractDialogInterfaceOnKeyListenerC57208yeA) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractDialogInterfaceOnKeyListenerC57208yeA, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.valueOf);
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.QIZEnU, viewGroup, false);
        Intrinsics.copydefault(viewInflate, "");
        C57210yeC c57210yeC = (C57210yeC) viewInflate;
        this.djBIcL = c57210yeC;
        return c57210yeC;
    }

    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.DbNXlk = activity;
        if (fragmentManager.isStateSaved()) {
            return;
        }
        show(fragmentManager, str);
    }

    public final void EZpvd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.fetchVPNInfo.add(activity);
    }

    public final void AEQbTJ(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.fetchVPNInfo.remove(activity);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        C57211yeD c57211yeD;
        if (i != 4) {
            return false;
        }
        if (keyEvent == null || keyEvent.getAction() != 1 || (c57211yeD = this.AYXKKw) == null || !c57211yeD.EZpvd()) {
            return true;
        }
        dismissAllowingStateLoss();
        return true;
    }

    public static /* synthetic */ void close$default(AbstractDialogInterfaceOnKeyListenerC57208yeA abstractDialogInterfaceOnKeyListenerC57208yeA, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
        if ((i & 1) != 0) {
            bundle = null;
        }
        abstractDialogInterfaceOnKeyListenerC57208yeA.copydefault(bundle);
    }

    public final void copydefault(android.os.Bundle bundle) {
        this.gEmmrt = true;
        android.os.Bundle bundleOLrzqt = OLrzqt(bundle);
        java.util.ArrayList<Activity> arrayList = this.fetchVPNInfo;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((Activity) it.next()).copydefault(bundleOLrzqt);
            }
        }
        Activity activity = this.DbNXlk;
        if (activity != null) {
            activity.copydefault(bundleOLrzqt);
        }
        dismissAllowingStateLoss();
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.gEmmrt) {
            return;
        }
        android.os.Bundle bundleOLrzqt = OLrzqt((android.os.Bundle) null);
        java.util.ArrayList<Activity> arrayList = this.fetchVPNInfo;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((Activity) it.next()).copydefault(bundleOLrzqt);
            }
        }
        Activity activity = this.DbNXlk;
        if (activity != null) {
            activity.copydefault(bundleOLrzqt);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C57211yeD c57211yeD = this.AYXKKw;
        if (c57211yeD != null) {
            c57211yeD.copydefault();
        }
        super.onDestroy();
    }

    @Override // o.AbstractC57671ymn, o.C33003moJ
    public void AEQbTJ() {
        if (isConnected()) {
            setStyle(0, C13754dXa.LoaderManager.EZpvd);
        } else {
            setStyle(0, C13754dXa.LoaderManager.KWHzl);
        }
    }

    public final void copydefault(boolean z) {
        C57210yeC c57210yeC = this.djBIcL;
        if (c57210yeC != null) {
            c57210yeC.setClipCorner(z);
        }
    }
}
