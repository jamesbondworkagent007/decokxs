package com.okinc.business.trade.features.home.ui.cefi.common;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPriorityFeeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedPriorityFeeType[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final AdvancedPriorityFeeType Market = new AdvancedPriorityFeeType("Market", 0, 1);
    public static final AdvancedPriorityFeeType Fast = new AdvancedPriorityFeeType("Fast", 1, 2);
    public static final AdvancedPriorityFeeType Turbo = new AdvancedPriorityFeeType("Turbo", 2, 3);
    public static final AdvancedPriorityFeeType Custom = new AdvancedPriorityFeeType(TypedValues.Custom.NAME, 3, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedPriorityFeeType[] $values() {
        return new AdvancedPriorityFeeType[]{Market, Fast, Turbo, Custom};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedPriorityFeeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AdvancedPriorityFeeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AdvancedPriorityFeeType[] advancedPriorityFeeTypeArr$values = $values();
        $VALUES = advancedPriorityFeeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedPriorityFeeTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AdvancedPriorityFeeType EZpvd(int i) {
            AdvancedPriorityFeeType next;
            Iterator<AdvancedPriorityFeeType> it = AdvancedPriorityFeeType.getEntries().iterator();
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
            AdvancedPriorityFeeType advancedPriorityFeeType = next;
            return advancedPriorityFeeType == null ? AdvancedPriorityFeeType.Market : advancedPriorityFeeType;
        }
    }

    public static AdvancedPriorityFeeType valueOf(String str) {
        return (AdvancedPriorityFeeType) Enum.valueOf(AdvancedPriorityFeeType.class, str);
    }

    public static AdvancedPriorityFeeType[] values() {
        return (AdvancedPriorityFeeType[]) $VALUES.clone();
    }
}
