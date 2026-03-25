package com.reown.sign.common.model;

import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.TransportType;
import com.reown.foundation.common.model.Topic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Request<T> {
    public final String chainId;
    public final Expiry expiry;
    public final long id;
    public final String method;
    public final T params;
    public final Topic topic;
    public final TransportType transportType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component2() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T component5() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry component6() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType component7() {
        return this.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Request<T> copy(long j, @NotNull Topic topic, @NotNull String str, String str2, T t, Expiry expiry, TransportType transportType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new Request<>(j, topic, str, str2, t, expiry, transportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        return this.id == request.id && Intrinsics.EZpvd(this.topic, request.topic) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd((Object) this.chainId, (Object) request.chainId) && Intrinsics.EZpvd(this.params, request.params) && Intrinsics.EZpvd(this.expiry, request.expiry) && this.transportType == request.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getParams() {
        return this.params;
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
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.topic.hashCode();
        int iHashCode3 = this.method.hashCode();
        String str = this.chainId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        T t = this.params;
        int iHashCode5 = t == null ? 0 : t.hashCode();
        Expiry expiry = this.expiry;
        int iHashCode6 = expiry == null ? 0 : expiry.hashCode();
        TransportType transportType = this.transportType;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (transportType != null ? transportType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Request(id=" + this.id + ", topic=" + this.topic + ", method=" + this.method + ", chainId=" + this.chainId + ", params=" + this.params + ", expiry=" + this.expiry + ", transportType=" + this.transportType + ")";
    }

    public Request(long j, @NotNull Topic topic, @NotNull String str, String str2, T t, Expiry expiry, TransportType transportType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.id = j;
        this.topic = topic;
        this.method = str;
        this.chainId = str2;
        this.params = t;
        this.expiry = expiry;
        this.transportType = transportType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r11v0 long)
  (r13v0 com.reown.foundation.common.model.Topic)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.Object)
  (wrap:com.reown.android.internal.common.model.Expiry:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.internal.common.model.Expiry) : (r17v0 com.reown.android.internal.common.model.Expiry))
  (r18v0 com.reown.android.internal.common.model.TransportType)
 A[MD:(long, com.reown.foundation.common.model.Topic, java.lang.String, java.lang.String, T, com.reown.android.internal.common.model.Expiry, com.reown.android.internal.common.model.TransportType):void (m)] (LINE:7) call: com.reown.sign.common.model.Request.<init>(long, com.reown.foundation.common.model.Topic, java.lang.String, java.lang.String, java.lang.Object, com.reown.android.internal.common.model.Expiry, com.reown.android.internal.common.model.TransportType):void type: THIS */
    public /* synthetic */ Request(long j, Topic topic, String str, String str2, Object obj, Expiry expiry, TransportType transportType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, topic, str, str2, obj, (i & 32) != 0 ? null : expiry, transportType);
    }
}
