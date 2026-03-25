package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21666hHv implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final RecyclerView AhwBna;
    public final hHF EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55173xeu OLrzqt;
    public final C55113xdn copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public C21666hHv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull hHF hhf, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AYXKKw = constraintLayout;
        this.EZpvd = hhf;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = imageView;
        this.KWHzl = linearLayout;
        this.copydefault = c55113xdn;
        this.valueOf = textView;
        this.AhwBna = recyclerView;
        this.gEmmrt = textView2;
        this.djBIcL = textView3;
    }

    public static C21666hHv copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zdxASf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21666hHv EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sSMYrx;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            hHF hhfKWHzl = hHF.KWHzl(viewFindChildViewById);
            i = C23274hvD.Application.dXcUrg;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.sTbpmZ;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.getVolumeAttributes;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.getStateWithUpdatedPosition;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C23274hvD.Application.MediaSessionCompatSessionFlags;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.getLifecycleRegistry;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C23274hvD.Application.AlertController;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C23274hvD.Application.setOnItemSelectedListener;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new C21666hHv((ConstraintLayout) view, hhfKWHzl, c55173xeu, imageView, linearLayout, c55113xdn, textView, recyclerView, textView2, textView3);
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
