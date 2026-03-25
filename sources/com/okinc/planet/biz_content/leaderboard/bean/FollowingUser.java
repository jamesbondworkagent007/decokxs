package com.okinc.planet.biz_content.leaderboard.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FollowingUser implements Parcelable {
    private final String authorId;
    private final String bio;
    private final String followStatus;
    private final String liveStatus;
    private final String nickName;
    private final String offcialStatus;
    private final String portrait;
    private final String shareCode;
    private Integer unread;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FollowingUser> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<FollowingUser> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowingUser createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FollowingUser(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowingUser[] newArray(int i) {
            return new FollowingUser[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowingUser() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.unread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.followStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.liveStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.offcialStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.shareCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowingUser copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8) {
        return new FollowingUser(str, str2, str3, num, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof FollowingUser)) {
            return false;
        }
        FollowingUser followingUser = (FollowingUser) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) followingUser.authorId) && Intrinsics.EZpvd((Object) this.portrait, (Object) followingUser.portrait) && Intrinsics.EZpvd((Object) this.nickName, (Object) followingUser.nickName) && Intrinsics.EZpvd(this.unread, followingUser.unread) && Intrinsics.EZpvd((Object) this.bio, (Object) followingUser.bio) && Intrinsics.EZpvd((Object) this.followStatus, (Object) followingUser.followStatus) && Intrinsics.EZpvd((Object) this.liveStatus, (Object) followingUser.liveStatus) && Intrinsics.EZpvd((Object) this.offcialStatus, (Object) followingUser.offcialStatus) && Intrinsics.EZpvd((Object) this.shareCode, (Object) followingUser.shareCode);
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
    public final String getLiveStatus() {
        return this.liveStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOffcialStatus() {
        return this.offcialStatus;
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
    public final Integer getUnread() {
        return this.unread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.authorId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.portrait;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.unread;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.bio;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.followStatus;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.liveStatus;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.offcialStatus;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.shareCode;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnread(Integer num) {
        this.unread = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowingUser(authorId=" + this.authorId + ", portrait=" + this.portrait + ", nickName=" + this.nickName + ", unread=" + this.unread + ", bio=" + this.bio + ", followStatus=" + this.followStatus + ", liveStatus=" + this.liveStatus + ", offcialStatus=" + this.offcialStatus + ", shareCode=" + this.shareCode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.authorId);
        parcel.writeString(this.portrait);
        parcel.writeString(this.nickName);
        Integer num = this.unread;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.bio);
        parcel.writeString(this.followStatus);
        parcel.writeString(this.liveStatus);
        parcel.writeString(this.offcialStatus);
        parcel.writeString(this.shareCode);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.FollowingUser.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FollowingUser> serializer() {
            return FollowingUser$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FollowingUser(int i, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authorId = null;
        } else {
            this.authorId = str;
        }
        if ((i & 2) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str2;
        }
        if ((i & 4) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str3;
        }
        if ((i & 8) == 0) {
            this.unread = null;
        } else {
            this.unread = num;
        }
        if ((i & 16) == 0) {
            this.bio = null;
        } else {
            this.bio = str4;
        }
        if ((i & 32) == 0) {
            this.followStatus = "1";
        } else {
            this.followStatus = str5;
        }
        if ((i & 64) == 0) {
            this.liveStatus = null;
        } else {
            this.liveStatus = str6;
        }
        if ((i & 128) == 0) {
            this.offcialStatus = null;
        } else {
            this.offcialStatus = str7;
        }
        if ((i & 256) == 0) {
            this.shareCode = null;
        } else {
            this.shareCode = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(FollowingUser followingUser, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || followingUser.authorId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, followingUser.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || followingUser.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, followingUser.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || followingUser.nickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, followingUser.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || followingUser.unread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, followingUser.unread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || followingUser.bio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, followingUser.bio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) followingUser.followStatus, (Object) "1")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, followingUser.followStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || followingUser.liveStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, followingUser.liveStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || followingUser.offcialStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, followingUser.offcialStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && followingUser.shareCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, followingUser.shareCode);
    }

    public FollowingUser(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8) {
        this.authorId = str;
        this.portrait = str2;
        this.nickName = str3;
        this.unread = num;
        this.bio = str4;
        this.followStatus = str5;
        this.liveStatus = str6;
        this.offcialStatus = str7;
        this.shareCode = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("1") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:28) call: com.okinc.planet.biz_content.leaderboard.bean.FollowingUser.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FollowingUser(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? "1" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
    }
}
