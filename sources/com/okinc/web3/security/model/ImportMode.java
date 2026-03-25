package com.okinc.web3.security.model;

import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ImportMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ImportMode[] $VALUES;
    public static final ImportMode All = new ImportMode("All", 0, 7);
    public static final ImportMode PrivateKey = new ImportMode("PrivateKey", 1, 1);
    public static final ImportMode SeedPhraseNormal = new ImportMode("SeedPhraseNormal", 2, 2);
    public static final ImportMode SeedPhraseTON = new ImportMode("SeedPhraseTON", 3, 4);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ImportMode[] $values() {
        return new ImportMode[]{All, PrivateKey, SeedPhraseNormal, SeedPhraseTON};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ImportMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ImportMode(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ImportMode[] importModeArr$values = $values();
        $VALUES = importModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(importModeArr$values);
    }

    public final boolean contain(@NotNull ImportMode importMode) {
        Intrinsics.checkNotNullParameter(importMode, "");
        int i = this.value;
        int i2 = importMode.value;
        return (i & i2) == i2;
    }

    public static ImportMode valueOf(String str) {
        return (ImportMode) Enum.valueOf(ImportMode.class, str);
    }

    public static ImportMode[] values() {
        return (ImportMode[]) $VALUES.clone();
    }
}
