package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45069sio {
    public static final int KWHzl = C55167xeo.copydefault;
    public final int AEQbTJ;
    public final boolean OLrzqt;
    public final C55167xeo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C45069sio copy$default(C45069sio c45069sio, int i, C55167xeo c55167xeo, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c45069sio.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            c55167xeo = c45069sio.copydefault;
        }
        if ((i2 & 4) != 0) {
            z = c45069sio.OLrzqt;
        }
        return c45069sio.AEQbTJ(i, c55167xeo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45069sio AEQbTJ(int i, @NotNull C55167xeo c55167xeo, boolean z) {
        Intrinsics.checkNotNullParameter(c55167xeo, "");
        return new C45069sio(i, c55167xeo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55167xeo OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45069sio)) {
            return false;
        }
        C45069sio c45069sio = (C45069sio) obj;
        return this.AEQbTJ == c45069sio.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c45069sio.copydefault) && this.OLrzqt == c45069sio.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NetworkDisplayModel(networkId=" + this.AEQbTJ + ", outLineCardData=" + this.copydefault + ", selected=" + this.OLrzqt + ")";
    }

    public C45069sio(int i, @NotNull C55167xeo c55167xeo, boolean z) {
        Intrinsics.checkNotNullParameter(c55167xeo, "");
        this.AEQbTJ = i;
        this.copydefault = c55167xeo;
        this.OLrzqt = z;
    }
}
