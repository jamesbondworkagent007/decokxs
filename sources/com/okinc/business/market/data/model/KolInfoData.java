package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class KolInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String engagementCount;
    public final String engagementCountChangeRate;
    public final String firstMentionMarketCap;
    public final String firstMentionPrice;
    public final String firstMentionTime;
    public final String followers;
    public final String impressionsCount;
    public final String impressionsCountChangeRate;
    public final String kolAvatar;
    public final String kolHandleId;
    public final String kolNickname;
    public final String mentionsCount;
    public final String mentionsCountChangeRate;
    public final String twitterLink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KolInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.kolHandleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.kolAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolInfoData copydefault(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        return new KolInfoData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.kolNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KolInfoData)) {
            return false;
        }
        KolInfoData kolInfoData = (KolInfoData) obj;
        return Intrinsics.EZpvd((Object) this.engagementCount, (Object) kolInfoData.engagementCount) && Intrinsics.EZpvd((Object) this.engagementCountChangeRate, (Object) kolInfoData.engagementCountChangeRate) && Intrinsics.EZpvd((Object) this.firstMentionMarketCap, (Object) kolInfoData.firstMentionMarketCap) && Intrinsics.EZpvd((Object) this.firstMentionPrice, (Object) kolInfoData.firstMentionPrice) && Intrinsics.EZpvd((Object) this.firstMentionTime, (Object) kolInfoData.firstMentionTime) && Intrinsics.EZpvd((Object) this.followers, (Object) kolInfoData.followers) && Intrinsics.EZpvd((Object) this.impressionsCount, (Object) kolInfoData.impressionsCount) && Intrinsics.EZpvd((Object) this.impressionsCountChangeRate, (Object) kolInfoData.impressionsCountChangeRate) && Intrinsics.EZpvd((Object) this.kolAvatar, (Object) kolInfoData.kolAvatar) && Intrinsics.EZpvd((Object) this.kolHandleId, (Object) kolInfoData.kolHandleId) && Intrinsics.EZpvd((Object) this.kolNickname, (Object) kolInfoData.kolNickname) && Intrinsics.EZpvd((Object) this.mentionsCount, (Object) kolInfoData.mentionsCount) && Intrinsics.EZpvd((Object) this.mentionsCountChangeRate, (Object) kolInfoData.mentionsCountChangeRate) && Intrinsics.EZpvd((Object) this.twitterLink, (Object) kolInfoData.twitterLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.engagementCount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.engagementCountChangeRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.firstMentionMarketCap;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.firstMentionPrice;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.firstMentionTime;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.followers;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.impressionsCount;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.impressionsCountChangeRate;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.kolAvatar;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.kolHandleId;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.kolNickname;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.mentionsCount;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.mentionsCountChangeRate;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.twitterLink;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KolInfoData(engagementCount=" + this.engagementCount + ", engagementCountChangeRate=" + this.engagementCountChangeRate + ", firstMentionMarketCap=" + this.firstMentionMarketCap + ", firstMentionPrice=" + this.firstMentionPrice + ", firstMentionTime=" + this.firstMentionTime + ", followers=" + this.followers + ", impressionsCount=" + this.impressionsCount + ", impressionsCountChangeRate=" + this.impressionsCountChangeRate + ", kolAvatar=" + this.kolAvatar + ", kolHandleId=" + this.kolHandleId + ", kolNickname=" + this.kolNickname + ", mentionsCount=" + this.mentionsCount + ", mentionsCountChangeRate=" + this.mentionsCountChangeRate + ", twitterLink=" + this.twitterLink + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.KolInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KolInfoData> serializer() {
            return KolInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KolInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.engagementCount = null;
        } else {
            this.engagementCount = str;
        }
        if ((i & 2) == 0) {
            this.engagementCountChangeRate = null;
        } else {
            this.engagementCountChangeRate = str2;
        }
        if ((i & 4) == 0) {
            this.firstMentionMarketCap = null;
        } else {
            this.firstMentionMarketCap = str3;
        }
        if ((i & 8) == 0) {
            this.firstMentionPrice = null;
        } else {
            this.firstMentionPrice = str4;
        }
        if ((i & 16) == 0) {
            this.firstMentionTime = null;
        } else {
            this.firstMentionTime = str5;
        }
        if ((i & 32) == 0) {
            this.followers = null;
        } else {
            this.followers = str6;
        }
        if ((i & 64) == 0) {
            this.impressionsCount = null;
        } else {
            this.impressionsCount = str7;
        }
        if ((i & 128) == 0) {
            this.impressionsCountChangeRate = null;
        } else {
            this.impressionsCountChangeRate = str8;
        }
        if ((i & 256) == 0) {
            this.kolAvatar = null;
        } else {
            this.kolAvatar = str9;
        }
        if ((i & 512) == 0) {
            this.kolHandleId = null;
        } else {
            this.kolHandleId = str10;
        }
        if ((i & 1024) == 0) {
            this.kolNickname = null;
        } else {
            this.kolNickname = str11;
        }
        if ((i & 2048) == 0) {
            this.mentionsCount = null;
        } else {
            this.mentionsCount = str12;
        }
        if ((i & 4096) == 0) {
            this.mentionsCountChangeRate = null;
        } else {
            this.mentionsCountChangeRate = str13;
        }
        if ((i & 8192) == 0) {
            this.twitterLink = null;
        } else {
            this.twitterLink = str14;
        }
    }

    public static final /* synthetic */ void OLrzqt(KolInfoData kolInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || kolInfoData.engagementCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, kolInfoData.engagementCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || kolInfoData.engagementCountChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, kolInfoData.engagementCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || kolInfoData.firstMentionMarketCap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, kolInfoData.firstMentionMarketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || kolInfoData.firstMentionPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, kolInfoData.firstMentionPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || kolInfoData.firstMentionTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, kolInfoData.firstMentionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || kolInfoData.followers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, kolInfoData.followers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || kolInfoData.impressionsCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, kolInfoData.impressionsCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || kolInfoData.impressionsCountChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, kolInfoData.impressionsCountChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || kolInfoData.kolAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, kolInfoData.kolAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || kolInfoData.kolHandleId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, kolInfoData.kolHandleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || kolInfoData.kolNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, kolInfoData.kolNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || kolInfoData.mentionsCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, kolInfoData.mentionsCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || kolInfoData.mentionsCountChangeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, kolInfoData.mentionsCountChangeRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && kolInfoData.twitterLink == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, kolInfoData.twitterLink);
    }

    public KolInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.engagementCount = str;
        this.engagementCountChangeRate = str2;
        this.firstMentionMarketCap = str3;
        this.firstMentionPrice = str4;
        this.firstMentionTime = str5;
        this.followers = str6;
        this.impressionsCount = str7;
        this.impressionsCountChangeRate = str8;
        this.kolAvatar = str9;
        this.kolHandleId = str10;
        this.kolNickname = str11;
        this.mentionsCount = str12;
        this.mentionsCountChangeRate = str13;
        this.twitterLink = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:59) call: com.okinc.business.market.data.model.KolInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KolInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? str14 : null);
    }
}
