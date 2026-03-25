package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class GasPayType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GasPayType[] $VALUES;
    public static final ActionBar Companion;
    public static final GasPayType FREE = new GasPayType("FREE", 0, 1);
    public static final GasPayType NOT_FREE = new GasPayType("NOT_FREE", 1, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GasPayType[] $values() {
        return new GasPayType[]{FREE, NOT_FREE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GasPayType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private GasPayType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        GasPayType[] gasPayTypeArr$values = $values();
        $VALUES = gasPayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(gasPayTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.GasPayType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final GasPayType copydefault(int i) {
            for (GasPayType gasPayType : GasPayType.values()) {
                if (gasPayType.getValue() == i) {
                    return gasPayType;
                }
            }
            return null;
        }
    }

    public static GasPayType valueOf(String str) {
        return (GasPayType) Enum.valueOf(GasPayType.class, str);
    }

    public static GasPayType[] values() {
        return (GasPayType[]) $VALUES.clone();
    }
}
