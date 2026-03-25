package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uNQ implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final C52794wYp EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public uNQ(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = c52794wYp;
        this.KWHzl = linearLayoutCompat2;
        this.EZpvd = c52794wYp2;
    }

    public static uNQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OqFWZa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uNQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.hPlhRW;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            int i2 = C48033uCm.Application.getSelectedNavigationIndex;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i2);
            if (c52794wYp2 != null) {
                return new uNQ(linearLayoutCompat, c52794wYp, linearLayoutCompat, c52794wYp2);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
