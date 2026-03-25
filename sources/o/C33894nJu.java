package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33894nJu implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C52794wYp AYXKKw;
    public final C55173xeu AhwBna;
    public final NestedScrollView DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.view.View copydefault;
    public final C55113xdn djBIcL;
    public final NestedScrollView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.gEmmrt;
    }

    public C33894nJu(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull NestedScrollView nestedScrollView2, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.gEmmrt = nestedScrollView;
        this.OLrzqt = imageView;
        this.AEQbTJ = recyclerView;
        this.KWHzl = constraintLayout;
        this.EZpvd = linearLayout;
        this.copydefault = view;
        this.AYXKKw = c52794wYp;
        this.AhwBna = c55173xeu;
        this.djBIcL = c55113xdn;
        this.valueOf = textView;
        this.DbNXlk = nestedScrollView2;
        this.values = textView2;
    }

    public static C33894nJu AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.RlQdEF, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33894nJu OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.ejfBZ;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C35399nuc.StateListAnimator.QSLkRj;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C35399nuc.StateListAnimator.DCUTEIddSDPG;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C35399nuc.StateListAnimator.KDccX;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.aJFbMH))) != null) {
                        i = C35399nuc.StateListAnimator.fLIjIY;
                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp != null) {
                            i = C35399nuc.StateListAnimator.tIwhY;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C35399nuc.StateListAnimator.DcMfJKsgNvtZ;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C35399nuc.StateListAnimator.DFbvW;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                        i = C35399nuc.StateListAnimator.QWSkGZ;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new C33894nJu(nestedScrollView, imageView, recyclerView, constraintLayout, linearLayout, viewFindChildViewById, c52794wYp, c55173xeu, c55113xdn, textView, nestedScrollView, textView2);
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
