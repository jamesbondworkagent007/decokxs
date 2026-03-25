package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.dyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15141dyi {
    public static final C15141dyi copydefault = new C15141dyi();

    private C15141dyi() {
    }

    public final void AEQbTJ(android.content.Context context) {
        if (context == null) {
            return;
        }
        java.lang.Object systemService = context.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        java.lang.String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
        for (int i = 0; i < 3; i++) {
            try {
                java.lang.reflect.Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                java.lang.Object obj = declaredField.get(inputMethodManager);
                if (obj != null && (obj instanceof android.view.View)) {
                    if (!Intrinsics.EZpvd(((android.view.View) obj).getContext(), context)) {
                        return;
                    } else {
                        declaredField.set(inputMethodManager, null);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
