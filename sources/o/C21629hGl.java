package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.market.widget.chart.RankingFilterEditView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21629hGl implements ViewBinding {
    public final C55239xgG AEQbTJ;
    public final RankingFilterEditView AhwBna;
    public final C55008xbo EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final RankingFilterEditView OLrzqt;
    public final RankingFilterEditView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C21629hGl(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull RankingFilterEditView rankingFilterEditView, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull RankingFilterEditView rankingFilterEditView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RankingFilterEditView rankingFilterEditView3) {
        this.KWHzl = linearLayoutCompat;
        this.EZpvd = c55008xbo;
        this.copydefault = rankingFilterEditView;
        this.AEQbTJ = c55239xgG;
        this.OLrzqt = rankingFilterEditView2;
        this.valueOf = textView;
        this.AhwBna = rankingFilterEditView3;
    }

    public static C21629hGl copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RWIpjU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21629hGl KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sanitizeSessionIdIgnoreCase;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.onFastForward;
            RankingFilterEditView rankingFilterEditView = (RankingFilterEditView) ViewBindings.findChildViewById(view, i);
            if (rankingFilterEditView != null) {
                i = C23274hvD.Application.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1;
                C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                if (c55239xgG != null) {
                    i = C23274hvD.Application.ActivityResultContractsPickMultipleVisualMedia;
                    RankingFilterEditView rankingFilterEditView2 = (RankingFilterEditView) ViewBindings.findChildViewById(view, i);
                    if (rankingFilterEditView2 != null) {
                        i = C23274hvD.Application.setNegativeButtonIcon;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.setNumericShortcut;
                            RankingFilterEditView rankingFilterEditView3 = (RankingFilterEditView) ViewBindings.findChildViewById(view, i);
                            if (rankingFilterEditView3 != null) {
                                return new C21629hGl((LinearLayoutCompat) view, c55008xbo, rankingFilterEditView, c55239xgG, rankingFilterEditView2, textView, rankingFilterEditView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
