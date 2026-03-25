package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57455yij implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C57455yij(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = view;
        this.AEQbTJ = textView;
        this.KWHzl = linearLayout;
        this.EZpvd = textView2;
    }

    public static C57455yij OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.QfsBiF, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C57455yij EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.fARcdN;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C57406yhn.StateListAnimator.DCJXGO;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C57406yhn.StateListAnimator.QVsKAR;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C57455yij(view, textView, linearLayout, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
