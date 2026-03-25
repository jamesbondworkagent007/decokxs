package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenDetail implements Parcelable {
    public static final int $stable = 0;
    private final String chainBWLogoUrl;
    private final String chainId;
    private final String chainLogoUrl;
    private final String chainName;
    private final String decimals;
    private final String explorerUrl;
    private final String id;
    private final Integer isAuth;
    private final int isHoneypot;
    private final String isLeveraged;
    private final String isNativeToken;
    private final int isSafeMoonToken;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TokenDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenDetail(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetail[] newArray(int i) {
            return new TokenDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenDetail() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.isAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.isLeveraged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetail copy(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, int i2, @NotNull String str12, @NotNull String str13) {
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
        return new TokenDetail(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, i, i2, str12, str13);
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
        if (!(obj instanceof TokenDetail)) {
            return false;
        }
        TokenDetail tokenDetail = (TokenDetail) obj;
        return Intrinsics.EZpvd(this.isAuth, tokenDetail.isAuth) && Intrinsics.EZpvd((Object) this.id, (Object) tokenDetail.id) && Intrinsics.EZpvd((Object) this.chainId, (Object) tokenDetail.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) tokenDetail.chainName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenDetail.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenDetail.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tokenDetail.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) tokenDetail.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.decimals, (Object) tokenDetail.decimals) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) tokenDetail.explorerUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) tokenDetail.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) tokenDetail.chainBWLogoUrl) && this.isSafeMoonToken == tokenDetail.isSafeMoonToken && this.isHoneypot == tokenDetail.isHoneypot && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) tokenDetail.isNativeToken) && Intrinsics.EZpvd((Object) this.isLeveraged, (Object) tokenDetail.isLeveraged);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainBWLogoUrl() {
        return this.chainBWLogoUrl;
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
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
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
        Integer num = this.isAuth;
        return ((((((((((((((((((((((((((((((num == null ? 0 : num.hashCode()) * 31) + this.id.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.decimals.hashCode()) * 31) + this.explorerUrl.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.chainBWLogoUrl.hashCode()) * 31) + Integer.hashCode(this.isSafeMoonToken)) * 31) + Integer.hashCode(this.isHoneypot)) * 31) + this.isNativeToken.hashCode()) * 31) + this.isLeveraged.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isAuth() {
        return this.isAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHoneypot() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLeveraged() {
        return this.isLeveraged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSafeMoonToken() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenDetail(isAuth=" + this.isAuth + ", id=" + this.id + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", decimals=" + this.decimals + ", explorerUrl=" + this.explorerUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", isSafeMoonToken=" + this.isSafeMoonToken + ", isHoneypot=" + this.isHoneypot + ", isNativeToken=" + this.isNativeToken + ", isLeveraged=" + this.isLeveraged + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.isAuth;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.id);
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.decimals);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.chainBWLogoUrl);
        parcel.writeInt(this.isSafeMoonToken);
        parcel.writeInt(this.isHoneypot);
        parcel.writeString(this.isNativeToken);
        parcel.writeString(this.isLeveraged);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.TokenDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenDetail> serializer() {
            return TokenDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenDetail(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, int i3, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        this.isAuth = (i & 1) == 0 ? null : num;
        if ((i & 2) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 8) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 16) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str4;
        }
        if ((i & 32) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 64) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str6;
        }
        if ((i & 128) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str7;
        }
        if ((i & 256) == 0) {
            this.decimals = "";
        } else {
            this.decimals = str8;
        }
        if ((i & 512) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str9;
        }
        if ((i & 1024) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str10;
        }
        if ((i & 2048) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str11;
        }
        if ((i & 4096) == 0) {
            this.isSafeMoonToken = 0;
        } else {
            this.isSafeMoonToken = i2;
        }
        if ((i & 8192) == 0) {
            this.isHoneypot = 0;
        } else {
            this.isHoneypot = i3;
        }
        if ((i & 16384) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str12;
        }
        if ((i & 32768) == 0) {
            this.isLeveraged = "";
        } else {
            this.isLeveraged = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TokenDetail tokenDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenDetail.isAuth != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, tokenDetail.isAuth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenDetail.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenDetail.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenDetail.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenDetail.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenDetail.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenDetail.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenDetail.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenDetail.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenDetail.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenDetail.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenDetail.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenDetail.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tokenDetail.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenDetail.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tokenDetail.decimals, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tokenDetail.decimals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tokenDetail.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenDetail.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tokenDetail.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tokenDetail.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenDetail.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tokenDetail.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tokenDetail.isSafeMoonToken != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, tokenDetail.isSafeMoonToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tokenDetail.isHoneypot != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, tokenDetail.isHoneypot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tokenDetail.isNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tokenDetail.isNativeToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) tokenDetail.isLeveraged, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, tokenDetail.isLeveraged);
    }

    public TokenDetail(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, int i2, @NotNull String str12, @NotNull String str13) {
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
        this.isAuth = num;
        this.id = str;
        this.chainId = str2;
        this.chainName = str3;
        this.tokenSymbol = str4;
        this.tokenName = str5;
        this.tokenContractAddress = str6;
        this.tokenLogoUrl = str7;
        this.decimals = str8;
        this.explorerUrl = str9;
        this.chainLogoUrl = str10;
        this.chainBWLogoUrl = str11;
        this.isSafeMoonToken = i;
        this.isHoneypot = i2;
        this.isNativeToken = str12;
        this.isLeveraged = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] (LINE:111) call: com.okinc.business.dex.trade.core.domain.model.TokenDetail.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenDetail(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, String str12, String str13, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? "" : str8, (i3 & 512) != 0 ? "" : str9, (i3 & 1024) != 0 ? "" : str10, (i3 & 2048) != 0 ? "" : str11, (i3 & 4096) != 0 ? 0 : i, (i3 & 8192) != 0 ? 0 : i2, (i3 & 16384) != 0 ? "" : str12, (i3 & 32768) != 0 ? "" : str13);
    }

    /* JADX INFO: renamed from: isNativeToken, reason: collision with other method in class */
    public final boolean m6493isNativeToken() {
        return Intrinsics.EZpvd((Object) this.isNativeToken, (Object) "1");
    }

    public final boolean isLeverage() {
        return Intrinsics.EZpvd((Object) this.isLeveraged, (Object) "1");
    }
}
