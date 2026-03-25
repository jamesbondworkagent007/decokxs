package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C38408pXr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C38408pXr extends RecyclerView.Adapter<StateListAnimator> {
    public final java.util.List<C38414pXx> AEQbTJ;
    public final Function1<C38414pXx, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C38414pXx> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.pXx, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C38408pXr(@NotNull java.util.List<C38414pXx> list, @NotNull Function1<? super C38414pXx, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = list;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        pXN pxnCopydefault = pXN.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(pxnCopydefault, "");
        return new StateListAnimator(this, pxnCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(this.AEQbTJ.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    public final void EZpvd(@NotNull C38414pXx c38414pXx) {
        Intrinsics.checkNotNullParameter(c38414pXx, "");
        this.AEQbTJ.add(c38414pXx);
        notifyItemInserted(this.AEQbTJ.size() - 1);
    }

    /* JADX INFO: renamed from: o.pXr$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C38408pXr AEQbTJ;
        public final pXN copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C38408pXr c38408pXr, pXN pxn) {
            super(pxn.getRoot());
            Intrinsics.checkNotNullParameter(pxn, "");
            this.AEQbTJ = c38408pXr;
            this.copydefault = pxn;
        }

        public final void copydefault(@NotNull final C38414pXx c38414pXx) {
            Intrinsics.checkNotNullParameter(c38414pXx, "");
            this.copydefault.AEQbTJ.setText(c38414pXx.copydefault());
            android.widget.Button button = this.copydefault.AEQbTJ;
            final C38408pXr c38408pXr = this.AEQbTJ;
            button.setOnClickListener(new View.OnClickListener() { // from class: o.pXs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38408pXr.StateListAnimator.KWHzl(c38408pXr, c38414pXx, view);
                }
            });
        }

        public static final void KWHzl(C38408pXr c38408pXr, C38414pXx c38414pXx, android.view.View view) {
            c38408pXr.KWHzl.invoke(c38414pXx);
        }
    }
}
