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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class BtcNftInscribeData implements Parcelable {
    private String content;
    private String contentType;
    private String destinationAddress;
    private boolean isHex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BtcNftInscribeData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BtcNftInscribeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BtcNftInscribeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BtcNftInscribeData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BtcNftInscribeData[] newArray(int i) {
            return new BtcNftInscribeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BtcNftInscribeData copy$default(BtcNftInscribeData btcNftInscribeData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = btcNftInscribeData.contentType;
        }
        if ((i & 2) != 0) {
            str2 = btcNftInscribeData.content;
        }
        if ((i & 4) != 0) {
            str3 = btcNftInscribeData.destinationAddress;
        }
        if ((i & 8) != 0) {
            z = btcNftInscribeData.isHex;
        }
        return btcNftInscribeData.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.destinationAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcNftInscribeData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BtcNftInscribeData(str, str2, str3, z);
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
        if (!(obj instanceof BtcNftInscribeData)) {
            return false;
        }
        BtcNftInscribeData btcNftInscribeData = (BtcNftInscribeData) obj;
        return Intrinsics.EZpvd((Object) this.contentType, (Object) btcNftInscribeData.contentType) && Intrinsics.EZpvd((Object) this.content, (Object) btcNftInscribeData.content) && Intrinsics.EZpvd((Object) this.destinationAddress, (Object) btcNftInscribeData.destinationAddress) && this.isHex == btcNftInscribeData.isHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDestinationAddress() {
        return this.destinationAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.contentType.hashCode() * 31) + this.content.hashCode()) * 31) + this.destinationAddress.hashCode()) * 31) + Boolean.hashCode(this.isHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHex() {
        return this.isHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDestinationAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.destinationAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHex(boolean z) {
        this.isHex = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BtcNftInscribeData(contentType=" + this.contentType + ", content=" + this.content + ", destinationAddress=" + this.destinationAddress + ", isHex=" + this.isHex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contentType);
        parcel.writeString(this.content);
        parcel.writeString(this.destinationAddress);
        parcel.writeInt(this.isHex ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.BtcNftInscribeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BtcNftInscribeData> serializer() {
            return BtcNftInscribeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BtcNftInscribeData(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BtcNftInscribeData$$serializer.INSTANCE.getDescriptor());
        }
        this.contentType = str;
        this.content = str2;
        this.destinationAddress = str3;
        this.isHex = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BtcNftInscribeData btcNftInscribeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, btcNftInscribeData.contentType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, btcNftInscribeData.content);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, btcNftInscribeData.destinationAddress);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, btcNftInscribeData.isHex);
    }

    public BtcNftInscribeData(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.contentType = str;
        this.content = str2;
        this.destinationAddress = str3;
        this.isHex = z;
    }
}
