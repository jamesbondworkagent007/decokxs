package o;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52688wUr {
    public static final C52688wUr copydefault = new C52688wUr();

    private C52688wUr() {
    }

    public final void KWHzl(@NotNull final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.wUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                return C52688wUr.AEQbTJ(view, view2, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat AEQbTJ(android.view.View view, android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(view.getPaddingLeft(), insets.top, view.getPaddingRight(), view.getPaddingBottom());
        return windowInsetsCompat;
    }

    public final void OLrzqt(@NotNull final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.wUq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                return C52688wUr.copydefault(view, view2, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat copydefault(android.view.View view, android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.bottom);
        return windowInsetsCompat;
    }
}
