package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class iPM {
    public static final Application AEQbTJ = new Application();

    public static final class Application extends DiffUtil.ItemCallback<InvestFinalityProviderItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InvestFinalityProviderItem investFinalityProviderItem, InvestFinalityProviderItem investFinalityProviderItem2) {
            Intrinsics.checkNotNullParameter(investFinalityProviderItem, "");
            Intrinsics.checkNotNullParameter(investFinalityProviderItem2, "");
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InvestFinalityProviderItem investFinalityProviderItem, InvestFinalityProviderItem investFinalityProviderItem2) {
            Intrinsics.checkNotNullParameter(investFinalityProviderItem, "");
            Intrinsics.checkNotNullParameter(investFinalityProviderItem2, "");
            return false;
        }
    }
}
