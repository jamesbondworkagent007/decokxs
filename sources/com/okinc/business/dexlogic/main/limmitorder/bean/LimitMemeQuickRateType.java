package com.okinc.business.dexlogic.main.limmitorder.bean;

import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType;
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
public final class LimitMemeQuickRateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitMemeQuickRateType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("0")
    public static final LimitMemeQuickRateType NORMAL = new LimitMemeQuickRateType("NORMAL", 0, 0);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitMemeQuickRateType[] $values() {
        return new LimitMemeQuickRateType[]{NORMAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitMemeQuickRateType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) LimitMemeQuickRateType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<LimitMemeQuickRateType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeQuickRateType", values(), new String[]{"0"}, new Annotation[][]{null}, null);
    }

    private LimitMemeQuickRateType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        LimitMemeQuickRateType[] limitMemeQuickRateTypeArr$values = $values();
        $VALUES = limitMemeQuickRateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitMemeQuickRateTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.hgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitMemeQuickRateType._init_$_anonymous_();
            }
        });
    }

    public static LimitMemeQuickRateType valueOf(String str) {
        return (LimitMemeQuickRateType) Enum.valueOf(LimitMemeQuickRateType.class, str);
    }

    public static LimitMemeQuickRateType[] values() {
        return (LimitMemeQuickRateType[]) $VALUES.clone();
    }
}
