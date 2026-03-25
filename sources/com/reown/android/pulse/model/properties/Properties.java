package com.reown.android.pulse.model.properties;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.reown.android.push.notifications.PushMessagingService;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class Properties {
    public final String clientId;
    public final Boolean connected;
    public final Long correlationId;
    public final String direction;
    public final String message;
    public final String method;
    public final String name;
    public final String network;
    public final String platform;
    public final String topic;
    public final List<String> trace;
    public final String userAgent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Properties() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.userAgent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.connected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.trace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.correlationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Properties copy(@Json(name = "message") String str, @Json(name = "name") String str2, @Json(name = FirebaseAnalytics.Param.METHOD) String str3, @Json(name = "connected") Boolean bool, @Json(name = "network") String str4, @Json(name = MTPushConstants.PlatformNode.KEY_PLATFORM) String str5, @Json(name = "trace") List<String> list, @Json(name = PushMessagingService.KEY_TOPIC) String str6, @Json(name = "correlation_id") Long l, @Json(name = "client_id") String str7, @Json(name = HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str8, @Json(name = "user_agent") String str9) {
        return new Properties(str, str2, str3, bool, str4, str5, list, str6, l, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Properties)) {
            return false;
        }
        Properties properties = (Properties) obj;
        return Intrinsics.EZpvd((Object) this.message, (Object) properties.message) && Intrinsics.EZpvd((Object) this.name, (Object) properties.name) && Intrinsics.EZpvd((Object) this.method, (Object) properties.method) && Intrinsics.EZpvd(this.connected, properties.connected) && Intrinsics.EZpvd((Object) this.network, (Object) properties.network) && Intrinsics.EZpvd((Object) this.platform, (Object) properties.platform) && Intrinsics.EZpvd(this.trace, properties.trace) && Intrinsics.EZpvd((Object) this.topic, (Object) properties.topic) && Intrinsics.EZpvd(this.correlationId, properties.correlationId) && Intrinsics.EZpvd((Object) this.clientId, (Object) properties.clientId) && Intrinsics.EZpvd((Object) this.direction, (Object) properties.direction) && Intrinsics.EZpvd((Object) this.userAgent, (Object) properties.userAgent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getConnected() {
        return this.connected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCorrelationId() {
        return this.correlationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTrace() {
        return this.trace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.message;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.method;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.connected;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str4 = this.network;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.platform;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        List<String> list = this.trace;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        String str6 = this.topic;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Long l = this.correlationId;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        String str7 = this.clientId;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.direction;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.userAgent;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Properties(message=" + this.message + ", name=" + this.name + ", method=" + this.method + ", connected=" + this.connected + ", network=" + this.network + ", platform=" + this.platform + ", trace=" + this.trace + ", topic=" + this.topic + ", correlationId=" + this.correlationId + ", clientId=" + this.clientId + ", direction=" + this.direction + ", userAgent=" + this.userAgent + ")";
    }

    public Properties(@Json(name = "message") String str, @Json(name = "name") String str2, @Json(name = FirebaseAnalytics.Param.METHOD) String str3, @Json(name = "connected") Boolean bool, @Json(name = "network") String str4, @Json(name = MTPushConstants.PlatformNode.KEY_PLATFORM) String str5, @Json(name = "trace") List<String> list, @Json(name = PushMessagingService.KEY_TOPIC) String str6, @Json(name = "correlation_id") Long l, @Json(name = "client_id") String str7, @Json(name = HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str8, @Json(name = "user_agent") String str9) {
        this.message = str;
        this.name = str2;
        this.method = str3;
        this.connected = bool;
        this.network = str4;
        this.platform = str5;
        this.trace = list;
        this.topic = str6;
        this.correlationId = l;
        this.clientId = str7;
        this.direction = str8;
        this.userAgent = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.reown.android.pulse.model.properties.Properties.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Properties(String str, String str2, String str3, Boolean bool, String str4, String str5, List list, String str6, Long l, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? str9 : null);
    }
}
