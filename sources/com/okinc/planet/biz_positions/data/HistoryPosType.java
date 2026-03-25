package com.okinc.planet.biz_positions.data;

import com.okinc.planet.biz_positions.data.HistoryPosType;
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
public final class HistoryPosType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HistoryPosType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("1")
    public static final HistoryPosType OldPositionNoHandlingFees = new HistoryPosType("OldPositionNoHandlingFees", 0);

    @SerialName("2")
    public static final HistoryPosType OldPositionWithHandlingFees = new HistoryPosType("OldPositionWithHandlingFees", 1);

    @SerialName("3")
    public static final HistoryPosType NewPositionPostFeatureLaunch = new HistoryPosType("NewPositionPostFeatureLaunch", 2);
    public static final HistoryPosType InvalidPosType = new HistoryPosType("InvalidPosType", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HistoryPosType[] $values() {
        return new HistoryPosType[]{OldPositionNoHandlingFees, OldPositionWithHandlingFees, NewPositionPostFeatureLaunch, InvalidPosType};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HistoryPosType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.data.HistoryPosType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) HistoryPosType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<HistoryPosType> serializer() {
            return OLrzqt();
        }
    }

    private HistoryPosType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.planet.biz_positions.data.HistoryPosType", values(), new String[]{"1", "2", "3", null}, new Annotation[][]{null, null, null, null}, null);
    }

    static {
        HistoryPosType[] historyPosTypeArr$values = $values();
        $VALUES = historyPosTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(historyPosTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HistoryPosType._init_$_anonymous_();
            }
        });
    }

    public static HistoryPosType valueOf(String str) {
        return (HistoryPosType) Enum.valueOf(HistoryPosType.class, str);
    }

    public static HistoryPosType[] values() {
        return (HistoryPosType[]) $VALUES.clone();
    }
}
