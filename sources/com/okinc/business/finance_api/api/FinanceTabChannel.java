package com.okinc.business.finance_api.api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FinanceTabChannel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FinanceTabChannel[] $VALUES;
    private final String channelId;
    private final String channelName;
    public static final FinanceTabChannel Earn = new FinanceTabChannel("Earn", 0, "0", "earn");
    public static final FinanceTabChannel Loan = new FinanceTabChannel("Loan", 1, "1", "loan");
    public static final FinanceTabChannel Jumpstart = new FinanceTabChannel("Jumpstart", 2, "2", "jumpstart");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FinanceTabChannel[] $values() {
        return new FinanceTabChannel[]{Earn, Loan, Jumpstart};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FinanceTabChannel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelName() {
        return this.channelName;
    }

    private FinanceTabChannel(String str, int i, String str2, String str3) {
        this.channelId = str2;
        this.channelName = str3;
    }

    static {
        FinanceTabChannel[] financeTabChannelArr$values = $values();
        $VALUES = financeTabChannelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(financeTabChannelArr$values);
    }

    public static FinanceTabChannel valueOf(String str) {
        return (FinanceTabChannel) Enum.valueOf(FinanceTabChannel.class, str);
    }

    public static FinanceTabChannel[] values() {
        return (FinanceTabChannel[]) $VALUES.clone();
    }
}
