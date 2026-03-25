package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class MfaScenario {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MfaScenario[] $VALUES;
    public static final MfaScenario POST = new MfaScenario("POST", 0);
    public static final MfaScenario PRE = new MfaScenario("PRE", 1);
    public static final MfaScenario NON = new MfaScenario("NON", 2);
    public static final MfaScenario LOGGED_IN = new MfaScenario("LOGGED_IN", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MfaScenario[] $values() {
        return new MfaScenario[]{POST, PRE, NON, LOGGED_IN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MfaScenario> getEntries() {
        return $ENTRIES;
    }

    private MfaScenario(String str, int i) {
    }

    static {
        MfaScenario[] mfaScenarioArr$values = $values();
        $VALUES = mfaScenarioArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mfaScenarioArr$values);
    }

    public static MfaScenario valueOf(String str) {
        return (MfaScenario) Enum.valueOf(MfaScenario.class, str);
    }

    public static MfaScenario[] values() {
        return (MfaScenario[]) $VALUES.clone();
    }
}
