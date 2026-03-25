package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.wallet.api.bean.ThemeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fRz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17779fRz {

    /* JADX INFO: renamed from: o.fRz$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ThemeType.values().length];
            try {
                iArr[ThemeType.NIGHT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeType.DEFAULT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public static final android.content.Context OLrzqt(@NotNull android.content.Context context, @NotNull ThemeType themeType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(themeType, "");
        int i = StateListAnimator.EZpvd[themeType.ordinal()];
        boolean zOLrzqt = true;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zOLrzqt = C33492mxV.OLrzqt();
        }
        return C57217yeJ.copydefault(context, zOLrzqt, zOLrzqt ? C13754dXa.LoaderManager.ejfBZ : C13754dXa.LoaderManager.fJNWhG);
    }

    /* JADX INFO: renamed from: o.fRz$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public final /* synthetic */ android.app.Activity AEQbTJ;

        public Application(android.app.Activity activity) {
            this.AEQbTJ = activity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            int iAbs = java.lang.Math.abs(i2);
            java.lang.Object systemService = this.AEQbTJ.getSystemService("input_method");
            if (iAbs <= 0 || systemService == null || !(systemService instanceof android.view.inputmethod.InputMethodManager)) {
                return;
            }
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
            }
        }
    }

    public static final RecyclerView.OnScrollListener OLrzqt(@NotNull RecyclerView recyclerView, @NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Application application = new Application(activity);
        recyclerView.addOnScrollListener(application);
        return application;
    }
}
