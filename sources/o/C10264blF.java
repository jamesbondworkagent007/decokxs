package o;

import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C10264blF extends wXX {
    public float AEQbTJ = 0.92f;
    public androidx.fragment.app.Fragment EZpvd;
    public C17027euz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull C17027euz c17027euz) {
        Intrinsics.checkNotNullParameter(c17027euz, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return C13754dXa.LoaderManager.AYXKKw;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C17027euz c17027euzOLrzqt = C17027euz.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        this.copydefault = c17027euzOLrzqt;
        C17027euz c17027euz = null;
        if (c17027euzOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c17027euzOLrzqt = null;
        }
        android.widget.FrameLayout frameLayout = c17027euzOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) (C57676yms.copydefault(requireContext()) * this.AEQbTJ);
            frameLayout.setLayoutParams(layoutParams);
            androidx.fragment.app.Fragment fragment = this.EZpvd;
            if (fragment != null) {
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.gCNefq, fragment);
                fragmentTransactionBeginTransaction.commit();
            }
            C17027euz c17027euz2 = this.copydefault;
            if (c17027euz2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17027euz = c17027euz2;
            }
            copydefault(c17027euz);
            constraintLayout.post(new java.lang.Runnable() { // from class: o.blH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C10264blF.AEQbTJ(this.OLrzqt);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void AEQbTJ(C10264blF c10264blF) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10264blF, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.copydefault(dialogOnCreateDialog, "");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogOnCreateDialog;
        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.blI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                C10264blF.OLrzqt(dialogInterface);
            }
        });
        return bottomSheetDialog;
    }

    public static final void OLrzqt(android.content.DialogInterface dialogInterface) {
        Intrinsics.copydefault(dialogInterface, "");
        android.view.View viewFindViewById = ((BottomSheetDialog) dialogInterface).findViewById(com.google.android.material.R.id.design_bottom_sheet);
        Intrinsics.copydefault(viewFindViewById, "");
        BottomSheetBehavior.from((android.widget.FrameLayout) viewFindViewById).setState(3);
    }
}
