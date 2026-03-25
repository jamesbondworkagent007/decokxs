package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33898nJy implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C55173xeu AYXKKw;
    public final C55173xeu AhwBna;
    public final android.widget.TextView AkhnZx;
    public final RecyclerView DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final C55113xdn valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.fetchVPNInfo;
    }

    public C33898nJy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.fetchVPNInfo = constraintLayout;
        this.OLrzqt = imageView;
        this.AEQbTJ = constraintLayout2;
        this.EZpvd = linearLayout;
        this.KWHzl = view;
        this.copydefault = c52794wYp;
        this.AYXKKw = c55173xeu;
        this.valueOf = c55113xdn;
        this.djBIcL = textView;
        this.AhwBna = c55173xeu2;
        this.gEmmrt = linearLayout2;
        this.DbNXlk = recyclerView;
        this.AkhnZx = textView2;
    }

    public static C33898nJy AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.AxsJAYsNCnLh, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33898nJy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.ejfBZ;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C35399nuc.StateListAnimator.KDccX;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.aJFbMH))) != null) {
                i = C35399nuc.StateListAnimator.fLIjIY;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C35399nuc.StateListAnimator.frkDMe;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C35399nuc.StateListAnimator.DcMfJKsgNvtZ;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C35399nuc.StateListAnimator.DFbvW;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C35399nuc.StateListAnimator.gVEiQJ;
                                C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                if (c55173xeu2 != null) {
                                    i = C35399nuc.StateListAnimator.RFmUsE;
                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = C35399nuc.StateListAnimator.HJWChPOZOJIj;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = C35399nuc.StateListAnimator.QWSkGZ;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                return new C33898nJy(constraintLayout, imageView, constraintLayout, linearLayout, viewFindChildViewById, c52794wYp, c55173xeu, c55113xdn, textView, c55173xeu2, linearLayout2, recyclerView, textView2);
                                            }
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
