package com.okinc.business.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OKDCoinDetailConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OKDCoinDetailConfig> CREATOR = new Creator();
    private final String chainId;
    private final String chainLogoUrl;
    private final CoinDetailRedirection redirection;
    private final OKDSourceType sourceType;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;

    public static final class Creator implements Parcelable.Creator<OKDCoinDetailConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKDCoinDetailConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKDCoinDetailConfig(OKDSourceType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CoinDetailRedirection.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKDCoinDetailConfig[] newArray(int i) {
            return new OKDCoinDetailConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKDSourceType component1() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailRedirection component8() {
        return this.redirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKDCoinDetailConfig copy(@NotNull OKDSourceType oKDSourceType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, CoinDetailRedirection coinDetailRedirection) {
        Intrinsics.checkNotNullParameter(oKDSourceType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new OKDCoinDetailConfig(oKDSourceType, str, str2, str3, str4, str5, str6, coinDetailRedirection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKDCoinDetailConfig)) {
            return false;
        }
        OKDCoinDetailConfig oKDCoinDetailConfig = (OKDCoinDetailConfig) obj;
        return this.sourceType == oKDCoinDetailConfig.sourceType && Intrinsics.EZpvd((Object) this.chainId, (Object) oKDCoinDetailConfig.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) oKDCoinDetailConfig.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) oKDCoinDetailConfig.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) oKDCoinDetailConfig.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) oKDCoinDetailConfig.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) oKDCoinDetailConfig.chainLogoUrl) && Intrinsics.EZpvd(this.redirection, oKDCoinDetailConfig.redirection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailRedirection getRedirection() {
        return this.redirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKDSourceType getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sourceType.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        int iHashCode3 = this.tokenContractAddress.hashCode();
        int iHashCode4 = this.tokenSymbol.hashCode();
        int iHashCode5 = this.tokenName.hashCode();
        int iHashCode6 = this.tokenLogoUrl.hashCode();
        int iHashCode7 = this.chainLogoUrl.hashCode();
        CoinDetailRedirection coinDetailRedirection = this.redirection;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (coinDetailRedirection == null ? 0 : coinDetailRedirection.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKDCoinDetailConfig(sourceType=" + this.sourceType + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", redirection=" + this.redirection + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sourceType.name());
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.chainLogoUrl);
        CoinDetailRedirection coinDetailRedirection = this.redirection;
        if (coinDetailRedirection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coinDetailRedirection.writeToParcel(parcel, i);
        }
    }

    public OKDCoinDetailConfig(@NotNull OKDSourceType oKDSourceType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, CoinDetailRedirection coinDetailRedirection) {
        Intrinsics.checkNotNullParameter(oKDSourceType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.sourceType = oKDSourceType;
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.tokenSymbol = str3;
        this.tokenName = str4;
        this.tokenLogoUrl = str5;
        this.chainLogoUrl = str6;
        this.redirection = coinDetailRedirection;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (r13v0 com.okinc.business.dex.api.bean.OKDSourceType)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:com.okinc.business.dex.api.bean.CoinDetailRedirection:?: TERNARY null = ((wrap:int:0x0024: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.CoinDetailRedirection) : (r20v0 com.okinc.business.dex.api.bean.CoinDetailRedirection))
 A[MD:(com.okinc.business.dex.api.bean.OKDSourceType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.CoinDetailRedirection):void (m)] (LINE:15) call: com.okinc.business.dex.api.bean.OKDCoinDetailConfig.<init>(com.okinc.business.dex.api.bean.OKDSourceType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.CoinDetailRedirection):void type: THIS */
    public /* synthetic */ OKDCoinDetailConfig(OKDSourceType oKDSourceType, String str, String str2, String str3, String str4, String str5, String str6, CoinDetailRedirection coinDetailRedirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oKDSourceType, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : coinDetailRedirection);
    }
}
