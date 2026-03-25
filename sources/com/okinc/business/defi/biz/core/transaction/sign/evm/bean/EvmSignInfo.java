package com.okinc.business.defi.biz.core.transaction.sign.evm.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EvmSignInfo implements Parcelable {
    private final String chainId;
    private final String facetBlackHoleAddress;
    private final String facetContractAddress;
    private final String gasLimit;
    private EvmSignInfoGasPrice gasPrice;
    private final Boolean isFacet;
    private final Boolean needExtFee;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EvmSignInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EvmSignInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmSignInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            EvmSignInfoGasPrice evmSignInfoGasPriceCreateFromParcel = EvmSignInfoGasPrice.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EvmSignInfo(string, string2, boolValueOf, evmSignInfoGasPriceCreateFromParcel, boolValueOf2, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmSignInfo[] newArray(int i) {
            return new EvmSignInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EvmSignInfo() {
        this((String) null, (String) null, (Boolean) null, (EvmSignInfoGasPrice) null, (Boolean) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFacetBlackHoleAddress() {
        return this.facetBlackHoleAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFacetContractAddress() {
        return this.facetContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignInfoGasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedExtFee() {
        return this.needExtFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFacet() {
        return this.isFacet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(@NotNull EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        this.gasPrice = evmSignInfoGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.chainId);
        Boolean bool = this.needExtFee;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        this.gasPrice.writeToParcel(parcel, i);
        Boolean bool2 = this.isFacet;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.facetBlackHoleAddress);
        parcel.writeString(this.facetContractAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EvmSignInfo> serializer() {
            return EvmSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvmSignInfo(int i, String str, String str2, Boolean bool, EvmSignInfoGasPrice evmSignInfoGasPrice, Boolean bool2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.gasLimit = null;
        } else {
            this.gasLimit = str;
        }
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str2;
        }
        this.needExtFee = (i & 4) == 0 ? Boolean.FALSE : bool;
        this.gasPrice = (i & 8) == 0 ? new EvmSignInfoGasPrice((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : evmSignInfoGasPrice;
        this.isFacet = (i & 16) == 0 ? Boolean.FALSE : bool2;
        if ((i & 32) == 0) {
            this.facetBlackHoleAddress = null;
        } else {
            this.facetBlackHoleAddress = str3;
        }
        if ((i & 64) == 0) {
            this.facetContractAddress = null;
        } else {
            this.facetContractAddress = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EvmSignInfo evmSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || evmSignInfo.gasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, evmSignInfo.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || evmSignInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, evmSignInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(evmSignInfo.needExtFee, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, evmSignInfo.needExtFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(evmSignInfo.gasPrice, new EvmSignInfoGasPrice((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, EvmSignInfoGasPrice$$serializer.INSTANCE, evmSignInfo.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(evmSignInfo.isFacet, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, evmSignInfo.isFacet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || evmSignInfo.facetBlackHoleAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, evmSignInfo.facetBlackHoleAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && evmSignInfo.facetContractAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, evmSignInfo.facetContractAddress);
    }

    public EvmSignInfo(String str, String str2, Boolean bool, @NotNull EvmSignInfoGasPrice evmSignInfoGasPrice, Boolean bool2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        this.gasLimit = str;
        this.chainId = str2;
        this.needExtFee = bool;
        this.gasPrice = evmSignInfoGasPrice;
        this.isFacet = bool2;
        this.facetBlackHoleAddress = str3;
        this.facetContractAddress = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Boolean:?: CAST (java.lang.Boolean) (null java.lang.Boolean))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (262143 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r30v0 com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r34v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r33v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfo.<init>(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EvmSignInfo(String str, String str2, Boolean bool, EvmSignInfoGasPrice evmSignInfoGasPrice, Boolean bool2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? new EvmSignInfoGasPrice((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : evmSignInfoGasPrice, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null);
    }
}
