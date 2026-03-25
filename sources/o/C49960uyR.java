package o;

import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49960uyR {
    public static /* synthetic */ void setWindowSoftInput$default(android.app.Activity activity, android.view.View view, java.lang.Integer num, android.view.View view2, int i, int i2, java.lang.Object obj) {
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
            i = C33052mpF.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        EZpvd(activity, view, num, view2, i);
    }

    public static final void EZpvd(@NotNull android.app.Activity activity, android.view.View view, java.lang.Integer num, android.view.View view2, int i) {
        android.view.View viewFindViewById;
        Intrinsics.checkNotNullParameter(activity, "");
        android.view.Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        if (num != null) {
            viewFindViewById = activity.getWindow().getDecorView().findViewById(num.intValue());
        } else {
            viewFindViewById = null;
        }
        OLrzqt(window, view, viewFindViewById, view2, i);
    }

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
            i = C33052mpF.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        OLrzqt(fragment, view, num, view2, i);
    }

    public static final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, android.view.View view, java.lang.Integer num, android.view.View view2, int i) {
        android.view.View viewFindViewById;
        Intrinsics.checkNotNullParameter(fragment, "");
        android.view.Window window = fragment.requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        if (num != null) {
            viewFindViewById = fragment.requireActivity().getWindow().getDecorView().findViewById(num.intValue());
        } else {
            viewFindViewById = null;
        }
        OLrzqt(window, view, viewFindViewById, view2, i);
    }

    public static /* synthetic */ Unit setWindowSoftInput$default(android.view.View view, android.view.View view2, java.lang.Integer num, android.view.View view3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view2 = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            view3 = null;
        }
        if ((i2 & 8) != 0) {
            i = C33052mpF.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        return OLrzqt(view, view2, num, view3, i);
    }

    public static final Unit OLrzqt(@NotNull android.view.View view, android.view.View view2, java.lang.Integer num, android.view.View view3, int i) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        OLrzqt(window, view2, num != null ? window.getDecorView().findViewById(num.intValue()) : null, view3, i);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit setWindowSoftInput$default(androidx.fragment.app.DialogFragment dialogFragment, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view = null;
        }
        if ((i2 & 2) != 0) {
            view2 = dialogFragment.getView();
        }
        if ((i2 & 4) != 0) {
            view3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return EZpvd(dialogFragment, view, view2, view3, i);
    }

    public static final Unit EZpvd(@NotNull androidx.fragment.app.DialogFragment dialogFragment, android.view.View view, android.view.View view2, android.view.View view3, int i) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(dialogFragment, "");
        android.app.Dialog dialog = dialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return null;
        }
        OLrzqt(window, view, view2, view3, i);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit setWindowSoftInput$default(BottomSheetDialogFragment bottomSheetDialogFragment, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view = null;
        }
        if ((i2 & 2) != 0) {
            android.app.Dialog dialog = bottomSheetDialogFragment.getDialog();
            view2 = dialog != null ? dialog.findViewById(com.google.android.material.R.id.design_bottom_sheet) : null;
        }
        if ((i2 & 4) != 0) {
            view3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return EZpvd(bottomSheetDialogFragment, view, view2, view3, i);
    }

    public static final Unit EZpvd(@NotNull BottomSheetDialogFragment bottomSheetDialogFragment, android.view.View view, android.view.View view2, android.view.View view3, int i) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragment, "");
        android.app.Dialog dialog = bottomSheetDialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return null;
        }
        OLrzqt(window, view, view2, view3, i);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit setWindowSoftInput$default(android.app.Dialog dialog, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view = null;
        }
        if ((i2 & 2) != 0) {
            android.view.Window window = dialog.getWindow();
            view2 = window != null ? window.getDecorView() : null;
        }
        if ((i2 & 4) != 0) {
            view3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return AEQbTJ(dialog, view, view2, view3, i);
    }

    public static final Unit AEQbTJ(@NotNull android.app.Dialog dialog, android.view.View view, android.view.View view2, android.view.View view3, int i) {
        Intrinsics.checkNotNullParameter(dialog, "");
        android.view.Window window = dialog.getWindow();
        if (window == null) {
            return null;
        }
        OLrzqt(window, view, view2, view3, i);
        return Unit.INSTANCE;
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
        OLrzqt(window, view, view2, view3, i);
    }

    public static final void OLrzqt(@NotNull final android.view.Window window, android.view.View view, android.view.View view2, android.view.View view3, final int i) {
        Intrinsics.checkNotNullParameter(window, "");
        final WeakReference weakReference = new WeakReference(view);
        final WeakReference weakReference2 = new WeakReference(view2);
        final WeakReference weakReference3 = new WeakReference(view3);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.uyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C49960uyR.copydefault(weakReference, weakReference2, window, i, booleanRef2, weakReference3, booleanRef);
            }
        });
    }

    public static final void copydefault(WeakReference weakReference, WeakReference weakReference2, android.view.Window window, int i, Ref.BooleanRef booleanRef, WeakReference weakReference3, Ref.BooleanRef booleanRef2) {
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
