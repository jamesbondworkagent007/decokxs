package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29556kvq {
    public static final java.util.List<C29635kxP> copydefault(@NotNull java.util.List<MarketChainBean> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarketChainBean) it.next()).getChainId());
        }
        if (!arrayList.contains(str)) {
            str = "501";
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (MarketChainBean marketChainBean : list) {
            java.lang.String chainName = marketChainBean.getChainName();
            java.lang.String chainLogo = marketChainBean.getChainLogo();
            int i = C57406yhn.Activity.QKVWgx;
            java.lang.String chainId = marketChainBean.getChainId();
            arrayList2.add(new C29635kxP(chainName, null, chainLogo, java.lang.Integer.valueOf(i), Intrinsics.EZpvd((java.lang.Object) marketChainBean.getChainId(), (java.lang.Object) str), chainId, 2, null));
        }
        return arrayList2;
    }
}
