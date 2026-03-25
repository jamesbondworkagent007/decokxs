package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomeTokensItemData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long chainId;
    public final String coinId;
    public final boolean hasMultipleProtocols;
    public final long investmentId;
    public final HomeTokensLogoData networkData;
    public final String rateDesc;
    public final String tokenAddress;
    public final String tokenLogo;
    public final String tokenSymbol;
    public final String totalTokenAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTokensItemData() {
        this((String) null, (String) null, (HomeTokensLogoData) null, (String) null, (String) null, 0L, false, 0L, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.rateDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTokensItemData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull HomeTokensLogoData homeTokensLogoData, @NotNull String str3, @NotNull String str4, long j, boolean z, long j2, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(homeTokensLogoData, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new HomeTokensItemData(str, str2, homeTokensLogoData, str3, str4, j, z, j2, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.hasMultipleProtocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTokensLogoData copydefault() {
        return this.networkData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.totalTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTokensItemData)) {
            return false;
        }
        HomeTokensItemData homeTokensItemData = (HomeTokensItemData) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) homeTokensItemData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) homeTokensItemData.tokenLogo) && Intrinsics.EZpvd(this.networkData, homeTokensItemData.networkData) && Intrinsics.EZpvd((Object) this.rateDesc, (Object) homeTokensItemData.rateDesc) && Intrinsics.EZpvd((Object) this.totalTokenAmount, (Object) homeTokensItemData.totalTokenAmount) && this.investmentId == homeTokensItemData.investmentId && this.hasMultipleProtocols == homeTokensItemData.hasMultipleProtocols && this.chainId == homeTokensItemData.chainId && Intrinsics.EZpvd((Object) this.coinId, (Object) homeTokensItemData.coinId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) homeTokensItemData.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenSymbol.hashCode();
        int iHashCode2 = this.tokenLogo.hashCode();
        int iHashCode3 = this.networkData.hashCode();
        int iHashCode4 = this.rateDesc.hashCode();
        int iHashCode5 = this.totalTokenAmount.hashCode();
        int iHashCode6 = Long.hashCode(this.investmentId);
        int iHashCode7 = Boolean.hashCode(this.hasMultipleProtocols);
        int iHashCode8 = Long.hashCode(this.chainId);
        String str = this.coinId;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tokenAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTokensItemData(tokenSymbol=" + this.tokenSymbol + ", tokenLogo=" + this.tokenLogo + ", networkData=" + this.networkData + ", rateDesc=" + this.rateDesc + ", totalTokenAmount=" + this.totalTokenAmount + ", investmentId=" + this.investmentId + ", hasMultipleProtocols=" + this.hasMultipleProtocols + ", chainId=" + this.chainId + ", coinId=" + this.coinId + ", tokenAddress=" + this.tokenAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tokenSymbol;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HomeTokensItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeTokensItemData> serializer() {
            return HomeTokensItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeTokensItemData(int i, String str, String str2, HomeTokensLogoData homeTokensLogoData, String str3, String str4, long j, boolean z, long j2, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str;
        }
        if ((i & 2) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str2;
        }
        this.networkData = (i & 4) == 0 ? new HomeTokensLogoData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : homeTokensLogoData;
        if ((i & 8) == 0) {
            this.rateDesc = "";
        } else {
            this.rateDesc = str3;
        }
        if ((i & 16) == 0) {
            this.totalTokenAmount = "";
        } else {
            this.totalTokenAmount = str4;
        }
        this.investmentId = (i & 32) == 0 ? 1L : j;
        this.hasMultipleProtocols = (i & 64) == 0 ? false : z;
        this.chainId = (i & 128) == 0 ? 0L : j2;
        if ((i & 256) == 0) {
            this.coinId = "";
        } else {
            this.coinId = str5;
        }
        if ((i & 512) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str6;
        }
    }

    public static final /* synthetic */ void KWHzl(HomeTokensItemData homeTokensItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeTokensItemData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeTokensItemData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeTokensItemData.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeTokensItemData.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(homeTokensItemData.networkData, new HomeTokensLogoData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, HomeTokensLogoData$$serializer.INSTANCE, homeTokensItemData.networkData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) homeTokensItemData.rateDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, homeTokensItemData.rateDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) homeTokensItemData.totalTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, homeTokensItemData.totalTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || homeTokensItemData.investmentId != 1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, homeTokensItemData.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || homeTokensItemData.hasMultipleProtocols) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, homeTokensItemData.hasMultipleProtocols);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || homeTokensItemData.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, homeTokensItemData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) homeTokensItemData.coinId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, homeTokensItemData.coinId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) homeTokensItemData.tokenAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, homeTokensItemData.tokenAddress);
    }

    public HomeTokensItemData(@NotNull String str, @NotNull String str2, @NotNull HomeTokensLogoData homeTokensLogoData, @NotNull String str3, @NotNull String str4, long j, boolean z, long j2, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(homeTokensLogoData, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.tokenSymbol = str;
        this.tokenLogo = str2;
        this.networkData = homeTokensLogoData;
        this.rateDesc = str3;
        this.totalTokenAmount = str4;
        this.investmentId = j;
        this.hasMultipleProtocols = z;
        this.chainId = j2;
        this.coinId = str5;
        this.tokenAddress = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.HomeTokensLogoData:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:546) call: com.okinc.business.invest_biz.data.bean.HomeTokensLogoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.invest_biz.data.bean.HomeTokensLogoData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 long) : (r19v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0047: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.HomeTokensLogoData, java.lang.String, java.lang.String, long, boolean, long, java.lang.String, java.lang.String):void (m)] (LINE:540) call: com.okinc.business.invest_biz.data.bean.HomeTokensItemData.<init>(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.HomeTokensLogoData, java.lang.String, java.lang.String, long, boolean, long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomeTokensItemData(String str, String str2, HomeTokensLogoData homeTokensLogoData, String str3, String str4, long j, boolean z, long j2, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new HomeTokensLogoData((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : homeTokensLogoData, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 1L : j, (i & 64) != 0 ? false : z, (i & 128) != 0 ? 0L : j2, (i & 256) != 0 ? "" : str5, (i & 512) == 0 ? str6 : "");
    }
}
