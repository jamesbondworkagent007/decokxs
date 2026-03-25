package com.okinc.liveness.eop.bean;

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
public final class ImageUploadRequestBody implements Parcelable {
    private final int fileType;
    private long id;
    private int imageType;
    private String originalName;
    private final String sessionId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageUploadRequestBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ImageUploadRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageUploadRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageUploadRequestBody(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageUploadRequestBody[] newArray(int i) {
            return new ImageUploadRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ImageUploadRequestBody copy$default(ImageUploadRequestBody imageUploadRequestBody, long j, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = imageUploadRequestBody.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = imageUploadRequestBody.imageType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str = imageUploadRequestBody.originalName;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            i2 = imageUploadRequestBody.fileType;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = imageUploadRequestBody.sessionId;
        }
        return imageUploadRequestBody.copy(j2, i4, str3, i5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.originalName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.fileType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUploadRequestBody copy(long j, int i, @NotNull String str, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ImageUploadRequestBody(j, i, str, i2, str2);
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
        if (!(obj instanceof ImageUploadRequestBody)) {
            return false;
        }
        ImageUploadRequestBody imageUploadRequestBody = (ImageUploadRequestBody) obj;
        return this.id == imageUploadRequestBody.id && this.imageType == imageUploadRequestBody.imageType && Intrinsics.EZpvd((Object) this.originalName, (Object) imageUploadRequestBody.originalName) && this.fileType == imageUploadRequestBody.fileType && Intrinsics.EZpvd((Object) this.sessionId, (Object) imageUploadRequestBody.sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFileType() {
        return this.fileType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImageType() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalName() {
        return this.originalName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.imageType)) * 31) + this.originalName.hashCode()) * 31) + Integer.hashCode(this.fileType)) * 31) + this.sessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageType(int i) {
        this.imageType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageUploadRequestBody(id=" + this.id + ", imageType=" + this.imageType + ", originalName=" + this.originalName + ", fileType=" + this.fileType + ", sessionId=" + this.sessionId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.originalName);
        parcel.writeInt(this.fileType);
        parcel.writeString(this.sessionId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.ImageUploadRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ImageUploadRequestBody> serializer() {
            return ImageUploadRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ImageUploadRequestBody(int i, long j, int i2, String str, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, ImageUploadRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.imageType = i2;
        this.originalName = str;
        this.fileType = i3;
        this.sessionId = str2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(ImageUploadRequestBody imageUploadRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, imageUploadRequestBody.id);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, imageUploadRequestBody.imageType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, imageUploadRequestBody.originalName);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, imageUploadRequestBody.fileType);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, imageUploadRequestBody.sessionId);
    }

    public ImageUploadRequestBody(long j, int i, @NotNull String str, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.imageType = i;
        this.originalName = str;
        this.fileType = i2;
        this.sessionId = str2;
    }
}
