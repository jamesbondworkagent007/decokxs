package o;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20285gdx {
    public final MevInfo.MevNode OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C20285gdx copy$default(C20285gdx c20285gdx, MevInfo.MevNode mevNode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mevNode = c20285gdx.OLrzqt;
        }
        return c20285gdx.OLrzqt(mevNode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevInfo.MevNode KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20285gdx OLrzqt(@NotNull MevInfo.MevNode mevNode) {
        Intrinsics.checkNotNullParameter(mevNode, "");
        return new C20285gdx(mevNode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20285gdx) && Intrinsics.EZpvd(this.OLrzqt, ((C20285gdx) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MEVSupportedNodeItem(nodeBean=" + this.OLrzqt + ")";
    }

    public C20285gdx(@NotNull MevInfo.MevNode mevNode) {
        Intrinsics.checkNotNullParameter(mevNode, "");
        this.OLrzqt = mevNode;
    }
}
