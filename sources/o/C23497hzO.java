package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23497hzO implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final LinearLayoutCompat AhwBna;
    public final OKRegularCell EZpvd;
    public final OKRegularCell KWHzl;
    public final OKRegularCell OLrzqt;
    public final OKRegularCell copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AhwBna;
    }

    public C23497hzO(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull OKRegularCell oKRegularCell3, @androidx.annotation.NonNull OKRegularCell oKRegularCell4, @androidx.annotation.NonNull OKRegularCell oKRegularCell5, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AhwBna = linearLayoutCompat;
        this.AEQbTJ = oKRegularCell;
        this.EZpvd = oKRegularCell2;
        this.KWHzl = oKRegularCell3;
        this.OLrzqt = oKRegularCell4;
        this.copydefault = oKRegularCell5;
        this.gEmmrt = textView;
        this.djBIcL = textView2;
    }

    public static C23497hzO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DWgRXt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23497hzO KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onComplete;
        OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
        if (oKRegularCell != null) {
            i = C23274hvD.Application.DsL;
            OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell2 != null) {
                i = C23274hvD.Application.DcMfJKdMCrTj;
                OKRegularCell oKRegularCell3 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                if (oKRegularCell3 != null) {
                    i = C23274hvD.Application.DlmWDR;
                    OKRegularCell oKRegularCell4 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                    if (oKRegularCell4 != null) {
                        i = C23274hvD.Application.iUnTnt;
                        OKRegularCell oKRegularCell5 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                        if (oKRegularCell5 != null) {
                            i = C23274hvD.Application.RequiresApi;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.setLogo;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new C23497hzO((LinearLayoutCompat) view, oKRegularCell, oKRegularCell2, oKRegularCell3, oKRegularCell4, oKRegularCell5, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
