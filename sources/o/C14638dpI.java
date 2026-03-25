package o;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14638dpI {
    public final android.app.Activity AEQbTJ;
    public ViewTreeObserver.OnGlobalLayoutListener OLrzqt;
    public long copydefault;

    /* JADX INFO: renamed from: o.dpI$Application */
    public interface Application {
        void AEQbTJ(boolean z, int i);
    }

    public C14638dpI(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AEQbTJ = activity;
    }

    public final void copydefault(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C33566myq c33566myq = C33566myq.EZpvd;
        android.app.Application application2 = this.AEQbTJ.getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "");
        final int iOLrzqt = c33566myq.OLrzqt(application2);
        this.OLrzqt = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.dpK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C14638dpI.OLrzqt(this.EZpvd, iOLrzqt, application);
            }
        };
        this.AEQbTJ.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
    }

    public static final void OLrzqt(C14638dpI c14638dpI, int i, Application application) {
        c14638dpI.copydefault = java.lang.System.currentTimeMillis();
        android.graphics.Rect rect = new android.graphics.Rect();
        c14638dpI.AEQbTJ.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = i - (rect.bottom - rect.top);
        application.AEQbTJ(i2 > i / 3, i2);
    }

    public final void EZpvd() {
        this.AEQbTJ.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.OLrzqt);
    }
}
