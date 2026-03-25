package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnFocusChangeListenerC54998xbe implements View.OnFocusChangeListener {
    public final View.OnFocusChangeListener AEQbTJ;
    public final View.OnFocusChangeListener OLrzqt;

    public ViewOnFocusChangeListenerC54998xbe(View.OnFocusChangeListener onFocusChangeListener, View.OnFocusChangeListener onFocusChangeListener2) {
        this.AEQbTJ = onFocusChangeListener;
        this.OLrzqt = onFocusChangeListener2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(@NotNull android.view.View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        View.OnFocusChangeListener onFocusChangeListener = this.AEQbTJ;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        View.OnFocusChangeListener onFocusChangeListener2 = this.OLrzqt;
        if (onFocusChangeListener2 != null) {
            onFocusChangeListener2.onFocusChange(view, z);
        }
    }
}
