package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class StepOneButtonName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StepOneButtonName[] $VALUES;
    public static final StepOneButtonName BACK = new StepOneButtonName("BACK", 0);
    public static final StepOneButtonName START = new StepOneButtonName("START", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StepOneButtonName[] $values() {
        return new StepOneButtonName[]{BACK, START};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StepOneButtonName> getEntries() {
        return $ENTRIES;
    }

    private StepOneButtonName(String str, int i) {
    }

    static {
        StepOneButtonName[] stepOneButtonNameArr$values = $values();
        $VALUES = stepOneButtonNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(stepOneButtonNameArr$values);
    }

    public static StepOneButtonName valueOf(String str) {
        return (StepOneButtonName) Enum.valueOf(StepOneButtonName.class, str);
    }

    public static StepOneButtonName[] values() {
        return (StepOneButtonName[]) $VALUES.clone();
    }
}
