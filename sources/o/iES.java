package o;

import com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iES {
    public final iEW EZpvd;

    @yCM
    public iES(@NotNull iEW iew) {
        Intrinsics.checkNotNullParameter(iew, "");
        this.EZpvd = iew;
    }

    public final C23680iFi AEQbTJ(@NotNull ProductDetailsResponse productDetailsResponse) {
        Intrinsics.checkNotNullParameter(productDetailsResponse, "");
        java.util.List<InvestUnderlyingToken> listUzCIH = productDetailsResponse.uzCIH();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listUzCIH, 10));
        java.util.Iterator<T> it = listUzCIH.iterator();
        while (it.hasNext()) {
            arrayList.add(this.EZpvd.OLrzqt((InvestUnderlyingToken) it.next(), java.lang.Long.valueOf(productDetailsResponse.AuCTel())));
        }
        return new C23680iFi(arrayList, productDetailsResponse.hDKMBd(), productDetailsResponse.ODWQjV(), productDetailsResponse.RJOkX(), productDetailsResponse.getPostValueLengthLimit(), productDetailsResponse.AkhnZx(), productDetailsResponse.values() != 0, productDetailsResponse.isConnected(), productDetailsResponse.iwGUEr());
    }
}
