package com.okinc.impact.net;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class OKImpactResponse {
    private static final KSerializer<Object>[] $childSerializers;
    private final String channelId;
    private final Map<String, String> headers;
    private final String landingPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKImpactResponse() {
        this((String) null, (Map) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.impact.net.OKImpactResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OKImpactResponse copy$default(OKImpactResponse oKImpactResponse, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oKImpactResponse.landingPage;
        }
        if ((i & 2) != 0) {
            map = oKImpactResponse.headers;
        }
        if ((i & 4) != 0) {
            str2 = oKImpactResponse.channelId;
        }
        return oKImpactResponse.copy(str, map, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.landingPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component2() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKImpactResponse copy(String str, Map<String, String> map, String str2) {
        return new OKImpactResponse(str, map, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKImpactResponse)) {
            return false;
        }
        OKImpactResponse oKImpactResponse = (OKImpactResponse) obj;
        return Intrinsics.EZpvd((Object) this.landingPage, (Object) oKImpactResponse.landingPage) && Intrinsics.EZpvd(this.headers, oKImpactResponse.headers) && Intrinsics.EZpvd((Object) this.channelId, (Object) oKImpactResponse.channelId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLandingPage() {
        return this.landingPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.landingPage;
        int iHashCode = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.headers;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        String str2 = this.channelId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKImpactResponse(landingPage=" + this.landingPage + ", headers=" + this.headers + ", channelId=" + this.channelId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.impact.net.OKImpactResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKImpactResponse> serializer() {
            return OKImpactResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null};
    }

    public /* synthetic */ OKImpactResponse(int i, String str, Map map, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.landingPage = null;
        } else {
            this.landingPage = str;
        }
        if ((i & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i & 4) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(OKImpactResponse oKImpactResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oKImpactResponse.landingPage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, oKImpactResponse.landingPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || oKImpactResponse.headers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], oKImpactResponse.headers);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && oKImpactResponse.channelId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, oKImpactResponse.channelId);
    }

    public OKImpactResponse(String str, Map<String, String> map, String str2) {
        this.landingPage = str;
        this.headers = map;
        this.channelId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:14) call: com.okinc.impact.net.OKImpactResponse.<init>(java.lang.String, java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ OKImpactResponse(String str, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : str2);
    }
}
