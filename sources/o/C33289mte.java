package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33289mte implements ViewBinding {
    public final C55178xez AEQbTJ;
    public final C55113xdn EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final Group copydefault;
    public final ConstraintLayout djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C33289mte(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55178xez c55178xez) {
        this.djBIcL = constraintLayout;
        this.copydefault = group;
        this.EZpvd = c55113xdn;
        this.KWHzl = constraintLayout2;
        this.OLrzqt = textView;
        this.AEQbTJ = c55178xez;
    }

    public static C33289mte EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C33289mte copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C33160mrH.Application.OLrzqt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33289mte EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C33160mrH.StateListAnimator.fIwbmz;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = C33160mrH.StateListAnimator.AuCTel;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C33160mrH.StateListAnimator.fARcdN;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C33160mrH.StateListAnimator.uzCIH;
                    C55178xez c55178xez = (C55178xez) ViewBindings.findChildViewById(view, i);
                    if (c55178xez != null) {
                        return new C33289mte(constraintLayout, group, c55113xdn, constraintLayout, textView, c55178xez);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
