package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes23.dex */
public final class nKI implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public nKI(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.EZpvd = linearLayout;
        this.OLrzqt = textView;
        this.KWHzl = textView2;
        this.AEQbTJ = linearLayout2;
    }

    public static nKI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.KDccX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static nKI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.zFZsbn;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C35399nuc.StateListAnimator.QhsCdEQhsCdE;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                return new nKI(linearLayout, textView, textView2, linearLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
