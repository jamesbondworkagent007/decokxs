package o;

import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10194bjp extends RecyclerView.ViewHolder {
    public final AbstractC17059eve KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10194bjp(@NotNull AbstractC17059eve abstractC17059eve) {
        super(abstractC17059eve.getRoot());
        Intrinsics.checkNotNullParameter(abstractC17059eve, "");
        this.KWHzl = abstractC17059eve;
    }

    public final void EZpvd(@NotNull final AbstractC10168bjP.Application application, final long j) {
        Intrinsics.checkNotNullParameter(application, "");
        Glide.AEQbTJ(this.KWHzl.getRoot().getContext()).EZpvd(application.OLrzqt()).OLrzqt(AppCompatResources.getDrawable(this.KWHzl.getRoot().getContext(), C13754dXa.Activity.aKErDB)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(this.KWHzl.getRoot().getContext(), 0.5f, C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), false, 8, null)).EZpvd(this.KWHzl.EZpvd);
        this.KWHzl.EZpvd.setAlpha(application.AEQbTJ());
        android.widget.TextView textView = this.KWHzl.copydefault;
        C10186bjh c10186bjh = C10186bjh.KWHzl;
        textView.setText(C10186bjh.jointColorCharSequence$default(c10186bjh, application.KWHzl(), 0, null, 0, 14, null));
        if (C33129mqd.OLrzqt(application.EZpvd())) {
            this.KWHzl.OLrzqt.setText(C10186bjh.jointColorCharSequence$default(c10186bjh, null, 0, application.EZpvd(), 0, 11, null));
            this.KWHzl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.bjr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C10194bjp.EZpvd(this.EZpvd, j, application, view);
                }
            });
        } else {
            this.KWHzl.KWHzl.setVisibility(8);
        }
    }

    public static final void EZpvd(C10194bjp c10194bjp, long j, AbstractC10168bjP.Application application, android.view.View view) {
        C10186bjh c10186bjh = C10186bjh.KWHzl;
        android.content.Context context = c10194bjp.KWHzl.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c10186bjh.KWHzl(context, j, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), application.copydefault());
    }
}
