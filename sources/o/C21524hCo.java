package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21524hCo implements ViewBinding {
    public final C57682ymy AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C57682ymy KWHzl;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C21524hCo(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C57682ymy c57682ymy, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C57682ymy c57682ymy2) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = c57682ymy;
        this.EZpvd = textView;
        this.KWHzl = c57682ymy2;
    }

    public static C21524hCo KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C21524hCo copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.YFmri, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21524hCo OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.copydefault;
        C57682ymy c57682ymy = (C57682ymy) ViewBindings.findChildViewById(view, i);
        if (c57682ymy != null) {
            i = C23274hvD.Application.djBIcL;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi19;
                C57682ymy c57682ymy2 = (C57682ymy) ViewBindings.findChildViewById(view, i);
                if (c57682ymy2 != null) {
                    return new C21524hCo((ConstraintLayout) view, c57682ymy, textView, c57682ymy2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
