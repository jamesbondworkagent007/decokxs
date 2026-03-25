package com.okinc.liveness.eop.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class EFRResultReq implements Parcelable {
    public static final int $stable = 0;
    private final String image;
    private final String imageHash;
    private final String status;
    private final String thumbnail;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EFRResultReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EFRResultReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EFRResultReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EFRResultReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EFRResultReq[] newArray(int i) {
            return new EFRResultReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EFRResultReq() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EFRResultReq copy$default(EFRResultReq eFRResultReq, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eFRResultReq.image;
        }
        if ((i & 2) != 0) {
            str2 = eFRResultReq.thumbnail;
        }
        if ((i & 4) != 0) {
            str3 = eFRResultReq.imageHash;
        }
        if ((i & 8) != 0) {
            str4 = eFRResultReq.status;
        }
        return eFRResultReq.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imageHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EFRResultReq copy(String str, String str2, String str3, String str4) {
        return new EFRResultReq(str, str2, str3, str4);
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
        if (!(obj instanceof EFRResultReq)) {
            return false;
        }
        EFRResultReq eFRResultReq = (EFRResultReq) obj;
        return Intrinsics.EZpvd((Object) this.image, (Object) eFRResultReq.image) && Intrinsics.EZpvd((Object) this.thumbnail, (Object) eFRResultReq.thumbnail) && Intrinsics.EZpvd((Object) this.imageHash, (Object) eFRResultReq.imageHash) && Intrinsics.EZpvd((Object) this.status, (Object) eFRResultReq.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageHash() {
        return this.imageHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.image;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.thumbnail;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imageHash;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.status;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EFRResultReq(image=" + this.image + ", thumbnail=" + this.thumbnail + ", imageHash=" + this.imageHash + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.image);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.imageHash);
        parcel.writeString(this.status);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.EFRResultReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EFRResultReq> serializer() {
            return EFRResultReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EFRResultReq(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.image = null;
        } else {
            this.image = str;
        }
        if ((i & 2) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = str2;
        }
        if ((i & 4) == 0) {
            this.imageHash = null;
        } else {
            this.imageHash = str3;
        }
        if ((i & 8) == 0) {
            this.status = null;
        } else {
            this.status = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(EFRResultReq eFRResultReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eFRResultReq.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, eFRResultReq.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eFRResultReq.thumbnail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eFRResultReq.thumbnail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eFRResultReq.imageHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eFRResultReq.imageHash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && eFRResultReq.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eFRResultReq.status);
    }

    public EFRResultReq(String str, String str2, String str3, String str4) {
        this.image = str;
        this.thumbnail = str2;
        this.imageHash = str3;
        this.status = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.liveness.eop.bean.EFRResultReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EFRResultReq(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
