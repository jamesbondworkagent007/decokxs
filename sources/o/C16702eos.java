package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eos, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16702eos implements ViewBinding {
    public final Guideline AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.ImageView EZpvd;
    public final ShapeableImageView KWHzl;
    public final Guideline OLrzqt;
    public final ShapeableImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C16702eos(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.gEmmrt = constraintLayout;
        this.OLrzqt = guideline;
        this.AEQbTJ = guideline2;
        this.KWHzl = shapeableImageView;
        this.copydefault = shapeableImageView2;
        this.EZpvd = imageView;
        this.valueOf = textView;
        this.djBIcL = textView2;
        this.AhwBna = textView3;
        this.AYXKKw = textView4;
        this.values = textView5;
        this.AkhnZx = textView6;
    }

    public static C16702eos AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.pauseLocationServices, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16702eos copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iRgjgR;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C13754dXa.ActionBar.hfeTOA;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                i = C13754dXa.ActionBar.setCurrentKeyboardTarget;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C13754dXa.ActionBar.invokespecialhrnhsO;
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                    if (shapeableImageView2 != null) {
                        i = C13754dXa.ActionBar.setMediaController;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C13754dXa.ActionBar.ActivityViewModelLazyKtviewModelsfactoryPromise2;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C13754dXa.ActionBar.onPictureInPictureModeChanged;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C13754dXa.ActionBar.ComponentActivityExternalSyntheticLambda2;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C13754dXa.ActionBar.ComponentActivity4;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = C13754dXa.ActionBar.getOnBackInvokedDispatcher;
                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = C13754dXa.ActionBar.ComponentActivityReportFullyDrawnExecutor;
                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    return new C16702eos((ConstraintLayout) view, guideline, guideline2, shapeableImageView, shapeableImageView2, imageView, textView, textView2, textView3, textView4, textView5, textView6);
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
