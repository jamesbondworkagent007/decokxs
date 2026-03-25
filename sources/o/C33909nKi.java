package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33909nKi implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final CardView DbNXlk;
    public final C55173xeu EZpvd;
    public final C55258xgZ KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final OKRegularCell djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final C55113xdn isConnected;
    public final android.widget.TextView valueOf;
    public final NestedScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.values;
    }

    public C33909nKi(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.values = nestedScrollView;
        this.copydefault = constraintLayout;
        this.OLrzqt = textView;
        this.AEQbTJ = view;
        this.EZpvd = c55173xeu;
        this.KWHzl = c55258xgZ;
        this.djBIcL = oKRegularCell;
        this.AhwBna = textView2;
        this.gEmmrt = textView3;
        this.valueOf = textView4;
        this.AYXKKw = textView5;
        this.fetchVPNInfo = textView6;
        this.DbNXlk = cardView;
        this.isConnected = c55113xdn;
    }

    public static C33909nKi copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.aUsmxb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33909nKi OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.KDccX;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C35399nuc.StateListAnimator.RXzakW;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.aJFbMH))) != null) {
                i = C35399nuc.StateListAnimator.sTzBva;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C35399nuc.StateListAnimator.invokespecialDaTmkG;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C35399nuc.StateListAnimator.GCXiNH;
                        OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                        if (oKRegularCell != null) {
                            i = C35399nuc.StateListAnimator.getLocation;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C35399nuc.StateListAnimator.unregister;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C35399nuc.StateListAnimator.GiPPlLQAswws;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = C35399nuc.StateListAnimator.zvzmfz;
                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = C35399nuc.StateListAnimator.gZKUVK;
                                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                i = C35399nuc.StateListAnimator.uLLnq;
                                                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                if (cardView != null) {
                                                    i = C35399nuc.StateListAnimator.getUriFromString;
                                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                    if (c55113xdn != null) {
                                                        return new C33909nKi((NestedScrollView) view, constraintLayout, textView, viewFindChildViewById, c55173xeu, c55258xgZ, oKRegularCell, textView2, textView3, textView4, textView5, textView6, cardView, c55113xdn);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
