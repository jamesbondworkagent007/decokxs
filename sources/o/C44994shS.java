package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C44994shS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.shS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44994shS extends AbstractC45384sol<ActionBar> {
    public java.lang.CharSequence AEQbTJ = "";
    public StateListAnimator KWHzl;

    /* JADX INFO: renamed from: o.shS$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl = stateListAnimator;
    }

    public final void EZpvd(@NotNull java.lang.CharSequence charSequence) {
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
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47458tqS abstractC47458tqSAEQbTJ = AbstractC47458tqS.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47458tqSAEQbTJ, "");
        return new ActionBar(this, abstractC47458tqSAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.copydefault();
    }

    /* JADX INFO: renamed from: o.shS$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ C44994shS EZpvd;
        public final AbstractC47458tqS OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C44994shS c44994shS, AbstractC47458tqS abstractC47458tqS) {
            super(abstractC47458tqS.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47458tqS, "");
            this.EZpvd = c44994shS;
            this.OLrzqt = abstractC47458tqS;
        }

        public final void copydefault() {
            AbstractC47458tqS abstractC47458tqS = this.OLrzqt;
            final C44994shS c44994shS = this.EZpvd;
            abstractC47458tqS.copydefault.setText(c44994shS.AEQbTJ());
            abstractC47458tqS.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.shQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C44994shS.ActionBar.copydefault(c44994shS, view);
                }
            });
        }

        public static final void copydefault(C44994shS c44994shS, android.view.View view) {
            StateListAnimator stateListAnimator = c44994shS.KWHzl;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd();
            }
        }
    }
}
