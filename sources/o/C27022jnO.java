package o;

import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27022jnO {
    public final java.lang.String EZpvd;
    public final ZapMode OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27022jnO copy$default(C27022jnO c27022jnO, int i, java.lang.String str, ZapMode zapMode, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c27022jnO.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = c27022jnO.EZpvd;
        }
        if ((i2 & 4) != 0) {
            zapMode = c27022jnO.OLrzqt;
        }
        return c27022jnO.EZpvd(i, str, zapMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27022jnO EZpvd(int i, @NotNull java.lang.String str, @NotNull ZapMode zapMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(zapMode, "");
        return new C27022jnO(i, str, zapMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZapMode copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27022jnO)) {
            return false;
        }
        C27022jnO c27022jnO = (C27022jnO) obj;
        return this.copydefault == c27022jnO.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c27022jnO.EZpvd) && this.OLrzqt == c27022jnO.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.copydefault) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ZapTabData(id=" + this.copydefault + ", name=" + this.EZpvd + ", mode=" + this.OLrzqt + ")";
    }

    public C27022jnO(int i, @NotNull java.lang.String str, @NotNull ZapMode zapMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(zapMode, "");
        this.copydefault = i;
        this.EZpvd = str;
        this.OLrzqt = zapMode;
    }
}
