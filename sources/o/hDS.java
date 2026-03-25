package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDS implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final C55239xgG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public hDS(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull C55239xgG c55239xgG) {
        this.EZpvd = linearLayoutCompat;
        this.AEQbTJ = oKRegularCell;
        this.copydefault = c55239xgG;
    }

    public static hDS KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gCZUJG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hDS OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gxJrGF;
        OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
        if (oKRegularCell != null) {
            i = C23274hvD.Application.ReportDrawnKtReportDrawnWhen2;
            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
            if (c55239xgG != null) {
                return new hDS((LinearLayoutCompat) view, oKRegularCell, c55239xgG);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
