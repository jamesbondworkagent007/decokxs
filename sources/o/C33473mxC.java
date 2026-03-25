package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33473mxC {
    public final int AEQbTJ;
    public final int EZpvd;
    public final View.OnTouchListener KWHzl;
    public final Activity OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX INFO: renamed from: o.mxC$Activity */
    public interface Activity {
        void EZpvd(@NotNull android.view.View view, android.graphics.drawable.Drawable drawable);

        void KWHzl(@NotNull android.view.View view, android.graphics.drawable.Drawable drawable);
    }

    public C33473mxC(@NotNull android.widget.TextView textView, Activity activity) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.copydefault = textView;
        this.OLrzqt = activity;
        this.EZpvd = 2;
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: o.mxE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C33473mxC.KWHzl(this.AEQbTJ, view, motionEvent);
            }
        };
        this.KWHzl = onTouchListener;
        textView.setOnTouchListener(onTouchListener);
    }

    public static final boolean KWHzl(C33473mxC c33473mxC, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || c33473mxC.OLrzqt == null) {
            return false;
        }
        android.graphics.drawable.Drawable drawable = c33473mxC.copydefault.getCompoundDrawables()[c33473mxC.AEQbTJ];
        if (drawable != null && motionEvent.getRawX() <= c33473mxC.copydefault.getLeft() + drawable.getBounds().width()) {
            Activity activity = c33473mxC.OLrzqt;
            Intrinsics.copydefault(view);
            activity.EZpvd(view, drawable);
        }
        android.graphics.drawable.Drawable drawable2 = c33473mxC.copydefault.getCompoundDrawables()[c33473mxC.EZpvd];
        if (drawable2 == null || motionEvent.getRawX() < c33473mxC.copydefault.getRight() - drawable2.getBounds().width()) {
            return false;
        }
        Activity activity2 = c33473mxC.OLrzqt;
        Intrinsics.copydefault(view);
        activity2.KWHzl(view, drawable2);
        return false;
    }
}
