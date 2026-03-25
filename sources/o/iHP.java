package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C25493ixk;

/* JADX INFO: loaded from: classes23.dex */
public final class iHP implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ViewPager2 KWHzl;
    public final C55254xgV OLrzqt;
    public final C55113xdn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public iHP(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = c55254xgV;
        this.KWHzl = viewPager2;
        this.AEQbTJ = c55173xeu;
        this.copydefault = c55113xdn;
    }

    public static iHP AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.iSpHlg;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = C25493ixk.ActionBar.onVolumeInfoChanged;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = C25493ixk.ActionBar.getPackageName;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C25493ixk.ActionBar.getQueueTitle;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        return new iHP((ConstraintLayout) view, c55254xgV, viewPager2, c55173xeu, c55113xdn);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
