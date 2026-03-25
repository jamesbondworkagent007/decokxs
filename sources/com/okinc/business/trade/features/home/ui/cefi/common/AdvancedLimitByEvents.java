package com.okinc.business.trade.features.home.ui.cefi.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedLimitByEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedLimitByEvents[] $VALUES;
    public static final Activity Companion;
    private final String value;
    public static final AdvancedLimitByEvents Close = new AdvancedLimitByEvents("Close", 0, "condition_denomination_close");
    public static final AdvancedLimitByEvents Price = new AdvancedLimitByEvents("Price", 1, FirebaseAnalytics.Param.PRICE);
    public static final AdvancedLimitByEvents MCap = new AdvancedLimitByEvents("MCap", 2, "mc");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedLimitByEvents[] $values() {
        return new AdvancedLimitByEvents[]{Close, Price, MCap};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedLimitByEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedLimitByEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedLimitByEvents[] advancedLimitByEventsArr$values = $values();
        $VALUES = advancedLimitByEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedLimitByEventsArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {

        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AdvancedLimitBy.values().length];
                try {
                    iArr[AdvancedLimitBy.Price.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvancedLimitBy.MCap.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitByEvents.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AdvancedLimitByEvents OLrzqt(AdvancedLimitBy advancedLimitBy) {
            int i = advancedLimitBy == null ? -1 : ActionBar.copydefault[advancedLimitBy.ordinal()];
            if (i == 1) {
                return AdvancedLimitByEvents.Price;
            }
            if (i == 2) {
                return AdvancedLimitByEvents.MCap;
            }
            return AdvancedLimitByEvents.Close;
        }
    }

    public static AdvancedLimitByEvents valueOf(String str) {
        return (AdvancedLimitByEvents) Enum.valueOf(AdvancedLimitByEvents.class, str);
    }

    public static AdvancedLimitByEvents[] values() {
        return (AdvancedLimitByEvents[]) $VALUES.clone();
    }
}
