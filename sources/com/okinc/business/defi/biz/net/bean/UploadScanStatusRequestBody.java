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
public final class UploadScanStatusRequestBody implements Parcelable {
    public static final int $stable = 0;
    private final String mpcId;
    private final String pubKey;
    private final int status;
    private final String uId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UploadScanStatusRequestBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UploadScanStatusRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadScanStatusRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UploadScanStatusRequestBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadScanStatusRequestBody[] newArray(int i) {
            return new UploadScanStatusRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UploadScanStatusRequestBody copy$default(UploadScanStatusRequestBody uploadScanStatusRequestBody, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uploadScanStatusRequestBody.mpcId;
        }
        if ((i2 & 2) != 0) {
            str2 = uploadScanStatusRequestBody.uId;
        }
        if ((i2 & 4) != 0) {
            str3 = uploadScanStatusRequestBody.pubKey;
        }
        if ((i2 & 8) != 0) {
            i = uploadScanStatusRequestBody.status;
        }
        return uploadScanStatusRequestBody.copy(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadScanStatusRequestBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UploadScanStatusRequestBody(str, str2, str3, i);
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
        if (!(obj instanceof UploadScanStatusRequestBody)) {
            return false;
        }
        UploadScanStatusRequestBody uploadScanStatusRequestBody = (UploadScanStatusRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) uploadScanStatusRequestBody.mpcId) && Intrinsics.EZpvd((Object) this.uId, (Object) uploadScanStatusRequestBody.uId) && Intrinsics.EZpvd((Object) this.pubKey, (Object) uploadScanStatusRequestBody.pubKey) && this.status == uploadScanStatusRequestBody.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUId() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.mpcId.hashCode() * 31) + this.uId.hashCode()) * 31) + this.pubKey.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadScanStatusRequestBody(mpcId=" + this.mpcId + ", uId=" + this.uId + ", pubKey=" + this.pubKey + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
        parcel.writeString(this.uId);
        parcel.writeString(this.pubKey);
        parcel.writeInt(this.status);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UploadScanStatusRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadScanStatusRequestBody> serializer() {
            return UploadScanStatusRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UploadScanStatusRequestBody(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, UploadScanStatusRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.uId = str2;
        this.pubKey = str3;
        this.status = i2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UploadScanStatusRequestBody uploadScanStatusRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, uploadScanStatusRequestBody.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, uploadScanStatusRequestBody.uId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, uploadScanStatusRequestBody.pubKey);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, uploadScanStatusRequestBody.status);
    }

    public UploadScanStatusRequestBody(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.mpcId = str;
        this.uId = str2;
        this.pubKey = str3;
        this.status = i;
    }
}
