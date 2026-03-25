package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40497qYa {
    java.lang.Boolean KWHzl(@NotNull android.view.ViewGroup viewGroup, android.view.View view, @NotNull android.view.MotionEvent motionEvent, boolean z);

    /* JADX INFO: renamed from: o.qYa$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Boolean handleInterceptTouchEvent$default(InterfaceC40497qYa interfaceC40497qYa, android.view.ViewGroup viewGroup, android.view.View view, android.view.MotionEvent motionEvent, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleInterceptTouchEvent");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return interfaceC40497qYa.KWHzl(viewGroup, view, motionEvent, z);
        }
    }
}
