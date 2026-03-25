package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEP implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final ShapeableImageView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public hEP(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull ShapeableImageView shapeableImageView) {
        this.copydefault = constraintLayout;
        this.EZpvd = textView;
        this.OLrzqt = textView2;
        this.AEQbTJ = linearLayout;
        this.KWHzl = textView3;
        this.djBIcL = textView4;
        this.AhwBna = textView5;
        this.AYXKKw = shapeableImageView;
    }

    public static hEP AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aQtmcU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hEP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ParcelableVolumeInfo;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.PlaybackStateCompatBuilder;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C23274hvD.Application.suggest;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C23274hvD.Application.ChecksSdkIntAtLeast;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C23274hvD.Application.ColorLong;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C23274hvD.Application.lambda;
                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = C23274hvD.Application.ColorRes;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                                if (shapeableImageView != null) {
                                    return new hEP((ConstraintLayout) view, textView, textView2, linearLayout, textView3, textView4, textView5, shapeableImageView);
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
