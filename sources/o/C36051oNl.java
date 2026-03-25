package o;

import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36051oNl implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final AppCompatSeekBar OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C36051oNl(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatSeekBar appCompatSeekBar) {
        this.AEQbTJ = frameLayout;
        this.OLrzqt = appCompatSeekBar;
    }

    public static C36051oNl EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.aUsmxb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C36051oNl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.DGUQLI;
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
        if (appCompatSeekBar != null) {
            return new C36051oNl((android.widget.FrameLayout) view, appCompatSeekBar);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
