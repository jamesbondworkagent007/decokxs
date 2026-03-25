package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36047oNh implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final wYK EZpvd;
    public final C55258xgZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C36047oNh(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.AEQbTJ = linearLayoutCompat;
        this.EZpvd = wyk;
        this.OLrzqt = c55258xgZ;
    }

    public static C36047oNh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.USBtdM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36047oNh KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.cancelAll;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C35964oKf.StateListAnimator.ITrustedWebActivityServiceStub;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                return new C36047oNh((LinearLayoutCompat) view, wyk, c55258xgZ);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
