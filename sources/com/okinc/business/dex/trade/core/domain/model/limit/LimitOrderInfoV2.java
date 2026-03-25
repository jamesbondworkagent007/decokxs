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
public final class LimitOrderInfoV2 implements Parcelable {
    private final String estReserveNativeAmt;
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final boolean isEnableMev;
    private final String minimumReceived;
    private final String nativeTokenUnitPriceUsd;
    private final DexMultiTokenInfoBean toToken;
    private final String tradeTaxes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LimitOrderInfoV2> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LimitOrderInfoV2> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitOrderInfoV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitOrderInfoV2(parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitOrderInfoV2[] newArray(int i) {
            return new LimitOrderInfoV2[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderInfoV2() {
        this((String) null, (DexMultiTokenInfoBean) null, (String) null, false, (String) null, (String) null, (DexMultiTokenInfoBean) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estReserveNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component7() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tradeTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderInfoV2 copy(@NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, boolean z, String str3, String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LimitOrderInfoV2(str, dexMultiTokenInfoBean, str2, z, str3, str4, dexMultiTokenInfoBean2, str5);
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
        if (!(obj instanceof LimitOrderInfoV2)) {
            return false;
        }
        LimitOrderInfoV2 limitOrderInfoV2 = (LimitOrderInfoV2) obj;
        return Intrinsics.EZpvd((Object) this.estReserveNativeAmt, (Object) limitOrderInfoV2.estReserveNativeAmt) && Intrinsics.EZpvd(this.fromToken, limitOrderInfoV2.fromToken) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) limitOrderInfoV2.fromTokenAmount) && this.isEnableMev == limitOrderInfoV2.isEnableMev && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) limitOrderInfoV2.minimumReceived) && Intrinsics.EZpvd((Object) this.nativeTokenUnitPriceUsd, (Object) limitOrderInfoV2.nativeTokenUnitPriceUsd) && Intrinsics.EZpvd(this.toToken, limitOrderInfoV2.toToken) && Intrinsics.EZpvd((Object) this.tradeTaxes, (Object) limitOrderInfoV2.tradeTaxes);
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
    public final String getTradeTaxes() {
        return this.tradeTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.estReserveNativeAmt.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode2 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        String str = this.fromTokenAmount;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isEnableMev);
        String str2 = this.minimumReceived;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nativeTokenUnitPriceUsd;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        int iHashCode7 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        String str4 = this.tradeTaxes;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderInfoV2(estReserveNativeAmt=" + this.estReserveNativeAmt + ", fromToken=" + this.fromToken + ", fromTokenAmount=" + this.fromTokenAmount + ", isEnableMev=" + this.isEnableMev + ", minimumReceived=" + this.minimumReceived + ", nativeTokenUnitPriceUsd=" + this.nativeTokenUnitPriceUsd + ", toToken=" + this.toToken + ", tradeTaxes=" + this.tradeTaxes + ")";
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
        parcel.writeString(this.fromTokenAmount);
        parcel.writeInt(this.isEnableMev ? 1 : 0);
        parcel.writeString(this.minimumReceived);
        parcel.writeString(this.nativeTokenUnitPriceUsd);
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tradeTaxes);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitOrderInfoV2> serializer() {
            return LimitOrderInfoV2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitOrderInfoV2(int i, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, boolean z, String str3, String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.fromTokenAmount = "";
        } else {
            this.fromTokenAmount = str2;
        }
        if ((i & 8) == 0) {
            this.isEnableMev = false;
        } else {
            this.isEnableMev = z;
        }
        if ((i & 16) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str3;
        }
        if ((i & 32) == 0) {
            this.nativeTokenUnitPriceUsd = "";
        } else {
            this.nativeTokenUnitPriceUsd = str4;
        }
        if ((i & 64) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((i & 128) == 0) {
            this.tradeTaxes = null;
        } else {
            this.tradeTaxes = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitOrderInfoV2 limitOrderInfoV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitOrderInfoV2.estReserveNativeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitOrderInfoV2.estReserveNativeAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || limitOrderInfoV2.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, limitOrderInfoV2.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitOrderInfoV2.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, limitOrderInfoV2.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || limitOrderInfoV2.isEnableMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, limitOrderInfoV2.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitOrderInfoV2.minimumReceived, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, limitOrderInfoV2.minimumReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) limitOrderInfoV2.nativeTokenUnitPriceUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, limitOrderInfoV2.nativeTokenUnitPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || limitOrderInfoV2.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, DexMultiTokenInfoBean$$serializer.INSTANCE, limitOrderInfoV2.toToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && limitOrderInfoV2.tradeTaxes == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, limitOrderInfoV2.tradeTaxes);
    }

    public LimitOrderInfoV2(@NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, boolean z, String str3, String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estReserveNativeAmt = str;
        this.fromToken = dexMultiTokenInfoBean;
        this.fromTokenAmount = str2;
        this.isEnableMev = z;
        this.minimumReceived = str3;
        this.nativeTokenUnitPriceUsd = str4;
        this.toToken = dexMultiTokenInfoBean2;
        this.tradeTaxes = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r11v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r16v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String):void (m)] (LINE:43) call: com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String):void type: THIS */
    public /* synthetic */ LimitOrderInfoV2(String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, boolean z, String str3, String str4, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : dexMultiTokenInfoBean, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "", (i & 64) != 0 ? null : dexMultiTokenInfoBean2, (i & 128) == 0 ? str5 : null);
    }
}
