package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16808eqs implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final C55251xgS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C16808eqs(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C55251xgS c55251xgS) {
        this.copydefault = constraintLayout;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = constraintLayout2;
        this.KWHzl = imageView;
        this.AEQbTJ = textView;
        this.AhwBna = textView2;
        this.djBIcL = textView3;
        this.valueOf = c55251xgS;
    }

    public static C16808eqs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.hfdhUn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16808eqs KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.getConnectivityMgr;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C13754dXa.ActionBar.MediaSessionCompat3;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C13754dXa.ActionBar.Api19Impl;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C13754dXa.ActionBar.ActivityViewModelLazyKtviewModelsfactoryPromise1;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C13754dXa.ActionBar.ActivityViewModelLazyKtviewModelsfactoryPromise2;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C13754dXa.ActionBar.min;
                            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                            if (c55251xgS != null) {
                                return new C16808eqs(constraintLayout, appCompatImageView, constraintLayout, imageView, textView, textView2, textView3, c55251xgS);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
