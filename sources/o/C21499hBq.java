package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21499hBq implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AEQbTJ;
    }

    public C21499hBq(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.AEQbTJ = nestedScrollView;
        this.EZpvd = linearLayout;
    }

    public static C21499hBq AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DKtBnz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21499hBq OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.IMediaControllerCallbackStubProxy;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            return new C21499hBq((NestedScrollView) view, linearLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
