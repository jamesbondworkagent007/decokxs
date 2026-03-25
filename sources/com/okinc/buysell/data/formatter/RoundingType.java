package com.okinc.buysell.data.formatter;

import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RoundingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RoundingType[] $VALUES;
    public static final Activity Companion;
    private final int code;
    public static final RoundingType HALF_UP = new RoundingType("HALF_UP", 0, 0);
    public static final RoundingType DOWN = new RoundingType("DOWN", 1, 1);
    public static final RoundingType UP = new RoundingType("UP", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RoundingType[] $values() {
        return new RoundingType[]{HALF_UP, DOWN, UP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RoundingType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private RoundingType(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        RoundingType[] roundingTypeArr$values = $values();
        $VALUES = roundingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(roundingTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.formatter.RoundingType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RoundingMode KWHzl(int i) {
            return i == RoundingType.HALF_UP.getCode() ? RoundingMode.HALF_UP : i == RoundingType.DOWN.getCode() ? RoundingMode.DOWN : i == RoundingType.UP.getCode() ? RoundingMode.UP : RoundingMode.HALF_UP;
        }
    }

    public static RoundingType valueOf(String str) {
        return (RoundingType) Enum.valueOf(RoundingType.class, str);
    }

    public static RoundingType[] values() {
        return (RoundingType[]) $VALUES.clone();
    }
}
