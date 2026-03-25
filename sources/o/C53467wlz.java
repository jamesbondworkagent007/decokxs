package o;

import com.okinc.kline.api.bean.BotOrderItem;
import com.okinc.unify_trade.bot.util.dca.DcaPreviewData;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53467wlz {
    public static final C53467wlz copydefault = new C53467wlz();

    private C53467wlz() {
    }

    public final Triple<BotOrderItem, java.util.ArrayList<BotOrderItem>, DcaPreviewData> EZpvd(@NotNull java.util.List<DcaPreviewData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        DcaPreviewData dcaPreviewData = (DcaPreviewData) CollectionsKt___CollectionsKt.firstOrNull(list);
        BotOrderItem botOrderItemKWHzl = null;
        if (dcaPreviewData != null) {
            DcaPreviewData dcaPreviewData2 = !C33129mqd.OLrzqt((java.lang.Object) dcaPreviewData.valueOf(), (java.lang.Object) 0) ? dcaPreviewData : null;
            if (dcaPreviewData2 != null) {
                botOrderItemKWHzl = KWHzl(dcaPreviewData2);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iAuCTel = yDY.AuCTel(list);
        int i = 1;
        if (1 <= iAuCTel) {
            while (true) {
                DcaPreviewData dcaPreviewData3 = list.get(i);
                if (!C33129mqd.OLrzqt((java.lang.Object) dcaPreviewData3.valueOf(), (java.lang.Object) 0)) {
                    arrayList.add(KWHzl(dcaPreviewData3));
                    if (i == iAuCTel) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return new Triple<>(botOrderItemKWHzl, arrayList, dcaPreviewData);
    }

    public final BotOrderItem KWHzl(DcaPreviewData dcaPreviewData) {
        BotOrderItem botOrderItem = new BotOrderItem();
        botOrderItem.setPrice(dcaPreviewData.EZpvd().toString());
        botOrderItem.setAmount(dcaPreviewData.valueOf().toString());
        return botOrderItem;
    }
}
