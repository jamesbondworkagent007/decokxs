package o;

import android.view.ViewTreeObserver;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.poA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39214poA {

    /* JADX INFO: renamed from: o.poA$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ TabLayout AEQbTJ;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ long copydefault;

        public Application(TabLayout tabLayout, long j, Function0<Unit> function0) {
            this.AEQbTJ = tabLayout;
            this.copydefault = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.AEQbTJ.getTabCount() > 0) {
                this.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.AEQbTJ.postDelayed(new RunnableC0918Application(this.OLrzqt), this.copydefault);
            }
        }

        /* JADX INFO: renamed from: o.poA$Application$Application, reason: collision with other inner class name */
        public static final class RunnableC0918Application implements java.lang.Runnable {
            public final /* synthetic */ Function0 OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public RunnableC0918Application(Function0 function0) {
                this.OLrzqt = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.OLrzqt.invoke();
            }
        }
    }

    public static /* synthetic */ void observeTabLayoutCompleted$default(TabLayout tabLayout, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        KWHzl(tabLayout, j, function0);
    }

    public static final void KWHzl(@NotNull TabLayout tabLayout, long j, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(tabLayout, "");
        Intrinsics.checkNotNullParameter(function0, "");
        tabLayout.getViewTreeObserver().addOnGlobalLayoutListener(new Application(tabLayout, j, function0));
    }
}
