package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16616enL implements ViewBinding {
    public final OKAnchorSelection AEQbTJ;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C16616enL(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection) {
        this.OLrzqt = frameLayout;
        this.AEQbTJ = oKAnchorSelection;
    }

    public static C16616enL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.invokespecialODCBUN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16616enL copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.hUfVAv;
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) ViewBindings.findChildViewById(view, i);
        if (oKAnchorSelection != null) {
            return new C16616enL((android.widget.FrameLayout) view, oKAnchorSelection);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
