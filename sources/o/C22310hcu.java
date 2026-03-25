package o;

import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22310hcu {
    public static /* synthetic */ void setWindowSoftInput$default(androidx.fragment.app.Fragment fragment, android.view.View view, java.lang.Integer num, android.view.View view2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            view2 = null;
        }
        if ((i2 & 8) != 0) {
            i = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        EZpvd(fragment, view, num, view2, i);
    }

    public static final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, android.view.View view, java.lang.Integer num, android.view.View view2, int i) {
        android.view.View viewFindViewById;
        Intrinsics.checkNotNullParameter(fragment, "");
        android.view.Window window = fragment.requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        if (num != null) {
            viewFindViewById = fragment.requireActivity().getWindow().getDecorView().findViewById(num.intValue());
        } else {
            viewFindViewById = null;
        }
        KWHzl(window, view, viewFindViewById, view2, i);
    }

    public static /* synthetic */ void setWindowSoftInput$default(android.view.Window window, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view = null;
        }
        if ((i2 & 2) != 0) {
            view2 = null;
        }
        if ((i2 & 4) != 0) {
            view3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        KWHzl(window, view, view2, view3, i);
    }

    public static final void KWHzl(@NotNull final android.view.Window window, android.view.View view, android.view.View view2, android.view.View view3, final int i) {
        Intrinsics.checkNotNullParameter(window, "");
        final WeakReference weakReference = new WeakReference(view);
        final WeakReference weakReference2 = new WeakReference(view2);
        final WeakReference weakReference3 = new WeakReference(view3);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.hcs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C22310hcu.AEQbTJ(weakReference, weakReference2, window, i, booleanRef2, weakReference3, booleanRef);
            }
        });
    }

    public static final void AEQbTJ(WeakReference weakReference, WeakReference weakReference2, android.view.Window window, int i, Ref.BooleanRef booleanRef, WeakReference weakReference3, Ref.BooleanRef booleanRef2) {
        int height;
        android.view.View view;
        if (weakReference.get() == null || weakReference2.get() == null) {
            height = 0;
        } else {
            int[] iArr = new int[2];
            java.lang.Object obj = weakReference.get();
            Intrinsics.copydefault(obj);
            ((android.view.View) obj).getLocationInWindow(iArr);
            int i2 = iArr[1];
            java.lang.Object obj2 = weakReference.get();
            Intrinsics.copydefault(obj2);
            height = i2 + ((android.view.View) obj2).getHeight();
        }
        int bottom = window.getDecorView().getBottom();
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(window.getDecorView());
        if (rootWindowInsets == null) {
            return;
        }
        int i3 = ((bottom - height) - rootWindowInsets.getInsets(WindowInsetsCompat.Type.ime()).bottom) - i;
        if (rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
            boolean z = weakReference3.get() == null || ((view = (android.view.View) weakReference3.get()) != null && view.hasFocus());
            booleanRef.element = z;
            if (booleanRef2.element || !z || i3 >= 0) {
                return;
            }
            java.lang.Object obj3 = weakReference2.get();
            NestedScrollView nestedScrollView = obj3 instanceof NestedScrollView ? (NestedScrollView) obj3 : null;
            if (nestedScrollView != null) {
                nestedScrollView.smoothScrollBy(0, -i3, 300);
            }
            booleanRef2.element = true;
            return;
        }
        booleanRef2.element = false;
    }
}
