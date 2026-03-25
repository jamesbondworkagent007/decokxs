package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36057oNr implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C36057oNr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.gEmmrt = constraintLayout;
        this.KWHzl = linearLayout;
        this.OLrzqt = constraintLayout2;
        this.AEQbTJ = imageView;
        this.EZpvd = textView;
        this.copydefault = textView2;
        this.AhwBna = appCompatTextView;
        this.valueOf = textView3;
        this.djBIcL = textView4;
    }

    public static C36057oNr KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.ixgjPv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36057oNr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.Ohcwxs;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C35964oKf.StateListAnimator.RjCdvpRjCdvp;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C35964oKf.StateListAnimator.onAvailable;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35964oKf.StateListAnimator.fObYrO;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C35964oKf.StateListAnimator.iSpHlg;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C35964oKf.StateListAnimator.sendCustomAction;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = C35964oKf.StateListAnimator.setPlaybackState;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C35964oKf.StateListAnimator.setPlaybackToLocal;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new C36057oNr((ConstraintLayout) view, linearLayout, constraintLayout, imageView, textView, textView2, appCompatTextView, textView3, textView4);
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
