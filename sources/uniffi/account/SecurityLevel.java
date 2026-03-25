package uniffi.account;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SecurityLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SecurityLevel[] $VALUES;
    public static final SecurityLevel LOW = new SecurityLevel(VerifyDAppDomainUrlResponse.LEVEL_LOW, 0);
    public static final SecurityLevel MODERATE = new SecurityLevel("MODERATE", 1);
    public static final SecurityLevel HIGH = new SecurityLevel(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SecurityLevel[] $values() {
        return new SecurityLevel[]{LOW, MODERATE, HIGH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SecurityLevel> getEntries() {
        return $ENTRIES;
    }

    private SecurityLevel(String str, int i) {
    }

    static {
        SecurityLevel[] securityLevelArr$values = $values();
        $VALUES = securityLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(securityLevelArr$values);
    }

    public static SecurityLevel valueOf(String str) {
        return (SecurityLevel) Enum.valueOf(SecurityLevel.class, str);
    }

    public static SecurityLevel[] values() {
        return (SecurityLevel[]) $VALUES.clone();
    }
}
