package com.okinc.social_trade_api.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class NmpBannerUserVoucherDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String batchNo;
    private final String currentTime;
    private final String expireTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NmpBannerUserVoucherDto() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NmpBannerUserVoucherDto copy$default(NmpBannerUserVoucherDto nmpBannerUserVoucherDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nmpBannerUserVoucherDto.batchNo;
        }
        if ((i & 2) != 0) {
            str2 = nmpBannerUserVoucherDto.expireTime;
        }
        if ((i & 4) != 0) {
            str3 = nmpBannerUserVoucherDto.currentTime;
        }
        return nmpBannerUserVoucherDto.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpBannerUserVoucherDto copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NmpBannerUserVoucherDto(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NmpBannerUserVoucherDto)) {
            return false;
        }
        NmpBannerUserVoucherDto nmpBannerUserVoucherDto = (NmpBannerUserVoucherDto) obj;
        return Intrinsics.EZpvd((Object) this.batchNo, (Object) nmpBannerUserVoucherDto.batchNo) && Intrinsics.EZpvd((Object) this.expireTime, (Object) nmpBannerUserVoucherDto.expireTime) && Intrinsics.EZpvd((Object) this.currentTime, (Object) nmpBannerUserVoucherDto.currentTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchNo() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.batchNo.hashCode() * 31) + this.expireTime.hashCode()) * 31) + this.currentTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NmpBannerUserVoucherDto(batchNo=" + this.batchNo + ", expireTime=" + this.expireTime + ", currentTime=" + this.currentTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.NmpBannerUserVoucherDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NmpBannerUserVoucherDto> serializer() {
            return NmpBannerUserVoucherDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NmpBannerUserVoucherDto(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.batchNo = "";
        } else {
            this.batchNo = str;
        }
        if ((i & 2) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str2;
        }
        if ((i & 4) == 0) {
            this.currentTime = "";
        } else {
            this.currentTime = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKSocialTrading_trading_eco_api(NmpBannerUserVoucherDto nmpBannerUserVoucherDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) nmpBannerUserVoucherDto.batchNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, nmpBannerUserVoucherDto.batchNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nmpBannerUserVoucherDto.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nmpBannerUserVoucherDto.expireTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) nmpBannerUserVoucherDto.currentTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, nmpBannerUserVoucherDto.currentTime);
    }

    public NmpBannerUserVoucherDto(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.batchNo = str;
        this.expireTime = str2;
        this.currentTime = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:79) call: com.okinc.social_trade_api.data.NmpBannerUserVoucherDto.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NmpBannerUserVoucherDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
