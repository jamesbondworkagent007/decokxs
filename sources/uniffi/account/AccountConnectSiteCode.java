package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class AccountConnectSiteCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountConnectSiteCode[] $VALUES;
    public static final AccountConnectSiteCode OKX_GLOBAL = new AccountConnectSiteCode("OKX_GLOBAL", 0);
    public static final AccountConnectSiteCode OKX_TR = new AccountConnectSiteCode("OKX_TR", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountConnectSiteCode[] $values() {
        return new AccountConnectSiteCode[]{OKX_GLOBAL, OKX_TR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountConnectSiteCode> getEntries() {
        return $ENTRIES;
    }

    private AccountConnectSiteCode(String str, int i) {
    }

    static {
        AccountConnectSiteCode[] accountConnectSiteCodeArr$values = $values();
        $VALUES = accountConnectSiteCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountConnectSiteCodeArr$values);
    }

    public static AccountConnectSiteCode valueOf(String str) {
        return (AccountConnectSiteCode) Enum.valueOf(AccountConnectSiteCode.class, str);
    }

    public static AccountConnectSiteCode[] values() {
        return (AccountConnectSiteCode[]) $VALUES.clone();
    }
}
