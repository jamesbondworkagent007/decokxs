package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rSJ extends AbstractC59533zio<ExchangeReminderBean, ActionBar> {
    public final Function1<ExchangeReminderBean, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public rSJ(Function1<? super ExchangeReminderBean, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.fZBcTu, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull final ExchangeReminderBean exchangeReminderBean) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(exchangeReminderBean, "");
        actionBar.OLrzqt().setText(exchangeReminderBean.getExchangeName());
        actionBar.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.rSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rSJ.copydefault(this.AEQbTJ, exchangeReminderBean, view);
            }
        });
    }

    public static final void copydefault(rSJ rsj, ExchangeReminderBean exchangeReminderBean, android.view.View view) {
        Function1<ExchangeReminderBean, Unit> function1 = rsj.copydefault;
        if (function1 != null) {
            function1.invoke(exchangeReminderBean);
        }
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.TextView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C43662rtX.ActionBar.DcMfJKffREWX);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
        }
    }
}
