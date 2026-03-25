package com.okinc.network.okg.dns.model;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class BasicInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Attributes attributes;
    private final String isHttp;
    private final String isSubdomain;
    private final String overseaNetwork;
    private final Long prepareDuration;
    private final String rootDomain;
    private final Long startTimeMs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BasicInfo() {
        this((String) null, (String) null, (String) null, (Long) null, (String) null, (Long) null, (Attributes) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BasicInfo copy$default(BasicInfo basicInfo, String str, String str2, String str3, Long l, String str4, Long l2, Attributes attributes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basicInfo.rootDomain;
        }
        if ((i & 2) != 0) {
            str2 = basicInfo.isHttp;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = basicInfo.isSubdomain;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            l = basicInfo.prepareDuration;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            str4 = basicInfo.overseaNetwork;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            l2 = basicInfo.startTimeMs;
        }
        Long l4 = l2;
        if ((i & 64) != 0) {
            attributes = basicInfo.attributes;
        }
        return basicInfo.copy(str, str5, str6, l3, str7, l4, attributes);
    }

    @SerialName(MTAnalysisConstants.EVENT_ATTRIBUTES)
    public static /* synthetic */ void getAttributes$annotations() {
    }

    @SerialName("oversea_network")
    public static /* synthetic */ void getOverseaNetwork$annotations() {
    }

    @SerialName("prepare_duration")
    public static /* synthetic */ void getPrepareDuration$annotations() {
    }

    @SerialName("root_domain")
    public static /* synthetic */ void getRootDomain$annotations() {
    }

    @SerialName(MetricsSQLiteCacheKt.METRICS_START_TIME)
    public static /* synthetic */ void getStartTimeMs$annotations() {
    }

    @SerialName("is_http")
    public static /* synthetic */ void isHttp$annotations() {
    }

    @SerialName("is_subdomain")
    public static /* synthetic */ void isSubdomain$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rootDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.isHttp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.isSubdomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.prepareDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.overseaNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.startTimeMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Attributes component7() {
        return this.attributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo copy(String str, String str2, String str3, Long l, String str4, Long l2, Attributes attributes) {
        return new BasicInfo(str, str2, str3, l, str4, l2, attributes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInfo)) {
            return false;
        }
        BasicInfo basicInfo = (BasicInfo) obj;
        return Intrinsics.EZpvd((Object) this.rootDomain, (Object) basicInfo.rootDomain) && Intrinsics.EZpvd((Object) this.isHttp, (Object) basicInfo.isHttp) && Intrinsics.EZpvd((Object) this.isSubdomain, (Object) basicInfo.isSubdomain) && Intrinsics.EZpvd(this.prepareDuration, basicInfo.prepareDuration) && Intrinsics.EZpvd((Object) this.overseaNetwork, (Object) basicInfo.overseaNetwork) && Intrinsics.EZpvd(this.startTimeMs, basicInfo.startTimeMs) && Intrinsics.EZpvd(this.attributes, basicInfo.attributes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOverseaNetwork() {
        return this.overseaNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPrepareDuration() {
        return this.prepareDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootDomain() {
        return this.rootDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rootDomain;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.isHttp;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.isSubdomain;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Long l = this.prepareDuration;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str4 = this.overseaNetwork;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Long l2 = this.startTimeMs;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        Attributes attributes = this.attributes;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (attributes != null ? attributes.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isHttp() {
        return this.isHttp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSubdomain() {
        return this.isSubdomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BasicInfo(rootDomain=" + this.rootDomain + ", isHttp=" + this.isHttp + ", isSubdomain=" + this.isSubdomain + ", prepareDuration=" + this.prepareDuration + ", overseaNetwork=" + this.overseaNetwork + ", startTimeMs=" + this.startTimeMs + ", attributes=" + this.attributes + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.BasicInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BasicInfo> serializer() {
            return BasicInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BasicInfo(int i, String str, String str2, String str3, Long l, String str4, Long l2, Attributes attributes, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rootDomain = null;
        } else {
            this.rootDomain = str;
        }
        if ((i & 2) == 0) {
            this.isHttp = null;
        } else {
            this.isHttp = str2;
        }
        if ((i & 4) == 0) {
            this.isSubdomain = null;
        } else {
            this.isSubdomain = str3;
        }
        if ((i & 8) == 0) {
            this.prepareDuration = null;
        } else {
            this.prepareDuration = l;
        }
        if ((i & 16) == 0) {
            this.overseaNetwork = null;
        } else {
            this.overseaNetwork = str4;
        }
        if ((i & 32) == 0) {
            this.startTimeMs = null;
        } else {
            this.startTimeMs = l2;
        }
        if ((i & 64) == 0) {
            this.attributes = null;
        } else {
            this.attributes = attributes;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(BasicInfo basicInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || basicInfo.rootDomain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, basicInfo.rootDomain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || basicInfo.isHttp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, basicInfo.isHttp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || basicInfo.isSubdomain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, basicInfo.isSubdomain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || basicInfo.prepareDuration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, basicInfo.prepareDuration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || basicInfo.overseaNetwork != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, basicInfo.overseaNetwork);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || basicInfo.startTimeMs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, basicInfo.startTimeMs);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && basicInfo.attributes == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Attributes$$serializer.INSTANCE, basicInfo.attributes);
    }

    public BasicInfo(String str, String str2, String str3, Long l, String str4, Long l2, Attributes attributes) {
        this.rootDomain = str;
        this.isHttp = str2;
        this.isSubdomain = str3;
        this.prepareDuration = l;
        this.overseaNetwork = str4;
        this.startTimeMs = l2;
        this.attributes = attributes;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r10v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r12v0 java.lang.Long))
  (wrap:com.okinc.network.okg.dns.model.Attributes:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.network.okg.dns.model.Attributes) : (r13v0 com.okinc.network.okg.dns.model.Attributes))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, com.okinc.network.okg.dns.model.Attributes):void (m)] (LINE:27) call: com.okinc.network.okg.dns.model.BasicInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, com.okinc.network.okg.dns.model.Attributes):void type: THIS */
    public /* synthetic */ BasicInfo(String str, String str2, String str3, Long l, String str4, Long l2, Attributes attributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : attributes);
    }
}
