package o;

import com.okinc.business.market.features.tag.ui.TagHeaderItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29692kyT extends AbstractC25436iwg<C29686kyN, C21541hDe> {
    public C29692kyT() {
        super(TagHeaderItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21541hDe> c25435iwf, @NotNull C29686kyN c29686kyN) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29686kyN, "");
        ((C21541hDe) c25435iwf.EZpvd()).EZpvd.setText(c29686kyN.copydefault());
    }
}
