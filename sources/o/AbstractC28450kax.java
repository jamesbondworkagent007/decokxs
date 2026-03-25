package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.market.features.home.domain.HomeTab;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavouriteListParams;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28450kax extends FragmentStateAdapter {
    public final java.lang.String KWHzl;
    public final java.util.List<HomeTab> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HomeTab> EZpvd() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC28450kax(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.util.List<HomeTab> list) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.copydefault = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    public final java.lang.String copydefault(int i) {
        HomeTab homeTab = (HomeTab) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault, i);
        if (homeTab != null) {
            return homeTab.EZpvd();
        }
        return null;
    }

    public final androidx.fragment.app.Fragment copydefault() {
        return C28425kaY.Companion.EZpvd(new HomeFavouriteListParams(this.KWHzl));
    }

    public final androidx.fragment.app.Fragment KWHzl(int i) {
        return C28558kcz.Companion.OLrzqt(this.copydefault.get(i));
    }
}
