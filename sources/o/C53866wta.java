package o;

import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.GridStatistics;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;

/* JADX INFO: renamed from: o.wta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53866wta implements InterfaceC54501xKt<GridStatistics, java.util.ArrayList<TacticsInsideItemData>> {
    public static final int EZpvd = BannerOrderDetails.$stable;
    public final BannerOrderDetails copydefault;

    public C53866wta(BannerOrderDetails bannerOrderDetails) {
        this.copydefault = bannerOrderDetails;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<TacticsInsideItemData> KWHzl(GridStatistics gridStatistics) {
        java.lang.String percentWithSymbol$default;
        java.lang.String strCopydefault;
        java.lang.String backtestedArp;
        java.lang.String totalAssets;
        java.lang.String totalUserCount;
        java.lang.String backtestedArp2;
        BannerOrderDetails bannerOrderDetails = this.copydefault;
        java.lang.String backtestedArp3 = bannerOrderDetails != null ? bannerOrderDetails.getBacktestedArp() : null;
        java.lang.String downToMax$default = "--";
        java.lang.String str = "";
        if (backtestedArp3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) backtestedArp3)) {
            percentWithSymbol$default = "--";
        } else {
            xMR xmr = xMR.copydefault;
            BannerOrderDetails bannerOrderDetails2 = this.copydefault;
            percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xmr, (bannerOrderDetails2 == null || (backtestedArp2 = bannerOrderDetails2.getBacktestedArp()) == null) ? "" : backtestedArp2, 0, 0, RoundingMode.DOWN, 6, null);
        }
        java.lang.String totalUserCount2 = gridStatistics != null ? gridStatistics.getTotalUserCount() : null;
        if (totalUserCount2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalUserCount2)) {
            strCopydefault = "--";
        } else {
            xMR xmr2 = xMR.copydefault;
            if (gridStatistics == null || (totalUserCount = gridStatistics.getTotalUserCount()) == null) {
                totalUserCount = "";
            }
            strCopydefault = xmr2.copydefault(totalUserCount);
        }
        java.lang.String totalAssets2 = gridStatistics != null ? gridStatistics.getTotalAssets() : null;
        if (totalAssets2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalAssets2)) {
            xMR xmr3 = xMR.copydefault;
            if (gridStatistics == null || (totalAssets = gridStatistics.getTotalAssets()) == null) {
                totalAssets = "";
            }
            downToMax$default = xMR.formatDownToMax$default(xmr3, totalAssets, 0, 2, null);
        }
        TacticsInsideItemData[] tacticsInsideItemDataArr = new TacticsInsideItemData[3];
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.requestExtraBinder);
        BannerOrderDetails bannerOrderDetails3 = this.copydefault;
        if (bannerOrderDetails3 != null && (backtestedArp = bannerOrderDetails3.getBacktestedArp()) != null) {
            str = backtestedArp;
        }
        tacticsInsideItemDataArr[0] = new TacticsInsideItemData(strAYXKKw, percentWithSymbol$default, null, C56033xvF.OLrzqt((java.lang.Object) str), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null);
        tacticsInsideItemDataArr[1] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21ExtraCallback), strCopydefault, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        tacticsInsideItemDataArr[2] = new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.processPendingCallbacksLocked, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", "USDT"))), downToMax$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        return yDY.copydefault(tacticsInsideItemDataArr);
    }
}
