package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5989aGq {
    public static final int $stable = 0;

    @SerializedName("unlockToken")
    private final java.lang.String unlockToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5989aGq copy$default(C5989aGq c5989aGq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5989aGq.unlockToken;
        }
        return c5989aGq.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5989aGq AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C5989aGq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5989aGq) && Intrinsics.EZpvd((java.lang.Object) this.unlockToken, (java.lang.Object) ((C5989aGq) obj).unlockToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.unlockToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegistrationStartBody(unlockToken=" + this.unlockToken + ")";
    }

    public C5989aGq(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unlockToken = str;
    }
}
