package o;

import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42633raB implements ViewBinding {
    public final Group AEQbTJ;
    public final RecyclerView AYXKKw;
    public final C40499qYc AhwBna;
    public final C55173xeu EZpvd;
    public final C55113xdn KWHzl;
    public final C40499qYc OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView gEmmrt;
    public final androidx.appcompat.widget.Toolbar valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AhwBna;
    }

    public C42633raB(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C40499qYc c40499qYc2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar) {
        this.AhwBna = c40499qYc;
        this.copydefault = c52794wYp;
        this.EZpvd = c55173xeu;
        this.AEQbTJ = group;
        this.KWHzl = c55113xdn;
        this.OLrzqt = c40499qYc2;
        this.AYXKKw = recyclerView;
        this.gEmmrt = textView;
        this.valueOf = toolbar;
    }

    public static C42633raB OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C42633raB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.RdAHlO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42633raB EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DCJXGO;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.fkESqH;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.YFmri;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = qZH.StateListAnimator.pXZxY;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        C40499qYc c40499qYc = (C40499qYc) view;
                        i = qZH.StateListAnimator.onStatusChanged;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = qZH.StateListAnimator.apNKau;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = qZH.StateListAnimator.QezThh;
                                androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ViewBindings.findChildViewById(view, i);
                                if (toolbar != null) {
                                    return new C42633raB(c40499qYc, c52794wYp, c55173xeu, group, c55113xdn, c40499qYc, recyclerView, textView, toolbar);
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
