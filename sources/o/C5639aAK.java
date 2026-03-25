package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5639aAK implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C5639aAK(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = linearLayout;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
    }

    public static C5639aAK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.OuxcSI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C5639aAK OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.DQYQgr;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C8206ayP.StateListAnimator.zLAIeZ;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new C5639aAK((android.widget.LinearLayout) view, textView, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
