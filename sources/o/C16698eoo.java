package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16698eoo implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final AppCompatImageView KWHzl;
    public final wYK OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C16698eoo(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = wyk;
        this.KWHzl = appCompatImageView;
        this.copydefault = view;
        this.djBIcL = textView;
        this.AYXKKw = textView2;
        this.AhwBna = textView3;
        this.gEmmrt = textView4;
        this.valueOf = textView5;
        this.isConnected = textView6;
    }

    public static C16698eoo copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.DGUQLIhJrIAr;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.dIjzlO;
            wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
            if (wyk != null) {
                i = C13754dXa.ActionBar.SePrCP;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.hkDICb))) != null) {
                    i = C13754dXa.ActionBar.fullyDrawnReported;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C13754dXa.ActionBar.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose2;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C13754dXa.ActionBar.ContextAwareHelper;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaVisualMediaType;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C13754dXa.ActionBar.ActivityResultContractsStartActivityForResult;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = C13754dXa.ActionBar.createIntentactivity_release;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            return new C16698eoo((ConstraintLayout) view, c52794wYp, wyk, appCompatImageView, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, textView6);
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
