package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36082oOp implements ViewBinding {
    public final FlexboxLayout AEQbTJ;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C36082oOp(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull FlexboxLayout flexboxLayout) {
        this.OLrzqt = view;
        this.KWHzl = constraintLayout;
        this.AEQbTJ = flexboxLayout;
    }

    public static C36082oOp EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.zKcAg, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C36082oOp OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.hvKCwS;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C35964oKf.StateListAnimator.setDefaultImpl;
            FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
            if (flexboxLayout != null) {
                return new C36082oOp(view, constraintLayout, flexboxLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
