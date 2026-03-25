package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hMO extends AbstractC59533zio<C21804hMy, StateListAnimator> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        hWF hwf = new hWF(context, null, 0, 6, null);
        hwf.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new StateListAnimator(hwf);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C21804hMy c21804hMy) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c21804hMy, "");
        stateListAnimator.OLrzqt().setAddressValue(c21804hMy.KWHzl(), c21804hMy.OLrzqt().getChainId());
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final hWF OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final hWF OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull hWF hwf) {
            super(hwf);
            Intrinsics.checkNotNullParameter(hwf, "");
            this.OLrzqt = hwf;
        }
    }
}
