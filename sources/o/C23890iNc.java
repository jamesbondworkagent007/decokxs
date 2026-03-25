package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23890iNc implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55113xdn copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C23890iNc(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.EZpvd = view;
        this.AEQbTJ = c55113xdn;
        this.copydefault = c55113xdn2;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
        this.valueOf = textView3;
        this.djBIcL = textView4;
        this.AYXKKw = textView5;
        this.AhwBna = textView6;
    }

    public static C23890iNc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.Rtjmuc, viewGroup);
        return copydefault(viewGroup);
    }

    public static C23890iNc copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.gVEiQJ;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C25493ixk.ActionBar.sILrnl;
            C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn2 != null) {
                i = C25493ixk.ActionBar.setDefaultImpl;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C25493ixk.ActionBar.ICustomTabsService;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C25493ixk.ActionBar.onTransact;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C25493ixk.ActionBar.newSessionWithExtras;
                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = C25493ixk.ActionBar.mayLaunchUrl;
                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = C25493ixk.ActionBar.postMessage;
                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        return new C23890iNc(view, c55113xdn, c55113xdn2, textView, textView2, textView3, textView4, textView5, textView6);
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
