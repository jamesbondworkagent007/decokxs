package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42784rcu implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final C40499qYc AhwBna;
    public final C28005kLj EZpvd;
    public final Group KWHzl;
    public final C28005kLj OLrzqt;
    public final C55173xeu copydefault;
    public final RecyclerView djBIcL;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AhwBna;
    }

    public C42784rcu(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C28005kLj c28005kLj, @androidx.annotation.NonNull C28005kLj c28005kLj2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.AhwBna = c40499qYc;
        this.copydefault = c55173xeu;
        this.KWHzl = group;
        this.AEQbTJ = c55113xdn;
        this.EZpvd = c28005kLj;
        this.OLrzqt = c28005kLj2;
        this.djBIcL = recyclerView;
        this.valueOf = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
    }

    public static C42784rcu AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fkESqH;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.YFmri;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = qZH.StateListAnimator.pXZxY;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = qZH.StateListAnimator.DVmcag;
                    C28005kLj c28005kLj = (C28005kLj) ViewBindings.findChildViewById(view, i);
                    if (c28005kLj != null) {
                        i = qZH.StateListAnimator.sZqaRl;
                        C28005kLj c28005kLj2 = (C28005kLj) ViewBindings.findChildViewById(view, i);
                        if (c28005kLj2 != null) {
                            i = qZH.StateListAnimator.onStatusChanged;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = qZH.StateListAnimator.dHAKvv;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = qZH.StateListAnimator.MediaBrowserCompatItemCallbackItemCallbackApi23;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        return new C42784rcu((C40499qYc) view, c55173xeu, group, c55113xdn, c28005kLj, c28005kLj2, recyclerView, appCompatTextView, appCompatTextView2);
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
