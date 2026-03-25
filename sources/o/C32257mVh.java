package o;

import com.okinc.dexkline.market.common.marketconfig.domain.BannerConfig;
import com.okinc.dexkline.market.common.marketconfig.domain.MarketConfig;
import com.okinc.dexkline.market.data.model.BannerConfigData;
import com.okinc.dexkline.market.data.model.MarketConfigData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32257mVh {
    public static final MarketConfig KWHzl(@NotNull MarketConfigData marketConfigData, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(marketConfigData, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<java.lang.String> listOLrzqt = marketConfigData.OLrzqt();
        if (listOLrzqt == null) {
            listOLrzqt = yDY.AhwBna();
        }
        java.util.List<BannerConfigData> listCopydefault = marketConfigData.copydefault();
        BannerConfig bannerConfig = null;
        java.lang.Object obj = null;
        if (listCopydefault != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            for (BannerConfigData bannerConfigData : listCopydefault) {
                java.lang.String strAEQbTJ = bannerConfigData.AEQbTJ();
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                java.lang.String strCopydefault = bannerConfigData.copydefault();
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                java.lang.String strEZpvd = bannerConfigData.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                java.lang.String strKWHzl = bannerConfigData.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                arrayList.add(new BannerConfig(strAEQbTJ, strCopydefault, strEZpvd, strKWHzl));
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (!list.contains(((BannerConfig) next).EZpvd())) {
                    obj = next;
                    break;
                }
            }
            bannerConfig = (BannerConfig) obj;
        }
        java.util.List<java.lang.String> listEZpvd = marketConfigData.EZpvd().EZpvd();
        java.util.List<java.lang.String> listKWHzl = marketConfigData.KWHzl();
        if (listKWHzl == null) {
            listKWHzl = yDY.AhwBna();
        }
        return new MarketConfig(listOLrzqt, bannerConfig, listEZpvd, listKWHzl);
    }
}
