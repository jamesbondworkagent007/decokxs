package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zzs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60288zzs {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public int EZpvd;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60288zzs copy$default(C60288zzs c60288zzs, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c60288zzs.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            str2 = c60288zzs.KWHzl;
        }
        if ((i2 & 4) != 0) {
            i = c60288zzs.EZpvd;
        }
        return c60288zzs.copydefault(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60288zzs copydefault(@NotNull java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C60288zzs(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60288zzs)) {
            return false;
        }
        C60288zzs c60288zzs = (C60288zzs) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c60288zzs.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c60288zzs.KWHzl) && this.EZpvd == c60288zzs.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.String str = this.KWHzl;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BleDeviceInfo(deviceId=" + this.AEQbTJ + ", name=" + this.KWHzl + ", rssi=" + this.EZpvd + ")";
    }

    public C60288zzs(@NotNull java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.EZpvd = i;
    }
}
