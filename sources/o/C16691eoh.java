package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16691eoh implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C19254fxn KWHzl;
    public final C55244xgL OLrzqt;
    public final C55173xeu copydefault;
    public final ViewPager2 valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C16691eoh(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C19254fxn c19254fxn, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.EZpvd = constraintLayout;
        this.copydefault = c55173xeu;
        this.AEQbTJ = c55113xdn;
        this.OLrzqt = c55244xgL;
        this.KWHzl = c19254fxn;
        this.valueOf = viewPager2;
    }

    public static C16691eoh copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.zFtALg;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C13754dXa.ActionBar.INotificationSideChannelStub;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C13754dXa.ActionBar.newInstance;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    i = C13754dXa.ActionBar.conditional;
                    C19254fxn c19254fxn = (C19254fxn) ViewBindings.findChildViewById(view, i);
                    if (c19254fxn != null) {
                        i = C13754dXa.ActionBar.VisibleForTestingCompanion;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            return new C16691eoh((ConstraintLayout) view, c55173xeu, c55113xdn, c55244xgL, c19254fxn, viewPager2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
