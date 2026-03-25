package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36092oOz implements ViewBinding {
    public final C34646nfy AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C55008xbo OLrzqt;
    public final C55008xbo copydefault;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public C36092oOz(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull C34646nfy c34646nfy, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = c55008xbo;
        this.KWHzl = linearLayoutCompat2;
        this.copydefault = c55008xbo2;
        this.AEQbTJ = c34646nfy;
        this.gEmmrt = appCompatTextView;
    }

    public static C36092oOz OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.getLabel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C36092oOz EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.iHkeWl;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C35964oKf.StateListAnimator.invokespecialDaTmkG;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C35964oKf.StateListAnimator.iqMDAV;
                C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo2 != null) {
                    i = C35964oKf.StateListAnimator.sCB;
                    C34646nfy c34646nfy = (C34646nfy) ViewBindings.findChildViewById(view, i);
                    if (c34646nfy != null) {
                        i = C35964oKf.StateListAnimator.fromRating;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            return new C36092oOz((LinearLayoutCompat) view, c55008xbo, linearLayoutCompat, c55008xbo2, c34646nfy, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
