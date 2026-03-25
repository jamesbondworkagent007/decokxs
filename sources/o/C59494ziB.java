package o;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ziB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59494ziB implements InterfaceC59495ziC {
    public final WeakReference<android.app.Activity> EZpvd;
    public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> OLrzqt;

    public C59494ziB(@NotNull android.app.Activity activity, @NotNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(onGlobalLayoutListener, "");
        this.EZpvd = new WeakReference<>(activity);
        this.OLrzqt = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // o.InterfaceC59495ziC
    public void copydefault() {
        android.app.Activity activity = this.EZpvd.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.OLrzqt.get();
        if (activity != null && onGlobalLayoutListener != null) {
            C59541ziw.AEQbTJ.OLrzqt(activity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.EZpvd.clear();
        this.OLrzqt.clear();
    }
}
