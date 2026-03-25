package com.okinc.business.web3pay.lib.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenMeta implements Parcelable {
    public static final int $stable = 0;
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final String masterCurrencyId;
    private final boolean pay;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbol;
    private final String usdAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TokenMeta> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenMeta> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenMeta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenMeta(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenMeta[] newArray(int i) {
            return new TokenMeta[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.pay;
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
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenMeta copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new TokenMeta(str, str2, str3, str4, str5, str6, str7, str8, i, str9, str10, str11, z);
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
        if (!(obj instanceof TokenMeta)) {
            return false;
        }
        TokenMeta tokenMeta = (TokenMeta) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) tokenMeta.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) tokenMeta.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) tokenMeta.chainLogo) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) tokenMeta.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) tokenMeta.masterCurrencyId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) tokenMeta.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenMeta.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenMeta.tokenName) && this.tokenDecimal == tokenMeta.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) tokenMeta.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) tokenMeta.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) tokenMeta.usdAmount) && this.pay == tokenMeta.pay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
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
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPay() {
        return this.pay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
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
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = this.chainLogo.hashCode();
        int iHashCode4 = this.tokenCoinTypeNo.hashCode();
        String str = this.masterCurrencyId;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + this.tokenLogo.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + this.usdAmount.hashCode()) * 31) + Boolean.hashCode(this.pay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenMeta(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenAddress=" + this.tokenAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenDecimal=" + this.tokenDecimal + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", pay=" + this.pay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.tokenCoinTypeNo);
        parcel.writeString(this.masterCurrencyId);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenName);
        parcel.writeInt(this.tokenDecimal);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenAmount);
        parcel.writeString(this.usdAmount);
        parcel.writeInt(this.pay ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.TokenMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenMeta> serializer() {
            return TokenMeta$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenMeta(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, TokenMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.tokenCoinTypeNo = str4;
        this.masterCurrencyId = str5;
        this.tokenAddress = str6;
        this.tokenSymbol = str7;
        this.tokenName = str8;
        this.tokenDecimal = i2;
        this.tokenLogo = str9;
        if ((i & 1024) == 0) {
            this.tokenAmount = "0";
        } else {
            this.tokenAmount = str10;
        }
        if ((i & 2048) == 0) {
            this.usdAmount = "0";
        } else {
            this.usdAmount = str11;
        }
        this.pay = (i & 4096) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TokenMeta tokenMeta, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenMeta.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenMeta.chainName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenMeta.chainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenMeta.tokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tokenMeta.masterCurrencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenMeta.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenMeta.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenMeta.tokenName);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, tokenMeta.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenMeta.tokenLogo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tokenMeta.tokenAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tokenMeta.tokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenMeta.usdAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tokenMeta.usdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tokenMeta.pay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, tokenMeta.pay);
        }
    }

    public TokenMeta(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.tokenCoinTypeNo = str4;
        this.masterCurrencyId = str5;
        this.tokenAddress = str6;
        this.tokenSymbol = str7;
        this.tokenName = str8;
        this.tokenDecimal = i;
        this.tokenLogo = str9;
        this.tokenAmount = str10;
        this.usdAmount = str11;
        this.pay = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 int)
  (r27v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("0") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("0") : (r29v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.business.web3pay.lib.core.model.TokenMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TokenMeta(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, i, str9, (i2 & 1024) != 0 ? "0" : str10, (i2 & 2048) != 0 ? "0" : str11, (i2 & 4096) != 0 ? false : z);
    }
}
