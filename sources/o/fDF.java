package o;

import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC45752swP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fDF extends AbstractDialogInterfaceOnKeyListenerC57208yeA {
    public int EZpvd;
    public java.lang.Float copydefault = java.lang.Float.valueOf(1.0f);
    public final int KWHzl = C13754dXa.LoaderManager.DbNXlk;
    public boolean AEQbTJ = true;
    public final android.os.Handler OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA
    public void AEQbTJ(java.lang.Float f) {
        this.copydefault = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.copydefault;
    }

    public static final class ActionBar implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            if (view instanceof android.view.ViewGroup) {
                InterfaceC45752swP interfaceC45752swP = (InterfaceC45752swP) C43251rlk.copydefault(InterfaceC45752swP.class);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                android.content.Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                viewGroup.addView(InterfaceC45752swP.ActionBar.getUKWarningBannerView$default(interfaceC45752swP, context, null, 2, null), 0, new ViewGroup.MarginLayoutParams(-2, -2));
            }
        }
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, o.AbstractC57671ymn, o.C33003moJ
    public void AEQbTJ() {
        setStyle(0, C13754dXa.LoaderManager.AkhnZx);
    }

    public final boolean KWHzl(android.app.Activity activity) {
        try {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(activity.getWindow().getDecorView());
            Insets insets = rootWindowInsets != null ? rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars()) : null;
            Insets insets2 = rootWindowInsets != null ? rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars()) : null;
            int i = insets != null ? insets.bottom : 0;
            pUU.EZpvd("zqh", "navBarBottom = " + i + ", systemBarBottom = " + (insets2 != null ? insets2.bottom : 0));
            return i > 50;
        } catch (java.lang.Exception e) {
            pUU.EZpvd("zqh", "Error getting navigation mode: " + e.getMessage());
            return true;
        }
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        final DialogC33577mzA dialogC33577mzA = dialogOnCreateDialog instanceof DialogC33577mzA ? (DialogC33577mzA) dialogOnCreateDialog : null;
        if (dialogC33577mzA != null) {
            dialogC33577mzA.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.fDG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(android.content.DialogInterface dialogInterface) {
                    fDF.EZpvd(dialogC33577mzA, this, dialogInterface);
                }
            });
        }
        if (dialogC33577mzA != null) {
            return dialogC33577mzA;
        }
        android.app.Dialog dialogOnCreateDialog2 = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog2, "");
        return dialogOnCreateDialog2;
    }

    public static final void EZpvd(DialogC33577mzA dialogC33577mzA, fDF fdf, android.content.DialogInterface dialogInterface) {
        try {
            android.view.Window window = dialogC33577mzA.getWindow();
            if (window == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 35) {
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
            }
            int iCopydefault = C57676yms.copydefault(fdf.requireContext());
            int iGEmmrt = C33570myu.gEmmrt(fdf.requireContext());
            FragmentActivity fragmentActivityRequireActivity = fdf.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            int iKWHzl = (iCopydefault - iGEmmrt) - (fdf.KWHzl(fragmentActivityRequireActivity) ? C33570myu.KWHzl(fdf.requireContext()) : 0);
            android.view.View viewFindViewById = dialogC33577mzA.findViewById(com.google.android.material.R.id.design_bottom_sheet);
            pUU.copydefault("zqh", "bottomSheet.height = " + (viewFindViewById != null ? java.lang.Integer.valueOf(viewFindViewById.getHeight()) : null));
            ViewGroup.LayoutParams layoutParams = fdf.fARcdN().AEQbTJ.getLayoutParams();
            if ((viewFindViewById == null || viewFindViewById.getHeight() != 0) && viewFindViewById != null) {
                iKWHzl = viewFindViewById.getHeight();
            }
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, iKWHzl);
            } else {
                layoutParams.height = iKWHzl;
            }
            fdf.fARcdN().AEQbTJ.setLayoutParams(layoutParams);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("zqh", "set height error: " + th.getMessage());
        }
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.view.Window window;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault(false);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "fromHome";
        if (arguments != null && (string = arguments.getString("from", "fromHome")) != null) {
            str = string;
        }
        C17351fCc c17351fCcCopydefault = C17351fCc.Companion.copydefault(str, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "fromDex"));
        C57211yeD c57211yeDKWHzl = KWHzl();
        if (c57211yeDKWHzl != null) {
            c57211yeDKWHzl.AEQbTJ(null, c17351fCcCopydefault, false, true);
        }
        EZpvd(C52761wXj.Activity.aBDePw);
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(this.KWHzl);
        }
        copydefault();
        view.post(new java.lang.Runnable() { // from class: o.fDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fDF.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(fDF fdf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) fdf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault() {
        if (((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER)) {
            android.widget.LinearLayout linearLayout = fARcdN().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            if (ViewCompat.isLaidOut(linearLayout) && !linearLayout.isLayoutRequested()) {
                InterfaceC45752swP interfaceC45752swP = (InterfaceC45752swP) C43251rlk.copydefault(InterfaceC45752swP.class);
                android.content.Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                linearLayout.addView(InterfaceC45752swP.ActionBar.getUKWarningBannerView$default(interfaceC45752swP, context, null, 2, null), 0, new ViewGroup.MarginLayoutParams(-2, -2));
                return;
            }
            linearLayout.addOnLayoutChangeListener(new ActionBar());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        android.view.Window window;
        super.onResume();
        if (this.AEQbTJ) {
            int statusBarColor = 0;
            this.AEQbTJ = false;
            FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                statusBarColor = window.getStatusBarColor();
            }
            this.EZpvd = statusBarColor;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                return;
            } else {
                C33567myr.AEQbTJ(activity2, C52761wXj.Activity.copydefault);
            }
        }
        this.OLrzqt.postDelayed(new java.lang.Runnable() { // from class: o.fDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fDF.AEQbTJ(this.AEQbTJ);
            }
        }, 500L);
    }

    public static final void AEQbTJ(fDF fdf) {
        android.view.Window window;
        android.app.Dialog dialog = fdf.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(fdf.KWHzl);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        android.view.Window window;
        super.onStop();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(0);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(activity, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(fDF.class.getName());
        fDF fdf = fragmentFindFragmentByTag instanceof fDF ? (fDF) fragmentFindFragmentByTag : null;
        if (fdf != null && fdf.isAdded()) {
            fdf.dismissAllowingStateLoss();
        }
        java.lang.String name = fDF.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        EZpvd(fragmentManager, name, activity);
    }

    public static /* synthetic */ void showWalletDialogFragment$default(fDF fdf, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "fromDex";
        }
        fdf.KWHzl(fragmentManager, str, activity);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(fDF.class.getName());
        fDF fdf = fragmentFindFragmentByTag instanceof fDF ? (fDF) fragmentFindFragmentByTag : null;
        if (fdf != null && fdf.isAdded()) {
            fdf.dismissAllowingStateLoss();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from", str);
        setArguments(bundle);
        java.lang.String name = fDF.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        EZpvd(fragmentManager, name, activity);
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt.removeCallbacksAndMessages(null);
        FragmentActivity activity = getActivity();
        android.view.Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (window != null) {
            window.setStatusBarColor(this.EZpvd);
        }
    }
}
