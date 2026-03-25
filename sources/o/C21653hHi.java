package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21653hHi implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final android.view.View AhwBna;
    public final OKSortTextView EZpvd;
    public final OKSortTextView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.view.View copydefault;
    public final OKSortTextView djBIcL;
    public final android.view.View gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C21653hHi(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull OKSortTextView oKSortTextView4) {
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = oKSortTextView;
        this.copydefault = view;
        this.KWHzl = oKSortTextView2;
        this.AEQbTJ = oKSortTextView3;
        this.AhwBna = view2;
        this.gEmmrt = view3;
        this.djBIcL = oKSortTextView4;
    }

    public static C21653hHi OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DtnWsU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21653hHi OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = C23274hvD.Application.ihnvzI;
        OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
        if (oKSortTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.OWSZPf))) != null) {
            i = C23274hvD.Application.onCustomAction;
            OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
            if (oKSortTextView2 != null) {
                i = C23274hvD.Application.setErrorMessage;
                OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.BackHandlerKtBackHandler2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.BackHandlerKtBackHandler11))) != null) {
                    i = C23274hvD.Application.DoNotInline;
                    OKSortTextView oKSortTextView4 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView4 != null) {
                        return new C21653hHi((LinearLayoutCompat) view, oKSortTextView, viewFindChildViewById, oKSortTextView2, oKSortTextView3, viewFindChildViewById2, viewFindChildViewById3, oKSortTextView4);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
