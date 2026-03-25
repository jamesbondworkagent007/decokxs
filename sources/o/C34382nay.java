package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.dexkline.market.data.model.BasicInfoData;
import com.okinc.dexkline.market.data.model.LearnMoreData;
import com.okinc.dexkline.market.data.model.MarketInfoData;
import com.okinc.dexkline.market.data.model.MemeInfoData;
import com.okinc.dexkline.market.data.model.MemePlatformBean;
import com.okinc.dexkline.market.data.model.OverviewData;
import com.okinc.dexkline.market.data.model.SocialMediaData;
import com.okinc.dexkline.market.data.model.TransactionInfoData;
import com.okinc.dexkline.market.domain.model.coininfo.Social;
import com.okinc.dexkline.market.features.overview.domain.BasicInfo;
import com.okinc.dexkline.market.features.overview.domain.MarketInfo;
import com.okinc.dexkline.market.features.overview.domain.MemeInfo;
import com.okinc.dexkline.market.features.overview.domain.Overview;
import com.okinc.dexkline.market.features.overview.domain.TransactionInfo;
import com.okinc.dexkline.market.features.overview.domain.TransactionStatistic;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34382nay {
    public static final Overview AEQbTJ(@NotNull OverviewData overviewData) {
        Intrinsics.checkNotNullParameter(overviewData, "");
        MarketInfoData marketInfoDataCopydefault = overviewData.copydefault();
        java.lang.String strAYXKKw = marketInfoDataCopydefault != null ? marketInfoDataCopydefault.AYXKKw() : null;
        java.lang.String str = strAYXKKw == null ? "" : strAYXKKw;
        MarketInfoData marketInfoDataCopydefault2 = overviewData.copydefault();
        java.lang.String strGEmmrt = marketInfoDataCopydefault2 != null ? marketInfoDataCopydefault2.gEmmrt() : null;
        java.lang.String str2 = strGEmmrt == null ? "" : strGEmmrt;
        MarketInfoData marketInfoDataCopydefault3 = overviewData.copydefault();
        java.lang.String strDjBIcL = marketInfoDataCopydefault3 != null ? marketInfoDataCopydefault3.djBIcL() : null;
        java.lang.String str3 = strDjBIcL == null ? "" : strDjBIcL;
        MarketInfoData marketInfoDataCopydefault4 = overviewData.copydefault();
        java.lang.String strAhwBna = marketInfoDataCopydefault4 != null ? marketInfoDataCopydefault4.AhwBna() : null;
        return new Overview(new TransactionInfo(str, str2, str3, strAhwBna == null ? "" : strAhwBna, null, 16, null), AEQbTJ(overviewData.gEmmrt()), OLrzqt(overviewData.KWHzl(), overviewData.valueOf()), KWHzl(overviewData.copydefault()), copydefault(overviewData.valueOf(), overviewData.OLrzqt()), overviewData.EZpvd(), overviewData.AEQbTJ(), overviewData.AhwBna());
    }

    public static final MemeInfo AEQbTJ(MemeInfoData memeInfoData) {
        MemePlatformBean memePlatformBean;
        MemePlatformBean memePlatformBean2;
        MemePlatformBean memePlatformBean3;
        if (memeInfoData != null) {
            java.lang.String strCopydefault = memeInfoData.copydefault();
            java.lang.String strKWHzl = memeInfoData.KWHzl();
            java.lang.Float fFIwbmz = C59443zhD.fIwbmz(memeInfoData.AEQbTJ());
            java.lang.String strGEmmrt = memeInfoData.gEmmrt();
            java.util.List<MemePlatformBean> listEZpvd = memeInfoData.EZpvd();
            java.lang.String linkUrl = null;
            java.lang.String logoUrl = (listEZpvd == null || (memePlatformBean3 = (MemePlatformBean) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd)) == null) ? null : memePlatformBean3.getLogoUrl();
            java.lang.String str = logoUrl == null ? "" : logoUrl;
            java.util.List<MemePlatformBean> listEZpvd2 = memeInfoData.EZpvd();
            java.lang.String moduleTagName = (listEZpvd2 == null || (memePlatformBean2 = (MemePlatformBean) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd2)) == null) ? null : memePlatformBean2.getModuleTagName();
            java.lang.String str2 = moduleTagName == null ? "" : moduleTagName;
            java.util.List<MemePlatformBean> listEZpvd3 = memeInfoData.EZpvd();
            if (listEZpvd3 != null && (memePlatformBean = (MemePlatformBean) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd3)) != null) {
                linkUrl = memePlatformBean.getLinkUrl();
            }
            return new MemeInfo(strCopydefault, strKWHzl, fFIwbmz, strGEmmrt, str, str2, linkUrl == null ? "" : linkUrl, null, 128, null);
        }
        return new MemeInfo(null, null, null, null, null, null, null, null, 255, null);
    }

    public static final java.util.List<Social> copydefault(SocialMediaData socialMediaData, LearnMoreData learnMoreData) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (socialMediaData != null) {
            EZpvd(arrayList, SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER, socialMediaData.valueOf(), C57406yhn.Activity.AEQbTJ);
            EZpvd(arrayList, "reddit", socialMediaData.AhwBna(), C57406yhn.Activity.EZpvd);
            EZpvd(arrayList, "telegram", socialMediaData.AYXKKw(), C35964oKf.Activity.RJOkX);
            EZpvd(arrayList, "officialWebsite", socialMediaData.gEmmrt(), C57406yhn.Activity.QOLQEE);
            EZpvd(arrayList, "discord", socialMediaData.KWHzl(), C35964oKf.Activity.QfsBiF);
            EZpvd(arrayList, "github", socialMediaData.OLrzqt(), C57406yhn.Activity.ORxRYg);
            EZpvd(arrayList, "medium", socialMediaData.copydefault(), C57406yhn.Activity.copydefault);
            EZpvd(arrayList, "facebook", socialMediaData.AEQbTJ(), C57406yhn.Activity.OLrzqt);
        }
        if (learnMoreData != null) {
            EZpvd(arrayList, "paper", learnMoreData.EZpvd(), C57406yhn.Activity.AxsJAY);
        }
        return arrayList;
    }

    public static final void EZpvd(@NotNull java.util.List<Social> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() > 0) {
            list.add(new Social(str, str2, i));
        }
    }

    public static final TransactionStatistic AEQbTJ(@NotNull TransactionInfoData transactionInfoData) {
        Intrinsics.checkNotNullParameter(transactionInfoData, "");
        if (Intrinsics.EZpvd(transactionInfoData.getHasPushed(), java.lang.Boolean.TRUE)) {
            java.lang.String totalAmountUsd = transactionInfoData.getTotalAmountUsd();
            java.lang.String str = totalAmountUsd == null ? "" : totalAmountUsd;
            java.lang.String inflow = transactionInfoData.getInflow();
            java.lang.String str2 = inflow == null ? "" : inflow;
            java.lang.String buyNo = transactionInfoData.getBuyNo();
            java.lang.String str3 = buyNo == null ? "" : buyNo;
            java.lang.String buyAmountUsd = transactionInfoData.getBuyAmountUsd();
            java.lang.String str4 = buyAmountUsd == null ? "" : buyAmountUsd;
            java.lang.String sellNo = transactionInfoData.getSellNo();
            java.lang.String str5 = sellNo == null ? "" : sellNo;
            java.lang.String sellAmountUsd = transactionInfoData.getSellAmountUsd();
            return new TransactionStatistic(str, str2, str3, str4, str5, sellAmountUsd == null ? "" : sellAmountUsd);
        }
        return new TransactionStatistic(null, null, null, null, null, null, 63, null);
    }

    public static final BasicInfo OLrzqt(BasicInfoData basicInfoData, SocialMediaData socialMediaData) {
        if (basicInfoData != null) {
            java.lang.String strEZpvd = socialMediaData != null ? socialMediaData.EZpvd() : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            return new BasicInfo(basicInfoData.valueOf(), basicInfoData.djBIcL(), basicInfoData.EZpvd(), basicInfoData.copydefault(), basicInfoData.AEQbTJ(), basicInfoData.AhwBna(), basicInfoData.OLrzqt(), basicInfoData.KWHzl(), strEZpvd);
        }
        return new BasicInfo(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static final MarketInfo KWHzl(MarketInfoData marketInfoData) {
        if (marketInfoData != null) {
            return new MarketInfo(marketInfoData.values(), marketInfoData.KWHzl(), marketInfoData.EZpvd(), marketInfoData.valueOf(), marketInfoData.AuCTel(), marketInfoData.AEQbTJ(), null, null, null, null, marketInfoData.OLrzqt(), marketInfoData.fetchVPNInfo(), marketInfoData.ejfBZ(), marketInfoData.copydefault(), marketInfoData.isConnected(), marketInfoData.DbNXlk(), marketInfoData.AkhnZx(), 960, null);
        }
        return new MarketInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
