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
public final class UploadScanShareRequestBody implements Parcelable {
    public static final int $stable = 0;
    private final String cipherText;
    private final String mpcId;
    private final String pubKey;
    private final String uId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UploadScanShareRequestBody> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<UploadScanShareRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadScanShareRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UploadScanShareRequestBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadScanShareRequestBody[] newArray(int i) {
            return new UploadScanShareRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UploadScanShareRequestBody copy$default(UploadScanShareRequestBody uploadScanShareRequestBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadScanShareRequestBody.mpcId;
        }
        if ((i & 2) != 0) {
            str2 = uploadScanShareRequestBody.uId;
        }
        if ((i & 4) != 0) {
            str3 = uploadScanShareRequestBody.pubKey;
        }
        if ((i & 8) != 0) {
            str4 = uploadScanShareRequestBody.cipherText;
        }
        return uploadScanShareRequestBody.copy(str, str2, str3, str4);
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
    public final String component4() {
        return this.cipherText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadScanShareRequestBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new UploadScanShareRequestBody(str, str2, str3, str4);
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
        if (!(obj instanceof UploadScanShareRequestBody)) {
            return false;
        }
        UploadScanShareRequestBody uploadScanShareRequestBody = (UploadScanShareRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) uploadScanShareRequestBody.mpcId) && Intrinsics.EZpvd((Object) this.uId, (Object) uploadScanShareRequestBody.uId) && Intrinsics.EZpvd((Object) this.pubKey, (Object) uploadScanShareRequestBody.pubKey) && Intrinsics.EZpvd((Object) this.cipherText, (Object) uploadScanShareRequestBody.cipherText);
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
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUId() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.mpcId.hashCode() * 31) + this.uId.hashCode()) * 31) + this.pubKey.hashCode()) * 31) + this.cipherText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadScanShareRequestBody(mpcId=" + this.mpcId + ", uId=" + this.uId + ", pubKey=" + this.pubKey + ", cipherText=" + this.cipherText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
        parcel.writeString(this.uId);
        parcel.writeString(this.pubKey);
        parcel.writeString(this.cipherText);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UploadScanShareRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadScanShareRequestBody> serializer() {
            return UploadScanShareRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UploadScanShareRequestBody(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, UploadScanShareRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.uId = str2;
        this.pubKey = str3;
        this.cipherText = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UploadScanShareRequestBody uploadScanShareRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, uploadScanShareRequestBody.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, uploadScanShareRequestBody.uId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, uploadScanShareRequestBody.pubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, uploadScanShareRequestBody.cipherText);
    }

    public UploadScanShareRequestBody(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.mpcId = str;
        this.uId = str2;
        this.pubKey = str3;
        this.cipherText = str4;
    }
}
