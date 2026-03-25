package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26692jhC implements InterfaceC26732jhq {
    public final C23795iJp AEQbTJ;

    public C26692jhC(@NotNull C23795iJp c23795iJp) {
        Intrinsics.checkNotNullParameter(c23795iJp, "");
        this.AEQbTJ = c23795iJp;
    }

    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        ConstraintLayout root = this.AEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC26732jhq
    public C55258xgZ OLrzqt() {
        C55258xgZ c55258xgZ = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    @Override // o.InterfaceC26732jhq
    public android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC26732jhq
    public android.widget.ImageView copydefault() {
        android.widget.ImageView imageView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }
}
