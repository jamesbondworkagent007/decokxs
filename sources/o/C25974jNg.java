package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailItemViewModel;

/* JADX INFO: renamed from: o.jNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25974jNg implements InterfaceC58162ywA<SpotAnalysisPnlDetailItemViewModel> {
    public final InterfaceC58164ywC<C25960jMt> EZpvd;
    public final InterfaceC58164ywC<jMA> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public SpotAnalysisPnlDetailItemViewModel get() {
        SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModelEZpvd = EZpvd(this.EZpvd.get());
        C25978jNk.AEQbTJ(spotAnalysisPnlDetailItemViewModelEZpvd, this.KWHzl.get());
        return spotAnalysisPnlDetailItemViewModelEZpvd;
    }

    public static SpotAnalysisPnlDetailItemViewModel EZpvd(C25960jMt c25960jMt) {
        return new SpotAnalysisPnlDetailItemViewModel(c25960jMt);
    }
}
