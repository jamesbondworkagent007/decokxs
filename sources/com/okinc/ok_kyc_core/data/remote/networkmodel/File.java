package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_widget.UploadNew;
import com.okinc.ok_kyc_widget.UploadNew$SerializableUploadFileViewModel$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class File implements Parcelable {
    private final long imageId;
    private final int imageType;
    private UploadNew.SerializableUploadFileViewModel localUploadNewModel;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<File> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<File> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final File createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new File(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : UploadNew.SerializableUploadFileViewModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final File[] newArray(int i) {
            return new File[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ File copy$default(File file, long j, int i, String str, UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = file.imageId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = file.imageType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = file.name;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            serializableUploadFileViewModel = file.localUploadNewModel;
        }
        return file.copy(j2, i3, str2, serializableUploadFileViewModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadNew.SerializableUploadFileViewModel component4() {
        return this.localUploadNewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final File copy(long j, int i, @NotNull String str, UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel) {
        Intrinsics.checkNotNullParameter(str, "");
        return new File(j, i, str, serializableUploadFileViewModel);
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
        if (!(obj instanceof File)) {
            return false;
        }
        File file = (File) obj;
        return this.imageId == file.imageId && this.imageType == file.imageType && Intrinsics.EZpvd((Object) this.name, (Object) file.name) && Intrinsics.EZpvd(this.localUploadNewModel, file.localUploadNewModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getImageId() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImageType() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadNew.SerializableUploadFileViewModel getLocalUploadNewModel() {
        return this.localUploadNewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.imageId);
        int iHashCode2 = Integer.hashCode(this.imageType);
        int iHashCode3 = this.name.hashCode();
        UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel = this.localUploadNewModel;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (serializableUploadFileViewModel == null ? 0 : serializableUploadFileViewModel.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalUploadNewModel(UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel) {
        this.localUploadNewModel = serializableUploadFileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "File(imageId=" + this.imageId + ", imageType=" + this.imageType + ", name=" + this.name + ", localUploadNewModel=" + this.localUploadNewModel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.imageId);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.name);
        UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel = this.localUploadNewModel;
        if (serializableUploadFileViewModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serializableUploadFileViewModel.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.File.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<File> serializer() {
            return File$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ File(int i, long j, int i2, String str, UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, File$$serializer.INSTANCE.getDescriptor());
        }
        this.imageId = j;
        this.imageType = i2;
        this.name = str;
        if ((i & 8) == 0) {
            this.localUploadNewModel = null;
        } else {
            this.localUploadNewModel = serializableUploadFileViewModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(File file, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, file.imageId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, file.imageType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, file.name);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && file.localUploadNewModel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, UploadNew$SerializableUploadFileViewModel$$serializer.INSTANCE, file.localUploadNewModel);
    }

    public File(long j, int i, @NotNull String str, UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageId = j;
        this.imageType = i;
        this.name = str;
        this.localUploadNewModel = serializableUploadFileViewModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r7v0 long)
  (r9v0 int)
  (r10v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_widget.UploadNew$SerializableUploadFileViewModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_widget.UploadNew$SerializableUploadFileViewModel) : (r11v0 com.okinc.ok_kyc_widget.UploadNew$SerializableUploadFileViewModel))
 A[MD:(long, int, java.lang.String, com.okinc.ok_kyc_widget.UploadNew$SerializableUploadFileViewModel):void (m)] (LINE:1153) call: com.okinc.ok_kyc_core.data.remote.networkmodel.File.<init>(long, int, java.lang.String, com.okinc.ok_kyc_widget.UploadNew$SerializableUploadFileViewModel):void type: THIS */
    public /* synthetic */ File(long j, int i, String str, UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, (i2 & 8) != 0 ? null : serializableUploadFileViewModel);
    }
}
