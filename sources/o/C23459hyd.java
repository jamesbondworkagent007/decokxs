package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23459hyd implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final OKAnchorSelection EZpvd;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C23459hyd(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.copydefault = frameLayout;
        this.EZpvd = oKAnchorSelection;
        this.AEQbTJ = c55113xdn;
    }

    public static C23459hyd AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fFgQHt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23459hyd KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DFbvW;
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) ViewBindings.findChildViewById(view, i);
        if (oKAnchorSelection != null) {
            i = C23274hvD.Application.getStateWithUpdatedPosition;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                return new C23459hyd((android.widget.FrameLayout) view, oKAnchorSelection, c55113xdn);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
