package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18377fhJ {
    public final java.util.List<InterfaceC18392fhY> AEQbTJ;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fhJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C18377fhJ copy$default(C18377fhJ c18377fhJ, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c18377fhJ.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c18377fhJ.copydefault;
        }
        return c18377fhJ.copydefault(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC18392fhY> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18377fhJ copydefault(@NotNull java.util.List<? extends InterfaceC18392fhY> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C18377fhJ(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18377fhJ)) {
            return false;
        }
        C18377fhJ c18377fhJ = (C18377fhJ) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c18377fhJ.AEQbTJ) && this.copydefault == c18377fhJ.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SelectNetworkState(walletNetworkList=" + this.AEQbTJ + ", isContinueButtonEnabled=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.fhY> */
    /* JADX WARN: Multi-variable type inference failed */
    public C18377fhJ(@NotNull java.util.List<? extends InterfaceC18392fhY> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.copydefault = z;
    }
}
