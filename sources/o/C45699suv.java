package o;

import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C45697sut;

/* JADX INFO: renamed from: o.suv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45699suv implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final CardView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.OLrzqt;
    }

    public C45699suv(@androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C52794wYp c52794wYp) {
        this.OLrzqt = cardView;
        this.KWHzl = textView;
        this.copydefault = textView2;
        this.EZpvd = textView3;
        this.AEQbTJ = c52794wYp;
    }

    public static C45699suv KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C45697sut.StateListAnimator.OLrzqt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C45699suv EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C45697sut.Activity.values;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C45697sut.Activity.fetchVPNInfo;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C45697sut.Activity.AkhnZx;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C45697sut.Activity.QOLQEE;
                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp != null) {
                        return new C45699suv((CardView) view, textView, textView2, textView3, c52794wYp);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
