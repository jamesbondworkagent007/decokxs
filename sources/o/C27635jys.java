package o;

import com.okinc.business.market.common.marketconfig.domain.BannerConfig;
import com.okinc.business.market.common.marketconfig.domain.BannerTokenInfo;
import com.okinc.business.market.common.marketconfig.domain.MarketConfig;
import com.okinc.business.market.data.model.BannerConfigData;
import com.okinc.business.market.data.model.BannerTokenInfoData;
import com.okinc.business.market.data.model.MarketConfigData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27635jys {
    public static final MarketConfig AEQbTJ(@NotNull MarketConfigData marketConfigData, @NotNull java.util.List<java.lang.String> list) {
        BannerConfig bannerConfig;
        java.lang.Object obj;
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(marketConfigData, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<java.lang.String> listCopydefault = marketConfigData.copydefault();
        if (listCopydefault == null) {
            listCopydefault = yDY.AhwBna();
        }
        java.util.List<BannerConfigData> listKWHzl = marketConfigData.KWHzl();
        if (listKWHzl != null) {
            int i = 10;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (BannerConfigData bannerConfigData : listKWHzl) {
                java.lang.String strAEQbTJ = bannerConfigData.AEQbTJ();
                java.lang.String str = strAEQbTJ == null ? "" : strAEQbTJ;
                java.lang.String strDjBIcL = bannerConfigData.djBIcL();
                java.lang.String str2 = strDjBIcL == null ? "" : strDjBIcL;
                java.lang.String strKWHzl = bannerConfigData.KWHzl();
                java.lang.String str3 = strKWHzl == null ? "" : strKWHzl;
                java.lang.String strOLrzqt = bannerConfigData.OLrzqt();
                java.lang.String str4 = strOLrzqt == null ? "" : strOLrzqt;
                java.util.List<java.lang.String> listCopydefault2 = bannerConfigData.copydefault();
                java.util.List<BannerTokenInfoData> listValueOf = bannerConfigData.valueOf();
                if (listValueOf != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, i));
                    for (BannerTokenInfoData bannerTokenInfoData : listValueOf) {
                        java.lang.String strCopydefault = bannerTokenInfoData.copydefault();
                        java.lang.String str5 = strCopydefault == null ? "" : strCopydefault;
                        java.lang.String strEZpvd = bannerTokenInfoData.EZpvd();
                        if (strEZpvd == null) {
                            strEZpvd = "";
                        }
                        arrayList3.add(new BannerTokenInfo(str5, strEZpvd));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                arrayList2.add(new BannerConfig(str, str2, str3, str4, listCopydefault2, arrayList));
                i = 10;
            }
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                java.lang.Object next = it.next();
                if (!list.contains(((BannerConfig) next).OLrzqt())) {
                    obj = next;
                    break;
                }
            }
            bannerConfig = (BannerConfig) obj;
        } else {
            bannerConfig = null;
        }
        java.util.List<java.lang.String> listKWHzl2 = marketConfigData.AEQbTJ().KWHzl();
        java.util.List<java.lang.String> listOLrzqt = marketConfigData.OLrzqt();
        if (listOLrzqt == null) {
            listOLrzqt = yDY.AhwBna();
        }
        return new MarketConfig(listCopydefault, bannerConfig, listKWHzl2, listOLrzqt);
    }
}
