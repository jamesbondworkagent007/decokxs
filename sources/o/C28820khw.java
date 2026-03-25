package o;

import com.okinc.business.market.features.meme.protocol_filter.ui.SpacerViewBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28820khw extends AbstractC25436iwg<InterfaceC28823khz.StateListAnimator, hCN> {
    public C28820khw() {
        super(SpacerViewBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCN> c25435iwf, @NotNull InterfaceC28823khz.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        ((hCN) c25435iwf.EZpvd()).getRoot().setVisibility(4);
    }
}
