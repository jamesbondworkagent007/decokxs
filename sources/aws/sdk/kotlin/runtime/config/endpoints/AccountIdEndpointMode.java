package aws.sdk.kotlin.runtime.config.endpoints;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class AccountIdEndpointMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountIdEndpointMode[] $VALUES;
    public static final AccountIdEndpointMode PREFERRED = new AccountIdEndpointMode("PREFERRED", 0);
    public static final AccountIdEndpointMode DISABLED = new AccountIdEndpointMode("DISABLED", 1);
    public static final AccountIdEndpointMode REQUIRED = new AccountIdEndpointMode("REQUIRED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountIdEndpointMode[] $values() {
        return new AccountIdEndpointMode[]{PREFERRED, DISABLED, REQUIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountIdEndpointMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AccountIdEndpointMode valueOf(String str) {
        return (AccountIdEndpointMode) Enum.valueOf(AccountIdEndpointMode.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AccountIdEndpointMode[] values() {
        return (AccountIdEndpointMode[]) $VALUES.clone();
    }

    private AccountIdEndpointMode(String str, int i) {
    }

    static {
        AccountIdEndpointMode[] accountIdEndpointModeArr$values = $values();
        $VALUES = accountIdEndpointModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountIdEndpointModeArr$values);
    }
}
