package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21558hDv implements ViewBinding {
    public final android.view.View KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.HorizontalScrollView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C21558hDv(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView) {
        this.OLrzqt = linearLayout;
        this.KWHzl = view;
        this.copydefault = horizontalScrollView;
    }

    public static C21558hDv OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DlmWDR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21558hDv EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sJPPOI;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.QezThh;
            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
            if (horizontalScrollView != null) {
                return new C21558hDv((android.widget.LinearLayout) view, viewFindChildViewById, horizontalScrollView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
