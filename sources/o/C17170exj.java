package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17170exj implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView DbNXlk;
    public final Guideline EZpvd;
    public final ShapeableImageView KWHzl;
    public final Guideline OLrzqt;
    public final ShapeableImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C17170exj(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.AhwBna = constraintLayout;
        this.OLrzqt = guideline;
        this.EZpvd = guideline2;
        this.KWHzl = shapeableImageView;
        this.AEQbTJ = imageView;
        this.copydefault = shapeableImageView2;
        this.gEmmrt = imageView2;
        this.djBIcL = textView;
        this.AYXKKw = textView2;
        this.valueOf = textView3;
        this.values = textView4;
        this.DbNXlk = textView5;
        this.fetchVPNInfo = textView6;
    }

    public static C17170exj EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.aChkwz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17170exj copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iRgjgR;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C13754dXa.ActionBar.hfeTOA;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                i = C13754dXa.ActionBar.setCurrentKeyboardTarget;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C13754dXa.ActionBar.QVMIlxQVMIlx;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C13754dXa.ActionBar.invokespecialhrnhsO;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                        if (shapeableImageView2 != null) {
                            i = C13754dXa.ActionBar.setMediaController;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C13754dXa.ActionBar.ComponentActivityExternalSyntheticLambda2;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C13754dXa.ActionBar.ComponentActivity4;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C13754dXa.ActionBar.ComponentActivityNonConfigurationInstances;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C13754dXa.ActionBar.cancelPendingInputEvents;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C13754dXa.ActionBar.ComponentActivityApi33Impl;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = C13754dXa.ActionBar.ComponentActivityApi19Impl;
                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        return new C17170exj((ConstraintLayout) view, guideline, guideline2, shapeableImageView, imageView, shapeableImageView2, imageView2, textView, textView2, textView3, textView4, textView5, textView6);
                                                    }
                                                }
                                            }
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
