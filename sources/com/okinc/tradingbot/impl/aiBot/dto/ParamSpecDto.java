package com.okinc.tradingbot.impl.aiBot.dto;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ParamSpecDto {
    public final Double defaultValue;
    public final boolean exclusiveMax;
    public final boolean exclusiveMin;
    public final String key;
    public final String label;
    public final Double max;
    public final Double min;
    public final boolean multiValue;
    public final List<Integer> showParamList;
    public final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ParamSpecDto() {
        this((String) null, (String) null, (String) null, false, (Double) null, (Double) null, false, false, (List) null, (Double) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.multiValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> AhwBna() {
        return this.showParamList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double EZpvd() {
        return this.defaultValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.exclusiveMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParamSpecDto OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, Double d, Double d2, boolean z2, boolean z3, @NotNull List<Integer> list, Double d3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ParamSpecDto(str, str2, str3, z, d, d2, z2, z3, list, d3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.exclusiveMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamSpecDto)) {
            return false;
        }
        ParamSpecDto paramSpecDto = (ParamSpecDto) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) paramSpecDto.key) && Intrinsics.EZpvd((Object) this.label, (Object) paramSpecDto.label) && Intrinsics.EZpvd((Object) this.type, (Object) paramSpecDto.type) && this.multiValue == paramSpecDto.multiValue && Intrinsics.EZpvd(this.min, paramSpecDto.min) && Intrinsics.EZpvd(this.max, paramSpecDto.max) && this.exclusiveMin == paramSpecDto.exclusiveMin && this.exclusiveMax == paramSpecDto.exclusiveMax && Intrinsics.EZpvd(this.showParamList, paramSpecDto.showParamList) && Intrinsics.EZpvd(this.defaultValue, paramSpecDto.defaultValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double gEmmrt() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.key.hashCode();
        int iHashCode2 = this.label.hashCode();
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = Boolean.hashCode(this.multiValue);
        Double d = this.min;
        int iHashCode5 = d == null ? 0 : d.hashCode();
        Double d2 = this.max;
        int iHashCode6 = d2 == null ? 0 : d2.hashCode();
        int iHashCode7 = Boolean.hashCode(this.exclusiveMin);
        int iHashCode8 = Boolean.hashCode(this.exclusiveMax);
        int iHashCode9 = this.showParamList.hashCode();
        Double d3 = this.defaultValue;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (d3 != null ? d3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ParamSpecDto(key=" + this.key + ", label=" + this.label + ", type=" + this.type + ", multiValue=" + this.multiValue + ", min=" + this.min + ", max=" + this.max + ", exclusiveMin=" + this.exclusiveMin + ", exclusiveMax=" + this.exclusiveMax + ", showParamList=" + this.showParamList + ", defaultValue=" + this.defaultValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double valueOf() {
        return this.min;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.ParamSpecDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ParamSpecDto> serializer() {
            return ParamSpecDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ParamSpecDto(int i, String str, String str2, String str3, boolean z, Double d, Double d2, boolean z2, boolean z3, List list, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.type = TypedValues.Custom.S_INT;
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.multiValue = false;
        } else {
            this.multiValue = z;
        }
        if ((i & 16) == 0) {
            this.min = null;
        } else {
            this.min = d;
        }
        if ((i & 32) == 0) {
            this.max = null;
        } else {
            this.max = d2;
        }
        if ((i & 64) == 0) {
            this.exclusiveMin = false;
        } else {
            this.exclusiveMin = z2;
        }
        if ((i & 128) == 0) {
            this.exclusiveMax = false;
        } else {
            this.exclusiveMax = z3;
        }
        if ((i & 256) == 0) {
            this.showParamList = yDY.AhwBna();
        } else {
            this.showParamList = list;
        }
        if ((i & 512) == 0) {
            this.defaultValue = null;
        } else {
            this.defaultValue = d3;
        }
    }

    public static final /* synthetic */ void OLrzqt(ParamSpecDto paramSpecDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) paramSpecDto.key, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, paramSpecDto.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) paramSpecDto.label, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, paramSpecDto.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) paramSpecDto.type, (Object) TypedValues.Custom.S_INT)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, paramSpecDto.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || paramSpecDto.multiValue) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, paramSpecDto.multiValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || paramSpecDto.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, DoubleSerializer.INSTANCE, paramSpecDto.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || paramSpecDto.max != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.INSTANCE, paramSpecDto.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || paramSpecDto.exclusiveMin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, paramSpecDto.exclusiveMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || paramSpecDto.exclusiveMax) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, paramSpecDto.exclusiveMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(paramSpecDto.showParamList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], paramSpecDto.showParamList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && paramSpecDto.defaultValue == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, DoubleSerializer.INSTANCE, paramSpecDto.defaultValue);
    }

    public ParamSpecDto(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, Double d, Double d2, boolean z2, boolean z3, @NotNull List<Integer> list, Double d3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.label = str2;
        this.type = str3;
        this.multiValue = z;
        this.min = d;
        this.max = d2;
        this.exclusiveMin = z2;
        this.exclusiveMax = z3;
        this.showParamList = list;
        this.defaultValue = d3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_INT java.lang.String) : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r16v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x002a: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r17v0 java.lang.Double))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0041: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:50)) : (r20v0 java.util.List))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x004c: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Double) : (null java.lang.Double))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Double, java.lang.Double, boolean, boolean, java.util.List<java.lang.Integer>, java.lang.Double):void (m)] (LINE:41) call: com.okinc.tradingbot.impl.aiBot.dto.ParamSpecDto.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Double, java.lang.Double, boolean, boolean, java.util.List, java.lang.Double):void type: THIS */
    public /* synthetic */ ParamSpecDto(String str, String str2, String str3, boolean z, Double d, Double d2, boolean z2, boolean z3, List list, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? TypedValues.Custom.S_INT : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : d2, (i & 64) != 0 ? false : z2, (i & 128) == 0 ? z3 : false, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) == 0 ? d3 : null);
    }
}
