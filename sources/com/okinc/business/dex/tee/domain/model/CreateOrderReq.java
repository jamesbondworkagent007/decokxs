package com.okinc.business.dex.tee.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CreateOrderReq {
    private final List<String> dexIds;
    private final String dynamicMaxSlippageValue;
    private final String expireTime;
    private final boolean isCustomExpireTime;
    private final String limitOrderFeeLevel;
    private final String limitOrderFeeValue;
    private final String routerModeType;
    private final String slippageLevel;
    private final String slippageType;
    private final String slippageValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateOrderReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.limitOrderFeeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.limitOrderFeeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isCustomExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateOrderReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, List<String> list, @NotNull String str7, boolean z, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CreateOrderReq(str, str2, str3, str4, str5, str6, list, str7, z, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderReq)) {
            return false;
        }
        CreateOrderReq createOrderReq = (CreateOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.slippageType, (Object) createOrderReq.slippageType) && Intrinsics.EZpvd((Object) this.slippageLevel, (Object) createOrderReq.slippageLevel) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) createOrderReq.slippageValue) && Intrinsics.EZpvd((Object) this.dynamicMaxSlippageValue, (Object) createOrderReq.dynamicMaxSlippageValue) && Intrinsics.EZpvd((Object) this.limitOrderFeeLevel, (Object) createOrderReq.limitOrderFeeLevel) && Intrinsics.EZpvd((Object) this.limitOrderFeeValue, (Object) createOrderReq.limitOrderFeeValue) && Intrinsics.EZpvd(this.dexIds, createOrderReq.dexIds) && Intrinsics.EZpvd((Object) this.expireTime, (Object) createOrderReq.expireTime) && this.isCustomExpireTime == createOrderReq.isCustomExpireTime && Intrinsics.EZpvd((Object) this.routerModeType, (Object) createOrderReq.routerModeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicMaxSlippageValue() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderFeeLevel() {
        return this.limitOrderFeeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderFeeValue() {
        return this.limitOrderFeeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageLevel() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageValue() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.slippageType.hashCode();
        int iHashCode2 = this.slippageLevel.hashCode();
        int iHashCode3 = this.slippageValue.hashCode();
        int iHashCode4 = this.dynamicMaxSlippageValue.hashCode();
        int iHashCode5 = this.limitOrderFeeLevel.hashCode();
        int iHashCode6 = this.limitOrderFeeValue.hashCode();
        List<String> list = this.dexIds;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.expireTime.hashCode()) * 31) + Boolean.hashCode(this.isCustomExpireTime)) * 31) + this.routerModeType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCustomExpireTime() {
        return this.isCustomExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateOrderReq(slippageType=" + this.slippageType + ", slippageLevel=" + this.slippageLevel + ", slippageValue=" + this.slippageValue + ", dynamicMaxSlippageValue=" + this.dynamicMaxSlippageValue + ", limitOrderFeeLevel=" + this.limitOrderFeeLevel + ", limitOrderFeeValue=" + this.limitOrderFeeValue + ", dexIds=" + this.dexIds + ", expireTime=" + this.expireTime + ", isCustomExpireTime=" + this.isCustomExpireTime + ", routerModeType=" + this.routerModeType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.CreateOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateOrderReq> serializer() {
            return CreateOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, boolean z, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.slippageType = "";
        } else {
            this.slippageType = str;
        }
        if ((i & 2) == 0) {
            this.slippageLevel = "";
        } else {
            this.slippageLevel = str2;
        }
        if ((i & 4) == 0) {
            this.slippageValue = "";
        } else {
            this.slippageValue = str3;
        }
        if ((i & 8) == 0) {
            this.dynamicMaxSlippageValue = "";
        } else {
            this.dynamicMaxSlippageValue = str4;
        }
        if ((i & 16) == 0) {
            this.limitOrderFeeLevel = "";
        } else {
            this.limitOrderFeeLevel = str5;
        }
        if ((i & 32) == 0) {
            this.limitOrderFeeValue = "";
        } else {
            this.limitOrderFeeValue = str6;
        }
        if ((i & 64) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = list;
        }
        if ((i & 128) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str7;
        }
        if ((i & 256) == 0) {
            this.isCustomExpireTime = false;
        } else {
            this.isCustomExpireTime = z;
        }
        if ((i & 512) == 0) {
            this.routerModeType = "";
        } else {
            this.routerModeType = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CreateOrderReq createOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) createOrderReq.slippageType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, createOrderReq.slippageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) createOrderReq.slippageLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, createOrderReq.slippageLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) createOrderReq.slippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, createOrderReq.slippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) createOrderReq.dynamicMaxSlippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, createOrderReq.dynamicMaxSlippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) createOrderReq.limitOrderFeeLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, createOrderReq.limitOrderFeeLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) createOrderReq.limitOrderFeeValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, createOrderReq.limitOrderFeeValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || createOrderReq.dexIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], createOrderReq.dexIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) createOrderReq.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, createOrderReq.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || createOrderReq.isCustomExpireTime) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, createOrderReq.isCustomExpireTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) createOrderReq.routerModeType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, createOrderReq.routerModeType);
    }

    public CreateOrderReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, List<String> list, @NotNull String str7, boolean z, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.slippageType = str;
        this.slippageLevel = str2;
        this.slippageValue = str3;
        this.dynamicMaxSlippageValue = str4;
        this.limitOrderFeeLevel = str5;
        this.limitOrderFeeValue = str6;
        this.dexIds = list;
        this.expireTime = str7;
        this.isCustomExpireTime = z;
        this.routerModeType = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, boolean, java.lang.String):void (m)] (LINE:118) call: com.okinc.business.dex.tee.domain.model.CreateOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CreateOrderReq(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, boolean z, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : list, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? false : z, (i & 512) == 0 ? str8 : "");
    }
}
