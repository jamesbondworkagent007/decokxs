package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEK implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View EZpvd;
    public final C25255itK KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public hEK(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C25255itK c25255itK, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.EZpvd = view;
        this.KWHzl = c25255itK;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.copydefault = textView3;
        this.djBIcL = textView4;
    }

    public static hEK AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.Dfv, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static hEK AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.RWIpjU;
        C25255itK c25255itK = (C25255itK) ViewBindings.findChildViewById(view, i);
        if (c25255itK != null) {
            i = C23274hvD.Application.setSupportProgressBarIndeterminateVisibility;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C23274hvD.Application.onWindowStartingSupportActionMode;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.setSupportProgressBarIndeterminate;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C23274hvD.Application.setSupportProgress;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new hEK(view, c25255itK, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
