package o;

import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.avU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8052avU {
    public final android.view.View AEQbTJ;
    public final android.view.WindowManager KWHzl;
    public final C8055avX OLrzqt;
    public final WindowManager.LayoutParams copydefault;

    public C8052avU(@NotNull android.view.View view, @NotNull WindowManager.LayoutParams layoutParams, @NotNull android.view.WindowManager windowManager, @NotNull C8055avX c8055avX) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        Intrinsics.checkNotNullParameter(windowManager, "");
        Intrinsics.checkNotNullParameter(c8055avX, "");
        this.AEQbTJ = view;
        this.copydefault = layoutParams;
        this.KWHzl = windowManager;
        this.OLrzqt = c8055avX;
    }

    public final android.animation.Animator KWHzl() {
        InterfaceC8115awe interfaceC8115aweValueOf = this.OLrzqt.valueOf();
        if (interfaceC8115aweValueOf != null) {
            return interfaceC8115aweValueOf.OLrzqt(this.AEQbTJ, this.copydefault, this.KWHzl, this.OLrzqt.getFieldNames());
        }
        return null;
    }

    public final android.animation.Animator OLrzqt() {
        InterfaceC8115awe interfaceC8115aweValueOf = this.OLrzqt.valueOf();
        if (interfaceC8115aweValueOf != null) {
            return interfaceC8115aweValueOf.AEQbTJ(this.AEQbTJ, this.copydefault, this.KWHzl, this.OLrzqt.getFieldNames());
        }
        return null;
    }
}
