package com.okinc.business.defi.assets.utxo.utxomanagement;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class UtxoConfirmationContext {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UtxoConfirmationContext[] $VALUES;
    public static final UtxoConfirmationContext Undefined = new UtxoConfirmationContext("Undefined", 0);
    public static final UtxoConfirmationContext Dapp = new UtxoConfirmationContext("Dapp", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UtxoConfirmationContext[] $values() {
        return new UtxoConfirmationContext[]{Undefined, Dapp};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UtxoConfirmationContext> getEntries() {
        return $ENTRIES;
    }

    private UtxoConfirmationContext(String str, int i) {
    }

    static {
        UtxoConfirmationContext[] utxoConfirmationContextArr$values = $values();
        $VALUES = utxoConfirmationContextArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(utxoConfirmationContextArr$values);
    }

    public static UtxoConfirmationContext valueOf(String str) {
        return (UtxoConfirmationContext) Enum.valueOf(UtxoConfirmationContext.class, str);
    }

    public static UtxoConfirmationContext[] values() {
        return (UtxoConfirmationContext[]) $VALUES.clone();
    }
}
