package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C5656aAb implements ViewBinding {
    public final C5631aAC AEQbTJ;
    public final C5634aAF EZpvd;
    public final SimpleToolBar KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C5630aAB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C5656aAb(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull C5630aAB c5630aAB, @androidx.annotation.NonNull C5631aAC c5631aAC, @androidx.annotation.NonNull C5634aAF c5634aAF) {
        this.OLrzqt = linearLayout;
        this.KWHzl = simpleToolBar;
        this.copydefault = c5630aAB;
        this.AEQbTJ = c5631aAC;
        this.EZpvd = c5634aAF;
    }

    public static C5656aAb OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.fFgQHt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C5656aAb EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8206ayP.StateListAnimator.DrqXHJ))) != null) {
            C5630aAB c5630aABEZpvd = C5630aAB.EZpvd(viewFindChildViewById);
            i = C8206ayP.StateListAnimator.DGUQLIhJrIAr;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                C5631aAC c5631aACOLrzqt = C5631aAC.OLrzqt(viewFindChildViewById2);
                i = C8206ayP.StateListAnimator.frkDMe;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    return new C5656aAb((android.widget.LinearLayout) view, simpleToolBar, c5630aABEZpvd, c5631aACOLrzqt, C5634aAF.KWHzl(viewFindChildViewById3));
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
