package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wOL extends AbstractC59533zio<BillsArchive, StateListAnimator> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uMI umiOLrzqt = uMI.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(umiOLrzqt, "");
        return new StateListAnimator(this, umiOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull BillsArchive billsArchive) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(billsArchive, "");
        uMI umiKWHzl = stateListAnimator.KWHzl();
        umiKWHzl.copydefault.setText(pTA.format$default(new Date(C33129mqd.valueOf(billsArchive.EZpvd())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null));
        umiKWHzl.OLrzqt.setText(pTB.formatDownToFixed$default(C33129mqd.EZpvd(billsArchive.copydefault()), 8, null, 2, null));
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final uMI AEQbTJ;
        public final /* synthetic */ wOL EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uMI KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull wOL wol, uMI umi) {
            super(umi.getRoot());
            Intrinsics.checkNotNullParameter(umi, "");
            this.EZpvd = wol;
            this.AEQbTJ = umi;
        }
    }
}
