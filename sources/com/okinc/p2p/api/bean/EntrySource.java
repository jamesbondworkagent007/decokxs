package com.okinc.p2p.api.bean;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.p2p.api.OtcExtraKeys;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class EntrySource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EntrySource[] $VALUES;
    private final String value;
    public static final EntrySource ASSET = new EntrySource("ASSET", 0, "asset");
    public static final EntrySource HOME = new EntrySource("HOME", 1, "home");
    public static final EntrySource MARKET = new EntrySource("MARKET", 2, "market");
    public static final EntrySource PAYMENTS = new EntrySource("PAYMENTS", 3, OtcExtraKeys.PAYMENT);
    public static final EntrySource REFERRAL = new EntrySource("REFERRAL", 4, "refferal");
    public static final EntrySource TRADE = new EntrySource("TRADE", 5, ExtJson.BRC20TYPE_TRADE);
    public static final EntrySource IM = new EntrySource(OtcExtraKeys.IM, 6, "im");
    public static final EntrySource ACCOUNT = new EntrySource("ACCOUNT", 7, MTAnalysisConstants.Account.KEY_ACCOUNT);
    public static final EntrySource UNKNOWN = new EntrySource("UNKNOWN", 8, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EntrySource[] $values() {
        return new EntrySource[]{ASSET, HOME, MARKET, PAYMENTS, REFERRAL, TRADE, IM, ACCOUNT, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EntrySource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private EntrySource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        EntrySource[] entrySourceArr$values = $values();
        $VALUES = entrySourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(entrySourceArr$values);
    }

    public static EntrySource valueOf(String str) {
        return (EntrySource) Enum.valueOf(EntrySource.class, str);
    }

    public static EntrySource[] values() {
        return (EntrySource[]) $VALUES.clone();
    }
}
