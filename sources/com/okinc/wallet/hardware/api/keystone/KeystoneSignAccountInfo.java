package com.okinc.wallet.hardware.api.keystone;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class KeystoneSignAccountInfo implements Parcelable {
    public static final int $stable = 0;
    private final String addressPath;
    private final long chainId;
    private final String mfp;
    private final String psbt;
    private final String requestId;
    private final KeystoneEvmSignType signType;
    private final KeystoneTokenInfo tokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KeystoneSignAccountInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType", KeystoneEvmSignType.values()), null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<KeystoneSignAccountInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneSignAccountInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KeystoneSignAccountInfo(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : KeystoneEvmSignType.valueOf(parcel.readString()), parcel.readInt() != 0 ? KeystoneTokenInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneSignAccountInfo[] newArray(int i) {
            return new KeystoneSignAccountInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.addressPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.psbt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneEvmSignType component6() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneTokenInfo component7() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSignAccountInfo copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, String str4, KeystoneEvmSignType keystoneEvmSignType, KeystoneTokenInfo keystoneTokenInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new KeystoneSignAccountInfo(str, j, str2, str3, str4, keystoneEvmSignType, keystoneTokenInfo);
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
        if (!(obj instanceof KeystoneSignAccountInfo)) {
            return false;
        }
        KeystoneSignAccountInfo keystoneSignAccountInfo = (KeystoneSignAccountInfo) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) keystoneSignAccountInfo.requestId) && this.chainId == keystoneSignAccountInfo.chainId && Intrinsics.EZpvd((Object) this.addressPath, (Object) keystoneSignAccountInfo.addressPath) && Intrinsics.EZpvd((Object) this.mfp, (Object) keystoneSignAccountInfo.mfp) && Intrinsics.EZpvd((Object) this.psbt, (Object) keystoneSignAccountInfo.psbt) && this.signType == keystoneSignAccountInfo.signType && Intrinsics.EZpvd(this.tokenInfo, keystoneSignAccountInfo.tokenInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressPath() {
        return this.addressPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMfp() {
        return this.mfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbt() {
        return this.psbt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneEvmSignType getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneTokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.requestId.hashCode();
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = this.addressPath.hashCode();
        int iHashCode4 = this.mfp.hashCode();
        String str = this.psbt;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        KeystoneEvmSignType keystoneEvmSignType = this.signType;
        int iHashCode6 = keystoneEvmSignType == null ? 0 : keystoneEvmSignType.hashCode();
        KeystoneTokenInfo keystoneTokenInfo = this.tokenInfo;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (keystoneTokenInfo != null ? keystoneTokenInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystoneSignAccountInfo(requestId=" + this.requestId + ", chainId=" + this.chainId + ", addressPath=" + this.addressPath + ", mfp=" + this.mfp + ", psbt=" + this.psbt + ", signType=" + this.signType + ", tokenInfo=" + this.tokenInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.requestId);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.addressPath);
        parcel.writeString(this.mfp);
        parcel.writeString(this.psbt);
        KeystoneEvmSignType keystoneEvmSignType = this.signType;
        if (keystoneEvmSignType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(keystoneEvmSignType.name());
        }
        KeystoneTokenInfo keystoneTokenInfo = this.tokenInfo;
        if (keystoneTokenInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            keystoneTokenInfo.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.keystone.KeystoneSignAccountInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KeystoneSignAccountInfo> serializer() {
            return KeystoneSignAccountInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeystoneSignAccountInfo(int i, String str, long j, String str2, String str3, String str4, KeystoneEvmSignType keystoneEvmSignType, KeystoneTokenInfo keystoneTokenInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, KeystoneSignAccountInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.requestId = str;
        this.chainId = j;
        this.addressPath = str2;
        this.mfp = str3;
        if ((i & 16) == 0) {
            this.psbt = null;
        } else {
            this.psbt = str4;
        }
        if ((i & 32) == 0) {
            this.signType = null;
        } else {
            this.signType = keystoneEvmSignType;
        }
        if ((i & 64) == 0) {
            this.tokenInfo = null;
        } else {
            this.tokenInfo = keystoneTokenInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(KeystoneSignAccountInfo keystoneSignAccountInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, keystoneSignAccountInfo.requestId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, keystoneSignAccountInfo.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, keystoneSignAccountInfo.addressPath);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, keystoneSignAccountInfo.mfp);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || keystoneSignAccountInfo.psbt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, keystoneSignAccountInfo.psbt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || keystoneSignAccountInfo.signType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], keystoneSignAccountInfo.signType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && keystoneSignAccountInfo.tokenInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, KeystoneTokenInfo$$serializer.INSTANCE, keystoneSignAccountInfo.tokenInfo);
    }

    public KeystoneSignAccountInfo(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, String str4, KeystoneEvmSignType keystoneEvmSignType, KeystoneTokenInfo keystoneTokenInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.chainId = j;
        this.addressPath = str2;
        this.mfp = str3;
        this.psbt = str4;
        this.signType = keystoneEvmSignType;
        this.tokenInfo = keystoneTokenInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 long)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType) : (r18v0 com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType))
  (wrap:com.okinc.wallet.hardware.api.keystone.KeystoneTokenInfo:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.keystone.KeystoneTokenInfo) : (r19v0 com.okinc.wallet.hardware.api.keystone.KeystoneTokenInfo))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType, com.okinc.wallet.hardware.api.keystone.KeystoneTokenInfo):void (m)] (LINE:77) call: com.okinc.wallet.hardware.api.keystone.KeystoneSignAccountInfo.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType, com.okinc.wallet.hardware.api.keystone.KeystoneTokenInfo):void type: THIS */
    public /* synthetic */ KeystoneSignAccountInfo(String str, long j, String str2, String str3, String str4, KeystoneEvmSignType keystoneEvmSignType, KeystoneTokenInfo keystoneTokenInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : keystoneEvmSignType, (i & 64) != 0 ? null : keystoneTokenInfo);
    }
}
