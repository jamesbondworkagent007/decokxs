package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ConvertStageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertStageType[] $VALUES;
    public static final ConvertStageType CONVERT_STAGE_TYPE_TO_CEX = new ConvertStageType("CONVERT_STAGE_TYPE_TO_CEX", 0, 0);
    public static final ConvertStageType CONVERT_STAGE_TYPE_TO_CONVERT = new ConvertStageType("CONVERT_STAGE_TYPE_TO_CONVERT", 1, 1);
    public static final ConvertStageType CONVERT_STAGE_TYPE_TO_SA = new ConvertStageType("CONVERT_STAGE_TYPE_TO_SA", 2, 2);
    public static final TaskDescription Companion;
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertStageType[] $values() {
        return new ConvertStageType[]{CONVERT_STAGE_TYPE_TO_CEX, CONVERT_STAGE_TYPE_TO_CONVERT, CONVERT_STAGE_TYPE_TO_SA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertStageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ConvertStageType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ConvertStageType[] convertStageTypeArr$values = $values();
        $VALUES = convertStageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertStageTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ConvertStageType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ConvertStageType AEQbTJ(int i) {
            for (ConvertStageType convertStageType : ConvertStageType.values()) {
                if (convertStageType.getValue() == i) {
                    return convertStageType;
                }
            }
            return null;
        }
    }

    public static ConvertStageType valueOf(String str) {
        return (ConvertStageType) Enum.valueOf(ConvertStageType.class, str);
    }

    public static ConvertStageType[] values() {
        return (ConvertStageType[]) $VALUES.clone();
    }
}
