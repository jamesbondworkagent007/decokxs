package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C43961rzE implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final C52794wYp KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C43961rzE(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = c52794wYp;
        this.EZpvd = linearLayoutCompat2;
        this.copydefault = textView;
        this.AEQbTJ = textView2;
    }

    public static C43961rzE OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.gkJEwt;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            i = C43662rtX.ActionBar.DcMfJKdMCrTj;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C43662rtX.ActionBar.ExKek;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C43961rzE(linearLayoutCompat, c52794wYp, linearLayoutCompat, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
