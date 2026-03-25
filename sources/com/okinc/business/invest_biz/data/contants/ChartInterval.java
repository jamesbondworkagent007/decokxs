package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.invest_biz.data.contants.ChartInterval;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ChartInterval {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChartInterval[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final ChartInterval Day = new ChartInterval("Day", 0, 0);

    @SerialName("1")
    public static final ChartInterval Week = new ChartInterval("Week", 1, 1);

    @SerialName("2")
    public static final ChartInterval Month = new ChartInterval("Month", 2, 2);

    @SerialName("3")
    public static final ChartInterval Quarter = new ChartInterval("Quarter", 3, 3);

    @SerialName("4")
    public static final ChartInterval Year = new ChartInterval("Year", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChartInterval[] $values() {
        return new ChartInterval[]{Day, Week, Month, Quarter, Year};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChartInterval> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.ChartInterval.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) ChartInterval.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ChartInterval> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.ChartInterval", values(), new String[]{"0", "1", "2", "3", "4"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    private ChartInterval(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ChartInterval[] chartIntervalArr$values = $values();
        $VALUES = chartIntervalArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chartIntervalArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartInterval._init_$_anonymous_();
            }
        });
    }

    public static ChartInterval valueOf(String str) {
        return (ChartInterval) Enum.valueOf(ChartInterval.class, str);
    }

    public static ChartInterval[] values() {
        return (ChartInterval[]) $VALUES.clone();
    }
}
