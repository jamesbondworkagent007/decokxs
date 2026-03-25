package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C17018euq implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout EZpvd;
    public final AppCompatImageView KWHzl;
    public final C57440yiU OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C17018euq(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull C57440yiU c57440yiU, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.valueOf = linearLayout;
        this.AEQbTJ = c52794wYp;
        this.copydefault = c52794wYp2;
        this.OLrzqt = c57440yiU;
        this.EZpvd = constraintLayout;
        this.KWHzl = appCompatImageView;
        this.djBIcL = textView;
        this.gEmmrt = textView2;
        this.AYXKKw = textView3;
    }

    public static C17018euq EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iPSTqm;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.fBE;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C13754dXa.ActionBar.invokespecialdPnHjp;
                C57440yiU c57440yiU = (C57440yiU) ViewBindings.findChildViewById(view, i);
                if (c57440yiU != null) {
                    i = C13754dXa.ActionBar.toString;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C13754dXa.ActionBar.registerCallbackMessenger;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = C13754dXa.ActionBar.FullyDrawnReporterKtreportWhenComplete1;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C13754dXa.ActionBar.getContract;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C13754dXa.ActionBar.launchUnit;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new C17018euq((android.widget.LinearLayout) view, c52794wYp, c52794wYp2, c57440yiU, constraintLayout, appCompatImageView, textView, textView2, textView3);
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
