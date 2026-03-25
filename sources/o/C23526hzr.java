package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23526hzr implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.view.View EZpvd;
    public final C55008xbo KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55008xbo copydefault;
    public final android.view.View gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C23526hzr(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view2) {
        this.EZpvd = view;
        this.copydefault = c55008xbo;
        this.KWHzl = c55008xbo2;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.AYXKKw = textView3;
        this.gEmmrt = view2;
    }

    public static C23526hzr EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.aUsmxb, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C23526hzr EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.ORmwhf;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.RSmiaq;
            C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
            if (c55008xbo2 != null) {
                i = C23274hvD.Application.setDrawerArrowDrawable;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.parseItem;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C23274hvD.Application.setAutoMirrored;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.expandActionView))) != null) {
                            return new C23526hzr(view, c55008xbo, c55008xbo2, textView, textView2, textView3, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
