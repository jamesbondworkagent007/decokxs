package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23491hzI implements ViewBinding {
    public final OKAnchorSelection KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C23491hzI(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.OLrzqt = frameLayout;
        this.KWHzl = oKAnchorSelection;
        this.copydefault = frameLayout2;
    }

    public static C23491hzI copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.WS, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23491hzI EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.djSkpj;
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) ViewBindings.findChildViewById(view, i);
        if (oKAnchorSelection != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            return new C23491hzI(frameLayout, oKAnchorSelection, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
