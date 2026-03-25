package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57498yjZ {
    public static final C57498yjZ EZpvd = new C57498yjZ();

    private C57498yjZ() {
    }

    public final void KWHzl(@NotNull final android.view.View view, final int i, final int i2, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object parent = view.getParent();
        Intrinsics.copydefault(parent, "");
        final android.view.View view2 = (android.view.View) parent;
        view2.post(new java.lang.Runnable() { // from class: o.yka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57498yjZ.KWHzl(view, i, i2, i3, i4, view2);
            }
        });
    }

    public static final void KWHzl(android.view.View view, int i, int i2, int i3, int i4, android.view.View view2) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        view2.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
