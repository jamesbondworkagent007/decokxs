package com.okinc.business.trade.features.home.ui.cefi.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedChainType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedChainType[] $VALUES;
    public static final ActionBar Companion;
    private final String value;
    public static final AdvancedChainType SOL = new AdvancedChainType("SOL", 0, "0");
    public static final AdvancedChainType EVM = new AdvancedChainType("EVM", 1, "1");
    public static final AdvancedChainType OTHER = new AdvancedChainType("OTHER", 2, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedChainType[] $values() {
        return new AdvancedChainType[]{SOL, EVM, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedChainType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private AdvancedChainType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedChainType[] advancedChainTypeArr$values = $values();
        $VALUES = advancedChainTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedChainTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedChainType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static AdvancedChainType valueOf(String str) {
        return (AdvancedChainType) Enum.valueOf(AdvancedChainType.class, str);
    }

    public static AdvancedChainType[] values() {
        return (AdvancedChainType[]) $VALUES.clone();
    }
}
