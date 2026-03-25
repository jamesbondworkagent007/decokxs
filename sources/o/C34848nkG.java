package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.data.BigDataTimeIntervalItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34848nkG extends AbstractC59533zio<BigDataTimeIntervalItem, StateListAnimator> {
    public final Function2<java.lang.Integer, java.lang.String, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C34848nkG(@NotNull Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
    }

    /* JADX INFO: renamed from: o.nkG$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.LinearLayout EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.DuXjdv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.LinearLayout) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(qZH.StateListAnimator.zUtmHU);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.AxsJAYsNCnLh, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final StateListAnimator stateListAnimator, @NotNull final BigDataTimeIntervalItem bigDataTimeIntervalItem) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(bigDataTimeIntervalItem, "");
        if (bigDataTimeIntervalItem.getSelect()) {
            stateListAnimator.copydefault().setBackgroundTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(stateListAnimator.itemView.getContext(), C52761wXj.Activity.invokespecialDPHOMC)));
            stateListAnimator.KWHzl().setTextColor(ContextCompat.getColor(stateListAnimator.itemView.getContext(), C52761wXj.Activity.fdOvFl));
            stateListAnimator.KWHzl().setText(bigDataTimeIntervalItem.getDisplayName());
        } else {
            stateListAnimator.copydefault().setBackgroundTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(stateListAnimator.itemView.getContext(), C52761wXj.Activity.aBDePw)));
            stateListAnimator.KWHzl().setTextColor(ContextCompat.getColor(stateListAnimator.itemView.getContext(), C52761wXj.Activity.QwvEab));
            stateListAnimator.KWHzl().setText(bigDataTimeIntervalItem.getDisplayName());
        }
        stateListAnimator.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.nkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34848nkG.EZpvd(this.EZpvd, stateListAnimator, bigDataTimeIntervalItem, view);
            }
        });
    }

    public static final void EZpvd(C34848nkG c34848nkG, StateListAnimator stateListAnimator, BigDataTimeIntervalItem bigDataTimeIntervalItem, android.view.View view) {
        c34848nkG.EZpvd.invoke(java.lang.Integer.valueOf(stateListAnimator.getBindingAdapterPosition()), bigDataTimeIntervalItem.getBarType());
    }
}
