package com.okinc.planet.biz_userprofile.data;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetProfileSampleMember implements Parcelable {
    public static final int $stable = 0;
    public final String avatar;
    public final String userUid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlanetProfileSampleMember> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PlanetProfileSampleMember> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetProfileSampleMember createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetProfileSampleMember(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetProfileSampleMember[] newArray(int i) {
            return new PlanetProfileSampleMember[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetProfileSampleMember() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetProfileSampleMember copy$default(PlanetProfileSampleMember planetProfileSampleMember, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planetProfileSampleMember.userUid;
        }
        if ((i & 2) != 0) {
            str2 = planetProfileSampleMember.avatar;
        }
        return planetProfileSampleMember.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetProfileSampleMember copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PlanetProfileSampleMember(str, str2);
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
        if (!(obj instanceof PlanetProfileSampleMember)) {
            return false;
        }
        PlanetProfileSampleMember planetProfileSampleMember = (PlanetProfileSampleMember) obj;
        return Intrinsics.EZpvd((Object) this.userUid, (Object) planetProfileSampleMember.userUid) && Intrinsics.EZpvd((Object) this.avatar, (Object) planetProfileSampleMember.avatar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.userUid.hashCode() * 31) + this.avatar.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetProfileSampleMember(userUid=" + this.userUid + ", avatar=" + this.avatar + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userUid);
        parcel.writeString(this.avatar);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetProfileSampleMember.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetProfileSampleMember> serializer() {
            return PlanetProfileSampleMember$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetProfileSampleMember(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userUid = "";
        } else {
            this.userUid = str;
        }
        if ((i & 2) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
    }

    public static final /* synthetic */ void copydefault(PlanetProfileSampleMember planetProfileSampleMember, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) planetProfileSampleMember.userUid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, planetProfileSampleMember.userUid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) planetProfileSampleMember.avatar, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, planetProfileSampleMember.avatar);
    }

    public PlanetProfileSampleMember(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.userUid = str;
        this.avatar = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.planet.biz_userprofile.data.PlanetProfileSampleMember.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlanetProfileSampleMember(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
