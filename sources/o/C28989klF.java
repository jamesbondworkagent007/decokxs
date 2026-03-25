package o;

import com.okinc.business.market.data.model.BasicInfoData;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.LearnMoreData;
import com.okinc.business.market.data.model.MarketInfoData;
import com.okinc.business.market.data.model.MemeInfoData;
import com.okinc.business.market.data.model.MemePlatformBean;
import com.okinc.business.market.data.model.OverviewData;
import com.okinc.business.market.data.model.RwaTradingInfoData;
import com.okinc.business.market.data.model.SocialMediaData;
import com.okinc.business.market.data.model.TransactionInfoData;
import com.okinc.business.market.domain.model.coininfo.Social;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.overview.domain.BasicInfo;
import com.okinc.business.market.features.overview.domain.MarketInfo;
import com.okinc.business.market.features.overview.domain.MemeInfo;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.overview.domain.RwaTradingStatus;
import com.okinc.business.market.features.overview.domain.StockInfo;
import com.okinc.business.market.features.overview.domain.TransactionInfo;
import com.okinc.business.market.features.overview.domain.TransactionStatistic;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28989klF {
    public static final Overview copydefault(@NotNull OverviewData overviewData) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(overviewData, "");
        java.util.List<CompactTagData> listDbNXlk = overviewData.DbNXlk();
        boolean z3 = false;
        if ((listDbNXlk instanceof java.util.Collection) && listDbNXlk.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = listDbNXlk.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) it.next()).copydefault(), (java.lang.Object) "stableCoin")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        java.util.List<CompactTagData> listDbNXlk2 = overviewData.DbNXlk();
        if ((listDbNXlk2 instanceof java.util.Collection) && listDbNXlk2.isEmpty()) {
            z2 = false;
        } else {
            java.util.Iterator<T> it2 = listDbNXlk2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) it2.next()).copydefault(), (java.lang.Object) "nativeToken")) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        java.util.List<CompactTagData> listDbNXlk3 = overviewData.DbNXlk();
        if (!(listDbNXlk3 instanceof java.util.Collection) || !listDbNXlk3.isEmpty()) {
            java.util.Iterator<T> it3 = listDbNXlk3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) it3.next()).copydefault(), (java.lang.Object) "rwa")) {
                    z3 = true;
                    break;
                }
            }
        }
        MarketInfoData marketInfoDataGEmmrt = overviewData.gEmmrt();
        java.lang.String strValueOf = marketInfoDataGEmmrt != null ? marketInfoDataGEmmrt.valueOf() : null;
        java.lang.String str = strValueOf == null ? "" : strValueOf;
        MarketInfoData marketInfoDataGEmmrt2 = overviewData.gEmmrt();
        java.lang.String strGEmmrt = marketInfoDataGEmmrt2 != null ? marketInfoDataGEmmrt2.gEmmrt() : null;
        java.lang.String str2 = strGEmmrt == null ? "" : strGEmmrt;
        MarketInfoData marketInfoDataGEmmrt3 = overviewData.gEmmrt();
        java.lang.String strAYXKKw = marketInfoDataGEmmrt3 != null ? marketInfoDataGEmmrt3.AYXKKw() : null;
        java.lang.String str3 = strAYXKKw == null ? "" : strAYXKKw;
        MarketInfoData marketInfoDataGEmmrt4 = overviewData.gEmmrt();
        java.lang.String strDjBIcL = marketInfoDataGEmmrt4 != null ? marketInfoDataGEmmrt4.djBIcL() : null;
        TransactionInfo transactionInfo = new TransactionInfo(str, str2, str3, strDjBIcL == null ? "" : strDjBIcL, null, 16, null);
        MemeInfo memeInfoOLrzqt = OLrzqt(overviewData.AhwBna());
        BasicInfo basicInfoEZpvd = EZpvd(overviewData.OLrzqt(), overviewData.AYXKKw(), z2, z, z3);
        MarketInfo marketInfoCopydefault = copydefault(overviewData.gEmmrt());
        java.util.List<Social> listCopydefault = copydefault(overviewData.AYXKKw(), overviewData.copydefault());
        java.lang.String strEZpvd = overviewData.EZpvd();
        java.lang.String strAEQbTJ = overviewData.AEQbTJ();
        java.lang.String strDjBIcL2 = overviewData.djBIcL();
        SocialMediaData socialMediaDataAYXKKw = overviewData.AYXKKw();
        java.util.List<MemeSocialMediaData> listCopydefault2 = socialMediaDataAYXKKw != null ? C28927kjx.copydefault(socialMediaDataAYXKKw) : null;
        return new Overview(transactionInfo, memeInfoOLrzqt, basicInfoEZpvd, marketInfoCopydefault, listCopydefault, strEZpvd, strAEQbTJ, strDjBIcL2, listCopydefault2 == null ? yDY.AhwBna() : listCopydefault2, null, OLrzqt(overviewData.valueOf()));
    }

    public static final MemeInfo OLrzqt(MemeInfoData memeInfoData) {
        MemePlatformBean memePlatformBean;
        MemePlatformBean memePlatformBean2;
        MemePlatformBean memePlatformBean3;
        if (memeInfoData != null) {
            java.lang.String strAEQbTJ = memeInfoData.AEQbTJ();
            java.lang.String strOLrzqt = memeInfoData.OLrzqt();
            java.lang.Float fFIwbmz = C59443zhD.fIwbmz(memeInfoData.EZpvd());
            java.lang.String strAYXKKw = memeInfoData.AYXKKw();
            java.util.List<MemePlatformBean> listKWHzl = memeInfoData.KWHzl();
            java.lang.String linkUrl = null;
            java.lang.String logoUrl = (listKWHzl == null || (memePlatformBean3 = (MemePlatformBean) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) ? null : memePlatformBean3.getLogoUrl();
            java.lang.String str = logoUrl == null ? "" : logoUrl;
            java.util.List<MemePlatformBean> listKWHzl2 = memeInfoData.KWHzl();
            java.lang.String moduleTagName = (listKWHzl2 == null || (memePlatformBean2 = (MemePlatformBean) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl2)) == null) ? null : memePlatformBean2.getModuleTagName();
            java.lang.String str2 = moduleTagName == null ? "" : moduleTagName;
            java.util.List<MemePlatformBean> listKWHzl3 = memeInfoData.KWHzl();
            if (listKWHzl3 != null && (memePlatformBean = (MemePlatformBean) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl3)) != null) {
                linkUrl = memePlatformBean.getLinkUrl();
            }
            return new MemeInfo(strAEQbTJ, strOLrzqt, fFIwbmz, strAYXKKw, str, str2, linkUrl == null ? "" : linkUrl, null, 128, null);
        }
        return new MemeInfo(null, null, null, null, null, null, null, null, 255, null);
    }

    public static final java.util.List<Social> copydefault(SocialMediaData socialMediaData, LearnMoreData learnMoreData) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (socialMediaData != null) {
            KWHzl(listOLrzqt, SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER, socialMediaData.gEmmrt(), C52761wXj.TaskDescription.ICustomTabsServiceDefault, C23274hvD.Fragment.bindRcKey);
            KWHzl(listOLrzqt, "reddit", socialMediaData.AhwBna(), C52761wXj.TaskDescription.avCqka, C23274hvD.Fragment.r8lambda9oQ81VFq3e0CkAqj9HHhVQeVeY);
            KWHzl(listOLrzqt, "telegram", socialMediaData.valueOf(), C52761wXj.TaskDescription.SaJVGb, C23274hvD.Fragment.onStart);
            KWHzl(listOLrzqt, "officialWebsite", socialMediaData.djBIcL(), C52761wXj.TaskDescription.ikIEnW, C23274hvD.Fragment.lambdaexecute0);
            KWHzl(listOLrzqt, "discord", socialMediaData.AEQbTJ(), C52761wXj.TaskDescription.cBPFI, C23274hvD.Fragment.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA);
            KWHzl(listOLrzqt, "github", socialMediaData.copydefault(), C52761wXj.TaskDescription.sbu, C23274hvD.Fragment.getLifecycleRegistry);
            KWHzl(listOLrzqt, "medium", socialMediaData.EZpvd(), C52761wXj.TaskDescription.hcetpZ, C23274hvD.Fragment.onBackPressedDispatcherlambda1);
            KWHzl(listOLrzqt, "facebook", socialMediaData.OLrzqt(), C52761wXj.TaskDescription.invokespecialsiEkQe, C23274hvD.Fragment.ComponentDialog);
        }
        if (learnMoreData != null) {
            KWHzl(listOLrzqt, "paper", learnMoreData.EZpvd(), C57406yhn.Activity.AxsJAY, C23274hvD.Fragment.ComponentDialogExternalSyntheticLambda1);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final void KWHzl(@NotNull java.util.List<Social> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() > 0) {
            list.add(new Social(str, str2, i, i2));
        }
    }

    public static final TransactionStatistic copydefault(@NotNull TransactionInfoData transactionInfoData) {
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

    public static final BasicInfo EZpvd(BasicInfoData basicInfoData, SocialMediaData socialMediaData, boolean z, boolean z2, boolean z3) {
        if (basicInfoData != null) {
            java.lang.String strKWHzl = socialMediaData != null ? socialMediaData.KWHzl() : null;
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            return new BasicInfo(basicInfoData.gEmmrt(), basicInfoData.AhwBna(), basicInfoData.AEQbTJ(), basicInfoData.KWHzl(), basicInfoData.copydefault(), z, z2, z3, basicInfoData.EZpvd(), basicInfoData.OLrzqt(), strKWHzl);
        }
        return new BasicInfo(null, null, null, null, null, false, false, false, null, null, null, 2047, null);
    }

    public static final MarketInfo copydefault(MarketInfoData marketInfoData) {
        if (marketInfoData != null) {
            return new MarketInfo(marketInfoData.isConnected(), marketInfoData.OLrzqt(), marketInfoData.AEQbTJ(), marketInfoData.AhwBna(), marketInfoData.fIwbmz(), marketInfoData.copydefault(), null, null, null, null, marketInfoData.KWHzl(), marketInfoData.DbNXlk(), marketInfoData.fJNWhG(), marketInfoData.EZpvd(), marketInfoData.values(), marketInfoData.AkhnZx(), marketInfoData.fetchVPNInfo(), 960, null);
        }
        return new MarketInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static final RwaTradingStatus KWHzl(@NotNull TagMeta tagMeta) {
        Intrinsics.checkNotNullParameter(tagMeta, "");
        return new RwaTradingStatus("", tagMeta.DbNXlk(), tagMeta.copydefault(), tagMeta.gEmmrt(), tagMeta.KWHzl(), tagMeta.valueOf(), tagMeta.AhwBna());
    }

    public static final StockInfo OLrzqt(RwaTradingInfoData rwaTradingInfoData) {
        if (rwaTradingInfoData != null) {
            return new StockInfo(rwaTradingInfoData.EZpvd(), rwaTradingInfoData.OLrzqt(), rwaTradingInfoData.KWHzl(), rwaTradingInfoData.AEQbTJ(), rwaTradingInfoData.copydefault(), rwaTradingInfoData.AhwBna(), rwaTradingInfoData.gEmmrt(), rwaTradingInfoData.valueOf(), rwaTradingInfoData.djBIcL());
        }
        return null;
    }
}
