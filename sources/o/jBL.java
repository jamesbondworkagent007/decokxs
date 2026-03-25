package o;

import com.okinc.business.market.common.constants.DurationType;
import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.common.constants.SortingType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class jBL {
    public static final jBL EZpvd = new jBL();

    private jBL() {
    }

    public final java.util.List<LeaderBoardSortModel> AEQbTJ() {
        java.lang.String value = DurationType.ONE_DAY.getValue();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.geAOna);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPzRXNTw);
        RankingSortType rankingSortType = RankingSortType.DURATION;
        return yDY.gEmmrt(new LeaderBoardSortModel(value, strAYXKKw, strAYXKKw2, false, rankingSortType, 8, null), new LeaderBoardSortModel(DurationType.THREE_DAYS.getValue(), C33070mpX.AYXKKw(C23274hvD.Fragment.apHBvG), C33070mpX.AYXKKw(C23274hvD.Fragment.RZMhtF), false, rankingSortType, 8, null), new LeaderBoardSortModel(DurationType.SEVEN_DAYS.getValue(), C33070mpX.AYXKKw(C23274hvD.Fragment.OqCbbx), C33070mpX.AYXKKw(C23274hvD.Fragment.DpxfQh), false, rankingSortType, 8, null), new LeaderBoardSortModel(DurationType.ONE_MONTH.getValue(), C33070mpX.AYXKKw(C23274hvD.Fragment.aBDePw), C33070mpX.AYXKKw(C23274hvD.Fragment.DzCpqu), false, rankingSortType, 8, null), new LeaderBoardSortModel(DurationType.THREE_MONTH.getValue(), C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPiaHEvk), C33070mpX.AYXKKw(C23274hvD.Fragment.UCQKYV), false, rankingSortType, 8, null));
    }

    public final java.util.List<LeaderBoardSortModel> EZpvd() {
        java.lang.String value = SortingType.PnL.getValue();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatCallback);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.onPause);
        RankingSortType rankingSortType = RankingSortType.RANKING;
        return yDY.gEmmrt(new LeaderBoardSortModel(value, strAYXKKw, strAYXKKw2, false, rankingSortType, 8, null), new LeaderBoardSortModel(SortingType.ROI.getValue(), C33070mpX.AYXKKw(C23274hvD.Fragment.onPlay), C33070mpX.AYXKKw(C23274hvD.Fragment.onPlayFromMediaId), false, rankingSortType, 8, null), new LeaderBoardSortModel(SortingType.WinRate.getValue(), C33070mpX.AYXKKw(C23274hvD.Fragment.onPrepareFromSearch), C33070mpX.AYXKKw(C23274hvD.Fragment.onPrepare), false, rankingSortType, 8, null), new LeaderBoardSortModel(SortingType.Transaction.getValue(), C33070mpX.AYXKKw(C23274hvD.Fragment.onMediaButtonEvent), C33070mpX.AYXKKw(C23274hvD.Fragment.onFastForward), false, rankingSortType, 8, null));
    }
}
