package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39521pts extends AbstractC59533zio<oLQ, StateListAnimator> {
    public final android.content.Context EZpvd;
    public final Function1<oLQ, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.oLQ, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39521pts(@NotNull android.content.Context context, @NotNull Function1<? super oLQ, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = context;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.OuxcSI, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final oLQ olq) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(olq, "");
        stateListAnimator.copydefault().setSelected(olq.KWHzl());
        int iEZpvd = olq.EZpvd();
        if (iEZpvd == 0) {
            stateListAnimator.KWHzl().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.RZMhtF));
            stateListAnimator.EZpvd().setBackgroundResource(C35964oKf.Activity.giSNqX);
        } else if (iEZpvd == 1) {
            stateListAnimator.KWHzl().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPfrwjPh));
            stateListAnimator.EZpvd().setBackgroundResource(C35964oKf.Activity.gasjUx);
        }
        stateListAnimator.copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.ptu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39521pts.EZpvd(this.OLrzqt, olq, view);
            }
        });
    }

    public static final void EZpvd(C39521pts c39521pts, oLQ olq, android.view.View view) {
        c39521pts.KWHzl.invoke(olq);
    }

    /* JADX INFO: renamed from: o.pts$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.view.View AEQbTJ;
        public android.view.View EZpvd;
        public android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = view;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.onSetShuffleMode);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.fromMediaItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.copydefault = (android.widget.TextView) viewFindViewById2;
        }
    }
}
