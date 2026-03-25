package o;

import com.okinc.business.defi.wallet.tx.send.adapter.SendCoinGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19579gHp {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final SendCoinGroup KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C19579gHp copy$default(C19579gHp c19579gHp, java.lang.String str, java.lang.String str2, SendCoinGroup sendCoinGroup, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c19579gHp.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c19579gHp.AEQbTJ;
        }
        if ((i & 4) != 0) {
            sendCoinGroup = c19579gHp.KWHzl;
        }
        return c19579gHp.KWHzl(str, str2, sendCoinGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendCoinGroup KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19579gHp KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SendCoinGroup sendCoinGroup) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(sendCoinGroup, "");
        return new C19579gHp(str, str2, sendCoinGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19579gHp)) {
            return false;
        }
        C19579gHp c19579gHp = (C19579gHp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c19579gHp.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c19579gHp.AEQbTJ) && this.KWHzl == c19579gHp.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SendCoinReceiveTabItem(tabName=" + this.EZpvd + ", tabTag=" + this.AEQbTJ + ", sendCoinGroup=" + this.KWHzl + ")";
    }

    public C19579gHp(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SendCoinGroup sendCoinGroup) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(sendCoinGroup, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = sendCoinGroup;
    }
}
