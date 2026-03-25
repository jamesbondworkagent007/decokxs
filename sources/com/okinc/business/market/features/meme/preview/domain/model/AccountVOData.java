package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AccountVOData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String authorId;
    private final String bio;
    private final String contentId;
    private final long followerCount;
    private final long followingCount;
    private final String joinTime;
    private final String nickName;
    private final String portrait;
    private final String profileBannerUrl;
    private final SourceData source;
    private final String sourceLanguage;
    private final String translatedBio;
    private final String translatedLanguage;
    private final String username;
    private final boolean verified;
    private final String verifiedType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountVOData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, (String) null, false, (SourceData) null, (String) null, (String) null, (String) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SourceData component11() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.verifiedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.translatedBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.profileBannerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.joinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.followingCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountVOData copy(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, boolean z, SourceData sourceData, String str8, String str9, String str10, String str11, String str12) {
        return new AccountVOData(str, str2, str3, str4, str5, str6, j, j2, str7, z, sourceData, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountVOData)) {
            return false;
        }
        AccountVOData accountVOData = (AccountVOData) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) accountVOData.authorId) && Intrinsics.EZpvd((Object) this.username, (Object) accountVOData.username) && Intrinsics.EZpvd((Object) this.nickName, (Object) accountVOData.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) accountVOData.portrait) && Intrinsics.EZpvd((Object) this.profileBannerUrl, (Object) accountVOData.profileBannerUrl) && Intrinsics.EZpvd((Object) this.joinTime, (Object) accountVOData.joinTime) && this.followerCount == accountVOData.followerCount && this.followingCount == accountVOData.followingCount && Intrinsics.EZpvd((Object) this.bio, (Object) accountVOData.bio) && this.verified == accountVOData.verified && Intrinsics.EZpvd(this.source, accountVOData.source) && Intrinsics.EZpvd((Object) this.verifiedType, (Object) accountVOData.verifiedType) && Intrinsics.EZpvd((Object) this.contentId, (Object) accountVOData.contentId) && Intrinsics.EZpvd((Object) this.translatedBio, (Object) accountVOData.translatedBio) && Intrinsics.EZpvd((Object) this.translatedLanguage, (Object) accountVOData.translatedLanguage) && Intrinsics.EZpvd((Object) this.sourceLanguage, (Object) accountVOData.sourceLanguage);
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
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFollowingCount() {
        return this.followingCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJoinTime() {
        return this.joinTime;
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
    public final String getProfileBannerUrl() {
        return this.profileBannerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SourceData getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedBio() {
        return this.translatedBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedLanguage() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
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
        String str = this.authorId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.username;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.portrait;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.profileBannerUrl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.joinTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        int iHashCode7 = Long.hashCode(this.followerCount);
        int iHashCode8 = Long.hashCode(this.followingCount);
        String str7 = this.bio;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        int iHashCode10 = Boolean.hashCode(this.verified);
        SourceData sourceData = this.source;
        int iHashCode11 = sourceData == null ? 0 : sourceData.hashCode();
        String str8 = this.verifiedType;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.contentId;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.translatedBio;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.translatedLanguage;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.sourceLanguage;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str12 == null ? 0 : str12.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountVOData(authorId=" + this.authorId + ", username=" + this.username + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", profileBannerUrl=" + this.profileBannerUrl + ", joinTime=" + this.joinTime + ", followerCount=" + this.followerCount + ", followingCount=" + this.followingCount + ", bio=" + this.bio + ", verified=" + this.verified + ", source=" + this.source + ", verifiedType=" + this.verifiedType + ", contentId=" + this.contentId + ", translatedBio=" + this.translatedBio + ", translatedLanguage=" + this.translatedLanguage + ", sourceLanguage=" + this.sourceLanguage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.AccountVOData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountVOData> serializer() {
            return AccountVOData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountVOData(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, boolean z, SourceData sourceData, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authorId = null;
        } else {
            this.authorId = str;
        }
        if ((i & 2) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        if ((i & 4) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str3;
        }
        if ((i & 8) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str4;
        }
        if ((i & 16) == 0) {
            this.profileBannerUrl = null;
        } else {
            this.profileBannerUrl = str5;
        }
        if ((i & 32) == 0) {
            this.joinTime = null;
        } else {
            this.joinTime = str6;
        }
        if ((i & 64) == 0) {
            this.followerCount = 0L;
        } else {
            this.followerCount = j;
        }
        this.followingCount = (i & 128) != 0 ? j2 : 0L;
        if ((i & 256) == 0) {
            this.bio = null;
        } else {
            this.bio = str7;
        }
        this.verified = (i & 512) == 0 ? false : z;
        if ((i & 1024) == 0) {
            this.source = null;
        } else {
            this.source = sourceData;
        }
        if ((i & 2048) == 0) {
            this.verifiedType = null;
        } else {
            this.verifiedType = str8;
        }
        if ((i & 4096) == 0) {
            this.contentId = null;
        } else {
            this.contentId = str9;
        }
        if ((i & 8192) == 0) {
            this.translatedBio = null;
        } else {
            this.translatedBio = str10;
        }
        if ((i & 16384) == 0) {
            this.translatedLanguage = null;
        } else {
            this.translatedLanguage = str11;
        }
        if ((i & 32768) == 0) {
            this.sourceLanguage = null;
        } else {
            this.sourceLanguage = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AccountVOData accountVOData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || accountVOData.authorId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountVOData.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || accountVOData.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountVOData.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || accountVOData.nickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, accountVOData.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || accountVOData.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, accountVOData.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || accountVOData.profileBannerUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, accountVOData.profileBannerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || accountVOData.joinTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, accountVOData.joinTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || accountVOData.followerCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, accountVOData.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || accountVOData.followingCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, accountVOData.followingCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || accountVOData.bio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, accountVOData.bio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || accountVOData.verified) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, accountVOData.verified);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || accountVOData.source != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, SourceData$$serializer.INSTANCE, accountVOData.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || accountVOData.verifiedType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, accountVOData.verifiedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || accountVOData.contentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, accountVOData.contentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || accountVOData.translatedBio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, accountVOData.translatedBio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || accountVOData.translatedLanguage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, accountVOData.translatedLanguage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && accountVOData.sourceLanguage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, accountVOData.sourceLanguage);
    }

    public AccountVOData(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, boolean z, SourceData sourceData, String str8, String str9, String str10, String str11, String str12) {
        this.authorId = str;
        this.username = str2;
        this.nickName = str3;
        this.portrait = str4;
        this.profileBannerUrl = str5;
        this.joinTime = str6;
        this.followerCount = j;
        this.followingCount = j2;
        this.bio = str7;
        this.verified = z;
        this.source = sourceData;
        this.verifiedType = str8;
        this.contentId = str9;
        this.translatedBio = str10;
        this.translatedLanguage = str11;
        this.sourceLanguage = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ac: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r28v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.SourceData:?: TERNARY null = ((wrap:int:0x0053: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.SourceData) : (r32v0 com.okinc.business.market.features.meme.preview.domain.model.SourceData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:0x006b: TERNARY null = ((wrap:int:0x0063: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:0x0075: TERNARY null = ((wrap:int:0x006d: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, boolean, com.okinc.business.market.features.meme.preview.domain.model.SourceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.market.features.meme.preview.domain.model.AccountVOData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, boolean, com.okinc.business.market.features.meme.preview.domain.model.SourceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountVOData(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, boolean z, SourceData sourceData, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? 0L : j, (i & 128) == 0 ? j2 : 0L, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : sourceData, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12);
    }
}
