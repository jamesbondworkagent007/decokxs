package com.okinc.unify_trade.biz.bot;

import androidx.annotation.StringRes;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes24.dex */
public interface TradeListStatusType {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Grid implements TradeListStatusType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Grid[] $VALUES;
        private final String code;
        private final Integer label;
        public static final Grid GroupCompleted = new Grid("GroupCompleted", 0, "1", null);
        public static final Grid BuyOrderCompleted = new Grid("BuyOrderCompleted", 1, "2", Integer.valueOf(C55688xof.Application.getMediaDescription));
        public static final Grid SellOrderCompleted = new Grid("SellOrderCompleted", 2, "3", Integer.valueOf(C55688xof.Application.setSubscription));

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Grid[] $values() {
            return new Grid[]{GroupCompleted, BuyOrderCompleted, SellOrderCompleted};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Grid> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getLabel() {
            return this.label;
        }

        private Grid(String str, @StringRes int i, String str2, Integer num) {
            this.code = str2;
            this.label = num;
        }

        static {
            Grid[] gridArr$values = $values();
            $VALUES = gridArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(gridArr$values);
        }

        public static Grid valueOf(String str) {
            return (Grid) Enum.valueOf(Grid.class, str);
        }

        public static Grid[] values() {
            return (Grid[]) $VALUES.clone();
        }
    }
}
