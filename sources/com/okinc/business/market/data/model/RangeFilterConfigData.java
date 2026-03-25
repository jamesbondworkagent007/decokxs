package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.TokenAgeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RangeFilterConfigData {
    public static final int $stable = 0;
    public final String defaultValue;
    public final String maxValue;
    public final String minValue;
    public final TokenAgeType tokenAgeType;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, TokenAgeType.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RangeFilterConfigData() {
        this((String) null, (String) null, (String) null, (TokenAgeType) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RangeFilterConfigData copy$default(RangeFilterConfigData rangeFilterConfigData, String str, String str2, String str3, TokenAgeType tokenAgeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rangeFilterConfigData.minValue;
        }
        if ((i & 2) != 0) {
            str2 = rangeFilterConfigData.maxValue;
        }
        if ((i & 4) != 0) {
            str3 = rangeFilterConfigData.defaultValue;
        }
        if ((i & 8) != 0) {
            tokenAgeType = rangeFilterConfigData.tokenAgeType;
        }
        return rangeFilterConfigData.AEQbTJ(str, str2, str3, tokenAgeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RangeFilterConfigData AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TokenAgeType tokenAgeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        return new RangeFilterConfigData(str, str2, str3, tokenAgeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.minValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.maxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType KWHzl() {
        return this.tokenAgeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.defaultValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangeFilterConfigData)) {
            return false;
        }
        RangeFilterConfigData rangeFilterConfigData = (RangeFilterConfigData) obj;
        return Intrinsics.EZpvd((Object) this.minValue, (Object) rangeFilterConfigData.minValue) && Intrinsics.EZpvd((Object) this.maxValue, (Object) rangeFilterConfigData.maxValue) && Intrinsics.EZpvd((Object) this.defaultValue, (Object) rangeFilterConfigData.defaultValue) && this.tokenAgeType == rangeFilterConfigData.tokenAgeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.minValue.hashCode() * 31) + this.maxValue.hashCode()) * 31) + this.defaultValue.hashCode()) * 31) + this.tokenAgeType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RangeFilterConfigData(minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", defaultValue=" + this.defaultValue + ", tokenAgeType=" + this.tokenAgeType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.RangeFilterConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RangeFilterConfigData> serializer() {
            return RangeFilterConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RangeFilterConfigData(int i, String str, String str2, String str3, TokenAgeType tokenAgeType, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minValue = "";
        } else {
            this.minValue = str;
        }
        if ((i & 2) == 0) {
            this.maxValue = "";
        } else {
            this.maxValue = str2;
        }
        if ((i & 4) == 0) {
            this.defaultValue = "";
        } else {
            this.defaultValue = str3;
        }
        if ((i & 8) == 0) {
            this.tokenAgeType = TokenAgeType.DEFAULT;
        } else {
            this.tokenAgeType = tokenAgeType;
        }
    }

    public static final /* synthetic */ void OLrzqt(RangeFilterConfigData rangeFilterConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rangeFilterConfigData.minValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rangeFilterConfigData.minValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rangeFilterConfigData.maxValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rangeFilterConfigData.maxValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) rangeFilterConfigData.defaultValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, rangeFilterConfigData.defaultValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && rangeFilterConfigData.tokenAgeType == TokenAgeType.DEFAULT) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], rangeFilterConfigData.tokenAgeType);
    }

    public RangeFilterConfigData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TokenAgeType tokenAgeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        this.minValue = str;
        this.maxValue = str2;
        this.defaultValue = str3;
        this.tokenAgeType = tokenAgeType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.TokenAgeType:0x0015: SGET  A[WRAPPED] (LINE:16) com.okinc.business.market.common.constants.TokenAgeType.DEFAULT com.okinc.business.market.common.constants.TokenAgeType) : (r5v0 com.okinc.business.market.common.constants.TokenAgeType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType):void (m)] (LINE:8) call: com.okinc.business.market.data.model.RangeFilterConfigData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType):void type: THIS */
    public /* synthetic */ RangeFilterConfigData(String str, String str2, String str3, TokenAgeType tokenAgeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? TokenAgeType.DEFAULT : tokenAgeType);
    }
}
