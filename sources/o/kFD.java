package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kFD extends AbstractC59533zio<kFR, kFV> {
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public kFD(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public kFV onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42855reL c42855reLCopydefault = C42855reL.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42855reLCopydefault, "");
        return new kFV(c42855reLCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull kFV kfv, @NotNull kFR kfr) {
        Intrinsics.checkNotNullParameter(kfv, "");
        Intrinsics.checkNotNullParameter(kfr, "");
        kfv.EZpvd().KWHzl.setText(kfr.OLrzqt());
        kfv.EZpvd().EZpvd.setText(kfr.KWHzl());
        android.widget.ImageView imageView = kfv.EZpvd().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.AEQbTJ(imageView, kfr.copydefault());
        ConstraintLayout root = kfv.EZpvd().getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, kfr));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ kFR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ kFD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, kFD kfd, kFR kfr) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = kfd;
            this.EZpvd = kfr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.KWHzl().invoke(this.EZpvd.AEQbTJ());
            }
        }
    }
}
