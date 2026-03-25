package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8262azS implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final SimpleToolBar KWHzl;
    public final C5679aAy OLrzqt;
    public final C5678aAx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C8262azS(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull C5679aAy c5679aAy, @androidx.annotation.NonNull C5678aAx c5678aAx) {
        this.EZpvd = linearLayout;
        this.KWHzl = simpleToolBar;
        this.OLrzqt = c5679aAy;
        this.copydefault = c5678aAx;
    }

    public static C8262azS OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.finit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C8262azS copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8206ayP.StateListAnimator.DrqXHJ))) != null) {
            C5679aAy c5679aAyOLrzqt = C5679aAy.OLrzqt(viewFindChildViewById);
            int i2 = C8206ayP.StateListAnimator.DGUQLIhJrIAr;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new C8262azS((android.widget.LinearLayout) view, simpleToolBar, c5679aAyOLrzqt, C5678aAx.OLrzqt(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
