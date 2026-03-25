package com.okinc.dexkline.market.features.chart.domain;

import com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData;
import com.okinc.kline.data.KlineDexAvgDataBean;
import kotlin.jvm.internal.Intrinsics;
import o.C32163mRv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartPriceLineMapper {
    @yCM
    public ChartPriceLineMapper() {
    }

    public final KlineDexAvgDataBean AEQbTJ(@NotNull LatestPnLData latestPnLData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(latestPnLData, "");
        Intrinsics.checkNotNullParameter(str, "");
        KlineDexAvgDataBean klineDexAvgDataBean = new KlineDexAvgDataBean();
        klineDexAvgDataBean.setAccAvgPx(latestPnLData.OLrzqt());
        klineDexAvgDataBean.setFilterAddress(str);
        klineDexAvgDataBean.setPnlAmount(latestPnLData.KWHzl());
        klineDexAvgDataBean.setPnlRate(C32163mRv.formatPercentWithSymbol$default(latestPnLData.EZpvd(), false, 0, 0, null, null, 30, null));
        klineDexAvgDataBean.setPositionAmount(latestPnLData.AYXKKw());
        return klineDexAvgDataBean;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TransactionType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TransactionType[] $VALUES;
        public static final TransactionType BUY = new TransactionType("BUY", 0, "buy");
        public static final TransactionType SELL = new TransactionType("SELL", 1, "sell");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TransactionType[] $values() {
            return new TransactionType[]{BUY, SELL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TransactionType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private TransactionType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            TransactionType[] transactionTypeArr$values = $values();
            $VALUES = transactionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
        }

        public static TransactionType valueOf(String str) {
            return (TransactionType) Enum.valueOf(TransactionType.class, str);
        }

        public static TransactionType[] values() {
            return (TransactionType[]) $VALUES.clone();
        }
    }
}
