package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16711epA implements ViewBinding {
    public final C55068xcv AEQbTJ;
    public final OKRegularCell EZpvd;
    public final OKRegularCell OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.EZpvd;
    }

    public C16711epA(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull C55068xcv c55068xcv, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.EZpvd = oKRegularCell;
        this.AEQbTJ = c55068xcv;
        this.OLrzqt = oKRegularCell2;
    }

    public static C16711epA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.XW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16711epA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.getFieldNames;
        C55068xcv c55068xcv = (C55068xcv) ViewBindings.findChildViewById(view, i);
        if (c55068xcv != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            return new C16711epA(oKRegularCell, c55068xcv, oKRegularCell);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
