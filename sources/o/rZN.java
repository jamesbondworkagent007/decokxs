package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rZN extends AbstractC42594rYq<rZY, rYF> {
    public final Function2<rZY, java.lang.Boolean, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.rZY, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public rZN(@NotNull Function2<? super rZY, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public rYF KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYF ryfOLrzqt = rYF.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ryfOLrzqt, "");
        return ryfOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<rZY, rYF>.StateListAnimator<rYF> stateListAnimator, @NotNull final rZY rzy) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(rzy, "");
        final rYF ryf = (rYF) stateListAnimator.AEQbTJ();
        ryf.copydefault.setText(rzy.AEQbTJ().getChannelName());
        C55239xgG c55239xgG = ryf.AEQbTJ;
        java.lang.Integer channelSwitch = rzy.AEQbTJ().getChannelSwitch();
        c55239xgG.setChecked(channelSwitch != null && channelSwitch.intValue() == 1);
        C55239xgG c55239xgG2 = ryf.AEQbTJ;
        java.lang.Integer channelRequired = rzy.AEQbTJ().getChannelRequired();
        c55239xgG2.setEnabled(channelRequired != null && channelRequired.intValue() == 0);
        C55251xgS c55251xgS = ryf.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        java.lang.Integer channelRequired2 = rzy.AEQbTJ().getChannelRequired();
        c55251xgS.setVisibility((channelRequired2 == null || channelRequired2.intValue() != 1) ? 8 : 0);
        java.lang.Integer channelRequired3 = rzy.AEQbTJ().getChannelRequired();
        if (channelRequired3 != null && channelRequired3.intValue() == 0) {
            ryf.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rZO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rZN.KWHzl(this.EZpvd, rzy, ryf, view);
                }
            });
        }
    }

    public static final void KWHzl(rZN rzn, rZY rzy, rYF ryf, android.view.View view) {
        rzn.AEQbTJ.invoke(rzy, java.lang.Boolean.valueOf(ryf.AEQbTJ.isChecked()));
    }
}
