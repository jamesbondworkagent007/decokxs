package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hME extends AbstractC59533zio<C21795hMp, Activity> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCR hcrEZpvd = hCR.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcrEZpvd, "");
        return new Activity(hcrEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C21795hMp c21795hMp) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c21795hMp, "");
        final android.content.Context context = activity.itemView.getContext();
        OrderDetailResult orderDetailResultOLrzqt = c21795hMp.OLrzqt();
        java.lang.String boostVolume = orderDetailResultOLrzqt.getBoostVolume();
        java.lang.String boostWeight = orderDetailResultOLrzqt.getBoostWeight();
        hCR hcrAEQbTJ = activity.AEQbTJ();
        hcrAEQbTJ.getRoot().setContentDescription("web3_dex_history_boostVolume_cell");
        AppCompatTextView appCompatTextView = hcrAEQbTJ.OLrzqt;
        C19758gOf c19758gOf = C19758gOf.AEQbTJ;
        appCompatTextView.setText(c19758gOf.OLrzqt(boostVolume, orderDetailResultOLrzqt.getStatus(), true));
        java.lang.String strCopydefault = c19758gOf.copydefault(boostWeight);
        if (strCopydefault == null || strCopydefault.length() == 0) {
            hcrAEQbTJ.AEQbTJ.setVisibility(8);
        } else {
            hcrAEQbTJ.AEQbTJ.setVisibility(0);
            hcrAEQbTJ.AEQbTJ.setText(strCopydefault);
            C25352ivB.setOnDoubleCheckClickListener$default(hcrAEQbTJ.AEQbTJ, 0L, new Function1() { // from class: o.hMB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hME.copydefault((android.view.View) obj);
                }
            }, 1, null);
        }
        C25352ivB.setOnDoubleCheckClickListener$default(hcrAEQbTJ.EZpvd, 0L, new Function1() { // from class: o.hMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hME.AEQbTJ(context, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C31131loI.OLrzqt.EZpvd(false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.content.Context context, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C31131loI c31131loI = C31131loI.OLrzqt;
        Intrinsics.copydefault(context);
        C31131loI.showBoostInfoDialog$default(c31131loI, context, false, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public final hCR OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final hCR AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull hCR hcr) {
            super(hcr.getRoot());
            Intrinsics.checkNotNullParameter(hcr, "");
            this.OLrzqt = hcr;
        }
    }
}
