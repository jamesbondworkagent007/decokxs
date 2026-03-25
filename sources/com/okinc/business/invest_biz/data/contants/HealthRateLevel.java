package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
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
public final class HealthRateLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HealthRateLevel[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final HealthRateLevel Unknown = new HealthRateLevel("Unknown", 0, 0);

    @SerialName("1")
    public static final HealthRateLevel Green = new HealthRateLevel("Green", 1, 1);

    @SerialName("2")
    public static final HealthRateLevel Yellow = new HealthRateLevel("Yellow", 2, 2);

    @SerialName("3")
    public static final HealthRateLevel Red = new HealthRateLevel("Red", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HealthRateLevel[] $values() {
        return new HealthRateLevel[]{Unknown, Green, Yellow, Red};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HealthRateLevel> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.HealthRateLevel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) HealthRateLevel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<HealthRateLevel> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.HealthRateLevel", values(), new String[]{"0", "1", "2", "3"}, new Annotation[][]{null, null, null, null}, null);
    }

    private HealthRateLevel(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        HealthRateLevel[] healthRateLevelArr$values = $values();
        $VALUES = healthRateLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(healthRateLevelArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HealthRateLevel._init_$_anonymous_();
            }
        });
    }

    public static HealthRateLevel valueOf(String str) {
        return (HealthRateLevel) Enum.valueOf(HealthRateLevel.class, str);
    }

    public static HealthRateLevel[] values() {
        return (HealthRateLevel[]) $VALUES.clone();
    }
}
