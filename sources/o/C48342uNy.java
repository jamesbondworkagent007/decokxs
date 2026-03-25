package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.PlayerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48342uNy implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final C55353xiO EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C51601vqB copydefault;
    public final android.widget.TextView djBIcL;
    public final PlayerView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C48342uNy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull C51601vqB c51601vqB, @androidx.annotation.NonNull C55353xiO c55353xiO, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull PlayerView playerView) {
        this.AhwBna = constraintLayout;
        this.AEQbTJ = constraintLayout2;
        this.KWHzl = textView;
        this.OLrzqt = constraintLayout3;
        this.copydefault = c51601vqB;
        this.EZpvd = c55353xiO;
        this.djBIcL = textView2;
        this.valueOf = textView3;
        this.AYXKKw = textView4;
        this.gEmmrt = playerView;
    }

    public static C48342uNy OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.dxcTrN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C48342uNy copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.fkESqH;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C48033uCm.Application.geLlBI;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.DQzvGNdrmXxudrmXxu;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = C48033uCm.Application.fdt;
                    C51601vqB c51601vqB = (C51601vqB) ViewBindings.findChildViewById(view, i);
                    if (c51601vqB != null) {
                        i = C48033uCm.Application.fromRating;
                        C55353xiO c55353xiO = (C55353xiO) ViewBindings.findChildViewById(view, i);
                        if (c55353xiO != null) {
                            i = C48033uCm.Application.onSessionReady;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C48033uCm.Application.createIntentactivity_release;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C48033uCm.Application.ActivityResultContractsRequestMultiplePermissions;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = C48033uCm.Application.getDrawable;
                                        PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(view, i);
                                        if (playerView != null) {
                                            return new C48342uNy((ConstraintLayout) view, constraintLayout, textView, constraintLayout2, c51601vqB, c55353xiO, textView2, textView3, textView4, playerView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
