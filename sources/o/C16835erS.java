package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16835erS implements ViewBinding {
    public final android.widget.Space AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C16835erS(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = linearLayout;
        this.copydefault = c52794wYp;
        this.KWHzl = c52794wYp2;
        this.AEQbTJ = space;
        this.EZpvd = textView;
        this.gEmmrt = textView2;
    }

    public static C16835erS AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.fXHmeK;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.dLBcXg;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C13754dXa.ActionBar.inahnb;
                android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = C13754dXa.ActionBar.ComponentActivityExternalSyntheticLambda3;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C13754dXa.ActionBar.ComponentActivity1;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C16835erS((android.widget.LinearLayout) view, c52794wYp, c52794wYp2, space, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
