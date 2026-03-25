package com.okinc.business.market.data.model.alert;

import com.okinc.business.market.data.model.alert.AlertRepeatType;
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
/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AlertRepeatType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertRepeatType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final AlertRepeatType REPEAT = new AlertRepeatType("REPEAT", 0, 0);

    @SerialName("1")
    public static final AlertRepeatType ONCE = new AlertRepeatType("ONCE", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertRepeatType[] $values() {
        return new AlertRepeatType[]{REPEAT, ONCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertRepeatType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AlertRepeatType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AlertRepeatType[] alertRepeatTypeArr$values = $values();
        $VALUES = alertRepeatTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertRepeatTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AlertRepeatType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertRepeatType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) AlertRepeatType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AlertRepeatType> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.model.alert.AlertRepeatType", values(), new String[]{"0", "1"}, new Annotation[][]{null, null}, null);
    }

    public static AlertRepeatType valueOf(String str) {
        return (AlertRepeatType) Enum.valueOf(AlertRepeatType.class, str);
    }

    public static AlertRepeatType[] values() {
        return (AlertRepeatType[]) $VALUES.clone();
    }
}
