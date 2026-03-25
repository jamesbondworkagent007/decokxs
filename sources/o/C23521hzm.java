package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23521hzm implements ViewBinding {
    public final C55320xhi AEQbTJ;
    public final C55239xgG AhwBna;
    public final Barrier EZpvd;
    public final C19919gUe KWHzl;
    public final C55008xbo OLrzqt;
    public final C55320xhi copydefault;
    public final android.widget.TextView djBIcL;
    public final C55239xgG gEmmrt;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.valueOf;
    }

    public C23521hzm(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C19919gUe c19919gUe, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull C55320xhi c55320xhi2, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull C55239xgG c55239xgG2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.valueOf = view;
        this.EZpvd = barrier;
        this.KWHzl = c19919gUe;
        this.OLrzqt = c55008xbo;
        this.copydefault = c55320xhi;
        this.AEQbTJ = c55320xhi2;
        this.gEmmrt = c55239xgG;
        this.AhwBna = c55239xgG2;
        this.djBIcL = textView;
    }

    public static C23521hzm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.OJuSTm, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C23521hzm AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QSBOWP;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.DGUQLIekVPG;
            C19919gUe c19919gUe = (C19919gUe) ViewBindings.findChildViewById(view, i);
            if (c19919gUe != null) {
                i = C23274hvD.Application.HJWChPRAkuRW;
                C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo != null) {
                    i = C23274hvD.Application.hQufeQ;
                    C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                    if (c55320xhi != null) {
                        i = C23274hvD.Application.QBiWsm;
                        C55320xhi c55320xhi2 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                        if (c55320xhi2 != null) {
                            i = C23274hvD.Application.ReportDrawnKtReportDrawn2;
                            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                            if (c55239xgG != null) {
                                i = C23274hvD.Application.ReportDrawnKtReportDrawnAfter1;
                                C55239xgG c55239xgG2 = (C55239xgG) ViewBindings.findChildViewById(view, i);
                                if (c55239xgG2 != null) {
                                    i = C23274hvD.Application.getNavigationItemCount;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new C23521hzm(view, barrier, c19919gUe, c55008xbo, c55320xhi, c55320xhi2, c55239xgG, c55239xgG2, textView);
                                    }
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
