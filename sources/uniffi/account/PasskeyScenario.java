package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class PasskeyScenario {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyScenario[] $VALUES;
    public static final PasskeyScenario ACCOUNT = new PasskeyScenario("ACCOUNT", 0);
    public static final PasskeyScenario OKX_PAY = new PasskeyScenario("OKX_PAY", 1);
    public static final PasskeyScenario CEDEFI_WALLET = new PasskeyScenario("CEDEFI_WALLET", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyScenario[] $values() {
        return new PasskeyScenario[]{ACCOUNT, OKX_PAY, CEDEFI_WALLET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyScenario> getEntries() {
        return $ENTRIES;
    }

    private PasskeyScenario(String str, int i) {
    }

    static {
        PasskeyScenario[] passkeyScenarioArr$values = $values();
        $VALUES = passkeyScenarioArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyScenarioArr$values);
    }

    public static PasskeyScenario valueOf(String str) {
        return (PasskeyScenario) Enum.valueOf(PasskeyScenario.class, str);
    }

    public static PasskeyScenario[] values() {
        return (PasskeyScenario[]) $VALUES.clone();
    }
}
