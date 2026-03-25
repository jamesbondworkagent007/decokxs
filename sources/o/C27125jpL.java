package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27125jpL implements InterfaceC27124jpK {
    public final iMU copydefault;

    public C27125jpL(@NotNull iMU imu) {
        Intrinsics.checkNotNullParameter(imu, "");
        this.copydefault = imu;
    }

    @Override // o.InterfaceC27124jpK
    public android.view.View KWHzl() {
        android.widget.TextView textView = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27124jpK
    public android.widget.TextView copydefault() {
        android.widget.TextView textView = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }
}
