package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43240rlZ {
    public static final int $stable = 0;
    public final boolean isRequired;
    public final java.lang.String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C43240rlZ copy$default(C43240rlZ c43240rlZ, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c43240rlZ.key;
        }
        if ((i & 2) != 0) {
            z = c43240rlZ.isRequired;
        }
        return c43240rlZ.EZpvd(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43240rlZ EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C43240rlZ(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43240rlZ)) {
            return false;
        }
        C43240rlZ c43240rlZ = (C43240rlZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.key, (java.lang.Object) c43240rlZ.key) && this.isRequired == c43240rlZ.isRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.key.hashCode() * 31) + java.lang.Boolean.hashCode(this.isRequired);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ParamInfo(key=" + this.key + ", isRequired=" + this.isRequired + ")";
    }

    public C43240rlZ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        this.isRequired = z;
    }
}
