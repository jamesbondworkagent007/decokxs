package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SmartArbWithdrawType[] $VALUES;
    public static final SmartArbWithdrawType Arbitrage = new SmartArbWithdrawType("Arbitrage", 0, C55688xof.Application.access100, "");
    public static final SmartArbWithdrawType Staking = new SmartArbWithdrawType("Staking", 1, C55688xof.Application.RemoteActionCompatParcelizer, "");
    private String ccy;
    private final int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SmartArbWithdrawType[] $values() {
        return new SmartArbWithdrawType[]{Arbitrage, Staking};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SmartArbWithdrawType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    private SmartArbWithdrawType(@StringRes String str, int i, int i2, String str2) {
        this.label = i2;
        this.ccy = str2;
    }

    static {
        SmartArbWithdrawType[] smartArbWithdrawTypeArr$values = $values();
        $VALUES = smartArbWithdrawTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(smartArbWithdrawTypeArr$values);
    }

    public static SmartArbWithdrawType valueOf(String str) {
        return (SmartArbWithdrawType) Enum.valueOf(SmartArbWithdrawType.class, str);
    }

    public static SmartArbWithdrawType[] values() {
        return (SmartArbWithdrawType[]) $VALUES.clone();
    }
}
