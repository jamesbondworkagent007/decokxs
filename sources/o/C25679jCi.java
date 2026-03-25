package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardFragment;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25679jCi extends FragmentStateAdapter {
    public final java.lang.String EZpvd;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25679jCi(@NotNull java.lang.String str, @NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = str;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        if (i < 1) {
            return new LeaderBoardFragment();
        }
        return jDH.Companion.KWHzl(new TrackerParams(this.EZpvd));
    }
}
