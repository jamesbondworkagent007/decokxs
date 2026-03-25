package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21560hDx implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C33546myW AYXKKw;
    public final C33603mza EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C22349hdg copydefault;
    public final android.view.View djBIcL;
    public final C22288hcY valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C21560hDx(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull C22349hdg c22349hdg, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C22288hcY c22288hcY, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.djBIcL = view;
        this.KWHzl = frameLayout;
        this.AEQbTJ = frameLayout2;
        this.OLrzqt = frameLayout3;
        this.copydefault = c22349hdg;
        this.EZpvd = c33603mza;
        this.valueOf = c22288hcY;
        this.AYXKKw = c33546myW;
    }

    public static C21560hDx AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.DfrfUJ, viewGroup);
        return copydefault(viewGroup);
    }

    public static C21560hDx copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcMfJKDGTeJD;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.sCB;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = C23274hvD.Application.fcfzuX;
                android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout3 != null) {
                    i = C23274hvD.Application.playFromUri;
                    C22349hdg c22349hdg = (C22349hdg) ViewBindings.findChildViewById(view, i);
                    if (c22349hdg != null) {
                        i = C23274hvD.Application.lambdanew0;
                        C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                        if (c33603mza != null) {
                            i = C23274hvD.Application.setEnabledChangedCallbackactivity_release;
                            C22288hcY c22288hcY = (C22288hcY) ViewBindings.findChildViewById(view, i);
                            if (c22288hcY != null) {
                                i = C23274hvD.Application.LocalActivityResultRegistryOwner;
                                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                if (c33546myW != null) {
                                    return new C21560hDx(view, frameLayout, frameLayout2, frameLayout3, c22349hdg, c33603mza, c22288hcY, c33546myW);
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
