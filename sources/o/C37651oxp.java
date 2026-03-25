package o;

import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37651oxp extends C43318rmy<C37582owZ, nKN> {
    public C37651oxp() {
        super(C35399nuc.Dialog.heceqZ, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<nKN> c43312rms, @NotNull C37582owZ c37582owZ) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c37582owZ, "");
        super.onBindViewHolder((C43312rms) c43312rms, c37582owZ);
        ((nKN) c43312rms.OLrzqt()).copydefault.setText(c37582owZ.EZpvd());
    }
}
