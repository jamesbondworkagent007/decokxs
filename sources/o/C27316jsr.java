package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27316jsr implements InterfaceC27313jso {
    public final iMA EZpvd;

    public C27316jsr(@NotNull iMA ima) {
        Intrinsics.checkNotNullParameter(ima, "");
        this.EZpvd = ima;
    }

    @Override // o.InterfaceC27313jso
    public android.widget.TextView gEmmrt() {
        android.widget.TextView textView = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27313jso
    public android.widget.ImageView EZpvd() {
        android.widget.ImageView imageView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    @Override // o.InterfaceC27313jso
    public C27212jqt valueOf() {
        C27212jqt c27212jqt = this.EZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c27212jqt, "");
        return c27212jqt;
    }

    @Override // o.InterfaceC27313jso
    public C27212jqt AYXKKw() {
        C27212jqt c27212jqt = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27212jqt, "");
        return c27212jqt;
    }

    @Override // o.InterfaceC27313jso
    public android.widget.TextView AhwBna() {
        android.widget.TextView textView = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27313jso
    public LinearLayoutCompat djBIcL() {
        LinearLayoutCompat linearLayoutCompat = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        return linearLayoutCompat;
    }

    @Override // o.InterfaceC27313jso
    public android.widget.ImageView OLrzqt() {
        android.widget.ImageView imageView = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    @Override // o.InterfaceC27313jso
    public android.widget.ImageView AEQbTJ() {
        android.widget.ImageView imageView = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    @Override // o.InterfaceC27313jso
    public android.widget.ImageView copydefault() {
        android.widget.ImageView imageView = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    @Override // o.InterfaceC27313jso
    public android.view.View KWHzl() {
        ConstraintLayout root = this.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }
}
