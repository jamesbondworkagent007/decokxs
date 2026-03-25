package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23387hxK implements ViewBinding {
    public final C55239xgG EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23387hxK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = constraintLayout;
        this.EZpvd = c55239xgG;
        this.KWHzl = textView;
    }

    public static C23387hxK EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zuBGHE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23387hxK AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DDjgSw;
        C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
        if (c55239xgG != null) {
            i = C23274hvD.Application.onTabReselected;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C23387hxK((ConstraintLayout) view, c55239xgG, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
