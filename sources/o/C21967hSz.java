package o;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.bottomsheet.DexLiquidityPoolBottomSheetItemViewBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C21967hSz extends AbstractC25436iwg<hSH, hDM> {
    public C21967hSz() {
        super(DexLiquidityPoolBottomSheetItemViewBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd */
    public void onBindViewHolder(@NotNull C25435iwf<hDM> c25435iwf, @NotNull hSH hsh) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(hsh, "");
        hDM hdm = (hDM) c25435iwf.EZpvd();
        if (hsh instanceof hSG) {
            hSG hsg = (hSG) hsh;
            hdm.copydefault.setText(hsg.copydefault());
            hdm.KWHzl.setText(C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, hsg.EZpvd(), null, 1, null));
        }
    }
}
