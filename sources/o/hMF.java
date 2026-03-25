package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexui.main.limitorder.orderdetail.itemviewbinding.LimitNetworkOrderItemViewBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hMF extends AbstractC25436iwg<C21802hMw, C21476hAu> {
    public hMF() {
        super(LimitNetworkOrderItemViewBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21476hAu> c25435iwf, @NotNull C21802hMw c21802hMw) {
        java.lang.String fromChainName;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c21802hMw, "");
        C22079hXc c22079hXc = ((C21476hAu) c25435iwf.EZpvd()).copydefault;
        FromChildOrderDetailVO fromChildOrderDetailVO = c21802hMw.OLrzqt().getFromChildOrderDetailVO();
        if (fromChildOrderDetailVO == null || (fromChainName = fromChildOrderDetailVO.getFromChainName()) == null) {
            fromChainName = "";
        }
        c22079hXc.setNetworkInfo(fromChainName, "");
    }
}
