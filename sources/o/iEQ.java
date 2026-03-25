package o;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEQ {
    public final JsonObject AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iEQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iEQ copy$default(iEQ ieq, java.util.Map map, JsonObject jsonObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = ieq.KWHzl;
        }
        if ((i & 2) != 0) {
            jsonObject = ieq.AEQbTJ;
        }
        return ieq.AEQbTJ(map, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEQ AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new iEQ(map, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEQ)) {
            return false;
        }
        iEQ ieq = (iEQ) obj;
        return Intrinsics.EZpvd(this.KWHzl, ieq.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, ieq.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubmitTransactionParams(headers=" + this.KWHzl + ", body=" + this.AEQbTJ + ")";
    }

    public iEQ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.KWHzl = map;
        this.AEQbTJ = jsonObject;
    }
}
