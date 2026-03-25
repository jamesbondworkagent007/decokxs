package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23741iHp implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C55113xdn EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C27389juK copydefault;
    public final android.widget.TextView gEmmrt;
    public final C27192jqZ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C23741iHp(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C27389juK c27389juK, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C27192jqZ c27192jqZ, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = frameLayout;
        this.copydefault = c27389juK;
        this.KWHzl = linearLayoutCompat;
        this.AEQbTJ = c55173xeu;
        this.EZpvd = c55113xdn;
        this.valueOf = c27192jqZ;
        this.gEmmrt = textView;
        this.AhwBna = textView2;
    }

    public static C23741iHp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.iwGUEr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23741iHp OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.dHguZz;
        C27389juK c27389juK = (C27389juK) ViewBindings.findChildViewById(view, i);
        if (c27389juK != null) {
            i = C25493ixk.ActionBar.TarCU;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C25493ixk.ActionBar.DLGVGj;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C25493ixk.ActionBar.invokespecialDaTmkG;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C25493ixk.ActionBar.iFnJKK;
                        C27192jqZ c27192jqZ = (C27192jqZ) ViewBindings.findChildViewById(view, i);
                        if (c27192jqZ != null) {
                            i = C25493ixk.ActionBar.ITrustedWebActivityCallbackDefault;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C25493ixk.ActionBar.MediaBrowserCompatSubscriptionCallback;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new C23741iHp((android.widget.FrameLayout) view, c27389juK, linearLayoutCompat, c55173xeu, c55113xdn, c27192jqZ, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
