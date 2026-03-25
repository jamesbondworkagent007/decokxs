package o;

import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ora, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37318ora extends AbstractC43310rmq<AbstractC37253oqO, nNE> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.iKEqwx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<nNE> c43312rms, @NotNull AbstractC37253oqO abstractC37253oqO) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(abstractC37253oqO, "");
        super.onBindViewHolder((C43312rms) c43312rms, abstractC37253oqO);
        ((nNE) c43312rms.OLrzqt()).AEQbTJ.setText(abstractC37253oqO.KWHzl().EZpvd());
    }
}
