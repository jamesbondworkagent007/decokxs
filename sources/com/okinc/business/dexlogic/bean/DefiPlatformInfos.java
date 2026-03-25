package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DefiPlatformInfos implements Parcelable {
    public static final int $stable = 0;
    private final String id;
    private final String platformName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefiPlatformInfos> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DefiPlatformInfos> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiPlatformInfos createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DefiPlatformInfos(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiPlatformInfos[] newArray(int i) {
            return new DefiPlatformInfos[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiPlatformInfos() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefiPlatformInfos copy$default(DefiPlatformInfos defiPlatformInfos, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defiPlatformInfos.id;
        }
        if ((i & 2) != 0) {
            str2 = defiPlatformInfos.platformName;
        }
        return defiPlatformInfos.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfos copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DefiPlatformInfos(str, str2);
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
        if (!(obj instanceof DefiPlatformInfos)) {
            return false;
        }
        DefiPlatformInfos defiPlatformInfos = (DefiPlatformInfos) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) defiPlatformInfos.id) && Intrinsics.EZpvd((Object) this.platformName, (Object) defiPlatformInfos.platformName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.id.hashCode() * 31) + this.platformName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefiPlatformInfos(id=" + this.id + ", platformName=" + this.platformName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.platformName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DefiPlatformInfos.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiPlatformInfos> serializer() {
            return DefiPlatformInfos$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefiPlatformInfos(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DefiPlatformInfos defiPlatformInfos, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) defiPlatformInfos.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, defiPlatformInfos.id);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) defiPlatformInfos.platformName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, defiPlatformInfos.platformName);
    }

    public DefiPlatformInfos(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.platformName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:166) call: com.okinc.business.dexlogic.bean.DefiPlatformInfos.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DefiPlatformInfos(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
