package com.okinc.okpush.sdk.net.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PushBindReqInfo {
    private String channelId;
    private Long clientTime;
    private String deviceId;
    private String deviceToken;
    private String deviceType;
    private String extraMap;
    private String isLogin;
    private String isSubscribed;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PushBindReqInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.deviceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.clientTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.extraMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushBindReqInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8) {
        return new PushBindReqInfo(str, str2, str3, str4, str5, str6, str7, l, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushBindReqInfo)) {
            return false;
        }
        PushBindReqInfo pushBindReqInfo = (PushBindReqInfo) obj;
        return Intrinsics.EZpvd((Object) this.isLogin, (Object) pushBindReqInfo.isLogin) && Intrinsics.EZpvd((Object) this.isSubscribed, (Object) pushBindReqInfo.isSubscribed) && Intrinsics.EZpvd((Object) this.deviceId, (Object) pushBindReqInfo.deviceId) && Intrinsics.EZpvd((Object) this.deviceToken, (Object) pushBindReqInfo.deviceToken) && Intrinsics.EZpvd((Object) this.tag, (Object) pushBindReqInfo.tag) && Intrinsics.EZpvd((Object) this.channelId, (Object) pushBindReqInfo.channelId) && Intrinsics.EZpvd((Object) this.deviceType, (Object) pushBindReqInfo.deviceType) && Intrinsics.EZpvd(this.clientTime, pushBindReqInfo.clientTime) && Intrinsics.EZpvd((Object) this.extraMap, (Object) pushBindReqInfo.extraMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getClientTime() {
        return this.clientTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceToken() {
        return this.deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMap() {
        return this.extraMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.isLogin;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.isSubscribed;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.deviceId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.deviceToken;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tag;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.channelId;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.deviceType;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Long l = this.clientTime;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        String str8 = this.extraMap;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLogin() {
        return this.isLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSubscribed() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelId(String str) {
        this.channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientTime(Long l) {
        this.clientTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceToken(String str) {
        this.deviceToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMap(String str) {
        this.extraMap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogin(String str) {
        this.isLogin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscribed(String str) {
        this.isSubscribed = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PushBindReqInfo(isLogin=" + this.isLogin + ", isSubscribed=" + this.isSubscribed + ", deviceId=" + this.deviceId + ", deviceToken=" + this.deviceToken + ", tag=" + this.tag + ", channelId=" + this.channelId + ", deviceType=" + this.deviceType + ", clientTime=" + this.clientTime + ", extraMap=" + this.extraMap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpush.sdk.net.bean.PushBindReqInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PushBindReqInfo> serializer() {
            return PushBindReqInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PushBindReqInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isLogin = null;
        } else {
            this.isLogin = str;
        }
        if ((i & 2) == 0) {
            this.isSubscribed = null;
        } else {
            this.isSubscribed = str2;
        }
        if ((i & 4) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str3;
        }
        if ((i & 8) == 0) {
            this.deviceToken = null;
        } else {
            this.deviceToken = str4;
        }
        if ((i & 16) == 0) {
            this.tag = "";
        } else {
            this.tag = str5;
        }
        if ((i & 32) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str6;
        }
        if ((i & 64) == 0) {
            this.deviceType = null;
        } else {
            this.deviceType = str7;
        }
        if ((i & 128) == 0) {
            this.clientTime = null;
        } else {
            this.clientTime = l;
        }
        if ((i & 256) == 0) {
            this.extraMap = null;
        } else {
            this.extraMap = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKPush_okpush_notification(PushBindReqInfo pushBindReqInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pushBindReqInfo.isLogin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, pushBindReqInfo.isLogin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pushBindReqInfo.isSubscribed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pushBindReqInfo.isSubscribed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || pushBindReqInfo.deviceId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, pushBindReqInfo.deviceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || pushBindReqInfo.deviceToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, pushBindReqInfo.deviceToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) pushBindReqInfo.tag, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, pushBindReqInfo.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || pushBindReqInfo.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, pushBindReqInfo.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || pushBindReqInfo.deviceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, pushBindReqInfo.deviceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || pushBindReqInfo.clientTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, pushBindReqInfo.clientTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && pushBindReqInfo.extraMap == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, pushBindReqInfo.extraMap);
    }

    public PushBindReqInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8) {
        this.isLogin = str;
        this.isSubscribed = str2;
        this.deviceId = str3;
        this.deviceToken = str4;
        this.tag = str5;
        this.channelId = str6;
        this.deviceType = str7;
        this.clientTime = l;
        this.extraMap = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:12) call: com.okinc.okpush.sdk.net.bean.PushBindReqInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ PushBindReqInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : l, (i & 256) == 0 ? str8 : null);
    }
}
