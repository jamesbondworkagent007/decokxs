package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8285azp implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final OKRegularCell AYXKKw;
    public final OKRegularCell AhwBna;
    public final OKRegularCell EZpvd;
    public final OKRegularCell KWHzl;
    public final android.view.View OLrzqt;
    public final OKRegularCell copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final OKRegularCell gEmmrt;
    public final OKRegularCell isConnected;
    public final OKRegularCell valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.djBIcL;
    }

    public C8285azp(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull OKRegularCell oKRegularCell3, @androidx.annotation.NonNull OKRegularCell oKRegularCell4, @androidx.annotation.NonNull OKRegularCell oKRegularCell5, @androidx.annotation.NonNull OKRegularCell oKRegularCell6, @androidx.annotation.NonNull OKRegularCell oKRegularCell7, @androidx.annotation.NonNull OKRegularCell oKRegularCell8, @androidx.annotation.NonNull OKRegularCell oKRegularCell9) {
        this.djBIcL = linearLayout;
        this.OLrzqt = view;
        this.copydefault = oKRegularCell;
        this.AEQbTJ = oKRegularCell2;
        this.KWHzl = oKRegularCell3;
        this.EZpvd = oKRegularCell4;
        this.AYXKKw = oKRegularCell5;
        this.gEmmrt = oKRegularCell6;
        this.AhwBna = oKRegularCell7;
        this.valueOf = oKRegularCell8;
        this.isConnected = oKRegularCell9;
    }

    public static C8285azp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C8285azp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.uzCIH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C8285azp AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.DAIeex;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C8206ayP.StateListAnimator.DXXBbs;
            OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell != null) {
                i = C8206ayP.StateListAnimator.DCUTEI;
                OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                if (oKRegularCell2 != null) {
                    i = C8206ayP.StateListAnimator.OHqIaq;
                    OKRegularCell oKRegularCell3 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                    if (oKRegularCell3 != null) {
                        i = C8206ayP.StateListAnimator.Ufzxmz;
                        OKRegularCell oKRegularCell4 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                        if (oKRegularCell4 != null) {
                            i = C8206ayP.StateListAnimator.dLBcXg;
                            OKRegularCell oKRegularCell5 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                            if (oKRegularCell5 != null) {
                                i = C8206ayP.StateListAnimator.fXHmeK;
                                OKRegularCell oKRegularCell6 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                                if (oKRegularCell6 != null) {
                                    i = C8206ayP.StateListAnimator.zlvcHA;
                                    OKRegularCell oKRegularCell7 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                                    if (oKRegularCell7 != null) {
                                        i = C8206ayP.StateListAnimator.getPriority;
                                        OKRegularCell oKRegularCell8 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                                        if (oKRegularCell8 != null) {
                                            i = C8206ayP.StateListAnimator.invokespecialRuDPQV;
                                            OKRegularCell oKRegularCell9 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                                            if (oKRegularCell9 != null) {
                                                return new C8285azp((android.widget.LinearLayout) view, viewFindChildViewById, oKRegularCell, oKRegularCell2, oKRegularCell3, oKRegularCell4, oKRegularCell5, oKRegularCell6, oKRegularCell7, oKRegularCell8, oKRegularCell9);
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
