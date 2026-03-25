package com.okinc.planet.biz_content.leaderboard.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TopOrbiter implements Parcelable {
    private final String authorId;
    private final String bio;
    private String followStatus;
    private Long followerCount;
    private boolean hasFollowedThisUser;
    private final String liveStatus;
    private final String nickName;
    private final String officialStatus;
    private final String portrait;
    private final String shareCode;
    private final String translatedBio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TopOrbiter> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TopOrbiter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopOrbiter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TopOrbiter(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopOrbiter[] newArray(int i) {
            return new TopOrbiter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopOrbiter() {
        this((String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.liveStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.shareCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.translatedBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.followStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.hasFollowedThisUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.officialStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopOrbiter copy(String str, Long l, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9) {
        return new TopOrbiter(str, l, str2, str3, str4, str5, str6, z, str7, str8, str9);
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
        if (!(obj instanceof TopOrbiter)) {
            return false;
        }
        TopOrbiter topOrbiter = (TopOrbiter) obj;
        return Intrinsics.EZpvd((Object) this.nickName, (Object) topOrbiter.nickName) && Intrinsics.EZpvd(this.followerCount, topOrbiter.followerCount) && Intrinsics.EZpvd((Object) this.bio, (Object) topOrbiter.bio) && Intrinsics.EZpvd((Object) this.translatedBio, (Object) topOrbiter.translatedBio) && Intrinsics.EZpvd((Object) this.portrait, (Object) topOrbiter.portrait) && Intrinsics.EZpvd((Object) this.authorId, (Object) topOrbiter.authorId) && Intrinsics.EZpvd((Object) this.followStatus, (Object) topOrbiter.followStatus) && this.hasFollowedThisUser == topOrbiter.hasFollowedThisUser && Intrinsics.EZpvd((Object) this.officialStatus, (Object) topOrbiter.officialStatus) && Intrinsics.EZpvd((Object) this.liveStatus, (Object) topOrbiter.liveStatus) && Intrinsics.EZpvd((Object) this.shareCode, (Object) topOrbiter.shareCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorId() {
        return this.authorId;
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
    public final Long getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasFollowedThisUser() {
        return this.hasFollowedThisUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiveStatus() {
        return this.liveStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialStatus() {
        return this.officialStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedBio() {
        return this.translatedBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nickName;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.followerCount;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.bio;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.translatedBio;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.portrait;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.authorId;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.followStatus;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        int iHashCode8 = Boolean.hashCode(this.hasFollowedThisUser);
        String str7 = this.officialStatus;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.liveStatus;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.shareCode;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowStatus(String str) {
        this.followStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerCount(Long l) {
        this.followerCount = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasFollowedThisUser(boolean z) {
        this.hasFollowedThisUser = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopOrbiter(nickName=" + this.nickName + ", followerCount=" + this.followerCount + ", bio=" + this.bio + ", translatedBio=" + this.translatedBio + ", portrait=" + this.portrait + ", authorId=" + this.authorId + ", followStatus=" + this.followStatus + ", hasFollowedThisUser=" + this.hasFollowedThisUser + ", officialStatus=" + this.officialStatus + ", liveStatus=" + this.liveStatus + ", shareCode=" + this.shareCode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nickName);
        Long l = this.followerCount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.bio);
        parcel.writeString(this.translatedBio);
        parcel.writeString(this.portrait);
        parcel.writeString(this.authorId);
        parcel.writeString(this.followStatus);
        parcel.writeInt(this.hasFollowedThisUser ? 1 : 0);
        parcel.writeString(this.officialStatus);
        parcel.writeString(this.liveStatus);
        parcel.writeString(this.shareCode);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TopOrbiter> serializer() {
            return TopOrbiter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TopOrbiter(int i, String str, Long l, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str;
        }
        if ((i & 2) == 0) {
            this.followerCount = 0L;
        } else {
            this.followerCount = l;
        }
        if ((i & 4) == 0) {
            this.bio = null;
        } else {
            this.bio = str2;
        }
        if ((i & 8) == 0) {
            this.translatedBio = null;
        } else {
            this.translatedBio = str3;
        }
        if ((i & 16) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str4;
        }
        if ((i & 32) == 0) {
            this.authorId = null;
        } else {
            this.authorId = str5;
        }
        if ((i & 64) == 0) {
            this.followStatus = "0";
        } else {
            this.followStatus = str6;
        }
        if ((i & 128) == 0) {
            this.hasFollowedThisUser = false;
        } else {
            this.hasFollowedThisUser = z;
        }
        if ((i & 256) == 0) {
            this.officialStatus = null;
        } else {
            this.officialStatus = str7;
        }
        if ((i & 512) == 0) {
            this.liveStatus = null;
        } else {
            this.liveStatus = str8;
        }
        if ((i & 1024) == 0) {
            this.shareCode = null;
        } else {
            this.shareCode = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(TopOrbiter topOrbiter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || topOrbiter.nickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, topOrbiter.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l = topOrbiter.followerCount) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, topOrbiter.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || topOrbiter.bio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, topOrbiter.bio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || topOrbiter.translatedBio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, topOrbiter.translatedBio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || topOrbiter.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, topOrbiter.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || topOrbiter.authorId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, topOrbiter.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) topOrbiter.followStatus, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, topOrbiter.followStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || topOrbiter.hasFollowedThisUser) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, topOrbiter.hasFollowedThisUser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || topOrbiter.officialStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, topOrbiter.officialStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || topOrbiter.liveStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, topOrbiter.liveStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && topOrbiter.shareCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, topOrbiter.shareCode);
    }

    public TopOrbiter(String str, Long l, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9) {
        this.nickName = str;
        this.followerCount = l;
        this.bio = str2;
        this.translatedBio = str3;
        this.portrait = str4;
        this.authorId = str5;
        this.followStatus = str6;
        this.hasFollowedThisUser = z;
        this.officialStatus = str7;
        this.liveStatus = str8;
        this.shareCode = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0072: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TopOrbiter(String str, Long l, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? "0" : str6, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }
}
