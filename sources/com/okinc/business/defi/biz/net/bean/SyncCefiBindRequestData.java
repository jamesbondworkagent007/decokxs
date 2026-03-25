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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SyncCefiBindRequestData implements Parcelable {
    private String address;
    private String chainId;
    private String requestId;
    private String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SyncCefiBindRequestData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SyncCefiBindRequestData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncCefiBindRequestData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SyncCefiBindRequestData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncCefiBindRequestData[] newArray(int i) {
            return new SyncCefiBindRequestData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SyncCefiBindRequestData copy$default(SyncCefiBindRequestData syncCefiBindRequestData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncCefiBindRequestData.chainId;
        }
        if ((i & 2) != 0) {
            str2 = syncCefiBindRequestData.address;
        }
        if ((i & 4) != 0) {
            str3 = syncCefiBindRequestData.status;
        }
        if ((i & 8) != 0) {
            str4 = syncCefiBindRequestData.requestId;
        }
        return syncCefiBindRequestData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncCefiBindRequestData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SyncCefiBindRequestData(str, str2, str3, str4);
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
        if (!(obj instanceof SyncCefiBindRequestData)) {
            return false;
        }
        SyncCefiBindRequestData syncCefiBindRequestData = (SyncCefiBindRequestData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) syncCefiBindRequestData.chainId) && Intrinsics.EZpvd((Object) this.address, (Object) syncCefiBindRequestData.address) && Intrinsics.EZpvd((Object) this.status, (Object) syncCefiBindRequestData.status) && Intrinsics.EZpvd((Object) this.requestId, (Object) syncCefiBindRequestData.requestId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.chainId.hashCode() * 31) + this.address.hashCode()) * 31) + this.status.hashCode()) * 31) + this.requestId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncCefiBindRequestData(chainId=" + this.chainId + ", address=" + this.address + ", status=" + this.status + ", requestId=" + this.requestId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.address);
        parcel.writeString(this.status);
        parcel.writeString(this.requestId);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SyncCefiBindRequestData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncCefiBindRequestData> serializer() {
            return SyncCefiBindRequestData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncCefiBindRequestData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, SyncCefiBindRequestData$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.address = str2;
        this.status = str3;
        this.requestId = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncCefiBindRequestData syncCefiBindRequestData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, syncCefiBindRequestData.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, syncCefiBindRequestData.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, syncCefiBindRequestData.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, syncCefiBindRequestData.requestId);
    }

    public SyncCefiBindRequestData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = str;
        this.address = str2;
        this.status = str3;
        this.requestId = str4;
    }
}
