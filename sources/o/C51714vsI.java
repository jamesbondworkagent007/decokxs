package o;

import com.github.mikephil.charting.data.Entry;
import com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51714vsI implements InterfaceC54501xKt<java.util.List<? extends BotAssetsHistoryData>, BotAssetsChartData> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public BotAssetsChartData KWHzl(@NotNull java.util.List<BotAssetsHistoryData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Entry entry = new Entry(0.0f, 1.0f);
        Entry entry2 = new Entry(0.0f, 1.0f);
        int i = 0;
        BigDecimal bigDecimalCopydefault = C33129mqd.copydefault(0);
        BigDecimal bigDecimalCopydefault2 = C33129mqd.copydefault(0);
        if (!list.isEmpty()) {
            int size = list.size() / 30;
            if (size <= 0) {
                size = 1;
            }
            int size2 = list.size();
            if (size <= 0) {
                throw new java.lang.IllegalArgumentException("Step must be positive, was: " + size + JwtUtilsKt.JWT_DELIMITER);
            }
            int iEZpvd = C56453yFy.EZpvd(0, size2 - 1, size);
            if (iEZpvd >= 0) {
                while (true) {
                    BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(list.get(i).getAssets());
                    if (i == 0) {
                        bigDecimalCopydefault2 = bigDecimalEZpvd;
                        bigDecimalCopydefault = bigDecimalCopydefault2;
                    }
                    Entry entry3 = new Entry(C33129mqd.djBIcL(java.lang.Integer.valueOf(i)), C33129mqd.djBIcL(bigDecimalEZpvd), list.get(i));
                    if (C33129mqd.copydefault(bigDecimalEZpvd, bigDecimalCopydefault)) {
                        bigDecimalCopydefault = bigDecimalEZpvd;
                        entry = entry3;
                    }
                    if (C33129mqd.valueOf(bigDecimalEZpvd, bigDecimalCopydefault2)) {
                        bigDecimalCopydefault2 = bigDecimalEZpvd;
                        entry2 = entry3;
                    }
                    arrayList.add(entry3);
                    if (i == iEZpvd) {
                        break;
                    }
                    i += size;
                }
            }
            if (i != list.size() - 1) {
                int size3 = list.size() - 1;
                BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(list.get(size3).getAssets());
                Entry entry4 = new Entry(C33129mqd.djBIcL(java.lang.Integer.valueOf(size3)), C33129mqd.djBIcL(bigDecimalEZpvd2), list.get(size3));
                if (C33129mqd.copydefault(bigDecimalEZpvd2, bigDecimalCopydefault)) {
                    entry = entry4;
                }
                if (C33129mqd.valueOf(bigDecimalEZpvd2, bigDecimalCopydefault2)) {
                    entry2 = entry4;
                }
                arrayList.add(entry4);
            }
        }
        Entry entry5 = entry2;
        Entry entry6 = entry;
        BotAssetsHistoryData botAssetsHistoryData = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.wlaJM(list);
        java.lang.String assets = botAssetsHistoryData != null ? botAssetsHistoryData.getAssets() : null;
        BotAssetsHistoryData botAssetsHistoryData2 = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.firstOrNull(list);
        return new BotAssetsChartData(entry5, entry6, arrayList, C33129mqd.copydefault(assets, botAssetsHistoryData2 != null ? botAssetsHistoryData2.getAssets() : null), null, 16, null);
    }
}
