package o;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C54976xbI {
    public ViewTreeObserver.OnGlobalLayoutListener AEQbTJ;
    public android.app.Activity EZpvd;
    public StateListAnimator KWHzl;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.xbI$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt(boolean z, int i);
    }

    public void AEQbTJ(@NotNull final android.app.Activity activity, final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
        this.KWHzl = stateListAnimator;
        Intrinsics.copydefault(activity);
        final android.view.View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        this.AEQbTJ = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.xbM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C54976xbI.OLrzqt(this.AEQbTJ, activity, decorView, stateListAnimator);
            }
        };
        android.app.Activity activity2 = this.EZpvd;
        Intrinsics.copydefault(activity2);
        activity2.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.AEQbTJ);
    }

    public static final void OLrzqt(C54976xbI c54976xbI, android.app.Activity activity, android.view.View view, StateListAnimator stateListAnimator) {
        boolean zCopydefault = c54976xbI.copydefault(activity);
        if (zCopydefault == c54976xbI.copydefault) {
            return;
        }
        c54976xbI.copydefault = zCopydefault;
        int height = view.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (stateListAnimator != null) {
            stateListAnimator.OLrzqt(c54976xbI.copydefault(activity), height - rect.bottom);
        }
    }

    public final boolean copydefault(android.app.Activity activity) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById;
        android.view.View childAt = viewGroup.getChildAt(0);
        childAt.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int height = childAt.getRootView().getHeight();
        return ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
    }
}
