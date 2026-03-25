package com.okinc.business.dexlogic.liquiditypools;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LiquidityType[] $VALUES;
    public static final Application Companion;
    private final String value;
    public static final LiquidityType ALL = new LiquidityType("ALL", 0, "0");
    public static final LiquidityType REMOVE_LIQUIDITY = new LiquidityType("REMOVE_LIQUIDITY", 1, "2");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LiquidityType[] $values() {
        return new LiquidityType[]{ALL, REMOVE_LIQUIDITY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LiquidityType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private LiquidityType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        LiquidityType[] liquidityTypeArr$values = $values();
        $VALUES = liquidityTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(liquidityTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.liquiditypools.LiquidityType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static LiquidityType valueOf(String str) {
        return (LiquidityType) Enum.valueOf(LiquidityType.class, str);
    }

    public static LiquidityType[] values() {
        return (LiquidityType[]) $VALUES.clone();
    }
}
