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
public final class BTCTooManyTransactionReq implements Parcelable {
    private String address;
    private long coinId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BTCTooManyTransactionReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BTCTooManyTransactionReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BTCTooManyTransactionReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BTCTooManyTransactionReq(parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BTCTooManyTransactionReq[] newArray(int i) {
            return new BTCTooManyTransactionReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BTCTooManyTransactionReq copy$default(BTCTooManyTransactionReq bTCTooManyTransactionReq, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bTCTooManyTransactionReq.address;
        }
        if ((i & 2) != 0) {
            j = bTCTooManyTransactionReq.coinId;
        }
        return bTCTooManyTransactionReq.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCTooManyTransactionReq copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BTCTooManyTransactionReq(str, j);
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
        if (!(obj instanceof BTCTooManyTransactionReq)) {
            return false;
        }
        BTCTooManyTransactionReq bTCTooManyTransactionReq = (BTCTooManyTransactionReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) bTCTooManyTransactionReq.address) && this.coinId == bTCTooManyTransactionReq.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.address.hashCode() * 31) + Long.hashCode(this.coinId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BTCTooManyTransactionReq(address=" + this.address + ", coinId=" + this.coinId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeLong(this.coinId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BTCTooManyTransactionReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BTCTooManyTransactionReq> serializer() {
            return BTCTooManyTransactionReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BTCTooManyTransactionReq(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BTCTooManyTransactionReq$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.coinId = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BTCTooManyTransactionReq bTCTooManyTransactionReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bTCTooManyTransactionReq.address);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, bTCTooManyTransactionReq.coinId);
    }

    public BTCTooManyTransactionReq(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.coinId = j;
    }
}
