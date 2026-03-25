package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36060oNu implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final NestedScrollView AYXKKw;
    public final OKSortTextView EZpvd;
    public final OKSortTextView KWHzl;
    public final C55173xeu OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final RecyclerView gEmmrt;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AYXKKw;
    }

    public C36060oNu(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AYXKKw = nestedScrollView;
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = oKSortTextView;
        this.EZpvd = oKSortTextView2;
        this.KWHzl = oKSortTextView3;
        this.valueOf = linearLayoutCompat2;
        this.gEmmrt = recyclerView;
    }

    public static C36060oNu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DWgRXt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C36060oNu copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.tIwhY;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C35964oKf.StateListAnimator.invokespecialgBtXYZ;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35964oKf.StateListAnimator.HJWChPOZOJIj;
                OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView != null) {
                    i = C35964oKf.StateListAnimator.QfZsXX;
                    OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView2 != null) {
                        i = C35964oKf.StateListAnimator.iWlNch;
                        OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                        if (oKSortTextView3 != null) {
                            i = C35964oKf.StateListAnimator.RZMhtF;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = C35964oKf.StateListAnimator.newSession;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    return new C36060oNu((NestedScrollView) view, linearLayoutCompat, c55173xeu, oKSortTextView, oKSortTextView2, oKSortTextView3, linearLayoutCompat2, recyclerView);
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
