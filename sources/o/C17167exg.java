package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17167exg implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final wYC EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final wYC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C17167exg(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2) {
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = linearLayoutCompat2;
        this.AEQbTJ = linearLayoutCompat3;
        this.copydefault = wyc;
        this.EZpvd = wyc2;
    }

    public static C17167exg copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.OEsIKP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C17167exg AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DlABUU;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C13754dXa.ActionBar.getAdvertisingId;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = C13754dXa.ActionBar.setProfilesSinceInitCount;
                wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                if (wyc != null) {
                    i = C13754dXa.ActionBar.OCdtug;
                    wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc2 != null) {
                        return new C17167exg((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, wyc, wyc2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
