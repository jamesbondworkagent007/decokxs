package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C43471rps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43680rtp extends AbstractC43310rmq<C43677rtm, AbstractC43435rpI> {
    public final Activity KWHzl;
    public final int OLrzqt;

    /* JADX INFO: renamed from: o.rtp$Activity */
    public interface Activity {
        void EZpvd(int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C43471rps.TaskDescription.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C43468rpp.KWHzl;
    }

    public C43680rtp(int i, Activity activity) {
        this.OLrzqt = i;
        this.KWHzl = activity;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC43435rpI> c43312rms, @NotNull final C43677rtm c43677rtm) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c43677rtm, "");
        super.onBindViewHolder((C43312rms) c43312rms, c43677rtm);
        ViewGroup.LayoutParams layoutParams = ((AbstractC43435rpI) c43312rms.OLrzqt()).EZpvd.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "");
        int i = this.OLrzqt;
        layoutParams.height = i;
        layoutParams.width = i;
        ((AbstractC43435rpI) c43312rms.OLrzqt()).EZpvd.setLayoutParams(layoutParams);
        c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.rtq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C43680rtp.KWHzl(this.copydefault, c43677rtm, view);
            }
        });
    }

    public static final void KWHzl(C43680rtp c43680rtp, C43677rtm c43677rtm, android.view.View view) {
        Activity activity = c43680rtp.KWHzl;
        if (activity != null) {
            activity.EZpvd(c43677rtm.copydefault());
        }
    }
}
