package o;

import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17791fSk implements InterfaceC17789fSi {
    public final java.lang.String EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C17791fSk copy$default(C17791fSk c17791fSk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c17791fSk.EZpvd;
        }
        return c17791fSk.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17791fSk AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C17791fSk(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17791fSk) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C17791fSk) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExceedCriticalValue(criticalValue=" + this.EZpvd + ")";
    }

    public C17791fSk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = true;
    }

    @Override // o.InterfaceC17789fSi
    public java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33069mpW.KWHzl(context, C13754dXa.FragmentManager.zFZsbn, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", this.EZpvd)));
    }
}
