package com.okinc.business.dexui.main.shared.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TradeMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeMode[] $VALUES;
    public static final Activity Companion;
    private final String type;
    public static final TradeMode SwapMarket = new TradeMode("SwapMarket", 0, "Swap_Market");
    public static final TradeMode SwapLimit = new TradeMode("SwapLimit", 1, "Swap_Limit");
    public static final TradeMode EasyBuy = new TradeMode("EasyBuy", 2, "Easy_Buy");
    public static final TradeMode EasySell = new TradeMode("EasySell", 3, "Easy_Sell");
    public static final TradeMode Bridge = new TradeMode("Bridge", 4, "Bridge");
    public static final TradeMode Meme = new TradeMode("Meme", 5, "Meme");
    public static final TradeMode Advanced = new TradeMode("Advanced", 6, "Advanced");
    public static final TradeMode CopyTradeEdit = new TradeMode("CopyTradeEdit", 7, "CopyTradeEdit");
    public static final TradeMode CopyTradeCreate = new TradeMode("CopyTradeCreate", 8, "CopyTradeCreate");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeMode[] $values() {
        return new TradeMode[]{SwapMarket, SwapLimit, EasyBuy, EasySell, Bridge, Meme, Advanced, CopyTradeEdit, CopyTradeCreate};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCopyTrading() {
        return this == CopyTradeEdit || this == CopyTradeCreate;
    }

    private TradeMode(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        TradeMode[] tradeModeArr$values = $values();
        $VALUES = tradeModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeModeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.shared.model.TradeMode.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TradeMode KWHzl(@NotNull String str) {
            TradeMode next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<TradeMode> it = TradeMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getType(), (Object) str)) {
                    break;
                }
            }
            TradeMode tradeMode = next;
            return tradeMode == null ? TradeMode.SwapMarket : tradeMode;
        }
    }

    public static TradeMode valueOf(String str) {
        return (TradeMode) Enum.valueOf(TradeMode.class, str);
    }

    public static TradeMode[] values() {
        return (TradeMode[]) $VALUES.clone();
    }
}
