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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OKWalletCloseTokenModel implements Parcelable {
    public static final int $stable = 0;
    private final String contractAddress;
    private final long generalChainId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OKWalletCloseTokenModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKWalletCloseTokenModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKWalletCloseTokenModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKWalletCloseTokenModel(parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKWalletCloseTokenModel[] newArray(int i) {
            return new OKWalletCloseTokenModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKWalletCloseTokenModel copy$default(OKWalletCloseTokenModel oKWalletCloseTokenModel, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = oKWalletCloseTokenModel.generalChainId;
        }
        if ((i & 2) != 0) {
            str = oKWalletCloseTokenModel.contractAddress;
        }
        return oKWalletCloseTokenModel.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKWalletCloseTokenModel copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKWalletCloseTokenModel(j, str);
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
        if (!(obj instanceof OKWalletCloseTokenModel)) {
            return false;
        }
        OKWalletCloseTokenModel oKWalletCloseTokenModel = (OKWalletCloseTokenModel) obj;
        return this.generalChainId == oKWalletCloseTokenModel.generalChainId && Intrinsics.EZpvd((Object) this.contractAddress, (Object) oKWalletCloseTokenModel.contractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGeneralChainId() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.generalChainId) * 31) + this.contractAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKWalletCloseTokenModel(generalChainId=" + this.generalChainId + ", contractAddress=" + this.contractAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.generalChainId);
        parcel.writeString(this.contractAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.OKWalletCloseTokenModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKWalletCloseTokenModel> serializer() {
            return OKWalletCloseTokenModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKWalletCloseTokenModel(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OKWalletCloseTokenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.generalChainId = j;
        this.contractAddress = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(OKWalletCloseTokenModel oKWalletCloseTokenModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, oKWalletCloseTokenModel.generalChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, oKWalletCloseTokenModel.contractAddress);
    }

    public OKWalletCloseTokenModel(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.generalChainId = j;
        this.contractAddress = str;
    }
}
