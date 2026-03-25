package o;

import com.github.mikephil.charting.data.Entry;
import com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51715vsJ implements InterfaceC54501xKt<java.util.List<? extends BotAssetsHistoryData>, BotAssetsChartData> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ BotAssetsChartData KWHzl(java.util.List<? extends BotAssetsHistoryData> list) {
        return KWHzl2((java.util.List<BotAssetsHistoryData>) list);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public BotAssetsChartData KWHzl2(@NotNull java.util.List<BotAssetsHistoryData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Entry entry = new Entry(0.0f, 1.0f);
        Entry entry2 = new Entry(0.0f, 1.0f);
        int i = 0;
        BigDecimal bigDecimalCopydefault = C33129mqd.copydefault(0);
        BigDecimal bigDecimalCopydefault2 = C33129mqd.copydefault(0);
        Entry entry3 = entry;
        BigDecimal bigDecimal = bigDecimalCopydefault2;
        Entry entry4 = entry2;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            BotAssetsHistoryData botAssetsHistoryData = (BotAssetsHistoryData) obj;
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(botAssetsHistoryData.getAssets());
            Entry entry5 = new Entry(C33129mqd.djBIcL(java.lang.Integer.valueOf(i)), C33129mqd.djBIcL(bigDecimalEZpvd), botAssetsHistoryData);
            if (i == 0) {
                bigDecimal = bigDecimalEZpvd;
                bigDecimalCopydefault = bigDecimal;
            }
            if (C33129mqd.copydefault(bigDecimalEZpvd, bigDecimalCopydefault)) {
                bigDecimalCopydefault = bigDecimalEZpvd;
                entry3 = entry5;
            }
            if (C33129mqd.valueOf(bigDecimalEZpvd, bigDecimal)) {
                bigDecimal = bigDecimalEZpvd;
                entry4 = entry5;
            }
            arrayList.add(entry5);
            i++;
        }
        BotAssetsHistoryData botAssetsHistoryData2 = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.wlaJM(list);
        java.lang.String assets = botAssetsHistoryData2 != null ? botAssetsHistoryData2.getAssets() : null;
        BotAssetsHistoryData botAssetsHistoryData3 = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.firstOrNull(list);
        return new BotAssetsChartData(entry4, entry3, arrayList, C33129mqd.copydefault(assets, botAssetsHistoryData3 != null ? botAssetsHistoryData3.getAssets() : null), null, 16, null);
    }
}
