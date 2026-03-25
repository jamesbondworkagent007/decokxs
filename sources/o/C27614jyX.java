package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27614jyX {
    public final java.lang.String AEQbTJ;
    public final JsonObject KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27614jyX copy$default(C27614jyX c27614jyX, java.lang.String str, java.lang.String str2, JsonObject jsonObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c27614jyX.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c27614jyX.AEQbTJ;
        }
        if ((i & 4) != 0) {
            jsonObject = c27614jyX.KWHzl;
        }
        return c27614jyX.OLrzqt(str, str2, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27614jyX OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C27614jyX(str, str2, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27614jyX)) {
            return false;
        }
        C27614jyX c27614jyX = (C27614jyX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27614jyX.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27614jyX.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c27614jyX.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        JsonObject jsonObject = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WebsocketParam(chainId=" + this.copydefault + ", tokenAddress=" + this.AEQbTJ + ", extraParams=" + this.KWHzl + ")";
    }

    public C27614jyX(@NotNull java.lang.String str, @NotNull java.lang.String str2, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r3v0 kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:5) call: o.jyX.<init>(java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ C27614jyX(java.lang.String str, java.lang.String str2, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : jsonObject);
    }
}
