package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hVY extends AbstractC59533zio<C22024hVb, StateListAnimator> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCR hcrEZpvd = hCR.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcrEZpvd, "");
        return new StateListAnimator(hcrEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C22024hVb c22024hVb) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c22024hVb, "");
        final android.content.Context context = stateListAnimator.itemView.getContext();
        OrderDetailBean orderDetailBeanKWHzl = c22024hVb.KWHzl();
        java.lang.String boostVolume = orderDetailBeanKWHzl.getBoostVolume();
        java.lang.String boostWeight = orderDetailBeanKWHzl.getBoostWeight();
        hCR hcrCopydefault = stateListAnimator.copydefault();
        hcrCopydefault.getRoot().setContentDescription("web3_dex_history_boostVolume_cell");
        AppCompatTextView appCompatTextView = hcrCopydefault.OLrzqt;
        C19758gOf c19758gOf = C19758gOf.AEQbTJ;
        appCompatTextView.setText(c19758gOf.OLrzqt(boostVolume, orderDetailBeanKWHzl.getStatus(), false));
        java.lang.String strCopydefault = c19758gOf.copydefault(boostWeight);
        if (strCopydefault == null || strCopydefault.length() == 0) {
            hcrCopydefault.AEQbTJ.setVisibility(8);
        } else {
            hcrCopydefault.AEQbTJ.setVisibility(0);
            hcrCopydefault.AEQbTJ.setText(strCopydefault);
            C25352ivB.setOnDoubleCheckClickListener$default(hcrCopydefault.AEQbTJ, 0L, new Function1() { // from class: o.hVX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hVY.KWHzl((android.view.View) obj);
                }
            }, 1, null);
        }
        C25352ivB.setOnDoubleCheckClickListener$default(hcrCopydefault.EZpvd, 0L, new Function1() { // from class: o.hVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hVY.AEQbTJ(context, (android.view.View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C31131loI.OLrzqt.EZpvd(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(android.content.Context context, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C31131loI c31131loI = C31131loI.OLrzqt;
        Intrinsics.copydefault(context);
        C31131loI.showBoostInfoDialog$default(c31131loI, context, false, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final hCR KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final hCR copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull hCR hcr) {
            super(hcr.getRoot());
            Intrinsics.checkNotNullParameter(hcr, "");
            this.KWHzl = hcr;
        }
    }
}
