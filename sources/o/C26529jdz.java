package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jdz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26529jdz {
    public static final TaskDescription copydefault = new TaskDescription();

    /* JADX INFO: renamed from: o.jdz$TaskDescription */
    public static final class TaskDescription extends DiffUtil.ItemCallback<InvestNetworkFeeItem> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InvestNetworkFeeItem investNetworkFeeItem, InvestNetworkFeeItem investNetworkFeeItem2) {
            Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
            Intrinsics.checkNotNullParameter(investNetworkFeeItem2, "");
            return Intrinsics.EZpvd(investNetworkFeeItem.getTitle(), investNetworkFeeItem2.getTitle());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InvestNetworkFeeItem investNetworkFeeItem, InvestNetworkFeeItem investNetworkFeeItem2) {
            Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
            Intrinsics.checkNotNullParameter(investNetworkFeeItem2, "");
            return Intrinsics.EZpvd(investNetworkFeeItem, investNetworkFeeItem2);
        }
    }
}
