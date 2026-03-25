package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;

/* JADX INFO: loaded from: classes16.dex */
public final class InfoFormSubmissionBody {
    public static final int $stable = 8;
    private final Map<String, Object> informs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InfoFormSubmissionBody() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormSubmissionBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoFormSubmissionBody copy$default(InfoFormSubmissionBody infoFormSubmissionBody, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = infoFormSubmissionBody.informs;
        }
        return infoFormSubmissionBody.copy(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> component1() {
        return this.informs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InfoFormSubmissionBody copy(Map<String, ? extends Object> map) {
        return new InfoFormSubmissionBody(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoFormSubmissionBody) && Intrinsics.EZpvd(this.informs, ((InfoFormSubmissionBody) obj).informs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> getInforms() {
        return this.informs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Map<String, Object> map = this.informs;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InfoFormSubmissionBody(informs=" + this.informs + ")";
    }

    public InfoFormSubmissionBody(Map<String, ? extends Object> map) {
        this.informs = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:18)) : (r1v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:17) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormSubmissionBody.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ InfoFormSubmissionBody(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map);
    }
}
