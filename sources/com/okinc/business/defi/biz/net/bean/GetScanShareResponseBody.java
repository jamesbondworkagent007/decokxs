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
public final class GetScanShareResponseBody implements Parcelable {
    public static final int $stable = 0;
    private final String cipherText;
    private final String mpcId;
    private final int status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetScanShareResponseBody> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<GetScanShareResponseBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetScanShareResponseBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GetScanShareResponseBody(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetScanShareResponseBody[] newArray(int i) {
            return new GetScanShareResponseBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetScanShareResponseBody copy$default(GetScanShareResponseBody getScanShareResponseBody, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getScanShareResponseBody.status;
        }
        if ((i2 & 2) != 0) {
            str = getScanShareResponseBody.cipherText;
        }
        if ((i2 & 4) != 0) {
            str2 = getScanShareResponseBody.mpcId;
        }
        return getScanShareResponseBody.copy(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cipherText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetScanShareResponseBody copy(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GetScanShareResponseBody(i, str, str2);
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
        if (!(obj instanceof GetScanShareResponseBody)) {
            return false;
        }
        GetScanShareResponseBody getScanShareResponseBody = (GetScanShareResponseBody) obj;
        return this.status == getScanShareResponseBody.status && Intrinsics.EZpvd((Object) this.cipherText, (Object) getScanShareResponseBody.cipherText) && Intrinsics.EZpvd((Object) this.mpcId, (Object) getScanShareResponseBody.mpcId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCipherText() {
        return this.cipherText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.cipherText.hashCode()) * 31) + this.mpcId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetScanShareResponseBody(status=" + this.status + ", cipherText=" + this.cipherText + ", mpcId=" + this.mpcId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.status);
        parcel.writeString(this.cipherText);
        parcel.writeString(this.mpcId);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.GetScanShareResponseBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetScanShareResponseBody> serializer() {
            return GetScanShareResponseBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetScanShareResponseBody(int i, int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GetScanShareResponseBody$$serializer.INSTANCE.getDescriptor());
        }
        this.status = i2;
        this.cipherText = str;
        this.mpcId = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(GetScanShareResponseBody getScanShareResponseBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, getScanShareResponseBody.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getScanShareResponseBody.cipherText);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, getScanShareResponseBody.mpcId);
    }

    public GetScanShareResponseBody(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.status = i;
        this.cipherText = str;
        this.mpcId = str2;
    }
}
