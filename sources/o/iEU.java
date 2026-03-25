package o;

import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import com.okinc.business.invest_biz.data.models.InvestQaVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEU {
    @yCM
    public iEU() {
    }

    public final C23678iFg AEQbTJ(@NotNull ProductDetailsResponse productDetailsResponse) {
        Intrinsics.checkNotNullParameter(productDetailsResponse, "");
        java.util.List<InvestQaVo> listWlaJM = productDetailsResponse.wlaJM();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listWlaJM, 10));
        for (InvestQaVo investQaVo : listWlaJM) {
            arrayList.add(new C23681iFj(investQaVo.getQuestion(), investQaVo.getAnswer()));
        }
        return new C23678iFg(productDetailsResponse.ORxRYg(), productDetailsResponse.QfsBiF(), productDetailsResponse.UeEOUB(), productDetailsResponse.djSkpj(), productDetailsResponse.dvKsVJ(), productDetailsResponse.ejfBZ(), EZpvd(productDetailsResponse), productDetailsResponse.AwvSrB(), productDetailsResponse.DXXBbs(), productDetailsResponse.QKudOq(), arrayList, null, productDetailsResponse.zsXlph(), productDetailsResponse.OcIXYQ(), productDetailsResponse.getNewProxyInstance(), productDetailsResponse.DCJXGO(), null, productDetailsResponse.KWHzl(), productDetailsResponse.RlQdEF(), productDetailsResponse.aKErDB(), productDetailsResponse.AxsJAY(), productDetailsResponse.DTwDnp(), 67584, null);
    }

    public final C23674iFc EZpvd(ProductDetailsResponse productDetailsResponse) {
        java.util.List<InvestLogoBaseVo> listQVAiDq = productDetailsResponse.QVAiDq();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listQVAiDq, 10));
        java.util.Iterator<T> it = listQVAiDq.iterator();
        while (it.hasNext()) {
            arrayList.add(C23627iDj.copydefault((InvestLogoBaseVo) it.next()));
        }
        java.util.List<InvestLogoBaseVo> listOqFWZa = productDetailsResponse.OqFWZa();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOqFWZa, 10));
        java.util.Iterator<T> it2 = listOqFWZa.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C23627iDj.copydefault((InvestLogoBaseVo) it2.next()));
        }
        java.util.List<InvestLogoBaseVo> listDarRvM = productDetailsResponse.DarRvM();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listDarRvM, 10));
        java.util.Iterator<T> it3 = listDarRvM.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C23627iDj.copydefault((InvestLogoBaseVo) it3.next()));
        }
        java.util.List<InvestLogoBaseVo> listValueOf = productDetailsResponse.valueOf();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        java.util.Iterator<T> it4 = listValueOf.iterator();
        while (it4.hasNext()) {
            arrayList4.add(C23627iDj.copydefault((InvestLogoBaseVo) it4.next()));
        }
        return new C23674iFc(arrayList, arrayList2, arrayList3, arrayList4);
    }
}
