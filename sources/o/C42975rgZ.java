package o;

import android.view.ViewGroup;
import com.okinc.core.widget.SortTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42975rgZ {
    public static final C42975rgZ KWHzl = new C42975rgZ();

    private C42975rgZ() {
    }

    public final void KWHzl(int i, final SortTextView sortTextView, final SortTextView sortTextView2) {
        try {
            android.graphics.Rect rect = new android.graphics.Rect();
            sortTextView.getGlobalVisibleRect(rect);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            sortTextView2.getGlobalVisibleRect(rect2);
            if (rect.isEmpty() || rect2.isEmpty() || !android.graphics.Rect.intersects(rect, rect2)) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = sortTextView.getLayoutParams();
            final Ref.IntRef intRef = new Ref.IntRef();
            int i2 = i - 5;
            intRef.element = i2;
            layoutParams.width = i2;
            sortTextView.setLayoutParams(layoutParams);
            sortTextView.postDelayed(new java.lang.Runnable() { // from class: o.rgX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C42975rgZ.OLrzqt(intRef, sortTextView, sortTextView2);
                }
            }, 0L);
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void OLrzqt(Ref.IntRef intRef, SortTextView sortTextView, SortTextView sortTextView2) {
        KWHzl.KWHzl(intRef.element, sortTextView, sortTextView2);
    }

    public final void OLrzqt(@NotNull SortTextView sortTextView, @NotNull SortTextView sortTextView2) {
        Intrinsics.checkNotNullParameter(sortTextView, "");
        Intrinsics.checkNotNullParameter(sortTextView2, "");
        KWHzl(sortTextView.getMeasuredWidth(), sortTextView, sortTextView2);
    }
}
