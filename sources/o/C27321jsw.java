package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27321jsw implements InterfaceC27199jqg {
    public final AbstractC23861iMa EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27321jsw copy$default(C27321jsw c27321jsw, AbstractC23861iMa abstractC23861iMa, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC23861iMa = c27321jsw.EZpvd;
        }
        return c27321jsw.AEQbTJ(abstractC23861iMa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27321jsw AEQbTJ(@NotNull AbstractC23861iMa abstractC23861iMa) {
        Intrinsics.checkNotNullParameter(abstractC23861iMa, "");
        return new C27321jsw(abstractC23861iMa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27321jsw) && Intrinsics.EZpvd(this.EZpvd, ((C27321jsw) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "V1InvestGainsViewBinding(binding=" + this.EZpvd + ")";
    }

    public C27321jsw(@NotNull AbstractC23861iMa abstractC23861iMa) {
        Intrinsics.checkNotNullParameter(abstractC23861iMa, "");
        this.EZpvd = abstractC23861iMa;
    }

    @Override // o.InterfaceC27199jqg
    public android.view.View EZpvd() {
        android.view.View root = this.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.TextView copydefault() {
        android.widget.TextView textView = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.LinearLayout OLrzqt() {
        android.widget.LinearLayout linearLayout = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }
}
