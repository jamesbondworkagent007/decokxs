package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SecurityLevel;

/* JADX INFO: renamed from: o.Aev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3068Aev {
    public static final int $stable = 8;
    public int AEQbTJ;
    public SecurityLevel EZpvd;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3068Aev copy$default(C3068Aev c3068Aev, int i, int i2, SecurityLevel securityLevel, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c3068Aev.copydefault;
        }
        if ((i3 & 2) != 0) {
            i2 = c3068Aev.AEQbTJ;
        }
        if ((i3 & 4) != 0) {
            securityLevel = c3068Aev.EZpvd;
        }
        return c3068Aev.KWHzl(i, i2, securityLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3068Aev KWHzl(int i, int i2, @NotNull SecurityLevel securityLevel) {
        Intrinsics.checkNotNullParameter(securityLevel, "");
        return new C3068Aev(i, i2, securityLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityLevel OLrzqt() {
        return this.EZpvd;
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
        if (!(obj instanceof C3068Aev)) {
            return false;
        }
        C3068Aev c3068Aev = (C3068Aev) obj;
        return this.copydefault == c3068Aev.copydefault && this.AEQbTJ == c3068Aev.AEQbTJ && this.EZpvd == c3068Aev.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SecurityLevelInfo(totalSecurityMethod=" + this.copydefault + ", enabledMethodCount=" + this.AEQbTJ + ", securityLevel=" + this.EZpvd + ")";
    }

    public C3068Aev(int i, int i2, @NotNull SecurityLevel securityLevel) {
        Intrinsics.checkNotNullParameter(securityLevel, "");
        this.copydefault = i;
        this.AEQbTJ = i2;
        this.EZpvd = securityLevel;
    }
}
