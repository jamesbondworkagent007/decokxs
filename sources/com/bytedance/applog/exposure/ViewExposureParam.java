package com.bytedance.applog.exposure;

import com.bytedance.bdtracker.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewExposureParam {
    public final JSONObject exposureParam;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureParam(@NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        this.exposureParam = jSONObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:org.json.JSONObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:org.json.JSONObject:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] call: org.json.JSONObject.<init>():void type: CONSTRUCTOR) : (r1v0 org.json.JSONObject))
 A[MD:(org.json.JSONObject):void (m)] call: com.bytedance.applog.exposure.ViewExposureParam.<init>(org.json.JSONObject):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewExposureParam(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new JSONObject() : jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ViewExposureParam copy$default(ViewExposureParam viewExposureParam, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = viewExposureParam.exposureParam;
        }
        return viewExposureParam.copy(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject component1() {
        return this.exposureParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewExposureParam copy(@NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        return new ViewExposureParam(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ViewExposureParam) && Intrinsics.EZpvd(this.exposureParam, ((ViewExposureParam) obj).exposureParam);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject getExposureParam() {
        return this.exposureParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        JSONObject jSONObject = this.exposureParam;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = a.a("ViewExposureParam(exposureParam=");
        sbA.append(this.exposureParam);
        sbA.append(")");
        return sbA.toString();
    }
}
