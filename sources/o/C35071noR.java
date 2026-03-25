package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.quotation.data.model.stock.StockTokenPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35071noR {
    public static final C35069noP OLrzqt(@NotNull StockTokenPo stockTokenPo, @NotNull InterfaceC35073noT interfaceC35073noT) {
        Intrinsics.checkNotNullParameter(stockTokenPo, "");
        Intrinsics.checkNotNullParameter(interfaceC35073noT, "");
        java.lang.String strEZpvd = C55611xnH.EZpvd(stockTokenPo.getChangePerDay24h(), stockTokenPo.getChangePerDayUtc0(), stockTokenPo.getChangePerDayUtc8());
        java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(pTB.formatICUPercent$default(C33129mqd.EZpvd(strEZpvd), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null));
        java.lang.String instId = stockTokenPo.getInstId();
        java.lang.String displayId = stockTokenPo.getDisplayId();
        java.lang.String instType = stockTokenPo.getInstType();
        java.lang.String icon = stockTokenPo.getIcon();
        java.lang.String strEZpvd2 = C41786qxQ.EZpvd(stockTokenPo.getInstId());
        java.lang.String displayId2 = stockTokenPo.getDisplayId();
        if (!(true ^ (displayId2 == null || displayId2.length() == 0))) {
            displayId2 = null;
        }
        if (displayId2 == null) {
            displayId2 = stockTokenPo.getInstId();
        }
        return interfaceC35073noT.AEQbTJ(instId, displayId, strEZpvd2, C41786qxQ.KWHzl(displayId2), instType, stockTokenPo.getLastPrice(), strEZpvd, stockTokenPo.getVolume(), stockTokenPo.getTurnOver(), icon, strAEQbTJ, java.lang.Integer.valueOf(C41786qxQ.OLrzqt(C33129mqd.EZpvd(strEZpvd))));
    }
}
