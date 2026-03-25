package com.okinc.planet.domain.remote.dto;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class RelatedAuthorInfo implements Parcelable {
    private final String authorId;
    private String followStatusV2;
    private final String nickname;
    private final String portrait;
    private final long uid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RelatedAuthorInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RelatedAuthorInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RelatedAuthorInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RelatedAuthorInfo(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RelatedAuthorInfo[] newArray(int i) {
            return new RelatedAuthorInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RelatedAuthorInfo copy$default(RelatedAuthorInfo relatedAuthorInfo, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = relatedAuthorInfo.uid;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = relatedAuthorInfo.nickname;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = relatedAuthorInfo.portrait;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = relatedAuthorInfo.authorId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = relatedAuthorInfo.followStatusV2;
        }
        return relatedAuthorInfo.copy(j2, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.followStatusV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedAuthorInfo copy(long j, String str, String str2, String str3, String str4) {
        return new RelatedAuthorInfo(j, str, str2, str3, str4);
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
        if (!(obj instanceof RelatedAuthorInfo)) {
            return false;
        }
        RelatedAuthorInfo relatedAuthorInfo = (RelatedAuthorInfo) obj;
        return this.uid == relatedAuthorInfo.uid && Intrinsics.EZpvd((Object) this.nickname, (Object) relatedAuthorInfo.nickname) && Intrinsics.EZpvd((Object) this.portrait, (Object) relatedAuthorInfo.portrait) && Intrinsics.EZpvd((Object) this.authorId, (Object) relatedAuthorInfo.authorId) && Intrinsics.EZpvd((Object) this.followStatusV2, (Object) relatedAuthorInfo.followStatusV2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowStatusV2() {
        return this.followStatusV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.uid);
        String str = this.nickname;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.portrait;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.authorId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.followStatusV2;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowStatusV2(String str) {
        this.followStatusV2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RelatedAuthorInfo(uid=" + this.uid + ", nickname=" + this.nickname + ", portrait=" + this.portrait + ", authorId=" + this.authorId + ", followStatusV2=" + this.followStatusV2 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.uid);
        parcel.writeString(this.nickname);
        parcel.writeString(this.portrait);
        parcel.writeString(this.authorId);
        parcel.writeString(this.followStatusV2);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.RelatedAuthorInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RelatedAuthorInfo> serializer() {
            return RelatedAuthorInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RelatedAuthorInfo(int i, long j, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, RelatedAuthorInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.uid = j;
        if ((i & 2) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str;
        }
        if ((i & 4) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str2;
        }
        if ((i & 8) == 0) {
            this.authorId = null;
        } else {
            this.authorId = str3;
        }
        if ((i & 16) == 0) {
            this.followStatusV2 = null;
        } else {
            this.followStatusV2 = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(RelatedAuthorInfo relatedAuthorInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, relatedAuthorInfo.uid);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || relatedAuthorInfo.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, relatedAuthorInfo.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || relatedAuthorInfo.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, relatedAuthorInfo.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || relatedAuthorInfo.authorId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, relatedAuthorInfo.authorId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && relatedAuthorInfo.followStatusV2 == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, relatedAuthorInfo.followStatusV2);
    }

    public RelatedAuthorInfo(long j, String str, String str2, String str3, String str4) {
        this.uid = j;
        this.nickname = str;
        this.portrait = str2;
        this.authorId = str3;
        this.followStatusV2 = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r10v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:63) call: com.okinc.planet.domain.remote.dto.RelatedAuthorInfo.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RelatedAuthorInfo(long j, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
