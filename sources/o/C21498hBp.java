package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21498hBp implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final ViewPager2 AhwBna;
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final C21559hDw OLrzqt;
    public final C55173xeu copydefault;
    public final C55254xgV djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C21498hBp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C21559hDw c21559hDw, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.KWHzl = constraintLayout;
        this.copydefault = c55173xeu;
        this.EZpvd = imageView;
        this.AEQbTJ = linearLayout;
        this.OLrzqt = c21559hDw;
        this.djBIcL = c55254xgV;
        this.AhwBna = viewPager2;
    }

    public static C21498hBp KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.sZqaRl;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.onConnectionSuspended;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.playFromUri;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.fromMediaSession))) != null) {
                    C21559hDw c21559hDwCopydefault = C21559hDw.copydefault(viewFindChildViewById);
                    i = C23274hvD.Application.getResultCode;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = C23274hvD.Application.setTooltipText;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            return new C21498hBp((ConstraintLayout) view, c55173xeu, imageView, linearLayout, c21559hDwCopydefault, c55254xgV, viewPager2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
