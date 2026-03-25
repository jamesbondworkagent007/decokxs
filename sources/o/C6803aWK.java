package o;

import com.okinc.biz.model.ModuleType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6803aWK {
    public final ModuleType EZpvd;
    public final java.lang.String KWHzl;
    public final JsonObject OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6803aWK copy$default(C6803aWK c6803aWK, ModuleType moduleType, java.lang.String str, java.lang.String str2, JsonObject jsonObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moduleType = c6803aWK.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c6803aWK.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c6803aWK.KWHzl;
        }
        if ((i & 8) != 0) {
            jsonObject = c6803aWK.OLrzqt;
        }
        return c6803aWK.EZpvd(moduleType, str, str2, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6803aWK EZpvd(@NotNull ModuleType moduleType, java.lang.String str, java.lang.String str2, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(moduleType, "");
        return new C6803aWK(moduleType, str, str2, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleType KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6803aWK)) {
            return false;
        }
        C6803aWK c6803aWK = (C6803aWK) obj;
        return this.EZpvd == c6803aWK.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c6803aWK.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c6803aWK.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c6803aWK.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        JsonObject jsonObject = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RatingPageRequest(moduleType=" + this.EZpvd + ", ratingNotificationId=" + this.copydefault + ", businessId=" + this.KWHzl + ", moduleAttributes=" + this.OLrzqt + ")";
    }

    public C6803aWK(@NotNull ModuleType moduleType, java.lang.String str, java.lang.String str2, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(moduleType, "");
        this.EZpvd = moduleType;
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 com.okinc.biz.model.ModuleType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r5v0 kotlinx.serialization.json.JsonObject))
 A[MD:(com.okinc.biz.model.ModuleType, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:6) call: o.aWK.<init>(com.okinc.biz.model.ModuleType, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ C6803aWK(ModuleType moduleType, java.lang.String str, java.lang.String str2, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(moduleType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : jsonObject);
    }
}
