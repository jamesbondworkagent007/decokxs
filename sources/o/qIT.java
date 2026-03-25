package o;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class qIT {
    public static final void OLrzqt(@NotNull final FloatingActionButton floatingActionButton) {
        Intrinsics.checkNotNullParameter(floatingActionButton, "");
        floatingActionButton.post(new java.lang.Runnable() { // from class: o.qIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                qIT.EZpvd(floatingActionButton);
            }
        });
    }

    public static final void EZpvd(FloatingActionButton floatingActionButton) {
        android.content.Context context = floatingActionButton.getContext();
        if (!floatingActionButton.isInLayout() || context == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = C56548yJl.copydefault(0, marginLayoutParams.bottomMargin - C7857arj.AEQbTJ(context));
        }
    }
}
