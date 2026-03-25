package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class OnDemandKycFormSubmissionBody {
    public static final int $stable = 8;
    private String id;
    private String target;
    private String type;
    private Map<String, ? extends Object> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OnDemandKycFormSubmissionBody() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKycFormSubmissionBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnDemandKycFormSubmissionBody copy$default(OnDemandKycFormSubmissionBody onDemandKycFormSubmissionBody, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onDemandKycFormSubmissionBody.type;
        }
        if ((i & 2) != 0) {
            str2 = onDemandKycFormSubmissionBody.id;
        }
        if ((i & 4) != 0) {
            map = onDemandKycFormSubmissionBody.values;
        }
        if ((i & 8) != 0) {
            str3 = onDemandKycFormSubmissionBody.target;
        }
        return onDemandKycFormSubmissionBody.copy(str, str2, map, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> component3() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnDemandKycFormSubmissionBody copy(@NotNull String str, String str2, Map<String, ? extends Object> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OnDemandKycFormSubmissionBody(str, str2, map, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnDemandKycFormSubmissionBody)) {
            return false;
        }
        OnDemandKycFormSubmissionBody onDemandKycFormSubmissionBody = (OnDemandKycFormSubmissionBody) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) onDemandKycFormSubmissionBody.type) && Intrinsics.EZpvd((Object) this.id, (Object) onDemandKycFormSubmissionBody.id) && Intrinsics.EZpvd(this.values, onDemandKycFormSubmissionBody.values) && Intrinsics.EZpvd((Object) this.target, (Object) onDemandKycFormSubmissionBody.target);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        String str = this.id;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Map<String, ? extends Object> map = this.values;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.target.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTarget(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.target = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValues(Map<String, ? extends Object> map) {
        this.values = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnDemandKycFormSubmissionBody(type=" + this.type + ", id=" + this.id + ", values=" + this.values + ", target=" + this.target + ")";
    }

    public OnDemandKycFormSubmissionBody(@NotNull String str, String str2, Map<String, ? extends Object> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.id = str2;
        this.values = map;
        this.target = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("form") : (r3v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000d: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0013: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:12) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.String):void (m)] (LINE:9) call: com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKycFormSubmissionBody.<init>(java.lang.String, java.lang.String, java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ OnDemandKycFormSubmissionBody(String str, String str2, Map map, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "form" : str2, (i & 4) != 0 ? new LinkedHashMap() : map, (i & 8) != 0 ? "" : str3);
    }
}
