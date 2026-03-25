package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEU implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final ShapeableImageView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public hEU(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull ShapeableImageView shapeableImageView) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = linearLayout;
        this.copydefault = linearLayout2;
        this.KWHzl = textView;
        this.EZpvd = textView2;
        this.djBIcL = textView3;
        this.AhwBna = textView4;
        this.valueOf = textView5;
        this.gEmmrt = shapeableImageView;
    }

    public static hEU copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OrsvgJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hEU AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.RatingCompatStyle;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.getLegacyAudioStream;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = C23274hvD.Application.ParcelableVolumeInfo;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.PlaybackStateCompatBuilder;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
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
                                        return new hEU((ConstraintLayout) view, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, shapeableImageView);
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
