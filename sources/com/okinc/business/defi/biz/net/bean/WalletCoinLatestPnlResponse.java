package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletCoinLatestPnlResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String boughtVolume;
    private final String currentProfit;
    private final String currentProfitPercentage;
    private final Boolean isPnlSupported;
    private final String realizedProfit;
    private final String realizedProfitPercentage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletCoinLatestPnlResponse() {
        this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletCoinLatestPnlResponse copy$default(WalletCoinLatestPnlResponse walletCoinLatestPnlResponse, Boolean bool, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = walletCoinLatestPnlResponse.isPnlSupported;
        }
        if ((i & 2) != 0) {
            str = walletCoinLatestPnlResponse.boughtVolume;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = walletCoinLatestPnlResponse.currentProfit;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = walletCoinLatestPnlResponse.currentProfitPercentage;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = walletCoinLatestPnlResponse.realizedProfit;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = walletCoinLatestPnlResponse.realizedProfitPercentage;
        }
        return walletCoinLatestPnlResponse.copy(bool, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCoinLatestPnlResponse copy(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        return new WalletCoinLatestPnlResponse(bool, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletCoinLatestPnlResponse)) {
            return false;
        }
        WalletCoinLatestPnlResponse walletCoinLatestPnlResponse = (WalletCoinLatestPnlResponse) obj;
        return Intrinsics.EZpvd(this.isPnlSupported, walletCoinLatestPnlResponse.isPnlSupported) && Intrinsics.EZpvd((Object) this.boughtVolume, (Object) walletCoinLatestPnlResponse.boughtVolume) && Intrinsics.EZpvd((Object) this.currentProfit, (Object) walletCoinLatestPnlResponse.currentProfit) && Intrinsics.EZpvd((Object) this.currentProfitPercentage, (Object) walletCoinLatestPnlResponse.currentProfitPercentage) && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) walletCoinLatestPnlResponse.realizedProfit) && Intrinsics.EZpvd((Object) this.realizedProfitPercentage, (Object) walletCoinLatestPnlResponse.realizedProfitPercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtVolume() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfit() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfitPercentage() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedProfit() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedProfitPercentage() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isPnlSupported;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.boughtVolume;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.currentProfit;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currentProfitPercentage;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.realizedProfit;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.realizedProfitPercentage;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isPnlSupported() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCoinLatestPnlResponse(isPnlSupported=" + this.isPnlSupported + ", boughtVolume=" + this.boughtVolume + ", currentProfit=" + this.currentProfit + ", currentProfitPercentage=" + this.currentProfitPercentage + ", realizedProfit=" + this.realizedProfit + ", realizedProfitPercentage=" + this.realizedProfitPercentage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletCoinLatestPnlResponse> serializer() {
            return WalletCoinLatestPnlResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletCoinLatestPnlResponse(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isPnlSupported = null;
        } else {
            this.isPnlSupported = bool;
        }
        if ((i & 2) == 0) {
            this.boughtVolume = null;
        } else {
            this.boughtVolume = str;
        }
        if ((i & 4) == 0) {
            this.currentProfit = null;
        } else {
            this.currentProfit = str2;
        }
        if ((i & 8) == 0) {
            this.currentProfitPercentage = null;
        } else {
            this.currentProfitPercentage = str3;
        }
        if ((i & 16) == 0) {
            this.realizedProfit = null;
        } else {
            this.realizedProfit = str4;
        }
        if ((i & 32) == 0) {
            this.realizedProfitPercentage = null;
        } else {
            this.realizedProfitPercentage = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletCoinLatestPnlResponse walletCoinLatestPnlResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletCoinLatestPnlResponse.isPnlSupported != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, walletCoinLatestPnlResponse.isPnlSupported);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletCoinLatestPnlResponse.boughtVolume != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletCoinLatestPnlResponse.boughtVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletCoinLatestPnlResponse.currentProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletCoinLatestPnlResponse.currentProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletCoinLatestPnlResponse.currentProfitPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletCoinLatestPnlResponse.currentProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletCoinLatestPnlResponse.realizedProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, walletCoinLatestPnlResponse.realizedProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && walletCoinLatestPnlResponse.realizedProfitPercentage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, walletCoinLatestPnlResponse.realizedProfitPercentage);
    }

    public WalletCoinLatestPnlResponse(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.isPnlSupported = bool;
        this.boughtVolume = str;
        this.currentProfit = str2;
        this.currentProfitPercentage = str3;
        this.realizedProfit = str4;
        this.realizedProfitPercentage = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:114) call: com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletCoinLatestPnlResponse(Boolean bool, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
