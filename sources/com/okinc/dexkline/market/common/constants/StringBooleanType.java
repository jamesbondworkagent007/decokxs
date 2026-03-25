package com.okinc.dexkline.market.common.constants;

import com.google.gson.annotations.SerializedName;
import com.okinc.dexkline.market.common.constants.StringBooleanType;
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
/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class StringBooleanType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StringBooleanType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerializedName("0")
    @SerialName("0")
    public static final StringBooleanType FALSE = new StringBooleanType("FALSE", 0, "0");

    @SerializedName("1")
    @SerialName("1")
    public static final StringBooleanType TRUE = new StringBooleanType("TRUE", 1, "1");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StringBooleanType[] $values() {
        return new StringBooleanType[]{FALSE, TRUE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StringBooleanType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.common.constants.StringBooleanType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) StringBooleanType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<StringBooleanType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.dexkline.market.common.constants.StringBooleanType", values(), new String[]{"0", "1"}, new Annotation[][]{null, null}, null);
    }

    private StringBooleanType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        StringBooleanType[] stringBooleanTypeArr$values = $values();
        $VALUES = stringBooleanTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(stringBooleanTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StringBooleanType._init_$_anonymous_();
            }
        });
    }

    public static StringBooleanType valueOf(String str) {
        return (StringBooleanType) Enum.valueOf(StringBooleanType.class, str);
    }

    public static StringBooleanType[] values() {
        return (StringBooleanType[]) $VALUES.clone();
    }
}
