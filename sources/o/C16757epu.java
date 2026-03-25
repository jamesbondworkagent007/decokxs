package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16757epu implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final OKRegularCell KWHzl;
    public final C55390xiz OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.AEQbTJ;
    }

    public C16757epu(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull C55390xiz c55390xiz, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.AEQbTJ = oKRegularCell;
        this.OLrzqt = c55390xiz;
        this.KWHzl = oKRegularCell2;
    }

    public static C16757epu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKfbSiEC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16757epu OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DAgZj;
        C55390xiz c55390xiz = (C55390xiz) ViewBindings.findChildViewById(view, i);
        if (c55390xiz != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            return new C16757epu(oKRegularCell, c55390xiz, oKRegularCell);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
