package o;

import com.okinc.business.market.features.home.domain.HomeTab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28452kaz extends AbstractC28450kax {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28452kaz(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.util.List<HomeTab> list) {
        super(fragment, str, list);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return i == 0 ? copydefault() : KWHzl(i);
    }
}
