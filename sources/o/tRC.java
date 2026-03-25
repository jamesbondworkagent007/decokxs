package o;

import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tRC {

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Function1<TabLayout.Tab, Unit> KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.google.android.material.tabs.TabLayout$Tab, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super TabLayout.Tab, Unit> function1) {
            this.KWHzl = function1;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                this.KWHzl.invoke(tab);
            }
        }
    }

    public static final void KWHzl(@NotNull C55249xgQ c55249xgQ, @NotNull java.util.List<? extends TabLayout.Tab> list, @NotNull Function1<? super TabLayout.Tab, Unit> function1) {
        Intrinsics.checkNotNullParameter(c55249xgQ, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            c55249xgQ.addTab((TabLayout.Tab) it.next());
        }
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator(function1));
    }
}
