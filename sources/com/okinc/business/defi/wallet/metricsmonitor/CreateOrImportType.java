package com.okinc.business.defi.wallet.metricsmonitor;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class CreateOrImportType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CreateOrImportType[] $VALUES;
    public static final CreateOrImportType CREATE_WALLET = new CreateOrImportType("CREATE_WALLET", 0, "create_wallet");
    public static final CreateOrImportType IMPORT_WALLET = new CreateOrImportType("IMPORT_WALLET", 1, "import_wallet");
    private final String stringValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CreateOrImportType[] $values() {
        return new CreateOrImportType[]{CREATE_WALLET, IMPORT_WALLET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CreateOrImportType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStringValue() {
        return this.stringValue;
    }

    private CreateOrImportType(String str, int i, String str2) {
        this.stringValue = str2;
    }

    static {
        CreateOrImportType[] createOrImportTypeArr$values = $values();
        $VALUES = createOrImportTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(createOrImportTypeArr$values);
    }

    public static CreateOrImportType valueOf(String str) {
        return (CreateOrImportType) Enum.valueOf(CreateOrImportType.class, str);
    }

    public static CreateOrImportType[] values() {
        return (CreateOrImportType[]) $VALUES.clone();
    }
}
