package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterV2User {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long followersCount;
    private final String idStr;
    private final String joinTime;
    private final String name;
    private final String profileImageUrlHttps;
    private final String screenName;
    private final boolean verified;
    private final String verifiedType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterV2User() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 255, (DefaultConstructorMarker) null);
    }

    @SerialName("followersCount")
    public static /* synthetic */ void getFollowersCount$annotations() {
    }

    @SerialName("idStr")
    public static /* synthetic */ void getIdStr$annotations() {
    }

    @SerialName("joinTime")
    public static /* synthetic */ void getJoinTime$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("profileImageUrlHttps")
    public static /* synthetic */ void getProfileImageUrlHttps$annotations() {
    }

    @SerialName("screenName")
    public static /* synthetic */ void getScreenName$annotations() {
    }

    @SerialName("verified")
    public static /* synthetic */ void getVerified$annotations() {
    }

    @SerialName("verifiedType")
    public static /* synthetic */ void getVerifiedType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.followersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.idStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.joinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.profileImageUrlHttps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.screenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.verifiedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterV2User copy(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        return new TwitterV2User(j, str, str2, str3, str4, str5, z, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterV2User)) {
            return false;
        }
        TwitterV2User twitterV2User = (TwitterV2User) obj;
        return this.followersCount == twitterV2User.followersCount && Intrinsics.EZpvd((Object) this.idStr, (Object) twitterV2User.idStr) && Intrinsics.EZpvd((Object) this.joinTime, (Object) twitterV2User.joinTime) && Intrinsics.EZpvd((Object) this.name, (Object) twitterV2User.name) && Intrinsics.EZpvd((Object) this.profileImageUrlHttps, (Object) twitterV2User.profileImageUrlHttps) && Intrinsics.EZpvd((Object) this.screenName, (Object) twitterV2User.screenName) && this.verified == twitterV2User.verified && Intrinsics.EZpvd((Object) this.verifiedType, (Object) twitterV2User.verifiedType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFollowersCount() {
        return this.followersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdStr() {
        return this.idStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJoinTime() {
        return this.joinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfileImageUrlHttps() {
        return this.profileImageUrlHttps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVerified() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerifiedType() {
        return this.verifiedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.followersCount);
        String str = this.idStr;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.joinTime;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.profileImageUrlHttps;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.screenName;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        int iHashCode7 = Boolean.hashCode(this.verified);
        String str6 = this.verifiedType;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterV2User(followersCount=" + this.followersCount + ", idStr=" + this.idStr + ", joinTime=" + this.joinTime + ", name=" + this.name + ", profileImageUrlHttps=" + this.profileImageUrlHttps + ", screenName=" + this.screenName + ", verified=" + this.verified + ", verifiedType=" + this.verifiedType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterV2User> serializer() {
            return TwitterV2User$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterV2User(int i, long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.followersCount = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.idStr = null;
        } else {
            this.idStr = str;
        }
        if ((i & 4) == 0) {
            this.joinTime = null;
        } else {
            this.joinTime = str2;
        }
        if ((i & 8) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 16) == 0) {
            this.profileImageUrlHttps = null;
        } else {
            this.profileImageUrlHttps = str4;
        }
        if ((i & 32) == 0) {
            this.screenName = null;
        } else {
            this.screenName = str5;
        }
        if ((i & 64) == 0) {
            this.verified = false;
        } else {
            this.verified = z;
        }
        if ((i & 128) == 0) {
            this.verifiedType = null;
        } else {
            this.verifiedType = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterV2User twitterV2User, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterV2User.followersCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, twitterV2User.followersCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || twitterV2User.idStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, twitterV2User.idStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || twitterV2User.joinTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, twitterV2User.joinTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || twitterV2User.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, twitterV2User.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || twitterV2User.profileImageUrlHttps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, twitterV2User.profileImageUrlHttps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || twitterV2User.screenName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, twitterV2User.screenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || twitterV2User.verified) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, twitterV2User.verified);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && twitterV2User.verifiedType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, twitterV2User.verifiedType);
    }

    public TwitterV2User(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        this.followersCount = j;
        this.idStr = str;
        this.joinTime = str2;
        this.name = str3;
        this.profileImageUrlHttps = str4;
        this.screenName = str5;
        this.verified = z;
        this.verifiedType = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:187) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TwitterV2User(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z, (i & 128) == 0 ? str6 : null);
    }
}
