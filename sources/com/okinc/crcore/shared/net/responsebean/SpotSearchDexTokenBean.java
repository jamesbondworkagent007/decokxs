package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.SpotSearchDexTokenResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SpotSearchDexTokenBean implements Parcelable {
    private String chainId;
    private String chainLogo;
    private String chainName;
    private boolean communityRecognized;
    private String liquidity;
    private String price;
    private String priceChange1H;
    private String priceChange24H;
    private String priceChange4H;
    private String riskLevel;
    private String tokenContractAddress;
    private String tokenLogo;
    private String tokenName;
    private String tokenSymbol;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotSearchDexTokenBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotSearchDexTokenBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotSearchDexTokenBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotSearchDexTokenBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotSearchDexTokenBean[] newArray(int i) {
            return new SpotSearchDexTokenBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotSearchDexTokenBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.priceChange4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priceChange1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
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
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priceChange24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotSearchDexTokenBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new SpotSearchDexTokenBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13);
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
        if (!(obj instanceof SpotSearchDexTokenBean)) {
            return false;
        }
        SpotSearchDexTokenBean spotSearchDexTokenBean = (SpotSearchDexTokenBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) spotSearchDexTokenBean.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) spotSearchDexTokenBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) spotSearchDexTokenBean.chainLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) spotSearchDexTokenBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) spotSearchDexTokenBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) spotSearchDexTokenBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) spotSearchDexTokenBean.tokenLogo) && Intrinsics.EZpvd((Object) this.price, (Object) spotSearchDexTokenBean.price) && Intrinsics.EZpvd((Object) this.priceChange24H, (Object) spotSearchDexTokenBean.priceChange24H) && Intrinsics.EZpvd((Object) this.priceChange4H, (Object) spotSearchDexTokenBean.priceChange4H) && Intrinsics.EZpvd((Object) this.priceChange1H, (Object) spotSearchDexTokenBean.priceChange1H) && Intrinsics.EZpvd((Object) this.liquidity, (Object) spotSearchDexTokenBean.liquidity) && this.communityRecognized == spotSearchDexTokenBean.communityRecognized && Intrinsics.EZpvd((Object) this.riskLevel, (Object) spotSearchDexTokenBean.riskLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCommunityRecognized() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange1H() {
        return this.priceChange1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange24H() {
        return this.priceChange24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange4H() {
        return this.priceChange4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
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
        return (((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceChange24H.hashCode()) * 31) + this.priceChange4H.hashCode()) * 31) + this.priceChange1H.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized)) * 31) + this.riskLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommunityRecognized(boolean z) {
        this.communityRecognized = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiquidity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liquidity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange1H(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChange1H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange24H(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChange24H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange4H(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChange4H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.riskLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotSearchDexTokenBean(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogo=" + this.tokenLogo + ", price=" + this.price + ", priceChange24H=" + this.priceChange24H + ", priceChange4H=" + this.priceChange4H + ", priceChange1H=" + this.priceChange1H + ", liquidity=" + this.liquidity + ", communityRecognized=" + this.communityRecognized + ", riskLevel=" + this.riskLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.price);
        parcel.writeString(this.priceChange24H);
        parcel.writeString(this.priceChange4H);
        parcel.writeString(this.priceChange1H);
        parcel.writeString(this.liquidity);
        parcel.writeInt(this.communityRecognized ? 1 : 0);
        parcel.writeString(this.riskLevel);
    }

    public SpotSearchDexTokenBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.chainId = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.tokenSymbol = str4;
        this.tokenName = str5;
        this.tokenContractAddress = str6;
        this.tokenLogo = str7;
        this.price = str8;
        this.priceChange24H = str9;
        this.priceChange4H = str10;
        this.priceChange1H = str11;
        this.liquidity = str12;
        this.communityRecognized = z;
        this.riskLevel = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.SpotSearchDexTokenBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SpotSearchDexTokenBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? false : z, (i & 8192) == 0 ? str13 : "");
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.SpotSearchDexTokenBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SpotSearchDexTokenBean KWHzl(@NotNull SpotSearchDexTokenResponseBean spotSearchDexTokenResponseBean) {
            Intrinsics.checkNotNullParameter(spotSearchDexTokenResponseBean, "");
            return new SpotSearchDexTokenBean(spotSearchDexTokenResponseBean.getChainId(), spotSearchDexTokenResponseBean.getChainName(), spotSearchDexTokenResponseBean.getChainLogo(), spotSearchDexTokenResponseBean.getTokenSymbol(), spotSearchDexTokenResponseBean.getTokenName(), spotSearchDexTokenResponseBean.getTokenContractAddress(), spotSearchDexTokenResponseBean.getTokenLogo(), spotSearchDexTokenResponseBean.getPrice(), spotSearchDexTokenResponseBean.getPriceChange24H(), spotSearchDexTokenResponseBean.getPriceChange4H(), spotSearchDexTokenResponseBean.getPriceChange1H(), spotSearchDexTokenResponseBean.getLiquidity(), spotSearchDexTokenResponseBean.getCommunityRecognized(), spotSearchDexTokenResponseBean.getRiskLevel());
        }
    }
}
