package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27311jsm implements InterfaceC27312jsn {
    public final iMK KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27311jsm copy$default(C27311jsm c27311jsm, iMK imk, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            imk = c27311jsm.KWHzl;
        }
        return c27311jsm.EZpvd(imk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27311jsm EZpvd(@NotNull iMK imk) {
        Intrinsics.checkNotNullParameter(imk, "");
        return new C27311jsm(imk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27311jsm) && Intrinsics.EZpvd(this.KWHzl, ((C27311jsm) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NewReceiveTokenViewBinding(binding=" + this.KWHzl + ")";
    }

    public C27311jsm(@NotNull iMK imk) {
        Intrinsics.checkNotNullParameter(imk, "");
        this.KWHzl = imk;
    }

    @Override // o.InterfaceC27312jsn
    public android.view.View copydefault() {
        android.view.View root = this.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC27312jsn
    public C55258xgZ AEQbTJ() {
        C55258xgZ c55258xgZ = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    @Override // o.InterfaceC27312jsn
    public android.widget.LinearLayout EZpvd() {
        android.widget.LinearLayout linearLayout = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }
}
