package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26690jhA implements InterfaceC26732jhq {
    public final C23788iJi AEQbTJ;

    public C26690jhA(@NotNull C23788iJi c23788iJi) {
        Intrinsics.checkNotNullParameter(c23788iJi, "");
        this.AEQbTJ = c23788iJi;
    }

    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        ConstraintLayout root = this.AEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC26732jhq
    public C55258xgZ OLrzqt() {
        C55258xgZ c55258xgZ = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    @Override // o.InterfaceC26732jhq
    public android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC26732jhq
    public android.widget.ImageView copydefault() {
        android.widget.ImageView imageView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }
}
