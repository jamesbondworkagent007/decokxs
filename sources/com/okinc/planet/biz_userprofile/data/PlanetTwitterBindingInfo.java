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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PlanetTwitterBindingInfo implements Parcelable {
    public static final int $stable = 0;
    public final boolean syncEnabled;
    public final String twitterUsername;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlanetTwitterBindingInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<PlanetTwitterBindingInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetTwitterBindingInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetTwitterBindingInfo(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetTwitterBindingInfo[] newArray(int i) {
            return new PlanetTwitterBindingInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetTwitterBindingInfo() {
        this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetTwitterBindingInfo copy$default(PlanetTwitterBindingInfo planetTwitterBindingInfo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planetTwitterBindingInfo.twitterUsername;
        }
        if ((i & 2) != 0) {
            z = planetTwitterBindingInfo.syncEnabled;
        }
        return planetTwitterBindingInfo.KWHzl(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.twitterUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetTwitterBindingInfo KWHzl(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PlanetTwitterBindingInfo(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.syncEnabled;
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
        if (!(obj instanceof PlanetTwitterBindingInfo)) {
            return false;
        }
        PlanetTwitterBindingInfo planetTwitterBindingInfo = (PlanetTwitterBindingInfo) obj;
        return Intrinsics.EZpvd((Object) this.twitterUsername, (Object) planetTwitterBindingInfo.twitterUsername) && this.syncEnabled == planetTwitterBindingInfo.syncEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.twitterUsername.hashCode() * 31) + Boolean.hashCode(this.syncEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetTwitterBindingInfo(twitterUsername=" + this.twitterUsername + ", syncEnabled=" + this.syncEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.twitterUsername);
        parcel.writeInt(this.syncEnabled ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetTwitterBindingInfo> serializer() {
            return PlanetTwitterBindingInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetTwitterBindingInfo(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.twitterUsername = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.syncEnabled = false;
        } else {
            this.syncEnabled = z;
        }
    }

    public static final /* synthetic */ void copydefault(PlanetTwitterBindingInfo planetTwitterBindingInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) planetTwitterBindingInfo.twitterUsername, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, planetTwitterBindingInfo.twitterUsername);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || planetTwitterBindingInfo.syncEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, planetTwitterBindingInfo.syncEnabled);
        }
    }

    public PlanetTwitterBindingInfo(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.twitterUsername = str;
        this.syncEnabled = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:9) call: com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PlanetTwitterBindingInfo(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
