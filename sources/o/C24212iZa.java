package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.response.DashboardAssetToken;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfoDetail;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24212iZa {
    @yCM
    public C24212iZa() {
    }

    public final C27377jtz KWHzl(@NotNull DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        long jOLrzqt = dashboardTokenInfoDetail.OLrzqt();
        java.lang.String strAkhnZx = dashboardTokenInfoDetail.AkhnZx();
        java.lang.String strDbNXlk = dashboardTokenInfoDetail.DbNXlk();
        java.lang.String strFetchVPNInfo = dashboardTokenInfoDetail.fetchVPNInfo();
        java.lang.String strValues = dashboardTokenInfoDetail.values();
        long jAEQbTJ = dashboardTokenInfoDetail.AEQbTJ();
        java.lang.String strEZpvd2 = dashboardTokenInfoDetail.EZpvd();
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(dashboardTokenInfoDetail.valueOf());
        CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
        java.lang.String strKWHzl = c27586jxw.KWHzl(bigDecimalEZpvd, (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null);
        java.util.List<DashboardAssetToken> listCopydefault = dashboardTokenInfoDetail.copydefault();
        java.lang.String strAhwBna = dashboardTokenInfoDetail.AhwBna();
        java.lang.String strDjBIcL = dashboardTokenInfoDetail.djBIcL();
        java.util.List<DashboardInvestmentInfo> listAYXKKw = dashboardTokenInfoDetail.AYXKKw();
        DashboardAssetToken dashboardAssetToken = (DashboardAssetToken) CollectionsKt___CollectionsKt.firstOrNull(dashboardTokenInfoDetail.copydefault());
        if (dashboardAssetToken == null || (strEZpvd = dashboardAssetToken.EZpvd()) == null) {
            strEZpvd = "";
        }
        return new C27377jtz(jOLrzqt, strFetchVPNInfo, strValues, strEZpvd2, strKWHzl, listCopydefault, strEZpvd, jAEQbTJ, strDbNXlk, strAkhnZx, strAhwBna, strDjBIcL, listAYXKKw, UiDashboardTokenItemType.SINGLE, c27586jxw.KWHzl(C33129mqd.EZpvd(dashboardTokenInfoDetail.fIwbmz()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : DisplaySign.EXCEPT_ZERO, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (46 & 32) != 0 ? RoundingMode.DOWN : null), dashboardTokenInfoDetail.fIwbmz());
    }
}
