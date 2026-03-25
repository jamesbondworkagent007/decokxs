package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.ui.screens.faq.InvestFaqItemViewBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C27284jsL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26378jbG extends AbstractC27121jpH<C27284jsL.StateListAnimator, iLL> {
    public final C43316rmw AEQbTJ;
    public final RecyclerView.ItemAnimator copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26378jbG(RecyclerView.ItemAnimator itemAnimator, @NotNull C43316rmw c43316rmw) {
        super(InvestFaqItemViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        this.copydefault = itemAnimator;
        this.AEQbTJ = c43316rmw;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C27120jpG<iLL> c27120jpG, @NotNull C27284jsL.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        iLL ill = (iLL) c27120jpG.KWHzl();
        ill.gEmmrt.setText(stateListAnimator.EZpvd());
        ConstraintLayout constraintLayout = ill.EZpvd;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this, stateListAnimator, c27120jpG));
        ill.AYXKKw.setText(stateListAnimator.AEQbTJ());
        android.widget.TextView textView = ill.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(stateListAnimator.KWHzl() ? 0 : 8);
        android.widget.ImageView imageView = ill.AEQbTJ;
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), stateListAnimator.KWHzl() ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG));
    }

    /* JADX INFO: renamed from: o.jbG$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26378jbG EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C27120jpG OLrzqt;
        public final /* synthetic */ C27284jsL.StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C26378jbG c26378jbG, C27284jsL.StateListAnimator stateListAnimator, C27120jpG c27120jpG) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c26378jbG;
            this.copydefault = stateListAnimator;
            this.OLrzqt = c27120jpG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                RecyclerView.ItemAnimator itemAnimator = this.EZpvd.copydefault;
                if (itemAnimator == null || itemAnimator.isRunning()) {
                    return;
                }
                this.copydefault.OLrzqt(!r7.KWHzl());
                this.EZpvd.AEQbTJ.notifyItemChanged(this.EZpvd.getPosition(this.OLrzqt));
            }
        }
    }
}
