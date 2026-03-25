package com.okinc.business.market.features.chart.domain;

import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.trade.features.home.ui.meme.data.MemeExchangeDirection;
import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData;
import com.okinc.kline.data.KlineOpenOrderBean;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C23271hvA;
import o.C25982jNo;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartPriceLineMapper {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public ChartPriceLineMapper() {
    }

    public final KlineOpenOrderBean OLrzqt(@NotNull OpenOrderData openOrderData) {
        String toTokenAmount;
        Intrinsics.checkNotNullParameter(openOrderData, "");
        TransactionType transactionType = openOrderData.getExchangeDirection() == MemeExchangeDirection.BUY.getValue() ? TransactionType.BUY : TransactionType.SELL;
        KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
        klineOpenOrderBean.setOrdType("limit");
        C23271hvA c23271hvA = C23271hvA.copydefault;
        int i = Activity.copydefault[transactionType.ordinal()];
        if (i == 1) {
            toTokenAmount = openOrderData.getToTokenAmount();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toTokenAmount = openOrderData.getFromTokenAmount();
        }
        klineOpenOrderBean.setAmountNoSign(C23271hvA.getShowData$default(c23271hvA, toTokenAmount, false, RoundingMode.DOWN, false, false, 26, null));
        klineOpenOrderBean.setSide(transactionType.getValue());
        klineOpenOrderBean.setPrice(openOrderData.getTriggerPrice());
        return klineOpenOrderBean;
    }

    public final C25982jNo KWHzl(@NotNull LatestPnLData latestPnLData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(latestPnLData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C25982jNo(C33129mqd.AEQbTJ(latestPnLData.AEQbTJ()), C33129mqd.AEQbTJ(latestPnLData.djBIcL()), C33129mqd.AEQbTJ(latestPnLData.gEmmrt()), C33129mqd.AEQbTJ(latestPnLData.AYXKKw()), latestPnLData.KWHzl(), str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
