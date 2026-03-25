package o;

import com.okinc.business.market.features.position.ui.widget.PositionInfoBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29157koO extends AbstractC25436iwg<C29158koP, hCW> {
    public C29157koO() {
        super(PositionInfoBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCW> c25435iwf, @NotNull C29158koP c29158koP) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29158koP, "");
        hCW hcw = (hCW) c25435iwf.EZpvd();
        hcw.copydefault.setText(c29158koP.copydefault());
        hcw.EZpvd.setText(c29158koP.EZpvd());
    }
}
