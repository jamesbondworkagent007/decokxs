package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tYO extends androidx.recyclerview.widget.ListAdapter<C46548tYk<ValuationCurrencyBean>, StateListAnimator> {
    public final Function1<java.lang.Integer, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tYO(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        super(new tYB());
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46536tXz c46536tXzCopydefault = C46536tXz.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46536tXzCopydefault, "");
        return new StateListAnimator(c46536tXzCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C46536tXz c46536tXzEZpvd = stateListAnimator.EZpvd();
        C46548tYk<ValuationCurrencyBean> item = getItem(i);
        final ValuationCurrencyBean valuationCurrencyBeanEZpvd = item.EZpvd();
        c46536tXzEZpvd.KWHzl.setContentDescription(valuationCurrencyBeanEZpvd.getIsoCode());
        android.widget.ImageView imageView = c46536tXzEZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(item.AEQbTJ() ? 0 : 8);
        c46536tXzEZpvd.KWHzl.setTitle(valuationCurrencyBeanEZpvd.getDisplayName());
        c46536tXzEZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.tYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tYO.KWHzl(this.KWHzl, valuationCurrencyBeanEZpvd, view);
            }
        });
    }

    public static final void KWHzl(tYO tyo, ValuationCurrencyBean valuationCurrencyBean, android.view.View view) {
        tyo.AEQbTJ.invoke(java.lang.Integer.valueOf(C33129mqd.AhwBna(java.lang.Integer.valueOf(valuationCurrencyBean.getCurrencyId()))));
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C46536tXz EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46536tXz EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46536tXz c46536tXz) {
            super(c46536tXz.getRoot());
            Intrinsics.checkNotNullParameter(c46536tXz, "");
            this.EZpvd = c46536tXz;
        }
    }
}
