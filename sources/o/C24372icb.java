package o;

import com.okinc.business.dexui.main.swap.mememode.dialog.adapter.MemeStrategyInstructionBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24372icb extends AbstractC25436iwg<C24373icc, C21582hEs> {
    public C24372icb() {
        super(MemeStrategyInstructionBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21582hEs> c25435iwf, @NotNull C24373icc c24373icc) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c24373icc, "");
        C21582hEs c21582hEs = (C21582hEs) c25435iwf.EZpvd();
        c21582hEs.KWHzl.setText(c24373icc.EZpvd());
        c21582hEs.EZpvd.setText(c24373icc.OLrzqt());
    }
}
