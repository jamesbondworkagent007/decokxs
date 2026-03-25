package com.okinc.business.defi.biz.net.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Web3LoginReq implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final String address;
    private final long chainIndex;
    private final String publicKey;
    private final int signType;
    private final String signature;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Web3LoginReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Web3LoginReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3LoginReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Web3LoginReq(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3LoginReq[] newArray(int i) {
            return new Web3LoginReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Web3LoginReq copy$default(Web3LoginReq web3LoginReq, String str, long j, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = web3LoginReq.accountId;
        }
        if ((i2 & 2) != 0) {
            j = web3LoginReq.chainIndex;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str2 = web3LoginReq.address;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = web3LoginReq.publicKey;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            i = web3LoginReq.signType;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str4 = web3LoginReq.signature;
        }
        return web3LoginReq.copy(str, j2, str5, str6, i3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3LoginReq copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new Web3LoginReq(str, j, str2, str3, i, str4);
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
        if (!(obj instanceof Web3LoginReq)) {
            return false;
        }
        Web3LoginReq web3LoginReq = (Web3LoginReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) web3LoginReq.accountId) && this.chainIndex == web3LoginReq.chainIndex && Intrinsics.EZpvd((Object) this.address, (Object) web3LoginReq.address) && Intrinsics.EZpvd((Object) this.publicKey, (Object) web3LoginReq.publicKey) && this.signType == web3LoginReq.signType && Intrinsics.EZpvd((Object) this.signature, (Object) web3LoginReq.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.accountId.hashCode() * 31) + Long.hashCode(this.chainIndex)) * 31) + this.address.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + Integer.hashCode(this.signType)) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3LoginReq(accountId=" + this.accountId + ", chainIndex=" + this.chainIndex + ", address=" + this.address + ", publicKey=" + this.publicKey + ", signType=" + this.signType + ", signature=" + this.signature + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeLong(this.chainIndex);
        parcel.writeString(this.address);
        parcel.writeString(this.publicKey);
        parcel.writeInt(this.signType);
        parcel.writeString(this.signature);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.Web3LoginReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Web3LoginReq> serializer() {
            return Web3LoginReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Web3LoginReq(int i, String str, long j, String str2, String str3, int i2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, Web3LoginReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.chainIndex = j;
        this.address = str2;
        this.publicKey = str3;
        this.signType = i2;
        this.signature = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Web3LoginReq web3LoginReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, web3LoginReq.accountId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, web3LoginReq.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, web3LoginReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, web3LoginReq.publicKey);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, web3LoginReq.signType);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, web3LoginReq.signature);
    }

    public Web3LoginReq(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountId = str;
        this.chainIndex = j;
        this.address = str2;
        this.publicKey = str3;
        this.signType = i;
        this.signature = str4;
    }
}
