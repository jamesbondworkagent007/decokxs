package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60055zue implements InterfaceC59997ztZ {
    public final java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60055zue copy$default(C60055zue c60055zue, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c60055zue.AEQbTJ;
        }
        return c60055zue.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59997ztZ
    public java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60055zue KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C60055zue(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C60055zue) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((C60055zue) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public C60055zue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    public java.lang.String toString() {
        return EZpvd();
    }
}
