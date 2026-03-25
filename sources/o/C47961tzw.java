package o;

import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47961tzw extends AbstractC43310rmq<java.lang.String, tMR> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.zsXlph;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tMR> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onBindViewHolder((C43312rms) c43312rms, str);
        ((tMR) c43312rms.OLrzqt()).EZpvd.setBgColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
        ((tMR) c43312rms.OLrzqt()).EZpvd.setTextSize(14.0f);
        ((tMR) c43312rms.OLrzqt()).EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
        ((tMR) c43312rms.OLrzqt()).EZpvd.setText(str);
    }
}
