package com.okinc.business.dexlogic.bean;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class PriorityFeeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PriorityFeeType[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final PriorityFeeType PriorityMarket = new PriorityFeeType("PriorityMarket", 0, 1);
    public static final PriorityFeeType PriorityFast = new PriorityFeeType("PriorityFast", 1, 2);
    public static final PriorityFeeType PriorityTurbo = new PriorityFeeType("PriorityTurbo", 2, 3);
    public static final PriorityFeeType PriorityCustom = new PriorityFeeType("PriorityCustom", 3, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PriorityFeeType[] $values() {
        return new PriorityFeeType[]{PriorityMarket, PriorityFast, PriorityTurbo, PriorityCustom};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PriorityFeeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PriorityFeeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PriorityFeeType[] priorityFeeTypeArr$values = $values();
        $VALUES = priorityFeeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(priorityFeeTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.PriorityFeeType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final PriorityFeeType copydefault(int i) {
            PriorityFeeType next;
            Iterator<PriorityFeeType> it = PriorityFeeType.getEntries().iterator();
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
            PriorityFeeType priorityFeeType = next;
            return priorityFeeType == null ? PriorityFeeType.PriorityMarket : priorityFeeType;
        }
    }

    public static PriorityFeeType valueOf(String str) {
        return (PriorityFeeType) Enum.valueOf(PriorityFeeType.class, str);
    }

    public static PriorityFeeType[] values() {
        return (PriorityFeeType[]) $VALUES.clone();
    }
}
