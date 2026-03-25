package uniffi.experiment;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class AbTestInstance {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AbTestInstance[] $VALUES;
    public static final AbTestInstance CEFI = new AbTestInstance("CEFI", 0);
    public static final AbTestInstance WEB3 = new AbTestInstance("WEB3", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AbTestInstance[] $values() {
        return new AbTestInstance[]{CEFI, WEB3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AbTestInstance> getEntries() {
        return $ENTRIES;
    }

    private AbTestInstance(String str, int i) {
    }

    static {
        AbTestInstance[] abTestInstanceArr$values = $values();
        $VALUES = abTestInstanceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(abTestInstanceArr$values);
    }

    public static AbTestInstance valueOf(String str) {
        return (AbTestInstance) Enum.valueOf(AbTestInstance.class, str);
    }

    public static AbTestInstance[] values() {
        return (AbTestInstance[]) $VALUES.clone();
    }
}
