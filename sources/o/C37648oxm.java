package o;

import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37648oxm extends C43318rmy<C37581owY, nKS> {
    public C37648oxm() {
        super(C35399nuc.Dialog.DBxZfM, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<nKS> c43312rms, @NotNull C37581owY c37581owY) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c37581owY, "");
        super.onBindViewHolder((C43312rms) c43312rms, c37581owY);
        ((nKS) c43312rms.OLrzqt()).copydefault.setText(c37581owY.AEQbTJ());
    }
}
