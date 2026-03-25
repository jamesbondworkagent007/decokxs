package com.reown.android.internal.common.model;

import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.foundation.common.model.Topic;
import com.reown.utils.UtilFunctionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WCRequest {
    public final String attestation;
    public final String encryptedMessage;
    public final long id;
    public final String message;
    public final String method;
    public final ClientParams params;
    public final long publishedAt;
    public final Topic topic;
    public final TransportType transportType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientParams component4() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.encryptedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.attestation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType component9() {
        return this.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCRequest copy(@NotNull Topic topic, long j, @NotNull String str, @NotNull ClientParams clientParams, @NotNull String str2, long j2, @NotNull String str3, String str4, @NotNull TransportType transportType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(transportType, "");
        return new WCRequest(topic, j, str, clientParams, str2, j2, str3, str4, transportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCRequest)) {
            return false;
        }
        WCRequest wCRequest = (WCRequest) obj;
        return Intrinsics.EZpvd(this.topic, wCRequest.topic) && this.id == wCRequest.id && Intrinsics.EZpvd((Object) this.method, (Object) wCRequest.method) && Intrinsics.EZpvd(this.params, wCRequest.params) && Intrinsics.EZpvd((Object) this.message, (Object) wCRequest.message) && this.publishedAt == wCRequest.publishedAt && Intrinsics.EZpvd((Object) this.encryptedMessage, (Object) wCRequest.encryptedMessage) && Intrinsics.EZpvd((Object) this.attestation, (Object) wCRequest.attestation) && this.transportType == wCRequest.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttestation() {
        return this.attestation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptedMessage() {
        return this.encryptedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
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
    public final ClientParams getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishedAt() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType getTransportType() {
        return this.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.topic.hashCode();
        int iHashCode2 = Long.hashCode(this.id);
        int iHashCode3 = this.method.hashCode();
        int iHashCode4 = this.params.hashCode();
        int iHashCode5 = this.message.hashCode();
        int iHashCode6 = Long.hashCode(this.publishedAt);
        int iHashCode7 = this.encryptedMessage.hashCode();
        String str = this.attestation;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.transportType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WCRequest(topic=" + this.topic + ", id=" + this.id + ", method=" + this.method + ", params=" + this.params + ", message=" + this.message + ", publishedAt=" + this.publishedAt + ", encryptedMessage=" + this.encryptedMessage + ", attestation=" + this.attestation + ", transportType=" + this.transportType + ")";
    }

    public WCRequest(@NotNull Topic topic, long j, @NotNull String str, @NotNull ClientParams clientParams, @NotNull String str2, long j2, @NotNull String str3, String str4, @NotNull TransportType transportType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(clientParams, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(transportType, "");
        this.topic = topic;
        this.id = j;
        this.method = str;
        this.params = clientParams;
        this.message = str2;
        this.publishedAt = j2;
        this.encryptedMessage = str3;
        this.attestation = str4;
        this.transportType = transportType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (r15v0 com.reown.foundation.common.model.Topic)
  (r16v0 long)
  (r18v0 java.lang.String)
  (r19v0 com.reown.android.internal.common.model.type.ClientParams)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: INVOKE (wrap:o.yIt:0x0006: SGET  A[WRAPPED] (LINE:12) o.yIt.KWHzl o.yIt) STATIC call: com.reown.utils.UtilFunctionsKt.getEmpty(o.yIt):java.lang.String A[MD:(o.yIt):java.lang.String (m), WRAPPED] (LINE:12)) : (r20v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r21v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: INVOKE (wrap:o.yIt:0x001e: SGET  A[WRAPPED] (LINE:14) o.yIt.KWHzl o.yIt) STATIC call: com.reown.utils.UtilFunctionsKt.getEmpty(o.yIt):java.lang.String A[MD:(o.yIt):java.lang.String (m), WRAPPED] (LINE:14)) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (r25v0 com.reown.android.internal.common.model.TransportType)
 A[MD:(com.reown.foundation.common.model.Topic, long, java.lang.String, com.reown.android.internal.common.model.type.ClientParams, java.lang.String, long, java.lang.String, java.lang.String, com.reown.android.internal.common.model.TransportType):void (m)] (LINE:7) call: com.reown.android.internal.common.model.WCRequest.<init>(com.reown.foundation.common.model.Topic, long, java.lang.String, com.reown.android.internal.common.model.type.ClientParams, java.lang.String, long, java.lang.String, java.lang.String, com.reown.android.internal.common.model.TransportType):void type: THIS */
    public /* synthetic */ WCRequest(Topic topic, long j, String str, ClientParams clientParams, String str2, long j2, String str3, String str4, TransportType transportType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topic, j, str, clientParams, (i & 16) != 0 ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str2, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str3, (i & 128) != 0 ? null : str4, transportType);
    }
}
