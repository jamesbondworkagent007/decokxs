package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16739epc implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final OKRegularCell EZpvd;
    public final C55068xcv OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.EZpvd;
    }

    public C16739epc(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull C55068xcv c55068xcv, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.EZpvd = oKRegularCell;
        this.OLrzqt = c55068xcv;
        this.AEQbTJ = oKRegularCell2;
    }

    public static C16739epc EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKDSqxTE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16739epc AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.getFieldNames;
        C55068xcv c55068xcv = (C55068xcv) ViewBindings.findChildViewById(view, i);
        if (c55068xcv != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            return new C16739epc(oKRegularCell, c55068xcv, oKRegularCell);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
