package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class CommunityVOData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String access;
    private final String contentId;
    private final long createdAt;
    private final String description;
    private final long id;
    private final String joinPolicy;
    private final long memberCount;
    private final String name;
    private final String sourceId;
    private final String sourceLanguage;
    private final String translatedDescription;
    private final String translatedLanguage;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommunityVOData() {
        this(0L, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.translatedDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.access;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.joinPolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityVOData copy(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, @NotNull String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str6, "");
        return new CommunityVOData(j, str, str2, str3, str4, j2, str5, j3, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityVOData)) {
            return false;
        }
        CommunityVOData communityVOData = (CommunityVOData) obj;
        return this.id == communityVOData.id && Intrinsics.EZpvd((Object) this.sourceId, (Object) communityVOData.sourceId) && Intrinsics.EZpvd((Object) this.name, (Object) communityVOData.name) && Intrinsics.EZpvd((Object) this.description, (Object) communityVOData.description) && Intrinsics.EZpvd((Object) this.access, (Object) communityVOData.access) && this.memberCount == communityVOData.memberCount && Intrinsics.EZpvd((Object) this.joinPolicy, (Object) communityVOData.joinPolicy) && this.createdAt == communityVOData.createdAt && Intrinsics.EZpvd((Object) this.url, (Object) communityVOData.url) && Intrinsics.EZpvd((Object) this.contentId, (Object) communityVOData.contentId) && Intrinsics.EZpvd((Object) this.translatedDescription, (Object) communityVOData.translatedDescription) && Intrinsics.EZpvd((Object) this.translatedLanguage, (Object) communityVOData.translatedLanguage) && Intrinsics.EZpvd((Object) this.sourceLanguage, (Object) communityVOData.sourceLanguage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccess() {
        return this.access;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJoinPolicy() {
        return this.joinPolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMemberCount() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedDescription() {
        return this.translatedDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedLanguage() {
        return this.translatedLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.sourceId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.description;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.access;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        int iHashCode6 = Long.hashCode(this.memberCount);
        String str5 = this.joinPolicy;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        int iHashCode8 = Long.hashCode(this.createdAt);
        int iHashCode9 = this.url.hashCode();
        String str6 = this.contentId;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.translatedDescription;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.translatedLanguage;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.sourceLanguage;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunityVOData(id=" + this.id + ", sourceId=" + this.sourceId + ", name=" + this.name + ", description=" + this.description + ", access=" + this.access + ", memberCount=" + this.memberCount + ", joinPolicy=" + this.joinPolicy + ", createdAt=" + this.createdAt + ", url=" + this.url + ", contentId=" + this.contentId + ", translatedDescription=" + this.translatedDescription + ", translatedLanguage=" + this.translatedLanguage + ", sourceLanguage=" + this.sourceLanguage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunityVOData> serializer() {
            return CommunityVOData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunityVOData(int i, long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 2) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 16) == 0) {
            this.access = null;
        } else {
            this.access = str4;
        }
        if ((i & 32) == 0) {
            this.memberCount = 0L;
        } else {
            this.memberCount = j2;
        }
        if ((i & 64) == 0) {
            this.joinPolicy = null;
        } else {
            this.joinPolicy = str5;
        }
        if ((i & 128) == 0) {
            this.createdAt = 0L;
        } else {
            this.createdAt = j3;
        }
        this.url = (i & 256) == 0 ? "" : str6;
        if ((i & 512) == 0) {
            this.contentId = null;
        } else {
            this.contentId = str7;
        }
        if ((i & 1024) == 0) {
            this.translatedDescription = null;
        } else {
            this.translatedDescription = str8;
        }
        if ((i & 2048) == 0) {
            this.translatedLanguage = null;
        } else {
            this.translatedLanguage = str9;
        }
        if ((i & 4096) == 0) {
            this.sourceLanguage = null;
        } else {
            this.sourceLanguage = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CommunityVOData communityVOData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || communityVOData.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, communityVOData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || communityVOData.sourceId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, communityVOData.sourceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || communityVOData.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, communityVOData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || communityVOData.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, communityVOData.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || communityVOData.access != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, communityVOData.access);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || communityVOData.memberCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, communityVOData.memberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || communityVOData.joinPolicy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, communityVOData.joinPolicy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || communityVOData.createdAt != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, communityVOData.createdAt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) communityVOData.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, communityVOData.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || communityVOData.contentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, communityVOData.contentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || communityVOData.translatedDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, communityVOData.translatedDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || communityVOData.translatedLanguage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, communityVOData.translatedLanguage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && communityVOData.sourceLanguage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, communityVOData.sourceLanguage);
    }

    public CommunityVOData(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, @NotNull String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = j;
        this.sourceId = str;
        this.name = str2;
        this.description = str3;
        this.access = str4;
        this.memberCount = j2;
        this.joinPolicy = str5;
        this.createdAt = j3;
        this.url = str6;
        this.contentId = str7;
        this.translatedDescription = str8;
        this.translatedLanguage = str9;
        this.sourceLanguage = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002c: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r23v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003c: ARITH (r33v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r26v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:43) call: com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommunityVOData(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? j3 : 0L, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10);
    }
}
