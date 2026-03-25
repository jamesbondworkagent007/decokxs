package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21606hFp implements ViewBinding {
    public final C33537myN EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final LinearLayoutCompat OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C21606hFp(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout) {
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = c33537myN;
        this.KWHzl = frameLayout;
    }

    public static C21606hFp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C21606hFp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DXd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21606hFp OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dxcTrN;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C23274hvD.Application.QWpYiD;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                return new C21606hFp((LinearLayoutCompat) view, c33537myN, frameLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
