package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27274jsB implements InterfaceC27199jqg {
    public final iLY EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27274jsB copy$default(C27274jsB c27274jsB, iLY ily, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ily = c27274jsB.EZpvd;
        }
        return c27274jsB.EZpvd(ily);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27274jsB EZpvd(@NotNull iLY ily) {
        Intrinsics.checkNotNullParameter(ily, "");
        return new C27274jsB(ily);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27274jsB) && Intrinsics.EZpvd(this.EZpvd, ((C27274jsB) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "V2InvestGainsViewBinding(binding=" + this.EZpvd + ")";
    }

    public C27274jsB(@NotNull iLY ily) {
        Intrinsics.checkNotNullParameter(ily, "");
        this.EZpvd = ily;
    }

    @Override // o.InterfaceC27199jqg
    public android.view.View EZpvd() {
        android.view.View root = this.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.TextView copydefault() {
        android.widget.TextView textView = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.LinearLayout OLrzqt() {
        android.widget.LinearLayout linearLayout = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    @Override // o.InterfaceC27199jqg
    public android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }
}
