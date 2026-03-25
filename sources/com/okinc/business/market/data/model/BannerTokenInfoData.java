package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BannerTokenInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerTokenInfoData() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BannerTokenInfoData copy$default(BannerTokenInfoData bannerTokenInfoData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerTokenInfoData.tokenAddress;
        }
        if ((i & 2) != 0) {
            str2 = bannerTokenInfoData.chainId;
        }
        return bannerTokenInfoData.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerTokenInfoData EZpvd(String str, String str2) {
        return new BannerTokenInfoData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerTokenInfoData)) {
            return false;
        }
        BannerTokenInfoData bannerTokenInfoData = (BannerTokenInfoData) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) bannerTokenInfoData.tokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) bannerTokenInfoData.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tokenAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainId;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerTokenInfoData(tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.BannerTokenInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerTokenInfoData> serializer() {
            return BannerTokenInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerTokenInfoData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str2;
        }
    }

    public static final /* synthetic */ void copydefault(BannerTokenInfoData bannerTokenInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bannerTokenInfoData.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bannerTokenInfoData.tokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && bannerTokenInfoData.chainId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bannerTokenInfoData.chainId);
    }

    public BannerTokenInfoData(String str, String str2) {
        this.tokenAddress = str;
        this.chainId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.business.market.data.model.BannerTokenInfoData.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BannerTokenInfoData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
