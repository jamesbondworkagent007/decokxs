package o;

import com.okinc.business.dex.api.bean.sa_small_assets.QuoteDetail;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUY {
    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull SmallAssetQuoteData smallAssetQuoteData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(smallAssetQuoteData, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jValueOf = C33129mqd.valueOf(C54862xYb.KWHzl(java.lang.Long.valueOf(jCurrentTimeMillis), smallAssetQuoteData.getExpireDurationMillis()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (QuoteDetail quoteDetail : smallAssetQuoteData.getQuotes().values()) {
            arrayList.add(quoteDetail.getFromTokenAddress());
            arrayList2.add(java.lang.Long.valueOf(C33129mqd.valueOf(quoteDetail.getFromAmount64())));
            arrayList3.add(java.lang.Long.valueOf(C33129mqd.valueOf(quoteDetail.getMinAmountOut64())));
        }
        return C59442zhC.fJNWhG("\n        " + C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnReportDrawnListener) + "\n        \n        Chain Index: " + smallAssetQuoteData.getChainId() + "\n        Strategy Type: BatchSwap\n        Recipient: " + str + "\n        Created At: " + copydefault(jCurrentTimeMillis) + "\n        Expired At: " + copydefault(jValueOf) + "\n        From Token: " + arrayList + "\n        To Token: " + smallAssetQuoteData.getTargetTokenAddress() + "\n        From Amount: " + arrayList2 + "\n        Min Return Amount: " + arrayList3 + "\n        ");
    }

    public final java.lang.String copydefault(long j) {
        java.lang.String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", java.util.Locale.US).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
