package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.unify_trade.biz.HistoryEventExtData;
import com.okinc.unify_trade.bot.data.HistoryEventCard;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wNA extends AbstractC59533zio<HistoryEventCard, C52504wNw> {
    public final wNB KWHzl;

    public wNA(@NotNull wNB wnb) {
        Intrinsics.checkNotNullParameter(wnb, "");
        this.KWHzl = wnb;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C52504wNw onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.OgHfcT, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C52504wNw((AbstractC48618uYb) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52504wNw c52504wNw, @NotNull HistoryEventCard historyEventCard) {
        Intrinsics.checkNotNullParameter(c52504wNw, "");
        Intrinsics.checkNotNullParameter(historyEventCard, "");
        AbstractC48618uYb abstractC48618uYbAEQbTJ = c52504wNw.AEQbTJ();
        if (c52504wNw.getLayoutPosition() == 0) {
            ViewGroup.LayoutParams layoutParams = abstractC48618uYbAEQbTJ.AhwBna.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null);
            abstractC48618uYbAEQbTJ.AhwBna.setLayoutParams(layoutParams2);
        }
        abstractC48618uYbAEQbTJ.AhwBna.setText(historyEventCard.getTitle());
        abstractC48618uYbAEQbTJ.copydefault.setText(historyEventCard.getStatus());
        abstractC48618uYbAEQbTJ.gEmmrt.setText(historyEventCard.getTime());
        abstractC48618uYbAEQbTJ.EZpvd.setText(historyEventCard.getDetails());
        C52794wYp c52794wYp = abstractC48618uYbAEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) historyEventCard.getSignalDetails()) ? 0 : 8);
        C52794wYp c52794wYp2 = abstractC48618uYbAEQbTJ.AYXKKw;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this, historyEventCard));
        C52794wYp c52794wYp3 = abstractC48618uYbAEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
        HistoryEventExtData historyEventExtData = historyEventCard.getHistoryEventExtData();
        c52794wYp3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) (historyEventExtData != null ? historyEventExtData.getType() : null)) ? 0 : 8);
        C52794wYp c52794wYp4 = abstractC48618uYbAEQbTJ.valueOf;
        c52794wYp4.setOnClickListener(new ActionBar(c52794wYp4, 1000L, this, historyEventCard));
        C52794wYp c52794wYp5 = abstractC48618uYbAEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c52794wYp5, "");
        c52794wYp5.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) historyEventCard.getClientIds()) ? 0 : 8);
        C52794wYp c52794wYp6 = abstractC48618uYbAEQbTJ.djBIcL;
        c52794wYp6.setOnClickListener(new TaskDescription(c52794wYp6, 1000L, this, historyEventCard));
        abstractC48618uYbAEQbTJ.AEQbTJ.setVisibility(historyEventCard.getShowBottomLine() ? 0 : 4);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ wNA EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ HistoryEventCard copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wNA wna, HistoryEventCard historyEventCard) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = wna;
            this.copydefault = historyEventCard;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl.EZpvd(this.copydefault);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ HistoryEventCard EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ wNA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wNA wna, HistoryEventCard historyEventCard) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = wna;
            this.EZpvd = historyEventCard;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.KWHzl.KWHzl(this.EZpvd);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ HistoryEventCard EZpvd;
        public final /* synthetic */ wNA KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, wNA wna, HistoryEventCard historyEventCard) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = wna;
            this.EZpvd = historyEventCard;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.KWHzl.copydefault(this.EZpvd);
            }
        }
    }
}
