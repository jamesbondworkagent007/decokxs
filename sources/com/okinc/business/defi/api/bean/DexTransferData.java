package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DexTransferData implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final String bridgeId;
    private final boolean isNativeToken;
    private final String minAmount;
    private final String thorSwapMemo;
    private final String tokenContractAddress;
    private final String transferToAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexTransferData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexTransferData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexTransferData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexTransferData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexTransferData[] newArray(int i) {
            return new DexTransferData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexTransferData copy$default(DexTransferData dexTransferData, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dexTransferData.isNativeToken;
        }
        if ((i & 2) != 0) {
            str = dexTransferData.tokenContractAddress;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = dexTransferData.amount;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = dexTransferData.transferToAddress;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = dexTransferData.minAmount;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = dexTransferData.thorSwapMemo;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = dexTransferData.bridgeId;
        }
        return dexTransferData.copy(z, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.transferToAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.thorSwapMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTransferData copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DexTransferData(z, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof DexTransferData)) {
            return false;
        }
        DexTransferData dexTransferData = (DexTransferData) obj;
        return this.isNativeToken == dexTransferData.isNativeToken && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexTransferData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) dexTransferData.amount) && Intrinsics.EZpvd((Object) this.transferToAddress, (Object) dexTransferData.transferToAddress) && Intrinsics.EZpvd((Object) this.minAmount, (Object) dexTransferData.minAmount) && Intrinsics.EZpvd((Object) this.thorSwapMemo, (Object) dexTransferData.thorSwapMemo) && Intrinsics.EZpvd((Object) this.bridgeId, (Object) dexTransferData.bridgeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThorSwapMemo() {
        return this.thorSwapMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferToAddress() {
        return this.transferToAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isNativeToken);
        int iHashCode2 = this.tokenContractAddress.hashCode();
        int iHashCode3 = this.amount.hashCode();
        int iHashCode4 = this.transferToAddress.hashCode();
        int iHashCode5 = this.minAmount.hashCode();
        String str = this.thorSwapMemo;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.bridgeId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTransferData(isNativeToken=" + this.isNativeToken + ", tokenContractAddress=" + this.tokenContractAddress + ", amount=" + this.amount + ", transferToAddress=" + this.transferToAddress + ", minAmount=" + this.minAmount + ", thorSwapMemo=" + this.thorSwapMemo + ", bridgeId=" + this.bridgeId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isNativeToken ? 1 : 0);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.transferToAddress);
        parcel.writeString(this.minAmount);
        parcel.writeString(this.thorSwapMemo);
        parcel.writeString(this.bridgeId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.DexTransferData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexTransferData> serializer() {
            return DexTransferData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexTransferData(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DexTransferData$$serializer.INSTANCE.getDescriptor());
        }
        this.isNativeToken = z;
        this.tokenContractAddress = str;
        this.amount = str2;
        if ((i & 8) == 0) {
            this.transferToAddress = "";
        } else {
            this.transferToAddress = str3;
        }
        if ((i & 16) == 0) {
            this.minAmount = "";
        } else {
            this.minAmount = str4;
        }
        if ((i & 32) == 0) {
            this.thorSwapMemo = null;
        } else {
            this.thorSwapMemo = str5;
        }
        if ((i & 64) == 0) {
            this.bridgeId = null;
        } else {
            this.bridgeId = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(DexTransferData dexTransferData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, dexTransferData.isNativeToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexTransferData.tokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexTransferData.amount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexTransferData.transferToAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexTransferData.transferToAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexTransferData.minAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexTransferData.minAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dexTransferData.thorSwapMemo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dexTransferData.thorSwapMemo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && dexTransferData.bridgeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dexTransferData.bridgeId);
    }

    public DexTransferData(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.isNativeToken = z;
        this.tokenContractAddress = str;
        this.amount = str2;
        this.transferToAddress = str3;
        this.minAmount = str4;
        this.thorSwapMemo = str5;
        this.bridgeId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r11v0 boolean)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:220) call: com.okinc.business.defi.api.bean.DexTransferData.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexTransferData(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
