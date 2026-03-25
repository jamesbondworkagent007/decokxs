package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.response.DashboardProtocolDetailsResponse;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDT {
    public final iDX AEQbTJ;
    public final iDU OLrzqt;

    @yCM
    public iDT(@NotNull iDX idx, @NotNull iDU idu) {
        Intrinsics.checkNotNullParameter(idx, "");
        Intrinsics.checkNotNullParameter(idu, "");
        this.AEQbTJ = idx;
        this.OLrzqt = idu;
    }

    public final iDV EZpvd(@NotNull DashboardProtocolDetailsResponse dashboardProtocolDetailsResponse) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        Intrinsics.checkNotNullParameter(dashboardProtocolDetailsResponse, "");
        java.util.List<C27370jts> listOLrzqt = this.AEQbTJ.OLrzqt(dashboardProtocolDetailsResponse.copydefault(), dashboardProtocolDetailsResponse.AYXKKw(), dashboardProtocolDetailsResponse.djBIcL(), dashboardProtocolDetailsResponse.AEQbTJ());
        java.util.List<C27368jtq> listAEQbTJ = this.OLrzqt.AEQbTJ(dashboardProtocolDetailsResponse.copydefault(), dashboardProtocolDetailsResponse.AYXKKw(), dashboardProtocolDetailsResponse.djBIcL(), dashboardProtocolDetailsResponse.EZpvd());
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.Ufzxmz);
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C27370jts) next).DbNXlk())) {
                break;
            }
        }
        if (next != null) {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.alsFma);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.aJFbMH);
        }
        C27376jty c27376jty = new C27376jty(strAYXKKw3, strAYXKKw, null, 4, null);
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.UhxbNG);
        java.util.Iterator<T> it2 = listOLrzqt.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C27370jts) next2).DbNXlk())) {
                obj = next2;
                break;
            }
        }
        if (obj != null) {
            strAYXKKw2 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.akftKQ);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.aJFbMH);
        }
        C27376jty c27376jty2 = new C27376jty(strAYXKKw4, strAYXKKw2, dashboardProtocolDetailsResponse.AhwBna());
        long jOLrzqt = dashboardProtocolDetailsResponse.OLrzqt();
        java.lang.String strKWHzl = C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(dashboardProtocolDetailsResponse.values()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null);
        java.lang.String strValues = dashboardProtocolDetailsResponse.values();
        java.util.List<UnifiedRewardInfoByInvestment> listValueOf = dashboardProtocolDetailsResponse.valueOf();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        for (UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment : listValueOf) {
            arrayList.add(unifiedRewardInfoByInvestment.copy((3327 & 1) != 0 ? unifiedRewardInfoByInvestment.baseDefiTokenInfos : null, (3327 & 2) != 0 ? unifiedRewardInfoByInvestment.buttonType : null, (3327 & 4) != 0 ? unifiedRewardInfoByInvestment.claimMode : null, (3327 & 8) != 0 ? unifiedRewardInfoByInvestment.currencyAmount : null, (3327 & 16) != 0 ? unifiedRewardInfoByInvestment.extraData : null, (3327 & 32) != 0 ? unifiedRewardInfoByInvestment.rewardType : null, (3327 & 64) != 0 ? unifiedRewardInfoByInvestment.callDataExtJson : null, (3327 & 128) != 0 ? unifiedRewardInfoByInvestment.unclaimedTokenList : null, (3327 & 256) != 0 ? unifiedRewardInfoByInvestment.network : dashboardProtocolDetailsResponse.gEmmrt(), (3327 & 512) != 0 ? unifiedRewardInfoByInvestment.chainId : java.lang.Long.valueOf(dashboardProtocolDetailsResponse.copydefault()), (3327 & 1024) != 0 ? unifiedRewardInfoByInvestment.investmentId : 0L, (3327 & 2048) != 0 ? unifiedRewardInfoByInvestment.investmentCategory : null));
        }
        return new iDV(c27376jty, listOLrzqt, c27376jty2, listAEQbTJ, new C27373jtv(jOLrzqt, strKWHzl, arrayList, strValues));
    }
}
