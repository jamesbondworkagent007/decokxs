package com.okinc.planet.domain.remote.dto;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class FileUploadResult implements Parcelable {
    private final int fileType;
    private long id;
    private String imagePath;
    private int imageType;
    private String originalName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FileUploadResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FileUploadResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileUploadResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FileUploadResult(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileUploadResult[] newArray(int i) {
            return new FileUploadResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FileUploadResult copy$default(FileUploadResult fileUploadResult, long j, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = fileUploadResult.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = fileUploadResult.imageType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str = fileUploadResult.originalName;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = fileUploadResult.imagePath;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            i2 = fileUploadResult.fileType;
        }
        return fileUploadResult.copy(j2, i4, str3, str4, i2);
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
    public final String component4() {
        return this.imagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.fileType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileUploadResult copy(long j, int i, @NotNull String str, @NotNull String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FileUploadResult(j, i, str, str2, i2);
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
        if (!(obj instanceof FileUploadResult)) {
            return false;
        }
        FileUploadResult fileUploadResult = (FileUploadResult) obj;
        return this.id == fileUploadResult.id && this.imageType == fileUploadResult.imageType && Intrinsics.EZpvd((Object) this.originalName, (Object) fileUploadResult.originalName) && Intrinsics.EZpvd((Object) this.imagePath, (Object) fileUploadResult.imagePath) && this.fileType == fileUploadResult.fileType;
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
    public final String getImagePath() {
        return this.imagePath;
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
    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.imageType)) * 31) + this.originalName.hashCode()) * 31) + this.imagePath.hashCode()) * 31) + Integer.hashCode(this.fileType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImagePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imagePath = str;
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
        return "FileUploadResult(id=" + this.id + ", imageType=" + this.imageType + ", originalName=" + this.originalName + ", imagePath=" + this.imagePath + ", fileType=" + this.fileType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.originalName);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.fileType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.FileUploadResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FileUploadResult> serializer() {
            return FileUploadResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FileUploadResult(int i, long j, int i2, String str, String str2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, FileUploadResult$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.imageType = i2;
        this.originalName = str;
        this.imagePath = str2;
        this.fileType = i3;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(FileUploadResult fileUploadResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, fileUploadResult.id);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, fileUploadResult.imageType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, fileUploadResult.originalName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, fileUploadResult.imagePath);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, fileUploadResult.fileType);
    }

    public FileUploadResult(long j, int i, @NotNull String str, @NotNull String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.imageType = i;
        this.originalName = str;
        this.imagePath = str2;
        this.fileType = i2;
    }
}
