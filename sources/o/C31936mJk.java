package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31936mJk extends AbstractC43310rmq<mHO, AbstractC31865mGu> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return mDC.TaskDescription.iwGUEr;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31865mGu> c43312rms, @NotNull mHO mho) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(mho, "");
        super.onBindViewHolder((C43312rms) c43312rms, mho);
        android.widget.ImageView imageView = ((AbstractC31865mGu) c43312rms.OLrzqt()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, mho.OLrzqt(), C52761wXj.TaskDescription.aHXSQp);
    }
}
