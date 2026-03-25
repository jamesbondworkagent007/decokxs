package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.preference.data.remote.LocalConfigRemoteDataSource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class tXJ {
    public static final tXJ copydefault = new tXJ();

    private tXJ() {
    }

    public final AbstractC58185ywX<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> EZpvd(boolean z) {
        AbstractC58185ywX abstractC58185ywXKWHzl = C33527myD.KWHzl(LocalConfigRemoteDataSource.Application.currencies$default(LocalConfigRemoteDataSource.Companion.KWHzl(), z ? "FIRST_CACHE" : "NO_CACHE", 0, 2, null));
        final Function1 function1 = new Function1() { // from class: o.tXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tXJ.OLrzqt((ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.tXL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return tXJ.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.ArrayList<ValuationCurrencyBean> arrayList = (java.util.ArrayList) responseData.getData();
        if (responseData.getCode() == 0 && responseData.getData() != null && arrayList != null && !arrayList.isEmpty()) {
            ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).copydefault(arrayList);
            ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).fJNWhG();
        }
        return responseData;
    }
}
