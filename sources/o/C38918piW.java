package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.piW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38918piW {
    public java.util.ArrayList<C38920piY> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.piW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38918piW copy$default(C38918piW c38918piW, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = c38918piW.copydefault;
        }
        return c38918piW.EZpvd(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38918piW EZpvd(@NotNull java.util.ArrayList<C38920piY> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new C38918piW(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C38920piY> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38918piW) && Intrinsics.EZpvd(this.copydefault, ((C38918piW) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResourceBean(list=" + this.copydefault + ")";
    }

    public C38918piW(@NotNull java.util.ArrayList<C38920piY> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.copydefault = arrayList;
    }
}
