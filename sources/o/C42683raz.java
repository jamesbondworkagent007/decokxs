package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42683raz implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final RecyclerView AYXKKw;
    public final Group AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.ImageView EZpvd;
    public final C55173xeu KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final C55113xdn djBIcL;
    public final C40499qYc gEmmrt;
    public final androidx.appcompat.widget.Toolbar isConnected;
    public final C40499qYc valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.gEmmrt;
    }

    public C42683raz(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C40499qYc c40499qYc2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar) {
        this.gEmmrt = c40499qYc;
        this.EZpvd = imageView;
        this.copydefault = appCompatTextView;
        this.OLrzqt = appCompatTextView2;
        this.AEQbTJ = view;
        this.KWHzl = c55173xeu;
        this.AhwBna = group;
        this.djBIcL = c55113xdn;
        this.valueOf = c40499qYc2;
        this.AYXKKw = recyclerView;
        this.AkhnZx = textView;
        this.isConnected = toolbar;
    }

    public static C42683raz OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C42683raz KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.hBpjJd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42683raz EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.valueOf;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = qZH.StateListAnimator.AxsJAYsNCnLh;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = qZH.StateListAnimator.zuWLRA;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.hrjNmC))) != null) {
                    i = qZH.StateListAnimator.fkESqH;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = qZH.StateListAnimator.aKhcqp;
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
                                            return new C42683raz(c40499qYc, imageView, appCompatTextView, appCompatTextView2, viewFindChildViewById, c55173xeu, group, c55113xdn, c40499qYc, recyclerView, textView, toolbar);
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
