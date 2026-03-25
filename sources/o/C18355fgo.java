package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18355fgo {
    public static final C18355fgo KWHzl = new C18355fgo();

    private C18355fgo() {
    }

    public final void EZpvd(@NotNull android.app.Activity activity, int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i == 2 || i == 3) {
            ActivityC16023ecB.Companion.copydefault(activity, i);
            return;
        }
        if (i2 == 3) {
            FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                return;
            }
            C18348fgh.Companion.EZpvd(str).show(supportFragmentManager);
            return;
        }
        ActivityC18357fgq.Companion.OLrzqt(activity, i, i2, str, str2);
    }
}
