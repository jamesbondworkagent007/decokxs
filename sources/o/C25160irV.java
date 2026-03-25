package o;

import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25160irV extends C43318rmy<C25151irM, AbstractC23450hyU> {
    public C25160irV() {
        super(C23274hvD.Activity.dmfpNf, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23450hyU> c43312rms, @NotNull C25151irM c25151irM) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25151irM, "");
        ((AbstractC23450hyU) c43312rms.OLrzqt()).EZpvd.setText(c25151irM.KWHzl());
        ((AbstractC23450hyU) c43312rms.OLrzqt()).OLrzqt.setText(c25151irM.copydefault());
    }
}
