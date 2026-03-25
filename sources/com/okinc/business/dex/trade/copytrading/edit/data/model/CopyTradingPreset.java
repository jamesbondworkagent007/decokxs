package com.okinc.business.dex.trade.copytrading.edit.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CopyTradingPreset {
    private final JsonElement dexIds;
    private final String dynamicMaxSlippageValue;
    private final String feeLevel;
    private final String feeValue;
    private final String limitOrderFeeLevel;
    private final String limitOrderFeeValue;
    private final String routerModeType;
    private final String slippageLevel;
    private final String slippageType;
    private final String slippageValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingPreset() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component10() {
        return this.dexIds;
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
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.limitOrderFeeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.limitOrderFeeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPreset copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new CopyTradingPreset(str, str2, str3, str4, str5, str6, str7, str8, str9, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradingPreset)) {
            return false;
        }
        CopyTradingPreset copyTradingPreset = (CopyTradingPreset) obj;
        return Intrinsics.EZpvd((Object) this.slippageType, (Object) copyTradingPreset.slippageType) && Intrinsics.EZpvd((Object) this.slippageLevel, (Object) copyTradingPreset.slippageLevel) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) copyTradingPreset.slippageValue) && Intrinsics.EZpvd((Object) this.dynamicMaxSlippageValue, (Object) copyTradingPreset.dynamicMaxSlippageValue) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) copyTradingPreset.routerModeType) && Intrinsics.EZpvd((Object) this.feeLevel, (Object) copyTradingPreset.feeLevel) && Intrinsics.EZpvd((Object) this.feeValue, (Object) copyTradingPreset.feeValue) && Intrinsics.EZpvd((Object) this.limitOrderFeeLevel, (Object) copyTradingPreset.limitOrderFeeLevel) && Intrinsics.EZpvd((Object) this.limitOrderFeeValue, (Object) copyTradingPreset.limitOrderFeeValue) && Intrinsics.EZpvd(this.dexIds, copyTradingPreset.dexIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicMaxSlippageValue() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeLevel() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeValue() {
        return this.feeValue;
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
        int iHashCode5 = this.routerModeType.hashCode();
        int iHashCode6 = this.feeLevel.hashCode();
        int iHashCode7 = this.feeValue.hashCode();
        String str = this.limitOrderFeeLevel;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.limitOrderFeeValue.hashCode();
        JsonElement jsonElement = this.dexIds;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradingPreset(slippageType=" + this.slippageType + ", slippageLevel=" + this.slippageLevel + ", slippageValue=" + this.slippageValue + ", dynamicMaxSlippageValue=" + this.dynamicMaxSlippageValue + ", routerModeType=" + this.routerModeType + ", feeLevel=" + this.feeLevel + ", feeValue=" + this.feeValue + ", limitOrderFeeLevel=" + this.limitOrderFeeLevel + ", limitOrderFeeValue=" + this.limitOrderFeeValue + ", dexIds=" + this.dexIds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CopyTradingPreset> serializer() {
            return CopyTradingPreset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyTradingPreset(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.routerModeType = "";
        } else {
            this.routerModeType = str5;
        }
        if ((i & 32) == 0) {
            this.feeLevel = "";
        } else {
            this.feeLevel = str6;
        }
        if ((i & 64) == 0) {
            this.feeValue = "";
        } else {
            this.feeValue = str7;
        }
        if ((i & 128) == 0) {
            this.limitOrderFeeLevel = null;
        } else {
            this.limitOrderFeeLevel = str8;
        }
        if ((i & 256) == 0) {
            this.limitOrderFeeValue = "";
        } else {
            this.limitOrderFeeValue = str9;
        }
        if ((i & 512) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = jsonElement;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CopyTradingPreset copyTradingPreset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) copyTradingPreset.slippageType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, copyTradingPreset.slippageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) copyTradingPreset.slippageLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, copyTradingPreset.slippageLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) copyTradingPreset.slippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, copyTradingPreset.slippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) copyTradingPreset.dynamicMaxSlippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, copyTradingPreset.dynamicMaxSlippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) copyTradingPreset.routerModeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, copyTradingPreset.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) copyTradingPreset.feeLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, copyTradingPreset.feeLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) copyTradingPreset.feeValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, copyTradingPreset.feeValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || copyTradingPreset.limitOrderFeeLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, copyTradingPreset.limitOrderFeeLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) copyTradingPreset.limitOrderFeeValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, copyTradingPreset.limitOrderFeeValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && copyTradingPreset.dexIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, JsonElementSerializer.INSTANCE, copyTradingPreset.dexIds);
    }

    public CopyTradingPreset(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.slippageType = str;
        this.slippageLevel = str2;
        this.slippageValue = str3;
        this.dynamicMaxSlippageValue = str4;
        this.routerModeType = str5;
        this.feeLevel = str6;
        this.feeValue = str7;
        this.limitOrderFeeLevel = str8;
        this.limitOrderFeeValue = str9;
        this.dexIds = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0063: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 kotlinx.serialization.json.JsonElement) : (null kotlinx.serialization.json.JsonElement))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement):void (m)] (LINE:92) call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ CopyTradingPreset(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : "", (i & 512) == 0 ? jsonElement : null);
    }
}
