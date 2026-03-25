package com.okinc.business.dex.trade.core.domain.model.limit;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TokenPairRateOrderInfo implements Parcelable {
    private final String code;
    private final String estReserveNativeAmt;
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final boolean isEnableMev;
    private final String isHoneypot;
    private final String isSafeMoonToken;
    private final String minSellAmount;
    private final String minimumReceived;
    private final String nativeTokenUnitPriceUsd;
    private final DexMultiTokenInfoBean toToken;
    private final String toTokenAmount;
    private final String tradeTaxes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenPairRateOrderInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenPairRateOrderInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenPairRateOrderInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenPairRateOrderInfo(parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenPairRateOrderInfo[] newArray(int i) {
            return new TokenPairRateOrderInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenPairRateOrderInfo() {
        this((String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estReserveNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tradeTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.minSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPairRateOrderInfo copy(@NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TokenPairRateOrderInfo(str, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str2, str3, z, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof TokenPairRateOrderInfo)) {
            return false;
        }
        TokenPairRateOrderInfo tokenPairRateOrderInfo = (TokenPairRateOrderInfo) obj;
        return Intrinsics.EZpvd((Object) this.estReserveNativeAmt, (Object) tokenPairRateOrderInfo.estReserveNativeAmt) && Intrinsics.EZpvd(this.fromToken, tokenPairRateOrderInfo.fromToken) && Intrinsics.EZpvd(this.toToken, tokenPairRateOrderInfo.toToken) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) tokenPairRateOrderInfo.fromTokenAmount) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) tokenPairRateOrderInfo.toTokenAmount) && this.isEnableMev == tokenPairRateOrderInfo.isEnableMev && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) tokenPairRateOrderInfo.minimumReceived) && Intrinsics.EZpvd((Object) this.nativeTokenUnitPriceUsd, (Object) tokenPairRateOrderInfo.nativeTokenUnitPriceUsd) && Intrinsics.EZpvd((Object) this.minSellAmount, (Object) tokenPairRateOrderInfo.minSellAmount) && Intrinsics.EZpvd((Object) this.code, (Object) tokenPairRateOrderInfo.code) && Intrinsics.EZpvd((Object) this.isHoneypot, (Object) tokenPairRateOrderInfo.isHoneypot) && Intrinsics.EZpvd((Object) this.isSafeMoonToken, (Object) tokenPairRateOrderInfo.isSafeMoonToken) && Intrinsics.EZpvd((Object) this.tradeTaxes, (Object) tokenPairRateOrderInfo.tradeTaxes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstReserveNativeAmt() {
        return this.estReserveNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAmount() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSellAmount() {
        return this.minSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenUnitPriceUsd() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeTaxes() {
        return this.tradeTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.estReserveNativeAmt.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode2 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        int iHashCode3 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        String str = this.fromTokenAmount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.toTokenAmount;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isEnableMev);
        String str3 = this.minimumReceived;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nativeTokenUnitPriceUsd;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.minSellAmount;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.code;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.isHoneypot;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.isSafeMoonToken;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tradeTaxes;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isHoneypot() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSafeMoonToken() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenPairRateOrderInfo(estReserveNativeAmt=" + this.estReserveNativeAmt + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", fromTokenAmount=" + this.fromTokenAmount + ", toTokenAmount=" + this.toTokenAmount + ", isEnableMev=" + this.isEnableMev + ", minimumReceived=" + this.minimumReceived + ", nativeTokenUnitPriceUsd=" + this.nativeTokenUnitPriceUsd + ", minSellAmount=" + this.minSellAmount + ", code=" + this.code + ", isHoneypot=" + this.isHoneypot + ", isSafeMoonToken=" + this.isSafeMoonToken + ", tradeTaxes=" + this.tradeTaxes + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.estReserveNativeAmt);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromTokenAmount);
        parcel.writeString(this.toTokenAmount);
        parcel.writeInt(this.isEnableMev ? 1 : 0);
        parcel.writeString(this.minimumReceived);
        parcel.writeString(this.nativeTokenUnitPriceUsd);
        parcel.writeString(this.minSellAmount);
        parcel.writeString(this.code);
        parcel.writeString(this.isHoneypot);
        parcel.writeString(this.isSafeMoonToken);
        parcel.writeString(this.tradeTaxes);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenPairRateOrderInfo> serializer() {
            return TokenPairRateOrderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenPairRateOrderInfo(int i, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estReserveNativeAmt = "";
        } else {
            this.estReserveNativeAmt = str;
        }
        if ((i & 2) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((i & 4) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((i & 8) == 0) {
            this.fromTokenAmount = "";
        } else {
            this.fromTokenAmount = str2;
        }
        if ((i & 16) == 0) {
            this.toTokenAmount = null;
        } else {
            this.toTokenAmount = str3;
        }
        this.isEnableMev = (i & 32) == 0 ? false : z;
        if ((i & 64) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str4;
        }
        if ((i & 128) == 0) {
            this.nativeTokenUnitPriceUsd = "";
        } else {
            this.nativeTokenUnitPriceUsd = str5;
        }
        if ((i & 256) == 0) {
            this.minSellAmount = null;
        } else {
            this.minSellAmount = str6;
        }
        if ((i & 512) == 0) {
            this.code = null;
        } else {
            this.code = str7;
        }
        if ((i & 1024) == 0) {
            this.isHoneypot = null;
        } else {
            this.isHoneypot = str8;
        }
        if ((i & 2048) == 0) {
            this.isSafeMoonToken = null;
        } else {
            this.isSafeMoonToken = str9;
        }
        if ((i & 4096) == 0) {
            this.tradeTaxes = null;
        } else {
            this.tradeTaxes = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TokenPairRateOrderInfo tokenPairRateOrderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenPairRateOrderInfo.estReserveNativeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenPairRateOrderInfo.estReserveNativeAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenPairRateOrderInfo.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, tokenPairRateOrderInfo.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tokenPairRateOrderInfo.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, tokenPairRateOrderInfo.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenPairRateOrderInfo.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tokenPairRateOrderInfo.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tokenPairRateOrderInfo.toTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tokenPairRateOrderInfo.toTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tokenPairRateOrderInfo.isEnableMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, tokenPairRateOrderInfo.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenPairRateOrderInfo.minimumReceived, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tokenPairRateOrderInfo.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tokenPairRateOrderInfo.nativeTokenUnitPriceUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tokenPairRateOrderInfo.nativeTokenUnitPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tokenPairRateOrderInfo.minSellAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tokenPairRateOrderInfo.minSellAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tokenPairRateOrderInfo.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tokenPairRateOrderInfo.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tokenPairRateOrderInfo.isHoneypot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tokenPairRateOrderInfo.isHoneypot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || tokenPairRateOrderInfo.isSafeMoonToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tokenPairRateOrderInfo.isSafeMoonToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && tokenPairRateOrderInfo.tradeTaxes == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tokenPairRateOrderInfo.tradeTaxes);
    }

    public TokenPairRateOrderInfo(@NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estReserveNativeAmt = str;
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
        this.fromTokenAmount = str2;
        this.toTokenAmount = str3;
        this.isEnableMev = z;
        this.minimumReceived = str4;
        this.nativeTokenUnitPriceUsd = str5;
        this.minSellAmount = str6;
        this.code = str7;
        this.isHoneypot = str8;
        this.isSafeMoonToken = str9;
        this.tradeTaxes = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r16v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r17v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:67) call: com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenPairRateOrderInfo(String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : dexMultiTokenInfoBean, (i & 4) != 0 ? null : dexMultiTokenInfoBean2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str4, (i & 128) == 0 ? str5 : "", (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) == 0 ? str10 : null);
    }
}
