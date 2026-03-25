package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.okinc.business.defi.api.bean.DexTransferData;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig$$serializer;
import com.okinc.business.dexlogic.error.BtcEncryptException;
import com.okinc.business.dexlogic.error.OrderParamJsonParsingError;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C22380heK;
import o.C23307hvk;
import o.C23310hvn;
import o.C32979mnm;
import o.C33514mxr;
import o.C6777aVl;
import o.InterfaceC23194htd;
import o.xVW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class UnsignedSwapData implements Parcelable {
    public static final String CALLDATA_TYPE_EVM_TRANSFER = "101";
    private final String bizLoad;
    private final String bridgeId;
    private final CallData callData;
    private final String calldataType;
    private final boolean hasReferralCommission;
    private final JitoData jitoData;
    private final boolean jitoEnable;
    private final MevConfig mevConfig;
    private final String offlineTypeQuote;
    private final String orderId;
    private final QuotePriceRes quoteResult;
    private final String unsignedTx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnsignedSwapData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnsignedSwapData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnsignedSwapData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnsignedSwapData(parcel.readString(), CallData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : QuotePriceRes.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : JitoData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? MevConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnsignedSwapData[] newArray(int i) {
            return new UnsignedSwapData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnsignedSwapData() {
        this((String) null, (CallData) null, (String) null, (String) null, (String) null, (String) null, (QuotePriceRes) null, (String) null, (JitoData) null, false, false, (MevConfig) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.jitoEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.hasReferralCommission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevConfig component12() {
        return this.mevConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallData component2() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.calldataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bizLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes component7() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.offlineTypeQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JitoData component9() {
        return this.jitoData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData copy(@NotNull String str, @NotNull CallData callData, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, QuotePriceRes quotePriceRes, String str6, JitoData jitoData, boolean z, boolean z2, MevConfig mevConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(callData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new UnsignedSwapData(str, callData, str2, str3, str4, str5, quotePriceRes, str6, jitoData, z, z2, mevConfig);
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
        if (!(obj instanceof UnsignedSwapData)) {
            return false;
        }
        UnsignedSwapData unsignedSwapData = (UnsignedSwapData) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) unsignedSwapData.orderId) && Intrinsics.EZpvd(this.callData, unsignedSwapData.callData) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) unsignedSwapData.unsignedTx) && Intrinsics.EZpvd((Object) this.bridgeId, (Object) unsignedSwapData.bridgeId) && Intrinsics.EZpvd((Object) this.calldataType, (Object) unsignedSwapData.calldataType) && Intrinsics.EZpvd((Object) this.bizLoad, (Object) unsignedSwapData.bizLoad) && Intrinsics.EZpvd(this.quoteResult, unsignedSwapData.quoteResult) && Intrinsics.EZpvd((Object) this.offlineTypeQuote, (Object) unsignedSwapData.offlineTypeQuote) && Intrinsics.EZpvd(this.jitoData, unsignedSwapData.jitoData) && this.jitoEnable == unsignedSwapData.jitoEnable && this.hasReferralCommission == unsignedSwapData.hasReferralCommission && Intrinsics.EZpvd(this.mevConfig, unsignedSwapData.mevConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizLoad() {
        return this.bizLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallData getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalldataType() {
        return this.calldataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasReferralCommission() {
        return this.hasReferralCommission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JitoData getJitoData() {
        return this.jitoData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getJitoEnable() {
        return this.jitoEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevConfig getMevConfig() {
        return this.mevConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfflineTypeQuote() {
        return this.offlineTypeQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes getQuoteResult() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.callData.hashCode();
        int iHashCode3 = this.unsignedTx.hashCode();
        int iHashCode4 = this.bridgeId.hashCode();
        String str = this.calldataType;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.bizLoad.hashCode();
        QuotePriceRes quotePriceRes = this.quoteResult;
        int iHashCode7 = quotePriceRes == null ? 0 : quotePriceRes.hashCode();
        String str2 = this.offlineTypeQuote;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        JitoData jitoData = this.jitoData;
        int iHashCode9 = jitoData == null ? 0 : jitoData.hashCode();
        int iHashCode10 = Boolean.hashCode(this.jitoEnable);
        int iHashCode11 = Boolean.hashCode(this.hasReferralCommission);
        MevConfig mevConfig = this.mevConfig;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (mevConfig != null ? mevConfig.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnsignedSwapData(orderId=" + this.orderId + ", callData=" + this.callData + ", unsignedTx=" + this.unsignedTx + ", bridgeId=" + this.bridgeId + ", calldataType=" + this.calldataType + ", bizLoad=" + this.bizLoad + ", quoteResult=" + this.quoteResult + ", offlineTypeQuote=" + this.offlineTypeQuote + ", jitoData=" + this.jitoData + ", jitoEnable=" + this.jitoEnable + ", hasReferralCommission=" + this.hasReferralCommission + ", mevConfig=" + this.mevConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        this.callData.writeToParcel(parcel, i);
        parcel.writeString(this.unsignedTx);
        parcel.writeString(this.bridgeId);
        parcel.writeString(this.calldataType);
        parcel.writeString(this.bizLoad);
        QuotePriceRes quotePriceRes = this.quoteResult;
        if (quotePriceRes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quotePriceRes.writeToParcel(parcel, i);
        }
        parcel.writeString(this.offlineTypeQuote);
        JitoData jitoData = this.jitoData;
        if (jitoData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jitoData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.jitoEnable ? 1 : 0);
        parcel.writeInt(this.hasReferralCommission ? 1 : 0);
        MevConfig mevConfig = this.mevConfig;
        if (mevConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mevConfig.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ UnsignedSwapData(int i, String str, CallData callData, String str2, String str3, String str4, String str5, QuotePriceRes quotePriceRes, String str6, JitoData jitoData, boolean z, boolean z2, MevConfig mevConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        this.callData = (i & 2) == 0 ? new CallData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null) : callData;
        if ((i & 4) == 0) {
            this.unsignedTx = "";
        } else {
            this.unsignedTx = str2;
        }
        if ((i & 8) == 0) {
            this.bridgeId = "";
        } else {
            this.bridgeId = str3;
        }
        if ((i & 16) == 0) {
            this.calldataType = null;
        } else {
            this.calldataType = str4;
        }
        if ((i & 32) == 0) {
            this.bizLoad = "";
        } else {
            this.bizLoad = str5;
        }
        if ((i & 64) == 0) {
            this.quoteResult = null;
        } else {
            this.quoteResult = quotePriceRes;
        }
        if ((i & 128) == 0) {
            this.offlineTypeQuote = null;
        } else {
            this.offlineTypeQuote = str6;
        }
        if ((i & 256) == 0) {
            this.jitoData = null;
        } else {
            this.jitoData = jitoData;
        }
        if ((i & 512) == 0) {
            this.jitoEnable = false;
        } else {
            this.jitoEnable = z;
        }
        if ((i & 1024) == 0) {
            this.hasReferralCommission = false;
        } else {
            this.hasReferralCommission = z2;
        }
        if ((i & 2048) == 0) {
            this.mevConfig = null;
        } else {
            this.mevConfig = mevConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(UnsignedSwapData unsignedSwapData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) unsignedSwapData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, unsignedSwapData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(unsignedSwapData.callData, new CallData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, CallData$$serializer.INSTANCE, unsignedSwapData.callData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) unsignedSwapData.unsignedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, unsignedSwapData.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) unsignedSwapData.bridgeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, unsignedSwapData.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || unsignedSwapData.calldataType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, unsignedSwapData.calldataType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) unsignedSwapData.bizLoad, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, unsignedSwapData.bizLoad);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || unsignedSwapData.quoteResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, QuotePriceRes$$serializer.INSTANCE, unsignedSwapData.quoteResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || unsignedSwapData.offlineTypeQuote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, unsignedSwapData.offlineTypeQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || unsignedSwapData.jitoData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, JitoData$$serializer.INSTANCE, unsignedSwapData.jitoData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || unsignedSwapData.jitoEnable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, unsignedSwapData.jitoEnable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || unsignedSwapData.hasReferralCommission) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, unsignedSwapData.hasReferralCommission);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && unsignedSwapData.mevConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, MevConfig$$serializer.INSTANCE, unsignedSwapData.mevConfig);
    }

    public UnsignedSwapData(@NotNull String str, @NotNull CallData callData, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, QuotePriceRes quotePriceRes, String str6, JitoData jitoData, boolean z, boolean z2, MevConfig mevConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(callData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.orderId = str;
        this.callData = callData;
        this.unsignedTx = str2;
        this.bridgeId = str3;
        this.calldataType = str4;
        this.bizLoad = str5;
        this.quoteResult = quotePriceRes;
        this.offlineTypeQuote = str6;
        this.jitoData = jitoData;
        this.jitoEnable = z;
        this.hasReferralCommission = z2;
        this.mevConfig = mevConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0099: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.CallData:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (32767 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:1888) call: com.okinc.business.dexlogic.bean.CallData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 com.okinc.business.dexlogic.bean.CallData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r35v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dexlogic.bean.QuotePriceRes:?: TERNARY null = ((wrap:int:0x0050: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.QuotePriceRes) : (r29v0 com.okinc.business.dexlogic.bean.QuotePriceRes))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.JitoData:?: TERNARY null = ((wrap:int:0x0060: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.JitoData) : (r31v0 com.okinc.business.dexlogic.bean.JitoData))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0068: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0071: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r33v0 boolean) : false)
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.MevConfig:?: TERNARY null = ((wrap:int:0x0078: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r34v0 com.okinc.business.dex.trade.core.domain.model.common.MevConfig) : (null com.okinc.business.dex.trade.core.domain.model.common.MevConfig))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.CallData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, com.okinc.business.dexlogic.bean.JitoData, boolean, boolean, com.okinc.business.dex.trade.core.domain.model.common.MevConfig):void (m)] (LINE:1886) call: com.okinc.business.dexlogic.bean.UnsignedSwapData.<init>(java.lang.String, com.okinc.business.dexlogic.bean.CallData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, com.okinc.business.dexlogic.bean.JitoData, boolean, boolean, com.okinc.business.dex.trade.core.domain.model.common.MevConfig):void type: THIS */
    public /* synthetic */ UnsignedSwapData(String str, CallData callData, String str2, String str3, String str4, String str5, QuotePriceRes quotePriceRes, String str6, JitoData jitoData, boolean z, boolean z2, MevConfig mevConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new CallData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null) : callData, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? null : quotePriceRes, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : jitoData, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false, (i & 2048) == 0 ? mevConfig : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.UnsignedSwapData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UnsignedSwapData> serializer() {
            return UnsignedSwapData$$serializer.INSTANCE;
        }
    }

    public final String getConvertJiToFeeAmount(@NotNull String str, @NotNull String str2) {
        String jitoMarketFee;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str).fARcdN();
        JitoData jitoData = this.jitoData;
        if (jitoData != null && (jitoMarketFee = jitoData.getJitoMarketFee()) != null) {
            str3 = jitoMarketFee;
        }
        return interfaceC23194htdFARcdN.OLrzqt(str3, str2);
    }

    public final String getJiToFeeUsd() {
        String jitoMarketFeeUsd;
        JitoData jitoData = this.jitoData;
        return (jitoData == null || (jitoMarketFeeUsd = jitoData.getJitoMarketFeeUsd()) == null) ? "" : jitoMarketFeeUsd;
    }

    public final boolean isTransfer() {
        return Intrinsics.EZpvd((Object) this.calldataType, (Object) CALLDATA_TYPE_EVM_TRANSFER);
    }

    public final String evmTransferReceiveWalletAddressAesDecrypt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.callData.getTo().length() == 0) {
            return this.callData.getSender();
        }
        try {
            String lowerCase = C23307hvk.OLrzqt(str + xVW.copydefault() + C32979mnm.EZpvd.EZpvd()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return C33514mxr.copydefault(this.callData.getTo(), C.UTF8_NAME, BouncyCastleKeyManagementRepository.AES, lowerCase);
        } catch (Exception e) {
            String str2 = "evmTransferReceiveWalletAddressAesDecrypt error: data = " + this.callData.getData() + " walletAddress = " + str + " from = " + this.callData.getFrom() + " to = " + this.callData.getTo() + " -> " + e.getMessage();
            C23310hvn.e$default(C23310hvn.copydefault, "UnsignedSwapData", str2, null, 4, null);
            C6777aVl.Companion.EZpvd(new OrderParamJsonParsingError(str2));
            return null;
        }
    }

    public final DexTransferData getDexTransferData(@NotNull String str, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull QuotePriceRes quotePriceRes, @NotNull String str2, @NotNull UnsignedSwapData unsignedSwapData) throws BtcEncryptException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(unsignedSwapData, "");
        if (!isTransfer()) {
            return null;
        }
        String memo = unsignedSwapData.callData.getMemo();
        String strEvmTransferReceiveWalletAddressAesDecrypt = evmTransferReceiveWalletAddressAesDecrypt(str2);
        String str3 = strEvmTransferReceiveWalletAddressAesDecrypt == null ? "" : strEvmTransferReceiveWalletAddressAesDecrypt;
        DexQuoteBridgeVO dexQuoteBridgeVOBridge = quotePriceRes.bridge();
        if (dexQuoteBridgeVOBridge != null && dexQuoteBridgeVOBridge.thorSwapOrderCheck(memo)) {
            C6777aVl.Companion.EZpvd(new Exception("thorSwapOrderCheck error: data = " + this.callData.getData() + " walletAddress = " + str2 + " receiveAddress: " + str3));
            throw new BtcEncryptException();
        }
        return new DexTransferData(dexMultiTokenInfoBean.isMainChainCoin(), dexMultiTokenInfoBean.getOriginContractAddress(), this.callData.getValue(), str3, (String) null, memo, unsignedSwapData.bridgeId, 16, (DefaultConstructorMarker) null);
    }
}
