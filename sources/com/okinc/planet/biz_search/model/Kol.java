package com.okinc.planet.biz_search.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class Kol implements Parcelable {
    public static final int $stable = 0;
    private final String bio;
    private final String followStatus;
    private final Integer followerCount;
    private final Long kolId;
    private final String nickName;
    private final String portrait;
    private final Source source;
    private final String translatedBio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Kol> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Kol> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Kol createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Kol(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Source.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Kol[] newArray(int i) {
            return new Kol[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.followStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.kolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Source component7() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.translatedBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Kol copy(String str, String str2, Integer num, Long l, String str3, String str4, Source source, String str5) {
        return new Kol(str, str2, num, l, str3, str4, source, str5);
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
        if (!(obj instanceof Kol)) {
            return false;
        }
        Kol kol = (Kol) obj;
        return Intrinsics.EZpvd((Object) this.bio, (Object) kol.bio) && Intrinsics.EZpvd((Object) this.followStatus, (Object) kol.followStatus) && Intrinsics.EZpvd(this.followerCount, kol.followerCount) && Intrinsics.EZpvd(this.kolId, kol.kolId) && Intrinsics.EZpvd((Object) this.nickName, (Object) kol.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) kol.portrait) && Intrinsics.EZpvd(this.source, kol.source) && Intrinsics.EZpvd((Object) this.translatedBio, (Object) kol.translatedBio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBio() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowStatus() {
        return this.followStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getKolId() {
        return this.kolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Source getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedBio() {
        return this.translatedBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.bio;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.followStatus;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.followerCount;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Long l = this.kolId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str3 = this.nickName;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.portrait;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Source source = this.source;
        int iHashCode7 = source == null ? 0 : source.hashCode();
        String str5 = this.translatedBio;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Kol(bio=" + this.bio + ", followStatus=" + this.followStatus + ", followerCount=" + this.followerCount + ", kolId=" + this.kolId + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", source=" + this.source + ", translatedBio=" + this.translatedBio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bio);
        parcel.writeString(this.followStatus);
        Integer num = this.followerCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.kolId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.nickName);
        parcel.writeString(this.portrait);
        Source source = this.source;
        if (source == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            source.writeToParcel(parcel, i);
        }
        parcel.writeString(this.translatedBio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_search.model.Kol.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Kol> serializer() {
            return Kol$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Kol(int i, String str, String str2, Integer num, Long l, String str3, String str4, Source source, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, Kol$$serializer.INSTANCE.getDescriptor());
        }
        this.bio = str;
        this.followStatus = str2;
        this.followerCount = num;
        this.kolId = l;
        this.nickName = str3;
        this.portrait = str4;
        this.source = source;
        this.translatedBio = str5;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(Kol kol, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, kol.bio);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, kol.followStatus);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, kol.followerCount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, kol.kolId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, kol.nickName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, kol.portrait);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Source$$serializer.INSTANCE, kol.source);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, kol.translatedBio);
    }

    public Kol(String str, String str2, Integer num, Long l, String str3, String str4, Source source, String str5) {
        this.bio = str;
        this.followStatus = str2;
        this.followerCount = num;
        this.kolId = l;
        this.nickName = str3;
        this.portrait = str4;
        this.source = source;
        this.translatedBio = str5;
    }
}
