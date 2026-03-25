package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C45059sie;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45059sie extends AbstractC45384sol<ActionBar> {
    public StateListAnimator EZpvd;

    /* JADX INFO: renamed from: o.sie$StateListAnimator */
    public interface StateListAnimator {
        void KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47449tqJ abstractC47449tqJOLrzqt = AbstractC47449tqJ.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47449tqJOLrzqt, "");
        return new ActionBar(this, abstractC47449tqJOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.sie$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC47449tqJ AEQbTJ;
        public final /* synthetic */ C45059sie KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C45059sie c45059sie, AbstractC47449tqJ abstractC47449tqJ) {
            super(abstractC47449tqJ.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47449tqJ, "");
            this.KWHzl = c45059sie;
            this.AEQbTJ = abstractC47449tqJ;
        }

        public final void EZpvd() {
            AbstractC47449tqJ abstractC47449tqJ = this.AEQbTJ;
            final C45059sie c45059sie = this.KWHzl;
            abstractC47449tqJ.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.sid
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C45059sie.ActionBar.copydefault(c45059sie, view);
                }
            });
        }

        public static final void copydefault(C45059sie c45059sie, android.view.View view) {
            StateListAnimator stateListAnimator = c45059sie.EZpvd;
            if (stateListAnimator != null) {
                stateListAnimator.KWHzl();
            }
        }
    }
}
