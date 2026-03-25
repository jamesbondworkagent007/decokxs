package com.reown.android.internal.common.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class Redirect {
    public final boolean linkMode;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f93native;
    public final String universal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Redirect() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redirect.f93native;
        }
        if ((i & 2) != 0) {
            str2 = redirect.universal;
        }
        if ((i & 4) != 0) {
            z = redirect.linkMode;
        }
        return redirect.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.f93native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.linkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Redirect copy(@Json(name = "native") String str, @Json(name = "universal") String str2, @Json(name = "linkMode") boolean z) {
        return new Redirect(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Redirect)) {
            return false;
        }
        Redirect redirect = (Redirect) obj;
        return Intrinsics.EZpvd((Object) this.f93native, (Object) redirect.f93native) && Intrinsics.EZpvd((Object) this.universal, (Object) redirect.universal) && this.linkMode == redirect.linkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLinkMode() {
        return this.linkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNative() {
        return this.f93native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniversal() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.f93native;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.universal;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.linkMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Redirect(native=" + this.f93native + ", universal=" + this.universal + ", linkMode=" + this.linkMode + ")";
    }

    public Redirect(@Json(name = "native") String str, @Json(name = "universal") String str2, @Json(name = "linkMode") boolean z) {
        this.f93native = str;
        this.universal = str2;
        this.linkMode = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:7) call: com.reown.android.internal.common.model.Redirect.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ Redirect(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
