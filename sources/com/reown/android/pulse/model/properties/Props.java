package com.reown.android.pulse.model.properties;

import com.reown.android.pulse.model.EventType;
import com.reown.utils.UtilFunctionsKt;
import com.squareup.moshi.Json;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Props {
    public final String event;
    public final Properties properties;
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Props() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Props copy$default(Props props, String str, String str2, Properties properties, int i, Object obj) {
        if ((i & 1) != 0) {
            str = props.event;
        }
        if ((i & 2) != 0) {
            str2 = props.type;
        }
        if ((i & 4) != 0) {
            properties = props.properties;
        }
        return props.copy(str, str2, properties);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Properties component3() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Props copy(@Json(name = "event") @NotNull String str, @Json(name = "type") @NotNull String str2, @Json(name = "properties") Properties properties) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Props(str, str2, properties);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Props)) {
            return false;
        }
        Props props = (Props) obj;
        return Intrinsics.EZpvd((Object) this.event, (Object) props.event) && Intrinsics.EZpvd((Object) this.type, (Object) props.type) && Intrinsics.EZpvd(this.properties, props.properties);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEvent() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Properties getProperties() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.event.hashCode();
        int iHashCode2 = this.type.hashCode();
        Properties properties = this.properties;
        return (((iHashCode * 31) + iHashCode2) * 31) + (properties == null ? 0 : properties.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Props(event=" + this.event + ", type=" + this.type + ", properties=" + this.properties + ")";
    }

    public Props(@Json(name = "event") @NotNull String str, @Json(name = "type") @NotNull String str2, @Json(name = "properties") Properties properties) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.event = str;
        this.type = str2;
        this.properties = properties;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] com.reown.android.pulse.model.EventType.ERROR java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000c: INVOKE (wrap:o.yIt:0x000a: SGET  A[WRAPPED] (LINE:11) o.yIt.KWHzl o.yIt) STATIC call: com.reown.utils.UtilFunctionsKt.getEmpty(o.yIt):java.lang.String A[MD:(o.yIt):java.lang.String (m), WRAPPED] (LINE:11)) : (r2v0 java.lang.String))
  (wrap:com.reown.android.pulse.model.properties.Properties:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.pulse.model.properties.Properties) : (r3v0 com.reown.android.pulse.model.properties.Properties))
 A[MD:(java.lang.String, java.lang.String, com.reown.android.pulse.model.properties.Properties):void (m)] (LINE:7) call: com.reown.android.pulse.model.properties.Props.<init>(java.lang.String, java.lang.String, com.reown.android.pulse.model.properties.Properties):void type: THIS */
    public /* synthetic */ Props(String str, String str2, Properties properties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EventType.ERROR : str, (i & 2) != 0 ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str2, (i & 4) != 0 ? null : properties);
    }
}
