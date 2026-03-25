package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment;
import com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gQb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19808gQb extends FragmentStateAdapter {
    public final java.util.List<Function0<gPW<? extends ViewBinding>>> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19808gQb(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = yDY.gEmmrt(new Function0() { // from class: o.gPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19808gQb.copydefault();
            }
        }, new Function0() { // from class: o.gQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19808gQb.KWHzl();
            }
        });
    }

    public static final gPW copydefault() {
        return PositionComponentFragment.Companion.OLrzqt();
    }

    public static final gPW KWHzl() {
        return OpenOrderComponentFragment.Companion.OLrzqt();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Method merged with bridge method: createFragment(I)Landroidx/fragment/app/Fragment; */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public gPW<? extends ViewBinding> createFragment(int i) {
        return this.EZpvd.get(i).invoke();
    }
}
