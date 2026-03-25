package com.okinc.business.trade.features.home.ui.cefi.data;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class LimitOrderInfo implements Parcelable {
    private final String code;
    private final String estReserveNativeAmt;
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final String fromTokenPrice;
    private final boolean isEnableMev;
    private final String isHoneypot;
    private final String isSafeMoonToken;
    private final String minSellAmount;
    private final String minimumReceived;
    private final String nativeTokenUnitPriceUsd;
    private final DexMultiTokenInfoBean toToken;
    private final String toTokenAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LimitOrderInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LimitOrderInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitOrderInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitOrderInfo(parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitOrderInfo[] newArray(int i) {
            return new LimitOrderInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderInfo() {
        this((DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component1() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromTokenPrice;
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
        return this.estReserveNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderInfo copy(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, String str3, boolean z, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new LimitOrderInfo(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str, str2, str3, z, str4, str5, str6, str7, str8, str9, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean enableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitOrderInfo)) {
            return false;
        }
        LimitOrderInfo limitOrderInfo = (LimitOrderInfo) obj;
        return Intrinsics.EZpvd(this.fromToken, limitOrderInfo.fromToken) && Intrinsics.EZpvd(this.toToken, limitOrderInfo.toToken) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) limitOrderInfo.fromTokenAmount) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) limitOrderInfo.toTokenAmount) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) limitOrderInfo.fromTokenPrice) && this.isEnableMev == limitOrderInfo.isEnableMev && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) limitOrderInfo.minimumReceived) && Intrinsics.EZpvd((Object) this.nativeTokenUnitPriceUsd, (Object) limitOrderInfo.nativeTokenUnitPriceUsd) && Intrinsics.EZpvd((Object) this.estReserveNativeAmt, (Object) limitOrderInfo.estReserveNativeAmt) && Intrinsics.EZpvd((Object) this.minSellAmount, (Object) limitOrderInfo.minSellAmount) && Intrinsics.EZpvd((Object) this.code, (Object) limitOrderInfo.code) && Intrinsics.EZpvd((Object) this.isHoneypot, (Object) limitOrderInfo.isHoneypot) && Intrinsics.EZpvd((Object) this.isSafeMoonToken, (Object) limitOrderInfo.isSafeMoonToken);
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
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
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
    public int hashCode() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        int iHashCode2 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        String str = this.fromTokenAmount;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.toTokenAmount;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fromTokenPrice;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isEnableMev);
        String str4 = this.minimumReceived;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nativeTokenUnitPriceUsd;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + this.estReserveNativeAmt.hashCode()) * 31) + this.minSellAmount.hashCode()) * 31) + this.code.hashCode()) * 31) + this.isHoneypot.hashCode()) * 31) + this.isSafeMoonToken.hashCode();
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
        return "LimitOrderInfo(fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", fromTokenAmount=" + this.fromTokenAmount + ", toTokenAmount=" + this.toTokenAmount + ", fromTokenPrice=" + this.fromTokenPrice + ", isEnableMev=" + this.isEnableMev + ", minimumReceived=" + this.minimumReceived + ", nativeTokenUnitPriceUsd=" + this.nativeTokenUnitPriceUsd + ", estReserveNativeAmt=" + this.estReserveNativeAmt + ", minSellAmount=" + this.minSellAmount + ", code=" + this.code + ", isHoneypot=" + this.isHoneypot + ", isSafeMoonToken=" + this.isSafeMoonToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
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
        parcel.writeString(this.fromTokenPrice);
        parcel.writeInt(this.isEnableMev ? 1 : 0);
        parcel.writeString(this.minimumReceived);
        parcel.writeString(this.nativeTokenUnitPriceUsd);
        parcel.writeString(this.estReserveNativeAmt);
        parcel.writeString(this.minSellAmount);
        parcel.writeString(this.code);
        parcel.writeString(this.isHoneypot);
        parcel.writeString(this.isSafeMoonToken);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitOrderInfo> serializer() {
            return LimitOrderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitOrderInfo(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((i & 2) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((i & 4) == 0) {
            this.fromTokenAmount = "";
        } else {
            this.fromTokenAmount = str;
        }
        if ((i & 8) == 0) {
            this.toTokenAmount = "";
        } else {
            this.toTokenAmount = str2;
        }
        if ((i & 16) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str3;
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
            this.estReserveNativeAmt = "";
        } else {
            this.estReserveNativeAmt = str6;
        }
        if ((i & 512) == 0) {
            this.minSellAmount = "";
        } else {
            this.minSellAmount = str7;
        }
        if ((i & 1024) == 0) {
            this.code = "";
        } else {
            this.code = str8;
        }
        if ((i & 2048) == 0) {
            this.isHoneypot = "";
        } else {
            this.isHoneypot = str9;
        }
        if ((i & 4096) == 0) {
            this.isSafeMoonToken = "";
        } else {
            this.isSafeMoonToken = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitOrderInfo limitOrderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || limitOrderInfo.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, limitOrderInfo.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || limitOrderInfo.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, limitOrderInfo.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitOrderInfo.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, limitOrderInfo.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitOrderInfo.toTokenAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, limitOrderInfo.toTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitOrderInfo.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, limitOrderInfo.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || limitOrderInfo.isEnableMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, limitOrderInfo.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) limitOrderInfo.minimumReceived, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, limitOrderInfo.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) limitOrderInfo.nativeTokenUnitPriceUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, limitOrderInfo.nativeTokenUnitPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) limitOrderInfo.estReserveNativeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, limitOrderInfo.estReserveNativeAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) limitOrderInfo.minSellAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, limitOrderInfo.minSellAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) limitOrderInfo.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, limitOrderInfo.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) limitOrderInfo.isHoneypot, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, limitOrderInfo.isHoneypot);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) limitOrderInfo.isSafeMoonToken, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, limitOrderInfo.isSafeMoonToken);
    }

    public LimitOrderInfo(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, String str3, boolean z, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
        this.fromTokenAmount = str;
        this.toTokenAmount = str2;
        this.fromTokenPrice = str3;
        this.isEnableMev = z;
        this.minimumReceived = str4;
        this.nativeTokenUnitPriceUsd = str5;
        this.estReserveNativeAmt = str6;
        this.minSellAmount = str7;
        this.code = str8;
        this.isHoneypot = str9;
        this.isSafeMoonToken = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r15v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r16v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:397) call: com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitOrderInfo(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dexMultiTokenInfoBean, (i & 2) == 0 ? dexMultiTokenInfoBean2 : null, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) == 0 ? str10 : "");
    }

    public final String getEnableMev() {
        return enableMev() ? "1" : "0";
    }
}
