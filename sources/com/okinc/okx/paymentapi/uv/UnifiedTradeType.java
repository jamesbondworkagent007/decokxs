package com.okinc.okx.paymentapi.uv;

import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class UnifiedTradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UnifiedTradeType[] $VALUES;
    public static final ActionBar Companion;
    private final String type;
    public static final UnifiedTradeType BUY = new UnifiedTradeType("BUY", 0, "buy");
    public static final UnifiedTradeType SELL = new UnifiedTradeType("SELL", 1, "sell");
    public static final UnifiedTradeType TOPUP = new UnifiedTradeType("TOPUP", 2, "topup");
    public static final UnifiedTradeType DEPOSIT = new UnifiedTradeType("DEPOSIT", 3, "deposit");
    public static final UnifiedTradeType WITHDRAW = new UnifiedTradeType("WITHDRAW", 4, "withdraw");
    public static final UnifiedTradeType CONVERT = new UnifiedTradeType("CONVERT", 5, "convert");
    public static final UnifiedTradeType DEFAULT = new UnifiedTradeType("DEFAULT", 6, "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UnifiedTradeType[] $values() {
        return new UnifiedTradeType[]{BUY, SELL, TOPUP, DEPOSIT, WITHDRAW, CONVERT, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UnifiedTradeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private UnifiedTradeType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        UnifiedTradeType[] unifiedTradeTypeArr$values = $values();
        $VALUES = unifiedTradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(unifiedTradeTypeArr$values);
        Companion = new ActionBar(null);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.uv.UnifiedTradeType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final UnifiedTradeType OLrzqt(@NotNull TradeType tradeType) {
            UnifiedTradeType unifiedTradeType;
            Intrinsics.checkNotNullParameter(tradeType, "");
            UnifiedTradeType[] unifiedTradeTypeArrValues = UnifiedTradeType.values();
            int length = unifiedTradeTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    unifiedTradeType = null;
                    break;
                }
                unifiedTradeType = unifiedTradeTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) unifiedTradeType.getType(), (Object) tradeType.getType())) {
                    break;
                }
                i++;
            }
            return unifiedTradeType == null ? UnifiedTradeType.DEFAULT : unifiedTradeType;
        }
    }

    public static UnifiedTradeType valueOf(String str) {
        return (UnifiedTradeType) Enum.valueOf(UnifiedTradeType.class, str);
    }

    public static UnifiedTradeType[] values() {
        return (UnifiedTradeType[]) $VALUES.clone();
    }
}
