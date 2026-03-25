package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54962xav implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final C55247xgO OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C54962xav(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull C55247xgO c55247xgO, @androidx.annotation.NonNull android.view.View view4) {
        this.EZpvd = view;
        this.copydefault = view2;
        this.AEQbTJ = linearLayout;
        this.KWHzl = view3;
        this.OLrzqt = c55247xgO;
        this.AYXKKw = view4;
    }

    public static C54962xav OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.dvKsVJ, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C54962xav OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C52761wXj.FragmentManager.AxsJAYaxsJAY;
        android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = C52761wXj.FragmentManager.ixgjPv;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.hrjNmC))) != null) {
                i = C52761wXj.FragmentManager.DLGVGj;
                C55247xgO c55247xgO = (C55247xgO) ViewBindings.findChildViewById(view, i);
                if (c55247xgO != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.RZNAhV))) != null) {
                    return new C54962xav(view, viewFindChildViewById3, linearLayout, viewFindChildViewById, c55247xgO, viewFindChildViewById2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
