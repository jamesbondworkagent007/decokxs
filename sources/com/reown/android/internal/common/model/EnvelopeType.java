package com.reown.android.internal.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class EnvelopeType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ EnvelopeType[] $VALUES;
    public final byte id;
    public static final EnvelopeType ZERO = new EnvelopeType("ZERO", 0, (byte) 0);
    public static final EnvelopeType ONE = new EnvelopeType("ONE", 1, (byte) 1);
    public static final EnvelopeType TWO = new EnvelopeType("TWO", 2, (byte) 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ EnvelopeType[] $values() {
        return new EnvelopeType[]{ZERO, ONE, TWO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EnvelopeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static EnvelopeType valueOf(String str) {
        return (EnvelopeType) Enum.valueOf(EnvelopeType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static EnvelopeType[] values() {
        return (EnvelopeType[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte getId() {
        return this.id;
    }

    public EnvelopeType(String str, int i, byte b) {
        this.id = b;
    }

    static {
        EnvelopeType[] envelopeTypeArr$values = $values();
        $VALUES = envelopeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(envelopeTypeArr$values);
    }
}
