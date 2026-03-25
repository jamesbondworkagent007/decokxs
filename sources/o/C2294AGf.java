package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2294AGf {
    public static final int $stable = 8;
    public long AEQbTJ;
    public C2295AGg EZpvd;
    public java.lang.String KWHzl;
    public long OLrzqt;
    public java.lang.String copydefault;
    public boolean gEmmrt;
    public C2295AGg valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2294AGf EZpvd(long j, @NotNull java.lang.String str, @NotNull C2295AGg c2295AGg, long j2, @NotNull C2295AGg c2295AGg2, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c2295AGg, "");
        Intrinsics.checkNotNullParameter(c2295AGg2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C2294AGf(j, str, c2295AGg, j2, c2295AGg2, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2295AGg OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2294AGf)) {
            return false;
        }
        C2294AGf c2294AGf = (C2294AGf) obj;
        return this.AEQbTJ == c2294AGf.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2294AGf.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c2294AGf.EZpvd) && this.OLrzqt == c2294AGf.OLrzqt && Intrinsics.EZpvd(this.valueOf, c2294AGf.valueOf) && this.gEmmrt == c2294AGf.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2294AGf.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((java.lang.Long.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.valueOf.hashCode()) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PresetModel(presetType=" + this.AEQbTJ + ", name=" + this.KWHzl + ", buyPreset=" + this.EZpvd + ", id=" + this.OLrzqt + ", sellPreset=" + this.valueOf + ", supportChangeName=" + this.gEmmrt + ", chainId=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2295AGg valueOf() {
        return this.valueOf;
    }

    public C2294AGf(long j, @NotNull java.lang.String str, @NotNull C2295AGg c2295AGg, long j2, @NotNull C2295AGg c2295AGg2, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c2295AGg, "");
        Intrinsics.checkNotNullParameter(c2295AGg2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = j;
        this.KWHzl = str;
        this.EZpvd = c2295AGg;
        this.OLrzqt = j2;
        this.valueOf = c2295AGg2;
        this.gEmmrt = z;
        this.copydefault = str2;
    }
}
