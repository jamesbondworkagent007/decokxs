package o;

import com.okinc.business.dexui.main.swap.mememode.dialog.adapter.MemeModeInstructionBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24313ibV extends AbstractC25436iwg<C24317ibZ, C21579hEp> {
    public C24313ibV() {
        super(MemeModeInstructionBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21579hEp> c25435iwf, @NotNull C24317ibZ c24317ibZ) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c24317ibZ, "");
        C21579hEp c21579hEp = (C21579hEp) c25435iwf.EZpvd();
        c21579hEp.AEQbTJ.setText(c24317ibZ.copydefault());
        c21579hEp.KWHzl.setText(c24317ibZ.OLrzqt());
    }
}
