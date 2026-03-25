package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hHF implements ViewBinding {
    public final C55258xgZ AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C55258xgZ EZpvd;
    public final android.widget.TextView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public hHF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.gEmmrt = constraintLayout;
        this.KWHzl = textView;
        this.copydefault = textView2;
        this.OLrzqt = appCompatTextView;
        this.EZpvd = c55258xgZ;
        this.AEQbTJ = c55258xgZ2;
        this.AYXKKw = textView3;
        this.AhwBna = textView4;
    }

    public static hHF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.zzQwtT;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.iCPUKe;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C23274hvD.Application.iKEqwx;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.applyOptions;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C23274hvD.Application.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21;
                        C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ2 != null) {
                            i = C23274hvD.Application.isEmptyConfiguration;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C23274hvD.Application.SupportActionModeWrapper;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new hHF((ConstraintLayout) view, textView, textView2, appCompatTextView, c55258xgZ, c55258xgZ2, textView3, textView4);
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
