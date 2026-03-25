package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class EscapeChainType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EscapeChainType[] $VALUES;
    public static final EscapeChainType CHAIN_TYPE_EVM = new EscapeChainType("CHAIN_TYPE_EVM", 0, 1);
    public static final EscapeChainType CHAIN_TYPE_SOL = new EscapeChainType("CHAIN_TYPE_SOL", 1, 501);
    public static final ActionBar Companion;
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EscapeChainType[] $values() {
        return new EscapeChainType[]{CHAIN_TYPE_EVM, CHAIN_TYPE_SOL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EscapeChainType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private EscapeChainType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        EscapeChainType[] escapeChainTypeArr$values = $values();
        $VALUES = escapeChainTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(escapeChainTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeChainType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static EscapeChainType valueOf(String str) {
        return (EscapeChainType) Enum.valueOf(EscapeChainType.class, str);
    }

    public static EscapeChainType[] values() {
        return (EscapeChainType[]) $VALUES.clone();
    }
}
