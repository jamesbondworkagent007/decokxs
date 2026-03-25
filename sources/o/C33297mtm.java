package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mtm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33297mtm implements ViewBinding {
    public final C33302mtr AEQbTJ;
    public final C33302mtr EZpvd;
    public final C33302mtr KWHzl;
    public final C33302mtr OLrzqt;
    public final C33302mtr copydefault;
    public final android.widget.LinearLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.gEmmrt;
    }

    public C33297mtm(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33302mtr c33302mtr, @androidx.annotation.NonNull C33302mtr c33302mtr2, @androidx.annotation.NonNull C33302mtr c33302mtr3, @androidx.annotation.NonNull C33302mtr c33302mtr4, @androidx.annotation.NonNull C33302mtr c33302mtr5) {
        this.gEmmrt = linearLayout;
        this.copydefault = c33302mtr;
        this.AEQbTJ = c33302mtr2;
        this.OLrzqt = c33302mtr3;
        this.KWHzl = c33302mtr4;
        this.EZpvd = c33302mtr5;
    }

    public static C33297mtm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C33160mrH.Application.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33297mtm EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C33160mrH.StateListAnimator.AhwBna;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C33302mtr c33302mtrEZpvd = C33302mtr.EZpvd(viewFindChildViewById);
            i = C33160mrH.StateListAnimator.djBIcL;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                C33302mtr c33302mtrEZpvd2 = C33302mtr.EZpvd(viewFindChildViewById2);
                i = C33160mrH.StateListAnimator.AYXKKw;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    C33302mtr c33302mtrEZpvd3 = C33302mtr.EZpvd(viewFindChildViewById3);
                    i = C33160mrH.StateListAnimator.valueOf;
                    android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        C33302mtr c33302mtrEZpvd4 = C33302mtr.EZpvd(viewFindChildViewById4);
                        i = C33160mrH.StateListAnimator.fetchVPNInfo;
                        android.view.View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                        if (viewFindChildViewById5 != null) {
                            return new C33297mtm((android.widget.LinearLayout) view, c33302mtrEZpvd, c33302mtrEZpvd2, c33302mtrEZpvd3, c33302mtrEZpvd4, C33302mtr.EZpvd(viewFindChildViewById5));
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
