package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21648hHd implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final LinearLayoutCompat EZpvd;
    public final android.view.View KWHzl;
    public final C54989xbV OLrzqt;
    public final android.view.View copydefault;
    public final LinearLayoutCompat djBIcL;
    public final android.widget.HorizontalScrollView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AYXKKw;
    }

    public C21648hHd(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.AYXKKw = frameLayout;
        this.OLrzqt = c54989xbV;
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = view;
        this.copydefault = view2;
        this.AEQbTJ = view3;
        this.gEmmrt = horizontalScrollView;
        this.djBIcL = linearLayoutCompat2;
    }

    public static C21648hHd copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OCdtug, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21648hHd AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = C23274hvD.Application.iHkeWl;
        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
        if (c54989xbV != null) {
            i = C23274hvD.Application.DxnCrt;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dNxZaP))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.isElapsedRealtimeNanosAvailable))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.HJWChPdIKEqB))) != null) {
                i = C23274hvD.Application.accessgetOnBackPressedCallbacksp;
                android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                if (horizontalScrollView != null) {
                    i = C23274hvD.Application.OnBackPressedDispatcher;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        return new C21648hHd((android.widget.FrameLayout) view, c54989xbV, linearLayoutCompat, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, horizontalScrollView, linearLayoutCompat2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
