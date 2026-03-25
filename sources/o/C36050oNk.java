package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36050oNk implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final C55239xgG KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C55258xgZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C36050oNk(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = c55239xgG;
        this.copydefault = c55258xgZ;
    }

    public static C36050oNk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QwvEab, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36050oNk KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.hijVBL;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C35964oKf.StateListAnimator.onConnected;
            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
            if (c55239xgG != null) {
                i = C35964oKf.StateListAnimator.setInternalConnectionCallback;
                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                if (c55258xgZ != null) {
                    return new C36050oNk((LinearLayoutCompat) view, appCompatImageView, c55239xgG, c55258xgZ);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
