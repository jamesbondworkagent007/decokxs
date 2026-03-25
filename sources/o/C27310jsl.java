package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27310jsl implements InterfaceC27312jsn {
    public final iMB KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27310jsl copy$default(C27310jsl c27310jsl, iMB imb, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            imb = c27310jsl.KWHzl;
        }
        return c27310jsl.EZpvd(imb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27310jsl EZpvd(@NotNull iMB imb) {
        Intrinsics.checkNotNullParameter(imb, "");
        return new C27310jsl(imb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27310jsl) && Intrinsics.EZpvd(this.KWHzl, ((C27310jsl) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OldReceiveTokenViewBinding(binding=" + this.KWHzl + ")";
    }

    public C27310jsl(@NotNull iMB imb) {
        Intrinsics.checkNotNullParameter(imb, "");
        this.KWHzl = imb;
    }

    @Override // o.InterfaceC27312jsn
    public android.view.View copydefault() {
        android.view.View root = this.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC27312jsn
    public C55258xgZ AEQbTJ() {
        C55258xgZ c55258xgZ = this.KWHzl.OLrzqt;
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
