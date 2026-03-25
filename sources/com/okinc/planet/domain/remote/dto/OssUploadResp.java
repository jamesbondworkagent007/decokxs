package com.okinc.planet.domain.remote.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OssUploadResp implements Parcelable {
    private long imageId;
    private String imagePath;
    private int imageType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OssUploadResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OssUploadResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OssUploadResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OssUploadResp(parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OssUploadResp[] newArray(int i) {
            return new OssUploadResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OssUploadResp() {
        this(0L, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OssUploadResp copy$default(OssUploadResp ossUploadResp, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = ossUploadResp.imageId;
        }
        if ((i2 & 2) != 0) {
            str = ossUploadResp.imagePath;
        }
        if ((i2 & 4) != 0) {
            i = ossUploadResp.imageType;
        }
        return ossUploadResp.copy(j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.imagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OssUploadResp copy(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OssUploadResp(j, str, i);
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
        if (!(obj instanceof OssUploadResp)) {
            return false;
        }
        OssUploadResp ossUploadResp = (OssUploadResp) obj;
        return this.imageId == ossUploadResp.imageId && Intrinsics.EZpvd((Object) this.imagePath, (Object) ossUploadResp.imagePath) && this.imageType == ossUploadResp.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getImageId() {
        return this.imageId;
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
    public int hashCode() {
        return (((Long.hashCode(this.imageId) * 31) + this.imagePath.hashCode()) * 31) + Integer.hashCode(this.imageType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageId(long j) {
        this.imageId = j;
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
    public String toString() {
        return "OssUploadResp(imageId=" + this.imageId + ", imagePath=" + this.imagePath + ", imageType=" + this.imageType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.imageId);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.imageType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.OssUploadResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OssUploadResp> serializer() {
            return OssUploadResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OssUploadResp(int i, long j, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.imageId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.imagePath = "";
        } else {
            this.imagePath = str;
        }
        if ((i & 4) == 0) {
            this.imageType = 0;
        } else {
            this.imageType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(OssUploadResp ossUploadResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ossUploadResp.imageId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, ossUploadResp.imageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) ossUploadResp.imagePath, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, ossUploadResp.imagePath);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && ossUploadResp.imageType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, ossUploadResp.imageType);
    }

    public OssUploadResp(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageId = j;
        this.imagePath = str;
        this.imageType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(long, java.lang.String, int):void (m)] (LINE:11) call: com.okinc.planet.domain.remote.dto.OssUploadResp.<init>(long, java.lang.String, int):void type: THIS */
    public /* synthetic */ OssUploadResp(long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
