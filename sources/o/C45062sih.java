package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45062sih extends AbstractC45384sol<StateListAnimator> {
    public java.lang.CharSequence AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.AEQbTJ;
    }

    public C45062sih() {
        AEQbTJ(true);
        this.AEQbTJ = "";
    }

    public final void KWHzl(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (Intrinsics.EZpvd(this.AEQbTJ, charSequence)) {
            return;
        }
        this.AEQbTJ = charSequence;
        notifyItemChanged(0);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47454tqO abstractC47454tqOKWHzl = AbstractC47454tqO.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47454tqOKWHzl, "");
        return new StateListAnimator(this, abstractC47454tqOKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.sih$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C45062sih EZpvd;
        public final AbstractC47454tqO KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C45062sih c45062sih, AbstractC47454tqO abstractC47454tqO) {
            super(abstractC47454tqO.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47454tqO, "");
            this.EZpvd = c45062sih;
            this.KWHzl = abstractC47454tqO;
        }

        public final void EZpvd() {
            this.KWHzl.AEQbTJ.setText(this.EZpvd.EZpvd());
        }
    }
}
