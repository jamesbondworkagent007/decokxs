package com.okinc.social_trade_api.data;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class AprVoucherDto {
    private final String investUpLimit;
    private final List<String> underlyingIds;
    private final String voucherMaxValue;
    private final String voucherPnlRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AprVoucherDto() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.social_trade_api.data.AprVoucherDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AprVoucherDto copy$default(AprVoucherDto aprVoucherDto, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aprVoucherDto.voucherPnlRatio;
        }
        if ((i & 2) != 0) {
            str2 = aprVoucherDto.investUpLimit;
        }
        if ((i & 4) != 0) {
            str3 = aprVoucherDto.voucherMaxValue;
        }
        if ((i & 8) != 0) {
            list = aprVoucherDto.underlyingIds;
        }
        return aprVoucherDto.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.voucherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.investUpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.voucherMaxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.underlyingIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AprVoucherDto copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AprVoucherDto(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AprVoucherDto)) {
            return false;
        }
        AprVoucherDto aprVoucherDto = (AprVoucherDto) obj;
        return Intrinsics.EZpvd((Object) this.voucherPnlRatio, (Object) aprVoucherDto.voucherPnlRatio) && Intrinsics.EZpvd((Object) this.investUpLimit, (Object) aprVoucherDto.investUpLimit) && Intrinsics.EZpvd((Object) this.voucherMaxValue, (Object) aprVoucherDto.voucherMaxValue) && Intrinsics.EZpvd(this.underlyingIds, aprVoucherDto.underlyingIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestUpLimit() {
        return this.investUpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUnderlyingIds() {
        return this.underlyingIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherMaxValue() {
        return this.voucherMaxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherPnlRatio() {
        return this.voucherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.voucherPnlRatio.hashCode() * 31) + this.investUpLimit.hashCode()) * 31) + this.voucherMaxValue.hashCode()) * 31) + this.underlyingIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AprVoucherDto(voucherPnlRatio=" + this.voucherPnlRatio + ", investUpLimit=" + this.investUpLimit + ", voucherMaxValue=" + this.voucherMaxValue + ", underlyingIds=" + this.underlyingIds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.AprVoucherDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AprVoucherDto> serializer() {
            return AprVoucherDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AprVoucherDto(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.voucherPnlRatio = "";
        } else {
            this.voucherPnlRatio = str;
        }
        if ((i & 2) == 0) {
            this.investUpLimit = "";
        } else {
            this.investUpLimit = str2;
        }
        if ((i & 4) == 0) {
            this.voucherMaxValue = "";
        } else {
            this.voucherMaxValue = str3;
        }
        if ((i & 8) == 0) {
            this.underlyingIds = yDY.AhwBna();
        } else {
            this.underlyingIds = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSocialTrading_trading_eco_api(AprVoucherDto aprVoucherDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aprVoucherDto.voucherPnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aprVoucherDto.voucherPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) aprVoucherDto.investUpLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aprVoucherDto.investUpLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aprVoucherDto.voucherMaxValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, aprVoucherDto.voucherMaxValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(aprVoucherDto.underlyingIds, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], aprVoucherDto.underlyingIds);
    }

    public AprVoucherDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.voucherPnlRatio = str;
        this.investUpLimit = str2;
        this.voucherMaxValue = str3;
        this.underlyingIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:91)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:87) call: com.okinc.social_trade_api.data.AprVoucherDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AprVoucherDto(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
