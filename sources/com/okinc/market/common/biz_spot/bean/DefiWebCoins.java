package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class DefiWebCoins implements Parcelable {

    @SerializedName("boostPercentage")
    private final String boostPercentage;

    @SerializedName("boostRate")
    private final String boostRate;

    @SerializedName("boosted")
    private final boolean boosted;

    @SerializedName("cedefiSupport")
    private Boolean cedefiSupport;

    @SerializedName("chainId")
    private String chainId;

    @SerializedName("chainLogo")
    private String chainLogo;

    @SerializedName("chainName")
    private String chainName;

    @SerializedName("communityRecognized")
    private Boolean communityRecognized;

    @SerializedName("liquidity")
    private String liquidity;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private String price;

    @SerializedName("priceChange1H")
    private String priceChange1H;

    @SerializedName("priceChange24H")
    private String priceChange24H;

    @SerializedName("priceChange4H")
    private String priceChange4H;

    @SerializedName("priceChangeUtc0")
    private String priceChangeUtc0;

    @SerializedName("priceChangeUtc8")
    private String priceChangeUtc8;

    @SerializedName("riskLevel")
    private String riskLevel;

    @SerializedName("tokenContractAddress")
    private String tokenContractAddress;

    @SerializedName("tokenLogo")
    private String tokenLogo;

    @SerializedName("tokenName")
    private String tokenName;

    @SerializedName("tokenSymbol")
    private String tokenSymbol;

    @SerializedName("turnOver24H")
    private String turnOver24;

    @SerializedName("verified")
    private boolean verified;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DefiWebCoins> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DefiWebCoins> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiWebCoins createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string16 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DefiWebCoins(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, boolValueOf, string16, boolValueOf2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiWebCoins[] newArray(int i) {
            return new DefiWebCoins[i];
        }
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
        return this.priceChangeUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.priceChangeUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.turnOver24;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.cedefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.boosted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.boostPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.boostRate;
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
    public final DefiWebCoins copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, Boolean bool2, boolean z, boolean z2, @NotNull String str17, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        return new DefiWebCoins(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, bool, str16, bool2, z, z2, str17, str18);
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
        if (!(obj instanceof DefiWebCoins)) {
            return false;
        }
        DefiWebCoins defiWebCoins = (DefiWebCoins) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) defiWebCoins.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) defiWebCoins.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) defiWebCoins.chainLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) defiWebCoins.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) defiWebCoins.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) defiWebCoins.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) defiWebCoins.tokenLogo) && Intrinsics.EZpvd((Object) this.price, (Object) defiWebCoins.price) && Intrinsics.EZpvd((Object) this.priceChange24H, (Object) defiWebCoins.priceChange24H) && Intrinsics.EZpvd((Object) this.priceChange4H, (Object) defiWebCoins.priceChange4H) && Intrinsics.EZpvd((Object) this.priceChange1H, (Object) defiWebCoins.priceChange1H) && Intrinsics.EZpvd((Object) this.priceChangeUtc0, (Object) defiWebCoins.priceChangeUtc0) && Intrinsics.EZpvd((Object) this.priceChangeUtc8, (Object) defiWebCoins.priceChangeUtc8) && Intrinsics.EZpvd((Object) this.liquidity, (Object) defiWebCoins.liquidity) && Intrinsics.EZpvd((Object) this.turnOver24, (Object) defiWebCoins.turnOver24) && Intrinsics.EZpvd(this.communityRecognized, defiWebCoins.communityRecognized) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) defiWebCoins.riskLevel) && Intrinsics.EZpvd(this.cedefiSupport, defiWebCoins.cedefiSupport) && this.verified == defiWebCoins.verified && this.boosted == defiWebCoins.boosted && Intrinsics.EZpvd((Object) this.boostPercentage, (Object) defiWebCoins.boostPercentage) && Intrinsics.EZpvd((Object) this.boostRate, (Object) defiWebCoins.boostRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostPercentage() {
        return this.boostPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostRate() {
        return this.boostRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBoosted() {
        return this.boosted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCedefiSupport() {
        return this.cedefiSupport;
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
    public final Boolean getCommunityRecognized() {
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
    public final String getPriceChangeUtc0() {
        return this.priceChangeUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChangeUtc8() {
        return this.priceChangeUtc8;
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
    public final String getTurnOver24() {
        return this.turnOver24;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVerified() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainLogo;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenSymbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenName;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenContractAddress;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenLogo;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.price;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.priceChange24H;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.priceChange4H;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.priceChange1H;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.priceChangeUtc0;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.priceChangeUtc8;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.liquidity;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.turnOver24;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        Boolean bool = this.communityRecognized;
        int iHashCode16 = bool == null ? 0 : bool.hashCode();
        String str16 = this.riskLevel;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        Boolean bool2 = this.cedefiSupport;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.verified)) * 31) + Boolean.hashCode(this.boosted)) * 31) + this.boostPercentage.hashCode()) * 31) + this.boostRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCedefiSupport(Boolean bool) {
        this.cedefiSupport = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogo(String str) {
        this.chainLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommunityRecognized(Boolean bool) {
        this.communityRecognized = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiquidity(String str) {
        this.liquidity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange1H(String str) {
        this.priceChange1H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange24H(String str) {
        this.priceChange24H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange4H(String str) {
        this.priceChange4H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeUtc0(String str) {
        this.priceChangeUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeUtc8(String str) {
        this.priceChangeUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskLevel(String str) {
        this.riskLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(String str) {
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogo(String str) {
        this.tokenLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(String str) {
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(String str) {
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTurnOver24(String str) {
        this.turnOver24 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerified(boolean z) {
        this.verified = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefiWebCoins(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogo=" + this.tokenLogo + ", price=" + this.price + ", priceChange24H=" + this.priceChange24H + ", priceChange4H=" + this.priceChange4H + ", priceChange1H=" + this.priceChange1H + ", priceChangeUtc0=" + this.priceChangeUtc0 + ", priceChangeUtc8=" + this.priceChangeUtc8 + ", liquidity=" + this.liquidity + ", turnOver24=" + this.turnOver24 + ", communityRecognized=" + this.communityRecognized + ", riskLevel=" + this.riskLevel + ", cedefiSupport=" + this.cedefiSupport + ", verified=" + this.verified + ", boosted=" + this.boosted + ", boostPercentage=" + this.boostPercentage + ", boostRate=" + this.boostRate + ")";
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
        parcel.writeString(this.priceChangeUtc0);
        parcel.writeString(this.priceChangeUtc8);
        parcel.writeString(this.liquidity);
        parcel.writeString(this.turnOver24);
        Boolean bool = this.communityRecognized;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.riskLevel);
        Boolean bool2 = this.cedefiSupport;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.verified ? 1 : 0);
        parcel.writeInt(this.boosted ? 1 : 0);
        parcel.writeString(this.boostPercentage);
        parcel.writeString(this.boostRate);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.DefiWebCoins.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiWebCoins> serializer() {
            return DefiWebCoins$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefiWebCoins(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, Boolean bool2, boolean z, boolean z2, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        if (4194303 != (i & 4194303)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4194303, DefiWebCoins$$serializer.INSTANCE.getDescriptor());
        }
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
        this.priceChangeUtc0 = str12;
        this.priceChangeUtc8 = str13;
        this.liquidity = str14;
        this.turnOver24 = str15;
        this.communityRecognized = bool;
        this.riskLevel = str16;
        this.cedefiSupport = bool2;
        this.verified = z;
        this.boosted = z2;
        this.boostPercentage = str17;
        this.boostRate = str18;
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(DefiWebCoins defiWebCoins, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, defiWebCoins.chainId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, defiWebCoins.chainName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, defiWebCoins.chainLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, defiWebCoins.tokenSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, defiWebCoins.tokenName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, defiWebCoins.tokenContractAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, defiWebCoins.tokenLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, defiWebCoins.price);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, defiWebCoins.priceChange24H);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, defiWebCoins.priceChange4H);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, defiWebCoins.priceChange1H);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, defiWebCoins.priceChangeUtc0);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, defiWebCoins.priceChangeUtc8);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, defiWebCoins.liquidity);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, defiWebCoins.turnOver24);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, defiWebCoins.communityRecognized);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, defiWebCoins.riskLevel);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, defiWebCoins.cedefiSupport);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 18, defiWebCoins.verified);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 19, defiWebCoins.boosted);
        compositeEncoder.encodeStringElement(serialDescriptor, 20, defiWebCoins.boostPercentage);
        compositeEncoder.encodeStringElement(serialDescriptor, 21, defiWebCoins.boostRate);
    }

    public DefiWebCoins(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, Boolean bool2, boolean z, boolean z2, @NotNull String str17, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
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
        this.priceChangeUtc0 = str12;
        this.priceChangeUtc8 = str13;
        this.liquidity = str14;
        this.turnOver24 = str15;
        this.communityRecognized = bool;
        this.riskLevel = str16;
        this.cedefiSupport = bool2;
        this.verified = z;
        this.boosted = z2;
        this.boostPercentage = str17;
        this.boostRate = str18;
    }

    public DefiWebCoins() {
        this("", "", "", "0", "0", "", "", "", "", "", "", "", "", "", "", Boolean.FALSE, "", null, false, false, "", "");
    }
}
