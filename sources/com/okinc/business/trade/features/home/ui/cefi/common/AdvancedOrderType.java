package com.okinc.business.trade.features.home.ui.cefi.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedOrderType[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final AdvancedOrderType MARKET = new AdvancedOrderType("MARKET", 0, 1);
    public static final AdvancedOrderType LIMIT = new AdvancedOrderType("LIMIT", 1, 2);
    public static final AdvancedOrderType SNIPE = new AdvancedOrderType("SNIPE", 2, 3);
    public static final AdvancedOrderType DCA = new AdvancedOrderType("DCA", 3, 4);
    public static final AdvancedOrderType TPSL = new AdvancedOrderType("TPSL", 4, 4);
    public static final AdvancedOrderType DEVSELL = new AdvancedOrderType("DEVSELL", 5, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedOrderType[] $values() {
        return new AdvancedOrderType[]{MARKET, LIMIT, SNIPE, DCA, TPSL, DEVSELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedOrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AdvancedOrderType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AdvancedOrderType[] advancedOrderTypeArr$values = $values();
        $VALUES = advancedOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedOrderTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AdvancedOrderType copydefault(int i) {
            AdvancedOrderType advancedOrderType;
            AdvancedOrderType[] advancedOrderTypeArrValues = AdvancedOrderType.values();
            int length = advancedOrderTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    advancedOrderType = null;
                    break;
                }
                advancedOrderType = advancedOrderTypeArrValues[i2];
                if (advancedOrderType.getValue() == i) {
                    break;
                }
                i2++;
            }
            return advancedOrderType == null ? AdvancedOrderType.MARKET : advancedOrderType;
        }
    }

    public static AdvancedOrderType valueOf(String str) {
        return (AdvancedOrderType) Enum.valueOf(AdvancedOrderType.class, str);
    }

    public static AdvancedOrderType[] values() {
        return (AdvancedOrderType[]) $VALUES.clone();
    }
}
