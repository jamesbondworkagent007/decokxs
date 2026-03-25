package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qZC {
    public void KWHzl(@NotNull android.view.View view, @NotNull android.view.MotionEvent motionEvent) {
        android.app.Activity activityAEQbTJ;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getAction() != 0 || (activityAEQbTJ = AEQbTJ(view.getContext())) == null) {
            return;
        }
        android.view.View currentFocus = activityAEQbTJ.getCurrentFocus();
        if (currentFocus != null && AEQbTJ(currentFocus, motionEvent) && copydefault(activityAEQbTJ, currentFocus)) {
            EZpvd(currentFocus);
        }
        if (KWHzl(activityAEQbTJ)) {
            EZpvd(view);
        }
    }

    public void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault(view);
    }

    public final android.app.Activity AEQbTJ(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return AEQbTJ(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private final boolean AEQbTJ(android.view.View view, android.view.MotionEvent motionEvent) {
        view.getHitRect(new android.graphics.Rect());
        return !r0.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private final boolean copydefault(android.content.Context context, android.view.View view) {
        java.lang.Object systemService = context.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        return ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final boolean KWHzl(android.app.Activity activity) {
        int height = activity.getWindow().getDecorView().getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return (height * 2) / 3 > rect.bottom;
    }

    public final void copydefault(android.view.View view) {
        if (view == null) {
            return;
        }
        java.lang.Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }
}
