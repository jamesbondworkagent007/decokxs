package com.okinc.business.dexlogic.bean;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class SlippageFeeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SlippageFeeType[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final SlippageFeeType SlippageLow = new SlippageFeeType("SlippageLow", 0, 1);
    public static final SlippageFeeType SlippageMid = new SlippageFeeType("SlippageMid", 1, 2);
    public static final SlippageFeeType SlippageHigh = new SlippageFeeType("SlippageHigh", 2, 3);
    public static final SlippageFeeType SlippageCustom = new SlippageFeeType("SlippageCustom", 3, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SlippageFeeType[] $values() {
        return new SlippageFeeType[]{SlippageLow, SlippageMid, SlippageHigh, SlippageCustom};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SlippageFeeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SlippageFeeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SlippageFeeType[] slippageFeeTypeArr$values = $values();
        $VALUES = slippageFeeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(slippageFeeTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.SlippageFeeType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final SlippageFeeType OLrzqt(int i) {
            SlippageFeeType next;
            Iterator<SlippageFeeType> it = SlippageFeeType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == i) {
                    break;
                }
            }
            SlippageFeeType slippageFeeType = next;
            return slippageFeeType == null ? SlippageFeeType.SlippageCustom : slippageFeeType;
        }
    }

    public static SlippageFeeType valueOf(String str) {
        return (SlippageFeeType) Enum.valueOf(SlippageFeeType.class, str);
    }

    public static SlippageFeeType[] values() {
        return (SlippageFeeType[]) $VALUES.clone();
    }
}
