package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48330uNm implements ViewBinding {
    public final C47988uAv AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C48330uNm(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C47988uAv c47988uAv, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = c47988uAv;
        this.copydefault = recyclerView;
        this.EZpvd = textView;
        this.OLrzqt = textView2;
    }

    public static C48330uNm EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.isDevMode;
        C47988uAv c47988uAv = (C47988uAv) ViewBindings.findChildViewById(view, i);
        if (c47988uAv != null) {
            i = C48033uCm.Application.r8lambda9oQ81VFq3e0CkAqj9HHhVQeVeY;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C48033uCm.Application.getListView;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C48033uCm.Application.AlertControllerCheckedItemAdapter;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new C48330uNm((ConstraintLayout) view, c47988uAv, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
