package com.okinc.planet.biz_userprofile.data;

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
import o.C46417tTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetProfileCountryInfoDto implements Parcelable {
    public static final int $stable = 0;
    public final String countryId;
    public final String countryName;
    public final boolean isRestricted;
    public final long restrictionStartTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlanetProfileCountryInfoDto> CREATOR = new Creator();
    public static final PlanetProfileCountryInfoDto Empty = new PlanetProfileCountryInfoDto("", "", 0, false);

    public static final class Creator implements Parcelable.Creator<PlanetProfileCountryInfoDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetProfileCountryInfoDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetProfileCountryInfoDto(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetProfileCountryInfoDto[] newArray(int i) {
            return new PlanetProfileCountryInfoDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetProfileCountryInfoDto copy$default(PlanetProfileCountryInfoDto planetProfileCountryInfoDto, String str, String str2, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planetProfileCountryInfoDto.countryId;
        }
        if ((i & 2) != 0) {
            str2 = planetProfileCountryInfoDto.countryName;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = planetProfileCountryInfoDto.restrictionStartTime;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = planetProfileCountryInfoDto.isRestricted;
        }
        return planetProfileCountryInfoDto.KWHzl(str, str3, j2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.countryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetProfileCountryInfoDto KWHzl(@NotNull String str, @NotNull String str2, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PlanetProfileCountryInfoDto(str, str2, j, z);
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
        if (!(obj instanceof PlanetProfileCountryInfoDto)) {
            return false;
        }
        PlanetProfileCountryInfoDto planetProfileCountryInfoDto = (PlanetProfileCountryInfoDto) obj;
        return Intrinsics.EZpvd((Object) this.countryId, (Object) planetProfileCountryInfoDto.countryId) && Intrinsics.EZpvd((Object) this.countryName, (Object) planetProfileCountryInfoDto.countryName) && this.restrictionStartTime == planetProfileCountryInfoDto.restrictionStartTime && this.isRestricted == planetProfileCountryInfoDto.isRestricted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.countryId.hashCode() * 31) + this.countryName.hashCode()) * 31) + Long.hashCode(this.restrictionStartTime)) * 31) + Boolean.hashCode(this.isRestricted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetProfileCountryInfoDto(countryId=" + this.countryId + ", countryName=" + this.countryName + ", restrictionStartTime=" + this.restrictionStartTime + ", isRestricted=" + this.isRestricted + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.countryId);
        parcel.writeString(this.countryName);
        parcel.writeLong(this.restrictionStartTime);
        parcel.writeInt(this.isRestricted ? 1 : 0);
    }

    public /* synthetic */ PlanetProfileCountryInfoDto(int i, String str, String str2, long j, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PlanetProfileCountryInfoDto$$serializer.INSTANCE.getDescriptor());
        }
        this.countryId = str;
        this.countryName = str2;
        this.restrictionStartTime = j;
        this.isRestricted = z;
    }

    public static final /* synthetic */ void EZpvd(PlanetProfileCountryInfoDto planetProfileCountryInfoDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, planetProfileCountryInfoDto.countryId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, planetProfileCountryInfoDto.countryName);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, C46417tTo.KWHzl, Long.valueOf(planetProfileCountryInfoDto.restrictionStartTime));
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, planetProfileCountryInfoDto.isRestricted);
    }

    public PlanetProfileCountryInfoDto(@NotNull String str, @NotNull String str2, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.countryId = str;
        this.countryName = str2;
        this.restrictionStartTime = j;
        this.isRestricted = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlanetProfileCountryInfoDto> serializer() {
            return PlanetProfileCountryInfoDto$$serializer.INSTANCE;
        }

        public final PlanetProfileCountryInfoDto EZpvd() {
            return PlanetProfileCountryInfoDto.Empty;
        }
    }
}
