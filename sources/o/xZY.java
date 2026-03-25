package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.wallet.dependency.DependencyApiService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xZY extends AbstractC43215rlA implements InterfaceC57023yab {
    @Override // o.InterfaceC57023yab
    public java.lang.String AYXKKw() {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).zLjUOn().getIsoCode();
    }

    @Override // o.InterfaceC57023yab
    public void OLrzqt(@NotNull java.util.List<ValuationCurrencyBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ValuationCurrencyBean valuationCurrencyBean : list) {
            ValuationCurrencyBean valuationCurrencyBean2 = new ValuationCurrencyBean();
            valuationCurrencyBean2.setCurrencyId(valuationCurrencyBean.getCurrencyId());
            valuationCurrencyBean2.setIsoCode(valuationCurrencyBean.getIsoCode());
            valuationCurrencyBean2.setDisplayName(valuationCurrencyBean.getDisplayName());
            valuationCurrencyBean2.setDefault(valuationCurrencyBean.isDefault());
            valuationCurrencyBean2.setSymbol(valuationCurrencyBean.getSymbol());
            valuationCurrencyBean2.setUsdToThisRate(valuationCurrencyBean.getUsdToThisRate());
            valuationCurrencyBean2.setPrecision(valuationCurrencyBean.getPrecision());
            arrayList.add(valuationCurrencyBean2);
        }
        ValuationCurrencyBean[] valuationCurrencyBeanArr = (ValuationCurrencyBean[]) arrayList.toArray(new ValuationCurrencyBean[0]);
        interfaceC46553tYp.copydefault(yDY.copydefault(java.util.Arrays.copyOf(valuationCurrencyBeanArr, valuationCurrencyBeanArr.length)));
    }

    @Override // o.InterfaceC57023yab
    public void copydefault() {
        ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).fJNWhG();
    }

    @Override // o.InterfaceC57023yab
    public java.lang.String AEQbTJ() {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX();
    }

    @Override // o.InterfaceC57023yab
    public java.lang.String EZpvd() {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).RJOkX();
    }

    @Override // o.InterfaceC57023yab
    public double KWHzl() {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QbewEr();
    }

    public static final ResponseData copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.InterfaceC57023yab
    public AbstractC58185ywX<ResponseData<java.util.List<ValuationCurrencyBean>>> OLrzqt() {
        AbstractC58185ywX abstractC58185ywXOkServerExceptionFilter$default = C13933dbt.okServerExceptionFilter$default(((DependencyApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(DependencyApiService.class))).currencies(), null, 1, null);
        final Function1 function1 = new Function1() { // from class: o.yaa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xZY.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOkServerExceptionFilter$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.yag
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xZY.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C33527myD.KWHzl(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData KWHzl(ResponseData responseData) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        java.lang.String msg = responseData.getMsg();
        java.lang.String detailMsg = responseData.getDetailMsg();
        java.lang.String errorMsg = responseData.getErrorMsg();
        java.util.List<ValuationCurrencyBean> list = (java.util.List) responseData.getData();
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (ValuationCurrencyBean valuationCurrencyBean : list) {
                ValuationCurrencyBean valuationCurrencyBean2 = new ValuationCurrencyBean();
                valuationCurrencyBean2.setCurrencyId(valuationCurrencyBean.getCurrencyId());
                valuationCurrencyBean2.setIsoCode(valuationCurrencyBean.getIsoCode());
                valuationCurrencyBean2.setDisplayName(valuationCurrencyBean.getDisplayName());
                valuationCurrencyBean2.setDefault(valuationCurrencyBean.isDefault());
                valuationCurrencyBean2.setSymbol(valuationCurrencyBean.getSymbol());
                valuationCurrencyBean2.setUsdToThisRate(valuationCurrencyBean.getUsdToThisRate());
                valuationCurrencyBean2.setPrecision(valuationCurrencyBean.getPrecision());
                arrayList2.add(valuationCurrencyBean2);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new ResponseData(code, msg, detailMsg, errorMsg, arrayList, null, 32, null);
    }
}
