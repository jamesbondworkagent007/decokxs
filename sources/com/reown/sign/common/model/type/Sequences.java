package com.reown.sign.common.model.type;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class Sequences {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ Sequences[] $VALUES;
    public static final Sequences SESSION = new Sequences("SESSION", 0);
    public static final Sequences PAIRING = new Sequences("PAIRING", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ Sequences[] $values() {
        return new Sequences[]{SESSION, PAIRING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Sequences> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Sequences valueOf(String str) {
        return (Sequences) Enum.valueOf(Sequences.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Sequences[] values() {
        return (Sequences[]) $VALUES.clone();
    }

    public Sequences(String str, int i) {
    }

    static {
        Sequences[] sequencesArr$values = $values();
        $VALUES = sequencesArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sequencesArr$values);
    }
}
