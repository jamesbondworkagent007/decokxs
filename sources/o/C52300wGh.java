package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.GridDealRecordArbitrageRecordHeaderData;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52300wGh extends AbstractC59533zio<GridDealRecordArbitrageRecordHeaderData, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C50881vcX c50881vcXCopydefault = C50881vcX.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c50881vcXCopydefault, "");
        return new ActionBar(this, c50881vcXCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull GridDealRecordArbitrageRecordHeaderData gridDealRecordArbitrageRecordHeaderData) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(gridDealRecordArbitrageRecordHeaderData, "");
        actionBar.copydefault().EZpvd.setText(gridDealRecordArbitrageRecordHeaderData.getGridProfit());
        if (gridDealRecordArbitrageRecordHeaderData.getGridProfitTextColor() != 0) {
            actionBar.copydefault().EZpvd.setTextColor(gridDealRecordArbitrageRecordHeaderData.getGridProfitTextColor());
        } else {
            actionBar.copydefault().EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        C55320xhi c55320xhi = actionBar.copydefault().AEQbTJ;
        c55320xhi.setOnClickListener(new StateListAnimator(c55320xhi, 1000L, actionBar));
    }

    /* JADX INFO: renamed from: o.wGh$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wGh$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final C50881vcX AEQbTJ;
        public final /* synthetic */ C52300wGh KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50881vcX copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C52300wGh c52300wGh, C50881vcX c50881vcX) {
            super(c50881vcX.getRoot());
            Intrinsics.checkNotNullParameter(c50881vcX, "");
            this.KWHzl = c52300wGh;
            this.AEQbTJ = c50881vcX;
        }
    }

    /* JADX INFO: renamed from: o.wGh$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActionBar actionBar) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.copydefault().AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.BackHandlerKtBackHandler11);
                viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.selectTab);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
