package com.reown.android.pulse.model;

import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.model.properties.Props;
import com.reown.util.UtilFunctionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class Event {
    public final String bundleId;
    public final long eventId;
    public final Props props;
    public final long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Event copy$default(Event event, long j, String str, long j2, Props props, int i, Object obj) {
        if ((i & 1) != 0) {
            j = event.eventId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = event.bundleId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = event.timestamp;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            props = event.props;
        }
        return event.copy(j3, str2, j4, props);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bundleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Props component4() {
        return this.props;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Event copy(@Json(name = "eventId") long j, @Json(name = "bundleId") @NotNull String str, @Json(name = "timestamp") long j2, @Json(name = "props") @NotNull Props props) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(props, "");
        return new Event(j, str, j2, props);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return this.eventId == event.eventId && Intrinsics.EZpvd((Object) this.bundleId, (Object) event.bundleId) && this.timestamp == event.timestamp && Intrinsics.EZpvd(this.props, event.props);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventId() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Props getProps() {
        return this.props;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.eventId) * 31) + this.bundleId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.props.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Event(eventId=" + this.eventId + ", bundleId=" + this.bundleId + ", timestamp=" + this.timestamp + ", props=" + this.props + ")";
    }

    public Event(@Json(name = "eventId") long j, @Json(name = "bundleId") @NotNull String str, @Json(name = "timestamp") long j2, @Json(name = "props") @NotNull Props props) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(props, "");
        this.eventId = j;
        this.bundleId = str;
        this.timestamp = j2;
        this.props = props;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:12)) : (r8v0 long))
  (r10v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x000d: INVOKE  STATIC call: com.reown.android.internal.utils.Time.getCurrentTimeInSeconds():long A[MD:():long (m), WRAPPED] (LINE:16)) : (r11v0 long))
  (r13v0 com.reown.android.pulse.model.properties.Props)
 A[MD:(long, java.lang.String, long, com.reown.android.pulse.model.properties.Props):void (m)] (LINE:10) call: com.reown.android.pulse.model.Event.<init>(long, java.lang.String, long, com.reown.android.pulse.model.properties.Props):void type: THIS */
    public /* synthetic */ Event(long j, String str, long j2, Props props, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, str, (i & 4) != 0 ? Time.getCurrentTimeInSeconds() : j2, props);
    }
}
