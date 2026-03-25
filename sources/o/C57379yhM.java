package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57379yhM implements ViewBinding {
    public final C57485yjM KWHzl;
    public final C55254xgV OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57379yhM(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull C57485yjM c57485yjM) {
        this.copydefault = view;
        this.OLrzqt = c55254xgV;
        this.KWHzl = c57485yjM;
    }

    public static C57379yhM copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.AubY, viewGroup);
        return copydefault(viewGroup);
    }

    public static C57379yhM copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.gwTjWJ;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = C57406yhn.StateListAnimator.dvImUD;
            C57485yjM c57485yjM = (C57485yjM) ViewBindings.findChildViewById(view, i);
            if (c57485yjM != null) {
                return new C57379yhM(view, c55254xgV, c57485yjM);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
