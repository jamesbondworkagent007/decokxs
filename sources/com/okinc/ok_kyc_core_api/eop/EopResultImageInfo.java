package com.okinc.ok_kyc_core_api.eop;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class EopResultImageInfo implements Parcelable {
    public static final int $stable = 0;
    private final String height;
    private final long imageId;
    private final int imageType;
    private final String name;
    private final String width;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EopResultImageInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<EopResultImageInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EopResultImageInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EopResultImageInfo(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EopResultImageInfo[] newArray(int i) {
            return new EopResultImageInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EopResultImageInfo copy$default(EopResultImageInfo eopResultImageInfo, long j, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = eopResultImageInfo.imageId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = eopResultImageInfo.imageType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = eopResultImageInfo.name;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = eopResultImageInfo.width;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = eopResultImageInfo.height;
        }
        return eopResultImageInfo.copy(j2, i3, str4, str5, str3);
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
    public final String component4() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EopResultImageInfo copy(long j, int i, @NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EopResultImageInfo(j, i, str, str2, str3);
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
        if (!(obj instanceof EopResultImageInfo)) {
            return false;
        }
        EopResultImageInfo eopResultImageInfo = (EopResultImageInfo) obj;
        return this.imageId == eopResultImageInfo.imageId && this.imageType == eopResultImageInfo.imageType && Intrinsics.EZpvd((Object) this.name, (Object) eopResultImageInfo.name) && Intrinsics.EZpvd((Object) this.width, (Object) eopResultImageInfo.width) && Intrinsics.EZpvd((Object) this.height, (Object) eopResultImageInfo.height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
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
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.imageId);
        int iHashCode2 = Integer.hashCode(this.imageType);
        int iHashCode3 = this.name.hashCode();
        String str = this.width;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.height;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EopResultImageInfo(imageId=" + this.imageId + ", imageType=" + this.imageType + ", name=" + this.name + ", width=" + this.width + ", height=" + this.height + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.imageId);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.name);
        parcel.writeString(this.width);
        parcel.writeString(this.height);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_api.eop.EopResultImageInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EopResultImageInfo> serializer() {
            return EopResultImageInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EopResultImageInfo(int i, long j, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EopResultImageInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.imageId = j;
        this.imageType = i2;
        this.name = str;
        if ((i & 8) == 0) {
            this.width = null;
        } else {
            this.width = str2;
        }
        if ((i & 16) == 0) {
            this.height = null;
        } else {
            this.height = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(EopResultImageInfo eopResultImageInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, eopResultImageInfo.imageId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, eopResultImageInfo.imageType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eopResultImageInfo.name);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eopResultImageInfo.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eopResultImageInfo.width);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && eopResultImageInfo.height == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, eopResultImageInfo.height);
    }

    public EopResultImageInfo(long j, int i, @NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageId = j;
        this.imageType = i;
        this.name = str;
        this.width = str2;
        this.height = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r10v0 long)
  (r12v0 int)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(long, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.ok_kyc_core_api.eop.EopResultImageInfo.<init>(long, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EopResultImageInfo(long j, int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3);
    }
}
