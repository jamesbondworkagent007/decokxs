package o;

import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47853txu extends AbstractC43310rmq<C47773twT, tMG> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.iwGUEr;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tMG> c43312rms, @NotNull C47773twT c47773twT) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c47773twT, "");
        super.onBindViewHolder((C43312rms) c43312rms, c47773twT);
        ((tMG) c43312rms.OLrzqt()).KWHzl.OLrzqt().setVisibility(8);
        ((tMG) c43312rms.OLrzqt()).KWHzl.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.dmfpNf));
        ((tMG) c43312rms.OLrzqt()).KWHzl.setSubtitle(C33070mpX.AYXKKw(C47501trL.Fragment.QkdxfA));
    }
}
