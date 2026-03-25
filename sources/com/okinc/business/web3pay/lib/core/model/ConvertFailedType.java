package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ConvertFailedType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertFailedType[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final ConvertFailedType CONVERT_FAILED_TYPE_UNKNOWN = new ConvertFailedType("CONVERT_FAILED_TYPE_UNKNOWN", 0, 0);
    public static final ConvertFailedType CONVERT_FAILED_TYPE_TO_CEX_FAILED = new ConvertFailedType("CONVERT_FAILED_TYPE_TO_CEX_FAILED", 1, 1);
    public static final ConvertFailedType CONVERT_FAILED_TYPE_CONVERT_FAILED = new ConvertFailedType("CONVERT_FAILED_TYPE_CONVERT_FAILED", 2, 2);
    public static final ConvertFailedType CONVERT_FAILED_TYPE_CAN_RETURN_TO_CEX = new ConvertFailedType("CONVERT_FAILED_TYPE_CAN_RETURN_TO_CEX", 3, 3);
    public static final ConvertFailedType CONVERT_FAILED_TYPE_CAN_NOT_RETURN_TO_CEX = new ConvertFailedType("CONVERT_FAILED_TYPE_CAN_NOT_RETURN_TO_CEX", 4, 4);
    public static final ConvertFailedType CONVERT_FAILED_TYPE_PAY_TO_ADDRESS = new ConvertFailedType("CONVERT_FAILED_TYPE_PAY_TO_ADDRESS", 5, 5);
    public static final ConvertFailedType PAY2ADDRESS_FAILED_TYPE_TRAVEL_RULE = new ConvertFailedType("PAY2ADDRESS_FAILED_TYPE_TRAVEL_RULE", 6, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertFailedType[] $values() {
        return new ConvertFailedType[]{CONVERT_FAILED_TYPE_UNKNOWN, CONVERT_FAILED_TYPE_TO_CEX_FAILED, CONVERT_FAILED_TYPE_CONVERT_FAILED, CONVERT_FAILED_TYPE_CAN_RETURN_TO_CEX, CONVERT_FAILED_TYPE_CAN_NOT_RETURN_TO_CEX, CONVERT_FAILED_TYPE_PAY_TO_ADDRESS, PAY2ADDRESS_FAILED_TYPE_TRAVEL_RULE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertFailedType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ConvertFailedType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ConvertFailedType[] convertFailedTypeArr$values = $values();
        $VALUES = convertFailedTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertFailedTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ConvertFailedType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ConvertFailedType KWHzl(int i) {
            for (ConvertFailedType convertFailedType : ConvertFailedType.values()) {
                if (convertFailedType.getValue() == i) {
                    return convertFailedType;
                }
            }
            return null;
        }
    }

    public static ConvertFailedType valueOf(String str) {
        return (ConvertFailedType) Enum.valueOf(ConvertFailedType.class, str);
    }

    public static ConvertFailedType[] values() {
        return (ConvertFailedType[]) $VALUES.clone();
    }
}
