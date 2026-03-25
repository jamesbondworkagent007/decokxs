package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16801eql implements ViewBinding {
    public final C55067xcu EZpvd;
    public final OKRegularCell KWHzl;
    public final OKRegularCell copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.KWHzl;
    }

    public C16801eql(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull C55067xcu c55067xcu, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.KWHzl = oKRegularCell;
        this.EZpvd = c55067xcu;
        this.copydefault = oKRegularCell2;
    }

    public static C16801eql EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.hdpuIA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16801eql OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.getFieldNames;
        C55067xcu c55067xcu = (C55067xcu) ViewBindings.findChildViewById(view, i);
        if (c55067xcu != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            return new C16801eql(oKRegularCell, c55067xcu, oKRegularCell);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
