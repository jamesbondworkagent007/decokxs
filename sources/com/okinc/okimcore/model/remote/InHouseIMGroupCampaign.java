package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupCampaign {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer activityId;
    private final String campaignEndTime;
    private final String campaignStartTime;
    private final String minAppVersion;
    private final String registrationStartTime;
    private final String urlSlug;
    private final String urlSubPath;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupCampaign() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMGroupCampaign copy$default(InHouseIMGroupCampaign inHouseIMGroupCampaign, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = inHouseIMGroupCampaign.activityId;
        }
        if ((i & 2) != 0) {
            str = inHouseIMGroupCampaign.urlSlug;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = inHouseIMGroupCampaign.urlSubPath;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = inHouseIMGroupCampaign.campaignStartTime;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = inHouseIMGroupCampaign.campaignEndTime;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = inHouseIMGroupCampaign.registrationStartTime;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = inHouseIMGroupCampaign.minAppVersion;
        }
        return inHouseIMGroupCampaign.copy(num, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.urlSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.urlSubPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.campaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.registrationStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minAppVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupCampaign copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        return new InHouseIMGroupCampaign(num, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupCampaign)) {
            return false;
        }
        InHouseIMGroupCampaign inHouseIMGroupCampaign = (InHouseIMGroupCampaign) obj;
        return Intrinsics.EZpvd(this.activityId, inHouseIMGroupCampaign.activityId) && Intrinsics.EZpvd((Object) this.urlSlug, (Object) inHouseIMGroupCampaign.urlSlug) && Intrinsics.EZpvd((Object) this.urlSubPath, (Object) inHouseIMGroupCampaign.urlSubPath) && Intrinsics.EZpvd((Object) this.campaignStartTime, (Object) inHouseIMGroupCampaign.campaignStartTime) && Intrinsics.EZpvd((Object) this.campaignEndTime, (Object) inHouseIMGroupCampaign.campaignEndTime) && Intrinsics.EZpvd((Object) this.registrationStartTime, (Object) inHouseIMGroupCampaign.registrationStartTime) && Intrinsics.EZpvd((Object) this.minAppVersion, (Object) inHouseIMGroupCampaign.minAppVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getActivityId() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignEndTime() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignStartTime() {
        return this.campaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegistrationStartTime() {
        return this.registrationStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlSlug() {
        return this.urlSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlSubPath() {
        return this.urlSubPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.activityId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.urlSlug;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.urlSubPath;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.campaignStartTime;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.campaignEndTime;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.registrationStartTime;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.minAppVersion;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupCampaign(activityId=" + this.activityId + ", urlSlug=" + this.urlSlug + ", urlSubPath=" + this.urlSubPath + ", campaignStartTime=" + this.campaignStartTime + ", campaignEndTime=" + this.campaignEndTime + ", registrationStartTime=" + this.registrationStartTime + ", minAppVersion=" + this.minAppVersion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGroupCampaign.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupCampaign> serializer() {
            return InHouseIMGroupCampaign$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupCampaign(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.activityId = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.urlSlug = "";
        } else {
            this.urlSlug = str;
        }
        if ((i & 4) == 0) {
            this.urlSubPath = "";
        } else {
            this.urlSubPath = str2;
        }
        if ((i & 8) == 0) {
            this.campaignStartTime = "";
        } else {
            this.campaignStartTime = str3;
        }
        if ((i & 16) == 0) {
            this.campaignEndTime = "";
        } else {
            this.campaignEndTime = str4;
        }
        if ((i & 32) == 0) {
            this.registrationStartTime = "";
        } else {
            this.registrationStartTime = str5;
        }
        if ((i & 64) == 0) {
            this.minAppVersion = "";
        } else {
            this.minAppVersion = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupCampaign inHouseIMGroupCampaign, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = inHouseIMGroupCampaign.activityId) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, inHouseIMGroupCampaign.activityId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inHouseIMGroupCampaign.urlSlug, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMGroupCampaign.urlSlug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inHouseIMGroupCampaign.urlSubPath, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inHouseIMGroupCampaign.urlSubPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) inHouseIMGroupCampaign.campaignStartTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inHouseIMGroupCampaign.campaignStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) inHouseIMGroupCampaign.campaignEndTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseIMGroupCampaign.campaignEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) inHouseIMGroupCampaign.registrationStartTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, inHouseIMGroupCampaign.registrationStartTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) inHouseIMGroupCampaign.minAppVersion, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, inHouseIMGroupCampaign.minAppVersion);
    }

    public InHouseIMGroupCampaign(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.activityId = num;
        this.urlSlug = str;
        this.urlSubPath = str2;
        this.campaignStartTime = str3;
        this.campaignEndTime = str4;
        this.registrationStartTime = str5;
        this.minAppVersion = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:175) call: com.okinc.okimcore.model.remote.InHouseIMGroupCampaign.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InHouseIMGroupCampaign(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "");
    }
}
