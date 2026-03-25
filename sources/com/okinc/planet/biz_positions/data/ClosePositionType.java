package com.okinc.planet.biz_positions.data;

import com.okinc.planet.biz_positions.data.ClosePositionType;
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
/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ClosePositionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ClosePositionType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("1")
    public static final ClosePositionType Partial = new ClosePositionType("Partial", 0);

    @SerialName("2")
    public static final ClosePositionType Full = new ClosePositionType("Full", 1);

    @SerialName("3")
    public static final ClosePositionType Liquidated = new ClosePositionType("Liquidated", 2);

    @SerialName("4")
    public static final ClosePositionType ForceReduce = new ClosePositionType("ForceReduce", 3);

    @SerialName("5")
    public static final ClosePositionType ADL = new ClosePositionType("ADL", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ClosePositionType[] $values() {
        return new ClosePositionType[]{Partial, Full, Liquidated, ForceReduce, ADL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ClosePositionType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.data.ClosePositionType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) ClosePositionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ClosePositionType> serializer() {
            return OLrzqt();
        }
    }

    private ClosePositionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.planet.biz_positions.data.ClosePositionType", values(), new String[]{"1", "2", "3", "4", "5"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    static {
        ClosePositionType[] closePositionTypeArr$values = $values();
        $VALUES = closePositionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(closePositionTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tGi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ClosePositionType._init_$_anonymous_();
            }
        });
    }

    public static ClosePositionType valueOf(String str) {
        return (ClosePositionType) Enum.valueOf(ClosePositionType.class, str);
    }

    public static ClosePositionType[] values() {
        return (ClosePositionType[]) $VALUES.clone();
    }
}
