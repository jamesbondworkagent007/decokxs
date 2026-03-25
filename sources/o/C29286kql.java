package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.market.features.home.domain.HomeTab;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavouriteListParams;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29286kql extends FragmentStateAdapter {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final java.util.List<HomeTab> AEQbTJ;

    public final int AEQbTJ() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29286kql(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<HomeTab> list) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX INFO: renamed from: o.kql$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kql.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size() + 3;
    }

    public final int OLrzqt() {
        return this.AEQbTJ.size() + 2;
    }

    public final boolean KWHzl(int i) {
        return 2 <= i && i < OLrzqt();
    }

    public final HomeTab AEQbTJ(int i) {
        if (KWHzl(i)) {
            return (HomeTab) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i - 2);
        }
        return null;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        if (i == 0) {
            return C28425kaY.Companion.EZpvd(new HomeFavouriteListParams("scanner"));
        }
        if (i == 1) {
            return C29401ksu.Companion.AEQbTJ();
        }
        if (i == OLrzqt()) {
            return C29366ksL.Companion.copydefault();
        }
        return C28558kcz.Companion.OLrzqt(HomeTab.copy$default(this.AEQbTJ.get(i - 2), null, null, null, null, null, "scanner", 31, null));
    }

    public final androidx.fragment.app.Fragment OLrzqt(int i, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getChildFragmentManager().findFragmentByTag("f" + i);
    }
}
