package aws.smithy.kotlin.runtime.util;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class SupplierState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SupplierState[] $VALUES;
    public static final SupplierState NOT_INITIALIZED = new SupplierState("NOT_INITIALIZED", 0);
    public static final SupplierState INITIALIZED = new SupplierState("INITIALIZED", 1);
    public static final SupplierState EXPLICIT_CONFIG = new SupplierState("EXPLICIT_CONFIG", 2);
    public static final SupplierState EXPLICIT_INSTANCE = new SupplierState("EXPLICIT_INSTANCE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SupplierState[] $values() {
        return new SupplierState[]{NOT_INITIALIZED, INITIALIZED, EXPLICIT_CONFIG, EXPLICIT_INSTANCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SupplierState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SupplierState valueOf(String str) {
        return (SupplierState) Enum.valueOf(SupplierState.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SupplierState[] values() {
        return (SupplierState[]) $VALUES.clone();
    }

    private SupplierState(String str, int i) {
    }

    static {
        SupplierState[] supplierStateArr$values = $values();
        $VALUES = supplierStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(supplierStateArr$values);
    }
}
