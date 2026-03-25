package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.response.DashboardAssetToken;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfoDetail;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iYW {
    @yCM
    public iYW() {
    }

    public final C27372jtu AEQbTJ(@NotNull DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) dashboardTokenInfoDetail.copydefault(), 2);
        long jAEQbTJ = dashboardTokenInfoDetail.AEQbTJ();
        long jOLrzqt = dashboardTokenInfoDetail.OLrzqt();
        java.lang.String strAkhnZx = dashboardTokenInfoDetail.AkhnZx();
        java.lang.String strDbNXlk = dashboardTokenInfoDetail.DbNXlk();
        java.util.List listEZpvd = C56402yEa.EZpvd(new InvestLogoBaseVo(dashboardTokenInfoDetail.values(), (java.lang.String) null, 2, (DefaultConstructorMarker) null));
        java.lang.String strEZpvd = dashboardTokenInfoDetail.EZpvd();
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        java.lang.String strAEQbTJ = c27586jxw.AEQbTJ(C33129mqd.EZpvd(dashboardTokenInfoDetail.gEmmrt()), (38 & 2) != 0 ? 0 : 0, (38 & 4) != 0 ? 2 : 0, (38 & 8) == 0, (38 & 16) != 0 ? DisplaySign.EXCEPT_ZERO : DisplaySign.AUTO, (38 & 32) != 0 ? RoundingMode.DOWN : null);
        java.lang.String strGEmmrt = dashboardTokenInfoDetail.gEmmrt();
        java.lang.String strKWHzl = c27586jxw.KWHzl(C33129mqd.EZpvd(dashboardTokenInfoDetail.valueOf()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null);
        java.util.List<DashboardInvestmentInfo> listAYXKKw = dashboardTokenInfoDetail.AYXKKw();
        java.lang.String strAhwBna = dashboardTokenInfoDetail.AhwBna();
        java.lang.String strDjBIcL = dashboardTokenInfoDetail.djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (java.util.Iterator it = listAhwBna.iterator(); it.hasNext(); it = it) {
            DashboardAssetToken dashboardAssetToken = (DashboardAssetToken) it.next();
            arrayList.add(new InvestLogoBaseVo(dashboardAssetToken.EZpvd(), dashboardAssetToken.OLrzqt()));
        }
        return new C27372jtu(jAEQbTJ, jOLrzqt, strAkhnZx, strDbNXlk, listEZpvd, strEZpvd, strAEQbTJ, strGEmmrt, strKWHzl, listAhwBna, strAhwBna, strDjBIcL, listAYXKKw, arrayList, UiDashboardTokenItemType.DUAL, C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(dashboardTokenInfoDetail.fIwbmz()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : DisplaySign.EXCEPT_ZERO, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null), dashboardTokenInfoDetail.fIwbmz());
    }
}
