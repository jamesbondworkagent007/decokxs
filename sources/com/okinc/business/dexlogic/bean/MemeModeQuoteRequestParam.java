package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class MemeModeQuoteRequestParam implements Parcelable {
    private String amount;
    private String chainId;
    private final String defiPlatformIds;
    private final List<String> dexIds;
    private String fromTokenAddress;
    private String maxSlippage;
    private String refCode;
    private String slippage;
    private int slippageType;
    private String toTokenAddress;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeModeQuoteRequestParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<MemeModeQuoteRequestParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeModeQuoteRequestParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeModeQuoteRequestParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeModeQuoteRequestParam[] newArray(int i) {
            return new MemeModeQuoteRequestParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.defiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeModeQuoteRequestParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, int i, String str7, String str8, List<String> list, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new MemeModeQuoteRequestParam(str, str2, str3, str4, str5, str6, i, str7, str8, list, str9);
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
        if (!(obj instanceof MemeModeQuoteRequestParam)) {
            return false;
        }
        MemeModeQuoteRequestParam memeModeQuoteRequestParam = (MemeModeQuoteRequestParam) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) memeModeQuoteRequestParam.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) memeModeQuoteRequestParam.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) memeModeQuoteRequestParam.toTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) memeModeQuoteRequestParam.amount) && Intrinsics.EZpvd((Object) this.slippage, (Object) memeModeQuoteRequestParam.slippage) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) memeModeQuoteRequestParam.userWalletAddress) && this.slippageType == memeModeQuoteRequestParam.slippageType && Intrinsics.EZpvd((Object) this.refCode, (Object) memeModeQuoteRequestParam.refCode) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) memeModeQuoteRequestParam.maxSlippage) && Intrinsics.EZpvd(this.dexIds, memeModeQuoteRequestParam.dexIds) && Intrinsics.EZpvd((Object) this.defiPlatformIds, (Object) memeModeQuoteRequestParam.defiPlatformIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformIds() {
        return this.defiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.fromTokenAddress.hashCode();
        int iHashCode3 = this.toTokenAddress.hashCode();
        int iHashCode4 = this.amount.hashCode();
        String str = this.slippage;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.userWalletAddress.hashCode();
        int iHashCode7 = Integer.hashCode(this.slippageType);
        String str2 = this.refCode;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxSlippage;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.dexIds;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        String str4 = this.defiPlatformIds;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSlippage(String str) {
        this.maxSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefCode(String str) {
        this.refCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(String str) {
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageType(int i) {
        this.slippageType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeModeQuoteRequestParam(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", amount=" + this.amount + ", slippage=" + this.slippage + ", userWalletAddress=" + this.userWalletAddress + ", slippageType=" + this.slippageType + ", refCode=" + this.refCode + ", maxSlippage=" + this.maxSlippage + ", dexIds=" + this.dexIds + ", defiPlatformIds=" + this.defiPlatformIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.slippage);
        parcel.writeString(this.userWalletAddress);
        parcel.writeInt(this.slippageType);
        parcel.writeString(this.refCode);
        parcel.writeString(this.maxSlippage);
        parcel.writeStringList(this.dexIds);
        parcel.writeString(this.defiPlatformIds);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeModeQuoteRequestParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeModeQuoteRequestParam> serializer() {
            return MemeModeQuoteRequestParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeModeQuoteRequestParam(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, List list, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (383 != (i & 383)) {
            PluginExceptionsKt.throwMissingFieldException(i, 383, MemeModeQuoteRequestParam$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.toTokenAddress = str3;
        this.amount = str4;
        this.slippage = str5;
        this.userWalletAddress = str6;
        this.slippageType = i2;
        if ((i & 128) == 0) {
            this.refCode = "";
        } else {
            this.refCode = str7;
        }
        this.maxSlippage = str8;
        if ((i & 512) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = list;
        }
        if ((i & 1024) == 0) {
            this.defiPlatformIds = null;
        } else {
            this.defiPlatformIds = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeModeQuoteRequestParam memeModeQuoteRequestParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, memeModeQuoteRequestParam.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, memeModeQuoteRequestParam.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, memeModeQuoteRequestParam.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, memeModeQuoteRequestParam.amount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, memeModeQuoteRequestParam.slippage);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, memeModeQuoteRequestParam.userWalletAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, memeModeQuoteRequestParam.slippageType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) memeModeQuoteRequestParam.refCode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, memeModeQuoteRequestParam.refCode);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, memeModeQuoteRequestParam.maxSlippage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || memeModeQuoteRequestParam.dexIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], memeModeQuoteRequestParam.dexIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && memeModeQuoteRequestParam.defiPlatformIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, memeModeQuoteRequestParam.defiPlatformIds);
    }

    public MemeModeQuoteRequestParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, int i, String str7, String str8, List<String> list, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.toTokenAddress = str3;
        this.amount = str4;
        this.slippage = str5;
        this.userWalletAddress = str6;
        this.slippageType = i;
        this.refCode = str7;
        this.maxSlippage = str8;
        this.dexIds = list;
        this.defiPlatformIds = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (r23v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:139) call: com.okinc.business.dexlogic.bean.MemeModeQuoteRequestParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ MemeModeQuoteRequestParam(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, List list, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, i, (i2 & 128) != 0 ? "" : str7, str8, (i2 & 512) != 0 ? null : list, (i2 & 1024) != 0 ? null : str9);
    }
}
