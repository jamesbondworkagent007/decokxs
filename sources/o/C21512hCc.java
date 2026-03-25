package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21512hCc implements ViewBinding {
    public final C24806ikl AEQbTJ;
    public final C55258xgZ EZpvd;
    public final android.widget.TextView KWHzl;
    public final C24796ikb OLrzqt;
    public final android.view.View copydefault;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C21512hCc(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C24806ikl c24806ikl, @androidx.annotation.NonNull C24796ikb c24796ikb, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.copydefault = view;
        this.AEQbTJ = c24806ikl;
        this.OLrzqt = c24796ikb;
        this.KWHzl = textView;
        this.EZpvd = c55258xgZ;
        this.gEmmrt = constraintLayout;
    }

    public static C21512hCc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.invokespecialgBtXYZ, viewGroup);
        return copydefault(viewGroup);
    }

    public static C21512hCc copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ibnZAm;
        C24806ikl c24806ikl = (C24806ikl) ViewBindings.findChildViewById(view, i);
        if (c24806ikl != null) {
            i = C23274hvD.Application.getFillInIntent;
            C24796ikb c24796ikb = (C24796ikb) ViewBindings.findChildViewById(view, i);
            if (c24796ikb != null) {
                i = C23274hvD.Application.setOnCancelListener;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.createButton;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C23274hvD.Application.parseMenu;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            return new C21512hCc(view, c24806ikl, c24796ikb, textView, c55258xgZ, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
