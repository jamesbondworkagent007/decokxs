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
public final class OfflineAssetDetailReq implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final long coinId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OfflineAssetDetailReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OfflineAssetDetailReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfflineAssetDetailReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OfflineAssetDetailReq(parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfflineAssetDetailReq[] newArray(int i) {
            return new OfflineAssetDetailReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OfflineAssetDetailReq copy$default(OfflineAssetDetailReq offlineAssetDetailReq, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = offlineAssetDetailReq.coinId;
        }
        if ((i & 2) != 0) {
            str = offlineAssetDetailReq.address;
        }
        return offlineAssetDetailReq.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineAssetDetailReq copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OfflineAssetDetailReq(j, str);
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
        if (!(obj instanceof OfflineAssetDetailReq)) {
            return false;
        }
        OfflineAssetDetailReq offlineAssetDetailReq = (OfflineAssetDetailReq) obj;
        return this.coinId == offlineAssetDetailReq.coinId && Intrinsics.EZpvd((Object) this.address, (Object) offlineAssetDetailReq.address);
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
        return (Long.hashCode(this.coinId) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OfflineAssetDetailReq(coinId=" + this.coinId + ", address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeString(this.address);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.OfflineAssetDetailReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OfflineAssetDetailReq> serializer() {
            return OfflineAssetDetailReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OfflineAssetDetailReq(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OfflineAssetDetailReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.address = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(OfflineAssetDetailReq offlineAssetDetailReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, offlineAssetDetailReq.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, offlineAssetDetailReq.address);
    }

    public OfflineAssetDetailReq(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = j;
        this.address = str;
    }
}
