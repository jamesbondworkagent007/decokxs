package com.bytedance.applog.exposure;

import com.bytedance.applog.exposure.IExposureConfig;
import com.bytedance.bdtracker.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewExposureData<Config extends IExposureConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114a;
    public final JSONObject b;
    public Config c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureData(String str, JSONObject jSONObject, Config config) {
        this.f114a = str;
        this.b = jSONObject;
        this.c = config;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:org.json.JSONObject:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null org.json.JSONObject) : (r3v0 org.json.JSONObject))
  (wrap:com.bytedance.applog.exposure.IExposureConfig:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.bytedance.applog.exposure.IExposureConfig) : (r4v0 com.bytedance.applog.exposure.IExposureConfig))
 A[MD:(java.lang.String, org.json.JSONObject, Config extends com.bytedance.applog.exposure.IExposureConfig):void (m)] call: com.bytedance.applog.exposure.ViewExposureData.<init>(java.lang.String, org.json.JSONObject, com.bytedance.applog.exposure.IExposureConfig):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewExposureData(String str, JSONObject jSONObject, IExposureConfig iExposureConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : iExposureConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.applog.exposure.ViewExposureData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewExposureData copy$default(ViewExposureData viewExposureData, String str, JSONObject jSONObject, IExposureConfig iExposureConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewExposureData.f114a;
        }
        if ((i & 2) != 0) {
            jSONObject = viewExposureData.b;
        }
        if ((i & 4) != 0) {
            iExposureConfig = viewExposureData.c;
        }
        return viewExposureData.copy(str, jSONObject, iExposureConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.f114a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject component2() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Config component3() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewExposureData<Config> copy(String str, JSONObject jSONObject, Config config) {
        return new ViewExposureData<>(str, jSONObject, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewExposureData)) {
            return false;
        }
        ViewExposureData viewExposureData = (ViewExposureData) obj;
        return Intrinsics.EZpvd((Object) this.f114a, (Object) viewExposureData.f114a) && Intrinsics.EZpvd(this.b, viewExposureData.b) && Intrinsics.EZpvd(this.c, viewExposureData.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Config getConfig() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventName() {
        return this.f114a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject getProperties() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.f114a;
        int iHashCode = str != null ? str.hashCode() : 0;
        JSONObject jSONObject = this.b;
        int iHashCode2 = jSONObject != null ? jSONObject.hashCode() : 0;
        Config config = this.c;
        return (((iHashCode * 31) + iHashCode2) * 31) + (config != null ? config.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfig(Config config) {
        this.c = config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = a.a("ViewExposureData(eventName=");
        sbA.append(this.f114a);
        sbA.append(", properties=");
        sbA.append(this.b);
        sbA.append(", config=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
