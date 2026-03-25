package o;

import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bhG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10053bhG extends AbstractC43310rmq<C9983bfq, AbstractC16704eou> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C13754dXa.TaskDescription.deregisterUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return dTV.isConnected;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16704eou> c43312rms, @NotNull C9983bfq c9983bfq) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c9983bfq, "");
        super.onBindViewHolder((C43312rms) c43312rms, c9983bfq);
        ((AbstractC16704eou) c43312rms.OLrzqt()).KWHzl.setImageDrawable(c9983bfq.copydefault());
        ((AbstractC16704eou) c43312rms.OLrzqt()).AEQbTJ.setText(c9983bfq.KWHzl());
        ((AbstractC16704eou) c43312rms.OLrzqt()).copydefault.setText(c9983bfq.EZpvd());
    }
}
