package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16482ekk implements ViewBinding {
    public final OKAnchorSelection AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C16482ekk(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.KWHzl = frameLayout;
        this.AEQbTJ = oKAnchorSelection;
        this.EZpvd = frameLayout2;
    }

    public static C16482ekk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DBxZfM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16482ekk copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.hUfVAv;
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) ViewBindings.findChildViewById(view, i);
        if (oKAnchorSelection != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            return new C16482ekk(frameLayout, oKAnchorSelection, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
