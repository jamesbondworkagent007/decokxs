package o;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10165bjM extends RecyclerView.ViewHolder {
    public final AbstractC17058evd KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10165bjM(@NotNull AbstractC17058evd abstractC17058evd) {
        super(abstractC17058evd.getRoot());
        Intrinsics.checkNotNullParameter(abstractC17058evd, "");
        this.KWHzl = abstractC17058evd;
    }

    public final void EZpvd(@NotNull AbstractC10168bjP.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Glide.AEQbTJ(this.KWHzl.getRoot().getContext()).EZpvd(stateListAnimator.AEQbTJ()).OLrzqt(AppCompatResources.getDrawable(this.KWHzl.getRoot().getContext(), C52761wXj.TaskDescription.aHXSQp)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(this.KWHzl.getRoot().getContext(), 0.5f, C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), false, 8, null)).EZpvd(this.KWHzl.EZpvd);
        this.KWHzl.AEQbTJ.setText(C10186bjh.jointColorCharSequence$default(C10186bjh.KWHzl, stateListAnimator.KWHzl(), 0, null, 0, 14, null));
    }
}
