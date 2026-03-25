package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21610hFt implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final android.widget.LinearLayout AhwBna;
    public final OKRegularCell EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final OKRegularCell OLrzqt;
    public final OKRegularCell copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public C21610hFt(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull OKRegularCell oKRegularCell3, @androidx.annotation.NonNull OKRegularCell oKRegularCell4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.AhwBna = linearLayout;
        this.OLrzqt = oKRegularCell;
        this.copydefault = oKRegularCell2;
        this.EZpvd = oKRegularCell3;
        this.AEQbTJ = oKRegularCell4;
        this.KWHzl = linearLayout2;
    }

    public static C21610hFt EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.hKJZrr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21610hFt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OgHfcT;
        OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
        if (oKRegularCell != null) {
            i = C23274hvD.Application.QiTXOm;
            OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell2 != null) {
                i = C23274hvD.Application.QnnRaN;
                OKRegularCell oKRegularCell3 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                if (oKRegularCell3 != null) {
                    i = C23274hvD.Application.OrsvgJ;
                    OKRegularCell oKRegularCell4 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                    if (oKRegularCell4 != null) {
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                        return new C21610hFt(linearLayout, oKRegularCell, oKRegularCell2, oKRegularCell3, oKRegularCell4, linearLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
