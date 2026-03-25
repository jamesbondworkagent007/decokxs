package com.okinc.planet.biz_positions.data;

import com.okinc.planet.biz_positions.data.CurrentPosType;
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
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CurrentPosType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CurrentPosType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("2")
    public static final CurrentPosType OldPositionNoHandlingFees = new CurrentPosType("OldPositionNoHandlingFees", 0);

    @SerialName("3")
    public static final CurrentPosType NewPositionPostFeatureLaunch = new CurrentPosType("NewPositionPostFeatureLaunch", 1);
    public static final CurrentPosType InvalidPosType = new CurrentPosType("InvalidPosType", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CurrentPosType[] $values() {
        return new CurrentPosType[]{OldPositionNoHandlingFees, NewPositionPostFeatureLaunch, InvalidPosType};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CurrentPosType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.data.CurrentPosType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) CurrentPosType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CurrentPosType> serializer() {
            return copydefault();
        }
    }

    private CurrentPosType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.planet.biz_positions.data.CurrentPosType", values(), new String[]{"2", "3", null}, new Annotation[][]{null, null, null}, null);
    }

    static {
        CurrentPosType[] currentPosTypeArr$values = $values();
        $VALUES = currentPosTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(currentPosTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tGk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CurrentPosType._init_$_anonymous_();
            }
        });
    }

    public static CurrentPosType valueOf(String str) {
        return (CurrentPosType) Enum.valueOf(CurrentPosType.class, str);
    }

    public static CurrentPosType[] values() {
        return (CurrentPosType[]) $VALUES.clone();
    }
}
