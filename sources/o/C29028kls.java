package o;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29028kls {
    public static final void OLrzqt(@NotNull final android.widget.HorizontalScrollView horizontalScrollView, @NotNull final C29032klw c29032klw) {
        Intrinsics.checkNotNullParameter(horizontalScrollView, "");
        Intrinsics.checkNotNullParameter(c29032klw, "");
        horizontalScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: o.klv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C29028kls.EZpvd(horizontalScrollView, c29032klw);
            }
        });
    }

    public static final void EZpvd(android.widget.HorizontalScrollView horizontalScrollView, C29032klw c29032klw) {
        int scrollX = horizontalScrollView.getScrollX();
        android.view.View childAt = horizontalScrollView.getChildAt(0);
        int iCopydefault = C56548yJl.copydefault((childAt != null ? childAt.getWidth() : 0) - horizontalScrollView.getWidth(), 0);
        c29032klw.setScrollProgress(iCopydefault > 0 ? scrollX / iCopydefault : 0.0f);
    }
}
