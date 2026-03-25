package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SingleFileUploadResultReq implements Parcelable {
    private final int fileType;
    private long id;
    private int imageType;
    private String originalName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleFileUploadResultReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<SingleFileUploadResultReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleFileUploadResultReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SingleFileUploadResultReq(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleFileUploadResultReq[] newArray(int i) {
            return new SingleFileUploadResultReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SingleFileUploadResultReq copy$default(SingleFileUploadResultReq singleFileUploadResultReq, long j, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = singleFileUploadResultReq.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = singleFileUploadResultReq.imageType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str = singleFileUploadResultReq.originalName;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            i2 = singleFileUploadResultReq.fileType;
        }
        return singleFileUploadResultReq.copy(j2, i4, str2, i2);
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
    public final SingleFileUploadResultReq copy(long j, int i, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SingleFileUploadResultReq(j, i, str, i2);
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
        if (!(obj instanceof SingleFileUploadResultReq)) {
            return false;
        }
        SingleFileUploadResultReq singleFileUploadResultReq = (SingleFileUploadResultReq) obj;
        return this.id == singleFileUploadResultReq.id && this.imageType == singleFileUploadResultReq.imageType && Intrinsics.EZpvd((Object) this.originalName, (Object) singleFileUploadResultReq.originalName) && this.fileType == singleFileUploadResultReq.fileType;
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
    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.imageType)) * 31) + this.originalName.hashCode()) * 31) + Integer.hashCode(this.fileType);
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
        return "SingleFileUploadResultReq(id=" + this.id + ", imageType=" + this.imageType + ", originalName=" + this.originalName + ", fileType=" + this.fileType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.originalName);
        parcel.writeInt(this.fileType);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SingleFileUploadResultReq> serializer() {
            return SingleFileUploadResultReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SingleFileUploadResultReq(int i, long j, int i2, String str, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, SingleFileUploadResultReq$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.imageType = i2;
        this.originalName = str;
        this.fileType = i3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SingleFileUploadResultReq singleFileUploadResultReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, singleFileUploadResultReq.id);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, singleFileUploadResultReq.imageType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, singleFileUploadResultReq.originalName);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, singleFileUploadResultReq.fileType);
    }

    public SingleFileUploadResultReq(long j, int i, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = j;
        this.imageType = i;
        this.originalName = str;
        this.fileType = i2;
    }
}
