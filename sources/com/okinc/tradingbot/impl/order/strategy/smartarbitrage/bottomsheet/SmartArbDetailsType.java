package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet;

import androidx.annotation.StringRes;
import o.C48033uCm;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbDetailsType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SmartArbDetailsType[] $VALUES;
    public static final SmartArbDetailsType Arbitrage = new SmartArbDetailsType("Arbitrage", 0, C48033uCm.Fragment.gGNlxh, C48033uCm.Fragment.iUnTnt, C48033uCm.Fragment.fiXcQa, C48033uCm.Fragment.DDjfYY);
    public static final SmartArbDetailsType Staking = new SmartArbDetailsType("Staking", 1, C55688xof.Application.RemoteActionCompatParcelizer, C48033uCm.Fragment.QWpYiD, C48033uCm.Fragment.QFTsTN, C48033uCm.Fragment.DDjfYY);
    private final int currentProfitLabel;
    private final int historicalWithdrawalLabel;
    private final int title;
    private final int totalProfitLabel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SmartArbDetailsType[] $values() {
        return new SmartArbDetailsType[]{Arbitrage, Staking};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SmartArbDetailsType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentProfitLabel() {
        return this.currentProfitLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHistoricalWithdrawalLabel() {
        return this.historicalWithdrawalLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalProfitLabel() {
        return this.totalProfitLabel;
    }

    private SmartArbDetailsType(@StringRes String str, @StringRes int i, @StringRes int i2, @StringRes int i3, int i4, int i5) {
        this.title = i2;
        this.totalProfitLabel = i3;
        this.currentProfitLabel = i4;
        this.historicalWithdrawalLabel = i5;
    }

    static {
        SmartArbDetailsType[] smartArbDetailsTypeArr$values = $values();
        $VALUES = smartArbDetailsTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(smartArbDetailsTypeArr$values);
    }

    public static SmartArbDetailsType valueOf(String str) {
        return (SmartArbDetailsType) Enum.valueOf(SmartArbDetailsType.class, str);
    }

    public static SmartArbDetailsType[] values() {
        return (SmartArbDetailsType[]) $VALUES.clone();
    }
}
