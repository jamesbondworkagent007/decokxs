package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27527jwq implements InterfaceC27525jwo {
    public final C23904iNq EZpvd;

    public C27527jwq(@NotNull C23904iNq c23904iNq) {
        Intrinsics.checkNotNullParameter(c23904iNq, "");
        this.EZpvd = c23904iNq;
    }

    @Override // o.InterfaceC27525jwo
    public android.view.View copydefault() {
        ConstraintLayout root = this.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC27525jwo
    public C27308jsj OLrzqt() {
        C27308jsj c27308jsj = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27308jsj, "");
        return c27308jsj;
    }

    @Override // o.InterfaceC27525jwo
    public C55033xcM EZpvd() {
        C55033xcM c55033xcM = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55033xcM, "");
        return c55033xcM;
    }

    @Override // o.InterfaceC27525jwo
    public android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27525jwo
    public android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27525jwo
    public void EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.EZpvd.EZpvd.setTextByAnimation(((java.lang.Object) charSequence) + " " + ((java.lang.Object) charSequence2));
    }
}
