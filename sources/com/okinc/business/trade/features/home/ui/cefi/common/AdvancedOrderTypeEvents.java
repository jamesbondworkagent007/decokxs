package com.okinc.business.trade.features.home.ui.cefi.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderTypeEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedOrderTypeEvents[] $VALUES;
    public static final Activity Companion;
    private final String value;
    public static final AdvancedOrderTypeEvents Select = new AdvancedOrderTypeEvents("Select", 0, "ordertype_select");
    public static final AdvancedOrderTypeEvents Close = new AdvancedOrderTypeEvents("Close", 1, "ordertype_select_close");
    public static final AdvancedOrderTypeEvents Market = new AdvancedOrderTypeEvents("Market", 2, "ordertype_market");
    public static final AdvancedOrderTypeEvents Limit = new AdvancedOrderTypeEvents("Limit", 3, "ordertype_limit");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedOrderTypeEvents[] $values() {
        return new AdvancedOrderTypeEvents[]{Select, Close, Market, Limit};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedOrderTypeEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedOrderTypeEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedOrderTypeEvents[] advancedOrderTypeEventsArr$values = $values();
        $VALUES = advancedOrderTypeEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedOrderTypeEventsArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderTypeEvents$Activity$Activity, reason: collision with other inner class name */
        public final /* synthetic */ class C0381Activity {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AdvancedOrderType.values().length];
                try {
                    iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvancedOrderType.LIMIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderTypeEvents.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AdvancedOrderTypeEvents OLrzqt(AdvancedOrderType advancedOrderType) {
            int i = advancedOrderType == null ? -1 : C0381Activity.EZpvd[advancedOrderType.ordinal()];
            if (i == 1) {
                return AdvancedOrderTypeEvents.Market;
            }
            if (i == 2) {
                return AdvancedOrderTypeEvents.Limit;
            }
            return AdvancedOrderTypeEvents.Select;
        }
    }

    public static AdvancedOrderTypeEvents valueOf(String str) {
        return (AdvancedOrderTypeEvents) Enum.valueOf(AdvancedOrderTypeEvents.class, str);
    }

    public static AdvancedOrderTypeEvents[] values() {
        return (AdvancedOrderTypeEvents[]) $VALUES.clone();
    }
}
