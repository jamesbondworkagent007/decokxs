package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class OssImageUrlResp implements Parcelable {
    private long imageId;
    private String imagePath;
    private int imageType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OssImageUrlResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<OssImageUrlResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OssImageUrlResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OssImageUrlResp(parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OssImageUrlResp[] newArray(int i) {
            return new OssImageUrlResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OssImageUrlResp() {
        this(0L, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OssImageUrlResp copy$default(OssImageUrlResp ossImageUrlResp, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = ossImageUrlResp.imageId;
        }
        if ((i2 & 2) != 0) {
            i = ossImageUrlResp.imageType;
        }
        if ((i2 & 4) != 0) {
            str = ossImageUrlResp.imagePath;
        }
        return ossImageUrlResp.copy(j, i, str);
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
        return this.imagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OssImageUrlResp copy(long j, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OssImageUrlResp(j, i, str);
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
        if (!(obj instanceof OssImageUrlResp)) {
            return false;
        }
        OssImageUrlResp ossImageUrlResp = (OssImageUrlResp) obj;
        return this.imageId == ossImageUrlResp.imageId && this.imageType == ossImageUrlResp.imageType && Intrinsics.EZpvd((Object) this.imagePath, (Object) ossImageUrlResp.imagePath);
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
        return (((Long.hashCode(this.imageId) * 31) + Integer.hashCode(this.imageType)) * 31) + this.imagePath.hashCode();
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
        return "OssImageUrlResp(imageId=" + this.imageId + ", imageType=" + this.imageType + ", imagePath=" + this.imagePath + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.imageId);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.imagePath);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.OssImageUrlResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OssImageUrlResp> serializer() {
            return OssImageUrlResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OssImageUrlResp(int i, long j, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.imageId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.imageType = 0;
        } else {
            this.imageType = i2;
        }
        if ((i & 4) == 0) {
            this.imagePath = "";
        } else {
            this.imagePath = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(OssImageUrlResp ossImageUrlResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ossImageUrlResp.imageId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, ossImageUrlResp.imageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ossImageUrlResp.imageType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, ossImageUrlResp.imageType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) ossImageUrlResp.imagePath, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, ossImageUrlResp.imagePath);
    }

    public OssImageUrlResp(long j, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageId = j;
        this.imageType = i;
        this.imagePath = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(long, int, java.lang.String):void (m)] (LINE:1172) call: com.okinc.ok_kyc_core.data.remote.networkmodel.OssImageUrlResp.<init>(long, int, java.lang.String):void type: THIS */
    public /* synthetic */ OssImageUrlResp(long j, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
    }
}
