package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ConvertOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertOrderType[] $VALUES;
    public static final ConvertOrderType CONVERT_ORDER_TYPE_CONVERT = new ConvertOrderType("CONVERT_ORDER_TYPE_CONVERT", 0, 1);
    public static final ConvertOrderType CONVERT_ORDER_TYPE_PAY_TO_ADDRESS = new ConvertOrderType("CONVERT_ORDER_TYPE_PAY_TO_ADDRESS", 1, 2);
    public static final ActionBar Companion;
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertOrderType[] $values() {
        return new ConvertOrderType[]{CONVERT_ORDER_TYPE_CONVERT, CONVERT_ORDER_TYPE_PAY_TO_ADDRESS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertOrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ConvertOrderType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ConvertOrderType[] convertOrderTypeArr$values = $values();
        $VALUES = convertOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertOrderTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ConvertOrderType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ConvertOrderType copydefault(int i) {
            for (ConvertOrderType convertOrderType : ConvertOrderType.values()) {
                if (convertOrderType.getValue() == i) {
                    return convertOrderType;
                }
            }
            return null;
        }
    }

    public static ConvertOrderType valueOf(String str) {
        return (ConvertOrderType) Enum.valueOf(ConvertOrderType.class, str);
    }

    public static ConvertOrderType[] values() {
        return (ConvertOrderType[]) $VALUES.clone();
    }
}
