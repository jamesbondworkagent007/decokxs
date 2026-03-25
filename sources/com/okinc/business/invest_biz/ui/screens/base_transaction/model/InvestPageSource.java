package com.okinc.business.invest_biz.ui.screens.base_transaction.model;

import com.okinc.wallet.mln.service.UDWallet;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class InvestPageSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestPageSource[] $VALUES;
    public static final InvestPageSource Home = new InvestPageSource("Home", 0);
    public static final InvestPageSource Detail = new InvestPageSource("Detail", 1);
    public static final InvestPageSource Default = new InvestPageSource("Default", 2);
    public static final InvestPageSource SubscriptionCenter = new InvestPageSource("SubscriptionCenter", 3);
    public static final InvestPageSource Boost = new InvestPageSource("Boost", 4);
    public static final InvestPageSource Wallet = new InvestPageSource(UDWallet.LUA_CLASS_NAME, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestPageSource[] $values() {
        return new InvestPageSource[]{Home, Detail, Default, SubscriptionCenter, Boost, Wallet};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestPageSource> getEntries() {
        return $ENTRIES;
    }

    private InvestPageSource(String str, int i) {
    }

    static {
        InvestPageSource[] investPageSourceArr$values = $values();
        $VALUES = investPageSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investPageSourceArr$values);
    }

    public static InvestPageSource valueOf(String str) {
        return (InvestPageSource) Enum.valueOf(InvestPageSource.class, str);
    }

    public static InvestPageSource[] values() {
        return (InvestPageSource[]) $VALUES.clone();
    }
}
