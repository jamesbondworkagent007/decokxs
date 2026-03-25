package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54926xaL implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final OKSortTextView EZpvd;
    public final OKSortTextView KWHzl;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C54926xaL(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3) {
        this.copydefault = view;
        this.AEQbTJ = oKSortTextView;
        this.EZpvd = oKSortTextView2;
        this.KWHzl = oKSortTextView3;
    }

    public static C54926xaL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.AxsJAYsNCnLh, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C54926xaL AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.QwvEab;
        OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
        if (oKSortTextView != null) {
            i = C52761wXj.FragmentManager.DWgRXt;
            OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
            if (oKSortTextView2 != null) {
                i = C52761wXj.FragmentManager.RXzakW;
                OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView3 != null) {
                    return new C54926xaL(view, oKSortTextView, oKSortTextView2, oKSortTextView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
