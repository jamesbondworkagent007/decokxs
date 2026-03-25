package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C34669ngU;

/* JADX INFO: renamed from: o.ngZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34674ngZ implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.ProgressBar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C34674ngZ(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = frameLayout;
        this.copydefault = progressBar;
        this.AEQbTJ = textView;
    }

    public static C34674ngZ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C34669ngU.StateListAnimator.OLrzqt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C34674ngZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C34669ngU.TaskDescription.AEQbTJ;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = C34669ngU.TaskDescription.OLrzqt;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C34674ngZ((android.widget.FrameLayout) view, progressBar, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
