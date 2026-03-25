package o;

import com.okinc.business.invest_biz.data.bean.InvestTokenWithMarketCap;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23672iFa {
    public final iEW EZpvd;

    @yCM
    public C23672iFa(@NotNull iEW iew) {
        Intrinsics.checkNotNullParameter(iew, "");
        this.EZpvd = iew;
    }

    public final java.util.List<C23623iDf> copydefault(@NotNull ProductDetailsResponse productDetailsResponse) {
        Intrinsics.checkNotNullParameter(productDetailsResponse, "");
        java.util.List<InvestTokenWithMarketCap> listGkJEwt = productDetailsResponse.gkJEwt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGkJEwt, 10));
        java.util.Iterator<T> it = listGkJEwt.iterator();
        while (it.hasNext()) {
            arrayList.add(this.EZpvd.OLrzqt((InvestTokenWithMarketCap) it.next(), java.lang.Long.valueOf(productDetailsResponse.AuCTel())));
        }
        return arrayList;
    }
}
