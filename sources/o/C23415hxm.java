package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23415hxm implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final OKRegularCell EZpvd;
    public final C55239xgG KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C23415hxm(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55239xgG c55239xgG) {
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = oKRegularCell;
        this.copydefault = textView;
        this.KWHzl = c55239xgG;
    }

    public static C23415hxm KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23415hxm EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ULRxlR;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.DKtBnz;
            OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell != null) {
                i = C23274hvD.Application.isScanInProgress;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.ReportDrawnKtReportDrawnWhen1;
                    C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                    if (c55239xgG != null) {
                        return new C23415hxm((LinearLayoutCompat) view, c52794wYp, oKRegularCell, textView, c55239xgG);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
